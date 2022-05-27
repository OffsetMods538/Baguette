package me.offsetmonkey538.baguette.config;

import com.google.gson.*;

import java.lang.reflect.Type;

public class BaguetteConfigDeserializer implements JsonDeserializer<BaguetteConfig> {

    @Override
    public BaguetteConfig deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        return new BaguetteConfig(jsonObject.get("tnt-baguette-explosion-strength").getAsInt());
    }
}
