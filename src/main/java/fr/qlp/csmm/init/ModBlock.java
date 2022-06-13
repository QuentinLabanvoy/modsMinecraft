package fr.qlp.csmm.init;

import fr.qlp.csmm.CSMM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CSMM.MODID);
public static final RegistryObject<Block> COPPER_BLOCK = createBlock("copper_block",()-> new Block(AbstractBlock.Properties.of(Material.STONE)
        .harvestLevel(2)
        .harvestTool(ToolType.PICKAXE)
        .strength(2f)
        .sound(SoundType.BAMBOO)
        .requiresCorrectToolForDrops()

));
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier){
        RegistryObject<Block> block = BLOCKS.register(name,supplier);
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return  block;
    }
}
