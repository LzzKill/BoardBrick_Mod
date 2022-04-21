package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockNinth extends Block {

    public BoardBlockNinth() {
        super(Properties.of(Material.STONE).strength(15, 900).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 16).requiresCorrectToolForDrops().harvestLevel(5));
    }

}
