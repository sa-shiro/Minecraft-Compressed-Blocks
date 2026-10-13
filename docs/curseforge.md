<h1>CB: Compressed Blocks</h1>
<p>
  <a
    href="https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks"
    rel="nofollow"
    ><img
      alt="CurseForge"
      src="https://img.shields.io/curseforge/dt/361354?style=for-the-badge&amp;logo=curseforge&amp;label=CurseForge&amp;labelColor=212121&amp;color=FF6D00"
  /></a>
  <a href="https://modrinth.com/mod/cb-compressed-blocks" rel="nofollow"
    ><img
      alt="Modrinth"
      src="https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&amp;logo=modrinth&amp;label=Modrinth&amp;labelColor=212121&amp;color=008000"
  /></a>
  <a href="https://discord.gg/EKyjXRH9xN" rel="nofollow"
    ><img
      alt="Discord"
      src="https://img.shields.io/badge/join-Discord?style=for-the-badge&amp;logo=discord&amp;label=Discord&amp;labelColor=212121&amp;color=5865F2"
  /></a>
  <a
    href="https://www.paypal.com/donate/?cmd=_donations&amp;business=social.sashiro@outlook.com&amp;lc=US&amp;item_name=Donation&amp;no_note=0&amp;cn=&amp;currency_code=USD&amp;bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted"
    rel="nofollow"
    ><img
      alt="Donate"
      src="https://img.shields.io/badge/Donate-PayPal?style=for-the-badge&amp;logo=paypal&amp;label=PayPal&amp;labelColor=212121&amp;color=00457C"
  /></a>
</p>
<p>
  <strong>CB: Compressed Blocks</strong> adds multi-level compression for blocks
  and items, letting you store large quantities in a fraction of the space.
  Compressed blocks remain placeable, while compressed items can be stored in
  crates for compact inventory storage.
</p>
<h2>Features</h2>
<ul>
  <li>
    <strong>Block Compression</strong> --- Compress blocks into compact,
    placeable variants.
  </li>
  <li>
    <strong>Item Compression</strong> --- Store compressed items in crates to
    reduce inventory usage.
  </li>
  <li>
    <strong>Multiple Compression Levels</strong> --- Compress existing
    compressed variants to reach higher levels.
  </li>
  <li>
    <strong>Two Compression Recipes</strong> --- Standard 3&times;3 compression
    and 2&times;2 compression for blocks and items that already have a 3&times;3
    crafting recipe.
  </li>
  <li>
    <strong>Decompression</strong> --- Recover the original blocks and items by
    reversing the compression process.
  </li>
  <li>
    <strong>Extensible Compression System</strong> --- Add support for
    additional blocks and items through custom entry definitions and
    resource-pack assets.
  </li>
</ul>
<p>
  A single maximum-level compressed variant can represent up to
  <strong>3,486,784,401 original blocks or items</strong>.
</p>
<h2>Supported Minecraft Versions</h2>
<p>
  For the latest supported versions and compatibility details, see the
  <span style="color: rgb(53, 152, 219)"
    ><a
      href="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/README.md"
      rel="nofollow"
      style="color: rgb(53, 152, 219)"
      ><strong>GitHub README</strong></a
    ></span
  >. Support is version-specific. Backports and updates are request-based and
  are not automatically provided for every release. To request support for a
  particular Minecraft version,
  <span style="color: rgb(53, 152, 219)"
    ><a
      href="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/issues"
      rel="nofollow"
      style="color: rgb(53, 152, 219)"
      >open an issue on GitHub</a
    ></span
  >
  and specify the required Minecraft version and mod loader.
</p>
<h2>Configuration and Custom Entries</h2>
<p>
  CB's compression system can be extended beyond its built-in catalogs. Users
  and modpack developers can add custom blocks and items or override existing
  entries by using the same ID.
</p>
<ul>
  <li><strong>New ID:</strong> Adds a new compression entry.</li>
  <li>
    <strong>Existing ID:</strong> Replaces the corresponding built-in
    definition.
  </li>
</ul>
<p>
  Custom entries require the appropriate entry definitions and resource-pack
  assets. This allows blocks and items from other mods to be supported without
  requiring dedicated integration into CB.
</p>
<h3>Loader-Specific Configuration</h3>
<p>Configuration behavior depends on the mod loader.</p>
<p><strong>Forge (3.1.0 or later)</strong></p>
<p>
  Forge uses the JSONC catalogs directly to define compression entries and their
  settings. It does not use a separate loader configuration file for these
  settings.
</p>
<p>The catalogs are located in <code>config/compressedblocks/</code>:</p>
<ul>
  <li><code>blocks.jsonc</code> --- Default block compression entries.</li>
  <li><code>crates.jsonc</code> --- Default item crate entries.</li>
  <li><code>custom_blocks.jsonc</code> --- Optional custom block entries.</li>
  <li><code>custom_crates.jsonc</code> --- Optional custom crate entries.</li>
