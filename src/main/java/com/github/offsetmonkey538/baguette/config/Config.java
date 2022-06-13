package com.github.offsetmonkey538.baguette.config;

import java.io.Serializable;

public final class Config implements Serializable {
    private int   tntBaguetteExplosionStrength =             6;

    private int   chargedTntBaguetteExplosionStrength =      12;

    private int   waterBaguetteHungerDurationTicks =         1200;
    private int   waterBaguetteHungerAmplifier =             0;
    private float waterBaguetteHungerChance =                100;

    private int   waterBaguetteNauseaDurationTicks =         600;
    private int   waterBaguetteNauseaAmplifier =             0;
    private float waterBaguetteNauseaChance =                100;

    private int   waterBaguetteWaterBreathingDurationTicks = 3600;
    private int   waterBaguetteWaterBreathingAmplifier =     0;
    private float waterBaguetteWaterBreathingChance =        100;

    private int   fireBaguetteFireResistanceDurationTicks =  3600;
    private int   fireBaguetteFireResistanceAmplifier =      0;
    private float fireBaguetteFireResistanceChance =         100;

    private int   airBaguetteSlowFallingDurationTicks =      3600;
    private int   airBaguetteSlowFallingAmplifier =          0;
    private float airBaguetteSlowFallingChance =             100;

    private int   earthBaguetteHasteDurationTicks =          3600;
    private int   earthBaguetteHasteAmplifier =              0;
    private float earthBaguetteHasteChance =                 100;

    private int   goldenBaguetteGlowingDurationTicks =       7200;
    private int   goldenBaguetteGlowingAmplifier =           0;
    private float goldenBaguetteGlowingChance =              100;

    private int   frogBaguetteJumpBoostDurationTicks =       3600;
    private int   frogBaguetteJumpBoostAmplifier =           7;
    private float frogBaguetteJumpBoostChance =              100;

    private int   sculkBaguetteSilencedDurationTicks =       1200;
    private int   sculkBaguetteSilencedAmplifier =           0;
    private float sculkBaguetteSilencedChance =              100;

    private int   baguettagonLevitationDurationTicks =       190; // Default value is 190(9.5 seconds) because that's how long the music lasts
    private int   baguettagonLevitationAmplifier =           0;
    private float baguettagonLevitationChance =              100;

    private int   baguecah3dronLevitationDurationTicks =     400; // Default value is 400(20 seconds) because that's how long the music lasts
    private int   baguecah3dronLevitationAmplifier =         0;
    private float baguecah3dronLevitationChance =            100;

    private int   frogBaguetteNumberOfFrogsToSpawn =         1;

    private int   eastereggBaguetteNumberOfSheepToSpawn =    20;

    private int   endBaguetteTeleportDistance =              10;


