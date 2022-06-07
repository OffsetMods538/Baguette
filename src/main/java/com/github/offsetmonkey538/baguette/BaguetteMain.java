package com.github.offsetmonkey538.baguette;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
import com.github.offsetmonkey538.baguette.config.ConfigLoader;
import com.github.offsetmonkey538.baguette.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaguetteMain implements ModInitializer, PreLaunchEntrypoint {
    public static final Logger LOGGER = LoggerFactory.getLogger("Baguette");
    public static final String MOD_ID = "baguette";

    private static boolean configBroken = false;

    @Override
    public void onPreLaunch() {
        try {
            ConfigLoader.loadConfig();
        } catch (Exception e) {
            LOGGER.warn("Failed to load config! There's probably something wrong in the config file. Using default config.");
            LOGGER.debug("", e);
            ConfigLoader.setConfig(new BaguetteConfig());

            configBroken = true;
        }
        LOGGER.info("Configuration loading " + (configBroken ? "failed" : "successful") + "!");
    }

    @Override
    public void onInitialize() {
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
