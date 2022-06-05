package com.github.offsetmonkey538.baguette;

import com.github.offsetmonkey538.baguette.config.YamlConfig;
import com.github.offsetmonkey538.baguette.items.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaguetteMain implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Baguette");
    public static final String MOD_ID = "baguette";

    private static boolean configBroken = false;

    @Override
    public void onInitialize() {
        // JsonConfig.loadConfig();
        try {
            YamlConfig.loadConfig();
        } catch (Exception e) {
            LOGGER.warn("Failed to load config! There's probably something wrong in the config file.");
            LOGGER.debug("", e);

            configBroken = true;
        }
        LOGGER.info("Configuration loading " + (configBroken ? "failed" : "successful") + "!");
        ModItems.register();
        LOGGER.info("Items registered!");
        LOGGER.info("Baguette has been initialized!");
    }

    public static boolean isConfigBroken() {
        return configBroken;
    }

    public static void setConfigBroken(boolean configBroken) {
        BaguetteMain.configBroken = configBroken;
    }
}
