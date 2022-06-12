package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.BaguetteMain;
import com.github.offsetmonkey538.baguette.effect.ModStatusEffects;
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
                            BaguetteMain.getConfig().getWaterBaguetteHungerDurationTicks(),
                            BaguetteMain.getConfig().getWaterBaguetteHungerAmplifier()),
                    BaguetteMain.getConfig().getWaterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            BaguetteMain.getConfig().getWaterBaguetteNauseaDurationTicks(),
                            BaguetteMain.getConfig().getWaterBaguetteNauseaAmplifier()),
                    BaguetteMain.getConfig().getWaterBaguetteNauseaChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            BaguetteMain.getConfig().getWaterBaguetteWaterBreathingDurationTicks(),
                            BaguetteMain.getConfig().getWaterBaguetteWaterBreathingAmplifier()),
                    BaguetteMain.getConfig().getWaterBaguetteWaterBreathingChance())
            .build();

    public static final FoodComponent EASTEREGG_BAGUETTE = BAGUETTE;

    public static final FoodComponent CHARGED_TNT_BAGUETTE = BAGUETTE;

    public static final FoodComponent BIRTHDAY_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger() + 12) // Hunger of a baguette + the hunger of a cake
            .saturationModifier(BAGUETTE.getSaturationModifier() + 0.6f) // Saturation of a baguette + the saturation of a cake
            .build();

    public static final FoodComponent FIRE_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            BaguetteMain.getConfig().getFireBaguetteFireResistanceDurationTicks(),
                            BaguetteMain.getConfig().getFireBaguetteFireResistanceAmplifier()),
                    BaguetteMain.getConfig().getFireBaguetteFireResistanceChance())
            .build();

    public static final FoodComponent AIR_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            BaguetteMain.getConfig().getAirBaguetteSlowFallingDurationTicks(),
                            BaguetteMain.getConfig().getAirBaguetteSlowFallingAmplifier()),
                    BaguetteMain.getConfig().getAirBaguetteSlowFallingChance())
            .build();

    public static final FoodComponent EARTH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            BaguetteMain.getConfig().getEarthBaguetteHasteDurationTicks(),
                            BaguetteMain.getConfig().getEarthBaguetteHasteAmplifier()),
                    BaguetteMain.getConfig().getEarthBaguetteHasteChance())
            .build();

    public static final FoodComponent GOLDEN_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            BaguetteMain.getConfig().getWaterBaguetteWaterBreathingDurationTicks() * 2,
                            BaguetteMain.getConfig().getWaterBaguetteWaterBreathingAmplifier() + 2),
                    BaguetteMain.getConfig().getWaterBaguetteWaterBreathingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            BaguetteMain.getConfig().getFireBaguetteFireResistanceDurationTicks() * 2,
                            BaguetteMain.getConfig().getFireBaguetteFireResistanceAmplifier() + 2),
                    BaguetteMain.getConfig().getFireBaguetteFireResistanceChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            BaguetteMain.getConfig().getAirBaguetteSlowFallingDurationTicks() * 2,
                            BaguetteMain.getConfig().getAirBaguetteSlowFallingAmplifier() + 2),
                    BaguetteMain.getConfig().getAirBaguetteSlowFallingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            BaguetteMain.getConfig().getEarthBaguetteHasteDurationTicks() * 2,
                            BaguetteMain.getConfig().getEarthBaguetteHasteAmplifier() + 2),
                    BaguetteMain.getConfig().getEarthBaguetteHasteChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,
                            BaguetteMain.getConfig().getGoldenBaguetteGlowingDurationTicks(),
                            BaguetteMain.getConfig().getGoldenBaguetteGlowingAmplifier()),
                    BaguetteMain.getConfig().getGoldenBaguetteGlowingChance())
            .build();

    public static final FoodComponent DEATH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .build();

    public static final FoodComponent FROG_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,
                            BaguetteMain.getConfig().getFrogBaguetteJumpBoostDurationTicks(),
                            BaguetteMain.getConfig().getFrogBaguetteJumpBoostAmplifier()),
                    BaguetteMain.getConfig().getFrogBaguetteJumpBoostChance())
            .build();

    public static final FoodComponent SCULK_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(ModStatusEffects.SILENCED,
                            1200,
                            0),
                    100)
            .build();


    private ModFoodComponents() {

    }
}
