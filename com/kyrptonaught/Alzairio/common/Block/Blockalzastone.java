package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Blockalzastone extends Block{

	public Blockalzastone(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }	
}
