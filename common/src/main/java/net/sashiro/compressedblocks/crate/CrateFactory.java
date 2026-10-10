package net.sashiro.compressedblocks.crate;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.Services;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;

import java.util.ArrayList;
import java.util.Collections;

import static net.sashiro.compressedblocks.Constants.MAX_CRATE_COMPRESSION_LEVEL;

/**
 * The CrateFactory class is responsible for creating and managing a list of crate items and blocks based on the entries in the CompressionCatalog.
 * It checks if each crate item or block is enabled and creates the appropriate type (crate item or crate block).
 * The created crate items and blocks are added to their respective lists.
 */
public class CrateFactory {
    public static final ArrayList<Item> CRATE_ITEM_LIST = new ArrayList<>();
    public static final ArrayList<Block> CRATE_BLOCK_LIST = new ArrayList<>();
    public static CrateItem GOLDEN_APPLE = null;
    private static boolean finished = false;

    /**
     * Creates the crate item and block lists based on the entries in the CompressionCatalog.
     * It checks if each crate item or block is enabled and creates the appropriate type (crate item or crate block).
     * The created crate items and blocks are added to their respective lists.
     */
    public static void createCrateList() {
        // If the crate lists have already been created, return early to avoid duplicate entries.
        if (finished) return;

        for (CompressionEntry entry : CompressionCatalog.CRATE_ENTRIES) {
            if (!Services.PLATFORM.isBlockEnabled(entry.id())) continue;
            // check what minecraft version we are on first
            if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) continue;

            CompressionEntry configuredEntry = new CompressionEntry(
                    entry.id(),
                    entry.kind(),
                    Services.PLATFORM.getHardnessResistanceMultiplier(entry.id()),
                    Services.PLATFORM.getMaxCompressionLevel(entry.id()),
                    entry.hasSmallerCompression(), // todo: make it configurable? not sure
                    Services.PLATFORM.isBlockEnabled(entry.id()), "null"); // actually redundant, because we already checked if the block is enabled so we can just set it to true ;)

            if (configuredEntry.kind() == CompressionEntry.Kind.CRATE_ITEM) {
                CrateItem[] crateItems = createItems(configuredEntry);
                Collections.addAll(CRATE_ITEM_LIST, crateItems);
                if (configuredEntry.id().equalsIgnoreCase("GOLDEN_APPLE")) {
                    GOLDEN_APPLE = crateItems[0];
                }
            } else if (configuredEntry.kind() == CompressionEntry.Kind.CRATE_BLOCK) {
                CrateBlock[] crateBlocks = createBlocks(configuredEntry);
                Collections.addAll(CRATE_BLOCK_LIST, crateBlocks);
            }
        }
        finished = true;
    }

    /**
     * Creates an array of CrateItem instances based on the provided CompressionEntry.
     * The number of crate items created is determined by the maximum compression level specified in the entry.
     *
     * @param entry The CompressionEntry containing information about the crate item type and properties.
     * @return An array of CrateItem instances.
     */
    private static CrateItem[] createItems(CompressionEntry entry) {
        int maxCrateCompressionLevel = Math.min(entry.maxCompressionLevel(), MAX_CRATE_COMPRESSION_LEVEL);

        CrateItem[] result = new CrateItem[maxCrateCompressionLevel];

        for (int i = 0; i < maxCrateCompressionLevel; i++) {
            ResourceKey<Item> itemId = ResourceUtils.createItemId(ResourceUtils.getCratePrefix(i) + entry.id());
            Item.Properties properties = new Item.Properties().stacksTo(64);

            result[i] = new CrateItem(itemId, properties, i, entry.hasSmallerCompression());
        }
        return result;
    }

    /**
     * Creates an array of CrateBlock instances based on the provided CompressionEntry.
     * The number of crate blocks created is determined by the maximum compression level specified in the entry.
     *
     * @param entry The CompressionEntry containing information about the crate block type and properties.
     * @return An array of CrateBlock instances.
     */
    private static CrateBlock[] createBlocks(CompressionEntry entry) {
        int maxCrateCompressionLevel = Math.min(entry.maxCompressionLevel(), MAX_CRATE_COMPRESSION_LEVEL);

        CrateBlock[] result = new CrateBlock[maxCrateCompressionLevel];

        for (int i = 0; i < maxCrateCompressionLevel; i++) {
            result[i] = new CrateBlock(ResourceUtils.createBlockId(ResourceUtils.getCratePrefix(i) + entry.id()), BlockBehaviour.Properties.of(), i, entry.hasSmallerCompression());
        }
        return result;
    }
}
