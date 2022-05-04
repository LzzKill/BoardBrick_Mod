package com.fzz.boardbrick.Tools.Items.GENERAL;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.BowItem;

public class BoardBrickBow extends BowItem {

    public BoardBrickBow() {

        super(new Properties().tab(boardbrick.BoardGroup).durability(114514));
        // super(new BowItem((new Item.Properties()).durability(384).tab(ItemGroup.TAB_COMBAT)));

    }

}
