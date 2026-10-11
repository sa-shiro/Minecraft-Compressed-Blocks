package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.fabric.data.CBTags;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;

import java.util.Objects;
import java.util.function.Consumer;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBAdvancementProvider extends FabricAdvancementProvider {

    private static final int[] COMPRESSION_XP = {2, 4, 7, 12, 20, 32, 50, 80, 125, 200};
    private static final String[] BLOCK_INITIAL_COMPRESSION_TITLES = {
            "Getting Compressed",
            "Into The Cube",
            "Making It Dense",
            "First Step To Compression",
            "Less Space, Same Stuff",
            "Getting Dense",
            "Compacting Things",
            "Compression Initiated",
            "Down The Compression Rabbit Hole",
            "One Block Wasn't Enough"
    };

    private static final String[] CRATE_INITIAL_COMPRESSION_TITLES = {
            "Getting Organized",
            "Boxing It Up",
            "Into The Crate",
            "Making Room",
            "Storage Solutions",
            "Getting Serious About Storage",
            "More Storage, Obviously",
            "I Need More Crates",
            "This Is Getting Out Of Hand",
            "Storage Has Become A Problem"
    };
    private static final String[] BLOCK_ADVANCEMENT_TITLES = {
            "Getting Started",
            "Getting Serious",
            "Okay, That's A Lot",
            "This Is Getting Stupid",
            "Storage Is Not The Problem",
            "Why Do You Need This Much?",
            "Please Stop",
            "You Have A Problem",
            "Seek Help",
            "I Have No Life!!!"
    };
    private static final String[] CRATE_ADVANCEMENT_TITLES = {
            "A Little Storage",
            "That's Quite A Lot",
            "Storage Enthusiast",
            "You Really Like Crates",
            "This Is Excessive",
            "Where Did You Get All That?",
            "You Need A Bigger Warehouse",
            "Crate Hoarder",
            "Storage Overload",
            "There Is No More Room"
    };

    public CBAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    private static FrameType getFrameType(int level) {
        if (level >= 8) {
            return FrameType.GOAL;
        } else if (level >= 5) {
            return FrameType.CHALLENGE;
        } else {
            return FrameType.TASK;
        }
    }

    private static Advancement createAdvancement(Advancement parentAdvancement, Item item, String title, String description, int level, String criterion, int experienceReward, String path, Consumer<Advancement> consumer) {
        boolean announce = level > 5; // Announce for levels greater than 5
        return Advancement.Builder.advancement()
                .parent(parentAdvancement)
                .display(
                        item,
                        Component.literal(title),
                        Component.literal(description),
                        null,
                        getFrameType(level),
                        true,
                        announce,
                        false
                )
                .addCriterion(
                        criterion,
                        InventoryChangeTrigger.TriggerInstance.hasItems(item)
                )
                .rewards(AdvancementRewards.Builder.experience(experienceReward))
                .save(consumer, "compressedblocks:" + path);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {

        Advancement addiction_root = Advancement.Builder.advancement()
                .display(
                        Items.DIAMOND,
                        Component.literal("Block Addiction"),
                        Component.literal("The War of Addiction"),
                        new ResourceLocation("minecraft:textures/block/dark_oak_planks.png"),
                        FrameType.GOAL,
                        true,
                        false,
                        false
                )
                .addCriterion(
                        "crafting_table",
                        InventoryChangeTrigger.TriggerInstance.hasItems(Items.CRAFTING_TABLE)
                )
                .save(consumer, "compressedblocks:addiction/root");

        Advancement compression_root = Advancement.Builder.advancement()
                .display(
                        Items.BEDROCK,
                        Component.literal("Compression"),
                        Component.literal("The way of compression!"),
                        new ResourceLocation("minecraft:textures/block/bedrock.png"),
                        FrameType.GOAL,
                        true,
                        false,
                        false
                )
                .addCriterion(
                        "crafting_table",
                        InventoryChangeTrigger.TriggerInstance.hasItems(Items.CRAFTING_TABLE)
                )
                .save(consumer, "compressedblocks:compression/root");


        for (CompressionEntry entry : CompressionCatalog.BLOCK_ENTRIES) {
            Advancement previousAdvancement = null;

            if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) continue;

            for (int i = 0; i < 10; i++) {
                Item compressedBlock = BuiltInRegistries.ITEM.get(new ResourceLocation(MOD_ID, "c" + i + "_" + entry.id()));

                previousAdvancement = createAdvancement(
                        Objects.requireNonNullElse(previousAdvancement, addiction_root),
                        compressedBlock,
                        BLOCK_ADVANCEMENT_TITLES[i],
                        "You have reached Compression Level " + (i + 1) + " for " + ResourceUtils.capitalizeWords(entry.id()) + "!",
                        i,
                        "get_c" + i + "_" + entry.id(),
                        COMPRESSION_XP[i],
                        "addiction/c" + i + "_" + entry.id() + "_edition",
                        consumer
                );
            }
        }

        for (CompressionEntry entry : CompressionCatalog.CRATE_ENTRIES) {
            Advancement previousAdvancement = null;

            if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) continue;

            for (int i = 0; i < 10; i++) {
                Item compressedBlock = BuiltInRegistries.ITEM.get(new ResourceLocation(MOD_ID, ResourceUtils.getCratePrefix(i) + entry.id()));

                previousAdvancement = createAdvancement(
                        Objects.requireNonNullElse(previousAdvancement, addiction_root),
                        compressedBlock,
                        CRATE_ADVANCEMENT_TITLES[i],
                        "You have reached Crate Level " + (i + 1) + " for " + ResourceUtils.pluralize(ResourceUtils.capitalizeWords(entry.id())) + "!",
                        i,
                        "get_" + ResourceUtils.getCratePrefix(i) + entry.id(),
                        COMPRESSION_XP[i],
                        "addiction/" + ResourceUtils.getCratePrefix(i) + "_" + entry.id() + "_edition",
                        consumer
                );
            }
        }

        Advancement previousAdvancement = null;
        for (int i = 0; i < 10; i++) {
            Item compressedBlock = BuiltInRegistries.ITEM.get(new ResourceLocation(MOD_ID, "c" + i + "_stone"));

            previousAdvancement = Advancement.Builder.advancement()
                    .parent(Objects.requireNonNullElse(previousAdvancement, compression_root))
                    .display(
                            compressedBlock,
                            Component.literal(BLOCK_INITIAL_COMPRESSION_TITLES[i]),
                            Component.literal("Compress a block to level " + (i + 1) + "!"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion(
                            "get_c" + i,
                            InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(CBTags.getCompressionTag(i)).build())
                    )
                    .rewards(AdvancementRewards.Builder.experience(COMPRESSION_XP[i]))
                    .save(consumer, "compressedblocks:" + "compression/c" + i);
        }

        previousAdvancement = null;
        for (int i = 0; i < 10; i++) {
            Item crateItem = BuiltInRegistries.ITEM.get(new ResourceLocation(MOD_ID, ResourceUtils.getCratePrefix(i) + "apple"));

            previousAdvancement = Advancement.Builder.advancement()
                    .parent(Objects.requireNonNullElse(previousAdvancement, compression_root))
                    .display(
                            crateItem,
                            Component.literal(CRATE_INITIAL_COMPRESSION_TITLES[i]),
                            Component.literal("Obtain a crate compressed to level " + (i + 1) + "!"),
                            null,
                            FrameType.TASK,
                            true,
                            true,
                            false
                    )
                    .addCriterion(
                            "get_crate",
                            InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(CBTags.getCrateTag(i)).build())
                    )
                    .rewards(AdvancementRewards.Builder.experience(COMPRESSION_XP[i]))
                    .save(consumer, "compressedblocks:" + "compression/" + ResourceUtils.getCratePrefix(i));
        }
    }
}
