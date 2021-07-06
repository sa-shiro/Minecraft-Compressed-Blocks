package com.github.sa_shiro.compressedblocks.block;

import com.github.sa_shiro.compressedblocks.util.Lists;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BlockReader {
    public static BlockReader INSTANCE = new BlockReader();
    public List<BlockManager> blocks;


    public void init() {
        try {
            File file = new File(FMLPaths.CONFIGDIR.get().resolve("") + "/compressedblocks_list.json");

            if (!file.exists()) {
                Writer writer = Files.newBufferedWriter(Paths.get(String.valueOf(file)));
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                ArrayList<BlockManager> blocks = new ArrayList<>();
                for (BlockFactory factory : Lists.blockList) {
                    TreeMap<String, String> map = new TreeMap<>();
                    map.put("all", factory.getCustomTexture(BlockFactory.TextureLocation.ALL));
                    map.put("particle", factory.getCustomTexture(BlockFactory.TextureLocation.PARTICLE));
                    map.put("up", factory.getCustomTexture(BlockFactory.TextureLocation.UP));
                    map.put("down", factory.getCustomTexture(BlockFactory.TextureLocation.DOWN));
                    map.put("north", factory.getCustomTexture(BlockFactory.TextureLocation.NORTH));
                    map.put("south", factory.getCustomTexture(BlockFactory.TextureLocation.SOUTH));
                    map.put("east", factory.getCustomTexture(BlockFactory.TextureLocation.EAST));
                    map.put("west", factory.getCustomTexture(BlockFactory.TextureLocation.WEST));

                    MaterialColor color;
                    if (factory.getMaterialColor() != null) {
                        color = factory.getMaterialColor();
                    } else color = factory.getMaterial().getColor();

                    blocks.add(new BlockManager(
                            true,
                            9,
                            factory.getTexturePath(),
                            factory.getRegistryName(),
                            factory.getType(),
                            factory.getMaterial(),
                            color,
                            "",
                            map));

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

/*
        block.setParentTexture("block/block");
        block.setMaxCompressionLevel(0);
        block.setModId("minecraft");
        block.setTexture("particle", "stone");
        block.setTexture("up", "stone");
        block.setTexture("down", "stone");
        block.setTexture("north", "stone");
        block.setTexture("south", "stone");
        block.setTexture("east", "stone");
        block.setTexture("west", "stone");


        manager.add(block);
        String json = gson.toJson(manager);

        try {
            FileWriter writer = new FileWriter(FMLPaths.CONFIGDIR.get().resolve("compressedblocks") + "/test.json");
            writer.write(json);
            writer.close();
        } catch (IOException ignored) {

        }
    }
 */
}