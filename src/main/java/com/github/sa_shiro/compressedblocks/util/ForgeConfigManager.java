package com.github.sa_shiro.compressedblocks.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;


public class ForgeConfigManager extends ForgeConfig {

    public static final ForgeConfigSpec configMaxCompressionLevel;
    public static final ForgeConfigSpec configEnabledBlocks;
    private static final ForgeConfigSpec.Builder builderMaxCompressionLevel = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.Builder builderEnabledBlocks = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec.IntValue maxCompressionLevel;

    static {
        createConfigSettings(builderMaxCompressionLevel);
        createConfigEnabledBlocks(builderEnabledBlocks);

        configMaxCompressionLevel = builderMaxCompressionLevel.build();
        configEnabledBlocks = builderEnabledBlocks.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }

    public static void createConfigSettings(ForgeConfigSpec.Builder builder) {
        builder.comment("Maximum Compression");
        maxCompressionLevel = builder
                .defineInRange("maxCompressionLevel", 9, 0, 9);
    }

    public static void createConfigEnabledBlocks(ForgeConfigSpec.Builder builder) {
        for (BlockFactory factory : Lists.blockList) {
            if (!factory.getRegistryName().equals("stone")) {
                builder.define(factory.getRegistryName(), true);
            }
        }
    }

    public static boolean getIsBlockEnabled(String blockName) {
        ForgeConfigSpec.BooleanValue booleanValue = configEnabledBlocks.getValues().get(blockName);
        if (!blockName.equals("stone") && !blockName.equals("cobblestone")) return booleanValue.get();
        else return true;
    }
}
