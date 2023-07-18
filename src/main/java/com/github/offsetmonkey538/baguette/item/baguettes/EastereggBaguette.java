package com.github.offsetmonkey538.baguette.item.baguettes;

import com.github.offsetmonkey538.baguette.config.BaguetteConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class EastereggBaguette extends Baguette {

    public EastereggBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            for (int i = 0; i < BaguetteConfig.EastereggBaguette.numberOfSheepToSpawn; i++) {
                SheepEntity entity = EntityType.SHEEP.spawn((ServerWorld) world, user.getBlockPos().add(0, 1, 0), SpawnReason.SPAWN_EGG);
                if (entity == null) continue;
                entity.setCustomName(Text.of("jeb_"));
            }
        }

        return super.finishUsing(stack, world, user);
    }
}
