package net.sashiro.compressedblocks.forge.data.providers;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static net.sashiro.compressedblocks.forge.CompressedBlocksForge.BLOCKS;
import static net.sashiro.compressedblocks.forge.CompressedBlocksForge.CRATE_BLOCKS;

public class CBLootTableProvider extends LootTableProvider {
    public CBLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }


    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressedLootTable::new, LootContextParamSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationContext) {
        map.forEach((id, lootTable) -> LootTables.validate(validationContext, id, lootTable));
    }

    public static class CompressedLootTable extends BlockLoot {
        @Override
        protected void addTables() {
            for (RegistryObject<Block> block : BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
            for (RegistryObject<Block> block : CRATE_BLOCKS.getEntries()) {
                dropSelf(block.get());
            }
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            List<Block> block = new ArrayList<>();
            block.addAll(BLOCKS.getEntries().stream().map(RegistryObject::get).toList());
            block.addAll(CRATE_BLOCKS.getEntries().stream().map(RegistryObject::get).toList());

            return block;
        }
    }
}