package Alzairio.common.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import Alzairio.common.Alzairio;

public class ItemAlzairianIngot extends Item {
	public ItemAlzairianIngot(int id) {
		
		super(id);
		maxStackSize = 64;
		this.setCreativeTab(Alzairio.tabalzairio2);	
		
	}	

	@Override
	public void registerIcons(IconRegister iconRegister)
	{
        this.itemIcon = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
      
	   }	
} 
