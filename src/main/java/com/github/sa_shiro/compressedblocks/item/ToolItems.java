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
        public HardenedHoe(IItemTier tier, int p_i231595_2_, float attackSpeedIn, Properties builder) { // fixme: change name p_i231595_2_
            super(tier, p_i231595_2_, attackSpeedIn, builder);
        }
    }

    public static class HardeneSword extends SwordItem {
        public HardeneSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
            super(tier, attackDamageIn, attackSpeedIn, builder);
        }
    }
}
