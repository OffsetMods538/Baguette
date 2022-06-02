package me.offsetmonkey538.baguette.items.baguettes;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class LongBaguette extends Baguette {
    protected static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(Baguette.FOOD_COMPONENT.getHunger() * 3)
            .saturationModifier(Baguette.FOOD_COMPONENT.getSaturationModifier() * 3)
            .build();

    public LongBaguette(Item.Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
