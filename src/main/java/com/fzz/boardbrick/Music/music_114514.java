package com.fzz.boardbrick.Music;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class music_114514 extends MusicDiscItem {

    public music_114514() {

        super(114514, () -> new SoundEvent(new ResourceLocation("music.114514")), new Properties().tab(boardbrick.BoardGroup));

    }

}
