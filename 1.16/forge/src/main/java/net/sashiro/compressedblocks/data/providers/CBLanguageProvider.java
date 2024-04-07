package net.sashiro.compressedblocks.data.providers;

import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;
import net.sashiro.compressedblocks.event.CBRegistryEvent;
import net.sashiro.compressedblocks.util.StringUtils;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBLanguageProvider extends LanguageProvider {
    public CBLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MOD_ID, locale);
    }
    
    private String compressionLevel(String registryName) {
        String str = registryName.substring(0, 2);
        switch (str) {
            case "c0":
                str = "Compressed ";
                break;
            case "c1":
                str = "Double Compressed ";
                break;
            case "c2":
                str = "Triple Compressed ";
                break;
            case "c3":
                str = "Quadruple Compressed ";
                break;
            case "c4":
                str = "Quintuple Compressed ";
                break;
            case "c5":
                str = "Sextuple Compressed ";
                break;
            case "c6":
                str = "Septuple Compressed ";
                break;
            case "c7":
                str = "Octuple Compressed ";
                break;
            case "c8":
                str = "Mega Compressed ";
                break;
            case "c9":
                str = "Giga Compressed ";
                break;
            default:
                str = "";
                break;
        }
        
        return str;
    }
    
    @Override
    protected void addTranslations() {
        add("itemGroup.compressedblocks.compressed_blocks", "Compressed Blocks");
        add("itemGroup.compressedblocks.compressed_items", "Item Crates");
        
        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            add("block.compressedblocks." + name, compressionLevel(name) + StringUtils.stringFormat(name2.replace("_", " ")));
        }
        
        for (RegistryObject<Item> item : CBRegistryEvent.CRATE_ITEMS.getEntries()) {
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