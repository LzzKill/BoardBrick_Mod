package com.FZZkill.boardbrick.Armor;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class gen {

    public static class hand extends ArmorItem {
        public hand() {
            super(ArmorMaterial.GEN, EquipmentSlotType.HEAD, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class feet extends ArmorItem {
        public feet() {
            super(ArmorMaterial.GEN, EquipmentSlotType.FEET, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class legs extends ArmorItem {
        public legs() {
            super(ArmorMaterial.GEN, EquipmentSlotType.LEGS, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class chest extends ArmorItem {
        public chest() {
            super(ArmorMaterial.GEN, EquipmentSlotType.CHEST, new Properties().tab(boardbrick.BoardGroup));
        }
    }

}
