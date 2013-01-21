package Alzairio.common.Items;

import java.util.List;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Itemlightning extends Item {
	public Itemlightning(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	}	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	par3List.add("Lightning Wand. Increases Crum by 2");//the color code trick works here aswell 
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
	 MovingObjectPosition block = this.getMovingObjectPositionFromPlayer(par3World, par2EntityPlayer,  true);
	  if (block != null)
	  {
     int BlockGet = par3World.getBlockId(block.blockX,block.blockY ,block.blockZ );
	  // ClientProxyAlzairio.printMessageToPlayer("Block ID : " + BlockGet);
	  }
	Alzairio.Crum++;
	ClientProxyAlzairio.SaveCrumValue();
	  Vec3 look = par2EntityPlayer.getLookVec();
      EntityLightningBolt fireball2 = new EntityLightningBolt(par3World, 1, 1, 1);
      fireball2.setPosition(
                      par2EntityPlayer.posX + look.xCoord * 5,
                      par2EntityPlayer.posY + look.yCoord * 5,
                      par2EntityPlayer.posZ + look.zCoord * 5);
     // fireball2.accelerationX = look.xCoord * 0.1;
     // fireball2.accelerationY = look.yCoord * 0.1;
     // fireball2.accelerationZ = look.zCoord * 0.1;
      par3World.spawnEntityInWorld(fireball2);

return true;
	
	   
	    }    
	 }

