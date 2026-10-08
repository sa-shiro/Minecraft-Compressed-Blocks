package net.sashiro.compressedblocks.fabric.data.providers;

import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
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

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings({"SameParameterValue"})
public class CBModelProvider extends FabricModelProvider {
    public static final TextureSlot ITEM_SLOT = TextureSlot.create("item");
    public static final TextureSlot NUMBER_SLOT = TextureSlot.create("number");
    public static final TextureSlot OVERLAY_SLOT = TextureSlot.create("overlay");

    public static final ModelTemplate TEMPLATE_BLOCK = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/template/template_block")), Optional.empty(), TextureSlot.ALL, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CRATE = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/template/template_crate")), Optional.empty(), TextureSlot.ALL, ITEM_SLOT, NUMBER_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/template/template_cube_column")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN_HORIZONTAL = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/template/template_cube_column_horizontal")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);

    public CBModelProvider(FabricDataOutput output) {
        super(output);
    }

    private static PropertyDispatch createHorizontalFacingDispatch() {
        return PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING).select(Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.NORTH, Variant.variant());
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {

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
                ResourceLocation sideTexture = ResourceUtils.resolveVanillaBlockId(blockDescriptionId);
                ResourceLocation endTexture = ResourceLocation.fromNamespaceAndPath(sideTexture.getNamespace(), sideTexture.getPath() + "_top");

                /*
                 * Special cases for blocks that have different texture paths.
                 * For these blocks, we need to adjust the texture paths accordingly.
                 */
                if ("sandstone".equals(vanillaBlockName) || "red_sandstone".equals(vanillaBlockName) || "chiseled_quartz_block".equals(vanillaBlockName)) {
                    endTexture = ResourceLocation.withDefaultNamespace(endTexture.getPath());
                    sideTexture = ResourceLocation.withDefaultNamespace(sideTexture.getPath());
                } else if ("quartz_block".equals(vanillaBlockName) || "bone_block".equals(vanillaBlockName) || "tnt".equals(vanillaBlockName) || "honey_block".equals(vanillaBlockName) ||
                        "hay_block".equals(vanillaBlockName) || "melon".equals(vanillaBlockName) || "pumpkin".equals(vanillaBlockName) || vanillaBlockName.contains("froglight") || "basalt".equals(vanillaBlockName)) {
                    endTexture = ResourceLocation.withDefaultNamespace(endTexture.getPath());
                    sideTexture = ResourceLocation.withDefaultNamespace(sideTexture.getPath() + "_side");
                } else if ("dried_kelp_block".equals(vanillaBlockName)) {
                    endTexture = ResourceLocation.withDefaultNamespace("block/dried_kelp_top");
                    sideTexture = ResourceLocation.withDefaultNamespace("block/dried_kelp_side");
                } else if ("chiseled_sandstone".equals(vanillaBlockName) || "cut_sandstone".equals(vanillaBlockName)) {
                    endTexture = ResourceLocation.withDefaultNamespace("block/sandstone_top");
                    sideTexture = ResourceLocation.withDefaultNamespace(sideTexture.getPath());
                } else if ("cut_red_sandstone".equals(vanillaBlockName)) {
                    endTexture = ResourceLocation.withDefaultNamespace("block/red_sandstone_top");
                    sideTexture = ResourceLocation.withDefaultNamespace(sideTexture.getPath());
                }

                TextureMapping textureMapping = new TextureMapping().put(TextureSlot.END, endTexture).put(TextureSlot.SIDE, sideTexture).put(TextureSlot.PARTICLE, sideTexture).put(OVERLAY_SLOT, ResourceUtils.getOverlay(blockDescriptionId));
                TextureMapping horizontalTextureMapping = new TextureMapping().put(TextureSlot.END, endTexture).put(TextureSlot.SIDE, sideTexture).put(TextureSlot.PARTICLE, sideTexture).put(OVERLAY_SLOT, ResourceUtils.getOverlay(blockDescriptionId));
                ResourceLocation pillarModelLocation = TEMPLATE_CUBE_COLUMN.create(block, textureMapping, generator.modelOutput);
                ResourceLocation horizontalPillarModelLocation = TEMPLATE_CUBE_COLUMN_HORIZONTAL.createWithSuffix(block, "_horizontal", horizontalTextureMapping, generator.modelOutput);

                generator.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(block, pillarModelLocation, horizontalPillarModelLocation));
                generator.delegateItemModel(block, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + compressedBlockName));

            }
            /*
             * General case for blocks that are not rotational, create a trivial block model with the overlay texture.
             */
            else {
                ResourceLocation baseTexture = ResourceUtils.resolveVanillaBlockId(blockDescriptionId);
                if ("smooth_quartz".equals(vanillaBlockName)) {
                    baseTexture = ResourceLocation.withDefaultNamespace("block/quartz_block_bottom");
                }
                TextureMapping textureMapping = new TextureMapping().put(TextureSlot.ALL, baseTexture).put(OVERLAY_SLOT, ResourceUtils.getOverlay(blockDescriptionId));

                generator.createTrivialBlock(block, textureMapping, TEMPLATE_BLOCK);
                generator.delegateItemModel(block, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + compressedBlockName));
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

            // Special case for enchanted golden apple, because it uses the golden apple texture with the enchantment glint data component
            if (crateBlockName.contains("enchanted_golden_apple")) {
                vanillaBlockName = "golden_apple";
            }

            TextureMapping textureMapping = new TextureMapping().put(TextureSlot.ALL, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/crate")).put(ITEM_SLOT, ResourceUtils.resolveVanillaResource("item", vanillaBlockName)).put(NUMBER_SLOT, ResourceUtils.getOverlay(crate.getDescriptionId()));
            ResourceLocation modelLocation = TEMPLATE_CRATE.create(crate, textureMapping.copyAndUpdate(ITEM_SLOT, ResourceUtils.resolveVanillaResource("item", vanillaBlockName)), generator.modelOutput);

            generator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(crate, Variant.variant().with(VariantProperties.MODEL, modelLocation)).with(createHorizontalFacingDispatch()));
            generator.delegateItemModel(crate, ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/" + crateBlockName));
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        for (Item crate : Constants.CRATE_ITEMS) {
            String crateItemName = ResourceUtils.removeNamespace(crate.getDescriptionId());
            String vanillaItemName = ResourceUtils.removeCrateName(crateItemName);
            //Item vanillaItem = ItemStack.EMPTY.getItem();

            if (!CBConfig.CONFIG.isEnabled(vanillaItemName)) continue;

            ResourceLocation vanillaItemLocation = ResourceLocation.withDefaultNamespace(vanillaItemName);
            Item vanillaItem = BuiltInRegistries.ITEM.get(vanillaItemLocation);

            if (vanillaItem.equals(ItemStack.EMPTY.getItem()) || vanillaItem.equals(Items.AIR)) {
                vanillaItem = BuiltInRegistries.BLOCK.get(vanillaItemLocation).asItem();
            }

            // Special case for enchanted golden apple, because it uses the golden apple texture with the enchantment glint data component
            if (crateItemName.contains("enchanted_golden_apple")) {
                vanillaItemName = "golden_apple";
            }

            CrateItem crateItem = (CrateItem) crate;
            int compressionLevel = crateItem.getCompressionLevel();

            if (!vanillaItem.equals(ItemStack.EMPTY.getItem())) {
                createCrateItemModel(crate, vanillaItemName, TEMPLATE_CRATE, itemModelGenerators.output, compressionLevel);
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
    private void createCrateItemModel(Item item, String vanillaItem, ModelTemplate modelTemplate, BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput, int compressionLevel) {
        modelTemplate.create(
                ModelLocationUtils.getModelLocation(item),
                TextureMapping.particle(ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/crate"))
                        .put(TextureSlot.ALL, ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/crate"))
                        .put(ITEM_SLOT, ResourceUtils.resolveVanillaResource("item", vanillaItem))
                        .put(NUMBER_SLOT, ResourceLocation.fromNamespaceAndPath(MOD_ID, "item/level_" + compressionLevel)),
                modelOutput
        );
    }
}
