package Alzairio.common.Block;

import java.util.Random;

import Alzairio.common.Alzairio;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAlzLog extends Block
{
	public BlockAlzLog(int par1)
	{
		super(par1, Material.leaves);
		this.setCreativeTab(Alzairio.tabalzairio);
		this.setStepSound(soundGrassFootstep);
		this.setHardness(0.2F);
	}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	public boolean isOpaqueCube()
	{
		return false;
	}
	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID;
	}
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}