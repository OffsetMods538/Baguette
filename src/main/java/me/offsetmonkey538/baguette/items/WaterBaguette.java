package me.offsetmonkey538.baguette.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class WaterBaguette extends Item {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1200, 0), 100)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 100)
            .build();


    public WaterBaguette(Item.Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }
}
