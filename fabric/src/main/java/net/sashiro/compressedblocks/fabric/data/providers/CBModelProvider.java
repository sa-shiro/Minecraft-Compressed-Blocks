package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.util.ResourceUtils;
import org.jspecify.annotations.NonNull;

import java.util.Optional;
import java.util.function.BiConsumer;

import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;

@SuppressWarnings({"SameParameterValue"})
public class CBModelProvider extends FabricModelProvider {
    public static final TextureSlot ITEM_SLOT = TextureSlot.create("item");
    public static final TextureSlot BLOCK_SLOT = TextureSlot.create("block");
    public static final TextureSlot NUMBER_SLOT = TextureSlot.create("number");
    public static final TextureSlot OVERLAY_SLOT = TextureSlot.create("overlay");

    public static final ModelTemplate TEMPLATE_BLOCK = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/template/template_block")), Optional.empty(), TextureSlot.ALL, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/template/template_cube_column")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN_HORIZONTAL = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/template/template_cube_column_horizontal")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CRATE = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "item/template/template_item_crate_blockstyle")), Optional.empty(), ITEM_SLOT, NUMBER_SLOT, TextureSlot.ALL, TextureSlot.PARTICLE);
    public static final ModelTemplate TEMPLATE_CRATE_BLOCK = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath(MOD_ID, "block/template/template_crate")), Optional.empty(), TextureSlot.ALL, BLOCK_SLOT, NUMBER_SLOT);

    public CBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {

        /*
         * Generate block state models for all blocks in the Constants.BLOCKS list.
         * For each block, check if it is enabled in the configuration and if it is a rotational block.
         * If it is a rotational block, create a cube column model with horizontal variant.
         * Otherwise, create a trivial block model.
         */
        for (Block block : Constants.BLOCKS) {
            String blockDescriptionId = block.getDescriptionId();
            String compressedBlockName = ResourceUtils.removeNamespace(blockDescriptionId);
            String vanillaBlockName = ResourceUtils.removeCompressionName(compressedBlockName);

            if (!CBConfig.CONFIG.isEnabled(vanillaBlockName)) continue;

            CompressionEntry compressionEntry = CompressionCatalog.getEntryById(ResourceUtils.removeCompressionName(vanillaBlockName));
            if (compressionEntry == null) continue;

            if (compressionEntry.kind().equals(CompressionEntry.Kind.ROT_BLOCK)) {
                Identifier sideTexture = ResourceUtils.resolveVanillaBlockId(blockDescriptionId);
                Identifier endTexture = Identifier.fromNamespaceAndPath(sideTexture.getNamespace(), sideTexture.getPath() + "_top");

                /*
                 * Special cases for blocks that have different texture paths.
                 * For these blocks, we need to adjust the texture paths accordingly.
                 */
                if ("sandstone".equals(vanillaBlockName) || "red_sandstone".equals(vanillaBlockName) || "chiseled_quartz_block".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace(endTexture.getPath());
                    sideTexture = Identifier.withDefaultNamespace(sideTexture.getPath());
                } else if ("quartz_block".equals(vanillaBlockName) || "bone_block".equals(vanillaBlockName) || "tnt".equals(vanillaBlockName) || "honey_block".equals(vanillaBlockName) ||
                        "hay_block".equals(vanillaBlockName) || "melon".equals(vanillaBlockName) || "pumpkin".equals(vanillaBlockName) || vanillaBlockName.contains("froglight") || "basalt".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace(endTexture.getPath());
                    sideTexture = Identifier.withDefaultNamespace(sideTexture.getPath() + "_side");
                } else if ("dried_kelp_block".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace("block/dried_kelp_top");
                    sideTexture = Identifier.withDefaultNamespace("block/dried_kelp_side");
                } else if ("chiseled_sandstone".equals(vanillaBlockName) || "cut_sandstone".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace("block/sandstone_top");
                    sideTexture = Identifier.withDefaultNamespace(sideTexture.getPath());
                } else if ("cut_red_sandstone".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace("block/red_sandstone_top");
                    sideTexture = Identifier.withDefaultNamespace(sideTexture.getPath());
                } else if ("bookshelf".equals(vanillaBlockName)) {
                    endTexture = Identifier.withDefaultNamespace("block/oak_planks");
                    sideTexture = Identifier.withDefaultNamespace(sideTexture.getPath());
                }

                // Block Model
                TextureMapping textureMapping = new TextureMapping().put(TextureSlot.END, endTexture).put(TextureSlot.SIDE, sideTexture).put(TextureSlot.PARTICLE, sideTexture).put(OVERLAY_SLOT, ResourceUtils.getOverlay(blockDescriptionId));
                MultiVariant variant = BlockModelGenerators.plainVariant(TEMPLATE_CUBE_COLUMN.create(block, textureMapping, blockModelGenerators.modelOutput));
                // Horizontal Block Model
                TextureMapping horizontalTextureMapping = new TextureMapping().put(TextureSlot.END, endTexture).put(TextureSlot.SIDE, sideTexture).put(TextureSlot.PARTICLE, sideTexture).put(OVERLAY_SLOT, ResourceUtils.getOverlay(blockDescriptionId));
                MultiVariant horizontalVariant = BlockModelGenerators.plainVariant(TEMPLATE_CUBE_COLUMN_HORIZONTAL.createWithSuffix(block, "_horizontal", horizontalTextureMapping, blockModelGenerators.modelOutput));
                // Item Model
                blockModelGenerators.registerSimpleItemModel(block, Identifier.fromNamespaceAndPath(MOD_ID, "block/" + compressedBlockName));
                // Blockstate
                blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.AXIS).select(Direction.Axis.Y, variant).select(Direction.Axis.Z, horizontalVariant.with(BlockModelGenerators.X_ROT_90)).select(Direction.Axis.X, horizontalVariant.with(BlockModelGenerators.X_ROT_90).with(BlockModelGenerators.X_ROT_90))));

            } else {
                /*
                 * General case for blocks that are not rotational, create a trivial block model with the overlay texture.
                 */
                Identifier baseTexture = ResourceUtils.resolveVanillaBlockId(blockDescriptionId);

                // Block Model
                TextureMapping mapping = new TextureMapping().put(TextureSlot.ALL, ResourceUtils.resolveVanillaBlockId(compressedBlockName)).put(OVERLAY_SLOT, ResourceUtils.getOverlay(compressedBlockName));
                TEMPLATE_BLOCK.create(block, mapping, blockModelGenerators.modelOutput);
                // Item Model
                blockModelGenerators.registerSimpleItemModel(block, Identifier.fromNamespaceAndPath(MOD_ID, "block/" + compressedBlockName));
                // Blockstate
                blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, BlockModelGenerators.plainVariant(baseTexture)));
            }
        }

        /*
         * Generate block state models for all crate blocks in the Constants.CRATE_BLOCKS list.
         * For each crate block, check if it is enabled in the configuration.
         * If it is enabled, create a crate model with the vanilla item texture and the overlay texture.
         */
        for (Block crate : Constants.CRATE_BLOCKS) {
            String crateBlockName = ResourceUtils.removeNamespace(crate.getDescriptionId());
            String vanillaBlockName = ResourceUtils.removeCrateName(crateBlockName);

            if (!CBConfig.CONFIG.isEnabled(vanillaBlockName)) continue;

            // Block Model
            TextureMapping textureMapping = new TextureMapping().put(TextureSlot.ALL, Identifier.fromNamespaceAndPath(MOD_ID, "block/crate")).put(BLOCK_SLOT, ResourceUtils.resolveVanillaResource("block", vanillaBlockName)).put(NUMBER_SLOT, ResourceUtils.getOverlay(crate.getDescriptionId()));
            Identifier modelLocation = TEMPLATE_CRATE_BLOCK.create(crate, textureMapping.copyAndUpdate(BLOCK_SLOT, ResourceUtils.resolveVanillaResource("block", vanillaBlockName)), blockModelGenerators.modelOutput);
            // Item Model
            blockModelGenerators.registerSimpleItemModel(crate, Identifier.fromNamespaceAndPath(MOD_ID, "block/" + crateBlockName));
            // Blockstate
            blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(crate, BlockModelGenerators.plainVariant(modelLocation)));
        }
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {
        for (Item crate : Constants.CRATE_ITEMS) {
            String crateItemName = ResourceUtils.removeNamespace(crate.getDescriptionId());
            String vanillaItemName = ResourceUtils.removeCrateName(crateItemName);
            Item vanillaItem = ItemStack.EMPTY.getItem();

            if (!CBConfig.CONFIG.isEnabled(vanillaItemName)) continue;

            Identifier vanillaItemLocation = Identifier.withDefaultNamespace(vanillaItemName);
            if (BuiltInRegistries.ITEM.get(vanillaItemLocation).isPresent())
                vanillaItem = BuiltInRegistries.ITEM.get(vanillaItemLocation).get().value().asItem();

            if (vanillaItem.equals(ItemStack.EMPTY.getItem()) || vanillaItem.equals(Items.AIR) && BuiltInRegistries.BLOCK.get(vanillaItemLocation).isPresent()) {
                vanillaItem = BuiltInRegistries.BLOCK.get(vanillaItemLocation).get().value().asItem();
            }

            CrateItem crateItem = (CrateItem) crate;
            int compressionLevel = crateItem.getCompressionLevel();

            if (!vanillaItem.equals(ItemStack.EMPTY.getItem())) {
                itemModelGenerators.itemModelOutput.accept(crate, ItemModelUtils.plainModel(this.createCrateItemModel(crate, vanillaItemName, TEMPLATE_CRATE, itemModelGenerators.modelOutput, compressionLevel)));
            }
        }
    }

    /**
     * Creates a crate item model for the given item, using the specified vanilla item texture and compression level.
     *
     * @param item             The crate item for which to create the model.
     * @param vanillaItem      The name of the vanilla item to use for the texture.
     * @param modelTemplate    The model template to use for creating the model.
     * @param modelOutput      The output consumer for the generated model JSON.
     * @param compressionLevel The compression level of the crate item, used to determine the number overlay texture.
     */
    private Identifier createCrateItemModel(Item item, String vanillaItem, ModelTemplate modelTemplate, BiConsumer<Identifier, ModelInstance> modelOutput, int compressionLevel) {
        return modelTemplate.create(
                ModelLocationUtils.getModelLocation(item),
                TextureMapping.particle(Identifier.fromNamespaceAndPath(MOD_ID, "item/crate"))
                        .put(TextureSlot.ALL, Identifier.fromNamespaceAndPath(MOD_ID, "item/crate"))
                        .put(ITEM_SLOT, ResourceUtils.resolveVanillaResource("item", vanillaItem))
                        .put(NUMBER_SLOT, Identifier.fromNamespaceAndPath(MOD_ID, "item/level_" + compressionLevel)),
                modelOutput
        );
    }
}
