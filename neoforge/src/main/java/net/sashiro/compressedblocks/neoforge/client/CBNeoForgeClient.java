package net.sashiro.compressedblocks.neoforge.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.sashiro.compressedblocks.Constants;

@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public class CBNeoForgeClient {

    public CBNeoForgeClient(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }
}
