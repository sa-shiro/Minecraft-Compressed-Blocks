package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.util.CommonUtils;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class CBLanguageProvider extends FabricLanguageProvider {

    public CBLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    /**
     * Pluralizes English words using common grammar rules.
     *
     * @param word the word to pluralize
     * @return the pluralized form of the word
     */
    private String pluralize(String word) {
        // Special cases
        if (word.contains("leaf")) {
            return word.replace("leaf", "leaves");
        }

        // Words ending in -ly (excluding those already ending in -y)
        if (word.endsWith("ly") && !word.endsWith("y")) {
            return word.replace("ly", "ies");
        }

        // Words ending in -o (excluding -oo)
        if (word.endsWith("o") && !word.endsWith("oo")) {
            return word + "es";
        }

        // Words ending in -sh or -ch (with exception for "rotten")
        if ((word.endsWith("sh") || word.endsWith("ch")) && !word.contains("rotten")) {
            return word + "es";
        }

        // Words ending in -s (replacing with -es)
        if (word.endsWith("s") && !word.endsWith("es") && !word.endsWith("ns")
                && !word.endsWith("rs") && !word.endsWith("ds") && !word.endsWith("ss")
                && !word.endsWith("us") && !word.endsWith("ts")) {
            int lastIndex = word.lastIndexOf("s");
            return word.substring(0, lastIndex) + "es";
        }

        // Words ending in specific consonants that need -s
        if (shouldAddSimpleS(word)) {
            return word + "s";
        }

        return word;
    }

    /**
     * Determines if a word should have a simple -s suffix based on its ending.
     * Excludes specific exceptions that need different rules.
     */
    private boolean shouldAddSimpleS(String word) {
        // Endings that require -s
        char lastChar = word.charAt(word.length() - 1);
        boolean endsInConsonant = "abcdefgklmnprtw".indexOf(lastChar) >= 0;

        if (!endsInConsonant) {
            return false;
        }

        // Exceptions that should NOT get simple -s
        String[] exceptions = {"ead", "af", "ef", "ns", "tton", "ken", "lp", "op", "ts", "it", "der", "gar", "ing"};
        for (String exception : exceptions) {
            if (word.endsWith(exception)) {
                return false;
            }
        }

        // Words containing these should not get -s
        return !word.contains("coal") && !word.contains("per");
    }

    @Override
    public void generateTranslations(HolderLookup.@NonNull Provider registryLookup, TranslationBuilder builder) {
        builder.add("itemGroup.compressed_blocks", "Compressed Blocks");
        builder.add("itemGroup.compressed_items", "Item Crates");

        for (Block block : Constants.BLOCKS) {
            String name = block.getDescriptionId().replace("block.compressedblocks.", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            builder.add("item.compressedblocks." + name, CommonUtils.compressionLevel(name) + CommonUtils.stringFormat(name2.replace("_", " ")));
        }

        for (Item crate : Constants.CRATE_ITEMS) {
            Item item = crate.asItem();
            String name = item.getDescriptionId().replace("block.compressedblocks.", "").replace("item.compressedblocks.", "");
            String translation = CommonUtils.stringFormat(name.replace("_", " "));
            translation = pluralize(translation);

            String finalTranslation = translation.replace("Crated", "Crate of");
            if (name.contains("totem") || name.contains("dragon")) {
                builder.add("item.compressedblocks." + name, "§6" + finalTranslation);
            } else if (!name.startsWith("item.")) {
                builder.add("item.compressedblocks." + name, finalTranslation);
            }
        }

        for (Block crate : Constants.CRATE_BLOCKS) {
            String name = crate.getDescriptionId().replace("block.compressedblocks.", "");
            String translation = CommonUtils.stringFormat(name.replace("_", " "));
            translation = pluralize(translation);

            String finalTranslation = translation.replace("Crated", "Crate of");
            if (name.contains("totem") || name.contains("dragon")) {
                builder.add("item.compressedblocks." + name, "§6" + finalTranslation);
            } else if (!name.startsWith("item.")) {
                builder.add("item.compressedblocks." + name, finalTranslation);
            }
        }
    }
}
