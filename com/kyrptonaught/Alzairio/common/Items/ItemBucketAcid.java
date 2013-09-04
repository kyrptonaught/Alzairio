package com.kyrptonaught.Alzairio.common.Items;

import com.kyrptonaught.Alzairio.common.Alzairio;
import com.kyrptonaught.Alzairio.common.Init.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.IFluidContainerItem;
import net.minecraftforge.fluids.ItemFluidContainer;

public class ItemBucketAcid extends ItemFluidContainer implements IFluidContainerItem{

	public ItemBucketAcid(int itemID) {
		super(itemID);
		this.setCreativeTab(com.kyrptonaught.Alzairio.common.Alzairio.tabalzairio2);

	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		world.setBlock(par4, par5+1, par6, Blocks.Water.blockID);
		par1ItemStack.stackSize--;
		if(!Entityplayer.capabilities.isCreativeMode){
			ItemStack bucketStack = new ItemStack(Item.bucketEmpty);
			Entityplayer.inventory.addItemStackToInventory(bucketStack);
		}
		return true;

	}
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}	
}

