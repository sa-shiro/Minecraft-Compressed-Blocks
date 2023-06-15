package net.sashiro.compressedblocks.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.data.CBTags;
import net.sashiro.compressedblocks.event.CBRegistryEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class CBItemTagsProvider extends ItemTagsProvider {
    public CBItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Block>> tagLookup, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, provider, tagLookup, modId, existingFileHelper);
    }
    
    public CBItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagLookup<Item>> tagLookup, CompletableFuture<TagLookup<Block>> p_275634_, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, provider, tagLookup, p_275634_, modId, existingFileHelper);
    }
    
    @Override
    protected void addTags(HolderLookup.@NotNull Provider p_256380_) {
        for (RegistryObject<Item> registryObject : CBRegistryEvent.CRATE_ITEMS.getEntries()) {
            Item item = registryObject.get();
            String name = item.getDescriptionId().replace("item.compressedblocks.", "");
            if (name.startsWith("crated_")) {
                tag(CBTags.SINGLE_CRATE).add(item);
            }
            if (name.startsWith("double_crated_")) {
                tag(CBTags.DOUBLE_CRATE).add(item);
            }
            if (name.startsWith("triple_crated_")) {
                tag(CBTags.TRIPLE_CRATE).add(item);
            }
            if (name.startsWith("quadruple_crated_")) {
                tag(CBTags.QUADRUPLE_CRATE).add(item);
            }
            if (name.startsWith("quintuple_crated_")) {
                tag(CBTags.QUINTUPLE_CRATE).add(item);
            }
            if (name.startsWith("sextuple_crated_")) {
                tag(CBTags.SEXTUPLE_CRATE).add(item);
            }
            if (name.startsWith("septuple_crated_")) {
                tag(CBTags.SEPTUPLE_CRATE).add(item);
            }
            if (name.startsWith("octuple_crated_")) {
                tag(CBTags.OCTUPLE_CRATE).add(item);
            }
            if (name.startsWith("mega_crated_")) {
                tag(CBTags.MEGA_CRATE).add(item);
            }
            if (name.startsWith("giga_crated_")) {
                tag(CBTags.GIGA_CRATE).add(item);
            }
        }
        for (RegistryObject<Block> registryObject : CBRegistryEvent.BLOCKS.getEntries()) {
            Item item = registryObject.get().asItem();
            String name = item.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("c0")) {
                tag(CBTags.SINGLE_ITEM).add(item);
                tag(CBTags.C0_ITEM).add(item);
            }
            if (name.startsWith("c1")) {
                tag(CBTags.DOUBLE_ITEM).add(item);
                tag(CBTags.C1_ITEM).add(item);
            }
            if (name.startsWith("c2")) {
                tag(CBTags.TRIPLE_ITEM).add(item);
                tag(CBTags.C2_ITEM).add(item);
            }
            if (name.startsWith("c3")) {
                tag(CBTags.QUADRUPLE_ITEM).add(item);
                tag(CBTags.C3_ITEM).add(item);
            }
            if (name.startsWith("c4")) {
                tag(CBTags.QUINTUPLE_ITEM).add(item);
                tag(CBTags.C4_ITEM).add(item);
            }
            if (name.startsWith("c5")) {
                tag(CBTags.SEXTUPLE_ITEM).add(item);
                tag(CBTags.C5_ITEM).add(item);
            }
            if (name.startsWith("c6")) {
                tag(CBTags.SEPTUPLE_ITEM).add(item);
                tag(CBTags.C6_ITEM).add(item);
            }
            if (name.startsWith("c7")) {
                tag(CBTags.OCTUPLE_ITEM).add(item);
                tag(CBTags.C7_ITEM).add(item);
            }
            if (name.startsWith("c8")) {
                tag(CBTags.MEGA_ITEM).add(item);
                tag(CBTags.C8_ITEM).add(item);
            }
            if (name.startsWith("c9")) {
                tag(CBTags.GIGA_ITEM).add(item);
                tag(CBTags.C9_ITEM).add(item);
            }
        }
    }
}
