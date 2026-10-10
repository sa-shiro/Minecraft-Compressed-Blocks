# CB: Compressed Blocks

[![CurseForge](https://img.shields.io/curseforge/dt/361354?style=for-the-badge&logo=curseforge&label=Curseforge&labelColor=212121&color=FF6D00)](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
[![Modrinth](https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&logo=modrinth&label=Modrinth&labelColor=212121&color=008000)](https://modrinth.com/mod/cb-compressed-blocks)
[![Discord](https://img.shields.io/badge/join-discord?style=for-the-badge&logo=discord&label=discord&labelColor=212121&color=0d0f24)](https://discord.gg/EKyjXRH9xN)
[![Paypal](https://img.shields.io/badge/Donate-Paypal?style=for-the-badge&logo=paypal&label=Paypal&labelColor=212121&color=00457C)](https://www.paypal.com/donate/?cmd=_donations&business=social.sashiro@outlook.com&lc=US&item_name=Donation&no_note=0&cn=&currency_code=USD&bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted)
[![WakaTime](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620.svg)](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620)

## Supported Minecraft Versions

| Minecraft Version  | Status               |
|:-------------------|:---------------------|
| **Latest release** | **Supported**        |
| 1.21.2 – 1.21.11   | Archived since 2.0.0 |
| **1.21.1**         | **Supported**        |
| 1.20.3 – 1.20.6    | EOL · Archived       |
| **1.20.2**         | **Supported**        |
| 1.14.1 – 1.19.4    | EOL · Archived       |

> [!IMPORTANT]
> ### Backports and Version Requests
>
> Backports and updates for specific Minecraft versions are **request-based** and are not automatically provided for every release.
>
> If you need CB for a specific Minecraft version, [open an issue](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/issues) and specify the required Minecraft version and mod loader.
>
> Versions without active maintenance may be marked as archived.

## Overview

**CB: Compressed Blocks** adds multi-level compression for blocks and items, reducing the space they occupy in the world and inventory.

- **Compressed blocks:** Place compressed variants directly in the world.
- **Item crates:** Store compressed items more compactly.
- **Multiple compression levels:** Compress variants repeatedly to reach higher levels.
- **Two recipe types:** Use 3×3 compression recipes or 2×2 recipes for entries that already have a 3×3 crafting recipe.
- **Decompression:** Recover the original blocks and items by reversing the compression process.
- **Extensible compression:** Add custom entries for blocks and items, including content from other mods.

A single maximum-level variant can represent up to **3,486,784,401 original blocks or items**.

## Features

- Multi-level block and item compression.
- Placeable compressed blocks and compact item crates.
- 3×3 and 2×2 compression recipes.
- Decompression through successive levels.
- Custom compression entries and resource-pack support.

## Image Showcase

<details>
<summary>View screenshots</summary>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img1.png?raw=true" width="400" alt="Compressed Blocks screenshot 1">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img2.png?raw=true" width="400" alt="Compressed Blocks screenshot 2">

<br>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img3.png?raw=true" width="400" alt="Compressed Blocks screenshot 3">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img4.png?raw=true" width="400" alt="Compressed Blocks screenshot 4">

<br>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img5.png?raw=true" width="400" alt="Compressed Blocks screenshot 5">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img6.png?raw=true" width="400" alt="Compressed Blocks screenshot 6">

<br>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img7.png?raw=true" width="400" alt="Compressed Blocks screenshot 7">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img8.png?raw=true" width="400" alt="Compressed Blocks screenshot 8">

</details>

## Installation

1. Download CB from [CurseForge](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks) or [Modrinth](https://modrinth.com/mod/cb-compressed-blocks).
2. Install the appropriate **Fabric, Forge, or NeoForge** loader for your Minecraft version and install the required dependencies:
    - **Fabric:** [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) ([Modrinth](https://modrinth.com/mod/fabric-api)) and [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port) ([Modrinth](https://modrinth.com/mod/forge-config-api-port)).
    - **NeoForge:** [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port) ([Modrinth](https://modrinth.com/mod/forge-config-api-port)).
3. Place the downloaded `.jar` file and required dependencies into your `mods` folder.
4. Launch Minecraft.

Make sure the CB version matches both your **Minecraft version** and **mod loader**.

## Usage

### Compressing Blocks and Items

CB provides two compression recipes depending on the item or block being compressed.

#### Normal Compression

Normal compression uses a **3×3 crafting recipe**, combining nine identical blocks or items into one compressed variant.

1. Place **9 of the same block or item** into the crafting grid.
2. Craft the resulting compressed variant.

The resulting variant can be compressed again to reach the next compression level.

#### Small Compression

For blocks and items that already have a **3×3 vanilla crafting recipe**, CB provides a smaller **2×2 compression recipe**.

1. Place **4 of the same block or item** into the crafting grid.
2. Craft the resulting compressed variant.

This provides a more compact compression recipe while keeping the existing vanilla crafting recipe available.

### Decompressing

Compressed variants can be decompressed one level at a time.

1. Place the compressed block or item crate into the player's crafting inventory or a crafting table.
2. Retrieve the decompressed variant.
3. Repeat until the original blocks or items are recovered.

## Extensible Compression

CB's compression system is not limited to the built-in catalog. **Users and modpack developers can add custom blocks and items** by providing the required entry definitions and resources.

Custom entries can introduce new IDs or override existing entries:

- **New ID:** Adds a new compression entry.
- **Existing ID:** Replaces the corresponding built-in entry.

Custom entries can use resources supplied through a resource pack, allowing CB to support blocks and items from other mods without requiring explicit integration into CB.

See the **[Wiki](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)** for configuration details, required resources, examples, and setup instructions.

> [!IMPORTANT]
> ### Forge Limitations
>
> Due to Forge's registration lifecycle, compression entries cannot be controlled through configuration on Forge. Blocks and items are therefore **always registered** on Forge.
>
> **Custom compression entries are not supported on Forge**, as they require dynamic registry registration, which Forge does not support.
>
> These limitations apply only to Forge. Fabric and NeoForge support configurable compression entries and custom entries.

## Built-in Blocks and Crates

Browse the built-in compression entries in the [Blocks](./common/src/main/resources/data/compressedblocks/entries/blocks.jsonc) and [Crates](./common/src/main/resources/data/compressedblocks/entries/crates.jsonc) catalogs.

For custom entries and configuration instructions, see the **[Wiki](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)**.

## Contributing

Contributions are welcome. Fork the repository, make your changes, and submit a pull request.

For larger changes, new features, or additional Minecraft version support, consider opening an issue first to discuss the proposed changes.

## Support

For bug reports, feature requests, and version requests, [open an issue on GitHub](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/issues).

For questions, general discussion, or community support, join our [Discord server](https://discord.gg/EKyjXRH9xN).

When requesting a backport or update, specify the exact **Minecraft version**.

## License

This mod is licensed under the **MIT License**. See the [LICENSE](LICENSE.md) file for the full license text.