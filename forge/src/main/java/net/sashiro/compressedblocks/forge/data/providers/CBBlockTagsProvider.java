package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.forge.data.CBTags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;


public class CBBlockTagsProvider extends BlockTagsProvider {

    public CBBlockTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider holder) {
        for (RegistryObject<Block> registryObject : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_01).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_01).add(block);
            }
            if (name.startsWith("double_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_02).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_02).add(block);
            }
            if (name.startsWith("triple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_03).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_03).add(block);
            }
            if (name.startsWith("quadruple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_04).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_04).add(block);
            }
            if (name.startsWith("quintuple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_05).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_05).add(block);
            }
            if (name.startsWith("sextuple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_06).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_06).add(block);
            }
            if (name.startsWith("septuple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_07).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_07).add(block);
            }
            if (name.startsWith("octuple_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_08).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_08).add(block);
            }
            if (name.startsWith("mega_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_09).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_09).add(block);
            }
            if (name.startsWith("giga_crated_")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_10).add(block);
                tag(CBTags.CompressionBlockTags.CRATE_X_10).add(block);
            }
        }
        for (RegistryObject<Block> registryObject : CompressedBlocksForge.BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("c0")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_01).add(block);
                tag(CBTags.C0).add(block);
            }
            if (name.startsWith("c1")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_02).add(block);
                tag(CBTags.C1).add(block);
            }
            if (name.startsWith("c2")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_03).add(block);
                tag(CBTags.C2).add(block);
            }
            if (name.startsWith("c3")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_04).add(block);
                tag(CBTags.C3).add(block);
            }
            if (name.startsWith("c4")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_05).add(block);
                tag(CBTags.C4).add(block);
            }
            if (name.startsWith("c5")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_06).add(block);
                tag(CBTags.C5).add(block);
            }
            if (name.startsWith("c6")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_07).add(block);
                tag(CBTags.C6).add(block);
            }
            if (name.startsWith("c7")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_08).add(block);
                tag(CBTags.C7).add(block);
            }
            if (name.startsWith("c8")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_09).add(block);
                tag(CBTags.C8).add(block);
            }
            if (name.startsWith("c9")) {
                tag(CBTags.CompressionBlockTags.COMPRESSION_X_10).add(block);
                tag(CBTags.C9).add(block);
            }

            //noinspection StatementWithEmptyBody
            if (Stream.of("slime", "honey", "vine", "vein", "lichen").anyMatch(name::contains)) /* do nothing */
                ;
            else if (name.contains("dirt")
                    || (name.contains("sand")
                    && !name.contains("sandstone"))
                    || name.contains("gravel")
                    || name.contains("clay")
            ) {
                tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
            } else if (Stream.of("hay", "wart", "kelp", "moss", "sculk").anyMatch(name::contains)) {
                tag(BlockTags.MINEABLE_WITH_HOE).add(block);
            } else if (Stream.of("wood", "plank", "log").anyMatch(name::contains)) {
                tag(BlockTags.MINEABLE_WITH_AXE).add(block);
            } else {
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
            }
        }
    }
}
