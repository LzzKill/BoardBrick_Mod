package com.fzz.boardbrick.Tools.Super.Tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoardBrickShearsItem extends Item {
    public BoardBrickShearsItem(Item.Properties p_i48471_1_) {
        super(p_i48471_1_);
    }

    public boolean mineBlock(ItemStack p_179218_1_, World p_179218_2_, BlockState p_179218_3_, BlockPos p_179218_4_, LivingEntity p_179218_5_) {
        return false;
        //return true
    }

    public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
        return true;
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        return 0f;
    }

    @Override
    public net.minecraft.util.ActionResultType interactLivingEntity(ItemStack stack, net.minecraft.entity.player.PlayerEntity playerIn, LivingEntity entity, net.minecraft.util.Hand hand) {
        if (entity.level.isClientSide) return net.minecraft.util.ActionResultType.PASS;
        if (entity instanceof net.minecraftforge.common.IForgeShearable) {
            net.minecraftforge.common.IForgeShearable target = (net.minecraftforge.common.IForgeShearable) entity;
            BlockPos pos = new BlockPos(entity.getX(), entity.getY(), entity.getZ());
            if (target.isShearable(stack, entity.level, pos)) {
                java.util.List<ItemStack> drops = target.onSheared(playerIn, stack, entity.level, pos,
                        net.minecraft.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.enchantment.Enchantments.BLOCK_FORTUNE, stack));
                java.util.Random rand = new java.util.Random();
                drops.forEach(d -> {
                    net.minecraft.entity.item.ItemEntity ent = entity.spawnAtLocation(d, 1.0F);
                    ent.setDeltaMovement(ent.getDeltaMovement().add((double) ((rand.nextFloat() - rand.nextFloat()) * 0.1F), (double) (rand.nextFloat() * 0.05F), (double) ((rand.nextFloat() - rand.nextFloat()) * 0.1F)));
                });
                stack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(hand));
            }
            return net.minecraft.util.ActionResultType.SUCCESS;
        }
        return net.minecraft.util.ActionResultType.PASS;
    }
}
