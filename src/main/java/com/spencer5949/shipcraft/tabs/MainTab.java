package com.spencer5949.shipcraft.tabs;

import com.spencer5949.shipcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MainTab extends CreativeTabs
{
    public MainTab(String label) { super("maintab"); }
    public ItemStack getTabIconItem() {return new ItemStack(ModItems.STEEL);}
}

