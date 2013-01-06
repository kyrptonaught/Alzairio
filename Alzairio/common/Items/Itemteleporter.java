package Alzairio.common.Items;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import Alzairio.common.Alzairio;
import cpw.mods.fml.client.FMLClientHandler;

public class Itemteleporter extends Item {

	public Itemteleporter(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio);	
	}	
	 @Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
		 FMLClientHandler.instance().getClient().thePlayer.travelToDimension(20);
		 
		 return true;
	   
	    }    
}
