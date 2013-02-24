package Alzairio.common.Block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockPlanter extends Block{
	public BlockPlanter(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);	
		}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		par1World.setBlockWithNotify(par2+4, par3, par4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4+1, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4+1, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4-1, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4-1, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+1, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-1, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+1, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-1, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4+2, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4+3, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4+2, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4+3, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4-2, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4-3, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-4, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4-2, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4-3, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+4, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+2, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+2, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+3, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2+3, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-2, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-2, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-3, par3, par4+4, Alzairio.common.Init.Blocks.alzastone.blockID);
		par1World.setBlockWithNotify(par2-3, par3, par4-4, Alzairio.common.Init.Blocks.alzastone.blockID);
		

		return true;
    }
}
