package com.github.offsetmonkey538.baguette.items.baguettes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EastereggBaguette extends Baguette {

    public EastereggBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        SheepEntity entity = new SheepEntity(EntityType.SHEEP, world);
        entity.setCustomName(new LiteralText("jeb_"));
        world.spawnEntity(entity);
        return super.use(world, user, hand);
    }
}
