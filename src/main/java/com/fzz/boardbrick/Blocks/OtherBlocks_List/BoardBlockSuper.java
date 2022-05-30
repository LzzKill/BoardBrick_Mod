package com.fzz.boardbrick.Blocks.OtherBlocks_List;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockSuper extends Block {

    public BoardBlockSuper() {
        super(Properties.of(Material.STONE).strength(-boardbrick.MaxInt, boardbrick.MaxInt).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> boardbrick.MaxInt).requiresCorrectToolForDrops().harvestLevel(10));
    }

}
