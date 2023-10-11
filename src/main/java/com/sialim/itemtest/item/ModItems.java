package com.sialim.itemtest.item;

import com.sialim.itemtest.ItemTest;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ItemTest.MOD_ID);
    public static final RegistryObject<Item> LEPIDODENDRON_SCALE = ITEMS.register("lepidodendron_scale",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));

    public static final RegistryObject<Item> SIGILLARIA_SCALE = ITEMS.register("sigillaria_scale",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEM_TAB)));
    public static void register(IEventBus e)
    {
        ITEMS.register(e);
    }
}
