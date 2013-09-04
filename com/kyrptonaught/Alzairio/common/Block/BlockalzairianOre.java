package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockalzairianOre extends Block{
	
	public BlockalzairianOre(int id) {
		super(id, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }
}
