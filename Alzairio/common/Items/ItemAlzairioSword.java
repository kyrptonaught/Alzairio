package Alzairio.common.Items;

import Alzairio.common.Proxys.ClientProxyAlzairio;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemAlzairioSword extends ItemSword{
	public int Special1; 
	
	public ItemAlzairioSword(int par1, EnumToolMaterial par2EnumToolMaterial,String texture, int slot, int Special)
	    {
	        super(par1, par2EnumToolMaterial);
	        this.Special1= Special;
	        this.setIconIndex(slot);
	        this.maxStackSize = 1;
	        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
	        this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);
	        this.setTextureFile(texture); 
	        this.setMaxDamage(20);
	        this.bFull3D = true;
		   
	    }
	 
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
	{
	par1ItemStack.damageItem(1, par3EntityLiving);
	if (Special1 == 2) {
	par2EntityLiving.motionY+=1;
	return true;
	}
	return true;
}
	}
