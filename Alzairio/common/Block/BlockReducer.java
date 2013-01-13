package Alzairio.common.Block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockReducer extends Block {
	
	public BlockReducer(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);	
		}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	public boolean isOpaqueCube()
	{
	    return false;
	}

	/**
	 * The type of render function that is called for this block
	 */
	public int getRenderType()
	{
	    return -1;
	}
	
	
	public boolean renderAsNormalBlock()
	{
	    return false;
	}
}
