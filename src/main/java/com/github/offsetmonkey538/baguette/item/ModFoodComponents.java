package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.effect.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

import static com.github.offsetmonkey538.baguette.BaguetteMain.getConfig;

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
                            getConfig().getWaterBaguetteHungerDurationTicks(),
                            getConfig().getWaterBaguetteHungerAmplifier()),
                    getConfig().getWaterBaguetteHungerChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,
                            getConfig().getWaterBaguetteNauseaDurationTicks(),
                            getConfig().getWaterBaguetteNauseaAmplifier()),
                    getConfig().getWaterBaguetteNauseaChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            getConfig().getWaterBaguetteWaterBreathingDurationTicks(),
                            getConfig().getWaterBaguetteWaterBreathingAmplifier()),
                    getConfig().getWaterBaguetteWaterBreathingChance())
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
                            getConfig().getFireBaguetteFireResistanceDurationTicks(),
                            getConfig().getFireBaguetteFireResistanceAmplifier()),
                    getConfig().getFireBaguetteFireResistanceChance())
            .build();

    public static final FoodComponent AIR_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            getConfig().getAirBaguetteSlowFallingDurationTicks(),
                            getConfig().getAirBaguetteSlowFallingAmplifier()),
                    getConfig().getAirBaguetteSlowFallingChance())
            .build();

    public static final FoodComponent EARTH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            getConfig().getEarthBaguetteHasteDurationTicks(),
                            getConfig().getEarthBaguetteHasteAmplifier()),
                    getConfig().getEarthBaguetteHasteChance())
            .build();

    public static final FoodComponent GOLDEN_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,
                            getConfig().getWaterBaguetteWaterBreathingDurationTicks() * 2,
                            getConfig().getWaterBaguetteWaterBreathingAmplifier() + 2),
                    getConfig().getWaterBaguetteWaterBreathingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,
                            getConfig().getFireBaguetteFireResistanceDurationTicks() * 2,
                            getConfig().getFireBaguetteFireResistanceAmplifier() + 2),
                    getConfig().getFireBaguetteFireResistanceChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,
                            getConfig().getAirBaguetteSlowFallingDurationTicks() * 2,
                            getConfig().getAirBaguetteSlowFallingAmplifier() + 2),
                    getConfig().getAirBaguetteSlowFallingChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,
                            getConfig().getEarthBaguetteHasteDurationTicks() * 2,
                            getConfig().getEarthBaguetteHasteAmplifier() + 2),
                    getConfig().getEarthBaguetteHasteChance())

            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING,
                            getConfig().getGoldenBaguetteGlowingDurationTicks(),
                            getConfig().getGoldenBaguetteGlowingAmplifier()),
                    getConfig().getGoldenBaguetteGlowingChance())
            .build();

    public static final FoodComponent DEATH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .build();

    public static final FoodComponent FROG_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,
                            getConfig().getFrogBaguetteJumpBoostDurationTicks(),
                            getConfig().getFrogBaguetteJumpBoostAmplifier()),
                    getConfig().getFrogBaguetteJumpBoostChance())
            .build();

    public static final FoodComponent SCULK_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(new StatusEffectInstance(ModStatusEffects.SILENCED,
                            getConfig().getSculkBaguetteSilencedDurationTicks(),
                            getConfig().getSculkBaguetteSilencedAmplifier()),
                    getConfig().getSculkBaguetteSilencedChance())
            .build();


    private ModFoodComponents() {

    }
}
