package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBItemModelProvider extends ItemModelProvider {
    public CBItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MOD_ID, existingFileHelper);
    }
    
    @Override
    protected void registerModels() {
        
        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            if (block.get().getDescriptionId().contains("honey_block") || block.get().getDescriptionId().contains("basalt"))
                continue;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
        
        for (RegistryObject<Block> block : CBRegistryEvent.CRATE_BLOCKS.getEntries()) {
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }
    }
}