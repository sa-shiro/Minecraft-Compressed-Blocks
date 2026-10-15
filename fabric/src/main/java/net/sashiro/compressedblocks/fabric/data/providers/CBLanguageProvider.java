package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.ChatFormatting;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class CBLanguageProvider extends FabricLanguageProvider {

    public CBLanguageProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder builder) {
        builder.add("itemGroup.compressed_blocks", "Compressed Blocks");
        builder.add("itemGroup.compressed_items", "Item Crates");
        builder.add("compressedblocks.configuration.blocksEnabled", "Enable Block Compression");
        builder.add("compressedblocks.configuration.cratesEnabled", "Enable Crate Compression");
        builder.add("compressedblocks.configuration.maxCompressionLevel", "Maximum Block Compression Level");
        builder.add("compressedblocks.configuration.maxCrateCompressionLevel", "Maximum Crate Compression Level");
        builder.add("compressedblocks.configuration.hardnessLevels", "Hardness Levels");
        builder.add("compressedblocks.configuration.resistanceLevels", "Resistance Levels");
        builder.add("compressedblocks.configuration.enabled", "Enabled");
        builder.add("compressedblocks.configuration.hardnessResistanceMultiplier", "Hardness/Resistance Multiplier");
        builder.add("compressedblocks.configuration.compressionLevel", "Compression Level");

        /*
         * Add translations for all blocks and items in the Constants class.
         * The translation key is generated based on the block/item name, and the translation value is generated based on the block/item name and compression level.
         */
        for (Block block : CompressedBlocks.COMPRESSED_BLOCKS) {
            String name = ResourceUtils.removeNamespace(block.getDescriptionId());
            String name2 = "";
            ChatFormatting color = ResourceUtils.getRarityColor(ResourceUtils.getCompressionLevel(name));

            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }

            builder.add("item.compressedblocks." + name, color.toString() + ResourceUtils.getCompressionLevelName(name) + ResourceUtils.capitalizeWords(name2.replace("_", " ")));
        }

        /*
         * Add translations for all crate items and blocks in the Constants class.
         * The translation key is generated based on the crate item/block name, and the translation value is generated based on the crate item/block name and compression level.
         */
        for (Item crate : CompressedBlocks.CRATE_ITEMS) {
            Item item = crate.asItem();
            String name = ResourceUtils.removeNamespace(item.getDescriptionId());
            String translation = ResourceUtils.capitalizeWords(name.replace("_", " "));
            translation = ResourceUtils.pluralize(translation);
            ChatFormatting color = ResourceUtils.getRarityColor(ResourceUtils.getCrateLevel(name));

            String finalTranslation = translation.replace("Crated", "Crate of");

            builder.add("item.compressedblocks." + name, color.toString() + finalTranslation);

        }

        /*
         * Add translations for all crate blocks in the Constants class.
         * The translation key is generated based on the crate block name, and the translation value is generated based on the crate block name and compression level.
         */
        for (Block crate : CompressedBlocks.CRATE_BLOCKS) {
            String name = ResourceUtils.removeNamespace(crate.getDescriptionId());
            String translation = ResourceUtils.capitalizeWords(name.replace("_", " "));
            translation = ResourceUtils.pluralize(translation);
            ChatFormatting color = ResourceUtils.getRarityColor(ResourceUtils.getCrateLevel(name));

            String finalTranslation = translation.replace("Crated", "Crate of");
            builder.add("item.compressedblocks." + name, color.toString() + finalTranslation);
        }

        /*
         * Add translations for all compression entries in the CompressionCatalog class.
         * The translation key is generated based on the compression entry name, and the translation value is generated based on the compression entry name.
         */
        for (CompressionEntry entry : CompressionCatalog.BLOCK_ENTRIES) {
            if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) continue;
            String name = entry.id();
            String translation = ResourceUtils.capitalizeWords(name.replace("_", " "));
            builder.add("compressedblocks.configuration." + name, translation);
        }

        /*
         * Add translations for all crate entries in the CompressionCatalog class.
         * The translation key is generated based on the crate entry name, and the translation value is generated based on the crate entry name.
         */
        for (CompressionEntry entry : CompressionCatalog.CRATE_ENTRIES) {
            if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) continue;
            String name = entry.id();
            String translation = ResourceUtils.capitalizeWords(name.replace("_", " "));
            builder.add("compressedblocks.configuration." + name, translation);
        }
    }
}
