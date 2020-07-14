package com.spencer5949.shipcraft.items;

import com.spencer5949.shipcraft.ShipCraft;
import com.spencer5949.shipcraft.init.ModItems;
import com.spencer5949.shipcraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ShipCraft.maintab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        ShipCraft.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
