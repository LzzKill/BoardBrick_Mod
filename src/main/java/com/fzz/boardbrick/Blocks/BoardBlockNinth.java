package com.fzz.boardbrick.Blocks;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlockNinth extends Block {

    public BoardBlockNinth() {
        super(Properties.of(Material.STONE).strength(9999, boardbrick.MaxInt).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 16).requiresCorrectToolForDrops().harvestLevel(5));
    }

}
