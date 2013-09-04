package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Blockcloudus extends Block{

	public Blockcloudus(int id) {
		super(id, Material.cloth);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }
	 @Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        return null;
	    }
 
	@Override
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		
		par5Entity.fallDistance = 0.0F;
	}
}

