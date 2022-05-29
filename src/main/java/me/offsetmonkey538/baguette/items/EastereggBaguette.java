package me.offsetmonkey538.baguette.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class EastereggBaguette extends Item {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(15)
            .saturationModifier(1.8f)
            .build();

    public EastereggBaguette(Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
