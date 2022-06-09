package com.github.offsetmonkey538.baguette.item.baguettes;

import com.github.offsetmonkey538.baguette.BaguetteMain;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class TntBaguette extends Baguette {

    public TntBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient)
            world.createExplosion(user, user.getX(), user.getY(), user.getZ(), BaguetteMain.getConfig().getTntBaguetteExplosionStrength(), Explosion.DestructionType.BREAK);

        return super.finishUsing(stack, world, user);
    }
}
