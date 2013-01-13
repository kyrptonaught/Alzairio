package Alzairio.common.Items;

import java.io.File;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Itemchecker extends Item {
	public static File file;	
	public Itemchecker(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	}	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Checks the Crum Level. Does not Increase Crum");//the color code trick works here aswell 
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean onItemUse( ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
		 ClientProxyAlzairio.SaveCrumValue();
	ClientProxyAlzairio.printMessageToPlayer("Scanning area for Crum");
	 ClientProxyAlzairio.printMessageToPlayer("...");
		if (Alzairio.Crum > 50) {
		 ClientProxyAlzairio.printMessageToPlayer("Oh no the Amount of polution is getting high");		
	 }
		 ClientProxyAlzairio.printMessageToPlayer("Crum = " + Alzairio.Crum);
	    // ClientProxyAlzairio.ReadCrumValue();
	return true;
	   
	    }
	
}


