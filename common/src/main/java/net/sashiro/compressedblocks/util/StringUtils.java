package net.sashiro.compressedblocks.util;

public class StringUtils {
    
    /**
     * Utility function to replace underscores<br>
     * with spaces and format the {@link String}  in uppercase.
     *
     * @param formatString the {@link String} to format
     * @return the formatted {@link String}
     */
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
