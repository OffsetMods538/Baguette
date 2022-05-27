package me.offsetmonkey538.baguette.items;

import me.offsetmonkey538.baguette.config.JsonConfig;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class TntBaguette extends Item {
    private static final FoodComponent FOOD_COMPONENT = new FoodComponent.Builder()
            .hunger(15)
            .saturationModifier(1.8f)
            .alwaysEdible()
            .build();


    public TntBaguette(Settings settings) {
        super(settings.food(FOOD_COMPONENT));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        world.createExplosion(user, user.getX(), user.getY(), user.getZ(), JsonConfig.getConfig().tntBaguetteExplosionStrength(), Explosion.DestructionType.BREAK);
        return super.finishUsing(stack, world, user);
    }
}
