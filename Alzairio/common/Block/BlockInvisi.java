package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import Alzairio.common.Alzairio;

public class BlockInvisi extends Block{

public BlockInvisi(int id) {
	super(id, Material.rock);
	this.setCreativeTab(Alzairio.tabalzairio);	
	}
@Override 
public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName2());
    }
@Override
public boolean isOpaqueCube()
{
    return false;
}

/**
 * The type of render function that is called for this block
 */
@Override
public int getRenderType()
{
    return 50;
}

/**
 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
 */
@Override
public boolean renderAsNormalBlock()
{
    return false;
}
}