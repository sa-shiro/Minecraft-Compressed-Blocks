package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

public class GenBlockStateProvider extends BlockStateProvider {
    public GenBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, CompressedBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        assert false;

        for (RegistryObject<Block> block : RegistryEvent.BLOCK_REGISTRY) {
            String blockName = block.get().getRegistryName().toString().replace("compressedblocks:", "");
            if (!blockName.contains("grass") && !blockName.contains("ancient_debris")) {
                simpleBlock(
                        block.get().getBlock(), models().cubeAll(
                                block.get().getRegistryName().toString(),
                                getActualResourceLocation(block.get().getRegistryName().toString())
                        )
                                .texture("particle", getActualResourceLocation(block.get().getRegistryName().toString()))
                                .texture("overlay", getCompressionOverlay(block.get().getRegistryName().toString()))
                                .parent(blockBlock)
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#all").end()
                                .face(Direction.UP).texture("#all").end()
                                .face(Direction.NORTH).texture("#all").end()
                                .face(Direction.SOUTH).texture("#all").end()
                                .face(Direction.EAST).texture("#all").end()
                                .face(Direction.WEST).texture("#all").end()
                                .end()
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#overlay").end()
                                .face(Direction.UP).texture("#overlay").end()
                                .face(Direction.NORTH).texture("#overlay").end()
                                .face(Direction.SOUTH).texture("#overlay").end()
                                .face(Direction.EAST).texture("#overlay").end()
                                .face(Direction.WEST).texture("#overlay").end()
                                .end()
                );
            } else if (blockName.contains("grass")) {
                simpleBlock(
                        block.get().getBlock(), models().cubeAll(
                                block.get().getRegistryName().toString(),
                                new ResourceLocation("compressedblocks", "block/grass_side")
                        )
                                .texture("particle", new ResourceLocation("compressedblocks", "block/grass_bottom"))
                                .texture("top", new ResourceLocation("compressedblocks", "block/grass_top"))
                                .texture("bottom", new ResourceLocation("compressedblocks", "block/grass_bottom"))
                                .texture("overlay", getCompressionOverlay(block.get().getRegistryName().toString()))
                                .parent(blockBlock)
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#bottom").end()
                                .face(Direction.UP).texture("#top").end()
                                .face(Direction.NORTH).texture("#all").end()
                                .face(Direction.SOUTH).texture("#all").end()
                                .face(Direction.EAST).texture("#all").end()
                                .face(Direction.WEST).texture("#all").end()
                                .end()
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#overlay").end()
                                .face(Direction.UP).texture("#overlay").end()
                                .face(Direction.NORTH).texture("#overlay").end()
                                .face(Direction.SOUTH).texture("#overlay").end()
                                .face(Direction.EAST).texture("#overlay").end()
                                .face(Direction.WEST).texture("#overlay").end()
                                .end()
                );
            } else if (blockName.contains("ancient_debris")) {
                simpleBlock(
                        block.get().getBlock(), models().cubeAll(block.get().getRegistryName().toString(),
                                new ResourceLocation("compressedblocks", "block/ancient_debris_side")
                        )
                                .texture("particle", new ResourceLocation("compressedblocks", "block/ancient_debris_side"))
                                .texture("top", new ResourceLocation("compressedblocks", "block/ancient_debris_top"))
                                .texture("bottom", new ResourceLocation("compressedblocks", "block/ancient_debris_top"))
                                .texture("overlay", getCompressionOverlay(block.get().getRegistryName().toString()))
                                .parent(blockBlock)
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#bottom").end()
                                .face(Direction.UP).texture("#top").end()
                                .face(Direction.NORTH).texture("#all").end()
                                .face(Direction.SOUTH).texture("#all").end()
                                .face(Direction.EAST).texture("#all").end()
                                .face(Direction.WEST).texture("#all").end()
                                .end()
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#overlay").end()
                                .face(Direction.UP).texture("#overlay").end()
                                .face(Direction.NORTH).texture("#overlay").end()
                                .face(Direction.SOUTH).texture("#overlay").end()
                                .face(Direction.EAST).texture("#overlay").end()
                                .face(Direction.WEST).texture("#overlay").end()
                                .end()
                );
            }
        }
    }

    private ResourceLocation getActualResourceLocation(String blockName) {
        for (int i = 0; i <= 9; i++) {
            blockName = blockName.replace("compressedblocks:c" + i + "_", "");
        }
        switch (blockName) {
            case "flesh_block":
                return new ResourceLocation("compressedblocks", "block/flesh");
            case "rotten_flesh_block":
                return new ResourceLocation("compressedblocks", "block/rotten_flesh");
            case "gunpowder_block":
                return new ResourceLocation("compressedblocks", "block/gunpowder");
            case "flint_block":
                return new ResourceLocation("compressedblocks", "block/flint");
            default:
                return new ResourceLocation("minecraft", "block/" + blockName);
        }
    }

    private ResourceLocation getCompressionOverlay(String blockName) {
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
}
