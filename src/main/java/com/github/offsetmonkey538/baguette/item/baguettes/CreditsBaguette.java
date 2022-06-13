package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class CreditsBaguette extends Baguette {

    public CreditsBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient())
            user.sendMessage(Text.translatable("baguette.credits"));

        return super.finishUsing(stack, world, user);
    }
}
