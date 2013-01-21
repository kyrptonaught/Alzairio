package Alzairio.common.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemIscaffold extends Item
{
	
	public int Add;
	public ItemIscaffold(int id) {
		super(id);
		maxStackSize = 64;
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);	
	   
	}	
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Spawn a scaffold block. Increases Crum by 1");
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
		Side side = FMLCommonHandler.instance().getEffectiveSide();
	//	if (side == Side.CLIENT)
		//{
		par3World.setBlockWithNotify(par4, par5+1, par6, Alzairio.common.Init.Blocks.scaffold.blockID);
	Alzairio.common.Alzairio.Crum++;
	//	}
		// ClientProxyAlzairio.printMessageToPlayer("Crum = " + Alzairio.Taint);
		
	    
		return true;    
	 }
}