</ul>
<p>
  The default catalogs are copied from the mod's bundled resources when the
  corresponding configuration files do not exist. Changes to these files control
  the entry definitions and settings used by the mod.
</p>
<p><strong>NeoForge and Fabric (3.1.0 or later)</strong></p>
<p>
  NeoForge and Fabric use loader configuration files for configurable
  compression settings.
</p>
<p>
  The JSONC catalogs provide the initial default values. Once saved loader
  configuration values exist, those values take precedence over the JSONC
  defaults.
</p>
<p>
  Changing a JSONC default does not automatically overwrite an existing value in
  the loader configuration.
</p>
<p>
  Custom entries are defined separately through the JSONC custom-entry files.
</p>
<p>
  For configuration options, custom-entry definitions, required resources, and
  examples, see the
  <span style="color: rgb(53, 152, 219)"
    ><a
      href="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki"
      rel="nofollow"
      style="color: rgb(53, 152, 219)"
      ><strong>CB Wiki</strong></a
    ></span
  >.
</p>
<h2>Installation</h2>
<ol>
  <li>
    <p>Download the release matching your Minecraft version and mod loader.</p>
  </li>
  <li>
    <p>
      Install the appropriate
      <strong>Fabric, Forge, or NeoForge</strong> loader.
    </p>
  </li>
  <li>
    <p>Install the required dependencies:</p>
  </li>
  <ul>
    <li><strong>Fabric:</strong></li>
    <ul>
      <li>
        <span style="color: rgb(230, 126, 35)"
          ><a
            href="https://www.curseforge.com/minecraft/mc-mods/fabric-api"
            rel="nofollow"
            style="color: rgb(230, 126, 35)"
            >Fabric API</a
          ></span
        >
        <span style="color: rgb(45, 194, 107)"
          >(<a
            href="https://modrinth.com/mod/fabric-api"
            rel="nofollow"
            style="color: rgb(45, 194, 107)"
            >Modrinth</a
          >)</span
        >
      </li>
      <li>
        <a
          href="https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port"
          rel="nofollow"
          ><span style="color: rgb(230, 126, 35)"
            >Forge Config API Port</span
          ></a
        >
        <span style="color: rgb(45, 194, 107)"
          >(<a
            href="https://modrinth.com/mod/forge-config-api-port"
            rel="nofollow"
            style="color: rgb(45, 194, 107)"
            >Modrinth</a
          >)</span
        >
      </li>
      <li>
        <span style="color: rgb(230, 126, 35)"
          ><a
            href="https://www.curseforge.com/minecraft/mc-mods/modmenu"
            rel="nofollow"
            style="color: rgb(230, 126, 35)"
            >Mod Menu</a
          ></span
        >
        <span style="color: rgb(45, 194, 107)"
          >(<a
            href="https://modrinth.com/mod/modmenu"
            rel="nofollow"
            style="color: rgb(45, 194, 107)"
            >Modrinth</a
          >)</span
        >
        --- Optional
      </li>
    </ul>
    <li><strong>NeoForge:</strong></li>
    <ul>
      <li>
        <a
          href="https://www.curseforge.com/minecraft/mc-mods/forge-config-api-port"
          rel="nofollow"
          ><span style="color: rgb(230, 126, 35)"
            >Forge Config API Port</span
          ></a
        >
        <span style="color: rgb(45, 194, 107)"
          >(<a
            href="https://modrinth.com/mod/forge-config-api-port"
            rel="nofollow"
            style="color: rgb(45, 194, 107)"
            >Modrinth</a
          >)</span
        >
      </li>
    </ul>
  </ul>
  <li>
    <p>
      Place the downloaded JAR and required dependencies in your Minecraft
      <code>mods</code> folder and launch the game.
    </p>
  </li>
</ol>
<p>
  Check the dependency information for your specific release, as requirements
  may vary by Minecraft version and mod loader.
</p>
<h2>Links</h2>
<ul>
  <li style="color: rgb(53, 152, 219)">
    <span style="color: rgb(53, 152, 219)"
      ><a
        href="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/wiki"
        rel="nofollow"
        style="color: rgb(53, 152, 219)"
        ><strong>Wiki and Documentation</strong></a
      ></span
    >
  </li>
  <li style="color: rgb(53, 152, 219)">
    <span style="color: rgb(53, 152, 219)"
      ><a
        href="https://github.com/sa-shiro/Minecraft-Compressed-Blocks"
        rel="nofollow"
        style="color: rgb(53, 152, 219)"
        ><strong>Source Code and Issue Tracker</strong></a
      ></span
    >
  </li>
  <li style="color: rgb(53, 152, 219)">
    <a href="https://discord.gg/EKyjXRH9xN" rel="nofollow"
      ><strong
        ><span style="color: rgb(53, 152, 219)">Discord Community</span></strong
      ></a
    >
  </li>
</ul>
