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

    // Map of a Player to their Respective question
    @Environment(EnvType.CLIENT)
    private final Map<ClientPlayerEntity, Integer> players = new HashMap<>();

    // Array of questions
    @Environment(EnvType.CLIENT)
    private String[] questions;

    // Array of answers
    @Environment(EnvType.CLIENT)
    private String[] answers;

    public QuestionBaguette(Settings settings) {
        super(settings);

        // Register packet receiver for adding health to a player
        ServerPlayNetworking.registerGlobalReceiver(ADD_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            int health = buf.readInt();

            server.execute(() -> addHealth(player, health));
        });

        // Register packet receiver for removing health from a player
        ServerPlayNetworking.registerGlobalReceiver(REMOVE_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            int health = buf.readInt();

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
            int questionNumber = rng.nextBetween(0, (questions.length - 1));    // Chooses a random question
            players.put(player, questionNumber);    // Adds the player and question to the player-question map.

            // Send the question to the player.
            player.sendMessage(Text.of(questions[players.get(player)]));
        }

        return super.finishUsing(stack, world, user);
    }

    /**
     * Checks if the sent message is the correct or incorrect answer. Adds and removes max health respectively.
     * @param message The message the player sent.
     * @param sender The player that sent the message.
     * @return True if the player doesn't have a pending question. False if they do.
     */
    @Environment(EnvType.CLIENT)
    public boolean onMessage(String message, ClientPlayerEntity sender) {
        // Loops through all the entries in the player-question map.
        for (Map.Entry<ClientPlayerEntity, Integer> entry : players.entrySet()) {
            // Checks if the sender is in the entry.
            if (entry.getKey().getUuid().equals(sender.getUuid())) {
                // Checks if the answer is correct. Not case-sensitive.
                if (message.equalsIgnoreCase(answers[entry.getValue()])) answeredCorrectly(sender, message);
                else answeredIncorrectly(sender, message, entry);

                players.remove(entry.getKey());    // Removes the player from the player-question map.
                return false;
            }
        }

        return true;
    }

    @Environment(EnvType.CLIENT)
    private void answeredCorrectly(ClientPlayerEntity player, String message) {
        // Tells the player their answer is correct.
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".correct"), message));

        if (player.getHealth() + 2 > 40)    // Adds a maximum health limit of 40.
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".maximum_health"));
        else {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(2);
            ClientPlayNetworking.send(ADD_HEALTH_ID, buf);    // Sends a packet telling the server to change the max health of the player.
        }
    }

    @Environment(EnvType.CLIENT)
    private void answeredIncorrectly(ClientPlayerEntity player, String message, Map.Entry<ClientPlayerEntity, Integer> entry) {
        // Tells the player their answer is incorrect. Also tells them the correct answer.
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".incorrect"), message, answers[entry.getValue()]));

        if (player.getMaxHealth() - 2 <= 0)    // Adds a minimum health limit of 2.
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".minimum_health"));
        else {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(2);
            ClientPlayNetworking.send(REMOVE_HEALTH_ID, buf);    // Sends a packet telling the server to change the max health of the player.
        }
    }


    private void addHealth(ServerPlayerEntity player, double health) {
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        if (attributeInstance != null)
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), health, EntityAttributeModifier.Operation.ADDITION));
    }


    private void removeHealth(ServerPlayerEntity player, double health) {
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        if (attributeInstance != null)
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), -health, EntityAttributeModifier.Operation.ADDITION));
        if (player.getHealth() > player.getMaxHealth())
            player.setHealth(player.getMaxHealth());
    }
}
