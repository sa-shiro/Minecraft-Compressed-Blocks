package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BlockFactory {

    private final BlockType type;
    private final String registryName;
    private final int durstColor;
    private final Material material;
    private final MaterialColor materialColor;
    private final SoundType soundType;
    private String textureParticle, textureDown, textureUp, textureNorth, textureSouth, textureEast, textureWest;
    private boolean isCustom = false;

    /**
     * Utility to create new Blocks to iterate over for registering
     *
     * @param typeIn          {@link BlockType}
     * @param registryNameIn  Registry Name
     * @param materialIn      Minecraft {@link Material}
     * @param materialColorIn Minecraft {@link MaterialColor}
     * @param soundTypeIn     Minecraft {@link SoundType}
     */
    public BlockFactory(@Nonnull BlockType typeIn, @Nonnull String registryNameIn, @Nonnull Material materialIn, @Nullable MaterialColor materialColorIn, @Nonnull SoundType soundTypeIn) {
        if (materialColorIn == null) materialColorIn = materialIn.getColor();
        this.type = typeIn;
        this.registryName = registryNameIn;
        this.durstColor = 0;
        this.material = materialIn;
        this.materialColor = materialColorIn;
        this.soundType = soundTypeIn;
    }

    /**
     * Utility to create new Blocks to iterate over for registering
     *
     * @param typeIn          {@link BlockType}
     * @param registryNameIn  Registry Name
     * @param dustColorIn     Dust Color (used for sand and co)
     * @param materialIn      Minecraft {@link Material}
     * @param materialColorIn Minecraft {@link MaterialColor}
     * @param soundTypeIn     Minecraft {@link SoundType}
     */
    public BlockFactory(@Nonnull BlockType typeIn, @Nonnull String registryNameIn, int dustColorIn, @Nonnull Material materialIn, @Nullable MaterialColor materialColorIn, @Nonnull SoundType soundTypeIn) {
        if (materialColorIn == null) materialColorIn = materialIn.getColor();
        this.type = typeIn;
        this.registryName = registryNameIn;
        this.durstColor = dustColorIn;
        this.material = materialIn;
        this.materialColor = materialColorIn;
        this.soundType = soundTypeIn;
    }

    /**
     * Function to get the Block's Type
     *
     * @return {@link BlockType}
     */
    public BlockType getType() {
        return type;
    }

    /**
     * Function to get the Block's Registry Name
     *
     * @return Registry Name
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * Function to get the Block's Dust Color
     *
     * @return Dust Color
     */
    public int getDurstColor() {
        return durstColor;
    }

    /**
     * Function to get the Block's Material
     *
     * @return Minecraft {@link Material}
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Function to get the Block's Material Color
     *
     * @return {@link MaterialColor}
     */
    public MaterialColor getMaterialColor() {
        return materialColor;
    }

    /**
     * Function to get the Block's Sound Type
     *
     * @return Minecraft {@link SoundType}
     */
    public SoundType getSoundType() {
        return soundType;
    }

    /**
     * Function to set if the Block has a custom Texture
     *
     * @return this
     */
    public BlockFactory hasCustomTexture() {
        isCustom = true;
        return this;
    }

    /**
     * Function to check if the Block has a custom Texture
     *
     * @return true if it has a custom Texture set
     */
    public boolean getHasCustomTexture() {
        return isCustom;
    }

    public BlockFactory setCustomTexture(String particle, String down, String up, String north, String south, String east, String west) {
        textureParticle = particle;
        textureDown = down;
        textureUp = up;
        textureNorth = north;
        textureSouth = south;
        textureEast = east;
        textureWest = west;
        return this;
    }

    public BlockFactory setCustomSideTexture(String down, String up, String north, String south, String east, String west) {
        textureDown = down;
        textureUp = up;
        textureNorth = north;
        textureSouth = south;
        textureEast = east;
        textureWest = west;
        return this;
    }

    public BlockFactory setCustomParticleTexture(String particle) {
        textureParticle = particle;
        return this;
    }

    public String getCustomTexture(TextureLocation location) {
        switch (location) {
            case DOWN:
                return textureDown;
            case NORTH:
                return textureNorth;
            case SOUTH:
                return textureSouth;
            case EAST:
                return textureEast;
            case WEST:
                return textureWest;
            case PARTICLE:
                return textureParticle;
            case UP:
            default:
                return textureUp;
        }
    }

    public enum TextureLocation {
        PARTICLE("particle"),
        UP("up"),
        DOWN("down"),
        NORTH("north"),
        SOUTH("south"),
        EAST("east"),
        WEST("west");

        private final String textureLocation;

        TextureLocation(String typeIn) {
            textureLocation = typeIn;
        }

        public String getTextureLocation() {
            return textureLocation;
        }
    }
}
