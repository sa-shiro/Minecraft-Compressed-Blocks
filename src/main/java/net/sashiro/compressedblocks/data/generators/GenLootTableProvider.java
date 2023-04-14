package net.sashiro.compressedblocks.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.ModRegistryEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenLootTableProvider {

    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(CompressedBlocksLootTable::new, LootContextParamSets.BLOCK)));
    }

    public static class CompressedBlocksLootTable extends BlockLootSubProvider {
        protected CompressedBlocksLootTable() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            for (RegistryObject<Block> block : ModRegistryEvent.BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return ModRegistryEvent.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }
    }
}