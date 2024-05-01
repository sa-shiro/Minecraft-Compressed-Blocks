package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CBLootTableProvider extends FabricBlockLootTableProvider {

    public CBLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : Constants.BLOCKS) {
            dropSelf(block);
        }
        for (Block crate : Constants.CRATES) {
            dropSelf(crate);
        }
    }
}