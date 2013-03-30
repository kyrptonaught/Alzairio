package Alzairio.common.liquids;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;

public class BlockAlzairioWater extends BlockFlowing{
	
	public BlockAlzairioWater(int id) {

        super(id, Material.water);
        this.blockHardness = 100F;
        this.setLightOpacity(3);
        this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);
        }

   

}

