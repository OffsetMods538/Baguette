package me.offsetmonkey538.baguette.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class LongBaguette extends Item {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder().hunger(45).saturationModifier(5.4f).build();

    public LongBaguette(Item.Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
