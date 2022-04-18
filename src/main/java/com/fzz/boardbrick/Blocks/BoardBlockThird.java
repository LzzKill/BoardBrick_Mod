package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockThird extends Block {

    public BoardBlockThird() {
        super(Properties.of(Material.STONE).strength(15, 300).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 15).requiresCorrectToolForDrops().harvestLevel(2));
    }

}
