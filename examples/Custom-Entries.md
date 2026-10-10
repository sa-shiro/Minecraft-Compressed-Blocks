# Adding Custom Entries

CB can register compressed versions of additional blocks and crate items using JSONC files in the Minecraft
configuration directory. This works for blocks and items supplied by Minecraft or another installed mod.

## 1. Create the entry files

Create the `compressedblocks` directory inside the instance's `config` directory, then add either or both files:

```text
.minecraft/
└── config/
    └── compressedblocks/
        ├── custom_blocks.jsonc
        └── custom_crates.jsonc
```

Use `custom_blocks.jsonc` for compressed blocks and `custom_crates.jsonc` for item crates or crate blocks. Each file
must contain a JSON array of entries. JSONC comments are supported.

The examples below use hypothetical source registry IDs. The `id` field is a path in CB's `compressedblocks` namespace,
not the source mod's registry ID. You can add a mod prefix to make the path unique and recognizable, such as
`bop_white_sand`; do not include a colon or namespace in the `id`.

### Compressed block

```jsonc
[
  {
    "id": "bop_white_sand",
    "kind": "BLOCK",
    "hardness_resistance_multiplier": 1.0,
    "max_compression_level": 10,
    "has_smaller_compression": false,
    "enabled_by_default": true,
    "minecraft_version": "1.21.1"
  }
]
```

### Item crate

```jsonc
[
  {
    "id": "bop_ruby",
    "kind": "CRATE_ITEM",
    "hardness_resistance_multiplier": 1.0,
    "max_compression_level": 10,
    "has_smaller_compression": false,
    "enabled_by_default": true,
    "minecraft_version": "1.21.1"
  }
]
```

Add more objects to the same array, separating them with commas. Do not add an extra comma after the last object.

## 2. Configure the entry fields

All fields are required. Their names and `kind` values are case-sensitive.

| Field                            | Meaning                                                                                                                                                                                          |
|----------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `id`                             | Unique lowercase path for the compressed content in CB's namespace, without a colon or namespace. A mod prefix is allowed and recommended to avoid name conflicts, for example `bop_white_sand`. |
| `kind`                           | Entry type: `BLOCK`, `ROT_BLOCK`, or `GLASS_BLOCK` in `custom_blocks.jsonc`; `CRATE_ITEM` or `CRATE_BLOCK` in `custom_crates.jsonc`.                                                             |
| `hardness_resistance_multiplier` | Multiplier for the compressed block's hardness and blast resistance. It applies to block entries; crate entries do not use it for their registered block/item properties.                        |
| `max_compression_level`          | Maximum level for this entry, from 1 to 10. A value of `10` creates levels `c0` through `c9` for blocks, or crate levels 0 through 9.                                                            |
| `has_smaller_compression`        | Set to `true` to mark the entry for the 2×2/four-input compression recipe; otherwise compression uses the standard 3×3/nine-input recipe.                                                        |
| `enabled_by_default`             | Initial per-entry enabled setting in CB's startup configuration.                                                                                                                                 |
| `minecraft_version`              | First Minecraft version in which the source entry is available, using a numeric version such as `1.21.1`. Entries are registered when the running version is at least this version.              |

### Choosing a block kind

- `BLOCK` creates ordinary compressed blocks.
- `ROT_BLOCK` creates blocks with log/pillar-style axis states. Choose this for blocks that need end and side textures,
  such as logs.
- `GLASS_BLOCK` creates non-occluding compressed blocks, intended for transparent blocks.

### Choosing a crate kind

- `CRATE_ITEM` creates crate items for a source item.
- `CRATE_BLOCK` creates placeable crate blocks for a source block.

`CRATE_BLOCK` is supported by the entry format, but the built-in catalog currently uses item crates. Custom crate blocks
need suitable block models and blockstate resources as described in
the [resource guide](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki/Resource-Pack-Assets).

## Overriding Existing Entries

