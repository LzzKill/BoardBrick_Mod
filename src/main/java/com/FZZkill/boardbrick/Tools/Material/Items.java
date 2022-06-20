package com.FZZkill.boardbrick.Tools.Material;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class Items {

    public static class hand extends ArmorItem {
        public hand() {
            super(AromrMaterial.SUPER, EquipmentSlotType.HEAD, new Properties().tab(boardbrick.BoardGroup));
        }

    }

    public static class feet extends ArmorItem {
        public feet() {
            super(AromrMaterial.SUPER, EquipmentSlotType.FEET, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class legs extends ArmorItem {
        public legs() {
            super(AromrMaterial.SUPER, EquipmentSlotType.LEGS, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class chest extends ArmorItem {
        public chest() {
            super(AromrMaterial.SUPER, EquipmentSlotType.CHEST, new Properties().tab(boardbrick.BoardGroup));
        }
    }

}
