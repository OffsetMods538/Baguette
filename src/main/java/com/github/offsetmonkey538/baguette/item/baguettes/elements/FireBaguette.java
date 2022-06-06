package com.github.offsetmonkey538.baguette.item.baguettes.elements;

import com.github.offsetmonkey538.baguette.item.baguettes.Baguette;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FireBaguette extends Baguette {
    private final int[] fireBaguetteFireOffsets = {
                     3, -1,   3, 0,   3, 1,
                 2, -2,                  2,  2,
             1, -3,                          1,  3,
             0, -3,                          0,  3,
            -1, -3,                         -1,  3,
                -2, -2,                 -2,  2,
                    -3, -1,  -3, 0,  -3, 1,
    };

    public FireBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        for (int i = 0; i < fireBaguetteFireOffsets.length; i += 2) {
            int x = fireBaguetteFireOffsets[i];
            int z = fireBaguetteFireOffsets[i + 1];
            world.setBlockState(user.getBlockPos().add(x, 0, z), Blocks.FIRE.getDefaultState());
        }

        return super.finishUsing(stack, world, user);
    }
}
