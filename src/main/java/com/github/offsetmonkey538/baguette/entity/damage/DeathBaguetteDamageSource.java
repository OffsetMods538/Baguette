package com.github.offsetmonkey538.baguette.entity.damage;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.Text;

public class DeathBaguetteDamageSource extends DamageSource {

    public DeathBaguetteDamageSource() {
        super("death_baguette");
        this.setBypassesArmor();
    }

    @Override
    public Text getDeathMessage(LivingEntity entity) {
        return Text.translatable("death.attack.death_baguette", entity.getDisplayName());
    }
}
