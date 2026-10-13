package net.sashiro.compressedblocks.fabric.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.sashiro.compressedblocks.CompressedBlocks;

public class CBModMenuApiImpl implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> new ConfigurationScreen(CompressedBlocks.MOD_ID, parent);
    }
}
