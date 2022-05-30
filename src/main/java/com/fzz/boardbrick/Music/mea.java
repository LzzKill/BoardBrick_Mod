package com.fzz.boardbrick.Music;

import com.fzz.boardbrick.ObjectsRegistry;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;

public class mea extends MusicDiscItem {

    public mea() {

        super(114, () -> ObjectsRegistry.meaSound.get(), new Item.Properties().tab(boardbrick.BoardGroup).durability(1));

    }
}
