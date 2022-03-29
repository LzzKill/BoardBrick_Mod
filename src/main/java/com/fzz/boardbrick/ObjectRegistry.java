package com.fzz.boardbrick;

import com.fzz.boardbrick.Blocks.BoardBlockFirst;
import com.fzz.boardbrick.Items.BoardBrick_Food;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.fzz.boardbrick.Items.BoardBrick;

public class ObjectRegistry {

    //Registry Item Final
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);
    //Registry Block Final
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, boardbrick.MODID);

    //注册，返回的是一个根方法类，用第一个BoardBrick举例
    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick",()-> new BoardBrick()); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Item = ITEMS.register("board_brick_food",()-> new BoardBrick_Food()); //Return mod BUS

    //Registry Block and BlockItem
    public static RegistryObject<Block> BoardBlockFirst_Block = BLOCKS.register("board_brick_first",()->new BoardBlockFirst());

    public static RegistryObject<Item> BoardBlockFirst_Item = ITEMS.register("board_block",()-> new BlockItem(BoardBlockFirst_Block.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
}
