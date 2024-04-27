package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.forge.data.CBTags;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static net.sashiro.compressedblocks.Constants.MOD_ID;


public class CBBlockTagsProvider extends BlockTagsProvider {

    public CBBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (RegistryObject<Block> registryObject : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("crated_")) {
                tag(CBTags.SINGLE).add(block);
                tag(CBTags.SINGLE_CRATE).add(block);
            }
            if (name.startsWith("double_crated_")) {
                tag(CBTags.DOUBLE).add(block);
                tag(CBTags.DOUBLE_CRATE).add(block);
            }
            if (name.startsWith("triple_crated_")) {
                tag(CBTags.TRIPLE).add(block);
                tag(CBTags.TRIPLE_CRATE).add(block);
            }
            if (name.startsWith("quadruple_crated_")) {
                tag(CBTags.QUADRUPLE).add(block);
                tag(CBTags.QUADRUPLE_CRATE).add(block);
            }
            if (name.startsWith("quintuple_crated_")) {
                tag(CBTags.QUINTUPLE).add(block);
                tag(CBTags.QUINTUPLE_CRATE).add(block);
            }
            if (name.startsWith("sextuple_crated_")) {
                tag(CBTags.SEXTUPLE).add(block);
                tag(CBTags.SEXTUPLE_CRATE).add(block);
            }
            if (name.startsWith("septuple_crated_")) {
                tag(CBTags.SEPTUPLE).add(block);
                tag(CBTags.SEPTUPLE_CRATE).add(block);
            }
            if (name.startsWith("octuple_crated_")) {
                tag(CBTags.OCTUPLE).add(block);
                tag(CBTags.OCTUPLE_CRATE).add(block);
            }
            if (name.startsWith("mega_crated_")) {
                tag(CBTags.MEGA).add(block);
                tag(CBTags.MEGA_CRATE).add(block);
            }
            if (name.startsWith("giga_crated_")) {
                tag(CBTags.GIGA).add(block);
                tag(CBTags.GIGA_CRATE).add(block);
            }
        }
        for (RegistryObject<Block> registryObject : CompressedBlocksForge.BLOCKS.getEntries()) {
            Block block = registryObject.get();
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            if (name.startsWith("c0")) {
                tag(CBTags.SINGLE).add(block);
                tag(CBTags.C0).add(block);
            }
            if (name.startsWith("c1")) {
                tag(CBTags.DOUBLE).add(block);
                tag(CBTags.C1).add(block);
            }
            if (name.startsWith("c2")) {
                tag(CBTags.TRIPLE).add(block);
                tag(CBTags.C2).add(block);
            }
            if (name.startsWith("c3")) {
                tag(CBTags.QUADRUPLE).add(block);
                tag(CBTags.C3).add(block);
            }
            if (name.startsWith("c4")) {
                tag(CBTags.QUINTUPLE).add(block);
                tag(CBTags.C4).add(block);
            }
            if (name.startsWith("c5")) {
                tag(CBTags.SEXTUPLE).add(block);
                tag(CBTags.C5).add(block);
            }
            if (name.startsWith("c6")) {
                tag(CBTags.SEPTUPLE).add(block);
                tag(CBTags.C6).add(block);
            }
            if (name.startsWith("c7")) {
                tag(CBTags.OCTUPLE).add(block);
                tag(CBTags.C7).add(block);
            }
            if (name.startsWith("c8")) {
                tag(CBTags.MEGA).add(block);
                tag(CBTags.C8).add(block);
            }
            if (name.startsWith("c9")) {
                tag(CBTags.GIGA).add(block);
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
