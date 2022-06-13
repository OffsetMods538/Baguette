package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static com.github.offsetmonkey538.baguette.BaguetteMain.getConfig;

public class EndBaguette extends Baguette {

    public EndBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            Vec3d lookVector = user.getRotationVec(0);
            Vec3d offset = lookVector.multiply(getConfig().getEndBaguetteTeleportDistance());
            Vec3d destination = user.getPos().add(offset);
            user.requestTeleport(destination.x, destination.y, destination.z);
        }

        return super.finishUsing(stack, world, user);
    }
}
