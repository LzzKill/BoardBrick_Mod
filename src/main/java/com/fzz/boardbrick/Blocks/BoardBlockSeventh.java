package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockSeventh extends Block {

    public BoardBlockSeventh() {
        super(Properties.of(Material.STONE).strength(15, 700).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 14).requiresCorrectToolForDrops().harvestLevel(4));
    }

}
