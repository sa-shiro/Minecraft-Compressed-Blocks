package net.sashiro.compressedblocks.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.sashiro.compressedblocks.block.CBBlocks;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBBlocksRegister {
    public static Collection<ItemStack> BLOCKS = new ArrayList<>();
    
    public static void register() {
        FabricItemSettings i = new FabricItemSettings();
        
        // DIRT
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c0_" + "DIRT".toLowerCase()), CBBlocks.DIRT_0);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c0_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_0, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_0.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c1_" + "DIRT".toLowerCase()), CBBlocks.DIRT_1);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c1_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_1, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_1.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c2_" + "DIRT".toLowerCase()), CBBlocks.DIRT_2);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c2_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_2, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_2.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c3_" + "DIRT".toLowerCase()), CBBlocks.DIRT_3);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c3_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_3, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_3.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c4_" + "DIRT".toLowerCase()), CBBlocks.DIRT_4);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c4_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_4, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_4.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c5_" + "DIRT".toLowerCase()), CBBlocks.DIRT_5);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c5_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_5, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_5.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c6_" + "DIRT".toLowerCase()), CBBlocks.DIRT_6);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c6_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_6, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_6.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c7_" + "DIRT".toLowerCase()), CBBlocks.DIRT_7);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c7_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_7, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_7.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c8_" + "DIRT".toLowerCase()), CBBlocks.DIRT_8);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c8_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_8, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_8.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c9_" + "DIRT".toLowerCase()), CBBlocks.DIRT_9);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c9_" + "DIRT".toLowerCase()), new BlockItem(CBBlocks.DIRT_9, i));
        BLOCKS.add(new ItemStack(CBBlocks.DIRT_9.asItem()));
        // COBBLESTONE
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c0_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_0);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c0_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_0, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_0.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c1_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_1);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c1_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_1, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_1.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c2_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_2);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c2_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_2, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_2.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c3_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_3);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c3_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_3, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_3.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c4_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_4);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c4_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_4, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_4.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c5_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_5);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c5_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_5, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_5.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c6_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_6);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c6_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_6, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_6.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c7_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_7);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c7_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_7, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_7.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c8_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_8);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c8_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_8, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_8.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c9_" + "COBBLESTONE".toLowerCase()), CBBlocks.COBBLESTONE_9);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c9_" + "COBBLESTONE".toLowerCase()), new BlockItem(CBBlocks.COBBLESTONE_9, i));
        BLOCKS.add(new ItemStack(CBBlocks.COBBLESTONE_9.asItem()));
        // STONE
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c0_" + "STONE".toLowerCase()), CBBlocks.STONE_0);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c0_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_0, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_0.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c1_" + "STONE".toLowerCase()), CBBlocks.STONE_1);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c1_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_1, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_1.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c2_" + "STONE".toLowerCase()), CBBlocks.STONE_2);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c2_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_2, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_2.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c3_" + "STONE".toLowerCase()), CBBlocks.STONE_3);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c3_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_3, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_3.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c4_" + "STONE".toLowerCase()), CBBlocks.STONE_4);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c4_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_4, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_4.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c5_" + "STONE".toLowerCase()), CBBlocks.STONE_5);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c5_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_5, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_5.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c6_" + "STONE".toLowerCase()), CBBlocks.STONE_6);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c6_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_6, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_6.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c7_" + "STONE".toLowerCase()), CBBlocks.STONE_7);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c7_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_7, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_7.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c8_" + "STONE".toLowerCase()), CBBlocks.STONE_8);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c8_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_8, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_8.asItem()));
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, "c9_" + "STONE".toLowerCase()), CBBlocks.STONE_9);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "c9_" + "STONE".toLowerCase()), new BlockItem(CBBlocks.STONE_9, i));
        BLOCKS.add(new ItemStack(CBBlocks.STONE_9.asItem()));
    }
}
