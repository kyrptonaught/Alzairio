package Alzairio.common;

import Alzairio.common.Block.BlockAlzSap;
import Alzairio.common.Init.Blocks;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

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
	}
