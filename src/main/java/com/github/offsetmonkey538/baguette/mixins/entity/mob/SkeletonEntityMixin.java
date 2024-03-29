package com.github.offsetmonkey538.baguette.mixins.entity.mob;

import com.github.offsetmonkey538.baguette.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SkeletonEntity.class)
public abstract class SkeletonEntityMixin extends HostileEntity {

    public SkeletonEntityMixin(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "dropEquipment", at = @At("TAIL"))
    public void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops, CallbackInfo ci) {
        if (source.getAttacker() instanceof ServerPlayerEntity player) {
            if (player.getActiveItem().getItem().equals(ModItems.CHARGED_TNT_BAGUETTE)) {
                this.dropItem(Items.SKELETON_SKULL);
            }
        }
    }
}
