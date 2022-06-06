package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.config.YamlConfig;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public final class ModFoodComponents {
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
                            YamlConfig.getConfig().getWaterBaguetteHungerDurationTicks(),
                            YamlConfig.getConfig().getWaterBaguetteHungerAmplifier()),
                    YamlConfig.getConfig().getWaterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            YamlConfig.getConfig().getWaterBaguetteNauseaDurationTicks(),
                            YamlConfig.getConfig().getWaterBaguetteNauseaAmplifier()),
                    YamlConfig.getConfig().getWaterBaguetteNauseaChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            YamlConfig.getConfig().getWaterBaguetteWaterBreathingDurationTicks(),
                            YamlConfig.getConfig().getWaterBaguetteWaterBreathingAmplifier()),
                    YamlConfig.getConfig().getWaterBaguetteWaterBreathingChance())
            .build();

    public static final FoodComponent CHARGED_TNT_BAGUETTE = BAGUETTE;

    public static final FoodComponent BIRTHDAY_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger() + 12) // Hunger of a baguette + the hunger of a cake
            .saturationModifier(BAGUETTE.getSaturationModifier() + 0.6f) // Saturation of a baguette + the saturation of a cake
            .build();

    public static final FoodComponent FIRE_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            YamlConfig.getConfig().getFireBaguetteFireResistanceDurationTicks(),
                            YamlConfig.getConfig().getFireBaguetteFireResistanceAmplifier()),
                    YamlConfig.getConfig().getFireBaguetteFireResistanceChance())
            .build();

    public static final FoodComponent AIR_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            YamlConfig.getConfig().getAirBaguetteSlowFallingDurationTicks(),
                            YamlConfig.getConfig().getAirBaguetteSlowFallingAmplifier()),
                    YamlConfig.getConfig().getAirBaguetteSlowFallingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,
                            YamlConfig.getConfig().getAirBaguetteJumpBoostDurationTicks(),
                            YamlConfig.getConfig().getAirBaguetteJumpBoostAmplifier()),
                    YamlConfig.getConfig().getAirBaguetteJumpBoostChance())
            .build();


    private ModFoodComponents() {

    }
}
