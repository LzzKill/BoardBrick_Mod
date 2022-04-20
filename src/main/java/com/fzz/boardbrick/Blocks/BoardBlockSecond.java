package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockSecond extends Block {

    public BoardBlockSecond() {
        super(Properties.of(Material.STONE).strength(5, 100).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 2).requiresCorrectToolForDrops().harvestLevel(1));
    }

}
