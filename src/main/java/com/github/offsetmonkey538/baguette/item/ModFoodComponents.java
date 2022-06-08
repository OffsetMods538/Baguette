package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.config.ConfigLoader;
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
                            ConfigLoader.getConfig().getWaterBaguetteHungerDurationTicks(),
                            ConfigLoader.getConfig().getWaterBaguetteHungerAmplifier()),
                    ConfigLoader.getConfig().getWaterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            ConfigLoader.getConfig().getWaterBaguetteNauseaDurationTicks(),
                            ConfigLoader.getConfig().getWaterBaguetteNauseaAmplifier()),
                    ConfigLoader.getConfig().getWaterBaguetteNauseaChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            ConfigLoader.getConfig().getWaterBaguetteWaterBreathingDurationTicks(),
                            ConfigLoader.getConfig().getWaterBaguetteWaterBreathingAmplifier()),
                    ConfigLoader.getConfig().getWaterBaguetteWaterBreathingChance())
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
                            ConfigLoader.getConfig().getFireBaguetteFireResistanceDurationTicks(),
                            ConfigLoader.getConfig().getFireBaguetteFireResistanceAmplifier()),
                    ConfigLoader.getConfig().getFireBaguetteFireResistanceChance())
            .build();

    public static final FoodComponent AIR_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            ConfigLoader.getConfig().getAirBaguetteSlowFallingDurationTicks(),
                            ConfigLoader.getConfig().getAirBaguetteSlowFallingAmplifier()),
                    ConfigLoader.getConfig().getAirBaguetteSlowFallingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,
                            ConfigLoader.getConfig().getAirBaguetteJumpBoostDurationTicks(),
                            ConfigLoader.getConfig().getAirBaguetteJumpBoostAmplifier()),
                    ConfigLoader.getConfig().getAirBaguetteJumpBoostChance())
            .build();

    public static final FoodComponent EARTH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            ConfigLoader.getConfig().getEarthBaguetteHasteDurationTicks(),
                            ConfigLoader.getConfig().getEarthBaguetteHasteAmplifier()),
                    ConfigLoader.getConfig().getEarthBaguetteHasteChance())
            .build();

    public static final FoodComponent GOLDEN_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            ConfigLoader.getConfig().getWaterBaguetteWaterBreathingDurationTicks() * 2,
                            ConfigLoader.getConfig().getWaterBaguetteWaterBreathingAmplifier() + 2),
                    ConfigLoader.getConfig().getWaterBaguetteWaterBreathingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            ConfigLoader.getConfig().getFireBaguetteFireResistanceDurationTicks() * 2,
                            ConfigLoader.getConfig().getFireBaguetteFireResistanceAmplifier() + 2),
                    ConfigLoader.getConfig().getFireBaguetteFireResistanceChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            ConfigLoader.getConfig().getAirBaguetteSlowFallingDurationTicks() * 2,
                            ConfigLoader.getConfig().getAirBaguetteSlowFallingAmplifier() + 2),
                    ConfigLoader.getConfig().getAirBaguetteSlowFallingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,
                            ConfigLoader.getConfig().getAirBaguetteJumpBoostDurationTicks() * 2,
                            ConfigLoader.getConfig().getAirBaguetteJumpBoostAmplifier() + 2),
                    ConfigLoader.getConfig().getAirBaguetteJumpBoostChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            ConfigLoader.getConfig().getEarthBaguetteHasteDurationTicks() * 2,
                            ConfigLoader.getConfig().getEarthBaguetteHasteAmplifier() + 2),
                    ConfigLoader.getConfig().getEarthBaguetteHasteChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,
                            ConfigLoader.getConfig().getGoldenBaguetteGlowingDurationTicks(),
                            ConfigLoader.getConfig().getGoldenBaguetteGlowingAmplifier()),
                    ConfigLoader.getConfig().getGoldenBaguetteGlowingChance())
            .build();


    private ModFoodComponents() {

    }
}
