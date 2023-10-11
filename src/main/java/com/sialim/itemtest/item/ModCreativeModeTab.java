package com.sialim.itemtest.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab ITEM_TAB = new CreativeModeTab("itemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LEPIDODENDRON_SCALE.get());
        }
    };
}
