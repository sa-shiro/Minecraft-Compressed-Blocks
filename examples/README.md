# CB: Compressed Blocks Wiki

This directory contains player, server, and modpack-author documentation for CB.

> [!CAUTION]
> **Forge** does not support configuration or custom entries.

## Guides

- [Adding custom entries](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki/Custom-Entries) - configure
  custom block and crate definitions.
- [Custom resource-pack assets](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki/Resource-Pack-Assets) -
  provide models, blockstates, textures, and recipe data.

## Example packs

> [!WARNING]
> **Custom entries require both a resource pack and a datapack.** The resource pack can be distributed and enabled with
the modpack, but the datapack must be loaded by **every world** using the custom entries.
>
> For modpacks, the datapack should be supplied automatically to newly created worlds using a **third-party mod that
provides datapacks globally or automatically**. Otherwise, users must manually install the datapack into every world
they create.
>
> The examples below demonstrate the expected layout:

- [Example resource pack](example_resourcepack) - blockstates, models, and language names.
- [Example datapack](example_datapack) - recipes, loot tables, and tags (advancements are optional).

Custom entry definitions are read at game startup from:

- `config/compressedblocks/custom_blocks.jsonc`
- `config/compressedblocks/custom_crates.jsonc`

Both files support single-line comments beginning with `//`, which can help label or organize entries. For example:

```jsonc
[
  // Blocks from Biomes O' Plenty
  { "id": "bop_white_sand", "kind": "BLOCK" ... }
]
```

Changes to these files require a restart. On multiplayer servers, install matching definitions and configuration on the
server and every client.