package Alzairio.common.liquids;

import Alzairio.common.Alzairio;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAlzairioStill extends BlockStationary {

	public BlockAlzairioStill(int id) {

		super(id, Material.water);
		this.blockHardness = 100F;
		this.setLightOpacity(3);
		//this.setCreativeTab(Alzairio.tabalzairio);
		this.disableStats();

	}

}

