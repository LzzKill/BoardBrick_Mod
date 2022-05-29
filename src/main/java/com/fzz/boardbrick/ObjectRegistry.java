package com.fzz.boardbrick;

import com.fzz.boardbrick.Blocks.*;
import com.fzz.boardbrick.Items.BoardBrick_Food;
import com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickAxe;
import com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickHoe;
import com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickShovel;
import com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickSword;
import com.fzz.boardbrick.Tools.Items.PLUS.BoardBrickSword_Plus;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ObjectRegistry {

    public static final Item.Properties GROUP = new Item.Properties().tab(boardbrick.BoardGroup);


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, boardbrick.MODID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, boardbrick.MODID);


    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick", com.fzz.boardbrick.Items.BoardBrick::new); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Item = ITEMS.register("board_brick_food", BoardBrick_Food::new); //Return mod BUS
    public static RegistryObject<SoundEvent> meaSound = SOUND_EVENT.register("mea", () -> new SoundEvent(new ResourceLocation(boardbrick.MODID, "mea")));
    public static RegistryObject<Item> mea = ITEMS.register("mea", com.fzz.boardbrick.Music.mea::new);

    public static RegistryObject<Item> BoardBrickSward = ITEMS.register("board_brick_sword", BoardBrickSword::new);
    public static RegistryObject<Item> BoardBrickPickaxe = ITEMS.register("board_brick_pickaxe", com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickPickaxe::new);
    public static RegistryObject<Item> BoardbrickAxe = ITEMS.register("board_brick_axe", BoardBrickAxe::new);
    public static RegistryObject<Item> BoardbrickShovel = ITEMS.register("board_brick_shovel", BoardBrickShovel::new);
    public static RegistryObject<Item> BoardbrickHoe = ITEMS.register("board_brick_hoe", BoardBrickHoe::new);
    public static RegistryObject<Item> BoardBrickBow = ITEMS.register("board_brick_bow", com.fzz.boardbrick.Tools.Items.GENERAL.BoardBrickBow::new);

    public static RegistryObject<Item> BoardBrickSward_Plus = ITEMS.register("board_brick_sword_plus", BoardBrickSword_Plus::new);
    public static RegistryObject<Item> BoardBrickPickaxe_Plus = ITEMS.register("board_brick_pickaxe_plus", com.fzz.boardbrick.Tools.Items.PLUS.BoardBrickPickaxe_Plus::new);


    /*
     * Registry Block and BlockItem
     */

    //Registry Block

    public static RegistryObject<Block> A = BLOCKS.register("board_block_first", BoardBlockFirst::new);
    public static RegistryObject<Block> B = BLOCKS.register("board_block_second", BoardBlockSecond::new);
    public static RegistryObject<Block> C = BLOCKS.register("board_block_third", BoardBlockThird::new);
    public static RegistryObject<Block> D = BLOCKS.register("board_block_fourth", BoardBlockFourth::new);
    public static RegistryObject<Block> E = BLOCKS.register("board_block_fifth", BoardBlockFifth::new);
    public static RegistryObject<Block> F = BLOCKS.register("board_block_sixth", BoardBlockSixth::new);
    public static RegistryObject<Block> G = BLOCKS.register("board_block_seventh", BoardBlockSeventh::new);
    public static RegistryObject<Block> H = BLOCKS.register("board_block_eighth", BoardBlockEighth::new);
    public static RegistryObject<Block> I = BLOCKS.register("board_block_ninth", BoardBlockNinth::new);
    public static RegistryObject<Block> J = BLOCKS.register("board_block_super", BoardBlockSuper::new);

    public static RegistryObject<Item> a = ITEMS.register("board_block_first", () -> new BlockItem(A.get(), GROUP));
    public static RegistryObject<Item> b = ITEMS.register("board_block_second", () -> new BlockItem(B.get(), GROUP));
    public static RegistryObject<Item> c = ITEMS.register("board_block_third", () -> new BlockItem(C.get(), GROUP));
    public static RegistryObject<Item> d = ITEMS.register("board_block_fourth", () -> new BlockItem(D.get(), GROUP));
    public static RegistryObject<Item> e = ITEMS.register("board_block_fifth", () -> new BlockItem(E.get(), GROUP));
    public static RegistryObject<Item> f = ITEMS.register("board_block_sixth", () -> new BlockItem(F.get(), GROUP));
    public static RegistryObject<Item> g = ITEMS.register("board_block_seventh", () -> new BlockItem(G.get(), GROUP));
    public static RegistryObject<Item> h = ITEMS.register("board_block_eighth", () -> new BlockItem(H.get(), GROUP));
    public static RegistryObject<Item> i = ITEMS.register("board_block_ninth", () -> new BlockItem(I.get(), GROUP));
    public static RegistryObject<Item> j = ITEMS.register("board_block_super", () -> new BlockItem(J.get(), GROUP));


}
