package com.kyrptonaught.Alzairio.common.liquids;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class AlzFluid extends Fluid{

	public AlzFluid() {
		super("AlzairianFluid");
		setDensity(10); // How thick the fluid is, affects movement inside the liquid.
		setViscosity(1000); // How fast the fluid flows.
		FluidRegistry.registerFluid(this); // Registering inside it self, keeps things neat :)
	}
}


