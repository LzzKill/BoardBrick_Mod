package com.fzz.boardbrick.Blocks.OtherBlocks_List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;

public class Blocks {

    public static final Block BEDROCK = register("bedrock", new Block(AbstractBlock.Properties.of(Material.STONE).strength(114514, 3600000.0F).noDrops().isValidSpawn(Blocks::never)));

    private static Block register(String p_222382_0_, Block p_222382_1_) {
        return Registry.register(Registry.BLOCK, p_222382_0_, p_222382_1_);
    }

    private static Boolean never(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_) {
        return (boolean) false;
    }

}
