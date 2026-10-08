<div align="center">

# CB: Compressed Blocks

[![CurseForge][CurseForge]](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
[![Modrinth][Modrinth]](https://modrinth.com/mod/cb-compressed-blocks)
[![Discord][Discord]](https://discord.gg/EKyjXRH9xN)
[![Paypal][Paypal]](https://www.paypal.com/donate/?cmd=_donations&business=social.sashiro@outlook.com&lc=US&item_name=Donation&no_note=0&cn=&currency_code=USD&bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted)

[![wakatime](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620.svg)](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620)

[CurseForge]: https://img.shields.io/curseforge/dt/361354?style=for-the-badge&logo=curseforge&label=Curseforge&labelColor=212121&color=FF6D00
[Modrinth]: https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&logo=modrinth&label=Modrinth&labelColor=212121&color=008000
[Paypal]: https://img.shields.io/badge/Donate-Paypal?style=for-the-badge&logo=paypal&label=Paypal&labelColor=212121&color=00457C
[Discord]: https://img.shields.io/badge/join-discord?style=for-the-badge&logo=discord&label=discord&labelColor=212121&color=0d0f24

</div>

## Supported Minecraft Versions

| Minecraft Version  | Status               |
|--------------------|----------------------|
| **Latest release** | **Supported**        |
| 1.21.2 – 1.21.11   | Archived since 2.0.0 |
| **1.21.1**         | **Supported**        |
| 1.20.3 – 1.20.6    | EOL · Archived       |
| **1.20.2**         | **Supported**        |
| 1.14.1 – 1.19.4    | EOL · Archived       |

> [!IMPORTANT]
> ### Backports and Version Requests
>
> Backports and updates for specific Minecraft versions are **request-based** and are not automatically provided for
every release.
>
> If you need CB for a specific Minecraft version, please open an issue requesting the version and specify the required
mod loader.
>
> Versions without active maintenance may be marked as **archived**.

## Overview

**CB: Compressed Blocks** allows players to compress blocks and items into compact variants, significantly reducing the
amount of space they occupy in the world or inventory.

Compression is available in multiple levels, allowing compressed variants to be compressed again. Depending on the
recipe type, each level uses either **3×3 or 2×2 crafting recipes**.

With multiple levels of compression, a single maximum-level compressed variant can represent up to **3,486,784,401
blocks or items**.

Compressed blocks can be placed in the world, while items can be compressed into crates for compact inventory storage.
Compressed variants can be decompressed through their respective levels to recover the original blocks or items.

### Extensible Compression

CB's compression system is not limited to the built-in catalog. **Modpack developers and users can add custom blocks and
items** by providing the required entry definitions and resources.

Custom entries can also **override existing entries** by using the same ID. New IDs are added as new entries, while an
existing ID replaces the corresponding built-in entry.

Custom entries can use resources supplied through a resource pack, allowing CB to support blocks and items from other
mods without requiring those mods to be explicitly integrated into CB.

See the **[Wiki](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)** for instructions, configuration details, required
resources, and examples.

> [!IMPORTANT]
> ### Forge Limitations
>
> Due to the **design and registry lifecycle of Forge**, compression entries cannot be controlled through configuration on
> the Forge loader. Blocks and items are therefore **always registered** on Forge.
>
> **Custom compression entries are also not supported on Forge**, as they require dynamic registry registration, which Forge
> does not support.
>
> These limitations apply **only to Forge**. Fabric and NeoForge support configurable compression entries and custom entries.

## Installation

1. Download the mod from [CurseForge](https://curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
   or [Modrinth](https://modrinth.com/mod/cb-compressed-blocks).
2. Install the appropriate **Fabric, Forge, or NeoForge** loader for your Minecraft version.
   - Fabric requires **Fabric API**
     ([CurseForge](https://www.curseforge.com/minecraft/mc-mods/fabric-api) | [Modrinth](https://modrinth.com/mod/fabric-api)).
   - Requires **Forge Config API Port**
     ([CurseForge](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port) | [Modrinth](https://modrinth.com/mod/forge-config-api-port)).
3. Place the downloaded mod `.jar` file into the `mods` folder.
4. Launch Minecraft.

> **Custom entries:** If you are using custom compression entries, the additional entry definitions and required
> resource-pack assets must be supplied separately. See the **[Wiki](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)** for setup
> instructions.

Make sure the mod version matches both your **Minecraft version** and **mod loader**.

## Features

- **Block Compression** - Compress blocks into compact variants to reduce their space requirements.
- **Item Compression** - Compress items into crates to reduce inventory usage.
- **Multiple Compression Levels** - Compressed variants can be compressed again through multiple levels.
- **Normal Compression** - Uses a **3×3 recipe**, combining 9 blocks or items into one compressed variant.
- **Small Compression** - Uses a **2×2 recipe** for blocks or items that already have a 3×3 crafting recipe.
- **Large-Scale Storage** - Store up to **3,486,784,401** original blocks or items in a single maximum-level variant.
- **Vanilla Crafting** - Compression and decompression use the standard crafting grid.
- **Decompression** - Recover the original blocks or items by decompressing through their respective levels.
- **Custom Entries** - Add custom blocks and items through user-provided entry definitions and resources.

## Built-in Blocks and Crates

See the [Blocks](./common/src/main/resources/data/compressedblocks/entries/blocks.jsonc)
and [Crates](./common/src/main/resources/data/compressedblocks/entries/crates.jsonc) catalogs for the built-in blocks
and crates included with CB.

Custom entries are not included in these catalogs. See the **[Wiki](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)** for
information on extending CB with additional entries.

<details>
<summary>Image Showcase</summary>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img1.png?raw=true" width="400" alt="Image 1">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img2.png?raw=true" width="400" alt="Image 2">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img3.png?raw=true" width="400" alt="Image 3">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img4.png?raw=true" width="400" alt="Image 4">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img5.png?raw=true" width="400" alt="Image 5">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img6.png?raw=true" width="400" alt="Image 6">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img7.png?raw=true" width="400" alt="Image 7">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img8.png?raw=true" width="400" alt="Image 8">

</details>

## Usage

### Compressing Blocks and Items

CB provides two compression recipes depending on the item or block being compressed.

#### Normal Compression

Normal compression uses a **3×3 crafting recipe**:

1. Place **9 of the same block or item** into the crafting grid.
2. Craft the resulting compressed variant.

The compressed variant can then be compressed again to reach the next compression level.

#### Small Compression

For blocks and items that already have a **3×3 vanilla crafting recipe**, CB provides a smaller **2×2 compression
recipe**:

1. Place **4 of the same block or item** into the crafting grid.
2. Craft the resulting compressed variant.

This allows those materials to be compressed without requiring a larger 3×3 recipe and keeps their existing vanilla
crafting recipes available.

### Decompressing

1. Place the compressed block or item crate into the player's crafting inventory or a crafting table.
2. The compressed variant will decompress by one level.
3. Repeat the process to continue decompression until the original blocks or items are recovered.

## Contributing

If you would like to contribute to the development of this mod, please fork the repository, make your changes, and
submit a pull request.

For larger changes, new features, or additional Minecraft version support, consider opening an issue first to discuss
the proposed changes.

## Support

For bug reports, feature requests, or version requests, please open an issue on GitHub.

For questions, general discussion, or community support, please join our Discord server.

When requesting a backport or update, please specify the exact **Minecraft version**.

## License

This mod is licensed under the **MIT License**. See the [LICENSE](LICENSE.md) file for the full license text.
