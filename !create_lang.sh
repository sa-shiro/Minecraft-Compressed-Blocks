NAMES=(stone granite diorite andesite dirt cobblestone sandstone red_sandstone bricks netherrack glowstone stone_bricks nether_bricks end_stone coal_block lapis_block gold_block iron_block diamond_block emerald_block redstone_block sand red_sand gravel soul_sand obsidian)

cd src/main/resources/assets/compressedblocks/lang/ || exit
for i in "${NAMES[@]}" ;
do
    printf "\"item.compressedblocks.c0_$i\": \"Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c1_$i\": \"Double Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c2_$i\": \"Triple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c3_$i\": \"Quadruple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c4_$i\": \"Quintuple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c5_$i\": \"Sextuple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c6_$i\": \"Septuple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c7_$i\": \"Octuple Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c8_$i\": \"Mega Compressed PLACEHOLDER\"," >> en_us.json
    printf "\"item.compressedblocks.c9_$i\": \"Giga Compressed PLACEHOLDER\"," >> en_us.json
done
printf "\"script_placeholder\": \"Script Placeholder\"}" >> en_us.json

# Stone
# Granite
# Diorite
# Andesite
# Dirt
# Cobblestone
# Sandstone
# Red Sandstone
# Bricks
# Netherrack
# Glowstone
# Stone Bricks
# Nether Bricks
# End Stone
# Coal Block
# Lapis Lazuli Block
# Gold Block
# Iron Block
# Diamond Block
# Emerald Block
# Redstone Block
# Sand
# Red Sand
# Gravel
# Soul Sand
# Obsidian