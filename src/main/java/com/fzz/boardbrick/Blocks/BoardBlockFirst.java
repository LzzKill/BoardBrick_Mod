package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockFirst extends Block {

    public BoardBlockFirst() {
        super(Properties.of(Material.ICE_SOLID).strength(5.0F,114514.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).lightLevel(s -> 5));
    }

}
