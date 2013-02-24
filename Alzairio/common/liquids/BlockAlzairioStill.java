package Alzairio.common.liquids;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockAlzairioStill extends BlockStationary {
	 
	public BlockAlzairioStill(int id) {

		super(id, Material.water);
		this.blockHardness = 100F;
		this.setLightOpacity(3);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);
		this.disableStats();
		this.setRequiresSelfNotify();
	    }

	    @Override
	    public String getTextureFile() {

	        return CommonProxyAlzairio.alzairio_png;
	    }

	}