Custom entries can also override built-in entries.

To override an existing entry, use the same `id` as the built-in entry in the corresponding custom configuration file. The custom entry completely replaces the existing entry.

For example:

```jsonc
[
    {
        "id": "iron_block",
        "kind": "BLOCK",
        "hardness_resistance_multiplier": 1.0,
        "max_compression_level": 5,
        "has_smaller_compression": true,
        "enabled_by_default": false,
        "minecraft_version": "1.21.1"
    }
]
```

## 3. Check the identifiers and avoid duplicates

CB uses the `id` as a path in its own `compressedblocks` namespace. For example, `id: "bop_white_sand"` creates block
IDs such as `compressedblocks:c0_bop_white_sand`; `id: "bop_ruby"` creates crate IDs such as
`compressedblocks:crated_bop_ruby`.

- Use a distinct path for each entry. Including a short mod prefix, such as `bop_`, helps avoid conflicts with built-in
  entries and other custom entries.
- Do not include a namespace or colon in `id`; the ID belongs to CB, while the source block or item keeps its own
  registry ID in recipes and texture references.
- Do not add an entry whose path is already in CB's built-in catalog or another custom entry. Entries are appended to
  the built-in lists; they are not overrides.
- The source mod or game content must be installed for its original textures and crafting ingredient to exist.

## 4. Control the entry and its settings

You do not need to add the entry manually to another configuration file. After loading the JSONC definitions, CB
automatically creates the corresponding per-entry settings. As a player or modpack user, control those settings in the
in-game mod configuration screen or in `config/compressedblocks-startup.toml`. Depending on the setting, you can change
whether the entry is enabled, its block hardness/resistance multiplier, and its maximum compression level.

The global settings control whether block compression or crates are enabled, global maximum levels, and per-level
hardness/resistance values. Both entry-specific and global maximum levels limit how many levels are available. Changes
to startup settings require a restart. The in-game screen and startup TOML are two ways to control the configuration;
mod developers can instead change the entry definition in the source JSONC file.

For multiplayer, make sure the server and clients have matching custom-entry definitions and compatible settings.

> [!WARNING]
> If you disable an entry but leave its resource files installed, those files may refer to blocks or items that are no
longer registered. Minecraft can then repeatedly log errors about invalid or missing resources, such as blockstates for
missing blocks. Remove or disable the corresponding resource-pack and data-pack files along with the entry to avoid this
log spam.

## 5. Add the required assets and recipes

The JSONC entry registers the compressed content, but it is not enough on its own to make custom blocks work. The mod
developer or modpack author must provide both:

- A **resource pack** with the language names, models, blockstates, and textures.
- A **datapack** with recipes, loot tables for blocks, and the required block tags.

The packs need to be installed alongside the custom-entry JSONC files. The [example resource pack](example_resourcepack)
and [example datapack](example_datapack) show complete sample layouts;
see [Custom Resource-Pack Assets](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki/Resource-Pack-Assets) for
details.

The resource pack can be distributed with a modpack and enabled for players. A datapack must be loaded by every world
that uses the custom entries. Mod developers should use a mod that automatically supplies the datapack to newly created
worlds. Otherwise, users must add the datapack to each world themselves. In single-player, put it in that world's
`saves/<world>/datapacks/` directory; on a server, put it in the server world's `datapacks/` directory.

> [!WARNING]
> The datapack must be loaded by **every world** using the custom entries.
>
> For modpacks, use a **third-party mod that automatically supplies the datapack to newly created worlds**. Otherwise,
users must add the datapack to each world themselves.

## 6. Restart and verify

Restart Minecraft after changing the JSONC or startup settings. Confirm the entry appears in the appropriate creative
tab, has the expected name and appearance, drops correctly when mined, and can be compressed and decompressed at every
configured level. Confirm the resource pack is enabled and the datapack is loaded for the world. Check the game log for
JSON parse errors or missing resources.
