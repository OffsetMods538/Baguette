package com.github.offsetmonkey538.baguette.item.baguettes;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TntBaguette extends Baguette {

    public TntBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient)
            world.createExplosion(user, user.getX(), user.getY(), user.getZ(), BaguetteConfig.TntBaguette.explosionStrength, World.ExplosionSourceType.MOB);

        return super.finishUsing(stack, world, user);
    }
}
