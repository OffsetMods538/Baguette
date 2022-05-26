package me.offsetmonkey538.baguette;

import me.offsetmonkey538.baguette.items.Items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Baguette implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Baguette");

    @Override
    public void onInitialize() {
        Items.register();
        LOGGER.info("Baguette has been initialized!");
    }
}
