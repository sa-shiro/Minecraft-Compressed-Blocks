package net.sashiro.compressedblocks.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.data.CBTags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.CRATE_BLOCKS;


public class CBBlockTagsProvider extends BlockTagsProvider {
    
    public CBBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }
    
    @Override
    protected void addTags(HolderLookup.@NotNull Provider holder) {
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("c0")) {
                tag(CBTags.SINGLE).add(block);
                tag(CBTags.C0).add(block);
            }
            if (name.startsWith("c1")) {
                tag(CBTags.DOUBLE).add(block);
                tag(CBTags.C1).add(block);
            }
            if (name.startsWith("c2")) {
                tag(CBTags.TRIPLE).add(block);
                tag(CBTags.C2).add(block);
            }
            if (name.startsWith("c3")) {
                tag(CBTags.QUADRUPLE).add(block);
                tag(CBTags.C3).add(block);
            }
            if (name.startsWith("c4")) {
                tag(CBTags.QUINTUPLE).add(block);
                tag(CBTags.C4).add(block);
            }
            if (name.startsWith("c5")) {
                tag(CBTags.SEXTUPLE).add(block);
                tag(CBTags.C5).add(block);
            }
            if (name.startsWith("c6")) {
                tag(CBTags.SEPTUPLE).add(block);
                tag(CBTags.C6).add(block);
            }
            if (name.startsWith("c7")) {
                tag(CBTags.OCTUPLE).add(block);
                tag(CBTags.C7).add(block);
            }
            if (name.startsWith("c8")) {
                tag(CBTags.MEGA).add(block);
                tag(CBTags.C8).add(block);
            }
            if (name.startsWith("c9")) {
                tag(CBTags.GIGA).add(block);
                tag(CBTags.C9).add(block);
            }
            
            //noinspection StatementWithEmptyBody
            if (name.contains("slime") || name.equals("honey")) /* do nothing */
                ;
            else if (name.contains("dirt")
                    || (name.contains("sand")
                    && !name.contains("sandstone"))
                    || name.contains("gravel")
                    || name.contains("clay")
            ) {
                tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (name.contains("hay")
                    || name.contains("wart")
                    || name.contains("kelp")
                    || name.contains("moss")
                    || name.contains("sculk")
            ) {
                tag(BlockTags.MINEABLE_WITH_HOE).add(block);
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
