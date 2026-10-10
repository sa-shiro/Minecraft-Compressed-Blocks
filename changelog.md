# CB: Compressed Blocks

## v3.0.0 - Minecraft 1.20.2

### Backport of 3.0.0@1.21.1 to 1.20.2, 1.20.4

### Added

- Added configuration screen support for Fabric.
- Added JSONC-based custom entries for blocks and crates, with support for assets supplied by resource packs.
- Added generated advancements for compressed blocks and crates.
- Added the ability to add custom entries. See the **[Custom Entries guide](<https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki>)** for instructions, required resources, and examples.

### Improved

- Reworked block, crate, registration, and platform integration code.
- Consolidated data generation for recipes, models, tags, loot tables, and translations around the compression catalog.

### Removed

- Removed config from Forge entirely, because forge does not allow us to dynamically register blocks and the registry will be frozen before any config was loaded.

---

## Downloads and Dependencies

- [**CB: Compressed Blocks**](<https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks>)ㅤ([Modrinth](<https://modrinth.com/mod/cb-compressed-blocks>))
- [**Fabric API**](<https://www.curseforge.com/minecraft/mc-mods/fabric-api>)ㅤ([Modrinth](<https://modrinth.com/mod/fabric-api>))
- [**Forge Config API Port**](<https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port>)ㅤ([Modrinth](<https://modrinth.com/mod/forge-config-api-port>))
- [**Mod Menu**](<https://www.curseforge.com/minecraft/mc-mods/modmenu>)ㅤ([Modrinth](<https://modrinth.com/mod/modmenu>))
