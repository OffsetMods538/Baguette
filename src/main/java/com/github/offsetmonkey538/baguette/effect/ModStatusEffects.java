package com.github.offsetmonkey538.baguette.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.github.offsetmonkey538.baguette.BaguetteMain.*;

public final class ModStatusEffects {

    public static final StatusEffect SILENCED = register(new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 2696993), "silenced");

    private ModStatusEffects() {

    }

    @SuppressWarnings("SameParameterValue")
    private static StatusEffect register(StatusEffect effect, String id) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, id), effect);
    }

    public static void register() {
        // Registers all status effects because this class is now loaded
    }
}
