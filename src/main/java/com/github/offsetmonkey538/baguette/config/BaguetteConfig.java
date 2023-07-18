package com.github.offsetmonkey538.baguette.config;

import com.github.offsetmonkey538.baguette.effect.ModStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import top.offsetmonkey538.monkeyconfig538.Config;
import top.offsetmonkey538.monkeyconfig538.annotation.ConfigEntry;

import static com.github.offsetmonkey538.baguette.BaguetteMain.*;

public final class BaguetteConfig extends Config {

    @ConfigEntry
    public static class TntBaguette {
        @ConfigEntry("Default: 6")
        public static int explosionStrength = 6;
    }

    @ConfigEntry
    public static class ChargedTntBaguette {
        @ConfigEntry("Default: 12")
        public static int explosionStrength = 12;
    }

    @ConfigEntry
    public static class WaterBaguette {
        @ConfigEntry("Default values: duration = 1200; amplifier = 0")
        public static StatusEffectInstance hunger = new StatusEffectInstance(StatusEffects.HUNGER, 1200, 0);
        @ConfigEntry("Default value: 100")
        public static int hungerChance = 100;

        @ConfigEntry("Default values: duration = 600; amplifier = 0")
        public static StatusEffectInstance nausea = new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0);
        @ConfigEntry("Default value: 100")
        public static int nauseaChance = 100;

        @ConfigEntry("Default values: duration = 3600; amplifier = 0")
        public static StatusEffectInstance waterBreathing = new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3600, 0);
        @ConfigEntry("Default value: 100")
        public static int waterBreathingChance = 100;
    }

    @ConfigEntry
    public static class FireBaguette {
        @ConfigEntry("Default values: duration = 3600; amplifier = 0")
        public static StatusEffectInstance fireResistance = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3600, 0);
        @ConfigEntry("Default value: 100")
        public static int fireResistanceChance = 100;
    }

    @ConfigEntry
    public static class AirBaguette {
        @ConfigEntry("Default values: duration = 3600; amplifier = 0")
        public static StatusEffectInstance slowFalling = new StatusEffectInstance(StatusEffects.SLOW_FALLING, 3600, 0);
        @ConfigEntry("Default value: 100")
        public static int slowFallingChance = 100;
    }

    @ConfigEntry
    public static class EarthBaguette {
        @ConfigEntry("Default values: duration = 3600; amplifier = 0")
        public static StatusEffectInstance haste = new StatusEffectInstance(StatusEffects.HASTE, 3600, 0);
        @ConfigEntry("Default value: 100")
        public static int hasteChance = 100;
    }

    @ConfigEntry
    public static class GoldenBaguette {
        @ConfigEntry("Default values: duration = 7200; amplifier = 2")
        public static StatusEffectInstance waterBreathing = new StatusEffectInstance(StatusEffects.WATER_BREATHING, 7200, 2);
        @ConfigEntry("Default value: 100")
        public static int waterBreathingChance = 100;

        @ConfigEntry("Default values: duration = 7200; amplifier = 2")
        public static StatusEffectInstance fireResistance = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 7200, 2);
        @ConfigEntry("Default value: 100")
        public static int fireResistanceChance = 100;

        @ConfigEntry("Default values: duration = 7200; amplifier = 2")
        public static StatusEffectInstance slowFalling = new StatusEffectInstance(StatusEffects.SLOW_FALLING, 7200, 2);
        @ConfigEntry("Default value: 100")
        public static int slowFallingChance = 100;

        @ConfigEntry("Default values: duration = 7200; amplifier = 0")
        public static StatusEffectInstance haste = new StatusEffectInstance(StatusEffects.HASTE, 7200, 2);
        @ConfigEntry("Default value: 100")
        public static int hasteChance = 100;

        @ConfigEntry("Default values: duration = 7200; amplifier = 0")
        public static StatusEffectInstance glowing = new StatusEffectInstance(StatusEffects.GLOWING, 7200, 0);
        @ConfigEntry("Default value: 100")
        public static int glowingChance = 100;
    }

    @ConfigEntry
    public static class FrogBaguette {
        @ConfigEntry("Default values: duration = 3600; amplifier = 7")
        public static StatusEffectInstance jumpBoost = new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3600, 7);
        @ConfigEntry("Default value: 100")
        public static int jumpBoostChance = 100;

        @ConfigEntry("Default value: 1")
        public static int numberOfFrogsToSpawn = 1;
    }

    @ConfigEntry
    public static class SculkBaguette {
        @ConfigEntry("Default values: duration = 1200; amplifier = 0")
        public static StatusEffectInstance silenced = new StatusEffectInstance(ModStatusEffects.SILENCED, 1200, 0);
        @ConfigEntry("Default value: 100")
        public static int silencedChance = 100;
    }

    @ConfigEntry
    public static class Baguettagon {
        @ConfigEntry("Default values: duration = 190; amplifier = 0")
        public static StatusEffectInstance levitation = new StatusEffectInstance(StatusEffects.LEVITATION, 190, 0);
        @ConfigEntry("Default value: 100")
        public static int levitationChance = 100;
    }

    @ConfigEntry
    public static class Baguecah3dron {
        @ConfigEntry("Default values: duration = 400; amplifier = 0")
        public static StatusEffectInstance levitation = new StatusEffectInstance(StatusEffects.LEVITATION, 400, 0);
        @ConfigEntry("Default value: 100")
        public static int levitationChance = 100;
    }

    @ConfigEntry
    public static class EastereggBaguette {
        @ConfigEntry("Default value: 20")
        public static int numberOfSheepToSpawn = 20;
    }

    @ConfigEntry
    public static class EndBaguette {
        @ConfigEntry("Default value: 10")
        public static int teleportDistance = 10;
    }


    @Override
    protected String getName() {
        return MOD_ID;
    }
}
