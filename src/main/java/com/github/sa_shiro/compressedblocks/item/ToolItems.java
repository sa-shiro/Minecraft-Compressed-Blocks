package com.github.sa_shiro.compressedblocks.item;

import net.minecraft.item.*;


public class ToolItems {

    public static class HardenedPickaxe extends PickaxeItem {
        public HardenedPickaxe(IItemTier itemTier, int attackDamageIn, float attackSpeedIn, Item.Properties properties) {
            super(itemTier, attackDamageIn, attackSpeedIn, properties);
        }
    }

    public static class HardenedAxe extends AxeItem {
        public HardenedAxe(IItemTier itemTier, float attackDamageIn, float attackSpeedIn, Item.Properties properties) {
            super(itemTier, attackDamageIn, attackSpeedIn, properties);
        }
    }

    public static class HardenedShovel extends ShovelItem {
        public HardenedShovel(IItemTier itemTier, float attackDamageIn, float attackSpeedIn, Item.Properties properties) {
            super(itemTier, attackDamageIn, attackSpeedIn, properties);
        }
    }

    public static class HardenedHoe extends HoeItem {
        public HardenedHoe(IItemTier itemTier, int attackDamage, float attackSpeed, Item.Properties properties) {
            super(itemTier, attackDamage, attackSpeed, properties);
        }
    }

    public static class HardenedSword extends SwordItem {
        public HardenedSword(IItemTier itemTier, int attackDamageIn, float attackSpeedIn, Item.Properties properties) {
            super(itemTier, attackDamageIn, attackSpeedIn, properties);
        }
    }
}