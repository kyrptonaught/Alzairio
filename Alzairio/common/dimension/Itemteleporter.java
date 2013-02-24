package Alzairio.common.dimension;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Itemteleporter extends Item {

	public Itemteleporter(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	}	
	
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
	if(player.dimension != 20  ){
		player.timeUntilPortal = 10;
	player.travelToDimension(Alzairio.dimension);
	}
	else player.travelToDimension(0);
	return itemStack;
	}
	
	/*@Override
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
	 
	    }  */  
}
