package net.sashiro.compressedblocks.data.providers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.util.StringUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Utilities for Data Generation
 */
@SuppressWarnings("RedundantIfStatement")
public class GenUtils {
    protected boolean isBlock(RegistryObject<Block> block) {
        String blockName = block.get().getDescriptionId();

        if (blockName.contains("honey_block")) return true;
        if (blockName.contains("basalt")) return true;
        if (blockName.contains("bone_block")) return true;
        return false;
    }

    protected ResourceLocation getCrateLevel(String blockName) {
        String overlay;
        blockName = blockName.replace("block.compressedblocks.", "");
        if (blockName.startsWith("crated_")) overlay = "level_0";
        else if (blockName.startsWith("double_crated_")) overlay = "level_1";
        else if (blockName.startsWith("triple_crated_")) overlay = "level_2";
        else if (blockName.startsWith("quadruple_crated_")) overlay = "level_3";
        else if (blockName.startsWith("quintuple_crated_")) overlay = "level_4";
        else if (blockName.startsWith("sextuple_crated_")) overlay = "level_5";
        else if (blockName.startsWith("septuple_crated_")) overlay = "level_6";
        else if (blockName.startsWith("octuple_crated_")) overlay = "level_7";
        else if (blockName.startsWith("mega_crated_")) overlay = "level_8";
        else if (blockName.startsWith("giga_crated_")) overlay = "level_9";
        else overlay = "level_0";
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }

    protected ResourceLocation getCompressionOverlay(String blockName) {
        String overlay;
        if (blockName.contains("c0")) overlay = "compression_level_0";
        else if (blockName.contains("c1")) overlay = "compression_level_1";
        else if (blockName.contains("c2")) overlay = "compression_level_2";
        else if (blockName.contains("c3")) overlay = "compression_level_3";
        else if (blockName.contains("c4")) overlay = "compression_level_4";
        else if (blockName.contains("c5")) overlay = "compression_level_5";
        else if (blockName.contains("c6")) overlay = "compression_level_6";
        else if (blockName.contains("c7")) overlay = "compression_level_7";
        else if (blockName.contains("c8")) overlay = "compression_level_8";
        else if (blockName.contains("c9")) overlay = "compression_level_9";
        else overlay = "compression_level_0";
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }

    protected String getCleanName(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
        blockName = StringUtils.removeCompressionName(blockName);
        return "block/" + blockName;
    }

    protected ResourceLocation getActualResourceLocation(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
        blockName = StringUtils.removeCompressionName(blockName);

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

        return new ResourceLocation("minecraft", "block/" + blockName);
    }

    protected String getMCName(String crateName) {
        crateName = crateName.replace("item.compressedblocks.", "");
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

    @NotNull
    protected ResourceLocation getResourceLocation(String mc_name) {
        ResourceLocation location = new ResourceLocation("item/" + mc_name);

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
        )
            location = new ResourceLocation("block/" + mc_name);
        if (mc_name.contains("sunflower")) location = new ResourceLocation("block/sunflower_front");
        if (mc_name.contains("lilac")) location = new ResourceLocation("block/lilac_top");
        if (mc_name.contains("rose_bush")) location = new ResourceLocation("block/rose_bush_top");
        if (mc_name.contains("peony")) location = new ResourceLocation("block/peony_top");
        if (mc_name.contains("carpet"))
            location = new ResourceLocation("block/" + mc_name.replace("carpet", "wool"));
        return location;
    }
}
