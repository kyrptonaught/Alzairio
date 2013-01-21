package Alzairio.common.Models;

import Alzairio.common.LandBoat.ModelLandBoat2;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class CrumReducerRender implements ISimpleBlockRenderingHandler
{
   public static int renderID;
	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
	
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		
		return false;
	}


    public int getRenderId() {
		
         return renderID;
    }

	@Override
	public boolean shouldRender3DInInventory() {
		
		return false;
	}

	
}

