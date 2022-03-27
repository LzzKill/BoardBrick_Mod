package com.fzz.boardbrick.Items;

import com.fzz.boardbrick.Items.ItemsPack.BoardBrick_Food;
import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.fzz.boardbrick.Items.ItemsPack.BoardBrick;

public class ItemRegistry {

    //Registry Item Final
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, boardbrick.MODID);

    public static RegistryObject<Item> BoardBrick = ITEMS.register("board_brick",()-> new BoardBrick()); //Return mod BUS
    public static RegistryObject<Item> BoardBrick_Item = ITEMS.register("board_brick_food",()-> new BoardBrick_Food()); //Return mod BUS

}
