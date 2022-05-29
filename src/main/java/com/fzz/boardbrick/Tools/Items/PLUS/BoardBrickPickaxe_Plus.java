package com.fzz.boardbrick.Tools.Items.PLUS;

import com.fzz.boardbrick.ObjectRegistry;
import com.fzz.boardbrick.Tools.ToolTierPlus;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.PickaxeItem;

public class BoardBrickPickaxe_Plus extends PickaxeItem {

    public BoardBrickPickaxe_Plus() {

        super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectRegistry.GROUP);

    }

}
