package com.FZZkill.boardbrick.Blocks.OtherBlocks_List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockSuper extends Block {

    public BoardBlockSuper() {
        super(Properties.of(Material.STONE).strength(-Integer.MAX_VALUE, Integer.MAX_VALUE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> Integer.MAX_VALUE).requiresCorrectToolForDrops().harvestLevel(10));
    }
}
