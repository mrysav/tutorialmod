package com.emx.tutorial.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item red_diamond;
 
    public static void init()
    {
        red_diamond = new Item().setUnlocalizedName("red_diamond")
        						.setCreativeTab(CreativeTabs.MATERIALS);
    }
}