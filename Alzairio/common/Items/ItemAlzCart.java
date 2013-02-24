package Alzairio.common.Items;

import Alzairio.common.Proxys.CommonProxyAlzairio;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemMinecart;

public class ItemAlzCart extends ItemMinecart{

	public ItemAlzCart(int id, int par2) {
		super(id, par2);
		 this.maxStackSize = 1;
	        this.minecartType = par2;
	        this.setCreativeTab(CreativeTabs.tabTransport);
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
}
