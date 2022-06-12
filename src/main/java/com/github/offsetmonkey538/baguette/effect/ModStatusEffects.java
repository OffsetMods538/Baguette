package com.github.offsetmonkey538.baguette.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.offsetmonkey538.baguette.BaguetteMain.MOD_ID;

public class ModStatusEffects {

    // TODO: Rename me
    public static final StatusEffect RENAME_ME = register(new ModStatusEffect(StatusEffectCategory.BENEFICIAL, 2696993), "rename_me");

    private static StatusEffect register(StatusEffect effect, String id) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, id), effect);
    }

    public static void register() {
        // Registers all status effects because this class is now loaded
    }
}
