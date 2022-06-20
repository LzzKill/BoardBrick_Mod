package com.FZZkill.boardbrick.Blocks.OtherBlocks_List;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BoardBlockSuper_Item extends BlockItem {

    public BoardBlockSuper_Item() {
        super(new BoardBlockSuper(), new Item.Properties().tab(boardbrick.BoardGroup));
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        if (Screen.hasShiftDown()) p_77624_3_.add(new TranslationTextComponent("superblock"));
        else p_77624_3_.add(new TranslationTextComponent("superblock_shift"));


        super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
    }

}
