package net.sashiro.compressedblocks.data.providers;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.CRATE_BLOCKS;

@SuppressWarnings("NullableProblems")
public class CBLootTableProvider extends LootTableProvider {
    public CBLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }
    
    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(CompressedLootTable::new, LootParameterSets.BLOCK)
        );
    }
    
    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((id, lootTable) -> LootTableManager.validate(validationtracker, id, lootTable));
    }
    
    @SuppressWarnings("NullableProblems")
    public static class CompressedLootTable extends BlockLootTables {
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
        protected Iterable<Block> getKnownBlocks() {
            List<Block> block = new ArrayList<>();
            block.addAll(BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList()));
            block.addAll(CRATE_BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList()));
            
            return block;
        }
    }
}