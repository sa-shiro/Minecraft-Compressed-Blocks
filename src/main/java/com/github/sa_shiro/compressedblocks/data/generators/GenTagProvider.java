package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

import javax.annotation.Nullable;


public class GenTagProvider extends BlockTagsProvider {

    public GenTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {

        for (RegistryObject<Block> registryObject : ModRegistryObjects.BLOCK_REGISTRY) {
            assert false;
            Block block = registryObject.get();
            String name = block.getRegistryName().toString();

            if (name.contains("wool") || name.contains("slime") || name.contains("hay") || name.contains("glass")) /* do nothing */
                ;
            else if (
                    name.contains("dirt") ||
                            name.contains("grass_block") ||
                            (name.contains("sand") && !name.contains("sandstone")) ||
                            name.contains("gravel") ||
                            name.contains("flesh") ||
                            name.contains("clay") ||
                            name.contains("flint") ||
                            name.contains("gunpowder")
            ) {
                tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (name.contains("log") || name.contains("stem") || name.contains("planks")) {
                tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            } else {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }
    }
}
