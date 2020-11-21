package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockFactory {

    private final Material material;
    private final SoundType soundType;
    private final String registryName;
    private final BlockType type;
    private final MaterialColor materialColor;

    /**
     * Utility to create new Blocks to iterate over for registering
     * @param typeIn {@link BlockType}
     * @param registryNameIn Registry Name
     * @param materialIn Minecraft {@link Material}
     * @param materialColorIn Minecraft {@link MaterialColor}
     * @param soundTypeIn Minecraft {@link SoundType}
     */
    public BlockFactory(@Nonnull BlockType typeIn, @Nonnull String registryNameIn, @Nonnull Material materialIn, @Nullable MaterialColor materialColorIn, @Nonnull SoundType soundTypeIn) {
        if(materialColorIn == null) materialColorIn = materialIn.getColor();
        this.material = materialIn;
        this.soundType = soundTypeIn;
        this.registryName = registryNameIn;
        this.type = typeIn;
        this.materialColor = materialColorIn;
    }

    /**
     * Function to get the Block's Material
     * @return Minecraft {@link Material}
     */
    public Material getMaterial() { return material; }

    /**
     * Function to get the Block's Sound Type
     * @return Minecraft {@link SoundType}
     */
    public SoundType getSoundType() { return soundType; }

    /**
     * Function to get the Block's Registry Name
     * @return Registry Name
     */
    public String getRegistryName() { return registryName; }

    /**
     * Function to get the Block's Type
     * @return {@link BlockType}
     */
    public BlockType getType() { return type; }

    /**
     * Function to get the Block's Material Color
     * @return {@link MaterialColor}
     */
    public MaterialColor getMaterialColor() { return materialColor; }
}
