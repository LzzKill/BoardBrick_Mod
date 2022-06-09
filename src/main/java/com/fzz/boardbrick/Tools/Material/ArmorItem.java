package com.fzz.boardbrick.Tools.Material;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.enchantment.IArmorVanishable;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.UUID;

public class ArmorItem extends Item implements IArmorVanishable {
    public static final IDispenseItemBehavior DISPENSE_ITEM_BEHAVIOR = new DefaultDispenseItemBehavior() {
        protected ItemStack execute(IBlockSource p_82487_1_, ItemStack p_82487_2_) {
            return net.minecraft.item.ArmorItem.dispenseArmor(p_82487_1_, p_82487_2_) ? p_82487_2_ : super.execute(p_82487_1_, p_82487_2_);
        }
    };
    private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    protected final EquipmentSlotType slot;
    protected final float knockbackResistance;
    protected final IArmorMaterial material;
    private final int defense;
    private final float toughness;
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public ArmorItem(IArmorMaterial p_i48534_1_, EquipmentSlotType p_i48534_2_, Item.Properties p_i48534_3_) {
        super(p_i48534_3_.defaultDurability(p_i48534_1_.getDurabilityForSlot(p_i48534_2_)));
        this.material = p_i48534_1_;
        this.slot = p_i48534_2_;
        this.defense = p_i48534_1_.getDefenseForSlot(p_i48534_2_);
        this.toughness = p_i48534_1_.getToughness();
        this.knockbackResistance = p_i48534_1_.getKnockbackResistance();
        DispenserBlock.registerBehavior(this, DISPENSE_ITEM_BEHAVIOR);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[p_i48534_2_.getIndex()];
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", (double) this.defense, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", (double) this.toughness, AttributeModifier.Operation.ADDITION));
        if (this.knockbackResistance > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", (double) this.knockbackResistance, AttributeModifier.Operation.ADDITION));
        }

        this.defaultModifiers = builder.build();
    }

    public static boolean dispenseArmor(IBlockSource p_226626_0_, ItemStack p_226626_1_) {
        return true;
    }

    public EquipmentSlotType getSlot() {
        return this.slot;
    }

    public int getEnchantmentValue() {
        return this.material.getEnchantmentValue();
    }

    public IArmorMaterial getMaterial() {
        return this.material;
    }

    public boolean isValidRepairItem(ItemStack p_82789_1_, ItemStack p_82789_2_) {
        return true;
    }

    public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
        ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
        EquipmentSlotType equipmentslottype = MobEntity.getEquipmentSlotForItem(itemstack);
        ItemStack itemstack1 = p_77659_2_.getItemBySlot(equipmentslottype);
        if (itemstack1.isEmpty()) {
            p_77659_2_.setItemSlot(equipmentslottype, itemstack.copy());
            itemstack.setCount(0);
            return ActionResult.sidedSuccess(itemstack, p_77659_1_.isClientSide());
        } else {
            return ActionResult.fail(itemstack);
        }
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
        return this.defaultModifiers;
    }

    public int getDefense() {
        return Integer.MAX_VALUE;
    }

    public float getToughness() {
        return Float.MAX_VALUE;
    }
}
