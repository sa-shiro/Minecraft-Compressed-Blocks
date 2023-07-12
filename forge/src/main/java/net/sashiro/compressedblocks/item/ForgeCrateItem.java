package net.sashiro.compressedblocks.item;

import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.sashiro.compressedblocks.block.ForgeCompression;
import net.sashiro.compressedblocks.util.StringUtils;

import javax.annotation.Nullable;
import java.util.List;

@SuppressWarnings({"DuplicatedCode", "NullableProblems"})
public class ForgeCrateItem extends BlockItem {
    
    private final Block block;
    private final String itemCount;
    private final ForgeCompression comp = new ForgeCompression();
    
    public ForgeCrateItem(Block block, Properties properties) {
        super(block, properties);
        this.block = block;
        comp.setCompressionLevel(getLevel());
        this.itemCount = comp.getBlockCount();
    }
    
    private int getLevel() {
        String name = block.getTranslationKey().replace("block.compressedblocks.", "").replace("item.compressedblocks.", "");
        if (name.startsWith("crated_")) return 0;
        if (name.startsWith("double_")) return 1;
        if (name.startsWith("triple_")) return 2;
        if (name.startsWith("quadruple_")) return 3;
        if (name.startsWith("quintuple_")) return 4;
        if (name.startsWith("sextuple_")) return 5;
        if (name.startsWith("septuple_")) return 6;
        if (name.startsWith("octuple_")) return 7;
        if (name.startsWith("mega_")) return 8;
        if (name.startsWith("giga_")) return 9;
        else return 0;
    }
    
    
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        String itemName = StringUtils.stringFormat(this.getTranslationKey()
                .replace("block.compressedblocks.", "")
                .replace("item.compressedblocks.", "")
                .replace("crated_", "")
                .replace("double_", "")
                .replace("triple_", "")
                .replace("quadruple_", "")
                .replace("quintuple_", "")
                .replace("sextuple_", "")
                .replace("septuple_", "")
                .replace("octuple_", "")
                .replace("mega_", "")
                .replace("giga_", "")
        );
        tooltip.add(new StringTextComponent(itemCount + "x " + itemName).setStyle(comp.getStyle()));
    }
}