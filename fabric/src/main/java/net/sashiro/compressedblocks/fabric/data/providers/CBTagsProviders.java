package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;
import net.sashiro.compressedblocks.util.ResourceUtils;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CBTagsProviders {
    public static class CBBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

        public CBBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.@NonNull Provider provider) {
            for (Block block : Constants.BLOCKS) {
                String compressedBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(compressedBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                if (compressedBlockName.startsWith("c0")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_01);
                }
                if (compressedBlockName.startsWith("c1")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_02);
                }
                if (compressedBlockName.startsWith("c2")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_03);
                }
                if (compressedBlockName.startsWith("c3")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_04);
                }
                if (compressedBlockName.startsWith("c4")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_05);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c5")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_06);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c6")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_07);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c7")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_08);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c8")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_09);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c9")) {
                    addBlockTag(block, CBTags.CompressionBlockTags.COMPRESSION_X_10);
                    addBlockTag(block, BlockTags.WITHER_IMMUNE);
                }

                if (Stream.of("dirt", "sand", "gravel", "clay", "snow").anyMatch(compressedBlockName::contains) && !compressedBlockName.contains("sandstone")) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_SHOVEL);
                } else if (Stream.of("hay", "wart", "kelp", "moss", "sculk").anyMatch(compressedBlockName::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_HOE);
                } else if (Stream.of("wood", "plank", "log").anyMatch(compressedBlockName::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_AXE);
                } else if (Stream.of("slime", "honey", "vine", "vein", "lichen", "glass", "tnt").noneMatch(compressedBlockName::contains)) {
                    addBlockTag(block, BlockTags.MINEABLE_WITH_PICKAXE);
                }
            }

            for (Block crate : Constants.CRATE_BLOCKS) {
                String crateBlockName = ResourceUtils.removeNamespace(crate.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(crateBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                addBlockTag(crate, BlockTags.MINEABLE_WITH_PICKAXE);

                if (crateBlockName.startsWith("crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_01);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("double_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_02);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("triple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_03);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("quadruple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_04);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("quintuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_05);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("sextuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_06);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("septuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_07);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("octuple_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_08);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("mega_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_09);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("giga_crated_")) {
                    addBlockTag(crate, CBTags.CompressionBlockTags.COMPRESSION_X_10);
                    addBlockTag(crate, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crate, BlockTags.WITHER_IMMUNE);
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
        protected void addTags(HolderLookup.@NonNull Provider provider) {
            for (Block block : Constants.BLOCKS) {
                String compressedBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(compressedBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                Item blockItem = block.asItem();

                if (compressedBlockName.startsWith("c0")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_01);
                }
                if (compressedBlockName.startsWith("c1")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_02);
                }
                if (compressedBlockName.startsWith("c2")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_03);
                }
                if (compressedBlockName.startsWith("c3")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_04);
                }
                if (compressedBlockName.startsWith("c4")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_05);
                }
                if (compressedBlockName.startsWith("c5")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_06);
                }
                if (compressedBlockName.startsWith("c6")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_07);
                }
                if (compressedBlockName.startsWith("c7")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_08);
                }
                if (compressedBlockName.startsWith("c8")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_09);
                }
                if (compressedBlockName.startsWith("c9")) {
                    addItemTag(blockItem, CBTags.CompressionItemTags.COMPRESSION_X_10);
                }
            }

            for (Block crate : Constants.CRATE_BLOCKS) {
                String crateBlockName = ResourceUtils.removeNamespace(crate.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(crateBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                Item crateItem = crate.asItem();

                if (crateBlockName.startsWith("crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_01);
                }
                if (crateBlockName.startsWith("double_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_02);
                }
                if (crateBlockName.startsWith("triple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_03);
                }
                if (crateBlockName.startsWith("quadruple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_04);
                }
                if (crateBlockName.startsWith("quintuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_05);
                }
                if (crateBlockName.startsWith("sextuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_06);
                }
                if (crateBlockName.startsWith("septuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_07);
                }
                if (crateBlockName.startsWith("octuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_08);
                }
                if (crateBlockName.startsWith("mega_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_09);
                }
                if (crateBlockName.startsWith("giga_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_10);
                }
            }

            for (Item crateItem : Constants.CRATE_ITEMS) {
                String crateItemName = ResourceUtils.removeNamespace(crateItem.getDescriptionId());
                String vanillaName = ResourceUtils.removeCrateName(crateItemName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                if (crateItemName.startsWith("crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_01);
                }
                if (crateItemName.startsWith("double_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_02);
                }
                if (crateItemName.startsWith("triple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_03);
                }
                if (crateItemName.startsWith("quadruple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_04);
                }
                if (crateItemName.startsWith("quintuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_05);
                }
                if (crateItemName.startsWith("sextuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_06);
                }
                if (crateItemName.startsWith("septuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_07);
                }
                if (crateItemName.startsWith("octuple_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_08);
                }
                if (crateItemName.startsWith("mega_crated_")) {
                    addItemTag(crateItem, CBTags.CompressionItemTags.CRATE_X_09);
                }
                if (crateItemName.startsWith("giga_crated_")) {
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
