package Alzairio.common.Items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.entity.EntityAlza;
import Alzairio.common.entity.EntityBeam;
import Alzairio.common.world.TestHouseGen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemZeroGrav extends Item{
	
	public ItemZeroGrav(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	}	
	
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.Items_png;
	}
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer Entityplayer) {	
		
	      EntityAlza Beam = new EntityAlza(world);
	      
	      world.spawnEntityInWorld(Beam);
	  
		return itemStack;
    }	
		
	
 
}
