package net.sashiro.compressedblocks.util;

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
}
