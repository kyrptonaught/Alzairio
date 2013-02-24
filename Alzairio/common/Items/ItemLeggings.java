package Alzairio.common.Items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class ItemLeggings extends ItemArmor implements IArmorTextureProvider{

	public ItemLeggings(int id, EnumArmorMaterial par2EnumArmorMaterial,int par3, int par4) {
	super(id, par2EnumArmorMaterial, par3, par4);
	this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);
    this.setIconIndex(13);
    this.setMaxDamage(20);
}

@Override
public String getTextureFile() {

return CommonProxyAlzairio.Items_png;
}
@Override
public String getArmorTextureFile(ItemStack itemstack) {
	
	return CommonProxyAlzairio.Armour2_png;
}

}