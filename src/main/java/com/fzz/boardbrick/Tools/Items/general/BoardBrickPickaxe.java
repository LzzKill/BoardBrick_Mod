package com.fzz.boardbrick.Tools.Items.general;

import com.fzz.boardbrick.Tools.ToolTier;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.PickaxeItem;

public class BoardBrickPickaxe extends PickaxeItem {

    public BoardBrickPickaxe() {

        super(ToolTier.BoardBrickTool, -100, 1919806F, new Properties().tab(boardbrick.BoardGroup));

    }

}
