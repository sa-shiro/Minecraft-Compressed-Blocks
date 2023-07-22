package net.sashiro.compressedblocks.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

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
     * Helper function to write a {@link String} to a {@link java.io.File}
     *
     * @param content  the {@link String} to be written
     * @param filePath the {@link Path} the {@link String} should be written to
     * @throws IOException if {@link Path} not found / does not exist
     */
    public static void writeStringToFile(String content, Path filePath) throws IOException {
        byte[] bytes = content.getBytes();
        Files.write(filePath, bytes, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
