package Alzairio.common.liquids;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;

public class BlockAlzairioStill extends BlockStationary {
	 
	public BlockAlzairioStill(int id) {

		super(id, Material.water);
		this.blockHardness = 100F;
		this.setLightOpacity(3);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);
		this.disableStats();
		
	    }

	   

	}

