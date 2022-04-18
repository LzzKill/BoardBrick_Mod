package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockFifth extends Block {

    public BoardBlockFifth() {
        super(Properties.of(Material.STONE).strength(15, 500).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 30).requiresCorrectToolForDrops().harvestLevel(4));
    }

}
