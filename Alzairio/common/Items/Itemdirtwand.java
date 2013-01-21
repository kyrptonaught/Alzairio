package Alzairio.common.Items;

import java.util.List;

import net.minecraft.block.BlockEventData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Itemdirtwand extends Item{
	public Itemdirtwand(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);	
	}	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Spawn a block of dirt. Increases Crum by 2");//the color code trick works here aswell 
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
	 par3World.setBlockWithNotify(par4, par5+1, par6, Alzairio.common.Init.Blocks.alzadirt.blockID);
	 Alzairio.common.Alzairio.Crum++;
	 ClientProxyAlzairio.printMessageToPlayer(getTextureFile());
	 //ClientProxyAlzairio.printMessageToPlayer("Crum = " + Alzairio.Taint);
		 ClientProxyAlzairio.printMessageToPlayer("Username: " + par2EntityPlayer.username);
	if (par2EntityPlayer.username == "kyrptonaught") {
		ClientProxyAlzairio.printMessageToPlayer("Welcome Master "+ par2EntityPlayer.username +". How may I assist you today");
	}
	if (par2EntityPlayer.username == "rockinrussomano") {
		ClientProxyAlzairio.printMessageToPlayer("Welcome "+ par2EntityPlayer.username);
	}
	ClientProxyAlzairio.SaveCrumValue();
	
	return true;
	   
	    }    
	 }
