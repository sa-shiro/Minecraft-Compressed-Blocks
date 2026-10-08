# CB: Compressed Blocks

## v3.0.0 - Minecraft 1.21.1

This release is a major rewrite of CB, with a shared compression catalog and updated integrations for Fabric, Forge, and
NeoForge.

### Added

- Added configuration screen support for Fabric and NeoForge.
- Added JSONC-based custom entries for blocks and crates, with support for assets supplied by resource packs.
- Added generated advancements for compressed blocks and crates.
- Added the ability to add custom entries. See the **[Custom Entries guide](<https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki>)** for instructions, required resources, and examples.

### Improved

- Reworked block, crate, registration, and platform integration code.
- Consolidated data generation for recipes, models, tags, loot tables, and translations around the compression catalog.

### Removed

- Removed config from Forge entirely, because forge does not allow us to dynamically register blocks and the registry will be frozen before any config was loaded.

---

## v2.0.0 - Backport for Minecraft 1.21.1

- Backported v2.0.0 to Minecraft 1.21.1.

---

## Downloads and Dependencies

- **CB: Compressed Blocks:** [CurseForge](<https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks>) | [Modrinth](<https://modrinth.com/mod/cb-compressed-blocks>)
- **Forge Config API Port:** [CurseForge](<https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port>) | [Modrinth](<https://modrinth.com/mod/forge-config-api-port>)
- **Fabric API:** [CurseForge](<https://www.curseforge.com/minecraft/mc-mods/fabric-api>) | [Modrinth](<https://modrinth.com/mod/fabric-api>)
- **Mod Menu:** [CurseForge](<https://www.curseforge.com/minecraft/mc-mods/modmenu>) | [Modrinth](<https://modrinth.com/mod/modmenu>)
