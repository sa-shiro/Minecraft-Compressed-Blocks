package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.util.StringUtils;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBLanguageProvider extends LanguageProvider {
    public CBLanguageProvider(PackOutput packOutput, String locale) {
        super(packOutput, MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.compressedblocks.compressed_blocks", "Compressed Blocks");
        add("itemGroup.compressedblocks.compressed_items", "Item Crates");

        for (RegistryObject<Block> block : CompressedBlocksForge.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            add("block.compressedblocks." + name, StringUtils.compressionLevel(name) + StringUtils.stringFormat(name2.replace("_", " ")));
        }

        for (RegistryObject<Item> item : CompressedBlocksForge.CRATE_ITEMS.getEntries()) {
            assert false;
            String name = item.get().getDescriptionId().replace("block.compressedblocks.", "");
            String translation = StringUtils.stringFormat(name.replace("_", " "));

            if ((translation.endsWith("a")
                    || translation.endsWith("b")
                    || translation.endsWith("c")
                    || translation.endsWith("d")
                    || translation.endsWith("e")
                    || translation.endsWith("f")
                    || translation.endsWith("g")
                    || translation.endsWith("k")
                    || translation.endsWith("l")
                    || translation.endsWith("m")
                    || translation.endsWith("n")
                    || translation.endsWith("p")
                    || translation.endsWith("r")
                    || translation.endsWith("t")
                    || translation.endsWith("w"))
                    && !translation.endsWith("ead")
                    && !translation.endsWith("af")
                    && !translation.endsWith("ef")
                    && !translation.endsWith("ns")
                    && !translation.endsWith("tton")
                    && !translation.endsWith("ken")
                    && !translation.endsWith("lp")
                    && !translation.endsWith("op")
                    && !translation.endsWith("ts")
                    && !translation.endsWith("it")
                    && !translation.endsWith("der")
                    && !translation.endsWith("gar")
                    && !translation.endsWith("ing")
                    && !translation.contains("coal")
                    && !translation.contains("per")
            ) {
                translation += ("s");
            } else if (translation.endsWith("o") && !translation.endsWith("oo")) {
                translation += ("es");
            } else if (translation.endsWith("ly") && !translation.endsWith("y")) {
                translation = translation.replace("ly", "ies");
            } else if (translation.endsWith("s")
                    && !translation.endsWith("es")
                    && !translation.endsWith("ns")
                    && !translation.endsWith("rs")
                    && !translation.endsWith("ds")
                    && !translation.endsWith("ss")
                    && !translation.endsWith("us")
                    && !translation.endsWith("ts")
            ) {
                StringBuilder b = new StringBuilder(translation);
                b.replace(translation.lastIndexOf("s"), translation.lastIndexOf("s") + 1, "es");
                translation = b.toString();
            } else if (translation.endsWith("sh") || translation.endsWith("ch") && !translation.contains("rotten")) {
                translation += "es";
            } else if (translation.contains("leaf")) {
                translation = translation.replace("leaf", "leaves");
            }

            if (name.contains("totem") || name.contains("dragon"))
                add("item.compressedblocks." + name, "§6" + translation.replace("Crated", "Crate of"));
            else if (name.startsWith("item.")) return;
            else add("block.compressedblocks." + name, translation.replace("Crated", "Crate of"));
        }
    }
}