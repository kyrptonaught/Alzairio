package Alzairio.common.Tabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Tabalzairio2 extends CreativeTabs {
	
	public Tabalzairio2(int par1, String par2Str)
    {
            super(par1, par2Str);
    }
    
   
    @Override
	@SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
            return Alzairio.common.Init.Items.AlzairianIngot.itemID;
                   }

   
    @Override
	public String getTranslatedTabLabel()
    {
     return "Alzairio Items";
    }
}