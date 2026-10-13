## v3.1.0 -- Minecraft 1.21.11

This release combines the port of the 3.0.0 rewrite from Minecraft 1.21.1 to 1.21.11 with the subsequent v3.1.0 changes, including Forge support and the transition from Java-based entry lists to JSONC-based catalogs.

### Porting and Platform Support
- Ported the 3.0.0 rewrite from Minecraft 1.21.1 to Minecraft 1.21.11.
- Added support for Forge.
- Improved cross-loader integration and configuration handling.

### Added
- Added a configuration screen for Fabric & NeoForge.
- Added automatically generated advancements for all compressed blocks and crates.
- Introduced JSONC-based catalogs for blocks and crates, supporting custom entries and resource-pack-provided assets.
- Added support for defining custom compressed blocks and crates through catalog entries and resource-pack assets.

See the **[Custom Entries guide](https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki)** for instructions, required resources, and examples.

### Improved
- Refactored block, crate, registration, and platform integration code.
- Consolidated data generation for recipes, models, tags, loot tables, translations, and advancements around the compression catalogs.
- Unified configuration handling across supported platforms.

### Configuration
- **Forge:** Uses the JSONC catalogs to define block and crate settings; no separate loader configuration is provided.
- **NeoForge and Fabric:** Loader configuration values (toml config) take precedence over the defaults defined by the JSONC catalogs. Catalog values serve as defaults when corresponding configuration values have not been set.

### Removed
- Replaced manually maintained resources with generated resources, including advancements.

---

## Downloads

- [**CB: Compressed Blocks**](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
  ([Modrinth](https://modrinth.com/mod/cb-compressed-blocks))

**Dependencies and integrations**

- [**Fabric API**](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
  ([Modrinth](https://modrinth.com/mod/fabric-api))
- [**Forge Config API Port**](https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port)
  ([Modrinth](https://modrinth.com/mod/forge-config-api-port))
- [**Mod Menu**](https://www.curseforge.com/minecraft/mc-mods/modmenu) ([Modrinth](https://modrinth.com/mod/modmenu))