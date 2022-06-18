package com.FZZkill.boardbrick.Music;

import com.FZZkill.boardbrick.ObjectsRegistry;
import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;

public class mea extends MusicDiscItem {

    public mea() {

        super(114, () -> ObjectsRegistry.meaSound.get(), new Item.Properties().tab(boardbrick.BoardGroup));

    }
}
