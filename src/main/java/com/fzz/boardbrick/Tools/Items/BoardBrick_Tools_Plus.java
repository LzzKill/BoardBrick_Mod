package com.fzz.boardbrick.Tools.Items;

import com.fzz.boardbrick.Tools.Items.ToolTier.ToolTierPlus;
import com.fzz.boardbrick.boardbrick;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class BoardBrick_Tools_Plus {

    public static class BoardBrickAxe_Plus extends AxeItem {
        public BoardBrickAxe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
            return this.speed;
        }
    }


    public static class BoardBrickPickaxe_Plus extends BoardBrickPickaxeItem {
        public BoardBrickPickaxe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickSword_Plus extends SwordItem {
        public BoardBrickSword_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
            return p_195938_4_.isCreative();
        }
    }

    public static class BoardBrickShovel_Plus extends ShovelItem {
        public BoardBrickShovel_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickHoe_Plus extends HoeItem {
        public BoardBrickHoe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickPickaxeItem extends ToolItem {
        private static final Set<Block> DIGGABLES = ImmutableSet.of(
                Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.POWERED_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.NETHER_GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.BLUE_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.GRANITE, Blocks.POLISHED_GRANITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, Blocks.STONE_SLAB,
                Blocks.SMOOTH_STONE_SLAB, Blocks.SANDSTONE_SLAB, Blocks.PETRIFIED_OAK_SLAB, Blocks.COBBLESTONE_SLAB, Blocks.BRICK_SLAB, Blocks.STONE_BRICK_SLAB, Blocks.NETHER_BRICK_SLAB, Blocks.QUARTZ_SLAB, Blocks.RED_SANDSTONE_SLAB, Blocks.PURPUR_SLAB, Blocks.SMOOTH_QUARTZ, Blocks.SMOOTH_RED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.SMOOTH_STONE, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.POLISHED_GRANITE_SLAB, Blocks.SMOOTH_RED_SANDSTONE_SLAB, Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.POLISHED_DIORITE_SLAB, Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.END_STONE_BRICK_SLAB, Blocks.SMOOTH_SANDSTONE_SLAB, Blocks.SMOOTH_QUARTZ_SLAB, Blocks.GRANITE_SLAB, Blocks.ANDESITE_SLAB, Blocks.RED_NETHER_BRICK_SLAB, Blocks.POLISHED_ANDESITE_SLAB,
                Blocks.DIORITE_SLAB, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX, Blocks.PISTON, Blocks.STICKY_PISTON, Blocks.PISTON_HEAD, Blocks.BEDROCK
        );

        public BoardBrickPickaxeItem(IItemTier p_i48478_1_, int p_i48478_2_, float p_i48478_3_, Item.Properties p_i48478_4_) {
            super((float) p_i48478_2_, p_i48478_3_, p_i48478_1_, DIGGABLES, p_i48478_4_.addToolType(net.minecraftforge.common.ToolType.PICKAXE, p_i48478_1_.getLevel()));
        }

        public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
            int i = this.getTier().getLevel();
            if (p_150897_1_.getHarvestTool() == net.minecraftforge.common.ToolType.PICKAXE) {
                return true;
            }
            Material material = p_150897_1_.getMaterial();
            return true;
        }

        public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
            return this.speed;
        }

    }

}
