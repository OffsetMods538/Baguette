package me.offsetmonkey538.baguette.config;

public record BaguetteConfig(
        int tntBaguetteExplosionStrength,
        int chargedTntBaguetteExplosionStrength,

        int waterBaguetteHungerDurationTicks,
        int waterBaguetteHungerAmplifier,
        float waterBaguetteHungerChance,

        int waterBaguetteNauseaDurationTicks,
        int waterBaguetteNauseaAmplifier,
        float waterBaguetteNauseaChance) {

    public static final BaguetteConfig defaultConfig = new BaguetteConfig(
            6,
            12,
            1200,
            0,
            100,
            600,
            0,
            100
    );
}
