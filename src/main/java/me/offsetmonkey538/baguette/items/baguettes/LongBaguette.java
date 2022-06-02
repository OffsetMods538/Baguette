package me.offsetmonkey538.baguette.items.baguettes;

import me.offsetmonkey538.baguette.items.ModItems;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import java.util.Objects;

public class LongBaguette extends Baguette {
    protected static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(Objects.requireNonNull(ModItems.Items.BAGUETTE.getItem().getFoodComponent()).getHunger() * 3)
            .saturationModifier(ModItems.Items.BAGUETTE.getItem().getFoodComponent().getSaturationModifier() * 3)
            .build();

    public LongBaguette(Item.Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
