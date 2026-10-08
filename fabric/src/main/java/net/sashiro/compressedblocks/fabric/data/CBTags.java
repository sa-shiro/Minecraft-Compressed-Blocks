package net.sashiro.compressedblocks.fabric.data;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBTags {

    public static TagKey<Item> getCompressionTag(int level) {
        return switch (level) {
            case 0 -> CompressionItemTags.COMPRESSION_X_01;
            case 1 -> CompressionItemTags.COMPRESSION_X_02;
            case 2 -> CompressionItemTags.COMPRESSION_X_03;
            case 3 -> CompressionItemTags.COMPRESSION_X_04;
            case 4 -> CompressionItemTags.COMPRESSION_X_05;
            case 5 -> CompressionItemTags.COMPRESSION_X_06;
            case 6 -> CompressionItemTags.COMPRESSION_X_07;
            case 7 -> CompressionItemTags.COMPRESSION_X_08;
            case 8 -> CompressionItemTags.COMPRESSION_X_09;
            case 9 -> CompressionItemTags.COMPRESSION_X_10;
            default -> throw new IllegalArgumentException("Invalid compression level: " + level);
        };
    }

    public static TagKey<Item> getCrateTag(int level) {
        return switch (level) {
            case 0 -> CompressionItemTags.CRATE_X_01;
            case 1 -> CompressionItemTags.CRATE_X_02;
            case 2 -> CompressionItemTags.CRATE_X_03;
            case 3 -> CompressionItemTags.CRATE_X_04;
            case 4 -> CompressionItemTags.CRATE_X_05;
            case 5 -> CompressionItemTags.CRATE_X_06;
            case 6 -> CompressionItemTags.CRATE_X_07;
            case 7 -> CompressionItemTags.CRATE_X_08;
            case 8 -> CompressionItemTags.CRATE_X_09;
            case 9 -> CompressionItemTags.CRATE_X_10;
            default -> throw new IllegalArgumentException("Invalid crate level: " + level);
        };
    }

    public static class CompressionBlockTags {
        public static final TagKey<Block> COMPRESSION_X_01 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x01"));
        public static final TagKey<Block> COMPRESSION_X_02 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x02"));
        public static final TagKey<Block> COMPRESSION_X_03 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x03"));
        public static final TagKey<Block> COMPRESSION_X_04 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x04"));
        public static final TagKey<Block> COMPRESSION_X_05 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x05"));
        public static final TagKey<Block> COMPRESSION_X_06 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x06"));
        public static final TagKey<Block> COMPRESSION_X_07 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x07"));
        public static final TagKey<Block> COMPRESSION_X_08 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x08"));
        public static final TagKey<Block> COMPRESSION_X_09 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x09"));
        public static final TagKey<Block> COMPRESSION_X_10 = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x10"));
    }

    public static class CompressionItemTags {
        public static final TagKey<Item> COMPRESSION_X_01 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x01"));
        public static final TagKey<Item> COMPRESSION_X_02 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x02"));
        public static final TagKey<Item> COMPRESSION_X_03 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x03"));
        public static final TagKey<Item> COMPRESSION_X_04 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x04"));
        public static final TagKey<Item> COMPRESSION_X_05 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x05"));
        public static final TagKey<Item> COMPRESSION_X_06 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x06"));
        public static final TagKey<Item> COMPRESSION_X_07 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x07"));
        public static final TagKey<Item> COMPRESSION_X_08 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x08"));
        public static final TagKey<Item> COMPRESSION_X_09 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x09"));
        public static final TagKey<Item> COMPRESSION_X_10 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compression_x10"));

        public static final TagKey<Item> CRATE_X_01 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x01"));
        public static final TagKey<Item> CRATE_X_02 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x02"));
        public static final TagKey<Item> CRATE_X_03 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x03"));
        public static final TagKey<Item> CRATE_X_04 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x04"));
        public static final TagKey<Item> CRATE_X_05 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x05"));
        public static final TagKey<Item> CRATE_X_06 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x06"));
        public static final TagKey<Item> CRATE_X_07 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x07"));
        public static final TagKey<Item> CRATE_X_08 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x08"));
        public static final TagKey<Item> CRATE_X_09 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x09"));
        public static final TagKey<Item> CRATE_X_10 = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, "crate_x10"));
    }
}
