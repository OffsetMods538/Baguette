package me.offsetmonkey538.baguette.config;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import me.offsetmonkey538.baguette.BaguetteMain;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class JsonConfig {
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve(BaguetteMain.MOD_ID + ".json");
    private static BaguetteConfig config = new BaguetteConfig(
            6,
            1200,
            0,
            100,
            600,
            0,
            100);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES).registerTypeAdapter(BaguetteConfig.class, new BaguetteConfigDeserializer()).create();

    public static void loadConfig() {
        try {
            if (CONFIG_PATH.toFile().exists())
                config = GSON.fromJson(new String(Files.readAllBytes(CONFIG_PATH)), BaguetteConfig.class);
            else
                Files.write(CONFIG_PATH, Collections.singleton(GSON.toJson(config)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BaguetteConfig getConfig() {
        return config;
    }
}
