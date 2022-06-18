package com.FZZkill.boardbrick.Tools.Super.Tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoardBrickSwordItem extends BoardBrickTieredItem implements IVanishable {
    private final float attackDamage;
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public BoardBrickSwordItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Item.Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_4_);
        this.attackDamage = (float) p_i48460_2_ + p_i48460_1_.getAttackDamageBonus();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double) this.attackDamage, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double) p_i48460_3_, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    public float getDamage() {
        return this.attackDamage;
    }

    public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
        return true;
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        return 0F;
    }

    public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
        return true;
    }

    public boolean mineBlock(ItemStack p_179218_1_, World world, BlockState blockState, BlockPos p_179218_4_, LivingEntity LivingEntity) {
        return false;
    }

    public boolean isCorrectToolForDrops(BlockState p_150897_1_) {
        return true;
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
        return this.defaultModifiers;
    }
}
