package Alzairio.common.Items;

import net.minecraft.item.Item;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class ItemCrumIngot extends Item {

public ItemCrumIngot(int id) {
		
		super(id);
		maxStackSize = 64;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	}	

	@Override
	public String getTextureFile() {
	
	return CommonProxyAlzairio.Items_png;
	}
}
