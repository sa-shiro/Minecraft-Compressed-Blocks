package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.util.CommonUtils;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("removal")
public class CBItemModelProvider extends ItemModelProvider {

    // fixme: Item Model Generation is different in 1.21.4, Block Item Models are stored inside assets/items instead of assets/models/item
    public CBItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        for (RegistryObject<Block> block : CompressedBlocksForge.BLOCKS.getEntries()) {
            // exclude manually added resources
            if (CommonUtils.isBlock(block.get().getDescriptionId())) continue;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }

        for (RegistryObject<Block> block : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
    }
}