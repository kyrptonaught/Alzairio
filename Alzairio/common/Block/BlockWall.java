package Alzairio.common.Block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import Alzairio.common.Models.TileEntityFakeWall;
import Alzairio.common.Models.TileEntityReducer;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockWall extends BlockContainer{
	public BlockWall(int id) {
		super(id, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);	
	     
	}
	public static int Mimic = 0;
	 
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	    {
	       
	            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	        }
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		 TileEntityFakeWall t = (TileEntityFakeWall) par1World.getBlockTileEntity(par2, par3, par4);
         t.processActivate(par5EntityPlayer, par1World);
		par1World.notifyBlockChange(par2, par3, par4, this.blockID);
		par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);
		
         ClientProxyAlzairio.printMessageToPlayer("Texture Slot: "+Mimic);
		return true;
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


		@Override
		public TileEntity createNewTileEntity(World var1) {
			
			return new TileEntityFakeWall();
		}

}
