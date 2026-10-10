# CB: Compressed Blocks

[![CurseForge](https://img.shields.io/curseforge/dt/361354?style=for-the-badge&logo=curseforge&label=CurseForge&labelColor=212121&color=FF6D00)](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
[![Modrinth](https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&logo=modrinth&label=Modrinth&labelColor=212121&color=008000)](https://modrinth.com/mod/cb-compressed-blocks)
[![Discord](https://img.shields.io/badge/join-Discord?style=for-the-badge&logo=discord&label=Discord&labelColor=212121&color=5865F2)](https://discord.gg/EKyjXRH9xN)
[![Donate](https://img.shields.io/badge/Donate-PayPal?style=for-the-badge&logo=paypal&label=PayPal&labelColor=212121&color=00457C)](https://www.paypal.com/donate/?cmd=_donations&business=social.sashiro@outlook.com&lc=US&item_name=Donation&no_note=0&cn=&currency_code=USD&bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted)

**CB: Compressed Blocks** adds multi-level compression for blocks and items, letting you store large quantities in a fraction of the space. Compressed blocks remain placeable, while compressed items can be stored in crates for compact inventory storage.

## Features

- **Block Compression** --- Compress blocks into compact, placeable variants.
- **Item Compression** --- Store compressed items in crates to reduce inventory usage.
- **Multiple Compression Levels** --- Compress existing compressed variants to reach higher levels.
- **Two Compression Recipes** --- Standard 3×3 compression and 2×2 compression for blocks and items that already have a 3×3 crafting recipe.
- **Decompression** --- Recover the original blocks and items by reversing the compression process.
- **Extensible Compression System** --- Add support for additional blocks and items through custom entry definitions and resource-pack assets.

A single maximum-level compressed variant can represent up to **3,486,784,401 original blocks or items**.

## Supported Minecraft Versions

| Minecraft Version    | Status                 |
|----------------------|------------------------|
| **Latest release**   | Supported              |
| 1.21.2 - 1.21.11     | Archived since 2.0.0   |
| **1.21.1**           | Supported              |
| 1.20.3 - 1.20.6      | End of life · Archived |
| **1.20.1 / .2 / .4** | Supported              |
| 1.14.1 - 1.19.4      | End of life · Archived |

Support is version-specific. Backports and updates are request-based and are not automatically provided for every release. To request support for a particular Minecraft version, open an issue on GitHub and specify the required mod loader.

## Configuration and Custom Entries

CB's compression system can be extended beyond its built-in catalog. Users and modpack developers can add custom blocks and items, or override existing entries by using the same ID. New IDs create additional entries, while matching IDs replace the corresponding built-in definitions.

Custom entries require the appropriate entry definitions and resource-pack assets. Blocks and items from other mods can be supported without requiring a dedicated integration in CB.

**Forge limitation:** Configuration-based control of registered blocks and items, as well as custom compression entries, is not supported on Forge. This is a consequence of Forge's registration lifecycle: registration occurs before configuration is available, and the registry lifecycle does not support the dynamic registration required by CB's custom-entry system. Consequently, CB's blocks and items are always registered on Forge, and custom entries are unavailable.

These limitations apply to **Forge only**. Fabric and NeoForge support configurable compression entries and custom entries.

For configuration options, custom-entry definitions, required resources, and examples, see the [**CB Wiki**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki).

## Installation

1. Download the release matching your Minecraft version and mod loader.
2. Install the appropriate **Fabric, Forge, or NeoForge** loader.
3. Install the required dependencies:

    - **Fabric**
        - [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) ([Modrinth](https://modrinth.com/mod/fabric-api))
        - [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port) ([Modrinth](https://modrinth.com/mod/forge-config-api-port))
        - [Mod Menu](https://www.curseforge.com/minecraft/mc-mods/modmenu) ([Modrinth](https://modrinth.com/mod/modmenu)) --- optional

    - **NeoForge**
        - [Forge Config API Port](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port) ([Modrinth](https://modrinth.com/mod/forge-config-api-port))

4. Place the downloaded JAR in your Minecraft `mods` folder and launch the game.

Check the dependency information for your specific release, as requirements may vary by Minecraft version.

Always check the dependency information for the specific release you download.

## Links

- [**Wiki and documentation**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)
- [**Source code and issue tracker**](https://github.com/sa-shiro/Minecraft-Compressed-Blocks)
- [**Discord community**](https://discord.gg/EKyjXRH9xN)