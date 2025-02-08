package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;

import java.util.concurrent.CompletableFuture;

public class CBItemTagsProvider extends FabricTagProvider.ItemTagProvider {

    public CBItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (Block block : Constants.BLOCKS) {
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
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

        for (Block crate : Constants.CRATES) {
            String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
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