package com.github.sa_shiro.compressedblocks.item;

import net.minecraft.item.*;


public class ToolItems {

    public static class HardenedPickaxe extends PickaxeItem {
        public HardenedPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
            super(tier, attackDamageIn, attackSpeedIn, builder);
        }
    }

    public static class HardeneAxe extends AxeItem {
        public HardeneAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
            super(tier, attackDamageIn, attackSpeedIn, builder);
        }
    }

    public static class HardeneShovel extends ShovelItem {
        public HardeneShovel(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
            super(tier, attackDamageIn, attackSpeedIn, builder);
        }
    }

    public static class HardenedHoe extends HoeItem {
        public HardenedHoe(IItemTier tier, float attackSpeedIn, Properties builder) {
            super(tier, attackSpeedIn, builder);
        }
    }

    public static class HardeneSword extends SwordItem {
        public HardeneSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
            super(tier, attackDamageIn, attackSpeedIn, builder);
        }
    }
}
