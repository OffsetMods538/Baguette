package com.github.offsetmonkey538.baguette;

import com.github.offsetmonkey538.baguette.config.Config;
import com.github.offsetmonkey538.baguette.config.ConfigLoader;
import com.github.offsetmonkey538.baguette.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;

public class BaguetteMain implements ModInitializer, PreLaunchEntrypoint {
    public static final Logger LOGGER = LoggerFactory.getLogger("Baguette");
    public static final String MOD_ID = "baguette";
    public static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve(MOD_ID + ".yml");

    private static Config config;
    private static boolean configBroken = false;

    @Override
    public void onPreLaunch() {
        config = ConfigLoader.loadConfig();
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

    public static Config getConfig() {
        return config;
    }
}
