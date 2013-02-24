package Alzairio.common.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IArmorTextureProvider;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class ItemJetPack extends ItemArmor implements IArmorTextureProvider{

	public ItemJetPack(int id, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
		super(id, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);
	    this.setIconIndex(7);
	    this.setMaxDamage(20);
	}
  
	@Override
	public String getTextureFile() {
	
	return CommonProxyAlzairio.Items_png;
	}
	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		
		return CommonProxyAlzairio.JetPack_png;
	}
	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player, ItemStack itemStack)
    {
		player.fallDistance = 0.0F;
    }
}
