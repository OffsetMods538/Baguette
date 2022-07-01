package com.github.offsetmonkey538.baguette.item.baguettes;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

import static com.github.offsetmonkey538.baguette.BaguetteMain.MOD_ID;

public class QuestionBaguette extends Baguette {
    // Identifiers for network packets
    private static final Identifier REMOVE_HEALTH_ID = new Identifier(MOD_ID, "remove_health");
    private static final Identifier ADD_HEALTH_ID    = new Identifier(MOD_ID, "add_health");

    // Random number generator for choosing a random question.
    @Environment(EnvType.CLIENT)
    private final Random rng = Random.create();

    // Map of a Player to their respective question
    @Environment(EnvType.CLIENT)
    private final Map<ClientPlayerEntity, Integer> players = new HashMap<>();

    @Environment(EnvType.CLIENT)
    private String[] questions;

    @Environment(EnvType.CLIENT)
    private String[] answers;

    @Environment(EnvType.CLIENT)
    private static final float maxHealth = 40;

    @Environment(EnvType.CLIENT)
    private static final float minHealth = 2;

    @Environment(EnvType.CLIENT)
    private static final float healthIncrement = 2;

    @Environment(EnvType.CLIENT)
    private static final float healthDecrement = 2;

    public QuestionBaguette(Settings settings) {
        super(settings);

        // Register packet for adding health to a player
        ServerPlayNetworking.registerGlobalReceiver(ADD_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            float health = buf.readFloat();

            server.execute(() -> addHealth(player, health));
        });

        // Register packet for removing health from a player
        ServerPlayNetworking.registerGlobalReceiver(REMOVE_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            float health = buf.readFloat();

            server.execute(() -> removeHealth(player, health));
        });

        // Load the questions and answers when the client has finished loading resources.
        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public Identifier getFabricId() {
                return new Identifier(MOD_ID, "client_reload");
            }

            @Override
            public void reload(ResourceManager manager) {
                questions = I18n.translate("item.baguette.question_baguette.questions").split("-NEXT_QUESTION-");
                answers = I18n.translate("item.baguette.question_baguette.answers").split("-NEXT_ANSWER-");
            }
        });
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ClientPlayerEntity player) {
            // Chooses a random question
            int questionNumber = rng.nextBetween(0, (questions.length - 1));

            // Adds the player and question to the player-question map.
            players.put(player, questionNumber);


            // Send the question to the player.
            player.sendMessage(Text.of(questions[players.get(player)]));
        }

        return super.finishUsing(stack, world, user);
    }

    /**
     * Checks if the sent message is by a player who hs a pending question and if the answer is correct or incorrect.
     * @param message The message the player sent.
     * @param sender The player that sent the message.
     * @return False if the player has a pending question. True if they don't.
     */
    @Environment(EnvType.CLIENT)
    public boolean onMessage(String message, ClientPlayerEntity sender) {
        // Loops through all the entries in the player-question map.
        for (Map.Entry<ClientPlayerEntity, Integer> entry : players.entrySet()) {
            // Checks if the sender is in the entry.
            if (entry.getKey().getUuid().equals(sender.getUuid())) {
                // Checks if the answer is correct. Not case-sensitive.
                if (message.equalsIgnoreCase(answers[entry.getValue()])) answeredCorrectly(message, sender);
                else answeredIncorrectly(sender, message, entry);

                // Removes the player from the player-question map.
                players.remove(entry.getKey());
                return false;
            }
        }

        return true;
    }

    /**
     * Tells the player their answer is correct. Sends a packet to the server to add max health.
     * @param message The message the player sent.
     * @param player The player that sent the message.
     */
    @Environment(EnvType.CLIENT)
    private void answeredCorrectly(String message, ClientPlayerEntity player) {
        // Tells the player their answer is correct.
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".correct"), message));

        if (player.getMaxHealth() + healthIncrement > maxHealth) {
            // Tells the player that they are at the maximum health.
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".maximum_health"));
            return;
        }

        // Creates a buffer and stores the amount of health to add to the player.
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeFloat(healthIncrement);

        // Sends a packet telling the server to change the max health of the player.
        ClientPlayNetworking.send(ADD_HEALTH_ID, buf);
    }

    /**
     * Tells the player their answer is incorrect. Sends a packet to the server to remove max health.
     * @param message The message the player sent.
     * @param player The player that sent the message.
     */
    @Environment(EnvType.CLIENT)
    private void answeredIncorrectly(ClientPlayerEntity player, String message, Map.Entry<ClientPlayerEntity, Integer> entry) {
        // Tells the player their answer is incorrect. Also tells them the correct answer.
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".incorrect"), message, answers[entry.getValue()]));

        if (player.getMaxHealth() - healthDecrement < minHealth) {
            // Tells the player that they are at the minimum health.
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".minimum_health"));
            return;
        }

        // Creates a buffer and stores the amount of health to add to the player.
        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeFloat(healthDecrement);

        // Sends a packet telling the server to change the max health of the player.
        ClientPlayNetworking.send(REMOVE_HEALTH_ID, buf);

    }

    /**
     * Adds max health to the player.
     * @param player The player whose max health will be increased.
     * @param health The amount of max health to give the player.
     */
    private void addHealth(ServerPlayerEntity player, double health) {
        // Get the MAX HEALTH attribute for the player.
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        // Check if the attribute instance is null.
        if (attributeInstance != null)
            // Add a modifier for the max health.
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), health, EntityAttributeModifier.Operation.ADDITION));
    }

    /**
     * Removes max health from the player.
     * @param player The player whose max health will be decreased.
     * @param health The amount of max health to remove from the player.
     */
    private void removeHealth(ServerPlayerEntity player, double health) {
        // Get the MAX HEALTH attribute for the player.
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        // Check if the attribute instance is null.
        if (attributeInstance != null)
            // Add a modifier for the max health.
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), -health, EntityAttributeModifier.Operation.ADDITION));
        // Check if the health of the player is more than the new max health.
        if (player.getHealth() > player.getMaxHealth())
            // Set the health of the player to the max health.
            player.setHealth(player.getMaxHealth());
    }
}
