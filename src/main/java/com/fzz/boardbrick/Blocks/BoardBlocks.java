package com.fzz.boardbrick.Blocks;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BoardBlocks {

    public static class BoardBlockEighth extends Block {
        public BoardBlockEighth() {
            super(Properties.of(Material.STONE).strength(16, 800).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 16).requiresCorrectToolForDrops().harvestLevel(4));
        }
    }

    public static class BoardBlockFifth extends Block {
        public BoardBlockFifth() {
            super(Properties.of(Material.STONE).strength(15, 500).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 8).requiresCorrectToolForDrops().harvestLevel(4));
        }
    }

    public static class BoardBlockFirst extends Block {
        public BoardBlockFirst() {
            super(Properties.of(Material.STONE).strength(0, 0).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE).lightLevel(s -> 0));
        }
    }

    public static class BoardBlockFourth extends Block {
        public BoardBlockFourth() {
            super(Properties.of(Material.STONE).strength(15, 400).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 6).requiresCorrectToolForDrops().harvestLevel(4));
        }
    }

    public static class BoardBlockNinth extends Block {
        public BoardBlockNinth() {
            super(Properties.of(Material.STONE).strength(9999, boardbrick.MaxInt).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 16).requiresCorrectToolForDrops().harvestLevel(5));
        }
    }

    public static class BoardBlockSecond extends Block {
        public BoardBlockSecond() {
            super(Properties.of(Material.STONE).strength(5, 100).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 2).requiresCorrectToolForDrops().harvestLevel(1));
        }
    }

    public static class BoardBlockSeventh extends Block {
        public BoardBlockSeventh() {
            super(Properties.of(Material.STONE).strength(15, 700).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 14).requiresCorrectToolForDrops().harvestLevel(4));
        }
    }

    public static class BoardBlockSixth extends Block {
        public BoardBlockSixth() {
            super(Properties.of(Material.STONE).strength(15, 600).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 10).requiresCorrectToolForDrops().harvestLevel(4));
        }
    }

    public static class BoardBlockThird extends Block {
        public BoardBlockThird() {
            super(Properties.of(Material.STONE).strength(15, 300).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).lightLevel(s -> 4).requiresCorrectToolForDrops().harvestLevel(2));
        }
    }

}
