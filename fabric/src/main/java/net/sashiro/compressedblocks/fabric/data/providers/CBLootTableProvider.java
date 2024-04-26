package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;

@SuppressWarnings("unused")
public class CBLootTableProvider extends FabricBlockLootTableProvider {
    public CBLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
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