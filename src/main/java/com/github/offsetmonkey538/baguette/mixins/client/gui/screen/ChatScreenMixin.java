package com.github.offsetmonkey538.baguette.mixins.client.gui.screen;

import com.github.offsetmonkey538.baguette.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {

    @Inject(method = "sendMessage", at = @At("HEAD"), cancellable = true)
    public void sendChatMessage(String message, boolean addToHistory, CallbackInfoReturnable<Boolean> cir) {
        if (!ModItems.QUESTION_BAGUETTE.onMessage(message, MinecraftClient.getInstance().player)) {
            cir.setReturnValue(true);
        }
    }
}
