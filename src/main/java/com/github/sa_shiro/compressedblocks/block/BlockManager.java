package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import java.util.TreeMap;

public class BlockManager {

    boolean isEnabled;
    int maxCompressionLevel;
    String modId;
    String registryName;
    String parentTexture;
    BlockType blockType;
    Material material;
    MaterialColor materialColor;
    TreeMap<String, String> textures;

    public BlockManager(boolean isEnabled, int maxCompressionLevel, String modId, String registryName, BlockType blockType, Material material, MaterialColor materialColor, String parentTexture, TreeMap<String, String> textures) {
        this.isEnabled = isEnabled;
        this.maxCompressionLevel = maxCompressionLevel;
        this.modId = modId;
        this.registryName = registryName;
        this.blockType = blockType;
        this.material = material;
        this.materialColor = materialColor;
        this.parentTexture = parentTexture;
        this.textures = textures;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public String getRegistryName() {
        return registryName;
    }

    public int getMaxCompressionLevel() {
        return maxCompressionLevel;
    }

    public String getModId() {
        return modId;
    }

    public String getParentTexture() {
        return parentTexture;
    }

    public String getTexture(String path) {
        return textures.get(path);
    }

    public BlockType getBlockType() {
        return blockType;
    }

    public Material getMaterial() {
        return material;
    }

    public MaterialColor getMaterialColor() {
        return materialColor;
    }

    public TreeMap<String, String> getTextures() {
        return textures;
    }
}
