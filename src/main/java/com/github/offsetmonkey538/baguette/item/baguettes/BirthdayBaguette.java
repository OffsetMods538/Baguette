package com.github.offsetmonkey538.baguette.item.baguettes;

import com.github.offsetmonkey538.baguette.sound.ModSoundEvents;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.StringNbtReader;
import net.minecraft.network.packet.s2c.play.TitleS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BirthdayBaguette extends Baguette {
    public BirthdayBaguette(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof ServerPlayerEntity player && world instanceof ServerWorld serverWorld) {
            music(serverWorld, player);
            fireworks(serverWorld, player);
            birthdayMessage(player);
        }
        return user.eatFood(world, stack);
    }
    private void music(ServerWorld world, ServerPlayerEntity player) {
        world.playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                ModSoundEvents.HAPPY_BIRTHDAY,
                SoundCategory.MUSIC,
                1f,
                1f
        );
    }
    private void fireworks(ServerWorld world, ServerPlayerEntity player) {
        String nbtData = "{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;1973019,11743532,3887386,5320730,2437522,8073150,2651799,11250603,4408131,14188952,4312372,14602026,6719955,12801229,15435844,15790320],FadeColors:[I;1973019,11743532,3887386,5320730,2437522,8073150,2651799,11250603,4408131,14188952,4312372,14602026,6719955,12801229,15435844,15790320]}],Flight:0.3}}";
        if (player.getUuidAsString().equals("b034a435-eab1-43bb-ae2b-87473cd05173"))
            nbtData = "{Fireworks:{Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11338748,254972]}],Flight:0.3}}";

        // Get position
        Vec3d position = player.getPos();


        // Create firework
        ItemStack rocketStack = Items.FIREWORK_ROCKET.getDefaultStack();
        try {
            rocketStack.setNbt(StringNbtReader.parse(nbtData));
        } catch (CommandSyntaxException e) {
            throw new RuntimeException(e);
        }


        // Sends a few fireworks
        for (int i = 0; i < 10; i++)
            world.spawnEntity(new FireworkRocketEntity(world, position.getX(), position.getY(), position.getZ(), rocketStack));
        for (int i = 0; i < 10; i++)
            world.spawnEntity(new FireworkRocketEntity(world, position.getX() + 2, position.getY(), position.getZ(), rocketStack));
        for (int i = 0; i < 10; i++)
            world.spawnEntity(new FireworkRocketEntity(world, position.getX() - 2, position.getY(), position.getZ(), rocketStack));
        for (int i = 0; i < 10; i++)
            world.spawnEntity(new FireworkRocketEntity(world, position.getX(), position.getY(), position.getZ() + 2, rocketStack));
        for (int i = 0; i < 10; i++)
            world.spawnEntity(new FireworkRocketEntity(world, position.getX(), position.getY(), position.getZ() - 2, rocketStack));
    }
    private void birthdayMessage(ServerPlayerEntity player) {
        Text message = Text.translatable("item.baguette.birthday_baguette.happy_birthday", player.getName());
        player.networkHandler.sendPacket(new TitleS2CPacket(message));
    }
}
