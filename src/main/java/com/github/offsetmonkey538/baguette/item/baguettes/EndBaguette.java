package com.github.offsetmonkey538.baguette.item.baguettes;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EndBaguette extends Baguette {

    public EndBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            Vec3d lookVector = user.getRotationVec(0);
            Vec3d offset = lookVector.multiply(BaguetteConfig.EndBaguette.teleportDistance);
            Vec3d destination = user.getPos().add(offset);
            user.requestTeleport(destination.x, destination.y, destination.z);
        }

        return super.finishUsing(stack, world, user);
    }
}
