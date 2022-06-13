package fr.qlp.csmm.init;

import fr.qlp.csmm.CSMM;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.MODID);

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register( "copper_ingot", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register( "copper_stick", () -> new Item(new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register( "copper_sword", () -> new SwordItem());
}
