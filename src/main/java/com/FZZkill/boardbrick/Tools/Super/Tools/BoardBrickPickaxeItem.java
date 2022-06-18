package com.FZZkill.boardbrick.Tools.Super.Tools;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class BoardBrickPickaxeItem extends BoardBrickToolItem {
    private static final Set<Block> DIGGABLES = ImmutableSet.of();

    public BoardBrickPickaxeItem(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Item.Properties p_i48478_4_) {
        super((float) p_i48478_2_, p_i48478_3_, p_i48478_1_, DIGGABLES, p_i48478_4_.addToolType(net.minecraftforge.common.ToolType.PICKAXE, p_i48478_1_.getLevel()));
    }

    public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
        return true;
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        return this.speed;
    }
}