package com.fzz.boardbrick.Items.Food;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BoardBrick_Food extends Item {

    public BoardBrick_Food() {
        super(new Properties().tab(boardbrick.BoardGroup).food(new Food.Builder().
                effect(() ->new EffectInstance(Effects.REGENERATION, 1000000, 255), 1f).
                effect(() ->new EffectInstance(Effects.DAMAGE_RESISTANCE, 1000000, 255), 1f).
                effect(() ->new EffectInstance(Effects.SATURATION, 1000000, 255), 1f).
                effect(() ->new EffectInstance(Effects.FIRE_RESISTANCE, 1000000, 255), 1f).
                effect(() ->new EffectInstance(Effects.DAMAGE_BOOST, 1000000, 255), 1f).
                alwaysEat().fast().meat().nutrition(100).saturationMod(5.0f).build()));
    }
}