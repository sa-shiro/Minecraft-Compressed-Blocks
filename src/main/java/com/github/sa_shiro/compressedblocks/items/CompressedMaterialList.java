package com.github.sa_shiro.compressedblocks.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum CompressedMaterialList implements IItemTier {

    hardenedMaterial(4, 6244, 25.0F, 7.0F, 22, Items.DIAMOND_BLOCK);


    private float attackDamage, efficiency;
    private int getMaxUses, harvestLevel, enchantability;
    private Item repairMaterial;

    CompressedMaterialList(int harvestLevel, int getMaxUses, float efficiency, float attackDamage, int enchantabilityIn, Item repairMaterial) {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.getMaxUses = getMaxUses;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMaxUses() {
        return getMaxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }


}
