package com.fzz.boardbrick.Tools.Material;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.inventory.EquipmentSlotType;

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