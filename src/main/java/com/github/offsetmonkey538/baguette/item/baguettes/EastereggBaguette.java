package com.github.offsetmonkey538.baguette.item.baguettes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import static com.github.offsetmonkey538.baguette.BaguetteMain.getConfig;

public class EastereggBaguette extends Baguette {

    public EastereggBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        for (int i = 0; i < getConfig().getEastereggBaguetteNumberOfSheepToSpawn(); i++) {
            SheepEntity sheepEntity = new SheepEntity(EntityType.SHEEP, world);
            sheepEntity.setCustomName(Text.of("jeb_"));
            sheepEntity.setPos(user.getX(), user.getY() + 0.5, user.getZ());
            world.spawnEntity(sheepEntity);
        }
        return super.finishUsing(stack, world, user);
    }
}
