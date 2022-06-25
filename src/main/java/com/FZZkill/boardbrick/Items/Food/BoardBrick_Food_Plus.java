package com.FZZkill.boardbrick.Items.Food;

import com.FZZkill.boardbrick.boardbrick;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BoardBrick_Food_Plus extends Item {

    public BoardBrick_Food_Plus() {
        super(new Properties().tab(boardbrick.BoardGroup).food(new Food.Builder()
                .
                effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.DIG_SPEED, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.DIG_SLOWDOWN, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.HARM, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.HARM, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.JUMP, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.CONFUSION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.REGENERATION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.WATER_BREATHING, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.INVISIBILITY, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.BLINDNESS, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.NIGHT_VISION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.HUNGER, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.WEAKNESS, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.POISON, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.WITHER, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.ABSORPTION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.SATURATION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.GLOWING, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.LEVITATION, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.LUCK, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.UNLUCK, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.SLOW_FALLING, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.CONDUIT_POWER, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.BAD_OMEN, 1, 255), 1f).effect(() -> new EffectInstance(Effects.BAD_OMEN, 1, 255), 1f).
                effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 1, 255), 1f).effect(() -> new EffectInstance(Effects.BAD_OMEN, 1, 255), 1f)
                        .
                nutrition(100).saturationMod(5.0f).build()));
    }
    
    

}