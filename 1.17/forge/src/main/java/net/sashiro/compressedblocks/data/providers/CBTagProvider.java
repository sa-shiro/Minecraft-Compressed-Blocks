package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

import javax.annotation.Nullable;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.CRATE_BLOCKS;

public class CBTagProvider extends BlockTagsProvider {
    
    public CBTagProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }
    
    @Override
    protected void addTags() {
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            assert false;
            Block block = registryObject.get();
            String name = block.getRegistryName().toString();
            
            if (name.contains("slime") || name.contains("honey")) /* do nothing */
                ;
            else if (
                    name.contains("dirt")
                            || (name.contains("sand") && !name.contains("sandstone"))
                            || name.contains("gravel")
                            || name.contains("clay")
            ) {
                tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (
                    name.contains("log")
                            || name.contains("planks")
                            || name.contains("wood")
            ) {
                tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            } else {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }
        
        for (RegistryObject<Block> registryObject : CRATE_BLOCKS.getEntries()) {
            assert false;
            Block block = registryObject.get();
            tag(BlockTags.MINEABLE_WITH_AXE).add(block);
        }
    }
}