    public Config() {

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
    public void setFireBaguetteFireResistanceDurationTicks(int fireBaguetteFireResistanceDurationTicks) {
        this.fireBaguetteFireResistanceDurationTicks = fireBaguetteFireResistanceDurationTicks;
    }
    public void setFireBaguetteFireResistanceAmplifier(int fireBaguetteFireResistanceAmplifier) {
        this.fireBaguetteFireResistanceAmplifier = fireBaguetteFireResistanceAmplifier;
    }
    public void setFireBaguetteFireResistanceChance(float fireBaguetteFireResistanceChance) {
        this.fireBaguetteFireResistanceChance = fireBaguetteFireResistanceChance;
    }
    public void setWaterBaguetteWaterBreathingDurationTicks(int waterBaguetteWaterBreathingDurationTicks) {
        this.waterBaguetteWaterBreathingDurationTicks = waterBaguetteWaterBreathingDurationTicks;
    }
    public void setWaterBaguetteWaterBreathingAmplifier(int waterBaguetteWaterBreathingAmplifier) {
        this.waterBaguetteWaterBreathingAmplifier = waterBaguetteWaterBreathingAmplifier;
    }
    public void setWaterBaguetteWaterBreathingChance(float waterBaguetteWaterBreathingChance) {
        this.waterBaguetteWaterBreathingChance = waterBaguetteWaterBreathingChance;
    }
    public void setAirBaguetteSlowFallingDurationTicks(int airBaguetteSlowFallingDurationTicks) {
        this.airBaguetteSlowFallingDurationTicks = airBaguetteSlowFallingDurationTicks;
    }
    public void setAirBaguetteSlowFallingAmplifier(int airBaguetteSlowFallingAmplifier) {
        this.airBaguetteSlowFallingAmplifier = airBaguetteSlowFallingAmplifier;
    }
    public void setAirBaguetteSlowFallingChance(float airBaguetteSlowFallingChance) {
        this.airBaguetteSlowFallingChance = airBaguetteSlowFallingChance;
    }
    public void setEarthBaguetteHasteDurationTicks(int earthBaguetteHasteDurationTicks) {
        this.earthBaguetteHasteDurationTicks = earthBaguetteHasteDurationTicks;
    }
    public void setEarthBaguetteHasteAmplifier(int earthBaguetteHasteAmplifier) {
        this.earthBaguetteHasteAmplifier = earthBaguetteHasteAmplifier;
    }
    public void setEarthBaguetteHasteChance(float earthBaguetteHasteChance) {
        this.earthBaguetteHasteChance = earthBaguetteHasteChance;
    }
    public void setGoldenBaguetteGlowingDurationTicks(int goldenBaguetteGlowingDurationTicks) {
        this.goldenBaguetteGlowingDurationTicks = goldenBaguetteGlowingDurationTicks;
    }
    public void setGoldenBaguetteGlowingAmplifier(int goldenBaguetteGlowingAmplifier) {
        this.goldenBaguetteGlowingAmplifier = goldenBaguetteGlowingAmplifier;
    }
    public void setGoldenBaguetteGlowingChance(float goldenBaguetteGlowingChance) {
        this.goldenBaguetteGlowingChance = goldenBaguetteGlowingChance;
    }
    public void setFrogBaguetteJumpBoostDurationTicks(int frogBaguetteJumpBoostDurationTicks) {
        this.frogBaguetteJumpBoostDurationTicks = frogBaguetteJumpBoostDurationTicks;
    }
    public void setFrogBaguetteJumpBoostAmplifier(int frogBaguetteJumpBoostAmplifier) {
        this.frogBaguetteJumpBoostAmplifier = frogBaguetteJumpBoostAmplifier;
    }
    public void setFrogBaguetteJumpBoostChance(float frogBaguetteJumpBoostChance) {
        this.frogBaguetteJumpBoostChance = frogBaguetteJumpBoostChance;
    }
    public void setSculkBaguetteSilencedDurationTicks(int sculkBaguetteSilencedDurationTicks) {
        this.sculkBaguetteSilencedDurationTicks = sculkBaguetteSilencedDurationTicks;
    }
    public void setSculkBaguetteSilencedAmplifier(int sculkBaguetteSilencedAmplifier) {
        this.sculkBaguetteSilencedAmplifier = sculkBaguetteSilencedAmplifier;
    }
    public void setSculkBaguetteSilencedChance(float sculkBaguetteSilencedChance) {
        this.sculkBaguetteSilencedChance = sculkBaguetteSilencedChance;
    }
    public void setFrogBaguetteNumberOfFrogsToSpawn(int frogBaguetteNumberOfFrogsToSpawn) {
        this.frogBaguetteNumberOfFrogsToSpawn = frogBaguetteNumberOfFrogsToSpawn;
    }
    public void setEastereggBaguetteNumberOfSheepToSpawn(int eastereggBaguetteNumberOfSheepToSpawn) {
        this.eastereggBaguetteNumberOfSheepToSpawn = eastereggBaguetteNumberOfSheepToSpawn;
    }
    public void setEndBaguetteTeleportDistance(int endBaguetteTeleportDistance) {
        this.endBaguetteTeleportDistance = endBaguetteTeleportDistance;
    }
    public void setBaguettagonLevitationDurationTicks(int baguettagonLevitationDurationTicks) {
        this.baguettagonLevitationDurationTicks = baguettagonLevitationDurationTicks;
    }
    public void setBaguettagonLevitationAmplifier(int baguettagonLevitationAmplifier) {
        this.baguettagonLevitationAmplifier = baguettagonLevitationAmplifier;
    }
    public void setBaguettagonLevitationChance(float baguettagonLevitationChance) {
        this.baguettagonLevitationChance = baguettagonLevitationChance;
    }
    public void setBaguecah3dronLevitationDurationTicks(int baguecah3dronLevitationDurationTicks) {
        this.baguecah3dronLevitationDurationTicks = baguecah3dronLevitationDurationTicks;
    }
    public void setBaguecah3dronLevitationAmplifier(int baguecah3dronLevitationAmplifier) {
        this.baguecah3dronLevitationAmplifier = baguecah3dronLevitationAmplifier;
    }
    public void setBaguecah3dronLevitationChance(float baguecah3dronLevitationChance) {
        this.baguecah3dronLevitationChance = baguecah3dronLevitationChance;
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
    public int getFireBaguetteFireResistanceDurationTicks() {
        return fireBaguetteFireResistanceDurationTicks;
    }
    public int getFireBaguetteFireResistanceAmplifier() {
        return fireBaguetteFireResistanceAmplifier;
    }
    public float getFireBaguetteFireResistanceChance() {
        return fireBaguetteFireResistanceChance;
    }
    public int getWaterBaguetteWaterBreathingDurationTicks() {
        return waterBaguetteWaterBreathingDurationTicks;
    }
    public int getWaterBaguetteWaterBreathingAmplifier() {
        return waterBaguetteWaterBreathingAmplifier;
    }
    public float getWaterBaguetteWaterBreathingChance() {
        return waterBaguetteWaterBreathingChance;
    }
    public int getAirBaguetteSlowFallingDurationTicks() {
        return airBaguetteSlowFallingDurationTicks;
    }
    public int getAirBaguetteSlowFallingAmplifier() {
        return airBaguetteSlowFallingAmplifier;
    }
    public float getAirBaguetteSlowFallingChance() {
        return airBaguetteSlowFallingChance;
    }
    public int getEarthBaguetteHasteDurationTicks() {
        return earthBaguetteHasteDurationTicks;
    }
    public int getEarthBaguetteHasteAmplifier() {
        return earthBaguetteHasteAmplifier;
    }
    public float getEarthBaguetteHasteChance() {
        return earthBaguetteHasteChance;
    }
    public int getGoldenBaguetteGlowingDurationTicks() {
        return goldenBaguetteGlowingDurationTicks;
    }
    public int getGoldenBaguetteGlowingAmplifier() {
        return goldenBaguetteGlowingAmplifier;
    }
    public float getGoldenBaguetteGlowingChance() {
        return goldenBaguetteGlowingChance;
    }
    public int getFrogBaguetteJumpBoostDurationTicks() {
        return frogBaguetteJumpBoostDurationTicks;
    }
    public int getFrogBaguetteJumpBoostAmplifier() {
        return frogBaguetteJumpBoostAmplifier;
    }
    public float getFrogBaguetteJumpBoostChance() {
        return frogBaguetteJumpBoostChance;
    }
    public int getSculkBaguetteSilencedDurationTicks() {
        return sculkBaguetteSilencedDurationTicks;
    }
    public int getSculkBaguetteSilencedAmplifier() {
        return sculkBaguetteSilencedAmplifier;
    }
    public float getSculkBaguetteSilencedChance() {
        return sculkBaguetteSilencedChance;
    }
    public int getFrogBaguetteNumberOfFrogsToSpawn() {
        return frogBaguetteNumberOfFrogsToSpawn;
    }
    public int getEastereggBaguetteNumberOfSheepToSpawn() {
        return eastereggBaguetteNumberOfSheepToSpawn;
    }
    public int getEndBaguetteTeleportDistance() {
        return endBaguetteTeleportDistance;
    }
    public int getBaguettagonLevitationDurationTicks() {
        return baguettagonLevitationDurationTicks;
    }
    public int getBaguettagonLevitationAmplifier() {
        return baguettagonLevitationAmplifier;
    }
    public float getBaguettagonLevitationChance() {
        return baguettagonLevitationChance;
    }
    public int getBaguecah3dronLevitationDurationTicks() {
        return baguecah3dronLevitationDurationTicks;
    }
    public int getBaguecah3dronLevitationAmplifier() {
        return baguecah3dronLevitationAmplifier;
    }
    public float getBaguecah3dronLevitationChance() {
        return baguecah3dronLevitationChance;
    }
}
