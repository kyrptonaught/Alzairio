package Alzairio.common.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class ItemBoots extends ItemArmor {

	public ItemBoots(int id, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
		super(id, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(Alzairio.tabalzairio2);

		this.setMaxDamage(20);
	}

	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}	
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
	{
	
	return Alzairio.modid + ":"+ "textures/armour.png";
	}
	
	
	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
	{
	     //player.capabilities.setPlayerWalkSpeed(0.1F);
		 player.motionX *= 1.4D;
         player.motionZ *= 1.4D;

	}

}
