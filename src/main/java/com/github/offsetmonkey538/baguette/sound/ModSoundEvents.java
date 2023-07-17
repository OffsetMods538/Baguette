package com.github.offsetmonkey538.baguette.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.github.offsetmonkey538.baguette.BaguetteMain.*;

public final class ModSoundEvents {

    public static final SoundEvent BAGUETTAGON   = register("baguettagon");
    public static final SoundEvent BAGUECAH3DRON = register("baguecah3dron");
    public static final SoundEvent HAPPY_BIRTHDAY = register("happy_birthday");

    private ModSoundEvents() {

    }

    private static SoundEvent register(String name) {
        Identifier id = new Identifier(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register() {
        // Registers all sound events because this class is now loaded
    }
}
