package com.fzz.boardbrick.Blocks;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockFirst extends Block {

    public BoardBlockFirst() {
        super(Properties.of(Material.ICE_SOLID).strength(10,-1).sound(SoundType.ANVIL).harvestTool(ToolType.PICKAXE));
    }

}
