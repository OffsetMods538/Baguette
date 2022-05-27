package me.offsetmonkey538.baguette;

import me.offsetmonkey538.baguette.config.JsonConfig;
import me.offsetmonkey538.baguette.items.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainBaguette implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Baguette");

    @Override
    public void onInitialize() {
        JsonConfig.loadConfig();
        LOGGER.info("Configuration file loaded!");
        Items.register();
        LOGGER.info("Items registered!");

        LOGGER.info("Baguette has been initialized!");
    }
}
