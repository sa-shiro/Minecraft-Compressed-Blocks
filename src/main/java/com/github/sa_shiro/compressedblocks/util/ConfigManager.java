package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    public static void init() throws IOException {
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        for (BlockFactory factory : Lists.blockList) {
            // Preventing stone to be disabled for the ItemGroup icon
            if (!factory.getRegistryName().equals("stone")) map1.put(factory.getRegistryName(), true);
        }
        for (BlockFactory factory : Lists.mekanismBlockList) {
            map1.put(factory.getRegistryName(), true);
        }

        map2.put("maximum_compression_level", 9);

        Writer writer1 = new FileWriter(CompressedBlocks.CONFIG_ENABLED_BLOCKS);
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        gson1.toJson(map1, writer1);
        writer1.close();

        Writer writer2 = new FileWriter(CompressedBlocks.CONFIG_COMPRESSION_LEVEL);
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        gson2.toJson(map2, writer2);
        writer2.close();
    }

    public static boolean isBlockEnabled(String registryName) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(CompressedBlocks.CONFIG_ENABLED_BLOCKS));
        JsonObject config = new JsonParser().parse(reader).getAsJsonObject();
        reader.close();
        // Preventing stone to be read from config for the ItemGroup icon
        if (registryName.equals("stone")) return true;
        else return config.get(registryName).getAsBoolean();
    }

    public static int getMaxCompressionLevel() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(CompressedBlocks.CONFIG_COMPRESSION_LEVEL));
        JsonObject config = new JsonParser().parse(reader).getAsJsonObject();
        reader.close();
        int i = config.get("maximum_compression_level").getAsInt();
        if (i < 0)
            return 0;
        else if (i > 9)
            return 9;
        else return i;
    }
}
