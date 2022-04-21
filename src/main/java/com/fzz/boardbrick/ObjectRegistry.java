package com.fzz.boardbrick;

import com.fzz.boardbrick.Blocks.*;
import com.fzz.boardbrick.Items.BoardBrick;
import com.fzz.boardbrick.Items.BoardBrick_Food;
import com.fzz.boardbrick.Tools.Items.GENERAL.*;
import com.fzz.boardbrick.Tools.Items.PLUS.BoardBrickPickaxe_Plus;
import com.fzz.boardbrick.Tools.Items.PLUS.BoardBrickSword_Plus;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ObjectRegistry {

    //Registry Item Final
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);
    //Registry Block Final
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, boardbrick.MODID);

    //注册，返回的是一个根方法类，用第一个BoardBrick举例
    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick", () -> new BoardBrick()); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Item = ITEMS.register("board_brick_food", () -> new BoardBrick_Food()); //Return mod BUS


    /*
     * Registry tool
     */

    //General
    public static RegistryObject<Item> BoardBrickSward = ITEMS.register("board_brick_sword", () -> new BoardBrickSword());
    public static RegistryObject<Item> BoardBrickPickaxe = ITEMS.register("board_brick_pickaxe", () -> new BoardBrickPickaxe());
    public static RegistryObject<Item> BoardbrickAxe = ITEMS.register("board_brick_axe", () -> new BoardBrickAxe());
    public static RegistryObject<Item> BoardbrickShovel = ITEMS.register("board_brick_shovel", () -> new BoardBrickShovel());
    public static RegistryObject<Item> BoardbrickHoe = ITEMS.register("board_brick_hoe", () -> new BoardBrickHoe());

    public static RegistryObject<Item> BoardBrickSward_Plus = ITEMS.register("board_brick_sword_plus", () -> new BoardBrickSword_Plus());
    public static RegistryObject<Item> BoardBrickPickaxe_Plus = ITEMS.register("board_brick_pickaxe_plus", () -> new BoardBrickPickaxe_Plus());

    //PlusPlus

    //Super


    /*
     * Registry Block and BlockItem
     */

    //Registry Block

    public static RegistryObject<Block> A = BLOCKS.register("board_block_first", () -> new BoardBlockFirst());
    public static RegistryObject<Block> B = BLOCKS.register("board_block_second", () -> new BoardBlockSecond());
    public static RegistryObject<Block> C = BLOCKS.register("board_block_third", () -> new BoardBlockThird());
    public static RegistryObject<Block> D = BLOCKS.register("board_block_fourth", () -> new BoardBlockFourth());
    public static RegistryObject<Block> E = BLOCKS.register("board_block_fifth", () -> new BoardBlockFifth());
    public static RegistryObject<Block> F = BLOCKS.register("board_block_sixth", () -> new BoardBlockSixth());
    public static RegistryObject<Block> G = BLOCKS.register("board_block_seventh", () -> new BoardBlockSeventh());
    public static RegistryObject<Block> H = BLOCKS.register("board_block_eighth", () -> new BoardBlockEighth());
    public static RegistryObject<Block> I = BLOCKS.register("board_block_ninth", () -> new BoardBlockNinth());
    public static RegistryObject<Block> J = BLOCKS.register("board_block_super", () -> new BoardBlockSuper());
    //Registry BlockItem

    public static RegistryObject<Item> a = ITEMS.register("board_block_first", () -> new BlockItem(A.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> b = ITEMS.register("board_block_second", () -> new BlockItem(B.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> c = ITEMS.register("board_block_third", () -> new BlockItem(C.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> d = ITEMS.register("board_block_fourth", () -> new BlockItem(D.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> e = ITEMS.register("board_block_fifth", () -> new BlockItem(E.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> f = ITEMS.register("board_block_sixth", () -> new BlockItem(F.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> g = ITEMS.register("board_block_seventh", () -> new BlockItem(G.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> h = ITEMS.register("board_block_eighth", () -> new BlockItem(H.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> i = ITEMS.register("board_block_ninth", () -> new BlockItem(I.get(), new Item.Properties().tab(boardbrick.BoardGroup)));
    public static RegistryObject<Item> j = ITEMS.register("board_block_super", () -> new BlockItem(J.get(), new Item.Properties().tab(boardbrick.BoardGroup)));


}
