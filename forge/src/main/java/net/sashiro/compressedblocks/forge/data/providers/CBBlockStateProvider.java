package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.block.CrateBlock;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.util.CommonUtils;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("removal")
public class CBBlockStateProvider extends BlockStateProvider {

    public CBBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_block"));
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column"));
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column_horizontal"));

        for (RegistryObject<Block> block : CompressedBlocksForge.BLOCKS.getEntries()) {
            String descriptionId = block.get().getDescriptionId();
            // exclude manually added resources
            if (CommonUtils.isBlock(descriptionId)) continue;
            // Rotational Blocks
            if (CommonUtils.isRotational(descriptionId)) {
                RotatedPillarBlock block1 = (RotatedPillarBlock) block.get();
                ResourceLocation side = CommonUtils.getActualResourceLocation(descriptionId);
                ResourceLocation end = ResourceLocation.fromNamespaceAndPath("minecraft", CommonUtils.getCleanName(descriptionId) + "_top");

                if (descriptionId.contains("froglight") || descriptionId.contains("hay") || descriptionId.contains("melon") || descriptionId.contains("pumpkin")) {
                    side = ResourceLocation.fromNamespaceAndPath("minecraft", side.getPath() + "_side");
                }

                axisBlock(
                        block1, models().cubeColumn(
                                        descriptionId.replace("block.compressedblocks.", ""),
                                        side,
                                        end
                                )
                                .texture("particle", side)
                                .texture("overlay", CommonUtils.getOverlay(descriptionId))
                                .parent(cubeColumn)
                                .renderType("cutout")
                        , models().cubeColumnHorizontal(
                                        descriptionId.replace("block.compressedblocks.", "") + "_horizontal",
                                        side,
                                        end
                                )
                                .texture("particle", side)
                                .texture("overlay", CommonUtils.getOverlay(descriptionId))
                                .parent(cubeColumnHorizontal)
                                .renderType("cutout")
                );
            }
            // Default Blocks
            else {
                simpleBlock(
                        block.get(), models().cubeAll(
                                        descriptionId.replace("block.compressedblocks.", ""),
                                        CommonUtils.getActualResourceLocation(descriptionId)
                                )
                                .texture("particle", CommonUtils.getActualResourceLocation(descriptionId))
                                .texture("overlay", CommonUtils.getOverlay(descriptionId))
                                .parent(blockBlock)
                                .renderType("cutout")
                );
            }
        }

        for (RegistryObject<Block> crateBlock : CompressedBlocksForge.CRATE_BLOCKS.getEntries()) {
            String descriptionId = crateBlock.get().getDescriptionId();
            String crate_name = descriptionId.replace("block.compressedblocks.", "");
            String mc_name = CommonUtils.getMCName(crate_name);
            ResourceLocation location = CommonUtils.getResourceLocation(mc_name);
            CrateBlock rotatedPillarBlock = (CrateBlock) crateBlock.get();

            horizontalBlock(
                    rotatedPillarBlock,
                    models().withExistingParent(crate_name, ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column_crate"))
                            .texture("all", ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/crate"))
                            .texture("item", location)
                            .texture("number", CommonUtils.getOverlay(descriptionId))
                            .renderType("cutout")
            );
        }
    }
}