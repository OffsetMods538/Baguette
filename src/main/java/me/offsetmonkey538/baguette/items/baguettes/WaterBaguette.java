package me.offsetmonkey538.baguette.items.baguettes;

import me.offsetmonkey538.baguette.config.JsonConfig;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class WaterBaguette extends Baguette {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,
                            JsonConfig.getConfig().waterBaguetteHungerDurationTicks(),
                            JsonConfig.getConfig().waterBaguetteHungerAmplifier()),
                    JsonConfig.getConfig().waterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            JsonConfig.getConfig().waterBaguetteNauseaDurationTicks(),
                            JsonConfig.getConfig().waterBaguetteNauseaAmplifier()),
                    JsonConfig.getConfig().waterBaguetteNauseaChance())

            .build();


    public WaterBaguette(Item.Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
