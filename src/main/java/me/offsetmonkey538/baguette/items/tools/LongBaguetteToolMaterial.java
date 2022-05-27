package me.offsetmonkey538.baguette.items.tools;

import me.offsetmonkey538.baguette.items.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class LongBaguetteToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 60;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return 1.5f;
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
        return Ingredient.ofItems(Items.BAGUETTE);
    }
}
