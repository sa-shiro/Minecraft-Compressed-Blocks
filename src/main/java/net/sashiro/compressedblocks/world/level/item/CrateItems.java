package net.sashiro.compressedblocks.world.level.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.event.CBRegistryEvent;
import net.sashiro.compressedblocks.util.StringUtils;

@SuppressWarnings({"unused", "CanBeFinal"})
@Mod.EventBusSubscriber(modid = CompressedBlocks.MOD_ID)
public class CrateItems {
    //------------------------------------------------------------------------------------------------------------------
    //region Oak Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "oak_sapling", () -> new CrateItem(0, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "oak_sapling", () -> new CrateItem(1, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "oak_sapling", () -> new CrateItem(2, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "oak_sapling", () -> new CrateItem(3, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "oak_sapling", () -> new CrateItem(4, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "oak_sapling", () -> new CrateItem(5, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "oak_sapling", () -> new CrateItem(6, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "oak_sapling", () -> new CrateItem(7, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "oak_sapling", () -> new CrateItem(8, StringUtils.stringFormat("oak_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "oak_sapling", () -> new CrateItem(9, StringUtils.stringFormat("oak_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Spruce Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "spruce_sapling", () -> new CrateItem(0, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "spruce_sapling", () -> new CrateItem(1, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "spruce_sapling", () -> new CrateItem(2, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "spruce_sapling", () -> new CrateItem(3, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "spruce_sapling", () -> new CrateItem(4, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "spruce_sapling", () -> new CrateItem(5, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "spruce_sapling", () -> new CrateItem(6, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "spruce_sapling", () -> new CrateItem(7, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "spruce_sapling", () -> new CrateItem(8, StringUtils.stringFormat("spruce_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_SPRUCE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "spruce_sapling", () -> new CrateItem(9, StringUtils.stringFormat("spruce_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Birch Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "birch_sapling", () -> new CrateItem(0, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "birch_sapling", () -> new CrateItem(1, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "birch_sapling", () -> new CrateItem(2, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "birch_sapling", () -> new CrateItem(3, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "birch_sapling", () -> new CrateItem(4, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "birch_sapling", () -> new CrateItem(5, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "birch_sapling", () -> new CrateItem(6, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "birch_sapling", () -> new CrateItem(7, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "birch_sapling", () -> new CrateItem(8, StringUtils.stringFormat("birch_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_BIRCH_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "birch_sapling", () -> new CrateItem(9, StringUtils.stringFormat("birch_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Jungle Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "jungle_sapling", () -> new CrateItem(0, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "jungle_sapling", () -> new CrateItem(1, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "jungle_sapling", () -> new CrateItem(2, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "jungle_sapling", () -> new CrateItem(3, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "jungle_sapling", () -> new CrateItem(4, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "jungle_sapling", () -> new CrateItem(5, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "jungle_sapling", () -> new CrateItem(6, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "jungle_sapling", () -> new CrateItem(7, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "jungle_sapling", () -> new CrateItem(8, StringUtils.stringFormat("jungle_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_JUNGLE_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "jungle_sapling", () -> new CrateItem(9, StringUtils.stringFormat("jungle_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Acacia Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "acacia_sapling", () -> new CrateItem(0, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "acacia_sapling", () -> new CrateItem(1, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "acacia_sapling", () -> new CrateItem(2, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "acacia_sapling", () -> new CrateItem(3, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "acacia_sapling", () -> new CrateItem(4, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "acacia_sapling", () -> new CrateItem(5, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "acacia_sapling", () -> new CrateItem(6, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "acacia_sapling", () -> new CrateItem(7, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "acacia_sapling", () -> new CrateItem(8, StringUtils.stringFormat("acacia_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_ACACIA_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "acacia_sapling", () -> new CrateItem(9, StringUtils.stringFormat("acacia_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dark Oak Sapling
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dark_oak_sapling", () -> new CrateItem(0, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> DOUBLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dark_oak_sapling", () -> new CrateItem(1, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> TRIPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dark_oak_sapling", () -> new CrateItem(2, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dark_oak_sapling", () -> new CrateItem(3, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dark_oak_sapling", () -> new CrateItem(4, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dark_oak_sapling", () -> new CrateItem(5, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dark_oak_sapling", () -> new CrateItem(6, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dark_oak_sapling", () -> new CrateItem(7, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> MEGA_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dark_oak_sapling", () -> new CrateItem(8, StringUtils.stringFormat("dark_oak_sapling")));
    public static RegistryObject<Item> GIGA_CRATED_DARK_OAK_SAPLING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dark_oak_sapling", () -> new CrateItem(9, StringUtils.stringFormat("dark_oak_sapling")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Mangrove Propagule
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "mangrove_propagule", () -> new CrateItem(0, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> DOUBLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "mangrove_propagule", () -> new CrateItem(1, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> TRIPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "mangrove_propagule", () -> new CrateItem(2, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "mangrove_propagule", () -> new CrateItem(3, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "mangrove_propagule", () -> new CrateItem(4, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "mangrove_propagule", () -> new CrateItem(5, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "mangrove_propagule", () -> new CrateItem(6, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "mangrove_propagule", () -> new CrateItem(7, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> MEGA_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "mangrove_propagule", () -> new CrateItem(8, StringUtils.stringFormat("mangrove_propagule")));
    public static RegistryObject<Item> GIGA_CRATED_MANGROVE_PROPAGULE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "mangrove_propagule", () -> new CrateItem(9, StringUtils.stringFormat("mangrove_propagule")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Azalea
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "azalea", () -> new CrateItem(0, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> DOUBLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "azalea", () -> new CrateItem(1, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> TRIPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "azalea", () -> new CrateItem(2, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "azalea", () -> new CrateItem(3, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "azalea", () -> new CrateItem(4, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "azalea", () -> new CrateItem(5, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "azalea", () -> new CrateItem(6, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> OCTUPLE_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "azalea", () -> new CrateItem(7, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> MEGA_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "azalea", () -> new CrateItem(8, StringUtils.stringFormat("azalea")));
    public static RegistryObject<Item> GIGA_CRATED_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "azalea", () -> new CrateItem(9, StringUtils.stringFormat("azalea")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Flowering Azalea
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "flowering_azalea", () -> new CrateItem(0, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> DOUBLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "flowering_azalea", () -> new CrateItem(1, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> TRIPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "flowering_azalea", () -> new CrateItem(2, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "flowering_azalea", () -> new CrateItem(3, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "flowering_azalea", () -> new CrateItem(4, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "flowering_azalea", () -> new CrateItem(5, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "flowering_azalea", () -> new CrateItem(6, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> OCTUPLE_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "flowering_azalea", () -> new CrateItem(7, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> MEGA_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "flowering_azalea", () -> new CrateItem(8, StringUtils.stringFormat("flowering_azalea")));
    public static RegistryObject<Item> GIGA_CRATED_FLOWERING_AZALEA = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "flowering_azalea", () -> new CrateItem(9, StringUtils.stringFormat("flowering_azalea")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Brown Mushroom
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "brown_mushroom", () -> new CrateItem(0, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> DOUBLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "brown_mushroom", () -> new CrateItem(1, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> TRIPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "brown_mushroom", () -> new CrateItem(2, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "brown_mushroom", () -> new CrateItem(3, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "brown_mushroom", () -> new CrateItem(4, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "brown_mushroom", () -> new CrateItem(5, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "brown_mushroom", () -> new CrateItem(6, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "brown_mushroom", () -> new CrateItem(7, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> MEGA_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "brown_mushroom", () -> new CrateItem(8, StringUtils.stringFormat("brown_mushroom")));
    public static RegistryObject<Item> GIGA_CRATED_BROWN_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "brown_mushroom", () -> new CrateItem(9, StringUtils.stringFormat("brown_mushroom")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Mushroom
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "red_mushroom", () -> new CrateItem(0, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> DOUBLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "red_mushroom", () -> new CrateItem(1, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> TRIPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "red_mushroom", () -> new CrateItem(2, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "red_mushroom", () -> new CrateItem(3, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "red_mushroom", () -> new CrateItem(4, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "red_mushroom", () -> new CrateItem(5, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "red_mushroom", () -> new CrateItem(6, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "red_mushroom", () -> new CrateItem(7, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> MEGA_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "red_mushroom", () -> new CrateItem(8, StringUtils.stringFormat("red_mushroom")));
    public static RegistryObject<Item> GIGA_CRATED_RED_MUSHROOM = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "red_mushroom", () -> new CrateItem(9, StringUtils.stringFormat("red_mushroom")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Crimson Fungus
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "crimson_fungus", () -> new CrateItem(0, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> DOUBLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "crimson_fungus", () -> new CrateItem(1, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> TRIPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "crimson_fungus", () -> new CrateItem(2, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "crimson_fungus", () -> new CrateItem(3, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "crimson_fungus", () -> new CrateItem(4, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "crimson_fungus", () -> new CrateItem(5, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "crimson_fungus", () -> new CrateItem(6, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "crimson_fungus", () -> new CrateItem(7, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> MEGA_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "crimson_fungus", () -> new CrateItem(8, StringUtils.stringFormat("crimson_fungus")));
    public static RegistryObject<Item> GIGA_CRATED_CRIMSON_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "crimson_fungus", () -> new CrateItem(9, StringUtils.stringFormat("crimson_fungus")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Warped Fungus
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "warped_fungus", () -> new CrateItem(0, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> DOUBLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "warped_fungus", () -> new CrateItem(1, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> TRIPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "warped_fungus", () -> new CrateItem(2, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "warped_fungus", () -> new CrateItem(3, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "warped_fungus", () -> new CrateItem(4, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "warped_fungus", () -> new CrateItem(5, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "warped_fungus", () -> new CrateItem(6, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "warped_fungus", () -> new CrateItem(7, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> MEGA_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "warped_fungus", () -> new CrateItem(8, StringUtils.stringFormat("warped_fungus")));
    public static RegistryObject<Item> GIGA_CRATED_WARPED_FUNGUS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "warped_fungus", () -> new CrateItem(9, StringUtils.stringFormat("warped_fungus")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dead Bush
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dead_bush", () -> new CrateItem(0, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> DOUBLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dead_bush", () -> new CrateItem(1, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> TRIPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dead_bush", () -> new CrateItem(2, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dead_bush", () -> new CrateItem(3, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dead_bush", () -> new CrateItem(4, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dead_bush", () -> new CrateItem(5, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dead_bush", () -> new CrateItem(6, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dead_bush", () -> new CrateItem(7, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> MEGA_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dead_bush", () -> new CrateItem(8, StringUtils.stringFormat("dead_bush")));
    public static RegistryObject<Item> GIGA_CRATED_DEAD_BUSH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dead_bush", () -> new CrateItem(9, StringUtils.stringFormat("dead_bush")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dandelion
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dandelion", () -> new CrateItem(0, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> DOUBLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dandelion", () -> new CrateItem(1, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> TRIPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dandelion", () -> new CrateItem(2, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dandelion", () -> new CrateItem(3, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dandelion", () -> new CrateItem(4, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dandelion", () -> new CrateItem(5, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dandelion", () -> new CrateItem(6, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dandelion", () -> new CrateItem(7, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> MEGA_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dandelion", () -> new CrateItem(8, StringUtils.stringFormat("dandelion")));
    public static RegistryObject<Item> GIGA_CRATED_DANDELION = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dandelion", () -> new CrateItem(9, StringUtils.stringFormat("dandelion")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Poppy
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "poppy", () -> new CrateItem(0, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> DOUBLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "poppy", () -> new CrateItem(1, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> TRIPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "poppy", () -> new CrateItem(2, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "poppy", () -> new CrateItem(3, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "poppy", () -> new CrateItem(4, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "poppy", () -> new CrateItem(5, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "poppy", () -> new CrateItem(6, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "poppy", () -> new CrateItem(7, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> MEGA_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "poppy", () -> new CrateItem(8, StringUtils.stringFormat("poppy")));
    public static RegistryObject<Item> GIGA_CRATED_POPPY = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "poppy", () -> new CrateItem(9, StringUtils.stringFormat("poppy")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Blue Orchid
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "blue_orchid", () -> new CrateItem(0, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> DOUBLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "blue_orchid", () -> new CrateItem(1, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> TRIPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "blue_orchid", () -> new CrateItem(2, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "blue_orchid", () -> new CrateItem(3, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "blue_orchid", () -> new CrateItem(4, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "blue_orchid", () -> new CrateItem(5, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "blue_orchid", () -> new CrateItem(6, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "blue_orchid", () -> new CrateItem(7, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> MEGA_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "blue_orchid", () -> new CrateItem(8, StringUtils.stringFormat("blue_orchid")));
    public static RegistryObject<Item> GIGA_CRATED_BLUE_ORCHID = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "blue_orchid", () -> new CrateItem(9, StringUtils.stringFormat("blue_orchid")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Allium
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "allium", () -> new CrateItem(0, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> DOUBLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "allium", () -> new CrateItem(1, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> TRIPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "allium", () -> new CrateItem(2, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "allium", () -> new CrateItem(3, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "allium", () -> new CrateItem(4, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "allium", () -> new CrateItem(5, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "allium", () -> new CrateItem(6, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "allium", () -> new CrateItem(7, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> MEGA_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "allium", () -> new CrateItem(8, StringUtils.stringFormat("allium")));
    public static RegistryObject<Item> GIGA_CRATED_ALLIUM = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "allium", () -> new CrateItem(9, StringUtils.stringFormat("allium")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Azure Bluet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "azure_bluet", () -> new CrateItem(0, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> DOUBLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "azure_bluet", () -> new CrateItem(1, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> TRIPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "azure_bluet", () -> new CrateItem(2, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "azure_bluet", () -> new CrateItem(3, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "azure_bluet", () -> new CrateItem(4, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "azure_bluet", () -> new CrateItem(5, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "azure_bluet", () -> new CrateItem(6, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "azure_bluet", () -> new CrateItem(7, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> MEGA_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "azure_bluet", () -> new CrateItem(8, StringUtils.stringFormat("azure_bluet")));
    public static RegistryObject<Item> GIGA_CRATED_AZURE_BLUET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "azure_bluet", () -> new CrateItem(9, StringUtils.stringFormat("azure_bluet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Tulip
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "red_tulip", () -> new CrateItem(0, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> DOUBLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "red_tulip", () -> new CrateItem(1, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> TRIPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "red_tulip", () -> new CrateItem(2, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "red_tulip", () -> new CrateItem(3, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "red_tulip", () -> new CrateItem(4, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "red_tulip", () -> new CrateItem(5, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "red_tulip", () -> new CrateItem(6, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "red_tulip", () -> new CrateItem(7, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> MEGA_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "red_tulip", () -> new CrateItem(8, StringUtils.stringFormat("red_tulip")));
    public static RegistryObject<Item> GIGA_CRATED_RED_TULIP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "red_tulip", () -> new CrateItem(9, StringUtils.stringFormat("red_tulip")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Orange Tulip
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "orange_tulip", () -> new CrateItem(0, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> DOUBLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "orange_tulip", () -> new CrateItem(1, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> TRIPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "orange_tulip", () -> new CrateItem(2, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "orange_tulip", () -> new CrateItem(3, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "orange_tulip", () -> new CrateItem(4, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "orange_tulip", () -> new CrateItem(5, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "orange_tulip", () -> new CrateItem(6, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "orange_tulip", () -> new CrateItem(7, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> MEGA_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "orange_tulip", () -> new CrateItem(8, StringUtils.stringFormat("orange_tulip")));
    public static RegistryObject<Item> GIGA_CRATED_ORANGE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "orange_tulip", () -> new CrateItem(9, StringUtils.stringFormat("orange_tulip")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region White Tulip
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "white_tulip", () -> new CrateItem(0, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> DOUBLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "white_tulip", () -> new CrateItem(1, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> TRIPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "white_tulip", () -> new CrateItem(2, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "white_tulip", () -> new CrateItem(3, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "white_tulip", () -> new CrateItem(4, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "white_tulip", () -> new CrateItem(5, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "white_tulip", () -> new CrateItem(6, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "white_tulip", () -> new CrateItem(7, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> MEGA_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "white_tulip", () -> new CrateItem(8, StringUtils.stringFormat("white_tulip")));
    public static RegistryObject<Item> GIGA_CRATED_WHITE_TULIP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "white_tulip", () -> new CrateItem(9, StringUtils.stringFormat("white_tulip")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pink Tulip
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pink_tulip", () -> new CrateItem(0, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> DOUBLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pink_tulip", () -> new CrateItem(1, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> TRIPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pink_tulip", () -> new CrateItem(2, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pink_tulip", () -> new CrateItem(3, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pink_tulip", () -> new CrateItem(4, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pink_tulip", () -> new CrateItem(5, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pink_tulip", () -> new CrateItem(6, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pink_tulip", () -> new CrateItem(7, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> MEGA_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pink_tulip", () -> new CrateItem(8, StringUtils.stringFormat("pink_tulip")));
    public static RegistryObject<Item> GIGA_CRATED_PINK_TULIP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pink_tulip", () -> new CrateItem(9, StringUtils.stringFormat("pink_tulip")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Oxeye Daisy
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "oxeye_daisy", () -> new CrateItem(0, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> DOUBLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "oxeye_daisy", () -> new CrateItem(1, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> TRIPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "oxeye_daisy", () -> new CrateItem(2, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "oxeye_daisy", () -> new CrateItem(3, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "oxeye_daisy", () -> new CrateItem(4, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "oxeye_daisy", () -> new CrateItem(5, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "oxeye_daisy", () -> new CrateItem(6, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> OCTUPLE_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "oxeye_daisy", () -> new CrateItem(7, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> MEGA_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "oxeye_daisy", () -> new CrateItem(8, StringUtils.stringFormat("oxeye_daisy")));
    public static RegistryObject<Item> GIGA_CRATED_OXEYE_DAISY = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "oxeye_daisy", () -> new CrateItem(9, StringUtils.stringFormat("oxeye_daisy")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cornflower
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cornflower", () -> new CrateItem(0, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> DOUBLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cornflower", () -> new CrateItem(1, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> TRIPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cornflower", () -> new CrateItem(2, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cornflower", () -> new CrateItem(3, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cornflower", () -> new CrateItem(4, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cornflower", () -> new CrateItem(5, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cornflower", () -> new CrateItem(6, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cornflower", () -> new CrateItem(7, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> MEGA_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cornflower", () -> new CrateItem(8, StringUtils.stringFormat("cornflower")));
    public static RegistryObject<Item> GIGA_CRATED_CORNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cornflower", () -> new CrateItem(9, StringUtils.stringFormat("cornflower")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lily of the Valley
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lily_of_the_valley", () -> new CrateItem(0, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> DOUBLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lily_of_the_valley", () -> new CrateItem(1, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> TRIPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lily_of_the_valley", () -> new CrateItem(2, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lily_of_the_valley", () -> new CrateItem(3, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lily_of_the_valley", () -> new CrateItem(4, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lily_of_the_valley", () -> new CrateItem(5, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lily_of_the_valley", () -> new CrateItem(6, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lily_of_the_valley", () -> new CrateItem(7, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> MEGA_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lily_of_the_valley", () -> new CrateItem(8, StringUtils.stringFormat("lily_of_the_valley")));
    public static RegistryObject<Item> GIGA_CRATED_LILY_OF_THE_VALLEY = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lily_of_the_valley", () -> new CrateItem(9, StringUtils.stringFormat("lily_of_the_valley")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Bamboo
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "bamboo", () -> new CrateItem(0, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> DOUBLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "bamboo", () -> new CrateItem(1, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> TRIPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "bamboo", () -> new CrateItem(2, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "bamboo", () -> new CrateItem(3, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "bamboo", () -> new CrateItem(4, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "bamboo", () -> new CrateItem(5, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "bamboo", () -> new CrateItem(6, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "bamboo", () -> new CrateItem(7, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> MEGA_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "bamboo", () -> new CrateItem(8, StringUtils.stringFormat("bamboo")));
    public static RegistryObject<Item> GIGA_CRATED_BAMBOO = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "bamboo", () -> new CrateItem(9, StringUtils.stringFormat("bamboo")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sugar Cane
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sugar_cane", () -> new CrateItem(0, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> DOUBLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sugar_cane", () -> new CrateItem(1, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> TRIPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sugar_cane", () -> new CrateItem(2, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sugar_cane", () -> new CrateItem(3, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sugar_cane", () -> new CrateItem(4, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sugar_cane", () -> new CrateItem(5, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sugar_cane", () -> new CrateItem(6, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sugar_cane", () -> new CrateItem(7, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> MEGA_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sugar_cane", () -> new CrateItem(8, StringUtils.stringFormat("sugar_cane")));
    public static RegistryObject<Item> GIGA_CRATED_SUGAR_CANE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sugar_cane", () -> new CrateItem(9, StringUtils.stringFormat("sugar_cane")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cactus
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cactus", () -> new CrateItem(0, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> DOUBLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cactus", () -> new CrateItem(1, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> TRIPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cactus", () -> new CrateItem(2, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cactus", () -> new CrateItem(3, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cactus", () -> new CrateItem(4, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cactus", () -> new CrateItem(5, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cactus", () -> new CrateItem(6, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cactus", () -> new CrateItem(7, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> MEGA_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cactus", () -> new CrateItem(8, StringUtils.stringFormat("cactus")));
    public static RegistryObject<Item> GIGA_CRATED_CACTUS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cactus", () -> new CrateItem(9, StringUtils.stringFormat("cactus")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Wither Rose
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "wither_rose", () -> new CrateItem(0, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> DOUBLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "wither_rose", () -> new CrateItem(1, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> TRIPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "wither_rose", () -> new CrateItem(2, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "wither_rose", () -> new CrateItem(3, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "wither_rose", () -> new CrateItem(4, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "wither_rose", () -> new CrateItem(5, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "wither_rose", () -> new CrateItem(6, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "wither_rose", () -> new CrateItem(7, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> MEGA_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "wither_rose", () -> new CrateItem(8, StringUtils.stringFormat("wither_rose")));
    public static RegistryObject<Item> GIGA_CRATED_WITHER_ROSE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "wither_rose", () -> new CrateItem(9, StringUtils.stringFormat("wither_rose")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sunflower
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sunflower", () -> new CrateItem(0, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> DOUBLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sunflower", () -> new CrateItem(1, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> TRIPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sunflower", () -> new CrateItem(2, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sunflower", () -> new CrateItem(3, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sunflower", () -> new CrateItem(4, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sunflower", () -> new CrateItem(5, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sunflower", () -> new CrateItem(6, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sunflower", () -> new CrateItem(7, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> MEGA_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sunflower", () -> new CrateItem(8, StringUtils.stringFormat("sunflower")));
    public static RegistryObject<Item> GIGA_CRATED_SUNFLOWER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sunflower", () -> new CrateItem(9, StringUtils.stringFormat("sunflower")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lilac
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lilac", () -> new CrateItem(0, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> DOUBLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lilac", () -> new CrateItem(1, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> TRIPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lilac", () -> new CrateItem(2, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lilac", () -> new CrateItem(3, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lilac", () -> new CrateItem(4, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lilac", () -> new CrateItem(5, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lilac", () -> new CrateItem(6, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lilac", () -> new CrateItem(7, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> MEGA_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lilac", () -> new CrateItem(8, StringUtils.stringFormat("lilac")));
    public static RegistryObject<Item> GIGA_CRATED_LILAC = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lilac", () -> new CrateItem(9, StringUtils.stringFormat("lilac")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Rose Bush
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "rose_bush", () -> new CrateItem(0, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> DOUBLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "rose_bush", () -> new CrateItem(1, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> TRIPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "rose_bush", () -> new CrateItem(2, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "rose_bush", () -> new CrateItem(3, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "rose_bush", () -> new CrateItem(4, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "rose_bush", () -> new CrateItem(5, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "rose_bush", () -> new CrateItem(6, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "rose_bush", () -> new CrateItem(7, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> MEGA_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "rose_bush", () -> new CrateItem(8, StringUtils.stringFormat("rose_bush")));
    public static RegistryObject<Item> GIGA_CRATED_ROSE_BUSH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "rose_bush", () -> new CrateItem(9, StringUtils.stringFormat("rose_bush")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Peony
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "peony", () -> new CrateItem(0, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> DOUBLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "peony", () -> new CrateItem(1, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> TRIPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "peony", () -> new CrateItem(2, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "peony", () -> new CrateItem(3, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "peony", () -> new CrateItem(4, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "peony", () -> new CrateItem(5, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "peony", () -> new CrateItem(6, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "peony", () -> new CrateItem(7, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> MEGA_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "peony", () -> new CrateItem(8, StringUtils.stringFormat("peony")));
    public static RegistryObject<Item> GIGA_CRATED_PEONY = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "peony", () -> new CrateItem(9, StringUtils.stringFormat("peony")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Big Dripleaf
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "big_dripleaf", () -> new CrateItem(0, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> DOUBLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "big_dripleaf", () -> new CrateItem(1, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> TRIPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "big_dripleaf", () -> new CrateItem(2, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "big_dripleaf", () -> new CrateItem(3, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "big_dripleaf", () -> new CrateItem(4, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "big_dripleaf", () -> new CrateItem(5, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "big_dripleaf", () -> new CrateItem(6, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "big_dripleaf", () -> new CrateItem(7, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> MEGA_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "big_dripleaf", () -> new CrateItem(8, StringUtils.stringFormat("big_dripleaf")));
    public static RegistryObject<Item> GIGA_CRATED_BIG_DRIPLEAF = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "big_dripleaf", () -> new CrateItem(9, StringUtils.stringFormat("big_dripleaf")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Chorus Flower
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "chorus_flower", () -> new CrateItem(0, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> DOUBLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "chorus_flower", () -> new CrateItem(1, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> TRIPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "chorus_flower", () -> new CrateItem(2, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "chorus_flower", () -> new CrateItem(3, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "chorus_flower", () -> new CrateItem(4, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "chorus_flower", () -> new CrateItem(5, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "chorus_flower", () -> new CrateItem(6, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "chorus_flower", () -> new CrateItem(7, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> MEGA_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "chorus_flower", () -> new CrateItem(8, StringUtils.stringFormat("chorus_flower")));
    public static RegistryObject<Item> GIGA_CRATED_CHORUS_FLOWER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "chorus_flower", () -> new CrateItem(9, StringUtils.stringFormat("chorus_flower")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Wheat Seeds
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "wheat_seeds", () -> new CrateItem(0, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> DOUBLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "wheat_seeds", () -> new CrateItem(1, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> TRIPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "wheat_seeds", () -> new CrateItem(2, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "wheat_seeds", () -> new CrateItem(3, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "wheat_seeds", () -> new CrateItem(4, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "wheat_seeds", () -> new CrateItem(5, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "wheat_seeds", () -> new CrateItem(6, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "wheat_seeds", () -> new CrateItem(7, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> MEGA_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "wheat_seeds", () -> new CrateItem(8, StringUtils.stringFormat("wheat_seeds")));
    public static RegistryObject<Item> GIGA_CRATED_WHEAT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "wheat_seeds", () -> new CrateItem(9, StringUtils.stringFormat("wheat_seeds")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cocoa Beans
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cocoa_beans", () -> new CrateItem(0, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> DOUBLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cocoa_beans", () -> new CrateItem(1, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> TRIPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cocoa_beans", () -> new CrateItem(2, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cocoa_beans", () -> new CrateItem(3, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cocoa_beans", () -> new CrateItem(4, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cocoa_beans", () -> new CrateItem(5, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cocoa_beans", () -> new CrateItem(6, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cocoa_beans", () -> new CrateItem(7, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> MEGA_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cocoa_beans", () -> new CrateItem(8, StringUtils.stringFormat("cocoa_beans")));
    public static RegistryObject<Item> GIGA_CRATED_COCOA_BEANS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cocoa_beans", () -> new CrateItem(9, StringUtils.stringFormat("cocoa_beans")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pumpkin Seeds
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pumpkin_seeds", () -> new CrateItem(0, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> DOUBLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pumpkin_seeds", () -> new CrateItem(1, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> TRIPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pumpkin_seeds", () -> new CrateItem(2, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pumpkin_seeds", () -> new CrateItem(3, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pumpkin_seeds", () -> new CrateItem(4, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pumpkin_seeds", () -> new CrateItem(5, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pumpkin_seeds", () -> new CrateItem(6, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pumpkin_seeds", () -> new CrateItem(7, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> MEGA_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pumpkin_seeds", () -> new CrateItem(8, StringUtils.stringFormat("pumpkin_seeds")));
    public static RegistryObject<Item> GIGA_CRATED_PUMPKIN_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pumpkin_seeds", () -> new CrateItem(9, StringUtils.stringFormat("pumpkin_seeds")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Melon Seeds
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "melon_seeds", () -> new CrateItem(0, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> DOUBLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "melon_seeds", () -> new CrateItem(1, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> TRIPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "melon_seeds", () -> new CrateItem(2, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "melon_seeds", () -> new CrateItem(3, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "melon_seeds", () -> new CrateItem(4, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "melon_seeds", () -> new CrateItem(5, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "melon_seeds", () -> new CrateItem(6, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "melon_seeds", () -> new CrateItem(7, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> MEGA_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "melon_seeds", () -> new CrateItem(8, StringUtils.stringFormat("melon_seeds")));
    public static RegistryObject<Item> GIGA_CRATED_MELON_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "melon_seeds", () -> new CrateItem(9, StringUtils.stringFormat("melon_seeds")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Beetroot Seeds
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "beetroot_seeds", () -> new CrateItem(0, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> DOUBLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "beetroot_seeds", () -> new CrateItem(1, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> TRIPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "beetroot_seeds", () -> new CrateItem(2, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "beetroot_seeds", () -> new CrateItem(3, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "beetroot_seeds", () -> new CrateItem(4, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "beetroot_seeds", () -> new CrateItem(5, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "beetroot_seeds", () -> new CrateItem(6, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "beetroot_seeds", () -> new CrateItem(7, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> MEGA_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "beetroot_seeds", () -> new CrateItem(8, StringUtils.stringFormat("beetroot_seeds")));
    public static RegistryObject<Item> GIGA_CRATED_BEETROOT_SEEDS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "beetroot_seeds", () -> new CrateItem(9, StringUtils.stringFormat("beetroot_seeds")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Glow Berries
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "glow_berries", () -> new CrateItem(0, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> DOUBLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "glow_berries", () -> new CrateItem(1, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> TRIPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "glow_berries", () -> new CrateItem(2, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "glow_berries", () -> new CrateItem(3, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "glow_berries", () -> new CrateItem(4, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "glow_berries", () -> new CrateItem(5, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "glow_berries", () -> new CrateItem(6, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "glow_berries", () -> new CrateItem(7, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> MEGA_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "glow_berries", () -> new CrateItem(8, StringUtils.stringFormat("glow_berries")));
    public static RegistryObject<Item> GIGA_CRATED_GLOW_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "glow_berries", () -> new CrateItem(9, StringUtils.stringFormat("glow_berries")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sweet Berries
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sweet_berries", () -> new CrateItem(0, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> DOUBLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sweet_berries", () -> new CrateItem(1, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> TRIPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sweet_berries", () -> new CrateItem(2, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sweet_berries", () -> new CrateItem(3, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sweet_berries", () -> new CrateItem(4, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sweet_berries", () -> new CrateItem(5, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sweet_berries", () -> new CrateItem(6, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sweet_berries", () -> new CrateItem(7, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> MEGA_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sweet_berries", () -> new CrateItem(8, StringUtils.stringFormat("sweet_berries")));
    public static RegistryObject<Item> GIGA_CRATED_SWEET_BERRIES = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sweet_berries", () -> new CrateItem(9, StringUtils.stringFormat("sweet_berries")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Wart
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "nether_wart", () -> new CrateItem(0, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "nether_wart", () -> new CrateItem(1, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "nether_wart", () -> new CrateItem(2, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "nether_wart", () -> new CrateItem(3, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "nether_wart", () -> new CrateItem(4, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "nether_wart", () -> new CrateItem(5, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "nether_wart", () -> new CrateItem(6, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "nether_wart", () -> new CrateItem(7, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "nether_wart", () -> new CrateItem(8, StringUtils.stringFormat("nether_wart")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_NETHER_WART = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "nether_wart", () -> new CrateItem(9, StringUtils.stringFormat("nether_wart")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Seagrass
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "seagrass", () -> new CrateItem(0, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> DOUBLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "seagrass", () -> new CrateItem(1, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> TRIPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "seagrass", () -> new CrateItem(2, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "seagrass", () -> new CrateItem(3, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "seagrass", () -> new CrateItem(4, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "seagrass", () -> new CrateItem(5, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "seagrass", () -> new CrateItem(6, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "seagrass", () -> new CrateItem(7, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> MEGA_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "seagrass", () -> new CrateItem(8, StringUtils.stringFormat("seagrass")));
    public static RegistryObject<Item> GIGA_CRATED_SEAGRASS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "seagrass", () -> new CrateItem(9, StringUtils.stringFormat("seagrass")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sea Pickle
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sea_pickle", () -> new CrateItem(0, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> DOUBLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sea_pickle", () -> new CrateItem(1, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> TRIPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sea_pickle", () -> new CrateItem(2, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sea_pickle", () -> new CrateItem(3, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sea_pickle", () -> new CrateItem(4, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sea_pickle", () -> new CrateItem(5, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sea_pickle", () -> new CrateItem(6, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sea_pickle", () -> new CrateItem(7, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> MEGA_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sea_pickle", () -> new CrateItem(8, StringUtils.stringFormat("sea_pickle")));
    public static RegistryObject<Item> GIGA_CRATED_SEA_PICKLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sea_pickle", () -> new CrateItem(9, StringUtils.stringFormat("sea_pickle")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Kelp
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "kelp", () -> new CrateItem(0, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> DOUBLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "kelp", () -> new CrateItem(1, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> TRIPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "kelp", () -> new CrateItem(2, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "kelp", () -> new CrateItem(3, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "kelp", () -> new CrateItem(4, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "kelp", () -> new CrateItem(5, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "kelp", () -> new CrateItem(6, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> OCTUPLE_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "kelp", () -> new CrateItem(7, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> MEGA_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "kelp", () -> new CrateItem(8, StringUtils.stringFormat("kelp")));
    public static RegistryObject<Item> GIGA_CRATED_KELP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "kelp", () -> new CrateItem(9, StringUtils.stringFormat("kelp")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cobweb
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cobweb", () -> new CrateItem(0, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> DOUBLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cobweb", () -> new CrateItem(1, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> TRIPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cobweb", () -> new CrateItem(2, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cobweb", () -> new CrateItem(3, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cobweb", () -> new CrateItem(4, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cobweb", () -> new CrateItem(5, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cobweb", () -> new CrateItem(6, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cobweb", () -> new CrateItem(7, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> MEGA_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cobweb", () -> new CrateItem(8, StringUtils.stringFormat("cobweb")));
    public static RegistryObject<Item> GIGA_CRATED_COBWEB = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cobweb", () -> new CrateItem(9, StringUtils.stringFormat("cobweb")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pointed Dripstone
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pointed_dripstone", () -> new CrateItem(0, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> DOUBLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pointed_dripstone", () -> new CrateItem(1, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> TRIPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pointed_dripstone", () -> new CrateItem(2, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pointed_dripstone", () -> new CrateItem(3, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pointed_dripstone", () -> new CrateItem(4, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pointed_dripstone", () -> new CrateItem(5, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pointed_dripstone", () -> new CrateItem(6, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pointed_dripstone", () -> new CrateItem(7, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> MEGA_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pointed_dripstone", () -> new CrateItem(8, StringUtils.stringFormat("pointed_dripstone")));
    public static RegistryObject<Item> GIGA_CRATED_POINTED_DRIPSTONE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pointed_dripstone", () -> new CrateItem(9, StringUtils.stringFormat("pointed_dripstone")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Amethyst Shard
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "amethyst_shard", () -> new CrateItem(0, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> DOUBLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "amethyst_shard", () -> new CrateItem(1, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> TRIPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "amethyst_shard", () -> new CrateItem(2, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "amethyst_shard", () -> new CrateItem(3, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "amethyst_shard", () -> new CrateItem(4, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "amethyst_shard", () -> new CrateItem(5, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "amethyst_shard", () -> new CrateItem(6, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> OCTUPLE_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "amethyst_shard", () -> new CrateItem(7, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> MEGA_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "amethyst_shard", () -> new CrateItem(8, StringUtils.stringFormat("amethyst_shard")));
    public static RegistryObject<Item> GIGA_CRATED_AMETHYST_SHARD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "amethyst_shard", () -> new CrateItem(9, StringUtils.stringFormat("amethyst_shard")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Chain
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "chain", () -> new CrateItem(0, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> DOUBLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "chain", () -> new CrateItem(1, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> TRIPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "chain", () -> new CrateItem(2, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "chain", () -> new CrateItem(3, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "chain", () -> new CrateItem(4, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "chain", () -> new CrateItem(5, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "chain", () -> new CrateItem(6, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "chain", () -> new CrateItem(7, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> MEGA_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "chain", () -> new CrateItem(8, StringUtils.stringFormat("chain")));
    public static RegistryObject<Item> GIGA_CRATED_CHAIN = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "chain", () -> new CrateItem(9, StringUtils.stringFormat("chain")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Iron Bars
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "iron_bars", () -> new CrateItem(0, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> DOUBLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "iron_bars", () -> new CrateItem(1, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> TRIPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "iron_bars", () -> new CrateItem(2, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "iron_bars", () -> new CrateItem(3, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "iron_bars", () -> new CrateItem(4, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "iron_bars", () -> new CrateItem(5, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "iron_bars", () -> new CrateItem(6, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> OCTUPLE_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "iron_bars", () -> new CrateItem(7, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> MEGA_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "iron_bars", () -> new CrateItem(8, StringUtils.stringFormat("iron_bars")));
    public static RegistryObject<Item> GIGA_CRATED_IRON_BARS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "iron_bars", () -> new CrateItem(9, StringUtils.stringFormat("iron_bars")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Torch
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "torch", () -> new CrateItem(0, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> DOUBLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "torch", () -> new CrateItem(1, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> TRIPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "torch", () -> new CrateItem(2, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "torch", () -> new CrateItem(3, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "torch", () -> new CrateItem(4, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "torch", () -> new CrateItem(5, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "torch", () -> new CrateItem(6, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> OCTUPLE_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "torch", () -> new CrateItem(7, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> MEGA_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "torch", () -> new CrateItem(8, StringUtils.stringFormat("torch")));
    public static RegistryObject<Item> GIGA_CRATED_TORCH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "torch", () -> new CrateItem(9, StringUtils.stringFormat("torch")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Soul Torch
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "soul_torch", () -> new CrateItem(0, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> DOUBLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "soul_torch", () -> new CrateItem(1, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> TRIPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "soul_torch", () -> new CrateItem(2, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "soul_torch", () -> new CrateItem(3, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "soul_torch", () -> new CrateItem(4, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "soul_torch", () -> new CrateItem(5, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "soul_torch", () -> new CrateItem(6, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "soul_torch", () -> new CrateItem(7, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> MEGA_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "soul_torch", () -> new CrateItem(8, StringUtils.stringFormat("soul_torch")));
    public static RegistryObject<Item> GIGA_CRATED_SOUL_TORCH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "soul_torch", () -> new CrateItem(9, StringUtils.stringFormat("soul_torch")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Torch
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "redstone_torch", () -> new CrateItem(0, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> DOUBLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "redstone_torch", () -> new CrateItem(1, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> TRIPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "redstone_torch", () -> new CrateItem(2, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "redstone_torch", () -> new CrateItem(3, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "redstone_torch", () -> new CrateItem(4, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "redstone_torch", () -> new CrateItem(5, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "redstone_torch", () -> new CrateItem(6, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> OCTUPLE_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "redstone_torch", () -> new CrateItem(7, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> MEGA_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "redstone_torch", () -> new CrateItem(8, StringUtils.stringFormat("redstone_torch")));
    public static RegistryObject<Item> GIGA_CRATED_REDSTONE_TORCH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "redstone_torch", () -> new CrateItem(9, StringUtils.stringFormat("redstone_torch")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lantern
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lantern", () -> new CrateItem(0, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> DOUBLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lantern", () -> new CrateItem(1, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> TRIPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lantern", () -> new CrateItem(2, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lantern", () -> new CrateItem(3, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lantern", () -> new CrateItem(4, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lantern", () -> new CrateItem(5, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lantern", () -> new CrateItem(6, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lantern", () -> new CrateItem(7, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> MEGA_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lantern", () -> new CrateItem(8, StringUtils.stringFormat("lantern")));
    public static RegistryObject<Item> GIGA_CRATED_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lantern", () -> new CrateItem(9, StringUtils.stringFormat("lantern")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Soul Lantern
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "soul_lantern", () -> new CrateItem(0, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> DOUBLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "soul_lantern", () -> new CrateItem(1, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> TRIPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "soul_lantern", () -> new CrateItem(2, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "soul_lantern", () -> new CrateItem(3, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "soul_lantern", () -> new CrateItem(4, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "soul_lantern", () -> new CrateItem(5, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "soul_lantern", () -> new CrateItem(6, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "soul_lantern", () -> new CrateItem(7, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> MEGA_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "soul_lantern", () -> new CrateItem(8, StringUtils.stringFormat("soul_lantern")));
    public static RegistryObject<Item> GIGA_CRATED_SOUL_LANTERN = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "soul_lantern", () -> new CrateItem(9, StringUtils.stringFormat("soul_lantern")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region End Rod
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "end_rod", () -> new CrateItem(0, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> DOUBLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "end_rod", () -> new CrateItem(1, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> TRIPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "end_rod", () -> new CrateItem(2, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "end_rod", () -> new CrateItem(3, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "end_rod", () -> new CrateItem(4, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "end_rod", () -> new CrateItem(5, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "end_rod", () -> new CrateItem(6, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> OCTUPLE_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "end_rod", () -> new CrateItem(7, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> MEGA_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "end_rod", () -> new CrateItem(8, StringUtils.stringFormat("end_rod")));
    public static RegistryObject<Item> GIGA_CRATED_END_ROD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "end_rod", () -> new CrateItem(9, StringUtils.stringFormat("end_rod")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Ender Pearl
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "ender_pearl", () -> new CrateItem(0, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> DOUBLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "ender_pearl", () -> new CrateItem(1, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> TRIPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "ender_pearl", () -> new CrateItem(2, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "ender_pearl", () -> new CrateItem(3, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "ender_pearl", () -> new CrateItem(4, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "ender_pearl", () -> new CrateItem(5, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "ender_pearl", () -> new CrateItem(6, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "ender_pearl", () -> new CrateItem(7, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> MEGA_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "ender_pearl", () -> new CrateItem(8, StringUtils.stringFormat("ender_pearl")));
    public static RegistryObject<Item> GIGA_CRATED_ENDER_PEARL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "ender_pearl", () -> new CrateItem(9, StringUtils.stringFormat("ender_pearl")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Ender Eye
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "ender_eye", () -> new CrateItem(0, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> DOUBLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "ender_eye", () -> new CrateItem(1, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> TRIPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "ender_eye", () -> new CrateItem(2, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "ender_eye", () -> new CrateItem(3, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "ender_eye", () -> new CrateItem(4, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "ender_eye", () -> new CrateItem(5, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "ender_eye", () -> new CrateItem(6, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "ender_eye", () -> new CrateItem(7, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> MEGA_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "ender_eye", () -> new CrateItem(8, StringUtils.stringFormat("ender_eye")));
    public static RegistryObject<Item> GIGA_CRATED_ENDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "ender_eye", () -> new CrateItem(9, StringUtils.stringFormat("ender_eye")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region String
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "string", () -> new CrateItem(0, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> DOUBLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "string", () -> new CrateItem(1, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> TRIPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "string", () -> new CrateItem(2, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "string", () -> new CrateItem(3, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "string", () -> new CrateItem(4, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "string", () -> new CrateItem(5, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "string", () -> new CrateItem(6, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> OCTUPLE_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "string", () -> new CrateItem(7, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> MEGA_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "string", () -> new CrateItem(8, StringUtils.stringFormat("string")));
    public static RegistryObject<Item> GIGA_CRATED_STRING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "string", () -> new CrateItem(9, StringUtils.stringFormat("string")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Water Bucket
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "water_bucket", () -> new CrateItem(0, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> DOUBLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "water_bucket", () -> new CrateItem(1, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> TRIPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "water_bucket", () -> new CrateItem(2, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "water_bucket", () -> new CrateItem(3, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "water_bucket", () -> new CrateItem(4, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "water_bucket", () -> new CrateItem(5, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "water_bucket", () -> new CrateItem(6, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "water_bucket", () -> new CrateItem(7, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> MEGA_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "water_bucket", () -> new CrateItem(8, StringUtils.stringFormat("water_bucket")));
    public static RegistryObject<Item> GIGA_CRATED_WATER_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "water_bucket", () -> new CrateItem(9, StringUtils.stringFormat("water_bucket")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lava Bucket
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lava_bucket", () -> new CrateItem(0, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> DOUBLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lava_bucket", () -> new CrateItem(1, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> TRIPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lava_bucket", () -> new CrateItem(2, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lava_bucket", () -> new CrateItem(3, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lava_bucket", () -> new CrateItem(4, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lava_bucket", () -> new CrateItem(5, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lava_bucket", () -> new CrateItem(6, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lava_bucket", () -> new CrateItem(7, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> MEGA_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lava_bucket", () -> new CrateItem(8, StringUtils.stringFormat("lava_bucket")));
    public static RegistryObject<Item> GIGA_CRATED_LAVA_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lava_bucket", () -> new CrateItem(9, StringUtils.stringFormat("lava_bucket")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Powder Snow Bucket
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "powder_snow_bucket", () -> new CrateItem(0, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> DOUBLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "powder_snow_bucket", () -> new CrateItem(1, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> TRIPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "powder_snow_bucket", () -> new CrateItem(2, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "powder_snow_bucket", () -> new CrateItem(3, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "powder_snow_bucket", () -> new CrateItem(4, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "powder_snow_bucket", () -> new CrateItem(5, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "powder_snow_bucket", () -> new CrateItem(6, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "powder_snow_bucket", () -> new CrateItem(7, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> MEGA_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "powder_snow_bucket", () -> new CrateItem(8, StringUtils.stringFormat("powder_snow_bucket")));
    public static RegistryObject<Item> GIGA_CRATED_POWDER_SNOW_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "powder_snow_bucket", () -> new CrateItem(9, StringUtils.stringFormat("powder_snow_bucket")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Milk Bucket
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "milk_bucket", () -> new CrateItem(0, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> DOUBLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "milk_bucket", () -> new CrateItem(1, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> TRIPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "milk_bucket", () -> new CrateItem(2, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "milk_bucket", () -> new CrateItem(3, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "milk_bucket", () -> new CrateItem(4, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "milk_bucket", () -> new CrateItem(5, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "milk_bucket", () -> new CrateItem(6, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "milk_bucket", () -> new CrateItem(7, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> MEGA_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "milk_bucket", () -> new CrateItem(8, StringUtils.stringFormat("milk_bucket")));
    public static RegistryObject<Item> GIGA_CRATED_MILK_BUCKET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "milk_bucket", () -> new CrateItem(9, StringUtils.stringFormat("milk_bucket")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Egg
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "egg", () -> new CrateItem(0, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> DOUBLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "egg", () -> new CrateItem(1, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> TRIPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "egg", () -> new CrateItem(2, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "egg", () -> new CrateItem(3, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "egg", () -> new CrateItem(4, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "egg", () -> new CrateItem(5, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "egg", () -> new CrateItem(6, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> OCTUPLE_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "egg", () -> new CrateItem(7, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> MEGA_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "egg", () -> new CrateItem(8, StringUtils.stringFormat("egg")));
    public static RegistryObject<Item> GIGA_CRATED_EGG = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "egg", () -> new CrateItem(9, StringUtils.stringFormat("egg")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Arrow
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "arrow", () -> new CrateItem(0, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> DOUBLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "arrow", () -> new CrateItem(1, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> TRIPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "arrow", () -> new CrateItem(2, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "arrow", () -> new CrateItem(3, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "arrow", () -> new CrateItem(4, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "arrow", () -> new CrateItem(5, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "arrow", () -> new CrateItem(6, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "arrow", () -> new CrateItem(7, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> MEGA_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "arrow", () -> new CrateItem(8, StringUtils.stringFormat("arrow")));
    public static RegistryObject<Item> GIGA_CRATED_ARROW = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "arrow", () -> new CrateItem(9, StringUtils.stringFormat("arrow")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Apple
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "apple", () -> new CrateItem(0, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> DOUBLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "apple", () -> new CrateItem(1, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> TRIPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "apple", () -> new CrateItem(2, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "apple", () -> new CrateItem(3, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "apple", () -> new CrateItem(4, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "apple", () -> new CrateItem(5, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "apple", () -> new CrateItem(6, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> OCTUPLE_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "apple", () -> new CrateItem(7, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> MEGA_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "apple", () -> new CrateItem(8, StringUtils.stringFormat("apple")));
    public static RegistryObject<Item> GIGA_CRATED_APPLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "apple", () -> new CrateItem(9, StringUtils.stringFormat("apple")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Golden Apple
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "golden_apple", () -> new CrateItem(0, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> DOUBLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "golden_apple", () -> new CrateItem(1, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> TRIPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "golden_apple", () -> new CrateItem(2, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "golden_apple", () -> new CrateItem(3, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "golden_apple", () -> new CrateItem(4, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "golden_apple", () -> new CrateItem(5, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "golden_apple", () -> new CrateItem(6, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "golden_apple", () -> new CrateItem(7, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> MEGA_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "golden_apple", () -> new CrateItem(8, StringUtils.stringFormat("golden_apple")));
    public static RegistryObject<Item> GIGA_CRATED_GOLDEN_APPLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "golden_apple", () -> new CrateItem(9, StringUtils.stringFormat("golden_apple")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Melon Slice
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "melon_slice", () -> new CrateItem(0, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> DOUBLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "melon_slice", () -> new CrateItem(1, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> TRIPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "melon_slice", () -> new CrateItem(2, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "melon_slice", () -> new CrateItem(3, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "melon_slice", () -> new CrateItem(4, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "melon_slice", () -> new CrateItem(5, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "melon_slice", () -> new CrateItem(6, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "melon_slice", () -> new CrateItem(7, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> MEGA_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "melon_slice", () -> new CrateItem(8, StringUtils.stringFormat("melon_slice")));
    public static RegistryObject<Item> GIGA_CRATED_MELON_SLICE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "melon_slice", () -> new CrateItem(9, StringUtils.stringFormat("melon_slice")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Chorus Fruit
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "chorus_fruit", () -> new CrateItem(0, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> DOUBLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "chorus_fruit", () -> new CrateItem(1, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> TRIPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "chorus_fruit", () -> new CrateItem(2, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "chorus_fruit", () -> new CrateItem(3, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "chorus_fruit", () -> new CrateItem(4, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "chorus_fruit", () -> new CrateItem(5, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "chorus_fruit", () -> new CrateItem(6, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "chorus_fruit", () -> new CrateItem(7, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> MEGA_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "chorus_fruit", () -> new CrateItem(8, StringUtils.stringFormat("chorus_fruit")));
    public static RegistryObject<Item> GIGA_CRATED_CHORUS_FRUIT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "chorus_fruit", () -> new CrateItem(9, StringUtils.stringFormat("chorus_fruit")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Carrot
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "carrot", () -> new CrateItem(0, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> DOUBLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "carrot", () -> new CrateItem(1, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> TRIPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "carrot", () -> new CrateItem(2, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "carrot", () -> new CrateItem(3, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "carrot", () -> new CrateItem(4, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "carrot", () -> new CrateItem(5, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "carrot", () -> new CrateItem(6, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "carrot", () -> new CrateItem(7, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> MEGA_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "carrot", () -> new CrateItem(8, StringUtils.stringFormat("carrot")));
    public static RegistryObject<Item> GIGA_CRATED_CARROT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "carrot", () -> new CrateItem(9, StringUtils.stringFormat("carrot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Golden Carrot
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "golden_carrot", () -> new CrateItem(0, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> DOUBLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "golden_carrot", () -> new CrateItem(1, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> TRIPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "golden_carrot", () -> new CrateItem(2, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "golden_carrot", () -> new CrateItem(3, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "golden_carrot", () -> new CrateItem(4, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "golden_carrot", () -> new CrateItem(5, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "golden_carrot", () -> new CrateItem(6, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "golden_carrot", () -> new CrateItem(7, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> MEGA_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "golden_carrot", () -> new CrateItem(8, StringUtils.stringFormat("golden_carrot")));
    public static RegistryObject<Item> GIGA_CRATED_GOLDEN_CARROT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "golden_carrot", () -> new CrateItem(9, StringUtils.stringFormat("golden_carrot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Potato
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "potato", () -> new CrateItem(0, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> DOUBLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "potato", () -> new CrateItem(1, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> TRIPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "potato", () -> new CrateItem(2, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "potato", () -> new CrateItem(3, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "potato", () -> new CrateItem(4, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "potato", () -> new CrateItem(5, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "potato", () -> new CrateItem(6, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "potato", () -> new CrateItem(7, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> MEGA_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "potato", () -> new CrateItem(8, StringUtils.stringFormat("potato")));
    public static RegistryObject<Item> GIGA_CRATED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "potato", () -> new CrateItem(9, StringUtils.stringFormat("potato")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Oak Baked Potato
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "baked_potato", () -> new CrateItem(0, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> DOUBLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "baked_potato", () -> new CrateItem(1, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> TRIPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "baked_potato", () -> new CrateItem(2, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "baked_potato", () -> new CrateItem(3, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "baked_potato", () -> new CrateItem(4, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "baked_potato", () -> new CrateItem(5, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "baked_potato", () -> new CrateItem(6, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "baked_potato", () -> new CrateItem(7, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> MEGA_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "baked_potato", () -> new CrateItem(8, StringUtils.stringFormat("baked_potato")));
    public static RegistryObject<Item> GIGA_CRATED_BAKED_POTATO = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "baked_potato", () -> new CrateItem(9, StringUtils.stringFormat("baked_potato")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Poisonous Potato
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "poisonous_potato", () -> new CrateItem(0, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> DOUBLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "poisonous_potato", () -> new CrateItem(1, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> TRIPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "poisonous_potato", () -> new CrateItem(2, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "poisonous_potato", () -> new CrateItem(3, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "poisonous_potato", () -> new CrateItem(4, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "poisonous_potato", () -> new CrateItem(5, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "poisonous_potato", () -> new CrateItem(6, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "poisonous_potato", () -> new CrateItem(7, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> MEGA_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "poisonous_potato", () -> new CrateItem(8, StringUtils.stringFormat("poisonous_potato")));
    public static RegistryObject<Item> GIGA_CRATED_POISONOUS_POTATO = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "poisonous_potato", () -> new CrateItem(9, StringUtils.stringFormat("poisonous_potato")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Beetroot
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "beetroot", () -> new CrateItem(0, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> DOUBLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "beetroot", () -> new CrateItem(1, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> TRIPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "beetroot", () -> new CrateItem(2, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "beetroot", () -> new CrateItem(3, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "beetroot", () -> new CrateItem(4, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "beetroot", () -> new CrateItem(5, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "beetroot", () -> new CrateItem(6, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "beetroot", () -> new CrateItem(7, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> MEGA_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "beetroot", () -> new CrateItem(8, StringUtils.stringFormat("beetroot")));
    public static RegistryObject<Item> GIGA_CRATED_BEETROOT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "beetroot", () -> new CrateItem(9, StringUtils.stringFormat("beetroot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dried Kelp
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dried_kelp", () -> new CrateItem(0, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dried_kelp", () -> new CrateItem(1, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dried_kelp", () -> new CrateItem(2, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dried_kelp", () -> new CrateItem(3, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dried_kelp", () -> new CrateItem(4, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dried_kelp", () -> new CrateItem(5, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dried_kelp", () -> new CrateItem(6, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dried_kelp", () -> new CrateItem(7, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dried_kelp", () -> new CrateItem(8, StringUtils.stringFormat("dried_kelp")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_DRIED_KELP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dried_kelp", () -> new CrateItem(9, StringUtils.stringFormat("dried_kelp")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Beef
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_beef", () -> new CrateItem(0, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_beef", () -> new CrateItem(1, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_beef", () -> new CrateItem(2, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_beef", () -> new CrateItem(3, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_beef", () -> new CrateItem(4, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_beef", () -> new CrateItem(5, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_beef", () -> new CrateItem(6, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_beef", () -> new CrateItem(7, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_beef", () -> new CrateItem(8, StringUtils.stringFormat("raw_beef")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_BEEF = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_beef", () -> new CrateItem(9, StringUtils.stringFormat("raw_beef")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Steak
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_beef", () -> new CrateItem(0, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> DOUBLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_beef", () -> new CrateItem(1, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> TRIPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_beef", () -> new CrateItem(2, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_beef", () -> new CrateItem(3, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_beef", () -> new CrateItem(4, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_beef", () -> new CrateItem(5, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_beef", () -> new CrateItem(6, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> OCTUPLE_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_beef", () -> new CrateItem(7, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> MEGA_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_beef", () -> new CrateItem(8, StringUtils.stringFormat("steak")));
    public static RegistryObject<Item> GIGA_CRATED_STEAK = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_beef", () -> new CrateItem(9, StringUtils.stringFormat("steak")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Porkchop
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_porkchop", () -> new CrateItem(0, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_porkchop", () -> new CrateItem(1, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_porkchop", () -> new CrateItem(2, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_porkchop", () -> new CrateItem(3, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_porkchop", () -> new CrateItem(4, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_porkchop", () -> new CrateItem(5, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_porkchop", () -> new CrateItem(6, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_porkchop", () -> new CrateItem(7, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_porkchop", () -> new CrateItem(8, StringUtils.stringFormat("raw_porkchop")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_porkchop", () -> new CrateItem(9, StringUtils.stringFormat("raw_porkchop")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Porkchop
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_porkchop", () -> new CrateItem(0, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_porkchop", () -> new CrateItem(1, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_porkchop", () -> new CrateItem(2, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_porkchop", () -> new CrateItem(3, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_porkchop", () -> new CrateItem(4, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_porkchop", () -> new CrateItem(5, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_porkchop", () -> new CrateItem(6, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_porkchop", () -> new CrateItem(7, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_porkchop", () -> new CrateItem(8, StringUtils.stringFormat("cooked_porkchop")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_PORKCHOP = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_porkchop", () -> new CrateItem(9, StringUtils.stringFormat("cooked_porkchop")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Mutton
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_mutton", () -> new CrateItem(0, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_mutton", () -> new CrateItem(1, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_mutton", () -> new CrateItem(2, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_mutton", () -> new CrateItem(3, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_mutton", () -> new CrateItem(4, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_mutton", () -> new CrateItem(5, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_mutton", () -> new CrateItem(6, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_mutton", () -> new CrateItem(7, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_mutton", () -> new CrateItem(8, StringUtils.stringFormat("raw_mutton")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_mutton", () -> new CrateItem(9, StringUtils.stringFormat("raw_mutton")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Mutton
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_mutton", () -> new CrateItem(0, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_mutton", () -> new CrateItem(1, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_mutton", () -> new CrateItem(2, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_mutton", () -> new CrateItem(3, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_mutton", () -> new CrateItem(4, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_mutton", () -> new CrateItem(5, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_mutton", () -> new CrateItem(6, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_mutton", () -> new CrateItem(7, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_mutton", () -> new CrateItem(8, StringUtils.stringFormat("cooked_mutton")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_MUTTON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_mutton", () -> new CrateItem(9, StringUtils.stringFormat("cooked_mutton")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Chicken
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_chicken", () -> new CrateItem(0, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_chicken", () -> new CrateItem(1, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_chicken", () -> new CrateItem(2, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_chicken", () -> new CrateItem(3, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_chicken", () -> new CrateItem(4, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_chicken", () -> new CrateItem(5, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_chicken", () -> new CrateItem(6, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_chicken", () -> new CrateItem(7, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_chicken", () -> new CrateItem(8, StringUtils.stringFormat("raw_chicken")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_chicken", () -> new CrateItem(9, StringUtils.stringFormat("raw_chicken")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Chicken
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_chicken", () -> new CrateItem(0, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_chicken", () -> new CrateItem(1, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_chicken", () -> new CrateItem(2, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_chicken", () -> new CrateItem(3, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_chicken", () -> new CrateItem(4, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_chicken", () -> new CrateItem(5, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_chicken", () -> new CrateItem(6, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_chicken", () -> new CrateItem(7, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_chicken", () -> new CrateItem(8, StringUtils.stringFormat("cooked_chicken")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_CHICKEN = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_chicken", () -> new CrateItem(9, StringUtils.stringFormat("cooked_chicken")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Rabbit
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_rabbit", () -> new CrateItem(0, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_rabbit", () -> new CrateItem(1, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_rabbit", () -> new CrateItem(2, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_rabbit", () -> new CrateItem(3, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_rabbit", () -> new CrateItem(4, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_rabbit", () -> new CrateItem(5, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_rabbit", () -> new CrateItem(6, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_rabbit", () -> new CrateItem(7, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_rabbit", () -> new CrateItem(8, StringUtils.stringFormat("raw_rabbit")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_rabbit", () -> new CrateItem(9, StringUtils.stringFormat("raw_rabbit")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Rabbit
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_rabbit", () -> new CrateItem(0, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_rabbit", () -> new CrateItem(1, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_rabbit", () -> new CrateItem(2, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_rabbit", () -> new CrateItem(3, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_rabbit", () -> new CrateItem(4, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_rabbit", () -> new CrateItem(5, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_rabbit", () -> new CrateItem(6, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_rabbit", () -> new CrateItem(7, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_rabbit", () -> new CrateItem(8, StringUtils.stringFormat("cooked_rabbit")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_RABBIT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_rabbit", () -> new CrateItem(9, StringUtils.stringFormat("cooked_rabbit")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Cod
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_cod", () -> new CrateItem(0, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_cod", () -> new CrateItem(1, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_cod", () -> new CrateItem(2, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_cod", () -> new CrateItem(3, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_cod", () -> new CrateItem(4, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_cod", () -> new CrateItem(5, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_cod", () -> new CrateItem(6, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_cod", () -> new CrateItem(7, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_cod", () -> new CrateItem(8, StringUtils.stringFormat("raw_cod")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_COD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_cod", () -> new CrateItem(9, StringUtils.stringFormat("raw_cod")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Cod
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_cod", () -> new CrateItem(0, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_cod", () -> new CrateItem(1, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_cod", () -> new CrateItem(2, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_cod", () -> new CrateItem(3, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_cod", () -> new CrateItem(4, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_cod", () -> new CrateItem(5, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_cod", () -> new CrateItem(6, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_cod", () -> new CrateItem(7, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_cod", () -> new CrateItem(8, StringUtils.stringFormat("cooked_cod")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_COD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_cod", () -> new CrateItem(9, StringUtils.stringFormat("cooked_cod")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Salmon
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_salmon", () -> new CrateItem(0, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_salmon", () -> new CrateItem(1, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_salmon", () -> new CrateItem(2, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_salmon", () -> new CrateItem(3, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_salmon", () -> new CrateItem(4, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_salmon", () -> new CrateItem(5, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_salmon", () -> new CrateItem(6, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_salmon", () -> new CrateItem(7, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> MEGA_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_salmon", () -> new CrateItem(8, StringUtils.stringFormat("raw_salmon")));
    public static RegistryObject<Item> GIGA_CRATED_RAW_SALMON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_salmon", () -> new CrateItem(9, StringUtils.stringFormat("raw_salmon")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cooked Salmon
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cooked_salmon", () -> new CrateItem(0, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cooked_salmon", () -> new CrateItem(1, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cooked_salmon", () -> new CrateItem(2, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cooked_salmon", () -> new CrateItem(3, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cooked_salmon", () -> new CrateItem(4, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cooked_salmon", () -> new CrateItem(5, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cooked_salmon", () -> new CrateItem(6, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cooked_salmon", () -> new CrateItem(7, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> MEGA_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cooked_salmon", () -> new CrateItem(8, StringUtils.stringFormat("cooked_salmon")));
    public static RegistryObject<Item> GIGA_CRATED_COOKED_SALMON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cooked_salmon", () -> new CrateItem(9, StringUtils.stringFormat("cooked_salmon")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Tropical Fish
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "tropical_fish", () -> new CrateItem(0, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> DOUBLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "tropical_fish", () -> new CrateItem(1, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> TRIPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "tropical_fish", () -> new CrateItem(2, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "tropical_fish", () -> new CrateItem(3, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "tropical_fish", () -> new CrateItem(4, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "tropical_fish", () -> new CrateItem(5, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "tropical_fish", () -> new CrateItem(6, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> OCTUPLE_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "tropical_fish", () -> new CrateItem(7, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> MEGA_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "tropical_fish", () -> new CrateItem(8, StringUtils.stringFormat("tropical_fish")));
    public static RegistryObject<Item> GIGA_CRATED_TROPICAL_FISH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "tropical_fish", () -> new CrateItem(9, StringUtils.stringFormat("tropical_fish")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pufferfish
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pufferfish", () -> new CrateItem(0, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> DOUBLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pufferfish", () -> new CrateItem(1, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> TRIPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pufferfish", () -> new CrateItem(2, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pufferfish", () -> new CrateItem(3, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pufferfish", () -> new CrateItem(4, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pufferfish", () -> new CrateItem(5, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pufferfish", () -> new CrateItem(6, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pufferfish", () -> new CrateItem(7, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> MEGA_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pufferfish", () -> new CrateItem(8, StringUtils.stringFormat("pufferfish")));
    public static RegistryObject<Item> GIGA_CRATED_PUFFERFISH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pufferfish", () -> new CrateItem(9, StringUtils.stringFormat("pufferfish")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Bread
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "bread", () -> new CrateItem(0, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> DOUBLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "bread", () -> new CrateItem(1, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> TRIPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "bread", () -> new CrateItem(2, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "bread", () -> new CrateItem(3, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "bread", () -> new CrateItem(4, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "bread", () -> new CrateItem(5, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "bread", () -> new CrateItem(6, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "bread", () -> new CrateItem(7, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> MEGA_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "bread", () -> new CrateItem(8, StringUtils.stringFormat("bread")));
    public static RegistryObject<Item> GIGA_CRATED_BREAD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "bread", () -> new CrateItem(9, StringUtils.stringFormat("bread")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cookie
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cookie", () -> new CrateItem(0, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> DOUBLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cookie", () -> new CrateItem(1, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> TRIPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cookie", () -> new CrateItem(2, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cookie", () -> new CrateItem(3, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cookie", () -> new CrateItem(4, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cookie", () -> new CrateItem(5, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cookie", () -> new CrateItem(6, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> OCTUPLE_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cookie", () -> new CrateItem(7, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> MEGA_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cookie", () -> new CrateItem(8, StringUtils.stringFormat("cookie")));
    public static RegistryObject<Item> GIGA_CRATED_COOKIE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cookie", () -> new CrateItem(9, StringUtils.stringFormat("cookie")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cake
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cake", () -> new CrateItem(0, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> DOUBLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cake", () -> new CrateItem(1, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> TRIPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cake", () -> new CrateItem(2, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cake", () -> new CrateItem(3, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cake", () -> new CrateItem(4, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cake", () -> new CrateItem(5, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cake", () -> new CrateItem(6, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cake", () -> new CrateItem(7, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> MEGA_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cake", () -> new CrateItem(8, StringUtils.stringFormat("cake")));
    public static RegistryObject<Item> GIGA_CRATED_CAKE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cake", () -> new CrateItem(9, StringUtils.stringFormat("cake")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pumpkin Pie
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pumpkin_pie", () -> new CrateItem(0, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> DOUBLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pumpkin_pie", () -> new CrateItem(1, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> TRIPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pumpkin_pie", () -> new CrateItem(2, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pumpkin_pie", () -> new CrateItem(3, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pumpkin_pie", () -> new CrateItem(4, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pumpkin_pie", () -> new CrateItem(5, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pumpkin_pie", () -> new CrateItem(6, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pumpkin_pie", () -> new CrateItem(7, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> MEGA_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pumpkin_pie", () -> new CrateItem(8, StringUtils.stringFormat("pumpkin_pie")));
    public static RegistryObject<Item> GIGA_CRATED_PUMPKIN_PIE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pumpkin_pie", () -> new CrateItem(9, StringUtils.stringFormat("pumpkin_pie")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Rotten Flesh
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "rotten_flesh", () -> new CrateItem(0, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> DOUBLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "rotten_flesh", () -> new CrateItem(1, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> TRIPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "rotten_flesh", () -> new CrateItem(2, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "rotten_flesh", () -> new CrateItem(3, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "rotten_flesh", () -> new CrateItem(4, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "rotten_flesh", () -> new CrateItem(5, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "rotten_flesh", () -> new CrateItem(6, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "rotten_flesh", () -> new CrateItem(7, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> MEGA_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "rotten_flesh", () -> new CrateItem(8, StringUtils.stringFormat("rotten_flesh")));
    public static RegistryObject<Item> GIGA_CRATED_ROTTEN_FLESH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "rotten_flesh", () -> new CrateItem(9, StringUtils.stringFormat("rotten_flesh")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Spider Eye
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "spider_eye", () -> new CrateItem(0, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> DOUBLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "spider_eye", () -> new CrateItem(1, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> TRIPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "spider_eye", () -> new CrateItem(2, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "spider_eye", () -> new CrateItem(3, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "spider_eye", () -> new CrateItem(4, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "spider_eye", () -> new CrateItem(5, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "spider_eye", () -> new CrateItem(6, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "spider_eye", () -> new CrateItem(7, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> MEGA_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "spider_eye", () -> new CrateItem(8, StringUtils.stringFormat("spider_eye")));
    public static RegistryObject<Item> GIGA_CRATED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "spider_eye", () -> new CrateItem(9, StringUtils.stringFormat("spider_eye")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Honey Bottle
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "honey_bottle", () -> new CrateItem(0, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> DOUBLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "honey_bottle", () -> new CrateItem(1, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> TRIPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "honey_bottle", () -> new CrateItem(2, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "honey_bottle", () -> new CrateItem(3, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "honey_bottle", () -> new CrateItem(4, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "honey_bottle", () -> new CrateItem(5, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "honey_bottle", () -> new CrateItem(6, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> OCTUPLE_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "honey_bottle", () -> new CrateItem(7, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> MEGA_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "honey_bottle", () -> new CrateItem(8, StringUtils.stringFormat("honey_bottle")));
    public static RegistryObject<Item> GIGA_CRATED_HONEY_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "honey_bottle", () -> new CrateItem(9, StringUtils.stringFormat("honey_bottle")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Water Bottle
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "water_bottle", () -> new CrateItem(0, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> DOUBLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "water_bottle", () -> new CrateItem(1, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> TRIPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "water_bottle", () -> new CrateItem(2, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "water_bottle", () -> new CrateItem(3, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "water_bottle", () -> new CrateItem(4, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "water_bottle", () -> new CrateItem(5, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "water_bottle", () -> new CrateItem(6, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "water_bottle", () -> new CrateItem(7, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> MEGA_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "water_bottle", () -> new CrateItem(8, StringUtils.stringFormat("water_bottle")));
    public static RegistryObject<Item> GIGA_CRATED_WATER_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "water_bottle", () -> new CrateItem(9, StringUtils.stringFormat("water_bottle")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Coal
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "coal", () -> new CrateItem(0, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "coal", () -> new CrateItem(1, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "coal", () -> new CrateItem(2, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "coal", () -> new CrateItem(3, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "coal", () -> new CrateItem(4, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "coal", () -> new CrateItem(5, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "coal", () -> new CrateItem(6, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "coal", () -> new CrateItem(7, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "coal", () -> new CrateItem(8, StringUtils.stringFormat("coal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_COAL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "coal", () -> new CrateItem(9, StringUtils.stringFormat("coal")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Charcoal
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "charcoal", () -> new CrateItem(0, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> DOUBLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "charcoal", () -> new CrateItem(1, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> TRIPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "charcoal", () -> new CrateItem(2, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "charcoal", () -> new CrateItem(3, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "charcoal", () -> new CrateItem(4, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "charcoal", () -> new CrateItem(5, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "charcoal", () -> new CrateItem(6, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "charcoal", () -> new CrateItem(7, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> MEGA_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "charcoal", () -> new CrateItem(8, StringUtils.stringFormat("charcoal")));
    public static RegistryObject<Item> GIGA_CRATED_CHARCOAL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "charcoal", () -> new CrateItem(9, StringUtils.stringFormat("charcoal")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Iron
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_iron", () -> new CrateItem(0, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_iron", () -> new CrateItem(1, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_iron", () -> new CrateItem(2, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_iron", () -> new CrateItem(3, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_iron", () -> new CrateItem(4, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_iron", () -> new CrateItem(5, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_iron", () -> new CrateItem(6, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_iron", () -> new CrateItem(7, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_iron", () -> new CrateItem(8, StringUtils.stringFormat("raw_iron")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_RAW_IRON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_iron", () -> new CrateItem(9, StringUtils.stringFormat("raw_iron")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Copper
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_copper", () -> new CrateItem(0, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_copper", () -> new CrateItem(1, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_copper", () -> new CrateItem(2, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_copper", () -> new CrateItem(3, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_copper", () -> new CrateItem(4, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_copper", () -> new CrateItem(5, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_copper", () -> new CrateItem(6, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_copper", () -> new CrateItem(7, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_copper", () -> new CrateItem(8, StringUtils.stringFormat("raw_copper")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_RAW_COPPER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_copper", () -> new CrateItem(9, StringUtils.stringFormat("raw_copper")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Gold
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "raw_gold", () -> new CrateItem(0, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "raw_gold", () -> new CrateItem(1, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "raw_gold", () -> new CrateItem(2, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "raw_gold", () -> new CrateItem(3, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "raw_gold", () -> new CrateItem(4, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "raw_gold", () -> new CrateItem(5, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "raw_gold", () -> new CrateItem(6, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "raw_gold", () -> new CrateItem(7, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "raw_gold", () -> new CrateItem(8, StringUtils.stringFormat("raw_gold")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_RAW_GOLD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "raw_gold", () -> new CrateItem(9, StringUtils.stringFormat("raw_gold")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Emerald
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "emerald", () -> new CrateItem(0, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "emerald", () -> new CrateItem(1, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "emerald", () -> new CrateItem(2, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "emerald", () -> new CrateItem(3, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "emerald", () -> new CrateItem(4, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "emerald", () -> new CrateItem(5, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "emerald", () -> new CrateItem(6, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "emerald", () -> new CrateItem(7, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "emerald", () -> new CrateItem(8, StringUtils.stringFormat("emerald")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_EMERALD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "emerald", () -> new CrateItem(9, StringUtils.stringFormat("emerald")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lapis Lazuli
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lapis_lazuli", () -> new CrateItem(0, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lapis_lazuli", () -> new CrateItem(1, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lapis_lazuli", () -> new CrateItem(2, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lapis_lazuli", () -> new CrateItem(3, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lapis_lazuli", () -> new CrateItem(4, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lapis_lazuli", () -> new CrateItem(5, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lapis_lazuli", () -> new CrateItem(6, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lapis_lazuli", () -> new CrateItem(7, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lapis_lazuli", () -> new CrateItem(8, StringUtils.stringFormat("lapis_lazuli")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_LAPIS_LAZULI = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lapis_lazuli", () -> new CrateItem(9, StringUtils.stringFormat("lapis_lazuli")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Diamond
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "diamond", () -> new CrateItem(0, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "diamond", () -> new CrateItem(1, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "diamond", () -> new CrateItem(2, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "diamond", () -> new CrateItem(3, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "diamond", () -> new CrateItem(4, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "diamond", () -> new CrateItem(5, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "diamond", () -> new CrateItem(6, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "diamond", () -> new CrateItem(7, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "diamond", () -> new CrateItem(8, StringUtils.stringFormat("diamond")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_DIAMOND = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "diamond", () -> new CrateItem(9, StringUtils.stringFormat("diamond")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Quartz
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "quartz", () -> new CrateItem(0, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> DOUBLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "quartz", () -> new CrateItem(1, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> TRIPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "quartz", () -> new CrateItem(2, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "quartz", () -> new CrateItem(3, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "quartz", () -> new CrateItem(4, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "quartz", () -> new CrateItem(5, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "quartz", () -> new CrateItem(6, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> OCTUPLE_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "quartz", () -> new CrateItem(7, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> MEGA_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "quartz", () -> new CrateItem(8, StringUtils.stringFormat("quartz")));
    public static RegistryObject<Item> GIGA_CRATED_NETHER_QUARTZ = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "quartz", () -> new CrateItem(9, StringUtils.stringFormat("quartz")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Iron Nugget
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "iron_nugget", () -> new CrateItem(0, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "iron_nugget", () -> new CrateItem(1, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "iron_nugget", () -> new CrateItem(2, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "iron_nugget", () -> new CrateItem(3, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "iron_nugget", () -> new CrateItem(4, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "iron_nugget", () -> new CrateItem(5, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "iron_nugget", () -> new CrateItem(6, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "iron_nugget", () -> new CrateItem(7, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "iron_nugget", () -> new CrateItem(8, StringUtils.stringFormat("iron_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_IRON_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "iron_nugget", () -> new CrateItem(9, StringUtils.stringFormat("iron_nugget")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gold Nugget
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "gold_nugget", () -> new CrateItem(0, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "gold_nugget", () -> new CrateItem(1, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "gold_nugget", () -> new CrateItem(2, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "gold_nugget", () -> new CrateItem(3, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "gold_nugget", () -> new CrateItem(4, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "gold_nugget", () -> new CrateItem(5, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "gold_nugget", () -> new CrateItem(6, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "gold_nugget", () -> new CrateItem(7, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "gold_nugget", () -> new CrateItem(8, StringUtils.stringFormat("gold_nugget")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_GOLD_NUGGET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "gold_nugget", () -> new CrateItem(9, StringUtils.stringFormat("gold_nugget")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Iron Ingot
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "iron_ingot", () -> new CrateItem(0, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "iron_ingot", () -> new CrateItem(1, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "iron_ingot", () -> new CrateItem(2, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "iron_ingot", () -> new CrateItem(3, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "iron_ingot", () -> new CrateItem(4, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "iron_ingot", () -> new CrateItem(5, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "iron_ingot", () -> new CrateItem(6, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "iron_ingot", () -> new CrateItem(7, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "iron_ingot", () -> new CrateItem(8, StringUtils.stringFormat("iron_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_IRON_INGOT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "iron_ingot", () -> new CrateItem(9, StringUtils.stringFormat("iron_ingot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Copper Ingot
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "copper_ingot", () -> new CrateItem(0, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "copper_ingot", () -> new CrateItem(1, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "copper_ingot", () -> new CrateItem(2, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "copper_ingot", () -> new CrateItem(3, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "copper_ingot", () -> new CrateItem(4, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "copper_ingot", () -> new CrateItem(5, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "copper_ingot", () -> new CrateItem(6, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "copper_ingot", () -> new CrateItem(7, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "copper_ingot", () -> new CrateItem(8, StringUtils.stringFormat("copper_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_COPPER_INGOT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "copper_ingot", () -> new CrateItem(9, StringUtils.stringFormat("copper_ingot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gold Ingot
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "gold_ingot", () -> new CrateItem(0, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "gold_ingot", () -> new CrateItem(1, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "gold_ingot", () -> new CrateItem(2, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "gold_ingot", () -> new CrateItem(3, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "gold_ingot", () -> new CrateItem(4, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "gold_ingot", () -> new CrateItem(5, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "gold_ingot", () -> new CrateItem(6, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "gold_ingot", () -> new CrateItem(7, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "gold_ingot", () -> new CrateItem(8, StringUtils.stringFormat("gold_ingot")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_GOLD_INGOT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "gold_ingot", () -> new CrateItem(9, StringUtils.stringFormat("gold_ingot")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Stick
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "stick", () -> new CrateItem(0, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> DOUBLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "stick", () -> new CrateItem(1, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> TRIPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "stick", () -> new CrateItem(2, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "stick", () -> new CrateItem(3, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "stick", () -> new CrateItem(4, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "stick", () -> new CrateItem(5, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "stick", () -> new CrateItem(6, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> OCTUPLE_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "stick", () -> new CrateItem(7, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> MEGA_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "stick", () -> new CrateItem(8, StringUtils.stringFormat("stick")));
    public static RegistryObject<Item> GIGA_CRATED_STICK = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "stick", () -> new CrateItem(9, StringUtils.stringFormat("stick")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Wheat
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict ->public static RegistryObject<Item> CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "wheat", () -> new CrateItem(0, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> DOUBLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "wheat", () -> new CrateItem(1, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> TRIPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "wheat", () -> new CrateItem(2, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> QUADRUPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "wheat", () -> new CrateItem(3, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> QUINTUPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "wheat", () -> new CrateItem(4, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> SEXTUPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "wheat", () -> new CrateItem(5, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> SEPTUPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "wheat", () -> new CrateItem(6, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> OCTUPLE_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "wheat", () -> new CrateItem(7, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> MEGA_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "wheat", () -> new CrateItem(8, StringUtils.stringFormat("wheat")));
    // removed: removed due to conflict ->public static RegistryObject<Item> GIGA_CRATED_WHEAT = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "wheat", () -> new CrateItem(9, StringUtils.stringFormat("wheat")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Bone
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "bone", () -> new CrateItem(0, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> DOUBLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "bone", () -> new CrateItem(1, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> TRIPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "bone", () -> new CrateItem(2, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "bone", () -> new CrateItem(3, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "bone", () -> new CrateItem(4, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "bone", () -> new CrateItem(5, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "bone", () -> new CrateItem(6, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "bone", () -> new CrateItem(7, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> MEGA_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "bone", () -> new CrateItem(8, StringUtils.stringFormat("bone")));
    public static RegistryObject<Item> GIGA_CRATED_BONE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "bone", () -> new CrateItem(9, StringUtils.stringFormat("bone")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Bone Meal
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "bone_meal", () -> new CrateItem(0, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "bone_meal", () -> new CrateItem(1, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "bone_meal", () -> new CrateItem(2, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "bone_meal", () -> new CrateItem(3, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "bone_meal", () -> new CrateItem(4, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "bone_meal", () -> new CrateItem(5, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "bone_meal", () -> new CrateItem(6, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "bone_meal", () -> new CrateItem(7, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "bone_meal", () -> new CrateItem(8, StringUtils.stringFormat("bone_meal")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_BONE_MEAL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "bone_meal", () -> new CrateItem(9, StringUtils.stringFormat("bone_meal")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Feather
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "feather", () -> new CrateItem(0, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> DOUBLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "feather", () -> new CrateItem(1, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> TRIPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "feather", () -> new CrateItem(2, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "feather", () -> new CrateItem(3, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "feather", () -> new CrateItem(4, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "feather", () -> new CrateItem(5, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "feather", () -> new CrateItem(6, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> OCTUPLE_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "feather", () -> new CrateItem(7, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> MEGA_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "feather", () -> new CrateItem(8, StringUtils.stringFormat("feather")));
    public static RegistryObject<Item> GIGA_CRATED_FEATHER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "feather", () -> new CrateItem(9, StringUtils.stringFormat("feather")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Leather
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "leather", () -> new CrateItem(0, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> DOUBLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "leather", () -> new CrateItem(1, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> TRIPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "leather", () -> new CrateItem(2, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "leather", () -> new CrateItem(3, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "leather", () -> new CrateItem(4, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "leather", () -> new CrateItem(5, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "leather", () -> new CrateItem(6, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "leather", () -> new CrateItem(7, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> MEGA_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "leather", () -> new CrateItem(8, StringUtils.stringFormat("leather")));
    public static RegistryObject<Item> GIGA_CRATED_LEATHER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "leather", () -> new CrateItem(9, StringUtils.stringFormat("leather")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Rabbit Hide
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "rabbit_hide", () -> new CrateItem(0, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> DOUBLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "rabbit_hide", () -> new CrateItem(1, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> TRIPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "rabbit_hide", () -> new CrateItem(2, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "rabbit_hide", () -> new CrateItem(3, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "rabbit_hide", () -> new CrateItem(4, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "rabbit_hide", () -> new CrateItem(5, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "rabbit_hide", () -> new CrateItem(6, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "rabbit_hide", () -> new CrateItem(7, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> MEGA_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "rabbit_hide", () -> new CrateItem(8, StringUtils.stringFormat("rabbit_hide")));
    public static RegistryObject<Item> GIGA_CRATED_RABBIT_HIDE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "rabbit_hide", () -> new CrateItem(9, StringUtils.stringFormat("rabbit_hide")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Honeycomb
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "honeycomb", () -> new CrateItem(0, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> DOUBLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "honeycomb", () -> new CrateItem(1, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> TRIPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "honeycomb", () -> new CrateItem(2, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "honeycomb", () -> new CrateItem(3, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "honeycomb", () -> new CrateItem(4, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "honeycomb", () -> new CrateItem(5, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "honeycomb", () -> new CrateItem(6, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> OCTUPLE_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "honeycomb", () -> new CrateItem(7, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> MEGA_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "honeycomb", () -> new CrateItem(8, StringUtils.stringFormat("honeycomb")));
    public static RegistryObject<Item> GIGA_CRATED_HONEYCOMB = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "honeycomb", () -> new CrateItem(9, StringUtils.stringFormat("honeycomb")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Inc Sac
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "inc_sac", () -> new CrateItem(0, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> DOUBLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "inc_sac", () -> new CrateItem(1, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> TRIPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "inc_sac", () -> new CrateItem(2, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "inc_sac", () -> new CrateItem(3, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "inc_sac", () -> new CrateItem(4, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "inc_sac", () -> new CrateItem(5, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "inc_sac", () -> new CrateItem(6, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> OCTUPLE_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "inc_sac", () -> new CrateItem(7, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> MEGA_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "inc_sac", () -> new CrateItem(8, StringUtils.stringFormat("inc_sac")));
    public static RegistryObject<Item> GIGA_CRATED_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "inc_sac", () -> new CrateItem(9, StringUtils.stringFormat("inc_sac")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Glow Inc Sac
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "glow_inc_sac", () -> new CrateItem(0, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> DOUBLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "glow_inc_sac", () -> new CrateItem(1, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> TRIPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "glow_inc_sac", () -> new CrateItem(2, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "glow_inc_sac", () -> new CrateItem(3, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "glow_inc_sac", () -> new CrateItem(4, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "glow_inc_sac", () -> new CrateItem(5, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "glow_inc_sac", () -> new CrateItem(6, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "glow_inc_sac", () -> new CrateItem(7, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> MEGA_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "glow_inc_sac", () -> new CrateItem(8, StringUtils.stringFormat("glow_inc_sac")));
    public static RegistryObject<Item> GIGA_CRATED_GLOW_INC_SAC = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "glow_inc_sac", () -> new CrateItem(9, StringUtils.stringFormat("glow_inc_sac")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Slimeball
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "slimeball", () -> new CrateItem(0, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "slimeball", () -> new CrateItem(1, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "slimeball", () -> new CrateItem(2, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "slimeball", () -> new CrateItem(3, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "slimeball", () -> new CrateItem(4, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "slimeball", () -> new CrateItem(5, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "slimeball", () -> new CrateItem(6, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "slimeball", () -> new CrateItem(7, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "slimeball", () -> new CrateItem(8, StringUtils.stringFormat("slimeball")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_SLIMEBALL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "slimeball", () -> new CrateItem(9, StringUtils.stringFormat("slimeball")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Clay Ball
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "clay_ball", () -> new CrateItem(0, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> DOUBLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "clay_ball", () -> new CrateItem(1, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> TRIPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "clay_ball", () -> new CrateItem(2, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "clay_ball", () -> new CrateItem(3, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "clay_ball", () -> new CrateItem(4, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "clay_ball", () -> new CrateItem(5, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "clay_ball", () -> new CrateItem(6, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "clay_ball", () -> new CrateItem(7, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> MEGA_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "clay_ball", () -> new CrateItem(8, StringUtils.stringFormat("clay_ball")));
    public static RegistryObject<Item> GIGA_CRATED_CLAY_BALL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "clay_ball", () -> new CrateItem(9, StringUtils.stringFormat("clay_ball")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Prismarine Shard
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "prismarine_shard", () -> new CrateItem(0, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "prismarine_shard", () -> new CrateItem(1, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "prismarine_shard", () -> new CrateItem(2, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "prismarine_shard", () -> new CrateItem(3, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "prismarine_shard", () -> new CrateItem(4, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "prismarine_shard", () -> new CrateItem(5, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "prismarine_shard", () -> new CrateItem(6, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "prismarine_shard", () -> new CrateItem(7, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "prismarine_shard", () -> new CrateItem(8, StringUtils.stringFormat("prismarine_shard")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_PRISMARINE_SHARD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "prismarine_shard", () -> new CrateItem(9, StringUtils.stringFormat("prismarine_shard")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Prismarine Crystals
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "prismarine_crystals", () -> new CrateItem(0, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "prismarine_crystals", () -> new CrateItem(1, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "prismarine_crystals", () -> new CrateItem(2, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "prismarine_crystals", () -> new CrateItem(3, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "prismarine_crystals", () -> new CrateItem(4, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "prismarine_crystals", () -> new CrateItem(5, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "prismarine_crystals", () -> new CrateItem(6, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "prismarine_crystals", () -> new CrateItem(7, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "prismarine_crystals", () -> new CrateItem(8, StringUtils.stringFormat("prismarine_crystals")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_PRISMARINE_CRYSTALS = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "prismarine_crystals", () -> new CrateItem(9, StringUtils.stringFormat("prismarine_crystals")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Blaze Rod
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "blaze_rod", () -> new CrateItem(0, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> DOUBLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "blaze_rod", () -> new CrateItem(1, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> TRIPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "blaze_rod", () -> new CrateItem(2, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "blaze_rod", () -> new CrateItem(3, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "blaze_rod", () -> new CrateItem(4, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "blaze_rod", () -> new CrateItem(5, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "blaze_rod", () -> new CrateItem(6, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "blaze_rod", () -> new CrateItem(7, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> MEGA_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "blaze_rod", () -> new CrateItem(8, StringUtils.stringFormat("blaze_rod")));
    public static RegistryObject<Item> GIGA_CRATED_BLAZE_ROD = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "blaze_rod", () -> new CrateItem(9, StringUtils.stringFormat("blaze_rod")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Paper
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "paper", () -> new CrateItem(0, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> DOUBLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "paper", () -> new CrateItem(1, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> TRIPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "paper", () -> new CrateItem(2, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "paper", () -> new CrateItem(3, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "paper", () -> new CrateItem(4, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "paper", () -> new CrateItem(5, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "paper", () -> new CrateItem(6, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "paper", () -> new CrateItem(7, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> MEGA_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "paper", () -> new CrateItem(8, StringUtils.stringFormat("paper")));
    public static RegistryObject<Item> GIGA_CRATED_PAPER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "paper", () -> new CrateItem(9, StringUtils.stringFormat("paper")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Book
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "book", () -> new CrateItem(0, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> DOUBLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "book", () -> new CrateItem(1, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> TRIPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "book", () -> new CrateItem(2, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "book", () -> new CrateItem(3, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "book", () -> new CrateItem(4, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "book", () -> new CrateItem(5, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "book", () -> new CrateItem(6, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "book", () -> new CrateItem(7, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> MEGA_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "book", () -> new CrateItem(8, StringUtils.stringFormat("book")));
    public static RegistryObject<Item> GIGA_CRATED_BOOK = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "book", () -> new CrateItem(9, StringUtils.stringFormat("book")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Glass Bottle
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "glass_bottle", () -> new CrateItem(0, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> DOUBLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "glass_bottle", () -> new CrateItem(1, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> TRIPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "glass_bottle", () -> new CrateItem(2, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "glass_bottle", () -> new CrateItem(3, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "glass_bottle", () -> new CrateItem(4, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "glass_bottle", () -> new CrateItem(5, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "glass_bottle", () -> new CrateItem(6, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "glass_bottle", () -> new CrateItem(7, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> MEGA_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "glass_bottle", () -> new CrateItem(8, StringUtils.stringFormat("glass_bottle")));
    public static RegistryObject<Item> GIGA_CRATED_GLASS_BOTTLE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "glass_bottle", () -> new CrateItem(9, StringUtils.stringFormat("glass_bottle")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Dust
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "redstone", () -> new CrateItem(0, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "redstone", () -> new CrateItem(1, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "redstone", () -> new CrateItem(2, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "redstone", () -> new CrateItem(3, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "redstone", () -> new CrateItem(4, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "redstone", () -> new CrateItem(5, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "redstone", () -> new CrateItem(6, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "redstone", () -> new CrateItem(7, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "redstone", () -> new CrateItem(8, StringUtils.stringFormat("redstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_REDSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "redstone", () -> new CrateItem(9, StringUtils.stringFormat("redstone_dust")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Glowstone Dust
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "glowstone_dust", () -> new CrateItem(0, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "glowstone_dust", () -> new CrateItem(1, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "glowstone_dust", () -> new CrateItem(2, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "glowstone_dust", () -> new CrateItem(3, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "glowstone_dust", () -> new CrateItem(4, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "glowstone_dust", () -> new CrateItem(5, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "glowstone_dust", () -> new CrateItem(6, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "glowstone_dust", () -> new CrateItem(7, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "glowstone_dust", () -> new CrateItem(8, StringUtils.stringFormat("glowstone_dust")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_GLOWSTONE_DUST = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "glowstone_dust", () -> new CrateItem(9, StringUtils.stringFormat("glowstone_dust")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gunpowder
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "gunpowder", () -> new CrateItem(0, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> DOUBLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "gunpowder", () -> new CrateItem(1, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> TRIPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "gunpowder", () -> new CrateItem(2, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "gunpowder", () -> new CrateItem(3, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "gunpowder", () -> new CrateItem(4, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "gunpowder", () -> new CrateItem(5, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "gunpowder", () -> new CrateItem(6, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "gunpowder", () -> new CrateItem(7, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> MEGA_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "gunpowder", () -> new CrateItem(8, StringUtils.stringFormat("gunpowder")));
    public static RegistryObject<Item> GIGA_CRATED_GUNPOWDER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "gunpowder", () -> new CrateItem(9, StringUtils.stringFormat("gunpowder")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dragon's Breath
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dragon_breath", () -> new CrateItem(0, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> DOUBLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dragon_breath", () -> new CrateItem(1, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> TRIPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dragon_breath", () -> new CrateItem(2, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dragon_breath", () -> new CrateItem(3, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dragon_breath", () -> new CrateItem(4, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dragon_breath", () -> new CrateItem(5, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dragon_breath", () -> new CrateItem(6, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dragon_breath", () -> new CrateItem(7, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> MEGA_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dragon_breath", () -> new CrateItem(8, StringUtils.stringFormat("Dragon's Breath")));
    public static RegistryObject<Item> GIGA_CRATED_DRAGON_BREATH = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dragon_breath", () -> new CrateItem(9, StringUtils.stringFormat("Dragon's Breath")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Fermented Spider Eye
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "fermented_spider_eye", () -> new CrateItem(0, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> DOUBLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "fermented_spider_eye", () -> new CrateItem(1, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> TRIPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "fermented_spider_eye", () -> new CrateItem(2, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "fermented_spider_eye", () -> new CrateItem(3, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "fermented_spider_eye", () -> new CrateItem(4, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "fermented_spider_eye", () -> new CrateItem(5, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "fermented_spider_eye", () -> new CrateItem(6, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> OCTUPLE_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "fermented_spider_eye", () -> new CrateItem(7, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> MEGA_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "fermented_spider_eye", () -> new CrateItem(8, StringUtils.stringFormat("fermented_spider_eye")));
    public static RegistryObject<Item> GIGA_CRATED_FERMENTED_SPIDER_EYE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "fermented_spider_eye", () -> new CrateItem(9, StringUtils.stringFormat("fermented_spider_eye")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Blaze Powder
    //------------------------------------------------------------------------------------------------------------------
    // removed: removed due to conflict -> public static RegistryObject<Item> CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "blaze_powder", () -> new CrateItem(0, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> DOUBLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "blaze_powder", () -> new CrateItem(1, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> TRIPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "blaze_powder", () -> new CrateItem(2, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUADRUPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "blaze_powder", () -> new CrateItem(3, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> QUINTUPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "blaze_powder", () -> new CrateItem(4, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEXTUPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "blaze_powder", () -> new CrateItem(5, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> SEPTUPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "blaze_powder", () -> new CrateItem(6, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> OCTUPLE_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "blaze_powder", () -> new CrateItem(7, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> MEGA_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "blaze_powder", () -> new CrateItem(8, StringUtils.stringFormat("blaze_powder")));
    // removed: removed due to conflict -> public static RegistryObject<Item> GIGA_CRATED_BLAZE_POWDER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "blaze_powder", () -> new CrateItem(9, StringUtils.stringFormat("blaze_powder")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sugar
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sugar", () -> new CrateItem(0, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> DOUBLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sugar", () -> new CrateItem(1, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> TRIPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sugar", () -> new CrateItem(2, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sugar", () -> new CrateItem(3, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sugar", () -> new CrateItem(4, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sugar", () -> new CrateItem(5, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sugar", () -> new CrateItem(6, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> OCTUPLE_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sugar", () -> new CrateItem(7, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> MEGA_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sugar", () -> new CrateItem(8, StringUtils.stringFormat("sugar")));
    public static RegistryObject<Item> GIGA_CRATED_SUGAR = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sugar", () -> new CrateItem(9, StringUtils.stringFormat("sugar")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Magma Cream
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "magma_cream", () -> new CrateItem(0, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> DOUBLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "magma_cream", () -> new CrateItem(1, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> TRIPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "magma_cream", () -> new CrateItem(2, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "magma_cream", () -> new CrateItem(3, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "magma_cream", () -> new CrateItem(4, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "magma_cream", () -> new CrateItem(5, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "magma_cream", () -> new CrateItem(6, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "magma_cream", () -> new CrateItem(7, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> MEGA_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "magma_cream", () -> new CrateItem(8, StringUtils.stringFormat("magma_cream")));
    public static RegistryObject<Item> GIGA_CRATED_MAGMA_CREAM = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "magma_cream", () -> new CrateItem(9, StringUtils.stringFormat("magma_cream")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Ghast Tear
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "ghast_tear", () -> new CrateItem(0, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> DOUBLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "ghast_tear", () -> new CrateItem(1, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> TRIPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "ghast_tear", () -> new CrateItem(2, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "ghast_tear", () -> new CrateItem(3, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "ghast_tear", () -> new CrateItem(4, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "ghast_tear", () -> new CrateItem(5, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "ghast_tear", () -> new CrateItem(6, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "ghast_tear", () -> new CrateItem(7, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> MEGA_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "ghast_tear", () -> new CrateItem(8, StringUtils.stringFormat("ghast_tear")));
    public static RegistryObject<Item> GIGA_CRATED_GHAST_TEAR = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "ghast_tear", () -> new CrateItem(9, StringUtils.stringFormat("ghast_tear")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Totem of Undying
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "totem_of_undying", () -> new CrateItem(0, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> DOUBLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "totem_of_undying", () -> new CrateItem(1, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> TRIPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "totem_of_undying", () -> new CrateItem(2, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "totem_of_undying", () -> new CrateItem(3, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "totem_of_undying", () -> new CrateItem(4, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "totem_of_undying", () -> new CrateItem(5, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "totem_of_undying", () -> new CrateItem(6, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> OCTUPLE_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "totem_of_undying", () -> new CrateItem(7, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> MEGA_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "totem_of_undying", () -> new CrateItem(8, StringUtils.stringFormat("totem_of_undying")));
    public static RegistryObject<Item> GIGA_CRATED_TOTEM_OF_UNDYING = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "totem_of_undying", () -> new CrateItem(9, StringUtils.stringFormat("totem_of_undying")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Rail
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "rail", () -> new CrateItem(0, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> DOUBLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "rail", () -> new CrateItem(1, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> TRIPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "rail", () -> new CrateItem(2, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "rail", () -> new CrateItem(3, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "rail", () -> new CrateItem(4, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "rail", () -> new CrateItem(5, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "rail", () -> new CrateItem(6, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "rail", () -> new CrateItem(7, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> MEGA_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "rail", () -> new CrateItem(8, StringUtils.stringFormat("rail")));
    public static RegistryObject<Item> GIGA_CRATED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "rail", () -> new CrateItem(9, StringUtils.stringFormat("rail")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Powered Rail
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "powered_rail", () -> new CrateItem(0, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> DOUBLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "powered_rail", () -> new CrateItem(1, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> TRIPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "powered_rail", () -> new CrateItem(2, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "powered_rail", () -> new CrateItem(3, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "powered_rail", () -> new CrateItem(4, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "powered_rail", () -> new CrateItem(5, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "powered_rail", () -> new CrateItem(6, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> OCTUPLE_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "powered_rail", () -> new CrateItem(7, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> MEGA_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "powered_rail", () -> new CrateItem(8, StringUtils.stringFormat("powered_rail")));
    public static RegistryObject<Item> GIGA_CRATED_POWERED_RAIL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "powered_rail", () -> new CrateItem(9, StringUtils.stringFormat("powered_rail")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Detector Rail
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "detector_rail", () -> new CrateItem(0, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> DOUBLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "detector_rail", () -> new CrateItem(1, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> TRIPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "detector_rail", () -> new CrateItem(2, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "detector_rail", () -> new CrateItem(3, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "detector_rail", () -> new CrateItem(4, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "detector_rail", () -> new CrateItem(5, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "detector_rail", () -> new CrateItem(6, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "detector_rail", () -> new CrateItem(7, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> MEGA_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "detector_rail", () -> new CrateItem(8, StringUtils.stringFormat("detector_rail")));
    public static RegistryObject<Item> GIGA_CRATED_DETECTOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "detector_rail", () -> new CrateItem(9, StringUtils.stringFormat("detector_rail")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Activator Rail
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "activator_rail", () -> new CrateItem(0, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> DOUBLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "activator_rail", () -> new CrateItem(1, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> TRIPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "activator_rail", () -> new CrateItem(2, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "activator_rail", () -> new CrateItem(3, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "activator_rail", () -> new CrateItem(4, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "activator_rail", () -> new CrateItem(5, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "activator_rail", () -> new CrateItem(6, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "activator_rail", () -> new CrateItem(7, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> MEGA_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "activator_rail", () -> new CrateItem(8, StringUtils.stringFormat("activator_rail")));
    public static RegistryObject<Item> GIGA_CRATED_ACTIVATOR_RAIL = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "activator_rail", () -> new CrateItem(9, StringUtils.stringFormat("activator_rail")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Minecart
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "minecart", () -> new CrateItem(0, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> DOUBLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "minecart", () -> new CrateItem(1, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> TRIPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "minecart", () -> new CrateItem(2, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "minecart", () -> new CrateItem(3, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "minecart", () -> new CrateItem(4, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "minecart", () -> new CrateItem(5, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "minecart", () -> new CrateItem(6, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "minecart", () -> new CrateItem(7, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> MEGA_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "minecart", () -> new CrateItem(8, StringUtils.stringFormat("minecart")));
    public static RegistryObject<Item> GIGA_CRATED_MINECART = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "minecart", () -> new CrateItem(9, StringUtils.stringFormat("minecart")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Piston
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "piston", () -> new CrateItem(0, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> DOUBLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "piston", () -> new CrateItem(1, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> TRIPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "piston", () -> new CrateItem(2, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "piston", () -> new CrateItem(3, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "piston", () -> new CrateItem(4, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "piston", () -> new CrateItem(5, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "piston", () -> new CrateItem(6, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "piston", () -> new CrateItem(7, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> MEGA_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "piston", () -> new CrateItem(8, StringUtils.stringFormat("piston")));
    public static RegistryObject<Item> GIGA_CRATED_PISTON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "piston", () -> new CrateItem(9, StringUtils.stringFormat("piston")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sticky Piston
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "sticky_piston", () -> new CrateItem(0, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> DOUBLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "sticky_piston", () -> new CrateItem(1, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> TRIPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "sticky_piston", () -> new CrateItem(2, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "sticky_piston", () -> new CrateItem(3, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "sticky_piston", () -> new CrateItem(4, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "sticky_piston", () -> new CrateItem(5, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "sticky_piston", () -> new CrateItem(6, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> OCTUPLE_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "sticky_piston", () -> new CrateItem(7, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> MEGA_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "sticky_piston", () -> new CrateItem(8, StringUtils.stringFormat("sticky_piston")));
    public static RegistryObject<Item> GIGA_CRATED_STICKY_PISTON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "sticky_piston", () -> new CrateItem(9, StringUtils.stringFormat("sticky_piston")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dispenser
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dispenser", () -> new CrateItem(0, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> DOUBLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dispenser", () -> new CrateItem(1, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> TRIPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dispenser", () -> new CrateItem(2, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dispenser", () -> new CrateItem(3, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dispenser", () -> new CrateItem(4, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dispenser", () -> new CrateItem(5, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dispenser", () -> new CrateItem(6, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dispenser", () -> new CrateItem(7, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> MEGA_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dispenser", () -> new CrateItem(8, StringUtils.stringFormat("dispenser")));
    public static RegistryObject<Item> GIGA_CRATED_DISPENSER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dispenser", () -> new CrateItem(9, StringUtils.stringFormat("dispenser")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Dropper
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "dropper", () -> new CrateItem(0, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> DOUBLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "dropper", () -> new CrateItem(1, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> TRIPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "dropper", () -> new CrateItem(2, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "dropper", () -> new CrateItem(3, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "dropper", () -> new CrateItem(4, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "dropper", () -> new CrateItem(5, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "dropper", () -> new CrateItem(6, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> OCTUPLE_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "dropper", () -> new CrateItem(7, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> MEGA_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "dropper", () -> new CrateItem(8, StringUtils.stringFormat("dropper")));
    public static RegistryObject<Item> GIGA_CRATED_DROPPER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "dropper", () -> new CrateItem(9, StringUtils.stringFormat("dropper")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Hopper
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "hopper", () -> new CrateItem(0, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> DOUBLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "hopper", () -> new CrateItem(1, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> TRIPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "hopper", () -> new CrateItem(2, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "hopper", () -> new CrateItem(3, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "hopper", () -> new CrateItem(4, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "hopper", () -> new CrateItem(5, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "hopper", () -> new CrateItem(6, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> OCTUPLE_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "hopper", () -> new CrateItem(7, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> MEGA_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "hopper", () -> new CrateItem(8, StringUtils.stringFormat("hopper")));
    public static RegistryObject<Item> GIGA_CRATED_HOPPER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "hopper", () -> new CrateItem(9, StringUtils.stringFormat("hopper")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Observer
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "observer", () -> new CrateItem(0, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> DOUBLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "observer", () -> new CrateItem(1, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> TRIPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "observer", () -> new CrateItem(2, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "observer", () -> new CrateItem(3, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "observer", () -> new CrateItem(4, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "observer", () -> new CrateItem(5, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "observer", () -> new CrateItem(6, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> OCTUPLE_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "observer", () -> new CrateItem(7, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> MEGA_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "observer", () -> new CrateItem(8, StringUtils.stringFormat("observer")));
    public static RegistryObject<Item> GIGA_CRATED_OBSERVER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "observer", () -> new CrateItem(9, StringUtils.stringFormat("observer")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cauldron
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cauldron", () -> new CrateItem(0, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> DOUBLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cauldron", () -> new CrateItem(1, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> TRIPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cauldron", () -> new CrateItem(2, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cauldron", () -> new CrateItem(3, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cauldron", () -> new CrateItem(4, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cauldron", () -> new CrateItem(5, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cauldron", () -> new CrateItem(6, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cauldron", () -> new CrateItem(7, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> MEGA_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cauldron", () -> new CrateItem(8, StringUtils.stringFormat("cauldron")));
    public static RegistryObject<Item> GIGA_CRATED_CAULDRON = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cauldron", () -> new CrateItem(9, StringUtils.stringFormat("cauldron")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Repeater
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "repeater", () -> new CrateItem(0, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> DOUBLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "repeater", () -> new CrateItem(1, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> TRIPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "repeater", () -> new CrateItem(2, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "repeater", () -> new CrateItem(3, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "repeater", () -> new CrateItem(4, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "repeater", () -> new CrateItem(5, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "repeater", () -> new CrateItem(6, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> OCTUPLE_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "repeater", () -> new CrateItem(7, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> MEGA_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "repeater", () -> new CrateItem(8, StringUtils.stringFormat("redstone_repeater")));
    public static RegistryObject<Item> GIGA_CRATED_REDSTONE_REPEATER = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "repeater", () -> new CrateItem(9, StringUtils.stringFormat("redstone_repeater")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Comparator
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "comparator", () -> new CrateItem(0, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> DOUBLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "comparator", () -> new CrateItem(1, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> TRIPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "comparator", () -> new CrateItem(2, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "comparator", () -> new CrateItem(3, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "comparator", () -> new CrateItem(4, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "comparator", () -> new CrateItem(5, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "comparator", () -> new CrateItem(6, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> OCTUPLE_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "comparator", () -> new CrateItem(7, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> MEGA_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "comparator", () -> new CrateItem(8, StringUtils.stringFormat("redstone_comparator")));
    public static RegistryObject<Item> GIGA_CRATED_REDSTONE_COMPARATOR = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "comparator", () -> new CrateItem(9, StringUtils.stringFormat("redstone_comparator")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region White Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "white_carpet", () -> new CrateItem(0, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "white_carpet", () -> new CrateItem(1, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "white_carpet", () -> new CrateItem(2, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "white_carpet", () -> new CrateItem(3, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "white_carpet", () -> new CrateItem(4, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "white_carpet", () -> new CrateItem(5, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "white_carpet", () -> new CrateItem(6, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "white_carpet", () -> new CrateItem(7, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "white_carpet", () -> new CrateItem(8, StringUtils.stringFormat("white_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_WHITE_CARPE = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "white_carpet", () -> new CrateItem(9, StringUtils.stringFormat("white_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Light Gray Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "light_gray_carpet", () -> new CrateItem(0, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "light_gray_carpet", () -> new CrateItem(1, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "light_gray_carpet", () -> new CrateItem(2, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "light_gray_carpet", () -> new CrateItem(3, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "light_gray_carpet", () -> new CrateItem(4, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "light_gray_carpet", () -> new CrateItem(5, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "light_gray_carpet", () -> new CrateItem(6, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "light_gray_carpet", () -> new CrateItem(7, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "light_gray_carpet", () -> new CrateItem(8, StringUtils.stringFormat("light_gray_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_LIGHT_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "light_gray_carpet", () -> new CrateItem(9, StringUtils.stringFormat("light_gray_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gray Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "gray_carpet", () -> new CrateItem(0, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "gray_carpet", () -> new CrateItem(1, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "gray_carpet", () -> new CrateItem(2, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "gray_carpet", () -> new CrateItem(3, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "gray_carpet", () -> new CrateItem(4, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "gray_carpet", () -> new CrateItem(5, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "gray_carpet", () -> new CrateItem(6, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "gray_carpet", () -> new CrateItem(7, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "gray_carpet", () -> new CrateItem(8, StringUtils.stringFormat("gray_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_GRAY_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "gray_carpet", () -> new CrateItem(9, StringUtils.stringFormat("gray_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Black Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "black_carpet", () -> new CrateItem(0, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "black_carpet", () -> new CrateItem(1, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "black_carpet", () -> new CrateItem(2, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "black_carpet", () -> new CrateItem(3, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "black_carpet", () -> new CrateItem(4, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "black_carpet", () -> new CrateItem(5, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "black_carpet", () -> new CrateItem(6, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "black_carpet", () -> new CrateItem(7, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "black_carpet", () -> new CrateItem(8, StringUtils.stringFormat("black_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_BLACK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "black_carpet", () -> new CrateItem(9, StringUtils.stringFormat("black_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Brown Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "brown_carpet", () -> new CrateItem(0, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "brown_carpet", () -> new CrateItem(1, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "brown_carpet", () -> new CrateItem(2, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "brown_carpet", () -> new CrateItem(3, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "brown_carpet", () -> new CrateItem(4, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "brown_carpet", () -> new CrateItem(5, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "brown_carpet", () -> new CrateItem(6, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "brown_carpet", () -> new CrateItem(7, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "brown_carpet", () -> new CrateItem(8, StringUtils.stringFormat("brown_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_BROWN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "brown_carpet", () -> new CrateItem(9, StringUtils.stringFormat("brown_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "red_carpet", () -> new CrateItem(0, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "red_carpet", () -> new CrateItem(1, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "red_carpet", () -> new CrateItem(2, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "red_carpet", () -> new CrateItem(3, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "red_carpet", () -> new CrateItem(4, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "red_carpet", () -> new CrateItem(5, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "red_carpet", () -> new CrateItem(6, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "red_carpet", () -> new CrateItem(7, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "red_carpet", () -> new CrateItem(8, StringUtils.stringFormat("red_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_RED_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "red_carpet", () -> new CrateItem(9, StringUtils.stringFormat("red_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Orange Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "orange_carpet", () -> new CrateItem(0, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "orange_carpet", () -> new CrateItem(1, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "orange_carpet", () -> new CrateItem(2, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "orange_carpet", () -> new CrateItem(3, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "orange_carpet", () -> new CrateItem(4, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "orange_carpet", () -> new CrateItem(5, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "orange_carpet", () -> new CrateItem(6, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "orange_carpet", () -> new CrateItem(7, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "orange_carpet", () -> new CrateItem(8, StringUtils.stringFormat("orange_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_ORANGE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "orange_carpet", () -> new CrateItem(9, StringUtils.stringFormat("orange_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Yellow Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "yellow_carpet", () -> new CrateItem(0, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "yellow_carpet", () -> new CrateItem(1, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "yellow_carpet", () -> new CrateItem(2, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "yellow_carpet", () -> new CrateItem(3, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "yellow_carpet", () -> new CrateItem(4, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "yellow_carpet", () -> new CrateItem(5, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "yellow_carpet", () -> new CrateItem(6, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "yellow_carpet", () -> new CrateItem(7, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "yellow_carpet", () -> new CrateItem(8, StringUtils.stringFormat("yellow_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_YELLOW_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "yellow_carpet", () -> new CrateItem(9, StringUtils.stringFormat("yellow_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lime Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "lime_carpet", () -> new CrateItem(0, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "lime_carpet", () -> new CrateItem(1, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "lime_carpet", () -> new CrateItem(2, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "lime_carpet", () -> new CrateItem(3, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "lime_carpet", () -> new CrateItem(4, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "lime_carpet", () -> new CrateItem(5, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "lime_carpet", () -> new CrateItem(6, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "lime_carpet", () -> new CrateItem(7, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "lime_carpet", () -> new CrateItem(8, StringUtils.stringFormat("lime_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_LIME_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "lime_carpet", () -> new CrateItem(9, StringUtils.stringFormat("lime_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Green Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "green_carpet", () -> new CrateItem(0, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "green_carpet", () -> new CrateItem(1, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "green_carpet", () -> new CrateItem(2, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "green_carpet", () -> new CrateItem(3, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "green_carpet", () -> new CrateItem(4, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "green_carpet", () -> new CrateItem(5, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "green_carpet", () -> new CrateItem(6, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "green_carpet", () -> new CrateItem(7, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "green_carpet", () -> new CrateItem(8, StringUtils.stringFormat("green_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_GREEN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "green_carpet", () -> new CrateItem(9, StringUtils.stringFormat("green_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cyan Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "cyan_carpet", () -> new CrateItem(0, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "cyan_carpet", () -> new CrateItem(1, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "cyan_carpet", () -> new CrateItem(2, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "cyan_carpet", () -> new CrateItem(3, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "cyan_carpet", () -> new CrateItem(4, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "cyan_carpet", () -> new CrateItem(5, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "cyan_carpet", () -> new CrateItem(6, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "cyan_carpet", () -> new CrateItem(7, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "cyan_carpet", () -> new CrateItem(8, StringUtils.stringFormat("cyan_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_CYAN_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "cyan_carpet", () -> new CrateItem(9, StringUtils.stringFormat("cyan_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Light Blue Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "light_blue_carpet", () -> new CrateItem(0, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "light_blue_carpet", () -> new CrateItem(1, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "light_blue_carpet", () -> new CrateItem(2, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "light_blue_carpet", () -> new CrateItem(3, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "light_blue_carpet", () -> new CrateItem(4, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "light_blue_carpet", () -> new CrateItem(5, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "light_blue_carpet", () -> new CrateItem(6, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "light_blue_carpet", () -> new CrateItem(7, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "light_blue_carpet", () -> new CrateItem(8, StringUtils.stringFormat("light_blue_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_LIGHT_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "light_blue_carpet", () -> new CrateItem(9, StringUtils.stringFormat("light_blue_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Blue Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "blue_carpet", () -> new CrateItem(0, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "blue_carpet", () -> new CrateItem(1, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "blue_carpet", () -> new CrateItem(2, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "blue_carpet", () -> new CrateItem(3, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "blue_carpet", () -> new CrateItem(4, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "blue_carpet", () -> new CrateItem(5, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "blue_carpet", () -> new CrateItem(6, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "blue_carpet", () -> new CrateItem(7, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "blue_carpet", () -> new CrateItem(8, StringUtils.stringFormat("blue_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_BLUE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "blue_carpet", () -> new CrateItem(9, StringUtils.stringFormat("blue_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Purple Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "purple_carpet", () -> new CrateItem(0, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "purple_carpet", () -> new CrateItem(1, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "purple_carpet", () -> new CrateItem(2, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "purple_carpet", () -> new CrateItem(3, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "purple_carpet", () -> new CrateItem(4, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "purple_carpet", () -> new CrateItem(5, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "purple_carpet", () -> new CrateItem(6, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "purple_carpet", () -> new CrateItem(7, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "purple_carpet", () -> new CrateItem(8, StringUtils.stringFormat("purple_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_PURPLE_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "purple_carpet", () -> new CrateItem(9, StringUtils.stringFormat("purple_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Magenta Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "magenta_carpet", () -> new CrateItem(0, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "magenta_carpet", () -> new CrateItem(1, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "magenta_carpet", () -> new CrateItem(2, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "magenta_carpet", () -> new CrateItem(3, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "magenta_carpet", () -> new CrateItem(4, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "magenta_carpet", () -> new CrateItem(5, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "magenta_carpet", () -> new CrateItem(6, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "magenta_carpet", () -> new CrateItem(7, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "magenta_carpet", () -> new CrateItem(8, StringUtils.stringFormat("magenta_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_MAGENTA_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "magenta_carpet", () -> new CrateItem(9, StringUtils.stringFormat("magenta_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Pink Carpet
    //------------------------------------------------------------------------------------------------------------------
    public static RegistryObject<Item> CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("crated_" + "pink_carpet", () -> new CrateItem(0, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> DOUBLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("double_crated_" + "pink_carpet", () -> new CrateItem(1, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> TRIPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("triple_crated_" + "pink_carpet", () -> new CrateItem(2, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> QUADRUPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quadruple_crated_" + "pink_carpet", () -> new CrateItem(3, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> QUINTUPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("quintuple_crated_" + "pink_carpet", () -> new CrateItem(4, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> SEXTUPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("sextuple_crated_" + "pink_carpet", () -> new CrateItem(5, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> SEPTUPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("septuple_crated_" + "pink_carpet", () -> new CrateItem(6, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> OCTUPLE_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("octuple_crated_" + "pink_carpet", () -> new CrateItem(7, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> MEGA_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("mega_crated_" + "pink_carpet", () -> new CrateItem(8, StringUtils.stringFormat("pink_carpet")));
    public static RegistryObject<Item> GIGA_CRATED_PINK_CARPET = CBRegistryEvent.CRATE_ITEMS.register("giga_crated_" + "pink_carpet", () -> new CrateItem(9, StringUtils.stringFormat("pink_carpet")));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
}