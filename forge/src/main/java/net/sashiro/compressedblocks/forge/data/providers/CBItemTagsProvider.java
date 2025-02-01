package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.forge.data.CBTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CBItemTagsProvider extends ItemTagsProvider {

    public CBItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> tagLookup, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, provider, tagLookup, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
        for (RegistryObject<Block> registryObject : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
            Item item = registryObject.get().asItem();
            String name = item.getDescriptionId().replace("block.", "").replace("item.", "").replace("compressedblocks.", "");
            if (name.startsWith("crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_01).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_01).add(item);
            }
            if (name.startsWith("double_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_02).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_02).add(item);
            }
            if (name.startsWith("triple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_03).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_03).add(item);
            }
            if (name.startsWith("quadruple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_04).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_04).add(item);
            }
            if (name.startsWith("quintuple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_05).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_05).add(item);
            }
            if (name.startsWith("sextuple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_06).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_06).add(item);
            }
            if (name.startsWith("septuple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_07).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_07).add(item);
            }
            if (name.startsWith("octuple_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_08).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_08).add(item);
            }
            if (name.startsWith("mega_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_09).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_09).add(item);
            }
            if (name.startsWith("giga_crated_")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_10).add(item);
                tag(CBTags.CompressionItemTags.CRATE_X_10).add(item);
            }
        }

        for (RegistryObject<Block> registryObject : CompressedBlocksForge.BLOCKS.getEntries()) {
            Item item = registryObject.get().asItem();
            String name = item.getDescriptionId().replace("block.", "").replace("item.", "").replace("compressedblocks.", "");
            if (name.startsWith("c0")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_01).add(item);
                tag(CBTags.C0_ITEM).add(item);
            }
            if (name.startsWith("c1")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_02).add(item);
                tag(CBTags.C1_ITEM).add(item);
            }
            if (name.startsWith("c2")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_03).add(item);
                tag(CBTags.C2_ITEM).add(item);
            }
            if (name.startsWith("c3")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_04).add(item);
                tag(CBTags.C3_ITEM).add(item);
            }
            if (name.startsWith("c4")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_05).add(item);
                tag(CBTags.C4_ITEM).add(item);
            }
            if (name.startsWith("c5")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_06).add(item);
                tag(CBTags.C5_ITEM).add(item);
            }
            if (name.startsWith("c6")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_07).add(item);
                tag(CBTags.C6_ITEM).add(item);
            }
            if (name.startsWith("c7")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_08).add(item);
                tag(CBTags.C7_ITEM).add(item);
            }
            if (name.startsWith("c8")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_09).add(item);
                tag(CBTags.C8_ITEM).add(item);
            }
            if (name.startsWith("c9")) {
                tag(CBTags.CompressionItemTags.COMPRESSION_X_10).add(item);
                tag(CBTags.C9_ITEM).add(item);
            }
        }
    }
}
