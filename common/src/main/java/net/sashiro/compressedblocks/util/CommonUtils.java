package net.sashiro.compressedblocks.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class CommonUtils {

    private CommonUtils() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    /**
     * Utility function to replace underscores<br>
     * with spaces and format the {@link String}  in uppercase.
     *
     * @param formatString the {@link String} to format
     * @return the formatted {@link String}
     */
    public static String stringFormat(String formatString) {
        formatString = formatString.replace("_", " ");
        String[] words = formatString.split("\\s");
        StringBuilder stringFormat = new StringBuilder();
        for (String str : words) {
            String first = str.substring(0, 1);
            String afterFirst = str.substring(1);
            stringFormat.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return stringFormat.toString().trim();
    }

    /**
     * Utility function to remove the index of compressed Items and Blocks
     *
     * @param name of the Item / Block.
     * @return actual Block name.
     */
    public static String removeCompressionName(String name) {
        for (int i = 0; i < 10; i++) {
            if (name.contains("c" + i))
                name = name.replace("c" + i + "_", "");
        }
        return name;
    }

    /**
     * Utility function to get the prefix for Crates
     *
     * @param index of the Crate.
     * @return Crate prefix.
     */
    public static String getCratePrefix(int index) {
        return switch (index) {
            case 0 -> "crated_";
            case 1 -> "double_crated_";
            case 2 -> "triple_crated_";
            case 3 -> "quadruple_crated_";
            case 4 -> "quintuple_crated_";
            case 5 -> "sextuple_crated_";
            case 6 -> "septuple_crated_";
            case 7 -> "octuple_crated_";
            case 8 -> "mega_crated_";
            case 9 -> "giga_crated_";
            default -> "";
        };
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
     * Utility function to get the ResourceLocation of the Item
     *
     * @param mc_name Name of the Item.
     * @return {@link ResourceLocation} of the Item.
     */
    @NotNull
    public static ResourceLocation getResourceLocation(String mc_name) {
        ResourceLocation location = ResourceLocation.withDefaultNamespace("item/" + mc_name);

        if (mc_name.contains("rail")
                || mc_name.contains("torch")
                || mc_name.contains("lightning_rod")
                || mc_name.contains("end_rod")
                || mc_name.contains("anvil")
                || mc_name.contains("sapling")
                || mc_name.contains("mushroom")
                || mc_name.contains("fungus")
                || mc_name.contains("dandelion")
                || mc_name.contains("poppy")
                || mc_name.contains("orchid")
                || mc_name.contains("allium")
                || mc_name.contains("bluet")
                || mc_name.contains("tulip")
                || mc_name.contains("daisy")
                || mc_name.contains("cornflower")
                || mc_name.contains("valley")
                || mc_name.contains("rose")
                || mc_name.contains("turtle")
                || mc_name.contains("cobweb")
                || mc_name.contains("vein")
                || mc_name.contains("vine")
                || mc_name.contains("lichen")
        )
            location = ResourceLocation.withDefaultNamespace("block/" + mc_name);
        if (mc_name.contains("sunflower")) location = ResourceLocation.withDefaultNamespace("block/sunflower_front");
        if (mc_name.contains("lilac")) location = ResourceLocation.withDefaultNamespace("block/lilac_top");
        if (mc_name.contains("rose_bush")) location = ResourceLocation.withDefaultNamespace("block/rose_bush_top");
        if (mc_name.contains("peony")) location = ResourceLocation.withDefaultNamespace("block/peony_top");
        if (mc_name.contains("carpet"))
            location = ResourceLocation.withDefaultNamespace("block/" + mc_name.replace("carpet", "wool"));
        if (mc_name.contains("scute")) location = ResourceLocation.withDefaultNamespace("item/" + mc_name);
        return location;
    }

    /**
     * Utility function to get the Minecraft Name of the Crate
     *
     * @param crateName Name of the Crate.
     * @return Minecraft Name of the Crate.
     */
    public static String getMCName(String crateName) {
        crateName = crateName.replace("item.compressedblocks.", "");
        crateName = crateName.replace("block.compressedblocks.", "");
        if (crateName.startsWith("crated_")) crateName = crateName.replace("crated_", "");
        else if (crateName.startsWith("double_crated_")) crateName = crateName.replace("double_crated_", "");
        else if (crateName.startsWith("triple_crated_")) crateName = crateName.replace("triple_crated_", "");
        else if (crateName.startsWith("quadruple_crated_")) crateName = crateName.replace("quadruple_crated_", "");
        else if (crateName.startsWith("quintuple_crated_")) crateName = crateName.replace("quintuple_crated_", "");
        else if (crateName.startsWith("sextuple_crated_")) crateName = crateName.replace("sextuple_crated_", "");
        else if (crateName.startsWith("septuple_crated_")) crateName = crateName.replace("septuple_crated_", "");
        else if (crateName.startsWith("octuple_crated_")) crateName = crateName.replace("octuple_crated_", "");
        else if (crateName.startsWith("mega_crated_")) crateName = crateName.replace("mega_crated_", "");
        else if (crateName.startsWith("giga_crated_")) crateName = crateName.replace("giga_crated_", "");

        return crateName;
    }

    /**
     * Utility function to get the actual Minecraft {@link ResourceLocation} of the Block
     *
     * @param resourceLocation Name of the Block.
     * @return {@link ResourceLocation} of the Block.
     */
    public static ResourceLocation getActualResourceLocation(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
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
     * Utility function to get the Compression Level of the Block
     *
     * @param registryName Name of the Block.
     * @return Compression Level of the Block.
     */
    public static String compressionLevel(String registryName) {
        String str = registryName.substring(0, 2);
        return switch (str) {
            case "c0" -> "Compressed ";
            case "c1" -> "Double Compressed ";
            case "c2" -> "Triple Compressed ";
            case "c3" -> "Quadruple Compressed ";
            case "c4" -> "Quintuple Compressed ";
            case "c5" -> "Sextuple Compressed ";
            case "c6" -> "Septuple Compressed ";
            case "c7" -> "Octuple Compressed ";
            case "c8" -> "Mega Compressed ";
            case "c9" -> "Giga Compressed ";
            default -> "";
        };
    }

    /**
     * Utility function to get the Clean Name of the Block
     *
     * @param resourceLocation Name of the Block.
     * @return Clean Name of the Block.
     */
    public static String getCleanName(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
        blockName = removeCompressionName(blockName);
        return "block/" + blockName;
    }

    // kelp

    /**
     * Utility function to check if the resources of a block has been added manually
     *
     * @param blockName Name of the block.
     * @return true if the resources has been added manually.
     */
    public static boolean isBlock(String blockName) {
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
    public static boolean isRotational(String blockName) {
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
}
