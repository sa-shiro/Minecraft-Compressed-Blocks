package net.sashiro.compressedblocks.data.providers;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
public class CBBlockStateProvider extends BlockStateProvider {
    private final GenUtils utils = new GenUtils();

    public CBBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile("block/cube_column");
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile("block/cube_column_horizontal");

        for (DeferredHolder<Block, ? extends Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            // exclude manually added resources
            if (utils.isBlock(block)) continue;
            if (block.get().getDescriptionId().contains("_log") || block.get().getDescriptionId().contains("_stem")) {
                RotatedPillarBlock block1 = (RotatedPillarBlock) block.get();

                axisBlock(
                        block1, models().cubeColumn(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        utils.getActualResourceLocation(block.get().getDescriptionId()), new ResourceLocation("minecraft", utils.getCleanName(block.get().getDescriptionId()) + "_top")
                                )
                                .texture("particle", utils.getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", utils.getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumn)
                                .renderType("cutout")
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
                                        utils.getActualResourceLocation(block.get().getDescriptionId()), new ResourceLocation("minecraft", utils.getCleanName(block.get().getDescriptionId()) + "_top")
                                )
                                .texture("particle", utils.getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", utils.getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(cubeColumnHorizontal)
                                .renderType("cutout")
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
            } else {
                simpleBlock(
                        block.get(), models().cubeAll(
                                        block.get().getDescriptionId().replace("block.compressedblocks.", ""),
                                        utils.getActualResourceLocation(block.get().getDescriptionId())
                                )
                                .texture("particle", utils.getActualResourceLocation(block.get().getDescriptionId()))
                                .texture("overlay", utils.getCompressionOverlay(block.get().getDescriptionId()))
                                .parent(blockBlock)
                                .renderType("cutout")
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

        for (DeferredHolder<Block, ? extends Block> crateBlock : CBRegistryEvent.CRATE_BLOCKS.getEntries()) {
            String crate_name = crateBlock.get().getDescriptionId().replace("block.compressedblocks.", "");
            String mc_name = utils.getMCName(crate_name);
            ResourceLocation location = utils.getResourceLocation(mc_name);
            RotatedPillarBlock rotatedPillarBlock = (RotatedPillarBlock) crateBlock.get();

            simpleBlock(
                    crateBlock.get(), models().cubeAll(
                                    crate_name,
                                    new ResourceLocation(MOD_ID, "block/crate")
                            )
                            .texture("particle", new ResourceLocation(MOD_ID, "block/crate"))
                            .texture("item", location)
                            .texture("number", utils.getCrateOverlay(crateBlock.get().getDescriptionId()))
                            .parent(blockBlock)
                            .renderType("cutout")
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
                            .face(Direction.NORTH).texture("#item").end()
                            .face(Direction.EAST).texture("#number").end()
                            .end()
            );

            //axisBlock(
            //        rotatedPillarBlock, models().cubeColumn(
            //                        crate_name,
            //                        // texture keys: side, end
            //                        new ResourceLocation(MOD_ID, "block/crate"), utils.getCrateOverlay(crateBlock.get().getDescriptionId())
            //                )
            //                .texture("particle", new ResourceLocation(MOD_ID, "block/crate"))
            //                .texture("item", location)
            //                .parent(cubeColumn)
            //                .renderType("cutout")
            //                .element()
            //                .face(Direction.DOWN).texture("#side").end()
            //                .face(Direction.UP).texture("#side").end()
            //                .face(Direction.NORTH).texture("#side").end()
            //                .face(Direction.SOUTH).texture("#side").end()
            //                .face(Direction.EAST).texture("#side").end()
            //                .face(Direction.WEST).texture("#side").end()
            //                .end()
            //                .element()
            //                .face(Direction.SOUTH).texture("#item").end()
            //                .face(Direction.WEST).texture("#end").end()
            //                .end()
            //        , models().cubeColumnHorizontal(
            //                        crate_name + "_horizontal",
            //                        // texture keys: side, end
            //                        new ResourceLocation(MOD_ID, "block/crate"), utils.getCrateOverlay(crateBlock.get().getDescriptionId())
            //                )
            //                .texture("particle", new ResourceLocation(MOD_ID, "block/crate"))
            //                .texture("item", location)
            //                .parent(cubeColumnHorizontal)
            //                .renderType("cutout")
            //                .element()
            //                .face(Direction.DOWN).texture("#side").end()
            //                .face(Direction.UP).texture("#side").end()
            //                .face(Direction.NORTH).texture("#side").end()
            //                .face(Direction.SOUTH).texture("#side").end()
            //                .face(Direction.EAST).texture("#side").end()
            //                .face(Direction.WEST).texture("#side").end()
            //                .end()
            //                .element()
            //                .face(Direction.NORTH).texture("#item").end()
            //                .face(Direction.EAST).texture("#end").end()
            //                .end()
            //);
        }
    }
}