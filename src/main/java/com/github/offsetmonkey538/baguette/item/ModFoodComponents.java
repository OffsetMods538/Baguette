package com.github.offsetmonkey538.baguette.item;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
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
            .statusEffect(BaguetteConfig.WaterBaguette.hunger, BaguetteConfig.WaterBaguette.hungerChance)
            .statusEffect(BaguetteConfig.WaterBaguette.nausea, BaguetteConfig.WaterBaguette.nauseaChance)
            .statusEffect(BaguetteConfig.WaterBaguette.waterBreathing, BaguetteConfig.WaterBaguette.waterBreathingChance)
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
            .statusEffect(BaguetteConfig.FireBaguette.fireResistance, BaguetteConfig.FireBaguette.fireResistanceChance)
            .build();

    public static final FoodComponent AIR_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(BaguetteConfig.AirBaguette.slowFalling, BaguetteConfig.AirBaguette.slowFallingChance)
            .build();

    public static final FoodComponent EARTH_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(BaguetteConfig.EarthBaguette.haste, BaguetteConfig.EarthBaguette.hasteChance)
            .build();

    public static final FoodComponent GOLDEN_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(BaguetteConfig.GoldenBaguette.waterBreathing, BaguetteConfig.GoldenBaguette.waterBreathingChance)
            .statusEffect(BaguetteConfig.GoldenBaguette.fireResistance, BaguetteConfig.GoldenBaguette.fireResistanceChance)
            .statusEffect(BaguetteConfig.GoldenBaguette.slowFalling, BaguetteConfig.GoldenBaguette.slowFallingChance)
            .statusEffect(BaguetteConfig.GoldenBaguette.haste, BaguetteConfig.GoldenBaguette.hasteChance)
            .statusEffect(BaguetteConfig.GoldenBaguette.glowing, BaguetteConfig.GoldenBaguette.glowingChance)
            .build();

    public static final FoodComponent DEATH_BAGUETTE = BAGUETTE;

    public static final FoodComponent FROG_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(BaguetteConfig.FrogBaguette.jumpBoost, BaguetteConfig.FrogBaguette.jumpBoostChance)
            .build();

    public static final FoodComponent SCULK_BAGUETTE = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger())
            .saturationModifier(BAGUETTE.getSaturationModifier())
            .statusEffect(BaguetteConfig.SculkBaguette.silenced, BaguetteConfig.SculkBaguette.silencedChance)
            .build();

    public static final FoodComponent END_BAGUETTE = BAGUETTE;

    public static final FoodComponent BAGUETTAGON = new FoodComponent.Builder()
            .hunger(BAGUETTE.getHunger() * 5) // Made of 5 baguettes
            .saturationModifier(BAGUETTE.getSaturationModifier() * 5) // Made of 5 baguettes
            .statusEffect(BaguetteConfig.Baguettagon.levitation, BaguetteConfig.Baguettagon.levitationChance)
            .build();

    public static final FoodComponent BAGUECAH3DRON = new FoodComponent.Builder()
            .hunger(BAGUETTAGON.getHunger() * 6) // Made of 5 baguettagons
            .saturationModifier(BAGUETTAGON.getSaturationModifier() * 6) // Made of 5 baguettagons
            .statusEffect(BaguetteConfig.Baguecah3dron.levitation, BaguetteConfig.Baguecah3dron.levitationChance)
            .build();

    public static final FoodComponent CREDITS_BAGUETTE = new FoodComponent.Builder()
            .hunger(0)
            .saturationModifier(0)
            .build();

    public static final FoodComponent QUESTION_BAGUETTE = BAGUETTE;


    private ModFoodComponents() {

    }
}
