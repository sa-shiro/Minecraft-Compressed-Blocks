package net.sashiro.compressedblocks.neoforge.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.sashiro.compressedblocks.neoforge.CompressedBlocksNeoForge;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CBLootTableProvider {

    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        return new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(CompressedBlocksLootTable::new, LootContextParamSets.BLOCK)), completableFuture);
    }

    public static class CompressedBlocksLootTable extends BlockLootSubProvider {
        protected CompressedBlocksLootTable() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            for (DeferredHolder<Block, ? extends Block> block : CompressedBlocksNeoForge.BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
            for (DeferredHolder<Block, ? extends Block> block : CompressedBlocksNeoForge.CRATE_BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            List<Block> block = new ArrayList<>();
            block.addAll(CompressedBlocksNeoForge.BLOCKS.getEntries().stream().map(DeferredHolder::get).toList());
            block.addAll(CompressedBlocksNeoForge.CRATE_BLOCKS.getEntries().stream().map(DeferredHolder::get).toList());

            return block;
        }
    }
}