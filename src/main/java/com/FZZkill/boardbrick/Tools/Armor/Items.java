package com.FZZkill.boardbrick.Tools.Armor;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class Items {

    public static class hand extends ArmorItem {
        public hand() {
            super(ArmorMaterial.SUPER, EquipmentSlotType.HEAD, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
            return true;
        }
    }

    public static class feet extends ArmorItem {
        public feet() {
            super(ArmorMaterial.SUPER, EquipmentSlotType.FEET, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
            return true;
        }
    }

    public static class legs extends ArmorItem {
        public legs() {
            super(ArmorMaterial.SUPER, EquipmentSlotType.LEGS, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
            return true;
        }
    }

    public static class chest extends ArmorItem {
        public chest() {
            super(ArmorMaterial.SUPER, EquipmentSlotType.CHEST, new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
            return true;
        }
    }

}
