package com.github.offsetmonkey538.baguette.mixins.client.gui.screen;

import com.github.offsetmonkey538.baguette.BaguetteMain;
import com.github.offsetmonkey538.baguette.config.YamlConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.IOException;
import java.util.Objects;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {


    @Inject(method = "init", at = @At("RETURN"))
    public void baguetteShowConfigBrokenScreen(CallbackInfo ci) {
        if (BaguetteMain.isConfigBroken()) {
            ConfirmScreen confirmScreen = new ConfirmScreen(
                    (boolean accept) -> {
                        if (accept) {
                            BaguetteMain.LOGGER.info("Player decided to let the game and fix the config!");

                            if(!YamlConfig.CONFIG_PATH.toFile().delete()) {
                                BaguetteMain.LOGGER.error("Failed to delete config file!");
                                MinecraftClient.getInstance().stop();
                            }

                            try {
                                YamlConfig.loadConfig();
                            } catch (IOException e) {
                                throw new RuntimeException("Couldn't load config!", e);
                            }

                            BaguetteMain.setConfigBroken(false);
                            Objects.requireNonNull(MinecraftClient.getInstance().currentScreen).close();
                        } else {
                            BaguetteMain.LOGGER.info("Player decided to close the game and fix the config!");
                            MinecraftClient.getInstance().stop();
                        }
                    },
                    new TranslatableText("baguette.config.broken.title").formatted(Formatting.RED),
                    new TranslatableText("baguette.config.broken.text"),
                    new TranslatableText("baguette.config.broken.button.accept"),
                    new TranslatableText("baguette.config.broken.button.decline")
            );

            MinecraftClient.getInstance().setScreen(confirmScreen);
        }
    }
}
