package com.fzz.boardbrick.Items;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Item;

public class BoardBrick extends Item {

    public BoardBrick() {
        super(new Properties().tab(boardbrick.BoardGroup)); //返回的是正常的方法，需要借助到mod总线
    }

}
