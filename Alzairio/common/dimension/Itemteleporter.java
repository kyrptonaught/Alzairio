package Alzairio.common.dimension;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import Alzairio.common.Alzairio;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class Itemteleporter extends Item {

	public Itemteleporter(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio);	
	}	
	 @Override
	 public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	    {
		 Side side = FMLCommonHandler.instance().getEffectiveSide();
			if (side == Side.SERVER)
			{
			
			
  
		 if (var3 instanceof EntityPlayerMP)
	        {
	            WorldServer worldserver = (WorldServer)var2;
	            EntityPlayerMP var4 = (EntityPlayerMP)var3;

	            if (var3.ridingEntity == null && var3.riddenByEntity == null && var3 instanceof EntityPlayer && var4.dimension != 0)
	            {
	                var4.mcServer.getConfigurationManager().transferPlayerToDimension(var4, 20, new TeleporterAlzairio(worldserver));
	            }
	        }
			}	
		 return var1;
	 
	 /*public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	 EntityClientPlayerMP thePlayer = FMLClientHandler.instance().getClient().thePlayer;
	  
		 thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Alzairio.dimension, new TeleporterAlzairio(thePlayer.mcServer.worldServerForDimension(Alzairio.dimension)));

		// 
		 return true;
	   */
	    }    
}
