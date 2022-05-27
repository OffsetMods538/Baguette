package me.offsetmonkey538.baguette.config;

public record BaguetteConfig(
        int tntBaguetteExplosionStrength,

        int waterBaguetteHungerDurationTicks,
        int waterBaguetteHungerAmplifier,
        float waterBaguetteHungerChance,

        int waterBaguetteNauseaDurationTicks,
        int waterBaguetteNauseaAmplifier,
        float waterBaguetteNauseaChance) {
}
