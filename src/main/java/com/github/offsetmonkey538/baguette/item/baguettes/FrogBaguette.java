package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.FrogEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class FrogBaguette extends Baguette {

    public FrogBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        FrogEntity frogEntity = new FrogEntity(EntityType.FROG, world);
        frogEntity.setCustomName(Text.of("WiredWierd"));
        frogEntity.setPos(user.getX(), user.getY() + 0.5, user.getZ());
        world.spawnEntity(frogEntity);

        return super.finishUsing(stack, world, user);
    }
}
