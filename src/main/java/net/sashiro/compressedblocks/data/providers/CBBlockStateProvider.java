package net.sashiro.compressedblocks.data.providers;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

@SuppressWarnings("unused")
public class CBBlockStateProvider extends BlockStateProvider {
    public CBBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, CompressedBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile("block/cube_column");
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile("block/cube_column_horizontal");

        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            if (block.get().getDescriptionId().contains("basalt")) {
                RotatedPillarBlock block1 = (RotatedPillarBlock) block.get();
                axisBlock(
                        block1, models().cubeColumn(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        new ResourceLocation("block/basalt_side"), new ResourceLocation("block/basalt_top")
                                )
                                .texture("particle", new ResourceLocation("block/basalt_side"))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumn)
                                .renderType("translucent")
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#end").end()
                                .face(Direction.UP).texture("#end").end()
                                .face(Direction.NORTH).texture("#side").end()
                                .face(Direction.SOUTH).texture("#side").end()
                                .face(Direction.EAST).texture("#side").end()
                                .face(Direction.WEST).texture("#side").end()
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
                        , models().cubeColumn(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", "") + "_horizontal",
                                        new ResourceLocation("block/basalt_side"), new ResourceLocation("block/basalt_top")
                                )
                                .texture("particle", new ResourceLocation("block/basalt_side"))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumnHorizontal)
                                .renderType("translucent")
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#end").end()
                                .face(Direction.UP).texture("#end").end()
                                .face(Direction.NORTH).texture("#side").end()
                                .face(Direction.SOUTH).texture("#side").end()
                                .face(Direction.EAST).texture("#side").end()
                                .face(Direction.WEST).texture("#side").end()
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
            } else if (block.get().getDescriptionId().contains("_log")) {
                RotatedPillarBlock block1 = (RotatedPillarBlock) block.get();
                axisBlock(
                        block1, models().cubeColumn(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        getActualResourceLocation(block.get().getDescriptionId()), new ResourceLocation("minecraft", getCleanName(block.get().getDescriptionId()) + "_top")
                                )
                                .texture("particle", getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumn)
                                .renderType("translucent")
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#end").end()
                                .face(Direction.UP).texture("#end").end()
                                .face(Direction.NORTH).texture("#side").end()
                                .face(Direction.SOUTH).texture("#side").end()
                                .face(Direction.EAST).texture("#side").end()
                                .face(Direction.WEST).texture("#side").end()
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
                        , models().cubeColumnHorizontal(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", "") + "_horizontal",
                                        getActualResourceLocation(block.get().getDescriptionId()), new ResourceLocation("minecraft", getCleanName(block.get().getDescriptionId()) + "_top")
                                )
                                .texture("particle", getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumnHorizontal)
                                .renderType("translucent")
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.DOWN).texture("#end").end()
                                .face(Direction.UP).texture("#end").end()
                                .face(Direction.NORTH).texture("#side").end()
                                .face(Direction.SOUTH).texture("#side").end()
                                .face(Direction.EAST).texture("#side").end()
                                .face(Direction.WEST).texture("#side").end()
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
            } else if (block.get().getDescriptionId().contains("honey_block")) {
                simpleBlock(
                        block.get(), models().cubeBottomTop(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        new ResourceLocation("minecraft", "block/honey_block_side"),
                                        new ResourceLocation("minecraft", "block/honey_block_bottom"),
                                        new ResourceLocation("minecraft", "block/honey_block_top")
                                )
                                .texture("particle", new ResourceLocation("minecraft", "block/honey_block_top"))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(blockBlock)
                                .renderType("translucent")
                                .element()
                                .from(0, 0, 0)
                                .to(16, 16, 16)
                                .face(Direction.UP).texture("#bottom").cullface(Direction.DOWN).end()
                                .face(Direction.DOWN).texture("#bottom").cullface(Direction.UP).end()
                                .face(Direction.NORTH).texture("#bottom").cullface(Direction.NORTH).end()
                                .face(Direction.SOUTH).texture("#bottom").cullface(Direction.SOUTH).end()
                                .face(Direction.EAST).texture("#bottom").cullface(Direction.EAST).end()
                                .face(Direction.WEST).texture("#bottom").cullface(Direction.WEST).end()
                                .end()
                                .element()
                                .from(1, 1, 1)
                                .to(15, 15, 15)
                                .face(Direction.DOWN).texture("#bottom").end()
                                .face(Direction.UP).texture("#top").end()
                                .face(Direction.NORTH).texture("#side").end()
                                .face(Direction.SOUTH).texture("#side").end()
                                .face(Direction.EAST).texture("#side").end()
                                .face(Direction.WEST).texture("#side").end()
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
            } else {
                simpleBlock(
                        block.get(), models().cubeAll(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        getActualResourceLocation(block.get().getDescriptionId())
                                )
                                .texture("particle", getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(blockBlock)
                                .renderType("translucent")
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
            }
        }
    }

    private ResourceLocation getActualResourceLocation(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
        for (int i = 0; i < 10; i++) {
            if (blockName.contains("c" + i))
                blockName = blockName.replace("c" + i + "_", "");
        }
        return new ResourceLocation("minecraft", "block/" + blockName);
    }

    private String getCleanName(String resourceLocation) {
        String blockName = resourceLocation.replace("block.compressedblocks.", "");
        for (int i = 0; i < 10; i++) {
            if (blockName.contains("c" + i))
                blockName = blockName.replace("c" + i + "_", "");
        }
        return "block/" + blockName;
    }

    private ResourceLocation getCompressionOverlay(String blockName) {
        String overlay;
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
        else overlay = "compression_level_0";
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }
}