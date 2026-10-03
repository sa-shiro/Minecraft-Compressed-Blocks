<div align="center">
   
# CB: Compressed Blocks

[![CurseForge][CurseForge]](https://www.curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
[![Modrinth][Modrinth]](https://modrinth.com/mod/cb-compressed-blocks)
[![Paypal][Paypal]](https://www.paypal.com/donate/?cmd=_donations&business=social.sashiro@outlook.com&lc=US&item_name=Donation&no_note=0&cn=&currency_code=USD&bn=PP-DonationsBF:btn_donateCC_LG.gif:NonHosted)

[![wakatime](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620.svg)](https://wakatime.com/badge/user/ef3647e3-15ba-47dd-8255-89f406b638de/project/ed5d1480-b2a7-45e1-a3fe-888be6965620)  

[CurseForge]: https://img.shields.io/curseforge/dt/361354?style=for-the-badge&logo=curseforge&label=Curseforge&labelColor=212121&color=FF6D00
[Modrinth]: https://img.shields.io/modrinth/dt/IQRVlbit?style=for-the-badge&logo=modrinth&label=Modrinth&labelColor=212121&color=008000
[Paypal]: https://img.shields.io/badge/Donate-Paypal?style=for-the-badge&logo=paypal&label=Paypal&labelColor=212121&color=00457C

</div>

## Overview

This mod allows players to compress multiple blocks into a single block or multiple items into an item crate, saving
space in the world.  
The compressed variants can store up to 9 blocks/items of the same type, and with multiple levels of compression, a
single compressed variant can hold as many as **3,486,784,101** blocks or items.  
This allows players to store vast quantities of blocks/items in a single block.  
The compressed block can be decompressed to retrieve the original blocks, making it a versatile tool for building and
storage purposes.

- **Mod Loader:** _Fabric_, _Forge_, _NeoForge_
- **Author:** [Sashiro](https://github.com/sa-shiro)

---

## Installation

1. Download the mod from [CurseForge](https://curseforge.com/minecraft/mc-mods/cb-compressed-blocks)
   or [Modrinth](https://modrinth.com/mod/cb-compressed-blocks).
2. Install Minecraft Forge or Fabric Loader + Fabric API.
3. Place the downloaded mod file into the mods' folder.
4. Launch Minecraft and enjoy!

## Features

- **Block Compression:** Compress multiple blocks into one, saving space in your world.
- **Item Compression:** Compress multiple items into one Crate, saving space in your inventory.
- **Expanded Storage:** Store vast quantities of blocks and items in a single compressed block or crate.
- **Versatile Usage:** Utilize compressed blocks for various building and storage purposes.
- **Easy Crafting:** Craft compressed blocks or crates using a 3x3 crafting grid.
- **Decompression:** Decompress compressed blocks and crates back into their original form.

<details>
  <summary>Image Showcase</summary>

<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img1.png?raw=true" width="400" alt="Image 1">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img5.png?raw=true" width="400" alt="Image 2">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img3.png?raw=true" width="400" alt="Image 3">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img4.png?raw=true" width="400" alt="Image 4">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img5.png?raw=true" width="400" alt="Image 5">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img6.png?raw=true" width="400" alt="Image 6">
<br>
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img7.png?raw=true" width="400" alt="Image 5">
<img src="https://github.com/sa-shiro/Minecraft-Compressed-Blocks/blob/master/.github/images/img8png?raw=true" width="400" alt="Image 6">
</details>

### List of Blocks and Crates

See the [CompressionCatalog](./common/src/main/java/net/sashiro/compressedblocks/compression/CompressionCatalog.java) for a complete list of available compressed blocks and crates.

## Usage

Crafting compressed blocks:

1. Open the vanilla crafting table.
2. Place 9 of the desired blocks in a 3x3 crafting grid to create a compressed block.
3. Craft the compressed block.

To decompress a block:

1. Place the compressed block either in the player's crafting inventory or a crafting table.
2. The compressed block will decompress back into its original nine blocks.

## Contributing

If you would like to contribute to the development of this mod, please fork the repository, make your changes, and
submit a pull request.

## Support

For any questions, issues, or suggestions, feel free to join our Discord server.

## License

This mod is licensed under the MIT license. See the [LICENSE](LICENSE.md) file for more details.
