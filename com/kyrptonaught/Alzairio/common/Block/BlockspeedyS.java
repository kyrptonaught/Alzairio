package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;
import com.kyrptonaught.Alzairio.common.Proxys.ClientProxyAlzairio;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class BlockspeedyS extends BlockStairs{
	private  Block modelBlock;
	public BlockspeedyS(int par1,Block modelBlockx,int par2)
	{
		super(par1, modelBlockx, par2);

		this.modelBlock = modelBlockx;
		this.setLightOpacity(0);
		this.setCreativeTab(Alzairio.tabalzairio);
	}
 
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }
	@Override
	public int getRenderType()
	{
		return 10;
	}
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}


	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
	{
		entity.motionY *= 0.4;
	    entity.motionX *= 1.5D;
        entity.motionZ *= 1.5D;

	}  

}


