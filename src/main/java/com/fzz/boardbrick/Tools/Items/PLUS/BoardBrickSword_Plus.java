package com.fzz.boardbrick.Tools.Items.PLUS;

import com.fzz.boardbrick.ObjectRegistry;
import com.fzz.boardbrick.Tools.ToolTierPlus;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.SwordItem;

public class BoardBrickSword_Plus extends SwordItem {

    public BoardBrickSword_Plus() {

        super(ToolTierPlus.BoardBrickTool_Plus, boardbrick.MaxInt, boardbrick.MaxInt, ObjectRegistry.GROUP);

    }

}
