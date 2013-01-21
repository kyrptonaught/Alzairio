package Alzairio.common.Block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import Alzairio.common.Proxys.CommonProxyAlzairio;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

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

@SideOnly(Side.CLIENT)
public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
{
    for (int var4 = 0; var4 < 16; ++var4)
    {
        par3List.add(new ItemStack(par1, 1, var4));
    }
}
/*public int getIconFromDamage(int metadata)
{
switch (metadata)
{
case 0: return 0;
case 1: return 1;
case 2: return 2;
case 3: return 3;
case 4: return 4;
case 5: return 5;
case 6: return 6;
case 7: return 7;
case 8: return 8;
case 9: return 9;
case 10: return 10;
case 11: return 11;
case 12: return 12;
case 13: return 13;
case 14: return 14;
case 15: return 15;
case 16: return 16;
}
return metadata;
}*/
}
