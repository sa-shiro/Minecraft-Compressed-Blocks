package com.github.sa_shiro.compressedblocks.util;


import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class ResourceGenerator {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final File blockStatePath = Paths.get(rootPath + "/blockstates").toFile();
    private static final File langPath = Paths.get(rootPath + "/lang").toFile();
    private static final File modelRootPath = Paths.get(rootPath + "/models").toFile();
    private static final File blockModelPath = Paths.get(modelRootPath + "/block").toFile();
    private static final File itemModelPath = Paths.get(modelRootPath + "/item").toFile();
    public static File configPath = FMLPaths.CONFIGDIR.get().resolve("compressedblocks").toFile();
    private static final File rootPath = FMLPaths.CONFIGDIR.get().resolve(configPath + "/assets/compressedblocks").toFile();
    public static ResourceGenerator INSTANCE = new ResourceGenerator();


    private static ResourceLocation getCompressionOverlay(String blockName) {
        String overlay = "";
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
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }

    public void init() {
        if (configPath.exists()) {
            LOGGER.info("Deleting existing resources...");
            try {
                FileUtils.deleteDirectory(configPath);
            } catch (IOException e) {
                LOGGER.info("Failed to delete existing resources. ");
                e.printStackTrace();
            }
            LOGGER.info("Successfully deleted generated resources.");
        }

        LOGGER.info("Creating resource directories.");

        if (!configPath.exists())
            configPath.mkdirs();
        if (!rootPath.exists())
            rootPath.mkdirs();
        if (!blockStatePath.exists())
            blockStatePath.mkdirs();
        if (!langPath.exists())
            langPath.mkdirs();
        if (!modelRootPath.exists())
            modelRootPath.mkdirs();
        if (!blockModelPath.exists())
            blockModelPath.mkdirs();
        if (!itemModelPath.exists())
            itemModelPath.mkdirs();

        try {
            LOGGER.info("Generating resources...");
            FileWriter packMetaWriter = new FileWriter(configPath + "/pack.mcmeta");
            packMetaWriter.write("{\n" +
                    "\"pack\": {\"pack_format\": 6,\"description\": \"Compressed Blocks generated resources\"}}");
            packMetaWriter.close();
            generateFiles();
        } catch (IOException e) {
            LOGGER.info("Failed generating resources.");
            e.printStackTrace();
        }
        LOGGER.info("Successfully generated all resources.");
    }

    private void generateFiles() throws IOException {
        for (BlockFactory factory : Lists.blockList) {
            for (int i = 0; i <= ForgeConfigManager.maxCompressionLevel.get(); i++) {
                String name = "c" + i + "_" + factory.getRegistryName();
                FileWriter blockStateWriter = new FileWriter((blockStatePath + "/" + name + ".json"));
                FileWriter blockModelWriter = new FileWriter(blockModelPath + "/" + name + ".json");
                FileWriter blockItemWriter = new FileWriter((itemModelPath + "/" + name + ".json"));


                if (factory.getHasRotation()) {
                    blockStateWriter.write("{\n" +
                            "\"variants\": {\n" +
                            "\"axis=x\": {\n" +
                            "\"model\": \"compressedblocks:block/" + name + "_horizontal\",\n" +
                            "\"x\": 90,\n" +
                            "\"y\": 90\n" +
                            "},\n" +
                            "\"axis=y\": {\n" +
                            "\"model\": \"compressedblocks:block/" + name + "\"\n" +
                            "},\n" +
                            "\"axis=z\": {\n" +
                            "\"model\": \"compressedblocks:block/" + name + "_horizontal\",\n" +
                            "\"x\": 90\n" +
                            "}}}");
                } else {
                    blockStateWriter.write("{\"variants\": {\"\": {\"model\": \"compressedblocks:block/" + name + "\"}}}");
                }
                blockStateWriter.close();

                if (factory.getHasCustomTexture() && !factory.getHasRotation())
                    blockModelWriter.write("{\n" +
                            "\"parent\": \"minecraft:block/block\",\n" +
                            "\"textures\": {\n" +
                            "\"down\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.DOWN) + "\",\n" +
                            "\"up\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.UP) + "\",\n" +
                            "\"north\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.NORTH) + "\",\n" +
                            "\"south\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.SOUTH) + "\",\n" +
                            "\"east\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.EAST) + "\",\n" +
                            "\"west\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.WEST) + "\",\n" +
                            "\"particle\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE) + "\",\n" +
                            "\"overlay\": \"" + getCompressionOverlay(name) + "\"\n" + "},\n" +
                            "\"elements\": [\n" + "{\n" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#down\"},\n" +
                            "\"up\": {\"texture\": \"#up\"},\n" +
                            "\"north\": {\"texture\": \"#north\"},\n" +
                            "\"south\": {\"texture\": \"#south\"},\n" +
                            "\"west\": {\"texture\": \"#west\"},\n" +
                            "\"east\": {\"texture\": \"#east\"}\n" +
                            "}},{" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#overlay\"},\n" +
                            "\"up\": {  \"texture\": \"#overlay\"},\n" +
                            "\"north\": {  \"texture\": \"#overlay\"},\n" +
                            "\"south\": {  \"texture\": \"#overlay\"},\n" +
                            "\"west\": {  \"texture\": \"#overlay\"},\n" +
                            "\"east\": {  \"texture\": \"#overlay\"}\n" +
                            "}}]}"
                    );
                else if (factory.getHasCustomTexture() && factory.getHasRotation())
                    blockModelWriter.write("{\n" +
                            "\"parent\": \"minecraft:block/block\",\n" +
                            "\"textures\": {\n" +
                            "\"side\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.SIDE) + "\",\n" +
                            "\"end\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.END) + "\",\n" +
                            "\"particle\": \"" + factory.getTexturePath() + ":block/" + factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE) + "\",\n" +
                            "\"overlay\": \"" + getCompressionOverlay(name) + "\"\n" + "},\n" +
                            "\"elements\": [\n" + "{\n" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#end\"},\n" +
                            "\"up\": {\"texture\": \"#end\"},\n" +
                            "\"north\": {\"texture\": \"#side\"},\n" +
                            "\"south\": {\"texture\": \"#side\"},\n" +
                            "\"west\": {\"texture\": \"#side\"},\n" +
                            "\"east\": {\"texture\": \"#side\"}\n" +
                            "}},{" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#overlay\"},\n" +
                            "\"up\": {  \"texture\": \"#overlay\"},\n" +
                            "\"north\": {  \"texture\": \"#overlay\"},\n" +
                            "\"south\": {  \"texture\": \"#overlay\"},\n" +
                            "\"west\": {  \"texture\": \"#overlay\"},\n" +
                            "\"east\": {  \"texture\": \"#overlay\"}\n" +
                            "}}]}"
                    );
                else if (!factory.getHasCustomTexture() && !factory.getHasRotation())
                    blockModelWriter.write("{\n" +
                            "\"parent\": \"minecraft:block/block\",\n" +
                            "\"textures\": {\n" +
                            "\"all\": \"" + getActualResourceLocation(factory.getRegistryName()) + "\",\n" +
                            "\"particle\": \"" + getActualResourceLocation(factory.getRegistryName()) + "\",\n" +
                            "\"overlay\": \"" + getCompressionOverlay(name) + "\"\n" + "},\n" +
                            "\"elements\": [\n" + "{\n" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#all\"},\n" +
                            "\"up\": {\"texture\": \"#all\"},\n" +
                            "\"north\": {\"texture\": \"#all\"},\n" +
                            "\"south\": {\"texture\": \"#all\"},\n" +
                            "\"west\": {\"texture\": \"#all\"},\n" +
                            "\"east\": {\"texture\": \"#all\"}\n" +
                            "}},{" +
                            "\"from\": [0,0,0],\n" +
                            "\"to\": [16,16,16],\n" +
                            "\"faces\": {\n" +
                            "\"down\": {\"texture\": \"#overlay\"},\n" +
                            "\"up\": {  \"texture\": \"#overlay\"},\n" +
                            "\"north\": {  \"texture\": \"#overlay\"},\n" +
                            "\"south\": {  \"texture\": \"#overlay\"},\n" +
                            "\"west\": {  \"texture\": \"#overlay\"},\n" +
                            "\"east\": {  \"texture\": \"#overlay\"}\n" +
                            "}}]}"
                    );

                blockModelWriter.close();

                blockItemWriter.write("{\"parent\": \"compressedblocks:block/" + name + "\"}");
                blockItemWriter.close();
            }
        }
    }

    private ResourceLocation getActualResourceLocation(String blockName) {
        switch (blockName) {
            case "flesh_block":
                return new ResourceLocation("compressedblocks", "block/flesh");
            case "rotten_flesh_block":
                return new ResourceLocation("compressedblocks", "block/rotten_flesh");
            case "gunpowder_block":
                return new ResourceLocation("compressedblocks", "block/gunpowder");
            case "flint_block":
                return new ResourceLocation("compressedblocks", "block/flint");
            case "magma_block":
                return new ResourceLocation("minecraft", "block/magma");
            default:
                return new ResourceLocation("minecraft", "block/" + blockName);
        }
    }
}