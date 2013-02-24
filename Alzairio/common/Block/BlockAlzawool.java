package Alzairio.common.Block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAlzawool extends Block 
{
public BlockAlzawool(int id)
{
  super(id,Material.cloth);
  this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);
}
/*public int getMetadata(int i)
{
  return i;
}
*/
public String getTextureFile()
{
  return CommonProxyAlzairio.AlzaWool;
}

public int getBlockTextureFromSideAndMetadata(int par1, int par2)
{
    if (par2 == 0)
    {
        return this.blockIndexInTexture;
    }
    else
    {
        par2 = ~(par2 & 15);
        return 113 + ((par2 & 8) >> 3) + (par2 & 7) * 16;
    }
}

public int damageDropped(int par1)
{
    return par1;
}

public static int getBlockFromDye(int par0)
{
    return ~par0 & 15;
}


public static int getDyeFromBlock(int par0)
{
    return ~par0 & 15;
  }
}
