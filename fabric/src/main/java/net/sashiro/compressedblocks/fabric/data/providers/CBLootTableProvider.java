package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.util.ResourceUtils;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CBLootTableProvider extends FabricBlockLootSubProvider {

    public CBLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : CompressedBlocks.COMPRESSED_BLOCKS) {
            String compressedBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
            String blockName = ResourceUtils.removeCompressionName(compressedBlockName);
            if (!CBConfig.CONFIG.isEnabled(blockName)) continue;
            dropSelf(block);
        }

        for (Block block : CompressedBlocks.CRATE_BLOCKS) {
            String crateBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
            String blockName = ResourceUtils.removeCompressionName(crateBlockName);
            if (!CBConfig.CONFIG.isEnabled(blockName)) continue;
            dropSelf(block);
        }
    }
}