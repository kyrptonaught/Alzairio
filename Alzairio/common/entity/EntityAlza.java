package Alzairio.common.entity;

import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Init.Items;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class EntityAlza extends EntityMob{

	public EntityAlza(World par1World) 
	{
		super(par1World);
		this.setAIMoveSpeed(0.25F);
		this.moveSpeed = 0.25F;
		this.texture = CommonProxyAlzairio.alzairio_png;
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWander(this, this.moveSpeed));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.targetTasks.addTask(5, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 16.0F, 0, true));
		this.setCurrentItemOrArmor(0, new ItemStack(Items.Sword));
		this.setCurrentItemOrArmor(1, new ItemStack(Items.Boots));
		this.setCurrentItemOrArmor(2, new ItemStack(Items.Leggings));
		this.setCurrentItemOrArmor(3, new ItemStack(Items.Chest));
		this.setCurrentItemOrArmor(4, new ItemStack(Items.Helmet));
	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}
	@Override
	public int getMaxHealth() {

		return 15;
	}
	@Override
	public boolean interact(EntityPlayer par1EntityPlayer)
	{ 
		if (!this.worldObj.isRemote)
	{
	              par1EntityPlayer.mountEntity(this);
	}
	              return true;
	       
	}
}
