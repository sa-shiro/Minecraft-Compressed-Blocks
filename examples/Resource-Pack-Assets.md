# Custom Resource-Pack Assets

Custom-entry JSONC definitions register compressed blocks and crates, but custom blocks need both a resource pack and a
datapack to work correctly. The mod developer or modpack author must provide both packs along with the custom-entry
files. The [example resource pack](example_resourcepack) and [example datapack](example_datapack) in this wiki show a
working layout.

Put language names, blockstates, and models in the resource pack's `assets/compressedblocks/` directory. The source
textures may be provided by the source mod; make sure their references use the source mod's namespace. The resource pack
needs a root-level `pack.mcmeta` with a pack format supported by the target Minecraft version. It can be distributed
with a modpack and enabled for players.

Recipes, loot tables, and tags are datapack resources, not resource-pack assets. Keep them under a datapack's `data/`
directory. A datapack must be loaded by every world using the custom content: a mod can automatically supply it to newly
created worlds, or users must add it to each world themselves. In single-player, place it in that world's
`saves/<world>/datapacks/` directory; on a server, place it in the server world's `datapacks/` directory. Do not combine
these into one pack: install the resource pack and datapack separately.

## Naming compressed variants

For a block with `id: "bop_white_sand"`, the block IDs are:

```text
compressedblocks:c0_bop_white_sand
compressedblocks:c1_bop_white_sand
...
compressedblocks:c9_bop_white_sand
```

For a crate item with `id: "bop_ruby"`, the crate paths by level are:

| Level | Registry path               |
|-------|-----------------------------|
| 0     | `crated_bop_ruby`           |
| 1     | `double_crated_bop_ruby`    |
| 2     | `triple_crated_bop_ruby`    |
| 3     | `quadruple_crated_bop_ruby` |
| 4     | `quintuple_crated_bop_ruby` |
| 5     | `sextuple_crated_bop_ruby`  |
| 6     | `septuple_crated_bop_ruby`  |
| 7     | `octuple_crated_bop_ruby`   |
| 8     | `mega_crated_bop_ruby`      |
| 9     | `giga_crated_bop_ruby`      |

Only create resources for levels below the entry's configured maximum. For example, maximum level `4` creates levels
0–3.

## Compressed block models

Mirror Minecraft's asset layout and use the compressed path, not the source block path:

```text
assets/compressedblocks/
├── blockstates/
│   └── c0_bop_white_sand.json
├── models/
│   ├── block/
│   │   └── c0_bop_white_sand.json
│   └── item/
│       └── c0_bop_white_sand.json
```

Repeat the `c0_` names for each configured level (`c1_bop_white_sand`, etc.). Ordinary block items use a model that
points to their block model; the item model can use this form:

```json
{
  "parent": "compressedblocks:block/c0_bop_white_sand"
}
```

For an ordinary cube block, a model can reuse CB's transparent overlay template and point its base texture at the source
mod:

```json
{
  "parent": "compressedblocks:block/template/template_block",
  "textures": {
    "all": "examplemod:block/marble",
    "overlay": "compressedblocks:block/compression_level_0"
  }
}
```

Replace `examplemod:block/marble` with the actual texture resource location, without the `textures/` directory or `.png`
extension. Use the matching overlay for each level: `compressedblocks:block/compression_level_0` through
`compression_level_9`. CB supplies these overlays.

An ordinary block's blockstate points to its model:

```json
{
  "variants": {
    "": {
      "model": "compressedblocks:block/c0_bop_white_sand"
    }
  }
}
```

For `ROT_BLOCK`, the state uses the block's axis and references both a vertical and horizontal model. Provide these
files for every level. The example uses `bop_example_log` as the custom `id`:

```text
assets/compressedblocks/blockstates/c0_bop_example_log.json
assets/compressedblocks/models/block/c0_bop_example_log.json
assets/compressedblocks/models/block/c0_bop_example_log_horizontal.json
assets/compressedblocks/models/item/c0_bop_example_log.json
```

The vertical model should use `compressedblocks:block/template/template_cube_column`; the horizontal model should use
`compressedblocks:block/template/template_cube_column_horizontal`. Both need `end`, `side`, `particle`, and `overlay`
textures. Example vertical model:

```json
{
  "parent": "compressedblocks:block/template/template_cube_column",
  "textures": {
    "end": "examplemod:block/example_log_top",
    "side": "examplemod:block/example_log",
    "particle": "examplemod:block/example_log",
    "overlay": "compressedblocks:block/compression_level_0"
  }
}
```

Use the corresponding horizontal template for the `_horizontal` model. The blockstate must cover all three axes (`x`,
`y`, and `z`) and preserve the rotations.

`GLASS_BLOCK` uses the regular block model path but should reference a transparent source texture. It is registered as
non-occluding; ensure its model and texture have the intended transparency.

## Crate item models

For an item crate, use a 3D model template with the crate texture, the source item texture on the front, and a
level-number overlay. Put the item model at:

```text
assets/compressedblocks/models/item/crated_bop_ruby.json
assets/compressedblocks/models/item/double_crated_bop_ruby.json
...
```

Use the full crate prefix for each level. Example for level 0:

```json
{
  "parent": "compressedblocks:block/template/template_crate",
  "textures": {
    "all": "compressedblocks:item/crate",
    "item": "examplemod:item/ruby",
    "number": "compressedblocks:item/level_0"
  }
}
```

CB supplies the crate frame and number overlays (`compressedblocks:item/level_0` through `level_9`). Set `item` to the
source item's texture resource location, including its namespace.

## Crate block models

For `kind: "CRATE_BLOCK"`, provide a blockstate, block model, and item model per crate level:

```text
assets/compressedblocks/blockstates/crated_bop_marble.json
assets/compressedblocks/models/block/crated_bop_marble.json
assets/compressedblocks/models/item/crated_bop_marble.json
```

