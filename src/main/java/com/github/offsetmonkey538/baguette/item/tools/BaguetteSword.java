package com.github.offsetmonkey538.baguette.item.tools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class BaguetteSword extends SwordItem {

    public BaguetteSword(Settings settings) {
        super(new BaguetteToolMaterial(), 4, -3.1F, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);
        if (target instanceof PlayerEntity player && player.getHungerManager().isNotFull()) {
            player.getHungerManager().add(5, 0.6f);
            stack.damage(25, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
        return true;
    }
}
