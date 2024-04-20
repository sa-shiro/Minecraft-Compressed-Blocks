package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.sashiro.compressedblocks.CompressedBlocksNeoForge;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBItemModelProvider extends ItemModelProvider {
    private final GenUtils utils = new GenUtils();

    public CBItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        for (DeferredHolder<Block, ? extends Block> block : CompressedBlocksNeoForge.BLOCKS.getEntries()) {
            // exclude manually added resources
            if (utils.isBlock(block)) continue;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }

        for (DeferredHolder<Block, ? extends Block> block : CompressedBlocksNeoForge.CRATE_BLOCKS.getEntries()) {
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
    }
}