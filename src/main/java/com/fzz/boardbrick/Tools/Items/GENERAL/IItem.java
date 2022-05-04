package com.fzz.boardbrick.Tools.Items.GENERAL;

import net.minecraft.item.crafting.Ingredient;

public interface IItem {

    long getUses();

    double getSpeed();

    double getAttackDamageBonus();

    long getLevel();

    long getEnchantmentValue();

    Ingredient getRepairIngredient();


}
