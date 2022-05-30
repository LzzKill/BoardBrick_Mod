package com.fzz.boardbrick.Music;

import com.fzz.boardbrick.ObjectRegistry;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;

public class mea extends MusicDiscItem {

    public mea() {

        super(114, () -> ObjectRegistry.meaSound.get(), new Item.Properties().tab(boardbrick.BoardGroup).durability(1));

    }
}
