package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockFourth extends Block {

    public BoardBlockFourth() {
        super(Properties.of(Material.STONE).strength(15, 400).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 6).requiresCorrectToolForDrops().harvestLevel(4));
    }

}
