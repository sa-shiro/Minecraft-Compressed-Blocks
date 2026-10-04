package net.sashiro.compressedblocks.util;

import net.minecraft.SharedConstants;
import net.sashiro.compressedblocks.compression.CompressionEntry;

/**
 * Utility class for handling version-related operations in the Compressed Blocks mod.
 */
@SuppressWarnings("BooleanMethodIsAlwaysInverted")
public class VersionUtils {

    private VersionUtils() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    /**
     * Checks if the given CompressionEntry is compatible with the current Minecraft version.
     *
     * @param entry The CompressionEntry to check.
     * @return true if the entry is compatible with the current Minecraft version, false otherwise.
     */
    public static boolean isCompatibleWithCurrentVersion(CompressionEntry entry) {
        int[] currentVersion = parseVersion(SharedConstants.getCurrentVersion().getId());
        int[] entryVersion = parseVersion(entry.minecraftVersion());

        // Different versioning schemes:
        // 1.x.x -> legacy Minecraft versions
        // 26.x.x -> year-based Minecraft versions
        if (currentVersion[0] != entryVersion[0]) {
            return currentVersion[0] > entryVersion[0];
        }

        // Same versioning scheme: compare major/minor/patch normally.
        return compareVersions(currentVersion, entryVersion) >= 0;
    }

    /**
     * Parses a version string into an array of integers representing major, minor, and patch versions.
     *
     * @param version The version string to parse (e.g., "1.20.1").
     * @return An array of integers [major, minor, patch].
     */
    private static int[] parseVersion(String version) {
        String[] parts = version.split("\\.");

        return new int[]{
                Integer.parseInt(parts[0]),
                parts.length > 1 ? Integer.parseInt(parts[1]) : 0,
                parts.length > 2 ? Integer.parseInt(parts[2]) : 0
        };
    }

    /**
     * Compares two version arrays.
     *
     * @param a The first version array [major, minor, patch].
     * @param b The second version array [major, minor, patch].
     * @return A negative integer if a < b, zero if a == b, or a positive integer if a > b.
     */
    private static int compareVersions(int[] a, int[] b) {
        for (int i = 0; i < 3; i++) {
            int comparison = Integer.compare(a[i], b[i]);

            if (comparison != 0) {
                return comparison;
            }
        }

        return 0;
    }
}
