package com.github.offsetmonkey538.baguette.mixins.client.network;

import com.github.offsetmonkey538.baguette.item.ModItems;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {

    @Inject(method = "sendChatMessage(Ljava/lang/String;Lnet/minecraft/text/Text;)V", at = @At("HEAD"), cancellable = true)
    public void sendChatMessage(String message, @Nullable Text preview, CallbackInfo ci) {
        if (!ModItems.QUESTION_BAGUETTE.onMessage(message, (ClientPlayerEntity) (Object) this)) {
            ci.cancel();
        }
    }
}
