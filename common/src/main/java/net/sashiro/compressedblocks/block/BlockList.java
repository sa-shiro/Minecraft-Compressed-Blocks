package net.sashiro.compressedblocks.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.sashiro.compressedblocks.platform.Services;
import net.sashiro.compressedblocks.util.CommonUtils;
import net.sashiro.compressedblocks.util.CompressionCatalog;
import net.sashiro.compressedblocks.util.CompressionEntry;

import java.util.ArrayList;
import java.util.Collections;

import static net.sashiro.compressedblocks.Constants.*;

/**
 * The BlockList class is responsible for creating and managing a list of blocks based on the entries in the CompressionCatalog.
 * It checks if each block is enabled and creates the appropriate block type (normal, rotational, or glass).
 * The created blocks are added to the BLOCK_LIST.
 */
public class BlockList {
    public static final ArrayList<Block> BLOCK_LIST = new ArrayList<>();
    public static CBBlock STONE = null;

    /**
     * Creates the block list based on the entries in the CompressionCatalog.
     * It checks if each block is enabled and creates the appropriate block type (normal, rotational, or glass).
     * The created blocks are added to the BLOCK_LIST.
     */
    public static void createBlockList() {
        for (CompressionEntry entry : CompressionCatalog.BLOCK_ENTRIES) {
            if (!Services.PLATFORM.isBlockEnabled(entry.id())) continue;

            CompressionEntry entry1 = new CompressionEntry(
                    entry.id(),
                    entry.kind(),
                    Services.PLATFORM.getHardnessResistanceMultiplier(entry.id()),
                    Services.PLATFORM.getMaxCompressionLevel(entry.id()),
                    entry.hasSmallerCompression(), // todo: make it configurable? not sure
                    Services.PLATFORM.isBlockEnabled(entry.id())); // actually redundant, because we already checked if the block is enabled so we can just set it to true ;)

            if (entry1.kind() == CompressionEntry.Kind.BLOCK) {
                CBBlock[] blocks = createBlocks(entry1);
                Collections.addAll(BLOCK_LIST, blocks);
                if (entry1.id().equalsIgnoreCase("STONE")) {
                    STONE = blocks[0];
                }
            } else if (entry1.kind() == CompressionEntry.Kind.ROT_BLOCK) {
                CBRotationalBlock[] rotBlocks = createRotationalBlocks(entry1);
                Collections.addAll(BLOCK_LIST, rotBlocks);
            } else if (entry1.kind() == CompressionEntry.Kind.GLASS_BLOCK) {
                CBBlock[] glassBlocks = createGlassBlocks(entry1);
                Collections.addAll(BLOCK_LIST, glassBlocks);
            }
        }
    }

    /**
     * Creates an array of CBBlock instances based on the provided CompressionEntry.
     * The number of blocks created is determined by the maximum compression level specified in the entry.
     * Each block's hardness and resistance are calculated based on predefined values and a multiplier from the entry.
     *
     * @param entry The CompressionEntry containing information about the block type and properties.
     * @return An array of CBBlock instances.
     */
    public static CBBlock[] createBlocks(CompressionEntry entry) {
        int maxBlockCompressionLevel = Math.min(entry.maxCompressionLevel(), MAX_COMPRESSION_LEVEL);

        CBBlock[] result = new CBBlock[maxBlockCompressionLevel];

        for (int i = 0; i < maxBlockCompressionLevel; i++) {
            float baseHardness = HARDNESS[i];
            float baseResistance = RESISTANCE[i];

            float factor = entry.hardnessResistanceMultiplier();

            float blockHardness = baseHardness * factor;
            float blockResistance = baseResistance * factor;

            result[i] = new CBBlock(CommonUtils.createBlockId("c" + i + "_" + entry.id()), BlockBehaviour.Properties.of().strength(blockHardness, blockResistance), i, entry.hasSmallerCompression());
        }
        return result;
    }

    /**
     * Creates an array of CBRotationalBlock instances based on the provided CompressionEntry.
     * The number of blocks created is determined by the maximum compression level specified in the entry.
     * Each block's hardness and resistance are calculated based on predefined values and a multiplier from the entry.
     *
     * @param entry The CompressionEntry containing information about the block type and properties.
     * @return An array of CBRotationalBlock instances.
     */
    public static CBRotationalBlock[] createRotationalBlocks(CompressionEntry entry) {
        int maxBlockCompressionLevel = Math.min(entry.maxCompressionLevel(), MAX_COMPRESSION_LEVEL);

        CBRotationalBlock[] result = new CBRotationalBlock[maxBlockCompressionLevel];
        for (int i = 0; i < maxBlockCompressionLevel; i++) {
            float blockHardness = HARDNESS[i] * entry.hardnessResistanceMultiplier();
            float blockResistance = RESISTANCE[i] * entry.hardnessResistanceMultiplier();
            result[i] = new CBRotationalBlock(BlockBehaviour.Properties.of().strength(blockHardness, blockResistance), i, CommonUtils.createBlockId("c" + i + "_" + entry.id()));
        }
        return result;
    }

    /**
     * Creates an array of CBBlock instances with glass properties based on the provided CompressionEntry.
     * The number of blocks created is determined by the maximum compression level specified in the entry.
     * Each block's hardness and resistance are calculated based on predefined values and a multiplier from the entry.
     *
     * @param entry The CompressionEntry containing information about the block type and properties.
     * @return An array of CBBlock instances with glass properties.
     */
    public static CBBlock[] createGlassBlocks(CompressionEntry entry) {
        int maxBlockCompressionLevel = Math.min(entry.maxCompressionLevel(), MAX_COMPRESSION_LEVEL);

        CBBlock[] result = new CBBlock[maxBlockCompressionLevel];
        for (int i = 0; i < maxBlockCompressionLevel; i++) {
            float blockHardness = HARDNESS[i] * entry.hardnessResistanceMultiplier();
            float blockResistance = RESISTANCE[i] * entry.hardnessResistanceMultiplier();

            result[i] = new CBBlock(CommonUtils.createBlockId("c" + i + "_" + entry.id()), BlockBehaviour.Properties.of().noOcclusion().strength(blockHardness, blockResistance), i, false);
        }
        return result;
    }
}