package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.fabric.data.CBTags;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CBBlockTagsProvider extends FabricTagProvider.BlockTagProvider {

    public CBBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (Block block : Constants.BLOCKS) {
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("c0")) {
                getOrCreateTagBuilder(CBTags.SINGLE).add(block);
                getOrCreateTagBuilder(CBTags.C0).add(block);
            }
            if (name.startsWith("c1")) {
                getOrCreateTagBuilder(CBTags.DOUBLE).add(block);
                getOrCreateTagBuilder(CBTags.C1).add(block);
            }
            if (name.startsWith("c2")) {
                getOrCreateTagBuilder(CBTags.TRIPLE).add(block);
                getOrCreateTagBuilder(CBTags.C2).add(block);
            }
            if (name.startsWith("c3")) {
                getOrCreateTagBuilder(CBTags.QUADRUPLE).add(block);
                getOrCreateTagBuilder(CBTags.C3).add(block);
            }
            if (name.startsWith("c4")) {
                getOrCreateTagBuilder(CBTags.QUINTUPLE).add(block);
                getOrCreateTagBuilder(CBTags.C4).add(block);
            }
            if (name.startsWith("c5")) {
                getOrCreateTagBuilder(CBTags.SEXTUPLE).add(block);
                getOrCreateTagBuilder(CBTags.C5).add(block);
            }
            if (name.startsWith("c6")) {
                getOrCreateTagBuilder(CBTags.SEPTUPLE).add(block);
                getOrCreateTagBuilder(CBTags.C6).add(block);
            }
            if (name.startsWith("c7")) {
                getOrCreateTagBuilder(CBTags.OCTUPLE).add(block);
                getOrCreateTagBuilder(CBTags.C7).add(block);
            }
            if (name.startsWith("c8")) {
                getOrCreateTagBuilder(CBTags.MEGA).add(block);
                getOrCreateTagBuilder(CBTags.C8).add(block);
            }
            if (name.startsWith("c9")) {
                getOrCreateTagBuilder(CBTags.GIGA).add(block);
                getOrCreateTagBuilder(CBTags.C9).add(block);
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

        for (Block crate : Constants.CRATES) {
            String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
            getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(crate);

            if (name.startsWith("crated_")) {
                getOrCreateTagBuilder(CBTags.SINGLE).add(crate);
                getOrCreateTagBuilder(CBTags.SINGLE_CRATE).add(crate);
            }
            if (name.startsWith("double_crated_")) {
                getOrCreateTagBuilder(CBTags.DOUBLE).add(crate);
                getOrCreateTagBuilder(CBTags.DOUBLE_CRATE).add(crate);
            }
            if (name.startsWith("triple_crated_")) {
                getOrCreateTagBuilder(CBTags.TRIPLE).add(crate);
                getOrCreateTagBuilder(CBTags.TRIPLE_CRATE).add(crate);
            }
            if (name.startsWith("quadruple_crated_")) {
                getOrCreateTagBuilder(CBTags.QUADRUPLE).add(crate);
                getOrCreateTagBuilder(CBTags.QUADRUPLE_CRATE).add(crate);
            }
            if (name.startsWith("quintuple_crated_")) {
                getOrCreateTagBuilder(CBTags.QUINTUPLE).add(crate);
                getOrCreateTagBuilder(CBTags.QUINTUPLE_CRATE).add(crate);
            }
            if (name.startsWith("sextuple_crated_")) {
                getOrCreateTagBuilder(CBTags.SEXTUPLE).add(crate);
                getOrCreateTagBuilder(CBTags.SEXTUPLE_CRATE).add(crate);
            }
            if (name.startsWith("septuple_crated_")) {
                getOrCreateTagBuilder(CBTags.SEPTUPLE).add(crate);
                getOrCreateTagBuilder(CBTags.SEPTUPLE_CRATE).add(crate);
            }
            if (name.startsWith("octuple_crated_")) {
                getOrCreateTagBuilder(CBTags.OCTUPLE).add(crate);
                getOrCreateTagBuilder(CBTags.OCTUPLE_CRATE).add(crate);
            }
            if (name.startsWith("mega_crated_")) {
                getOrCreateTagBuilder(CBTags.MEGA).add(crate);
                getOrCreateTagBuilder(CBTags.MEGA_CRATE).add(crate);
            }
            if (name.startsWith("giga_crated_")) {
                getOrCreateTagBuilder(CBTags.GIGA).add(crate);
                getOrCreateTagBuilder(CBTags.GIGA_CRATE).add(crate);
            }
        }
    }
}
