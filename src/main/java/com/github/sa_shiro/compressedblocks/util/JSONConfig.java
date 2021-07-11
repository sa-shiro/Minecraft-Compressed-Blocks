package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONConfig {
    public static JSONConfig INSTANCE = new JSONConfig();
    public List<BlockManager> blocks;

    public void init() {
        try {
            File file = new File(FMLPaths.CONFIGDIR.get().resolve("") + "/compressedblocks_list.json");

            if (!file.exists()) {
                Writer writer = Files.newBufferedWriter(Paths.get(String.valueOf(file)));
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                ArrayList<BlockManager> blocks = new ArrayList<>();
                for (BlockFactory factory : Lists.blockList) {
                    blocks.add(new BlockManager(factory.getRegistryName(), true, 9));
                }
                gson.toJson(blocks, writer);
                writer.close();
            }

            Reader reader = Files.newBufferedReader(Paths.get(String.valueOf(file)));
            blocks = new Gson().fromJson(reader, new TypeToken<List<BlockManager>>() {
            }.getType());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class BlockManager {

        String blockName;
        boolean isEnabled;
        int maxCompressionLevel;

        public BlockManager(String blockName, boolean isEnabled, int maxCompressionLevel) {
            this.blockName = blockName;
            this.isEnabled = isEnabled;
            this.maxCompressionLevel = maxCompressionLevel;
        }

        public boolean isEnabled() {
            return isEnabled;
        }

        public String getBlockName() {
            return blockName;
        }

        public int getMaxCompressionLevel() {
            if (maxCompressionLevel > 9) maxCompressionLevel = 9;
            if (maxCompressionLevel < 0) maxCompressionLevel = 0;
            return maxCompressionLevel;
        }
    }
}
