package com.github.offsetmonkey538.baguette.config;

import com.github.offsetmonkey538.baguette.BaguetteMain;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.constructor.ConstructorException;
import org.yaml.snakeyaml.representer.Representer;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import static com.github.offsetmonkey538.baguette.BaguetteMain.CONFIG_PATH;
import static com.github.offsetmonkey538.baguette.BaguetteMain.LOGGER;

public final class ConfigLoader {

    private ConfigLoader() {

    }

    public static Config loadConfig() {
        Config config;

        try {
            final DumperOptions options = new DumperOptions();

            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            options.setPrettyFlow(true);

            final Yaml yaml = new Yaml(new Constructor(Config.class), new Representer(), options);

            if (CONFIG_PATH.toFile().exists()) {
                LOGGER.info("Found config file at '" + CONFIG_PATH + "', loading from file...");

                try (FileInputStream configStream = new FileInputStream(CONFIG_PATH.toFile())) {
                    config = yaml.load(configStream);
                }
            } else {
                LOGGER.info("Couldn't find config file at '" + CONFIG_PATH + "', using default values and creating config file...");
                config = new Config();
            }

            try (FileWriter writer = new FileWriter(CONFIG_PATH.toFile())) {
                yaml.dump(config, writer);
            }

        } catch (IOException | ConstructorException e) {
            LOGGER.warn("Failed to load config! There's probably something wrong in the config file. Using default values and asking player what they want to do...");
            LOGGER.debug("", e);

            config = new Config();
            BaguetteMain.setConfigBroken(true);
        }

        return config;
    }
}
