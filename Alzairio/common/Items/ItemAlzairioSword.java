package Alzairio.common.Items;

import Alzairio.common.Alzairio;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
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
	 public void updateIcons(IconRegister iconRegister)
	   {
      this.iconIndex = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
  }	 
	@Override
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
