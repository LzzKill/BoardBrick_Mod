package com.FZZkill.boardbrick.Tools.Super.Tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class BoardBrickToolItem extends BoardBrickTieredItem {
    protected final float speed;
    private final float attackDamageBaseline;
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public BoardBrickToolItem(float p_i48512_1_, float p_i48512_2_, IItemTier p_i48512_3_, Set<Block> blocks, Item.Properties p_i48512_5_) {
        super(p_i48512_3_, p_i48512_5_);
        this.speed = p_i48512_3_.getSpeed();
        this.attackDamageBaseline = p_i48512_1_ + p_i48512_3_.getAttackDamageBonus();
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", (double) this.attackDamageBaseline, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", (double) p_i48512_2_, AttributeModifier.Operation.ADDITION));
        this.defaultModifiers = builder.build();
    }

    public float getDestroySpeed(ItemStack p_150893_1_, BlockState p_150893_2_) {
        getToolTypes(p_150893_1_).stream().anyMatch(e -> p_150893_2_.isToolEffective(e));
        return this.speed;
    }

    public boolean hurtEnemy(ItemStack p_77644_1_, LivingEntity p_77644_2_, LivingEntity p_77644_3_) {
        return true;
    }

    public boolean mineBlock(ItemStack p_179218_1_, World world, BlockState blockState, BlockPos blockPos, LivingEntity p_179218_5_) {
        return true;
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
        return this.defaultModifiers;
    }

    public float getAttackDamage() {
        return this.attackDamageBaseline;
    }

}
