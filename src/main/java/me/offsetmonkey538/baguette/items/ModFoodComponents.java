package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.config.JsonConfig;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent BAGUETTE = new FoodComponent.Builder()
            .hunger(FoodComponents.BREAD.getHunger() * 3)
            .saturationModifier(FoodComponents.BREAD.getSaturationModifier() * 3)
            .build();

    public static final FoodComponent LONG_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger() * 3)
            .saturationModifier(BAGUETTE.getSaturationModifier() * 3)
            .build();

    public static final FoodComponent TNT_BAGUETTE = BAGUETTE;

    public static final FoodComponent WATER_BAGUETTE = new FoodComponent.Builder()
            .hunger((int) (FoodComponents.BREAD.getHunger() * 1.5f))
            .saturationModifier(FoodComponents.BREAD.getSaturationModifier() * 1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,
                            JsonConfig.getConfig().waterBaguetteHungerDurationTicks(),
                            JsonConfig.getConfig().waterBaguetteHungerAmplifier()),
                    JsonConfig.getConfig().waterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            JsonConfig.getConfig().waterBaguetteNauseaDurationTicks(),
                            JsonConfig.getConfig().waterBaguetteNauseaAmplifier()),
                    JsonConfig.getConfig().waterBaguetteNauseaChance())
            .build();

    public static final FoodComponent CHARGED_TNT_BAGUETTE = BAGUETTE;

    public static final FoodComponent BIRTHDAY_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger() + 12) // Hunger of a baguette + the hunger of a cake
            .saturationModifier(BAGUETTE.getSaturationModifier() + 0.6f) // Saturation of a baguette + the saturation of a cake
            .build();


    private ModFoodComponents() {

    }
}
