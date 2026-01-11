package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;

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
                String name = block.getDescriptionId().replace("block.compressedblocks.", "");

                if (name.startsWith("c0")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_01);
                }
                if (name.startsWith("c1")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_02);
                }
                if (name.startsWith("c2")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_03);
                }
                if (name.startsWith("c3")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_04);
                }
                if (name.startsWith("c4")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_05);
                }
                if (name.startsWith("c5")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_06);
                }
                if (name.startsWith("c6")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_07);
                }
                if (name.startsWith("c7")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_08);
                }
                if (name.startsWith("c8")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_09);
                }
                if (name.startsWith("c9")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_10);
                }

                if (Stream.of("dirt", "sand", "gravel", "clay", "snow").anyMatch(name::contains) && !name.contains("sandstone")) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_SHOVEL);
                } else if (Stream.of("hay", "wart", "kelp", "moss", "sculk").anyMatch(name::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_HOE);
                } else if (Stream.of("wood", "plank", "log").anyMatch(name::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_AXE);
                } else if (Stream.of("slime", "honey", "vine", "vein", "lichen", "glass", "tnt").noneMatch(name::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_PICKAXE);
                }
            }

            for (Block crate : Constants.CRATES) {
                String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
                addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);

                if (name.startsWith("crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_01);

                }
                if (name.startsWith("double_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_02);

                }
                if (name.startsWith("triple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_03);

                }
                if (name.startsWith("quadruple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_04);

                }
                if (name.startsWith("quintuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_05);

                }
                if (name.startsWith("sextuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_06);

                }
                if (name.startsWith("septuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_07);

                }
                if (name.startsWith("octuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_08);

                }
                if (name.startsWith("mega_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_09);
                }
                if (name.startsWith("giga_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.CRATE_X_10);
                }
            }
        }

        private void addBlockTag(Block block, TagKey<Block> tag) {
            var builder = this.valueLookupBuilder(tag);
            builder.add(block);
        }
    }

    public static class CBItemTagsProvider extends FabricTagProvider.ItemTagProvider {

        public CBItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            for (Block block : Constants.BLOCKS) {
                String name = block.getDescriptionId().replace("block.compressedblocks.", "");
                Item blockItem = block.asItem();

                if (name.startsWith("c0")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_01);
                }
                if (name.startsWith("c1")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_02);
                }
                if (name.startsWith("c2")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_03);
                }
                if (name.startsWith("c3")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_04);
                }
                if (name.startsWith("c4")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_05);
                }
                if (name.startsWith("c5")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_06);
                }
                if (name.startsWith("c6")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_07);
                }
                if (name.startsWith("c7")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_08);
                }
                if (name.startsWith("c8")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_09);
                }
                if (name.startsWith("c9")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_10);
                }
            }

            for (Block crate : Constants.CRATES) {
                String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
                Item crateItem = crate.asItem();

                if (name.startsWith("crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_01);
                }
                if (name.startsWith("double_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_02);
                }
                if (name.startsWith("triple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_03);
                }
                if (name.startsWith("quadruple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_04);
                }
                if (name.startsWith("quintuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_05);
                }
                if (name.startsWith("sextuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_06);
                }
                if (name.startsWith("septuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_07);
                }
                if (name.startsWith("octuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_08);
                }
                if (name.startsWith("mega_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_09);
                }
                if (name.startsWith("giga_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_10);
                }
            }
        }

        private void addItemTag(Item item, TagKey<Item> tag) {
            var builder = this.valueLookupBuilder(tag);
            builder.add(item);
        }
    }
}
