package com.kyrptonaught.Alzairio.common.Block;

import java.util.Random;

import com.kyrptonaught.Alzairio.common.Alzairio;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockAlzLog extends Block
{
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon bottomIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;

	public BlockAlzLog(int par1)
	{
		super(par1, Material.wood);
		this.setCreativeTab(Alzairio.tabalzairio);
		this.setStepSound(soundWoodFootstep);

	}
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		if(side == 0) {
			return bottomIcon;
		} else if(side == 1) {
			return topIcon;
		} else {
			return sideIcon;
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName()+ "_top");
		bottomIcon = icon.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName() + "_top");
		sideIcon = icon.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName() + "_side");
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