package com.github.sa_shiro.compressedblocks.util;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Client {
    public static final Client INSTANCE = new Client();
    ResourcePackLoader resourcePack;

    private Client() {
    }

    @OnlyIn(Dist.CLIENT)
    public void init() {
        Minecraft mc = Minecraft.getInstance();


        mc.getResourcePackRepository().addPackFinder((packConsumer, packInfoFactory) -> {
            resourcePack = new ResourcePackLoader(ResourceGenerator.configPath);

            String name = "compressedblocks";
            ResourcePackInfo t = ResourcePackInfo.create(name, true, () -> resourcePack, packInfoFactory, ResourcePackInfo.Priority.TOP, tx -> tx);
            packConsumer.accept(t);
        });

    }
}
