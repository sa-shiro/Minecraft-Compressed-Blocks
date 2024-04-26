package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.util.StringUtils;

public class CBLanguageProvider extends FabricLanguageProvider {

    public CBLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add("itemGroup.compressed_blocks", "Compressed Blocks");
        builder.add("itemGroup.compressed_items", "Item Crates");

        for (Block block : Constants.BLOCKS) {
            assert false;
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            builder.add("block.compressedblocks." + name, StringUtils.compressionLevel(name) + StringUtils.stringFormat(name2.replace("_", " ")));
        }

        for (Block crate : Constants.CRATES) {
            Item item = crate.asItem();
            assert false;
            String name = item.getDescriptionId().replace("block.compressedblocks.", "");
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
                builder.add("item.compressedblocks." + name, "§6" + translation.replace("Crated", "Crate of"));
            else if (name.startsWith("item.")) return;
            else builder.add("block.compressedblocks." + name, translation.replace("Crated", "Crate of"));
        }
    }
}
