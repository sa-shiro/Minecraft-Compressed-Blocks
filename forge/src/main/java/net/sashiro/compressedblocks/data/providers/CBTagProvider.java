package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.CRATE_BLOCKS;


public class CBTagProvider extends BlockTagsProvider {
    
    public CBTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }
    
    @Override
    protected void addTags() {
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId();
            
            //noinspection StatementWithEmptyBody
            if (name.contains("slime")) /* do nothing */
                ;
            else if (
                    name.contains("dirt") ||
                            (name.contains("sand") && !name.contains("sandstone")) ||
                            name.contains("gravel") ||
                            name.contains("clay")
            ) {
                tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }
        for (RegistryObject<Block> registryObject : CRATE_BLOCKS.getEntries()) {
            Block block = registryObject.get();
            
            tag(BlockTags.MINEABLE_WITH_AXE).add(block);
        }
    }
}
