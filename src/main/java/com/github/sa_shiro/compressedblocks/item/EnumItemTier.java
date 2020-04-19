package com.github.sa_shiro.compressedblocks.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum EnumItemTier implements IItemTier {

    HARDENED_WOOD(3, 256, 11.0F, 0.0F, 12, () -> {
        return Ingredient.fromItems(Items.COMPRESSED_WOOD);
    }),
    HARDENED_STONE(3, 512, 15.0F, 1.5F, 14, () -> {
        return Ingredient.fromItems(Blocks.COBBLESTONE);
    }),
    HARDENED_IRON(4, 1024, 19.0F, 2.5F, 17, () -> {
        return Ingredient.fromItems(Items.COMPRESSED_IRON);
    }),
    HARDENED_GOLD(3, 64, 30.0F, 0.0F, 30, () -> {
        return Ingredient.fromItems(Items.COMPRESSED_GOLD);
    }),
    HARDENED_DIAMOND(5, 8192, 24.0F, 3.5F, 16, () -> {
        return Ingredient.fromItems(Items.COMPRESSED_DIAMOND);
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    EnumItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
