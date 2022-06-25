package com.FZZkill.boardbrick.Tools.Super;

import com.FZZkill.boardbrick.Tools.Super.Tools.*;
import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.item.Item;

public class Items {

    public static class Sword extends BoardBrickSwordItem {
        public Sword() {
            super(ToolTier.BoardBrickTool, Integer.MAX_VALUE, Integer.MAX_VALUE, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Hoe extends BoardBrickHoeItem {
        public Hoe() {
            super(ToolTier.BoardBrickTool, Integer.MAX_VALUE, Integer.MAX_VALUE, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Shovel extends BoardBrickShovelItem {
        public Shovel() {
            super(ToolTier.BoardBrickTool, Integer.MAX_VALUE, Integer.MAX_VALUE, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Pickaxe extends BoardBrickPickaxeItem {
        public Pickaxe() {
            super(ToolTier.BoardBrickTool, Integer.MAX_VALUE, Integer.MAX_VALUE, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Axe extends BoardBrickAxeItem {
        public Axe() {
            super(ToolTier.BoardBrickTool, Integer.MAX_VALUE, Integer.MAX_VALUE, new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Bow extends BoardBrickBowItem {
        public Bow() {
            super(new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class Shears extends BoardBrickShearsItem {
        public Shears() {
            super(new Item.Properties().tab(boardbrick.BoardGroup));
        }
    }
}
