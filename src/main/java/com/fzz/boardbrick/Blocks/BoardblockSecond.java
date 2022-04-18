package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardblockSecond extends Block {

    public BoardblockSecond() {
        super(Properties.of(Material.STONE).strength(10, 114514).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 10).requiresCorrectToolForDrops().harvestLevel(3));
    }

}
