package me.offsetmonkey538.baguette.config;

import com.google.gson.*;

import java.lang.reflect.Type;

public class BaguetteConfigDeserializer implements JsonDeserializer<BaguetteConfig> {

    @Override
    public BaguetteConfig deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();

        return new BaguetteConfig(
                jsonObject.get("tnt-baguette-explosion-strength").getAsInt(),
                jsonObject.get("charged-tnt-baguette-explosion-strength").getAsInt(),

                jsonObject.get("water-baguette-hunger-duration-ticks").getAsInt(),
                jsonObject.get("water-baguette-hunger-amplifier").getAsInt(),
                jsonObject.get("water-baguette-hunger-chance").getAsFloat(),

                jsonObject.get("water-baguette-nausea-duration-ticks").getAsInt(),
                jsonObject.get("water-baguette-nausea-amplifier").getAsInt(),
                jsonObject.get("water-baguette-nausea-chance").getAsFloat()
        );
    }
}
