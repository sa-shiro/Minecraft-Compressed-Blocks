package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.fabric.data.CBTags;
import net.sashiro.compressedblocks.util.ResourceUtils;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CBTagsProviders {
    public static class CBBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {

        public CBBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.@NonNull Provider provider) {
            for (Block block : CompressedBlocks.COMPRESSED_BLOCKS) {
                String compressedBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(compressedBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                if (compressedBlockName.startsWith("c0")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_01);
                }
                if (compressedBlockName.startsWith("c1")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_02);
                }
                if (compressedBlockName.startsWith("c2")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_03);
                }
                if (compressedBlockName.startsWith("c3")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_04);
                }
                if (compressedBlockName.startsWith("c4")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_05);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c5")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_06);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c6")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_07);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c7")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_08);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c8")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_09);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (compressedBlockName.startsWith("c9")) {
                    addBlockTag(compressedBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_10);
                    addBlockTag(compressedBlockName, BlockTags.WITHER_IMMUNE);
                }

                if (Stream.of("dirt", "sand", "gravel", "clay", "snow").anyMatch(compressedBlockName::contains) && !compressedBlockName.contains("sandstone")) {
                    addBlockTag(compressedBlockName, BlockTags.MINEABLE_WITH_SHOVEL);
                } else if (Stream.of("hay", "wart", "kelp", "moss", "sculk").anyMatch(compressedBlockName::contains)) {
                    addBlockTag(compressedBlockName, BlockTags.MINEABLE_WITH_HOE);
                } else if (Stream.of("wood", "plank", "log").anyMatch(compressedBlockName::contains)) {
                    addBlockTag(compressedBlockName, BlockTags.MINEABLE_WITH_AXE);
                } else if (Stream.of("slime", "honey", "vine", "vein", "lichen", "glass", "tnt").noneMatch(compressedBlockName::contains)) {
                    addBlockTag(compressedBlockName, BlockTags.MINEABLE_WITH_PICKAXE);
                }
            }

            for (Block crate : CompressedBlocks.CRATE_BLOCKS) {
                String crateBlockName = ResourceUtils.removeNamespace(crate.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(crateBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_PICKAXE);

                if (crateBlockName.startsWith("crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_01);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("double_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_02);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("triple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_03);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("quadruple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_04);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                }
                if (crateBlockName.startsWith("quintuple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_05);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("sextuple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_06);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("septuple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_07);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("octuple_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_08);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("mega_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_09);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
                if (crateBlockName.startsWith("giga_crated_")) {
                    addBlockTag(crateBlockName, CBTags.CompressionBlockTags.COMPRESSION_X_10);
                    addBlockTag(crateBlockName, BlockTags.MINEABLE_WITH_AXE);
                    addBlockTag(crateBlockName, BlockTags.WITHER_IMMUNE);
                }
            }
        }

        private void addBlockTag(String blockName, TagKey<Block> tag) {
            var builder = this.getOrCreateRawBuilder(tag);
            Identifier id = Identifier.fromNamespaceAndPath(CompressedBlocks.MOD_ID, blockName);
            builder.addElement(id);
        }
    }

    public static class CBItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {

        public CBItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void addTags(HolderLookup.@NonNull Provider provider) {
            for (Block block : CompressedBlocks.COMPRESSED_BLOCKS) {
                String compressedBlockName = ResourceUtils.removeNamespace(block.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(compressedBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                Item blockItem = block.asItem();

                if (compressedBlockName.startsWith("c0")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_01);
                }
                if (compressedBlockName.startsWith("c1")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_02);
                }
                if (compressedBlockName.startsWith("c2")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_03);
                }
                if (compressedBlockName.startsWith("c3")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_04);
                }
                if (compressedBlockName.startsWith("c4")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_05);
                }
                if (compressedBlockName.startsWith("c5")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_06);
                }
                if (compressedBlockName.startsWith("c6")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_07);
                }
                if (compressedBlockName.startsWith("c7")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_08);
                }
                if (compressedBlockName.startsWith("c8")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_09);
                }
                if (compressedBlockName.startsWith("c9")) {
                    addItemTag(compressedBlockName, CBTags.CompressionItemTags.COMPRESSION_X_10);
                }
            }

            for (Block crate : CompressedBlocks.CRATE_BLOCKS) {
                String crateBlockName = ResourceUtils.removeNamespace(crate.getDescriptionId());
                String vanillaName = ResourceUtils.removeCompressionName(crateBlockName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                Item crateItem = crate.asItem();

                if (crateBlockName.startsWith("crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_01);
                }
                if (crateBlockName.startsWith("double_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_02);
                }
                if (crateBlockName.startsWith("triple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_03);
                }
                if (crateBlockName.startsWith("quadruple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_04);
                }
                if (crateBlockName.startsWith("quintuple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_05);
                }
                if (crateBlockName.startsWith("sextuple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_06);
                }
                if (crateBlockName.startsWith("septuple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_07);
                }
                if (crateBlockName.startsWith("octuple_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_08);
                }
                if (crateBlockName.startsWith("mega_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_09);
                }
                if (crateBlockName.startsWith("giga_crated_")) {
                    addItemTag(crateBlockName, CBTags.CompressionItemTags.CRATE_X_10);
                }
            }

            for (Item crateItem : CompressedBlocks.CRATE_ITEMS) {
                String crateItemName = ResourceUtils.removeNamespace(crateItem.getDescriptionId());
                String vanillaName = ResourceUtils.removeCrateName(crateItemName);

                if (!CBConfig.CONFIG.isEnabled(vanillaName)) continue;

                if (crateItemName.startsWith("crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_01);
                }
                if (crateItemName.startsWith("double_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_02);
                }
                if (crateItemName.startsWith("triple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_03);
                }
                if (crateItemName.startsWith("quadruple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_04);
                }
                if (crateItemName.startsWith("quintuple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_05);
                }
                if (crateItemName.startsWith("sextuple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_06);
                }
                if (crateItemName.startsWith("septuple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_07);
                }
                if (crateItemName.startsWith("octuple_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_08);
                }
                if (crateItemName.startsWith("mega_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_09);
                }
                if (crateItemName.startsWith("giga_crated_")) {
                    addItemTag(crateItemName, CBTags.CompressionItemTags.CRATE_X_10);
                }
            }
        }

        private void addItemTag(String itemName, TagKey<Item> tag) {
            var builder = this.getOrCreateRawBuilder(tag);
            Identifier id = Identifier.fromNamespaceAndPath(CompressedBlocks.MOD_ID, itemName);
            builder.addElement(id);
        }
    }
}
