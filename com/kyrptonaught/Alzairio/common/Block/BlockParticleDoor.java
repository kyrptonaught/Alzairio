package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;
import com.kyrptonaught.Alzairio.common.Init.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockParticleDoor extends Block{

	public BlockParticleDoor(int par1) {
		super(par1, Material.glass);
		this.setCreativeTab(Alzairio.tabalzairio);
	}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {

		if(par1World.getBlockId(par2, par3+1, par4) == Blocks.Dummy.blockID){
			par1World.setBlock(par2, par3+1, par4, 0);
		}
	}
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		this.func_111047_d(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
	}

	protected void func_111047_d(int par1)
	{
		byte b0 = 0;
		float f = (float)(1 * (1 + b0)) / 16.0F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
	}
	 public void setBlockBoundsForItemRender()
	    {
	        this.func_111047_d(0);
	    }
	public boolean isOpaqueCube()
	{
		return false;
	}
	public boolean renderAsNormalBlock()
	{
		return false;
	}
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		if(par1World.getBlockId(par2, par3+1, par4) == Blocks.Dummy.blockID){
			par1World.setBlock(par2, par3+1, par4, 0);
		}else if(par1World.getBlockId(par2, par3+1, par4) == 0){
			par1World.setBlock(par2, par3+1, par4, Blocks.Dummy.blockID);
		}
		return true;
	}
}
