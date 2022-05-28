package me.offsetmonkey538.baguette.items.tools;

import me.offsetmonkey538.baguette.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LongBaguetteToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 275;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.Items.BAGUETTE.getItem());
    }
}
