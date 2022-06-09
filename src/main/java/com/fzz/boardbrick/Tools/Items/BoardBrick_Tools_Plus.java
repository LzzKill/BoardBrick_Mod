package com.fzz.boardbrick.Tools.Items;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoardBrick_Tools_Plus {

    public static class BoardBrickAxe_Plus extends AxeItem {
        public BoardBrickAxe_Plus() {
            super(ToolTierGenAndPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
        @Override
        public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
            return this.speed;
        }
    }


    public static class BoardBrickPickaxe_Plus extends PickaxeItem {
        public BoardBrickPickaxe_Plus() {
            super(ToolTierGenAndPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickSword_Plus extends SwordItem {
        public BoardBrickSword_Plus() {
            super(ToolTierGenAndPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
        @Override
        public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
            return p_195938_4_.isCreative();
        }
    }

    public static class BoardBrickShovel_Plus extends ShovelItem {
        public BoardBrickShovel_Plus() {
            super(ToolTierGenAndPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickHoe_Plus extends HoeItem {
        public BoardBrickHoe_Plus() {
            super(ToolTierGenAndPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, new Properties().tab(boardbrick.BoardGroup));
        }
    }



}
