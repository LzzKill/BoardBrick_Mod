package com.fzz.boardbrick;

import com.fzz.boardbrick.Items.ItemRegistry;
import com.fzz.boardbrick.Items.ItemsPack.BoardBrick;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(boardbrick.MODID)
public class boardbrick {

    public static final String MODID = "boardbrick";

    public static final int MaxInt = 2147483647;
    public static final ItemGroup BoardGroup = new boardbrick.BoardGroup("boardgroup");
    //BoardBrick

    public boardbrick() {
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); //Register event system
    }

    //Create tab
    public static class BoardGroup extends ItemGroup {
        public BoardGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(new BoardBrick());
        }
    }

}
