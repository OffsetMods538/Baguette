package com.github.offsetmonkey538.baguette.mixins.client.gui.screen.advancement;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import net.minecraft.client.gui.screen.advancement.AdvancementWidget;
import net.minecraft.text.OrderedText;
import net.minecraft.util.Language;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AdvancementWidget.class)
public abstract class AdvancementWidgetMixin {

    @Mutable
    @Final
    @Shadow
    private OrderedText title;

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Ljava/lang/String;length()I", shift = At.Shift.AFTER))
    private void modifyTitle(AdvancementTab tab, MinecraftClient client, Advancement advancement, AdvancementDisplay display, CallbackInfo ci) {
        title = Language.getInstance().reorder(display.getTitle());
    }
}
