package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

public class CBItemModelProvider extends ItemModelProvider {
    public CBItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, CompressedBlocks.MOD_ID, existingFileHelper);
    }
    
    @Override
    protected void registerModels() {
        ModelFile.ExistingModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        
        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            if (block.get().getDescriptionId().contains("honey_block") || block.get().getDescriptionId().contains("basalt")) continue;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
        
        for (RegistryObject<Block> block : CBRegistryEvent.CRATE_BLOCKS.getEntries()) {
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
    }
}