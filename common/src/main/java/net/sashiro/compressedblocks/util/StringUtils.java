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

    /**
     * Utility function to remove the index of compressed Items and Blocks
     *
     * @param name of the Item / Block.
     * @return actual Block name.
     */
    public static String removeCompressionName(String name) {
        for (int i = 0; i < 10; i++) {
            if (name.contains("c" + i))
                name = name.replace("c" + i + "_", "");
        }
        return name;
    }
}
