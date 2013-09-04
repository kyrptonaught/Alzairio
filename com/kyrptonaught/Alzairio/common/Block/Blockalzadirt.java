package com.kyrptonaught.Alzairio.common.Block;

import com.kyrptonaught.Alzairio.common.Alzairio;

import net.minecraft.block.BlockSand;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class Blockalzadirt extends BlockSand {

	public Blockalzadirt(int id) {
		super(id);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	
	
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }
	

	   
	    @Override
		@SideOnly(Side.CLIENT)
	    public int getBlockColor()
	    {
	        double var1 = 0.5D;
	        double var3 = 1.0D;
	        return ColorizerGrass.getGrassColor(var1, var3);
	    }

	    @Override
		@SideOnly(Side.CLIENT)

	    /**
	     * Returns the color this block should be rendered. Used by leaves.
	     */
	    public int getRenderColor(int par1)
	    {
	        return this.getBlockColor();
	    }

	    @Override
		@SideOnly(Side.CLIENT)

	    /**
	     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
	     * when first determining what to render.
	     */
	    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	        int var5 = 0;
	        int var6 = 0;
	        int var7 = 0;

	        for (int var8 = -1; var8 <= 1; ++var8)
	        {
	            for (int var9 = -1; var9 <= 1; ++var9)
	            {
	                int var10 = par1IBlockAccess.getBiomeGenForCoords(par2 + var9, par4 + var8).getBiomeGrassColor();
	                var5 += (var10 & 16711680) >> 16;
	                var6 += (var10 & 65280) >> 8;
	                var7 += var10 & 255;
	            }
	        }

	        return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
	    }
	 /*	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		double var6 = par2 + par5Random.nextFloat();
	    double var8 = par3 + 0.8F;
	    double var10 = par4 + par5Random.nextFloat();
	    double var12 = 0.0D;
	    double var14 = 0.0D;
	    double var16 = 0.0D;
		par1World.spawnParticle("magicCrit", var6+1, var8+1, var10+1, var12+1, var14+1, var16+1);
	    par1World.spawnParticle("portal", var6+1, var8+1, var10+1, var12+1, var14+1, var16+1);
}
*/
}