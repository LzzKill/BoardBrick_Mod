package com.FZZkill.boardbrick.Items.Food;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BoardBrick_Food extends Item {

    public BoardBrick_Food() {
        super(new Properties().tab(boardbrick.BoardGroup).food(new Food.Builder().
                effect(() -> new EffectInstance(Effects.REGENERATION, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DIG_SPEED, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.SATURATION, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.WATER_BREATHING, 12000, 255), 1f).
                effect(() -> new EffectInstance(Effects.NIGHT_VISION, 12000, 255), 1f).
                alwaysEat().fast().meat().nutrition(100).saturationMod(5.0f).build()));
    }
}