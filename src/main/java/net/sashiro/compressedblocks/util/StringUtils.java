package net.sashiro.compressedblocks.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class StringUtils {
    public static String stringFormat(String formatString) {
        formatString = formatString.replace("_", " ");
        String[] words = formatString.split("\\s");
        StringBuilder stringFormat = new StringBuilder();
        for (String str : words) {
            String first = str.substring(0, 1);
            String afterFirst = str.substring(1);
            stringFormat.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return stringFormat.toString().trim();
    }

    public static ResourceLocation resourceLocationFixer(Item item) {
        String str = item.getDescriptionId().replace("item.", "").replace("block.", "").replace("minecraft.", "");
        return new ResourceLocation(str.toLowerCase().replace(" ", "_"));
    }

    public static String stringResourceLocationFixer(Item item) {
        String str = item.getDescriptionId().replace("item.", "").replace("block.", "").replace("minecraft.", "");
        return str.toLowerCase().replace(" ", "_");
    }
}
