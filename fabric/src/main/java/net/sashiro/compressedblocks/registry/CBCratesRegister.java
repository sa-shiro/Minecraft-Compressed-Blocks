package net.sashiro.compressedblocks.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.sashiro.compressedblocks.block.CBCrates;
import net.sashiro.compressedblocks.item.CrateItem;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBCratesRegister {
    public static Collection<ItemStack> CRATES = new ArrayList<>();
    
    public static void register() {
        String c0 = "crated_";
        String c1 = "double_crated_";
        String c2 = "triple_crated_";
        String c3 = "quadruple_crated_";
        String c4 = "quintuple_crated_";
        String c5 = "sextuple_crated_";
        String c6 = "septuple_crated_";
        String c7 = "octuple_crated_";
        String c8 = "mega_crated_";
        String c9 = "giga_crated_";
        
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c0 + "APPLE".toLowerCase()), CBCrates.APPLE_0);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c0 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_0));
        CRATES.add(new ItemStack(CBCrates.APPLE_0));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c1 + "APPLE".toLowerCase()), CBCrates.APPLE_1);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c1 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_1));
        CRATES.add(new ItemStack(CBCrates.APPLE_1));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c2 + "APPLE".toLowerCase()), CBCrates.APPLE_2);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c2 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_2));
        CRATES.add(new ItemStack(CBCrates.APPLE_2));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c3 + "APPLE".toLowerCase()), CBCrates.APPLE_3);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c3 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_3));
        CRATES.add(new ItemStack(CBCrates.APPLE_3));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c4 + "APPLE".toLowerCase()), CBCrates.APPLE_4);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c4 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_4));
        CRATES.add(new ItemStack(CBCrates.APPLE_4));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c5 + "APPLE".toLowerCase()), CBCrates.APPLE_5);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c5 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_5));
        CRATES.add(new ItemStack(CBCrates.APPLE_5));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c6 + "APPLE".toLowerCase()), CBCrates.APPLE_6);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c6 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_6));
        CRATES.add(new ItemStack(CBCrates.APPLE_6));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c7 + "APPLE".toLowerCase()), CBCrates.APPLE_7);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c7 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_7));
        CRATES.add(new ItemStack(CBCrates.APPLE_7));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c8 + "APPLE".toLowerCase()), CBCrates.APPLE_8);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c8 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_8));
        CRATES.add(new ItemStack(CBCrates.APPLE_8));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, c9 + "APPLE".toLowerCase()), CBCrates.APPLE_9);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, c9 + "APPLE".toLowerCase()), new CrateItem(CBCrates.APPLE_9));
        CRATES.add(new ItemStack(CBCrates.APPLE_9));
    }
}
