package com.fzz.boardbrick.Tools.Items;

import com.fzz.boardbrick.ObjectsRegistry;
import com.fzz.boardbrick.Tools.Items.ToolTier.ToolTier;
import net.minecraft.item.*;

public class BoardBrick_Tools {

    public static class BoardBrickAxe extends AxeItem {
        public BoardBrickAxe() {
            super(ToolTier.BoardBrickTool, -114519, 1919806F, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickHoe extends HoeItem {
        public BoardBrickHoe() {
            super(ToolTier.BoardBrickTool, -114519, 1919806F, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickPickaxe extends PickaxeItem {
        public BoardBrickPickaxe() {
            super(ToolTier.BoardBrickTool, -114519, 1919806F, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickShovel extends ShovelItem {
        public BoardBrickShovel() {
            super(ToolTier.BoardBrickTool, -114519, 1919806F, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickSword extends SwordItem {
        public BoardBrickSword() {
            super(ToolTier.BoardBrickTool, 114509, 1919806F, ObjectsRegistry.GROUP);
        }
    }

    public static class BoardBrickBow extends BowItem {
        public BoardBrickBow() {
            super(ObjectsRegistry.GROUP);
        }
    }

}
