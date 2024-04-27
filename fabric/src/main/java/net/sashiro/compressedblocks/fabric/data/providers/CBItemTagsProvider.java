package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;

public class CBItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public CBItemTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {
        for (Block block : Constants.BLOCKS) {
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            Item blockItem = block.asItem();

            if (name.startsWith("c0")) {
                getOrCreateTagBuilder(CBTags.SINGLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C0_ITEM).add(blockItem);
            }
            if (name.startsWith("c1")) {
                getOrCreateTagBuilder(CBTags.DOUBLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C1_ITEM).add(blockItem);
            }
            if (name.startsWith("c2")) {
                getOrCreateTagBuilder(CBTags.TRIPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C2_ITEM).add(blockItem);
            }
            if (name.startsWith("c3")) {
                getOrCreateTagBuilder(CBTags.QUADRUPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C3_ITEM).add(blockItem);
            }
            if (name.startsWith("c4")) {
                getOrCreateTagBuilder(CBTags.QUINTUPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C4_ITEM).add(blockItem);
            }
            if (name.startsWith("c5")) {
                getOrCreateTagBuilder(CBTags.SEXTUPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C5_ITEM).add(blockItem);
            }
            if (name.startsWith("c6")) {
                getOrCreateTagBuilder(CBTags.SEPTUPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C6_ITEM).add(blockItem);
            }
            if (name.startsWith("c7")) {
                getOrCreateTagBuilder(CBTags.OCTUPLE_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C7_ITEM).add(blockItem);
            }
            if (name.startsWith("c8")) {
                getOrCreateTagBuilder(CBTags.MEGA_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C8_ITEM).add(blockItem);
            }
            if (name.startsWith("c9")) {
                getOrCreateTagBuilder(CBTags.GIGA_ITEM).add(blockItem);
                getOrCreateTagBuilder(CBTags.C9_ITEM).add(blockItem);
            }
        }

        for (Block crate : Constants.CRATES) {
            String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
            Item crateItem = crate.asItem();

            if (name.startsWith("crated_")) {
                getOrCreateTagBuilder(CBTags.SINGLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.SINGLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("double_crated_")) {
                getOrCreateTagBuilder(CBTags.DOUBLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.DOUBLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("triple_crated_")) {
                getOrCreateTagBuilder(CBTags.TRIPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.TRIPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("quadruple_crated_")) {
                getOrCreateTagBuilder(CBTags.QUADRUPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.QUADRUPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("quintuple_crated_")) {
                getOrCreateTagBuilder(CBTags.QUINTUPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.QUINTUPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("sextuple_crated_")) {
                getOrCreateTagBuilder(CBTags.SEXTUPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.SEXTUPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("septuple_crated_")) {
                getOrCreateTagBuilder(CBTags.SEPTUPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.SEPTUPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("octuple_crated_")) {
                getOrCreateTagBuilder(CBTags.OCTUPLE_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.OCTUPLE_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("mega_crated_")) {
                getOrCreateTagBuilder(CBTags.MEGA_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.MEGA_CRATE_ITEM).add(crateItem);
            }
            if (name.startsWith("giga_crated_")) {
                getOrCreateTagBuilder(CBTags.GIGA_ITEM).add(crateItem);
                getOrCreateTagBuilder(CBTags.GIGA_CRATE_ITEM).add(crateItem);
            }
        }
    }
}