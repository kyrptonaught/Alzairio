package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockInvisi extends Block{

public BlockInvisi(int id, int texture) {
	super(id, texture, Material.rock);
	this.setCreativeTab(Alzairio.tabalzairio);	
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
    return 50;
}

/**
 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
 */
public boolean renderAsNormalBlock()
{
    return false;
}
}