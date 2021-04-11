package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static final String configFile = Minecraft.getInstance().gameDir.getAbsolutePath() + "\\config\\compressedblocks.json";

    public static void init() throws IOException {
        Map<String, Object> map = new HashMap<>();
        for (BlockFactory factory : Lists.blockList) {
            // Preventing stone to be disabled for the ItemGroup icon
            if (!factory.getRegistryName().equals("stone")) map.put(factory.getRegistryName(), true);
        }

        Writer writer = new FileWriter(configFile);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(map, writer);
        writer.close();
    }

    public static boolean isBlockEnabled(String registryName) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get(configFile));
        JsonObject jsonObject = new JsonParser().parse(reader).getAsJsonObject();
        reader.close();
        // Preventing stone to be read from config for the ItemGroup icon
        if (registryName.equals("stone")) return true;
        else return jsonObject.get(registryName).getAsBoolean();
    }
}
