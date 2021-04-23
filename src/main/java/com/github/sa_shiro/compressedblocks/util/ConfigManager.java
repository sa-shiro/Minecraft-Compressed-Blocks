package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static final Logger LOGGER = LogManager.getLogger();
    private static String CONFIG_ENABLED_BLOCKS;
    private static String CONFIG_COMPRESSION_LEVEL;

    public static void init(String... filePath) {
        CONFIG_ENABLED_BLOCKS = filePath[0];
        CONFIG_COMPRESSION_LEVEL = filePath[1];
        LOGGER.info("Initialized configuration.");
    }

    public static void createConfig() throws IOException {
        Map<String, Object> map1 = new HashMap<>();
        Map<String, Object> map2 = new HashMap<>();
        for (BlockFactory factory : Lists.blockList) {
            // Preventing stone to be disabled for the ItemGroup icon
            if (!factory.getRegistryName().equals("stone")) map1.put(factory.getRegistryName(), true);
        }

        map2.put("maximum_compression_level", 9);

        Writer writer1 = new FileWriter(CONFIG_ENABLED_BLOCKS);
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        gson1.toJson(map1, writer1);
        writer1.close();

        Writer writer2 = new FileWriter(CONFIG_COMPRESSION_LEVEL);
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        gson2.toJson(map2, writer2);
        writer2.close();
        LOGGER.info("Created configuration files.");
    }

    public static boolean isBlockEnabled(String registryName) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(CONFIG_ENABLED_BLOCKS));
        JsonObject config = new JsonParser().parse(reader).getAsJsonObject();
        reader.close();
        // Preventing stone to be read from config for the ItemGroup icon
        if (registryName.equals("stone")) return true;
        else return config.get(registryName).getAsBoolean();
    }

    public static int getMaxCompressionLevel() throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(CONFIG_COMPRESSION_LEVEL));
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
