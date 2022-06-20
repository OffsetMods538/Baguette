package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import static com.github.offsetmonkey538.baguette.BaguetteMain.getConfig;

public class FrogBaguette extends Baguette {

    public FrogBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            for (int i = 0; i < getConfig().getFrogBaguetteNumberOfFrogsToSpawn(); i++) {
                EntityType.FROG.spawn((ServerWorld) world, null, Text.of("WiredWierd"), null, user.getBlockPos().add(0, 0.5, 0), null, false, false);
            }
        }

        return super.finishUsing(stack, world, user);
    }
}
