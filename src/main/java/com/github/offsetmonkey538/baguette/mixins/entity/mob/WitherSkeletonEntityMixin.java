package com.github.offsetmonkey538.baguette.mixins.entity.mob;

import com.github.offsetmonkey538.baguette.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkeletonEntity.class)
public abstract class WitherSkeletonEntityMixin extends HostileEntity {

    public WitherSkeletonEntityMixin(EntityType<? extends WitherSkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "dropEquipment", at = @At("TAIL"))
    public void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops, CallbackInfo ci) {
        if (source.getAttacker() instanceof ServerPlayerEntity player) {
            if (player.getActiveItem().getItem().equals(ModItems.CHARGED_TNT_BAGUETTE)) {
                this.dropItem(Items.WITHER_SKELETON_SKULL);
            }
        }
    }
}
