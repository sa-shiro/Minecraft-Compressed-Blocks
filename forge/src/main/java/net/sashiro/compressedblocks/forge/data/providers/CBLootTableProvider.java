package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
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
            for (RegistryObject<Block> block : CompressedBlocksForge.BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
            for (RegistryObject<Block> block : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            List<Block> block = new ArrayList<>();
            block.addAll(CompressedBlocksForge.BLOCKS.getEntries().stream().map(RegistryObject::get).toList());
            block.addAll(CompressedBlocksForge.CRATE_BLOCKS.getEntries().stream().map(RegistryObject::get).toList());

            return block;
        }
    }
}