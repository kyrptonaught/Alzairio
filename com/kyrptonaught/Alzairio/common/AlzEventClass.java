package com.kyrptonaught.Alzairio.common;

import com.kyrptonaught.Alzairio.common.Block.BlockAlzSap;
import com.kyrptonaught.Alzairio.common.Init.Blocks;
import com.kyrptonaught.Alzairio.common.Init.Items;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class AlzEventClass {

	private int BlockID;
	/** Used to make the sapling grow the tree **/
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event)
	{
		if(event.world.getBlockId(event.X, event.Y, event.Z) == Blocks.AlzSap.blockID)
		{
			((BlockAlzSap)Blocks.AlzSap).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		// You add them the same way as you add blocks.
		event.manager.addSound(Alzairio.modid+":AlzHit.ogg");
		event.manager.addSound(Alzairio.modid+":AlzDig.ogg");
		event.manager.addSound(Alzairio.modid+":AlzPos.ogg");
	}
	@ForgeSubscribe
	public void FillBucket(FillBucketEvent e)
	{
		ItemStack is=attemptFill(e.world,e.target);
		if(is!=null)
		{
			e.result=is;
			e.setResult(Result.ALLOW);
		}
	}
	private ItemStack attemptFill(World w,MovingObjectPosition mop)
	{
		int id=w.getBlockId(mop.blockX,mop.blockY,mop.blockZ);
		if(id==Blocks.Water.blockID)
		{
			if(w.getBlockMetadata(mop.blockX,mop.blockY,mop.blockZ)==0)
			{
				w.setBlockToAir(mop.blockX,mop.blockY,mop.blockZ);
				System.out.print("Here");
				return new ItemStack(Items.Bucket);
			}
		}
		return null;
	}	
}
