package Alzairio.common.dimension;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blockalzairio_portal  extends BlockPortal
{
	 public Blockalzairio_portal(int id, int texture)
	 {
	  super(id, texture);
	  this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);
	 }
@Override
public String getTextureFile(){
return CommonProxyAlzairio.alzairio_png;
 }
@Override
public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
{

 }
@Override
public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
{
	double var6 = par2 + par5Random.nextFloat();
    double var8 = par3 + 0.8F;
    double var10 = par4 + par5Random.nextFloat();
    double var12 = 0.0D;
    double var14 = 0.0D;
    double var16 = 0.0D;
	par1World.spawnParticle("magicCrit", var6, var8, var10, var12, var14, var16);
}
//@SideOnly(Side.CLIENT)
public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
{
 if (par5Entity.ridingEntity == null && par5Entity.riddenByEntity == null)
 {
  if (par5Entity instanceof EntityPlayerMP)
  {
   EntityPlayerMP thePlayer = (EntityPlayerMP) par5Entity;
   if (par5Entity.dimension != Alzairio.common.Alzairio.dimension)
   {
    thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Alzairio.common.Alzairio.dimension, new TeleporterAlzairio(thePlayer.mcServer.worldServerForDimension(Alzairio.common.Alzairio.dimension)));
   }
   else
   {
    thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterAlzairio(thePlayer.mcServer.worldServerForDimension(0)));
   }
  }
 }
}

@Override
public boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
{
    byte var5 = 0;
    byte var6 = 0;

    if (par1World.getBlockId(par2 - 1, par3, par4) == Alzairio.common.Init.Blocks.alzairian.blockID || par1World.getBlockId(par2 + 1, par3, par4) == Alzairio.common.Init.Blocks.alzairian.blockID)
    {
        var5 = 1;
    }

    if (par1World.getBlockId(par2, par3, par4 - 1) == Alzairio.common.Init.Blocks.alzairian.blockID || par1World.getBlockId(par2, par3, par4 + 1) == Alzairio.common.Init.Blocks.alzairian.blockID)
    {
        var6 = 1;
    }

    if (var5 == var6)
    {
        return false;
    }
    else
    {
        if (par1World.getBlockId(par2 - var5, par3, par4 - var6) == 0)
        {
            par2 -= var5;
            par4 -= var6;
        }

        int var7;
        int var8;

        for (var7 = -1; var7 <= 2; ++var7)
        {
            for (var8 = -1; var8 <= 3; ++var8)
            {
                boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

                if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3)
                {
                    int var10 = par1World.getBlockId(par2 + var5 * var7, par3 + var8, par4 + var6 * var7);

                    if (var9)
                    {
                        if (var10 != Alzairio.common.Init.Blocks.alzairian.blockID)
                        {
                            return false;
                        }
                    }
                    else if (var10 != 0 && var10 != Block.fire.blockID)
                    {
                        return false;
                    }
                }
            }
        }

        par1World.editingBlocks = true;

        for (var7 = 0; var7 < 2; ++var7)
        {
            for (var8 = 0; var8 < 3; ++var8)
            {
                par1World.setBlockWithNotify(par2 + var5 * var7, par3 + var8, par4 + var6 * var7, this.blockID);
            }
        }

        par1World.editingBlocks = false;
        return true;
    }
}
@Override
public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
{
 byte var6 = 0;
 byte var7 = 1;

  if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID)
 {
  var6 = 1;
  var7 = 0;
 }

  int var8;

  for (var8 = par3; par1World.getBlockId(par2, var8 - 1, par4) == this.blockID; --var8)
 {
  ;
 }

  if (par1World.getBlockId(par2, var8 - 1, par4) != Alzairio.common.Init.Blocks.alzairian.blockID)
 {
  par1World.setBlockWithNotify(par2, par3, par4, 0);
 }
 else
 {
  int var9;

   for (var9 = 1; var9 < 4 && par1World.getBlockId(par2, var8 + var9, par4) == this.blockID; ++var9)
  {
   ;
  }

   if (var9 == 3 && par1World.getBlockId(par2, var8 + var9, par4) == Alzairio.common.Init.Blocks.alzairian.blockID)
  {
   boolean var10 = par1World.getBlockId(par2 - 1, par3, par4) == this.blockID || par1World.getBlockId(par2 + 1, par3, par4) == this.blockID;
   boolean var11 = par1World.getBlockId(par2, par3, par4 - 1) == this.blockID || par1World.getBlockId(par2, par3, par4 + 1) == this.blockID;

    if (var10 && var11)
   {
    par1World.setBlockWithNotify(par2, par3, par4, 0);
   }
   else
   {
    if ((par1World.getBlockId(par2 + var6, par3, par4 + var7) != Alzairio.common.Init.Blocks.alzairian.blockID || par1World.getBlockId(par2 - var6, par3, par4 - var7) != this.blockID) && (par1World.getBlockId(par2 - var6, par3, par4 - var7) != Alzairio.common.Init.Blocks.alzairian.blockID || par1World.getBlockId(par2 + var6, par3, par4 + var7) != this.blockID))
    {
     par1World.setBlockWithNotify(par2, par3, par4, 0);
    }
   }
  }
  else
  {
   par1World.setBlockWithNotify(par2, par3, par4, 0);
  }
 }
}
}
