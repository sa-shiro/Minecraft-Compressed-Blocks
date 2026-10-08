package net.sashiro.compressedblocks.platform.registration;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.Services;

import static net.sashiro.compressedblocks.crate.CrateFactory.*;

public class CrateRegistration {
    public static void registerCrates() {
        if (Services.PLATFORM.areCratesEnabled()) {

            createCrateList();

            for (Item entry : CRATE_ITEM_LIST) {
                CrateItem crateItem = (CrateItem) entry;
                Services.PLATFORM.registerCrate(crateItem);
            }

            for (Block entry : CRATE_BLOCK_LIST) {
                CrateBlock crateBlock = (CrateBlock) entry;
                Services.PLATFORM.registerCrate(crateBlock);
            }
        }
    }
}
