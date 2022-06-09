package com.fzz.boardbrick.Tools.Items;

import com.fzz.boardbrick.boardbrick;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class BoardBrick_Tools {

    public static class BoardBrickAxe extends AxeItem {
        public BoardBrickAxe() {
            super(ToolTierGenAndPlus.BoardBrickTool, -114519, 1919806F, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickHoe extends HoeItem {
        public BoardBrickHoe() {
            super(ToolTierGenAndPlus.BoardBrickTool, -114519, 1919806F, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickPickaxe extends PickaxeItem {
        public BoardBrickPickaxe() {
            super(ToolTierGenAndPlus.BoardBrickTool, -114519, 1919806F, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickShovel extends ShovelItem {
        public BoardBrickShovel() {
            super(ToolTierGenAndPlus.BoardBrickTool, -114519, 1919806F, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickSword extends SwordItem {
        public BoardBrickSword() {
            super(ToolTierGenAndPlus.BoardBrickTool, 114509, 1919806F, new Properties().tab(boardbrick.BoardGroup));
        }
    }

    public static class BoardBrickBow extends BowItem {
        public static final Predicate<ItemStack> Range = (range) -> {
            return range.getItem().is(ItemTags.ARROWS);
        };

        public BoardBrickBow() {
            super(new Properties().tab(boardbrick.BoardGroup));
        }

        @Override
        public int getDefaultProjectileRange() {
            return 200;
        }

        @Override
        public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
            ItemStack itemstack = p_77659_2_.getItemInHand(p_77659_3_);
            boolean flag = !p_77659_2_.getProjectile(itemstack).isEmpty();

            ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, p_77659_1_, p_77659_2_, p_77659_3_, flag);
            if (ret != null) {
                p_77659_2_.giveExperiencePoints(1);
                return ret;
            }

            if (!p_77659_2_.abilities.instabuild && !flag) {
                return ActionResult.fail(itemstack);
            } else {
                p_77659_2_.startUsingItem(p_77659_3_);
                return ActionResult.consume(itemstack);
            }
        }

    }

}
