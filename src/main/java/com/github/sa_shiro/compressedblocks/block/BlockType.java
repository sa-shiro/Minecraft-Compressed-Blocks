package com.github.sa_shiro.compressedblocks.block;

public enum BlockType {

    DEFAULT("default"),
    SAND("sand"),
    RED_SAND("red_sand"),
    GRAVEL("gravel"),
    REDSTONE("redstone"),
    SOUL_SAND("soul_sand"),
    WOOL("wool"),
    SLIME("slime"),
    FLESH("flesh"),
    GLASS("glass"),
    MAGMA("magma");

    private final String type;

    BlockType(String typeIn) {
        type = typeIn;
    }

    public String getType() {
        return type;
    }
}
