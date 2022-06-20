package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class QuestionBaguette extends Baguette {

    public QuestionBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            // TODO: Make it ask questions in chat
        }
        return super.finishUsing(stack, world, user);
    }
}
