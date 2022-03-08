package net.sashiro.compressedblocks.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.ModRegistryEvent;

import javax.annotation.Nullable;


public class GenTagProvider extends BlockTagsProvider {

    public GenTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {

        for (RegistryObject<Block> registryObject : ModRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            Block block = registryObject.get();
            String name = block.getRegistryName().toString();

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
    }
}
