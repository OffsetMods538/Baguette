package com.github.offsetmonkey538.baguette.config;

import net.fabricmc.loader.api.FabricLoader;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.constructor.ConstructorException;
import org.yaml.snakeyaml.representer.Representer;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import static com.github.offsetmonkey538.baguette.BaguetteMain.LOGGER;
import static com.github.offsetmonkey538.baguette.BaguetteMain.MOD_ID;

public final class ConfigLoader {

    public static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve(MOD_ID + ".yml");
    private static BaguetteConfig config;

    private ConfigLoader() {

    }

    public static void loadConfig() throws IOException, ConstructorException {
        final DumperOptions options = new DumperOptions();

        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setPrettyFlow(true);

        final Yaml yaml = new Yaml(new Constructor(BaguetteConfig.class), new Representer(), options);


        if (CONFIG_PATH.toFile().exists()) {
            LOGGER.info("Found config file at '" + CONFIG_PATH + "', loading from file...");

            try (FileInputStream configStream = new FileInputStream(CONFIG_PATH.toFile())) {
                config = yaml.load(configStream);
            }
        } else {
            LOGGER.info("Couldn't find config file at '" + CONFIG_PATH + "', using default values and creating config file...");
            config = new BaguetteConfig();
        }
        try (FileWriter writer = new FileWriter(CONFIG_PATH.toFile())) {
            yaml.dump(config, writer);
        }
    }

    public static BaguetteConfig getConfig() {
        return config;
    }

    public static void setConfig(BaguetteConfig config) {
        ConfigLoader.config = config;
    }
}
