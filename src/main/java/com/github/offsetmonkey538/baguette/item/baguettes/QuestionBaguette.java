package com.github.offsetmonkey538.baguette.item.baguettes;

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
    private static final Identifier REMOVE_HEALTH_ID = new Identifier(MOD_ID, "remove_health");
    private static final Identifier ADD_HEALTH_ID = new Identifier(MOD_ID, "add_health");

    private final Random rng = Random.create();

    private final Map<ClientPlayerEntity, Integer> players = new HashMap<>();

    private String[] questions;

    private String[] answers;

    public QuestionBaguette(Settings settings) {
        super(settings);

        ServerPlayNetworking.registerGlobalReceiver(ADD_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            int health = buf.readInt();

            server.execute(() -> addHealth(player, health));
        });

        ServerPlayNetworking.registerGlobalReceiver(REMOVE_HEALTH_ID, (server, player, handler, buf, responseSender) -> {
            int health = buf.readInt();

            server.execute(() -> removeHealth(player, health));
        });

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
            players.put(player, rng.nextBetween(0, (questions.length - 1)));
            player.sendMessage(Text.of(questions[players.get(player)]));
        }

        return super.finishUsing(stack, world, user);
    }

    public boolean onMessage(String message, ClientPlayerEntity sender) {
        for (Map.Entry<ClientPlayerEntity, Integer> entry : players.entrySet()) {
            if (entry.getKey().getUuid().equals(sender.getUuid())) {
                if (message.equalsIgnoreCase(answers[entry.getValue()]))
                    answeredCorrectly(sender, message);
                else
                    answeredIncorrectly(sender, message, entry);
                players.remove(entry.getKey());
                return false;
            }
        }

        return true;
    }

    private void answeredCorrectly(ClientPlayerEntity player, String message) {
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".correct"), message));

        if (player.getHealth() + 2 > 40)
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".maximum_health"));
        else {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(2);
            ClientPlayNetworking.send(ADD_HEALTH_ID, buf);
        }
    }

    private void answeredIncorrectly(ClientPlayerEntity player, String message, Map.Entry<ClientPlayerEntity, Integer> entry) {
        player.sendMessage(Text.translatable((this.getTranslationKey() + ".incorrect"), message, answers[entry.getValue()]));

        if (player.getMaxHealth() - 2 <= 0)
            player.sendMessage(Text.translatable(this.getTranslationKey() + ".minimum_health"));
        else {
            PacketByteBuf buf = PacketByteBufs.create();
            buf.writeInt(2);
            ClientPlayNetworking.send(REMOVE_HEALTH_ID, buf);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private void addHealth(ServerPlayerEntity player, double health) {
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        if (attributeInstance != null)
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), health, EntityAttributeModifier.Operation.ADDITION));
    }

    @SuppressWarnings("SameParameterValue")
    private void removeHealth(ServerPlayerEntity player, double health) {
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);

        if (attributeInstance != null)
            attributeInstance.addPersistentModifier(new EntityAttributeModifier(this.getTranslationKey(), -health, EntityAttributeModifier.Operation.ADDITION));
        if (player.getHealth() > player.getMaxHealth())
            player.setHealth(player.getMaxHealth());
    }
}
