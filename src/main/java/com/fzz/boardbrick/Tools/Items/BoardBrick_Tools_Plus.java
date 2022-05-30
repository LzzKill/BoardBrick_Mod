package com.fzz.boardbrick.Tools.Items;

import com.fzz.boardbrick.ObjectsRegistry;
import com.fzz.boardbrick.Tools.Items.ToolTier.ToolTierPlus;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.*;

public class BoardBrick_Tools_Plus {

    public static class BoardBrickAxe_Plus extends AxeItem {
        public BoardBrickAxe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickPickaxe_Plus extends PickaxeItem {
        public BoardBrickPickaxe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickSword_Plus extends SwordItem {
        public BoardBrickSword_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickShovel_Plus extends ShovelItem {
        public BoardBrickShovel_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickHoe_Plus extends HoeItem {
        public BoardBrickHoe_Plus() {
            super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectsRegistry.GROUP);
        }
    }
}
