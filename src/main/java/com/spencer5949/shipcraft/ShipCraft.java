package com.spencer5949.shipcraft;

import com.spencer5949.shipcraft.proxy.CommonProxy;
import com.spencer5949.shipcraft.tabs.MainTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ShipCraft.MOD_ID, name = ShipCraft.NAME, version = ShipCraft.VERSION)
public class ShipCraft
{

    public static final CreativeTabs maintab = new MainTab("maintab");

    private static Logger logger;

    public static final String MOD_ID = "shipcraft";
    public static final String NAME = "Ship Craft";
    public static final String VERSION = "1.0.0";
    public static final String ACCEPTED_VERSIONS = "1.12.2";
    public static final String CLIENT_PROXY_CLASS = "com.spencer5949.shipcraft.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.spencer5949.shipcraft.proxy.CommonProxy";

    @SidedProxy(clientSide = ShipCraft.CLIENT_PROXY_CLASS, serverSide = ShipCraft.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
    
}
