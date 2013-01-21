package Alzairio.common.Block;

import java.util.List;

import org.lwjgl.input.Keyboard;

import Alzairio.common.Proxys.ClientProxyAlzairio;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockWall extends Block{
	public BlockWall(int id) {
		super(id, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);	
	     
	}
	public static int Mimic;
	 
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	       
	            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	        }
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		ClientProxyAlzairio.printMessageToPlayer("Texture Slot: "+Mimic);
		return true;
    }
    
	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
    {
   
		  }
	
	

	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	    {

	        this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
	    }
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }
	 
	    @SideOnly(Side.CLIENT) //Client side only
	    public int getBlockTextureFromSide(int par1)
	    {
	 
	    	return Mimic;
        }
	    
	   
	    
	   

		public boolean renderAsNormalBlock()
	    {
	        return false;
	    }

}
