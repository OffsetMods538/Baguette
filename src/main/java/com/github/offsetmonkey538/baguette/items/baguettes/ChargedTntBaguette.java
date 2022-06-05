package com.github.offsetmonkey538.baguette.items.baguettes;

import com.github.offsetmonkey538.baguette.config.YamlConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class ChargedTntBaguette extends Baguette {

    public ChargedTntBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient)
            world.createExplosion(user, user.getX(), user.getY(), user.getZ(), YamlConfig.getConfig().getChargedTntBaguetteExplosionStrength(), Explosion.DestructionType.BREAK);

        return super.finishUsing(stack, world, user);
    }
}
