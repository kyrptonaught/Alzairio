package Alzairio.common.Block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Alzairio.common.Models.CrumReducerRender;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockReducer extends Block {
	
	public BlockReducer(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);	
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
	    return CrumReducerRender.renderID;
	}
	
	
	public boolean renderAsNormalBlock()
	{
	    return false;
	}
}
