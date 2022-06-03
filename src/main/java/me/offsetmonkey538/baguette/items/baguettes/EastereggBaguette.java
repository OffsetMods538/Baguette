package me.offsetmonkey538.baguette.items.baguettes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
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
        entity.setCustomName(Text.of("jeb_"));
        entity.setPos(user.getX(), user.getY() + 0.5 , user.getZ());
        world.spawnEntity(entity);
        return TypedActionResult.pass(user.getStackInHand(hand));
    }
}
