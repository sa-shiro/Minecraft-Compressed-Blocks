package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;
import net.sashiro.compressedblocks.util.ResourceUtils;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CBTagsProviders {
    public static class CBBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

        public CBBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            for (Block block : Constants.BLOCKS) {
                String name = ResourceUtils.removeNamespace(block.getDescriptionId());
                if (name.startsWith("c0")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_01).add(block);
                }
                if (name.startsWith("c1")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_02).add(block);
                }
                if (name.startsWith("c2")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_03).add(block);
                }
                if (name.startsWith("c3")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_04).add(block);
                }
                if (name.startsWith("c4")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_05).add(block);
                }
                if (name.startsWith("c5")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_06).add(block);
                }
                if (name.startsWith("c6")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_07).add(block);
                }
                if (name.startsWith("c7")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_08).add(block);
                }
                if (name.startsWith("c8")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_09).add(block);
                }
                if (name.startsWith("c9")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_10).add(block);
                }

                if (Stream.of("dirt", "sand", "gravel", "clay", "snow").anyMatch(name::contains) && !name.contains("sandstone")) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL).add(block);
                } else if (Stream.of("hay", "wart", "kelp", "moss", "sculk").anyMatch(name::contains)) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE).add(block);
                } else if (Stream.of("wood", "plank", "log").anyMatch(name::contains)) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(block);
                } else if (Stream.of("slime", "honey", "vine", "vein", "lichen", "glass", "tnt").noneMatch(name::contains)) {
                    getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(block);
                }
            }

            for (Block crate : Constants.CRATE_BLOCKS) {
                String name = ResourceUtils.removeNamespace(crate.getDescriptionId());
                getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(crate);

                if (name.startsWith("crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_01).add(crate);
                }
                if (name.startsWith("double_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_02).add(crate);
                }
                if (name.startsWith("triple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_03).add(crate);
                }
                if (name.startsWith("quadruple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_04).add(crate);
                }
                if (name.startsWith("quintuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_05).add(crate);
                }
                if (name.startsWith("sextuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_06).add(crate);
                }
                if (name.startsWith("septuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_07).add(crate);
                }
                if (name.startsWith("octuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_08).add(crate);
                }
                if (name.startsWith("mega_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_09).add(crate);
                }
                if (name.startsWith("giga_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionBlockTags.COMPRESSION_X_10).add(crate);
                }
            }
        }
    }

    public static class CBItemTagsProvider extends FabricTagProvider.ItemTagProvider {

        public CBItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            for (Block block : Constants.BLOCKS) {
                String name = ResourceUtils.removeNamespace(block.getDescriptionId());
                Item blockItem = block.asItem();

                if (name.startsWith("c0")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_01).add(blockItem);
                }
                if (name.startsWith("c1")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_02).add(blockItem);
                }
                if (name.startsWith("c2")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_03).add(blockItem);
                }
                if (name.startsWith("c3")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_04).add(blockItem);
                }
                if (name.startsWith("c4")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_05).add(blockItem);
                }
                if (name.startsWith("c5")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_06).add(blockItem);
                }
                if (name.startsWith("c6")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_07).add(blockItem);
                }
                if (name.startsWith("c7")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_08).add(blockItem);
                }
                if (name.startsWith("c8")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_09).add(blockItem);
                }
                if (name.startsWith("c9")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.COMPRESSION_X_10).add(blockItem);
                }
            }

            for (Block crate : Constants.CRATE_BLOCKS) {
                String name = ResourceUtils.removeNamespace(crate.getDescriptionId());
                Item crateItem = crate.asItem();

                if (name.startsWith("crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_01).add(crateItem);
                }
                if (name.startsWith("double_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_02).add(crateItem);
                }
                if (name.startsWith("triple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_03).add(crateItem);
                }
                if (name.startsWith("quadruple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_04).add(crateItem);
                }
                if (name.startsWith("quintuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_05).add(crateItem);
                }
                if (name.startsWith("sextuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_06).add(crateItem);
                }
                if (name.startsWith("septuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_07).add(crateItem);
                }
                if (name.startsWith("octuple_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_08).add(crateItem);
                }
                if (name.startsWith("mega_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_09).add(crateItem);
                }
                if (name.startsWith("giga_crated_")) {
                    getOrCreateTagBuilder(CBTags.CompressionItemTags.CRATE_X_10).add(crateItem);
                }
            }
        }
    }
}
