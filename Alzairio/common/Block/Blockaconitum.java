package Alzairio.common.Block;

import java.io.InputStream;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.client.texturepacks.ITexturePack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Blockaconitum extends Block {
	
	public Blockaconitum(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
	    	
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	
	@Override
		public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	    {
	            float f = 0.0625F;
	            return AxisAlignedBB.getBoundingBox((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
	    }
	  @Override
	    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k)
	    {
	            float f = 0.0625F;
	            return AxisAlignedBB.getBoundingBox((float)i + f, j, (float)k + f, (float)(i + 1) - f, j + 1, (float)(k + 1) - f);
	    }
	
	  @Override
		 public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
		    {
		    
		entity.attackEntityFrom(DamageSource.generic, 4);
		
      }
	
}