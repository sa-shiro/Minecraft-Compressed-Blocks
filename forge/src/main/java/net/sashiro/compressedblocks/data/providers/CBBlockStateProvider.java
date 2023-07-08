package net.sashiro.compressedblocks.data.providers;

import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
public class CBBlockStateProvider extends BlockStateProvider {
    public CBBlockStateProvider(DataGenerator generator, ExistingFileHelper exFileHelper) {
        super(generator, MOD_ID, exFileHelper);
    }
    
    @Override
    protected void registerStatesAndModels() {
        ModelFile.UncheckedModelFile blockBlock = new ModelFile.UncheckedModelFile("block/block");
        ModelFile.UncheckedModelFile cubeColumn = new ModelFile.UncheckedModelFile("block/cube_column");
        ModelFile.UncheckedModelFile cubeColumnHorizontal = new ModelFile.UncheckedModelFile("block/cube_column_horizontal");
        
        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            if (block.get().getDescriptionId().contains("honey_block") || block.get().getDescriptionId().contains("basalt"))
                continue;
            if (block.get().getDescriptionId().contains("_log")) {
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
        
        for (RegistryObject<Block> block : CBRegistryEvent.CRATE_BLOCKS.getEntries()) {
            String crate_name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            String mc_name = getMCName(crate_name);
            ResourceLocation location = new ResourceLocation("item/" + mc_name);
            
            if (mc_name.contains("rail")
                    || mc_name.contains("torch")
                    || mc_name.contains("lightning_rod")
                    || mc_name.contains("end_rod")
                    || mc_name.contains("anvil")
                    || mc_name.contains("sapling")
                    || mc_name.contains("mushroom")
                    || mc_name.contains("fungus")
                    || mc_name.contains("dandelion")
                    || mc_name.contains("poppy")
                    || mc_name.contains("orchid")
                    || mc_name.contains("allium")
                    || mc_name.contains("bluet")
                    || mc_name.contains("tulip")
                    || mc_name.contains("daisy")
                    || mc_name.contains("cornflower")
                    || mc_name.contains("valley")
                    || mc_name.contains("rose")
                    || mc_name.contains("turtle")
                    || mc_name.contains("cobweb")
            )
                location = new ResourceLocation("block/" + mc_name);
            if (mc_name.contains("sunflower")) location = new ResourceLocation("block/sunflower_front");
            if (mc_name.contains("lilac")) location = new ResourceLocation("block/lilac_top");
            if (mc_name.contains("rose_bush")) location = new ResourceLocation("block/rose_bush_top");
            if (mc_name.contains("peony")) location = new ResourceLocation("block/peony_top");
            if (mc_name.contains("carpet"))
                location = new ResourceLocation("block/" + mc_name.replace("carpet", "wool"));
            
            simpleBlock(
                    block.get(), models().cubeAll(
                                    crate_name,
                                    new ResourceLocation(MOD_ID, "block/crate")
                            )
                            .texture("particle", new ResourceLocation(MOD_ID, "block/crate"))
                            .texture("item", location)
                            .texture("number", getCrateLevel(block.get().getDescriptionId()))
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
        }
    }
    
    private String getMCName(String crateName) {
        crateName = crateName.replace("item.compressedblocks.", "");
        if (crateName.startsWith("crated_")) crateName = crateName.replace("crated_", "");
        else if (crateName.startsWith("double_crated_")) crateName = crateName.replace("double_crated_", "");
        else if (crateName.startsWith("triple_crated_")) crateName = crateName.replace("triple_crated_", "");
        else if (crateName.startsWith("quadruple_crated_")) crateName = crateName.replace("quadruple_crated_", "");
        else if (crateName.startsWith("quintuple_crated_")) crateName = crateName.replace("quintuple_crated_", "");
        else if (crateName.startsWith("sextuple_crated_")) crateName = crateName.replace("sextuple_crated_", "");
        else if (crateName.startsWith("septuple_crated_")) crateName = crateName.replace("septuple_crated_", "");
        else if (crateName.startsWith("octuple_crated_")) crateName = crateName.replace("octuple_crated_", "");
        else if (crateName.startsWith("mega_crated_")) crateName = crateName.replace("mega_crated_", "");
        else if (crateName.startsWith("giga_crated_")) crateName = crateName.replace("giga_crated_", "");
        
        return crateName;
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
    
    private ResourceLocation getCrateLevel(String blockName) {
        String overlay;
        blockName = blockName.replace("block.compressedblocks.", "");
        if (blockName.startsWith("crated_")) overlay = "level_0";
        else if (blockName.startsWith("double_crated_")) overlay = "level_1";
        else if (blockName.startsWith("triple_crated_")) overlay = "level_2";
        else if (blockName.startsWith("quadruple_crated_")) overlay = "level_3";
        else if (blockName.startsWith("quintuple_crated_")) overlay = "level_4";
        else if (blockName.startsWith("sextuple_crated_")) overlay = "level_5";
        else if (blockName.startsWith("septuple_crated_")) overlay = "level_6";
        else if (blockName.startsWith("octuple_crated_")) overlay = "level_7";
        else if (blockName.startsWith("mega_crated_")) overlay = "level_8";
        else if (blockName.startsWith("giga_crated_")) overlay = "level_9";
        else overlay = "level_0";
        return new ResourceLocation("compressedblocks", "block/" + overlay);
    }
}