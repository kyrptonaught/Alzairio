package com.kyrptonaught.Alzairio.common.Items;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemAlzairioSword extends ItemSword{
	public int Special1; 
	
	public ItemAlzairioSword(int par1, EnumToolMaterial par2EnumToolMaterial, int Special)
	    {
	        super(par1, par2EnumToolMaterial);
	        this.Special1= Special;
	        this.maxStackSize = 1;
	        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
	        this.setCreativeTab(Alzairio.tabalzairio2);
	        this.setMaxDamage(20);
	        this.bFull3D = true;
		  
	    }
	@Override
	public void registerIcons(IconRegister ir)
	{ this.itemIcon = ir.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
  }	 
	@Override
	 public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
	par1ItemStack.damageItem(1, par3EntityLivingBase);
	if (Special1 == 2) {
	par2EntityLivingBase.motionY+=1;
	par3EntityLivingBase.worldObj.playSoundAtEntity(par3EntityLivingBase, Alzairio.modid+":AlzHit", 1.0F, 1.0F);
	return true;
	}
	return true;
}
	}
