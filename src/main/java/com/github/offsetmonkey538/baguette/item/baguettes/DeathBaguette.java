package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DeathBaguette extends Baguette {

    public DeathBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        user.damage(world.getDamageSources().genericKill(), Float.MAX_VALUE);
        return super.finishUsing(stack, world, user);
    }
}
