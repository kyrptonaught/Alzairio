package Alzairio.common.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Entitycrusher  extends EntityMob
{
	 public Entitycrusher(World par1World) 
	 {
	  super(par1World);
	  this.texture = CommonProxyAlzairio.alzairio_png;
	  this.moveSpeed = 0.25F;
	  this.tasks.addTask(0, new EntityAISwimming(this));
      this.tasks.addTask(1, new EntityAIBreakDoor(this));
      this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.moveSpeed, false));
      this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
      this.tasks.addTask(4, new EntityAIWander(this, this.moveSpeed));
      this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
      this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
	 }
	 
	 @Override
	public String getTexture()
	    {
	  return CommonProxyAlzairio.alzairio_png;
	    }
	 @Override
	public void onLivingUpdate()
	    {
	        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
	        {
	            float var1 = this.getBrightness(1.0F);

	            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
	            {
	                this.setFire(8);
	            }
	        }

	        super.onLivingUpdate();
	    }

	@Override
	public int getAttackStrength(Entity par1Entity)
	    {
	     return 4;
	    }

	 
	 @Override
	public int getMaxHealth() 
	 {
	  return 20;
	 }
	 
	 @Override
	protected boolean isAIEnabled()
	    {
	        return true;
	    }
	}
