package com.fzz.boardbrick.Tools.Super.Tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BoardBrickTieredItem extends Item {
    private final IItemTier tier;

    public BoardBrickTieredItem(IItemTier p_i48459_1_, Item.Properties p_i48459_2_) {
        super(p_i48459_2_.defaultDurability(p_i48459_1_.getUses()));
        this.tier = p_i48459_1_;
    }

    public IItemTier getTier() {
        return this.tier;
    }

    public int getEnchantmentValue() {
        return this.tier.getEnchantmentValue();
    }

    public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return true;
    }
}
