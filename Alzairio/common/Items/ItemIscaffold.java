package Alzairio.common.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;

public class ItemIscaffold extends Item
{
	public int Taint;
	public int Add;
	public ItemIscaffold(int id) {
		super(id);
		maxStackSize = 64;
		this.setCreativeTab(Alzairio.tabalzairio);	
	   Add = 1;
	}	
	 @Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	    {
	        return EnumAction.block;
	    }
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
	 par3World.setBlockWithNotify(par4, par5+1, par6, Alzairio.scaffold.blockID);
	Alzairio.Taint = Taint+1;
	 if (Alzairio.Taint > 10) {
		 ClientProxyAlzairio.printMessageToPlayer("Oh no the Amount of polution is to high "+ Alzairio.Taint);		
	 }
		 ClientProxyAlzairio.printMessageToPlayer("Crum = " + Alzairio.Taint);
		 return true;
	   
	    }    
}
