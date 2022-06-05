package com.github.offsetmonkey538.baguette.config;

import java.io.Serializable;

public final class BaguetteConfig implements Serializable {
    private int tntBaguetteExplosionStrength =         6;
    private int chargedTntBaguetteExplosionStrength =  12;
    private int waterBaguetteHungerDurationTicks =     1200;
    private int waterBaguetteHungerAmplifier =         0;
    private float waterBaguetteHungerChance =          100;
    private int waterBaguetteNauseaDurationTicks =     600;
    private int waterBaguetteNauseaAmplifier =         0;
    private float waterBaguetteNauseaChance =          100;

    public BaguetteConfig() {

    }

    //
    // Setters
    //

    public void setTntBaguetteExplosionStrength(int tntBaguetteExplosionStrength) {
        this.tntBaguetteExplosionStrength = tntBaguetteExplosionStrength;
    }

    public void setChargedTntBaguetteExplosionStrength(int chargedTntBaguetteExplosionStrength) {
        this.chargedTntBaguetteExplosionStrength = chargedTntBaguetteExplosionStrength;
    }

    public void setWaterBaguetteHungerDurationTicks(int waterBaguetteHungerDurationTicks) {
        this.waterBaguetteHungerDurationTicks = waterBaguetteHungerDurationTicks;
    }

    public void setWaterBaguetteHungerAmplifier(int waterBaguetteHungerAmplifier) {
        this.waterBaguetteHungerAmplifier = waterBaguetteHungerAmplifier;
    }

    public void setWaterBaguetteHungerChance(float waterBaguetteHungerChance) {
        this.waterBaguetteHungerChance = waterBaguetteHungerChance;
    }

    public void setWaterBaguetteNauseaDurationTicks(int waterBaguetteNauseaDurationTicks) {
        this.waterBaguetteNauseaDurationTicks = waterBaguetteNauseaDurationTicks;
    }

    public void setWaterBaguetteNauseaAmplifier(int waterBaguetteNauseaAmplifier) {
        this.waterBaguetteNauseaAmplifier = waterBaguetteNauseaAmplifier;
    }

    public void setWaterBaguetteNauseaChance(float waterBaguetteNauseaChance) {
        this.waterBaguetteNauseaChance = waterBaguetteNauseaChance;
    }


    //
    // Getters
    //

    public int getTntBaguetteExplosionStrength() {
        return tntBaguetteExplosionStrength;
    }

    public int getChargedTntBaguetteExplosionStrength() {
        return chargedTntBaguetteExplosionStrength;
    }

    public int getWaterBaguetteHungerDurationTicks() {
        return waterBaguetteHungerDurationTicks;
    }

    public int getWaterBaguetteHungerAmplifier() {
        return waterBaguetteHungerAmplifier;
    }

    public float getWaterBaguetteHungerChance() {
        return waterBaguetteHungerChance;
    }

    public int getWaterBaguetteNauseaDurationTicks() {
        return waterBaguetteNauseaDurationTicks;
    }

    public int getWaterBaguetteNauseaAmplifier() {
        return waterBaguetteNauseaAmplifier;
    }

    public float getWaterBaguetteNauseaChance() {
        return waterBaguetteNauseaChance;
    }
}
