# CB: Compressed Blocks

[![CurseForge](https://img.shields.io/curseforge/dt/361354?style=for-the-badge&logo=curseforge&label=CurseForge&labelColor=212121&color=FF6D00)](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
[![Modrinth](https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&logo=modrinth&label=Modrinth&labelColor=212121&color=008000)](https://modrinth.com/mod/cb-compressed-blocks)
[![Discord](https://img.shields.io/badge/join-Discord?style=for-the-badge&logo=discord&label=Discord&labelColor=212121&color=5865F2)](https://discord.gg/EKyjXRH9xN)
[![Donate](https://img.shields.io/badge/Donate-PayPal?style=for-the-badge&logo=paypal&label=PayPal&labelColor=212121&color=00457C)](https://www.paypal.com/donate/?cmd=_donations&business=social.sashiro@outlook.com&lc=US&item_name=Donation&no_note=0&cn=&currency_code=USD&bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted)

**CB: Compressed Blocks** adds multi-level compression for blocks and items, letting you store large quantities in a
fraction of the space. Compressed blocks remain placeable, while compressed items can be stored in crates for compact
inventory storage.

## Features

- **Block Compression** --- Compress blocks into compact, placeable variants.
- **Item Compression** --- Store compressed items in crates to reduce inventory usage.
- **Multiple Compression Levels** --- Compress existing compressed variants to reach higher levels.
- **Two Compression Recipes** --- Standard 3×3 compression and 2×2 compression for blocks and items that already have a
  3×3 crafting recipe.
- **Decompression** --- Recover the original blocks and items by reversing the compression process.
- **Extensible Compression System** --- Add support for additional blocks and items through custom entry definitions and
  resource-pack assets.

A single maximum-level compressed variant can represent up to **3,486,784,401 original blocks or items**.

## Supported Minecraft Versions

For the latest supported versions and compatibility details, see
the [GitHub README](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/README.md).

Support is version-specific. Backports and updates are request-based and are not automatically provided for every
release. To request support for a particular Minecraft
version, [open an issue on GitHub](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/issues) and specify the
required Minecraft version and mod loader.

## Configuration and Custom Entries

CB's compression system can be extended beyond its built-in catalogs. Users and modpack developers can add custom blocks
and items or override existing entries by using the same ID.

- **New ID:** Adds a new compression entry.
- **Existing ID:** Replaces the corresponding built-in definition.

Custom entries require the appropriate entry definitions and resource-pack assets. This allows blocks and items from
other mods to be supported without requiring dedicated integration into CB.

### Loader-Specific Configuration

Configuration behavior depends on the mod loader.

**Forge (3.1.0 or later)**

Forge uses the JSONC catalogs directly to define compression entries and their settings. It does not use a separate
loader configuration file for these settings.

The catalogs are located in `config/compressedblocks/`:

- `blocks.jsonc` --- Default block compression entries.
- `crates.jsonc` --- Default item crate entries.
- `custom_blocks.jsonc` --- Optional custom block entries.
- `custom_crates.jsonc` --- Optional custom crate entries.

The default catalogs are copied from the mod's bundled resources when the corresponding configuration files do not
exist. Changes to these files control the entry definitions and settings used by the mod.

**NeoForge and Fabric (3.1.0 or later)**

NeoForge and Fabric use loader configuration files for configurable compression settings.

The JSONC catalogs provide the initial default values. Once saved loader configuration values exist, those values take
precedence over the JSONC defaults.

Changing a JSONC default does not automatically overwrite an existing value in the loader configuration.

Custom entries are defined separately through the JSONC custom-entry files.

For configuration options, custom-entry definitions, required resources, and examples, see the [**CB
Wiki**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki).

## Installation

1. Download the release matching your Minecraft version and mod loader.
2. Install the appropriate **Fabric, Forge, or NeoForge** loader.
3. Install the required dependencies:

    - **Fabric:**
        - [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
          ([Modrinth](https://modrinth.com/mod/fabric-api))
        - [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port)
          ([Modrinth](https://modrinth.com/mod/forge-config-api-port))
        - [Mod Menu](https://www.curseforge.com/minecraft/mc-mods/modmenu)
          ([Modrinth](https://modrinth.com/mod/modmenu)) --- Optional

    - **NeoForge:**
        - [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port)
          ([Modrinth](https://modrinth.com/mod/forge-config-api-port))

    - **Forge:**
        - Check the dependency information for your specific release.

4. Place the downloaded JAR and required dependencies in your Minecraft `mods` folder and launch the game.

Check the dependency information for your specific release, as requirements may vary by Minecraft version and mod
loader.

## Links

- [**Wiki and Documentation**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)
- [**Source Code and Issue Tracker**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks)
- [**Discord Community**](https://discord.gg/EKyjXRH9xN)