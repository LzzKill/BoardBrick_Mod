package com.fzz.boardbrick;

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

    public boardbrick() { //申请MOD总线而不是申请Forge总线，因为这个东西基于事件系统
        ObjectsRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); //Register event system
        ObjectsRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus()); //Registry event system
        ObjectsRegistry.SOUND_EVENT.register(FMLJavaModLoadingContext.get().getModEventBus()); //Registry event system
    }

    //Create Group(or tab)
    public static class BoardGroup extends ItemGroup {
        public BoardGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ObjectsRegistry.BoardBrick.get());
        }
    }


}
