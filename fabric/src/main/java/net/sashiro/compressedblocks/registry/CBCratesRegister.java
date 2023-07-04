package net.sashiro.compressedblocks.registry;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.item.CrateItem;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.*;
import static net.sashiro.compressedblocks.block.CrateList.*;

public class CBCratesRegister {
    public static Collection<Block> CRATES = new ArrayList<>();
    
    private static void registerCrate(String name, Block crateBlock) {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name.toLowerCase()), crateBlock);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name.toLowerCase()), new CrateItem(crateBlock));
        CRATES.add(crateBlock);
    }
    
    public static void register() {
        // APPLE
        registerCrate(c0 + "APPLE", APPLE_0);
        registerCrate(c1 + "APPLE", APPLE_1);
        registerCrate(c2 + "APPLE", APPLE_2);
        registerCrate(c3 + "APPLE", APPLE_3);
        registerCrate(c4 + "APPLE", APPLE_4);
        registerCrate(c5 + "APPLE", APPLE_5);
        registerCrate(c6 + "APPLE", APPLE_6);
        registerCrate(c7 + "APPLE", APPLE_7);
        registerCrate(c8 + "APPLE", APPLE_8);
        registerCrate(c9 + "APPLE", APPLE_9);
    }
}
