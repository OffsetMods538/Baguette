package me.offsetmonkey538.baguette.items.baguettes;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.Objects;

public class Baguette extends Item {
    protected static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(Objects.requireNonNull(Items.BREAD.getFoodComponent()).getHunger() * 3)
            .saturationModifier(Items.BREAD.getFoodComponent().getSaturationModifier() * 3)
            .build();

    public Baguette(Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