Crate blockstates use horizontal `facing` variants. The block model can use
`compressedblocks:block/template/template_crate`; use `compressedblocks:block/crate` as the crate texture, the source
texture for `item`, and `compressedblocks:block/level_0` for `number`. The block item model should point to the block
model. Repeat using each crate prefix and the matching level overlay.

## Language names

Add a language file to the resource pack for every compressed block and crate. For example:

```text
assets/compressedblocks/lang/en_us.json
```

Use the complete compressed ID in each translation key. Block entries and `CRATE_BLOCK` entries use
`block.compressedblocks.<id>` keys; `CRATE_ITEM` entries use `item.compressedblocks.<id>` keys. Example:

```json
{
  "block.compressedblocks.c0_bop_white_sand": "Compressed White Sand",
  "item.compressedblocks.crated_bop_ruby": "Crated Ruby",
  "block.compressedblocks.crated_bop_marble": "Crated Marble"
}
```

Add a key for every registered level and every crate name you want translated. Without a matching language entry, the
game displays the translation key instead of a readable name.

## Loot tables

Compressed blocks and `CRATE_BLOCK` entries need a loot table for each registered block level. Without one, the block
will not drop when mined. Put the loot table in the datapack's `data/compressedblocks/loot_table/blocks/` directory,
using the exact block ID as its filename:

```text
data/compressedblocks/loot_table/blocks/c0_bop_white_sand.json
data/compressedblocks/loot_table/blocks/c1_bop_white_sand.json
...
data/compressedblocks/loot_table/blocks/crated_bop_marble.json
```

Each loot table should drop its matching block ID. Create a file for every compressed block level and every crate block
level. `CRATE_ITEM` entries are items and do not need block loot tables.

## Block tags

Compressed blocks and `CRATE_BLOCK` entries need the appropriate vanilla block tags for their tool and mining behavior.
Add every compressed level to the same mining tags as its source block. For example, if the source block is mined with a
pickaxe, include each compressed block in `minecraft:mineable/pickaxe`. If it requires a particular tool tier, add it to
the corresponding `minecraft:needs_*_tool` tag as well. Use the tags appropriate for the source block; do not add
`CRATE_ITEM` entries because they are items, not blocks.

For example, create this datapack file for pickaxe-mineable blocks:

```text
data/minecraft/tags/block/mineable/pickaxe.json
```

```json
{
  "replace": false,
  "values": [
    "compressedblocks:c0_bop_white_sand",
    "compressedblocks:c1_bop_white_sand",
    "compressedblocks:crated_bop_marble"
  ]
}
```

Add every applicable compression level and crate-block level to the tag. Keep `"replace": false` so the datapack adds
entries without replacing the vanilla tag contents.

Compression tags such as `compressedblocks:compression_x01`, `compressedblocks:compression_x02`, and higher are
optional. If you use them, create block tags under `data/compressedblocks/tags/block/` and item tags under
`data/compressedblocks/tags/item/`, listing the matching compressed block or crate item IDs. These tags do not replace
the required vanilla mining/tool tags.

```text
data/compressedblocks/tags/block/compression_x01.json
```

```json
{
  "replace": false,
  "values": [
    "compressedblocks:c0_bop_white_sand"
  ]
}
```

## Recipes

Blockstates and models only control appearance; they do not create crafting recipes. Recipe data belongs in a datapack
under `data/compressedblocks/recipe/`. For each entry, provide compression recipes from the original source through
every configured level, plus recipes to decompress each level back to its previous ingredient (s). Use the exact IDs
listed above and the source item's/block's actual namespace for the first ingredient.

For example, the following Minecraft 1.21.1 recipes compress `biomesoplenty:white_sand` into the first level and
decompress it again. Here, `bop_white_sand` is the custom `id`, while `biomesoplenty:white_sand` is the source block's
actual registry ID:

```text
data/compressedblocks/recipe/shaped_c0_bop_white_sand.json
data/compressedblocks/recipe/shapeless_c0_bop_white_sand.json
```

`shaped_c0_bop_white_sand.json`:

```json
{
  "type": "minecraft:crafting_shaped",
  "category": "building",
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "key": {
    "#": {
      "item": "biomesoplenty:white_sand"
    }
  },
  "result": {
    "id": "compressedblocks:c0_bop_white_sand",
    "count": 1
  }
}
```

`shapeless_c0_bop_white_sand.json`:

```json
{
  "type": "minecraft:crafting_shapeless",
  "category": "building",
  "ingredients": [
    {
      "item": "compressedblocks:c0_bop_white_sand"
    }
  ],
  "result": {
    "id": "biomesoplenty:white_sand",
    "count": 9
  }
}
```

For later levels, use the previous compressed level as the shaped recipe ingredient and the next level as its result.
Add the reverse shapeless recipe for each level. Use category `misc` for item crates; use the item registry ID for the
source ingredient. If `has_smaller_compression` is enabled, use four inputs in a 2×2 pattern and return four items when
decompressing.

## Quick validation

1. Confirm the custom JSONC entry is present on both server and client and the game was restarted after it was added.
2. Check that every model texture reference resolves to a texture in the pack, CB, Minecraft, or the source mod.
3. Confirm there is a language entry, blockstate, model, loot table, and the appropriate vanilla tool tags for every
   registered compressed block level; rotational blocks also need horizontal models.
4. Confirm crate items have models and language entries, and crate blocks also have blockstates, loot tables, and
   appropriate vanilla tool tags.
5. If using compression tags, confirm they include the intended compressed block IDs.
6. Confirm recipe data covers compression and decompression at every level.
7. Enable the resource/data pack and verify the entry's name, appearance, drops, and crafting in-game.
