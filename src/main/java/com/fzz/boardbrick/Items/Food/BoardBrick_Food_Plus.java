package com.fzz.boardbrick.Items.Food;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BoardBrick_Food_Plus extends Item {

    public BoardBrick_Food_Plus() {
        super(new Properties().tab(boardbrick.BoardGroup).food(new Food.Builder().
                effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DIG_SPEED, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DIG_SLOWDOWN, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.HARM, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.HARM, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.JUMP, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.CONFUSION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.REGENERATION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.INVISIBILITY, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.BLINDNESS, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.NIGHT_VISION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.HUNGER, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.WEAKNESS, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.POISON, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.WITHER, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.ABSORPTION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.SATURATION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.GLOWING, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.LEVITATION, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.LUCK, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.UNLUCK, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.SLOW_FALLING, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.CONDUIT_POWER, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 1000000, 255), 1f).
                effect(() -> new EffectInstance(Effects.BAD_OMEN, 1000000, 255), 1f).
                alwaysEat().nutrition(100).saturationMod(5.0f).build()));
    }

}