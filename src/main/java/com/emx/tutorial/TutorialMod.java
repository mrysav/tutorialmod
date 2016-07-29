package com.emx.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, name = TutorialMod.NAME, version = TutorialMod.VERSION)
 
public class TutorialMod
{
    public static final String NAME = "Tutorial Mod";
    public static final String MODID = "tutorial";
    public static final String VERSION = "1.7.10-R1";
 
    @Mod.Instance("tutorial")
    public static TutorialMod instance;
 
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
 
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {}
 
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}