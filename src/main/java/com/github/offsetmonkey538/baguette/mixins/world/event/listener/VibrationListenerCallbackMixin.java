package com.github.offsetmonkey538.baguette.mixins.world.event.listener;

import com.github.offsetmonkey538.baguette.effect.ModStatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.listener.VibrationListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VibrationListener.Callback.class)
public interface VibrationListenerCallbackMixin {

    @Inject(method = "canAccept", at = @At("HEAD"), cancellable = true)
    default void canAccept(GameEvent gameEvent, GameEvent.Emitter emitter, CallbackInfoReturnable<Boolean> cir) {
        Entity entity = emitter.sourceEntity();
        if (entity instanceof LivingEntity livingEntity && livingEntity.getActiveStatusEffects().containsKey(ModStatusEffects.SILENCED)) {
            cir.setReturnValue(false);
        }
    }
}
