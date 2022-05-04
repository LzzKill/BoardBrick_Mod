package com.fzz.boardbrick.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockEighth extends Block {

    public BoardBlockEighth() {
        super(Properties.of(Material.STONE).strength(15, 800).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 16).requiresCorrectToolForDrops().harvestLevel(4).noOcclusion().noDrops().noCollission());
    }

}
