package Alzairio.common.Items;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemDigWand extends Item{

	public ItemDigWand(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	    this.setMaxDamage(20);
	    this.bFull3D = true;
	  
	}	
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
		 if(par1ItemStack.getItemDamage() == 20){
			 par1ItemStack.stackSize--;
		 }
		     	while(par5 >3) {
			  world.setBlockWithNotify(par4,par5,par6, 0);
		      world.spawnParticle("portal", par4, par5, par6, 0, -1, 0);
		      world.spawnParticle("largesmoke", par4, par5+1, par6, 0, -1, 0);
				 par5--;
	    }
	
 
		  return true; 
	
	}
}
