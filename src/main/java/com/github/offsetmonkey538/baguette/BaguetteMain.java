package com.github.offsetmonkey538.baguette;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
import com.github.offsetmonkey538.baguette.effect.ModStatusEffects;
import com.github.offsetmonkey538.baguette.item.ModItems;
import com.github.offsetmonkey538.baguette.sound.ModSoundEvents;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaguetteMain implements ModInitializer {
    public static final String MOD_ID = "baguette";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        new BaguetteConfig().init();
        LOGGER.info("Config loaded!");

        ModStatusEffects.register();
        LOGGER.info("Status effects registered!");

        ModSoundEvents.register();
        LOGGER.info("Sound events registered!");

        ModItems.register();
        LOGGER.info("Items registered!");

        LOGGER.info("Baguette has been initialized!");
    }
}
