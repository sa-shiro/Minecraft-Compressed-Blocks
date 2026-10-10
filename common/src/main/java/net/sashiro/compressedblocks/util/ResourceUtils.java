package net.sashiro.compressedblocks.util;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

/**
 * Utility class for handling resource-related operations in the Compressed Blocks mod.
 */
public class ResourceUtils {

    private static final String[] CRATE_PREFIXES = {
            "crated_",
            "double_crated_",
            "triple_crated_",
            "quadruple_crated_",
            "quintuple_crated_",
            "sextuple_crated_",
            "septuple_crated_",
            "octuple_crated_",
            "mega_crated_",
            "giga_crated_"
    };

    private ResourceUtils() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    /**
     * Utility function to capitalize the first letter of each word in a string.
     *
     * @param input The input string to capitalize.
     * @return The capitalized string with the first letter of each word in uppercase.
     */
    public static String capitalizeWords(String input) {
        if (input == null || input.isBlank()) {
            return input;
        }

        String normalizedInput = input.toLowerCase(Locale.ROOT);
        String[] words = normalizedInput.replace('_', ' ').split("\\s+");

        return Arrays.stream(words)
                .filter(word -> !word.isEmpty())
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    /**
     * Resolves the vanilla Minecraft resource location for a given prefix and name.
     *
     * @param prefix The prefix to use in the resource location.
     * @param name   The name of the resource.
     * @return The resolved {@link ResourceLocation} for the vanilla Minecraft resource.
     */
    public static ResourceLocation resolveVanillaResource(String prefix, String name) {
        ResourceLocation resourceLocation = new ResourceLocation("minecraft", prefix + "/" + name);

        if (name.contains("rail")
                || name.contains("torch")
                || name.contains("lightning_rod")
                || name.contains("end_rod")
                || name.contains("anvil")
                || name.contains("sapling")
                || name.contains("mushroom")
                || name.contains("fungus")
                || name.contains("dandelion")
                || name.contains("poppy")
                || name.contains("orchid")
                || name.contains("allium")
                || name.contains("bluet")
                || name.contains("tulip")
                || name.contains("daisy")
                || name.contains("cornflower")
                || name.contains("valley")
                || (name.contains("rose") && !name.contains("rose_bush"))
                || name.contains("turtle_egg")
                || name.contains("cobweb")
                || name.contains("vein")
                || name.contains("vine")
                || name.contains("lichen")) {
            resourceLocation = new ResourceLocation("minecraft", "block/" + name);
        } else if (name.contains("sunflower"))
            resourceLocation = new ResourceLocation("minecraft", "block/sunflower_front");
        else if (name.contains("lilac")) resourceLocation = new ResourceLocation("minecraft", "block/lilac_top");
        else if (name.contains("rose_bush"))
            resourceLocation = new ResourceLocation("minecraft", "block/rose_bush_top");
        else if (name.contains("peony")) resourceLocation = new ResourceLocation("minecraft", "block/peony_top");
        else if (name.contains("carpet"))
            resourceLocation = new ResourceLocation("minecraft", "block/" + name.replace("carpet", "wool"));
        else if (name.contains("scute")) resourceLocation = new ResourceLocation("minecraft", "item/" + name);
        else if (name.equals("bamboo")) resourceLocation = new ResourceLocation("minecraft", "block/bamboo_stage0");

        return resourceLocation;
    }

    /**
     * Utility function to create a Block ID
     *
     * @param name Name of the Block.
     * @return {@link ResourceKey} of the Block.
     */
    public static ResourceKey<Block> createBlockId(String name) {
        return ResourceKey.create(Registries.BLOCK, new ResourceLocation(MOD_ID, name));
    }

    /**
     * Utility function to create an Item ID
     *
     * @param name Name of the Item.
     * @return {@link ResourceKey} of the Item.
     */
    public static ResourceKey<Item> createItemId(String name) {
        return ResourceKey.create(Registries.ITEM, new ResourceLocation(MOD_ID, name));
    }

    /**
     * Utility function to remove the namespace from the name
     *
     * @param name Name of the Block or Item.
     * @return Name of the Block or Item without namespace.
     */
    public static String removeNamespace(String name) {
        return name
                .replace("item." + MOD_ID + ".", "")
                .replace("block." + MOD_ID + ".", "")
                .replace("item.minecraft.", "")
                .replace("block.minecraft.", "");
    }

    /**
     * Utility function to normalize the Block Name
     *
     * @param blockName Name of the Block.
     * @return Normalized Name of the Block.
     */
    private static String normalizeBlockName(String blockName) {
        String normalizedName = removeNamespace(blockName);
        return removeCompressionName(normalizedName);
    }

    /**
     * Utility function to get the Crate Prefix based on the Compression Level
     *
     * @param level Compression Level of the Crate.
     * @return Crate Prefix based on the Compression Level.
     */
    public static String getCratePrefix(int level) {
        if (level < 0 || level >= CRATE_PREFIXES.length) {
            return "";
        }

        return CRATE_PREFIXES[level];
    }

    private static String getCrateOverlayName(int level) {
        return "level_" + level;
    }

    /**
     * Utility function to get the Minecraft Name of the Crate
     *
     * @param crateName Name of the Crate.
     * @return Minecraft Name of the Crate.
     */
    public static String removeCrateName(String crateName) {
        String normalizedCrateName = removeNamespace(crateName);

        int level = getCrateLevel(normalizedCrateName);

        if (level < 0) {
            return normalizedCrateName;
        }

        return normalizedCrateName.substring(getCratePrefix(level).length());
    }

    /**
     * Utility function to get the Compression Level of the Block
     *
     * @param registryName Name of the Block.
     * @return Compression Level of the Block.
     */
    public static int getCompressionLevel(String registryName) {
        if (registryName.length() < 2 || registryName.charAt(0) != 'c') {
            return -1;
        }

        char level = registryName.charAt(1);

        if (level < '0' || level > '9') {
            return -1;
        }

        return level - '0';
    }

    /**
     * Utility function to get the Compression Level Name of the Block
     *
     * @param registryName Name of the Block.
     * @return Compression Level Name of the Block.
     */
    public static String getCompressionLevelName(String registryName) {
        return switch (getCompressionLevel(registryName)) {
            case 0 -> "Compressed ";
            case 1 -> "Double Compressed ";
            case 2 -> "Triple Compressed ";
            case 3 -> "Quadruple Compressed ";
            case 4 -> "Quintuple Compressed ";
            case 5 -> "Sextuple Compressed ";
            case 6 -> "Septuple Compressed ";
            case 7 -> "Octuple Compressed ";
            case 8 -> "Mega Compressed ";
            case 9 -> "Giga Compressed ";
            default -> "";
        };
    }

    /**
     * Utility function to remove the Compression Level Name of the Block
     *
     * @param name Name of the Block.
     * @return Name of the Block without Compression Level Name.
     */
    public static String removeCompressionName(String name) {
        int level = getCompressionLevel(name);

        if (level < 0) {
            return name;
        }

        return name.substring(3);
    }

    private static String getCompressionOverlayName(int level) {
        return "compression_level_" + level;
    }

    /**
     * Utility function to get the Compression Level of the Crate
     *
     * @param name Name of the Crate.
     * @return Compression Level of the Crate.
     */
    public static int getCrateLevel(String name) {
        for (int i = 0; i < CRATE_PREFIXES.length; i++) {
            if (name.startsWith(CRATE_PREFIXES[i])) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Utility function to get the overlay
     *
     * @param blockName Name of the Compressed Block.
     * @return Overlay {@link ResourceLocation}.
     */
    public static ResourceLocation getOverlay(String blockName) {
        String normalizedBlockName = removeNamespace(blockName);
        String overlayName = "null";

        if (normalizedBlockName.contains("crated")) {
            for (int level = 0; level < CRATE_PREFIXES.length; level++) {
                if (normalizedBlockName.startsWith(CRATE_PREFIXES[level])) {
                    overlayName = getCrateOverlayName(level);
                    break;
                }
            }
        } else if (normalizedBlockName.startsWith("c")) {
            for (int level = 0; level < 10; level++) {
                if (normalizedBlockName.contains("c" + level)) {
                    overlayName = getCompressionOverlayName(level);
                    break;
                }
            }
        }

        return new ResourceLocation(MOD_ID, "block/" + overlayName);
    }

    /**
     * Resolves the underlying vanilla Minecraft block {@link ResourceLocation}
     * from a compressed block ResourceLocation string.
     *
     * <p>This method strips the compressed block prefix, removes compression
     * suffixes, and normalizes special cases such as copper variants, magma,
     * and snow blocks.</p>
     *
     * @param compressedBlockId the full ResourceLocation string of the compressed block
     *                          (e.g. {@code block.compressedblocks.exposed_cut_copper})
     * @return the resolved vanilla Minecraft block {@link ResourceLocation}
     */
    public static ResourceLocation resolveVanillaBlockId(String compressedBlockId) {
        String blockName = normalizeBlockName(compressedBlockId);

        if (blockName.contains("cut")) {
            if (blockName.contains("exposed_cut_copper")) blockName = "exposed_cut_copper";
            else if (blockName.contains("oxidized_cut_copper")) blockName = "oxidized_cut_copper";
            else if (blockName.contains("weathered_cut_copper")) blockName = "weathered_cut_copper";
            else if (blockName.contains("cut_copper")) blockName = "cut_copper";
        } else {
            if (blockName.contains("copper_block") && !blockName.contains("raw")) blockName = "copper_block";
            else if (blockName.contains("exposed_copper")) blockName = "exposed_copper";
            else if (blockName.contains("oxidized_copper")) blockName = "oxidized_copper";
            else if (blockName.contains("weathered_copper")) blockName = "weathered_copper";
        }

        if (blockName.contains("magma_block")) blockName = "magma";
        else if (blockName.contains("snow_block")) blockName = "snow";
        else if (blockName.contains("smooth_sandstone")) blockName = "sandstone_top";
        else if (blockName.contains("smooth_red_sandstone")) blockName = "red_sandstone_top";

        return new ResourceLocation("minecraft", "block/" + blockName);
    }

    /**
     * Utility function to set the Rarity of the Item
     *
     * @param properties       Item Properties.
     * @param compressionLevel Compression level of the Item.
     * @return Item Properties with Rarity set.
     */
    public static Item.Properties setRarity(Item.Properties properties, int compressionLevel) {
        return switch (compressionLevel) {
            case 4, 5 -> properties.rarity(Rarity.UNCOMMON);
            case 6, 7 -> properties.rarity(Rarity.RARE);
            case 8, 9 -> properties.rarity(Rarity.EPIC);
            default -> properties.rarity(Rarity.COMMON);
        };
    }

    /**
     * Utility function to get the Rarity Color of the Item
     *
     * @param i Compression level of the Item.
     * @return {@link ChatFormatting} of the Item.
     */
    public static ChatFormatting getRarityColor(int i) {
        return switch (i) {
            case 1 -> ChatFormatting.GREEN;
            case 2 -> ChatFormatting.AQUA;
            case 3 -> ChatFormatting.BLUE;
            case 4 -> ChatFormatting.DARK_BLUE;
            case 5 -> ChatFormatting.YELLOW;
            case 6 -> ChatFormatting.GOLD;
            case 7 -> ChatFormatting.DARK_PURPLE;
            case 8 -> ChatFormatting.LIGHT_PURPLE;
            case 9 -> ChatFormatting.RED;
            default -> ChatFormatting.WHITE;
        };
    }

    /**
     * Pluralizes English words using common grammar rules.
     *
     * @param word the word to pluralize
     * @return the pluralized form of the word
     */
    public static String pluralize(String word) {
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
    private static boolean shouldAddSimpleS(String word) {
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
}
