package net.sashiro.compressedblocks.event;

import net.minecraft.SharedConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.FolderRepositorySource;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.repository.RepositorySource;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.compressedblocks.data.providers.*;
import net.sashiro.compressedblocks.registry.CBBlockRegister;
import net.sashiro.compressedblocks.registry.CBCratesRegister;
import net.sashiro.compressedblocks.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings({"DuplicatedCode", "DataFlowIssue"})
public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    private static final Path CACHE = Path.of(FMLPaths.GAMEDIR.get().toString(), ".cache");
    private static final Path GENERATED_RESOURCES = Path.of(CACHE.toString(), "compressedblocks");
    private static boolean FINISHED = false;
    private static boolean LOADED = false;
    
    public static void register() {
        eventBus.addListener(CBCratesRegister::register);
        eventBus.addListener(CBBlockRegister::register);
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);
        
        eventBus.addListener(EventPriority.LOWEST, CBRegistryEvent::registerResources);
        
        LOG.info("Successfully registered all Blocks and Crates!");
    }
    
    /**
     * GENERATING RESOURCES SHOULDN'T BE DONE ON THE RENDER THREAD<br>
     * but currently there's no way to fire the generation BEFORE this event
     *
     * @param event Pack Finder Event
     */
    private static void registerResources(AddPackFindersEvent event) {
        if (!FINISHED) {
            Path assets = Path.of(FMLPaths.GAMEDIR.get().toString(), ".cache", "compressedblocks");
            
            try {
                Files.createDirectories(assets);
            } catch (Exception ignored) {
            }
            
            DataGenerator generator = new DataGenerator(assets, SharedConstants.getCurrentVersion(), true);
            PackOutput output = new PackOutput(assets);
            Collection<Path> existingPaths = new ArrayList<>();
            Set<String> existingMods = new HashSet<>();
            ExistingFileHelper helper = new ExistingFileHelper(existingPaths, existingMods, false, null, null);
            
            LOG.info("\n\n\nGENERATING RESOURCE PACK\nGame might freeze for a moment!\n\n\n");
            
            generator.addProvider(true, new CBBlockStateProvider(output, helper));
            generator.addProvider(true, new CBItemModelProvider(output, helper));
            generator.addProvider(true, new CBLanguageProvider(output, "en_us"));
            generator.addProvider(true, new CBRecipeProvider(output));
            generator.addProvider(true, CBLootTableProvider.create(output));
            //TagsProvider<Block> tagsProvider = generator.addProvider(true, new CBBlockTagsProvider(output, lookupProvider, MOD_ID, helper));
            //generator.addProvider(true, new CBItemTagsProvider(output, lookupProvider, tagsProvider.contentsGetter(), MOD_ID, helper));
            
            try {
                generator.run();
            } catch (Exception ignored) {
            }
            
            
            String content = "{ \"pack\": { \"description\": { \"text\": \"CB generated resources\" }, \"pack_format\": 15 } }";
            Path filePath = Paths.get(GENERATED_RESOURCES.toString(), "pack.mcmeta");
            
            try {
                StringUtils.writeStringToFile(content, filePath);
            } catch (IOException ignored) {
            }
            
            FINISHED = true;
        }
        
        if (!LOADED) {
            LOG.info("Loading generated resources...");
            
            Pack.ResourcesSupplier resourcePackFile = FolderRepositorySource.detectPackResources(GENERATED_RESOURCES, false);
            
            Pack.Info clientInfo = new Pack.Info(Component.literal("CB Generated Client Resources"), 15, FeatureFlagSet.of());
            Pack.Info serverInfo = new Pack.Info(Component.literal("CB Generated Server Resources"), 15, FeatureFlagSet.of());
            
            Pack clientAssets = Pack.create("cb_client_resources", clientInfo.description(), true, resourcePackFile, clientInfo, PackType.CLIENT_RESOURCES, Pack.Position.TOP, false, PackSource.DEFAULT);
            Pack serverAssets = Pack.create("cb_server_resources", serverInfo.description(), true, resourcePackFile, serverInfo, PackType.SERVER_DATA, Pack.Position.TOP, false, PackSource.DEFAULT);
            
            RepositorySource s = (supplier) -> {
                supplier.accept(clientAssets);
                supplier.accept(serverAssets);
            };
            
            event.addRepositorySource(s);
            
            LOG.info("Finished loading generated resources.");
            
            LOADED = true;
        }
    }
}
