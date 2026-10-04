package net.sashiro.compressedblocks.util;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

import java.util.Arrays;
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
     * @param value The input string to capitalize.
     * @return The capitalized string with the first letter of each word in uppercase.
     */
    public static String capitalizeWords(String value) {
        if (value == null || value.isBlank()) {
            return value;
        }

        String[] words = value.replace('_', ' ').split("\\s+");

        return Arrays.stream(words)
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    /**
     * Utility function to get the Minecraft {@link ResourceLocation} of the Block / Item
     *
     * @param prefix Prefix of the Block / Item.
     * @param name   Name of the Block / Item.
     * @return {@link ResourceLocation} of the Block / Item.
     */
    public static ResourceLocation getResourceLocation(String prefix, String name) {
        ResourceLocation location = ResourceLocation.withDefaultNamespace(prefix + "/" + name);

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
                || name.contains("rose")
                || name.contains("turtle")
                || name.contains("cobweb")
                || name.contains("vein")
                || name.contains("vine")
                || name.contains("lichen")
        )
            location = ResourceLocation.withDefaultNamespace("block/" + name);
        if (name.contains("sunflower")) location = ResourceLocation.withDefaultNamespace("block/sunflower_front");
        if (name.contains("lilac")) location = ResourceLocation.withDefaultNamespace("block/lilac_top");
        if (name.contains("rose_bush")) location = ResourceLocation.withDefaultNamespace("block/rose_bush_top");
        if (name.contains("peony")) location = ResourceLocation.withDefaultNamespace("block/peony_top");
        if (name.contains("carpet"))
            location = ResourceLocation.withDefaultNamespace("block/" + name.replace("carpet", "wool"));
        if (name.contains("scute")) location = ResourceLocation.withDefaultNamespace("item/" + name);
        if (name.equals("bamboo")) location = ResourceLocation.withDefaultNamespace("block/bamboo_stage0");
        return location;
    }

    /**
     * Utility function to create a Block ID
     *
     * @param name Name of the Block.
     * @return {@link ResourceKey} of the Block.
     */
    public static ResourceKey<Block> createBlockId(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, name.toLowerCase()));
    }

    /**
     * Utility function to create an Item ID
     *
     * @param name Name of the Item.
     * @return {@link ResourceKey} of the Item.
     */
    public static ResourceKey<Item> createItemId(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, name.toLowerCase()));
    }

    /**
     * Utility function to remove the namespace from the name
     *
     * @param name Name of the Block or Item.
     * @return Name of the Block or Item without namespace.
     */
    public static String removeNamespace(String name) {
        return name
                .replace("item.compressedblocks.", "")
                .replace("block.compressedblocks.", "");
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

    /**
     * Utility function to get the Minecraft Name of the Crate
     *
     * @param crateName Name of the Crate.
     * @return Minecraft Name of the Crate.
     */
    public static String removeCrateName(String crateName) {
        crateName = removeNamespace(crateName);

        int level = getCrateLevel(crateName);

        if (level < 0) {
            return crateName;
        }

        return crateName.substring(getCratePrefix(level).length());
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
        blockName = blockName.replace("block.compressedblocks.", "");
        String overlay = "";
        String[] crateLevels = {
                "crated_", "double_crated_", "triple_crated_", "quadruple_crated_",
                "quintuple_crated_", "sextuple_crated_", "septuple_crated_",
                "octuple_crated_", "mega_crated_", "giga_crated_"
        };

        if (blockName.contains("crated")) {
            for (int i = 0; i < crateLevels.length; i++) {
                if (blockName.startsWith(crateLevels[i])) {
                    overlay = "level_" + i;
                    break;
                }
            }
        } else if (blockName.startsWith("c")) {
            for (int i = 0; i < 10; i++) {
                if (blockName.contains("c" + i)) {
                    overlay = "compression_level_" + i;
                    break;
                }
            }
        } else overlay = "null";

        return ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/" + overlay);
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
        String blockName = compressedBlockId.replace("block.compressedblocks.", "");
        blockName = removeCompressionName(blockName);

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
        if (blockName.contains("snow_block")) blockName = "snow";

        return ResourceLocation.fromNamespaceAndPath("minecraft", "block/" + blockName);
    }

    /**
     * Utility function to check if the resources of a block has been added manually
     *
     * @param blockName Name of the block.
     * @return true if the resources has been added manually.
     */
    public static boolean hasManuallyAddedResources(String blockName) {
        for (String s : Arrays.asList("honey_block", "basalt", "bone_block", "sandstone", "tnt", "smooth_quartz", "quartz_block", "kelp")) {
            if (blockName.contains(s)) return true;
        }
        return false;
    }

    /**
     * Utility function to check if the block is Rotational
     *
     * @param blockName Name of the block.
     * @return true if the block is rotational.
     */
    public static boolean isRotationalBlock(String blockName) {
        for (String s : Arrays.asList("log", "pillar", "stem", "stripped", "hyphae", "bamboo_block", "froglight", "melon", "pumpkin", "hay")) {
            if (blockName.contains(s)) return true;
        }
        return false;
    }

    /**
     * Utility function to set the Rarity of the Item
     *
     * @param properties Item Properties.
     * @param i          Compression level of the Item.
     * @return Item Properties with Rarity set.
     */
    public static Item.Properties setRarity(Item.Properties properties, int i) {
        switch (i) {
            case 4, 5 -> properties = properties.rarity(Rarity.UNCOMMON);
            case 6, 7 -> properties = properties.rarity(Rarity.RARE);
            case 8, 9 -> properties = properties.rarity(Rarity.EPIC);
            default -> properties = properties.rarity(Rarity.COMMON);
        }
        return properties;
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
}
