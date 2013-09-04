package com.kyrptonaught.Alzairio.common.Items;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

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
