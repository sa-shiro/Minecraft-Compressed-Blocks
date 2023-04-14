package net.sashiro.compressedblocks.data.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.ModRegistryEvent;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;


public class GenTagProvider extends BlockTagsProvider {

    public GenTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider holder) {
        for (RegistryObject<Block> registryObject : ModRegistryEvent.BLOCKS.getEntries()) {
            assert false;
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
    }
}
