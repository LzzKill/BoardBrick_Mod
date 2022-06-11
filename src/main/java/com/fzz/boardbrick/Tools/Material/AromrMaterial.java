package com.fzz.boardbrick.Tools.Material;


import com.fzz.boardbrick.ObjectsRegistry;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum AromrMaterial implements IArmorMaterial {

    GEN("boardbrick", 114514, new int[]{114514, 114514, 114514, 114514}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 0.0F, 0.0F, () -> Ingredient.of(ObjectsRegistry.BoardBrick.get())),
    SUPER("superboardbrick", Integer.MAX_VALUE, new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE, SoundEvents.ARMOR_EQUIP_GENERIC, Integer.MAX_VALUE, Integer.MAX_VALUE, () -> Ingredient.of(ObjectsRegistry.BoardBrick.get()));
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    AromrMaterial(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = p_i231593_4_;
        this.slotProtections = p_i231593_5_;
        this.enchantmentValue = p_i231593_6_;
        this.sound = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return 0;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
