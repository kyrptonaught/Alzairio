package com.kyrptonaught.Alzairio.common.Tabs;


import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Tabalzairio extends CreativeTabs
{
 	public Tabalzairio(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
   
    @Override
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
            return com.kyrptonaught.Alzairio.common.Init.Blocks.alzadirt.blockID;
                   }

   
    @Override
	public String getTranslatedTabLabel()
    {
     return "Alzairio Blocks";
    }
}