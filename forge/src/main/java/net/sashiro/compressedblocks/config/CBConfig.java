package net.sashiro.compressedblocks.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CBConfig extends ForgeConfig {
    
    public static List<String> DEFAULT_BLOCKS = new ArrayList<>();
    public static List<String> DEFAULT_CRATES = new ArrayList<>();
    public static final ForgeConfigSpec FORGE_CONFIG_SPEC;
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    
    static {
        createConfig();
        
        FORGE_CONFIG_SPEC = BUILDER.build();
    }
    
    public static void loadConfig(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
        DEFAULT_BLOCKS = getBlocks("compress");
    }
    
    private static List<String> getBlocks(String configKey) {
        ForgeConfigSpec.ConfigValue<List<String>> values = FORGE_CONFIG_SPEC.getValues().get(configKey);
        return values.get();
    }
    
    private static void createConfig() {
        CBConfig.DEFAULT_BLOCKS.add("minecraft:stone");
        CBConfig.DEFAULT_BLOCKS.add("minecraft:andesite");
        CBConfig.DEFAULT_BLOCKS.add("minecraft:diorite");
        CBConfig.DEFAULT_BLOCKS.add("minecraft:granite");

        BUILDER.define("compress", DEFAULT_BLOCKS);
        
        CBConfig.DEFAULT_CRATES.add("minecraft:apple");
        CBConfig.DEFAULT_CRATES.add("minecraft:golden_apple");
        CBConfig.DEFAULT_CRATES.add("minecraft:rotten_flesh");
        CBConfig.DEFAULT_CRATES.add("minecraft:flint");
        
        BUILDER.define("crates", DEFAULT_CRATES);
    }
}
