package com.fzz.boardbrick;

import com.fzz.boardbrick.Blocks.BoardBlocks;
import com.fzz.boardbrick.Blocks.OtherBlocks_List.BoardBlockEighth_Copy;
import com.fzz.boardbrick.Blocks.OtherBlocks_List.BoardBlockSuper;
import com.fzz.boardbrick.Items.Food.BoardBrick_Food;
import com.fzz.boardbrick.Items.Food.BoardBrick_Food_Plus;
import com.fzz.boardbrick.Tools.Items.BoardBrick_Tools;
import com.fzz.boardbrick.Tools.Items.BoardBrick_Tools_Plus;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ObjectsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, boardbrick.MODID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, boardbrick.MODID);

    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick", com.fzz.boardbrick.Items.BoardBrick::new); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Food = ITEMS.register("board_brick_food", BoardBrick_Food::new); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Food_Plus = ITEMS.register("board_brick_plus", BoardBrick_Food_Plus::new); //Return mod BUS

    public static RegistryObject<SoundEvent> meaSound = SOUND_EVENT.register("mea", () -> new SoundEvent(new ResourceLocation(boardbrick.MODID, "mea")));
    public static RegistryObject<Item> mea = ITEMS.register("mea", com.fzz.boardbrick.Music.mea::new);

    public static RegistryObject<Item> BSword = ITEMS.register("board_brick_sword", BoardBrick_Tools.BoardBrickSword::new);
    public static RegistryObject<Item> BPickaxe = ITEMS.register("board_brick_pickaxe", BoardBrick_Tools.BoardBrickPickaxe::new);
    public static RegistryObject<Item> BAxe = ITEMS.register("board_brick_axe", BoardBrick_Tools.BoardBrickAxe::new);
    public static RegistryObject<Item> BShovel = ITEMS.register("board_brick_shovel", BoardBrick_Tools.BoardBrickShovel::new);
    public static RegistryObject<Item> BHoe = ITEMS.register("board_brick_hoe", BoardBrick_Tools.BoardBrickHoe::new);
    public static RegistryObject<Item> BBow = ITEMS.register("board_brick_bow", BoardBrick_Tools.BoardBrickBow::new);

    public static RegistryObject<Item> BSwordPlus = ITEMS.register("board_brick_sword_plus", BoardBrick_Tools_Plus.BoardBrickSword_Plus::new);
    public static RegistryObject<Item> BPickaxePlus = ITEMS.register("board_brick_pickaxe_plus", BoardBrick_Tools_Plus.BoardBrickPickaxe_Plus::new);
    public static RegistryObject<Item> BAxePlus = ITEMS.register("board_brick_axe_plus", BoardBrick_Tools_Plus.BoardBrickAxe_Plus::new);
    public static RegistryObject<Item> BShovelPlus = ITEMS.register("board_brick_shovel_plus", BoardBrick_Tools_Plus.BoardBrickShovel_Plus::new);
    public static RegistryObject<Item> BHoePlus = ITEMS.register("board_brick_hoe_plus", BoardBrick_Tools_Plus.BoardBrickHoe_Plus::new);

    public static RegistryObject<Block> A = BLOCKS.register("board_block_first", BoardBlocks.BoardBlockFifth::new);
    public static RegistryObject<Block> B = BLOCKS.register("board_block_second", BoardBlocks.BoardBlockSecond::new);
    public static RegistryObject<Block> C = BLOCKS.register("board_block_third", BoardBlocks.BoardBlockThird::new);
    public static RegistryObject<Block> D = BLOCKS.register("board_block_fourth", BoardBlocks.BoardBlockFourth::new);
    public static RegistryObject<Block> E = BLOCKS.register("board_block_fifth", BoardBlocks.BoardBlockFifth::new);
    public static RegistryObject<Block> F = BLOCKS.register("board_block_sixth", BoardBlocks.BoardBlockSixth::new);
    public static RegistryObject<Block> G = BLOCKS.register("board_block_seventh", BoardBlocks.BoardBlockSeventh::new);
    public static RegistryObject<Block> H = BLOCKS.register("board_block_eighth", BoardBlocks.BoardBlockEighth::new);
    public static RegistryObject<Block> I = BLOCKS.register("board_block_ninth", BoardBlocks.BoardBlockNinth::new);
    public static RegistryObject<Block> J = BLOCKS.register("board_block_super", BoardBlockSuper::new);

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

    public static RegistryObject<Block> H_ = BLOCKS.register("board_block_eighth_copy", BoardBlockEighth_Copy::new);
    public static RegistryObject<Item> h_ = ITEMS.register("board_block_eighth_copy", () -> new BlockItem(H_.get(), new Item.Properties().tab(boardbrick.BoardGroup)));

}
