
package com.kyrptonaught.Alzairio.common.Init;

import com.kyrptonaught.Alzairio.common.Block.BlockAlzLeaf;
import com.kyrptonaught.Alzairio.common.Block.BlockAlzLog;
import com.kyrptonaught.Alzairio.common.Block.BlockAlzSap;
import com.kyrptonaught.Alzairio.common.Block.BlockAlzTorch;
import com.kyrptonaught.Alzairio.common.Block.BlockDummy;
import com.kyrptonaught.Alzairio.common.Block.BlockParticleDoor;
import com.kyrptonaught.Alzairio.common.Block.BlockTeleporter;
import com.kyrptonaught.Alzairio.common.Block.Blockaconitum;
import com.kyrptonaught.Alzairio.common.Block.Blockalzadirt;
import com.kyrptonaught.Alzairio.common.Block.Blockalzairian;
import com.kyrptonaught.Alzairio.common.Block.BlockalzairianOre;
import com.kyrptonaught.Alzairio.common.Block.Blockalzastone;
import com.kyrptonaught.Alzairio.common.Block.Blockcloudus;
import com.kyrptonaught.Alzairio.common.Block.Blocklauncher;
import com.kyrptonaught.Alzairio.common.Block.Blockspeedy;
import com.kyrptonaught.Alzairio.common.Block.BlockspeedyS;
import com.kyrptonaught.Alzairio.common.Block.Blocktrampoline;
import com.kyrptonaught.Alzairio.common.liquids.BlockAlzairioWater;

import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	public static Block alzadirt;
	public static Block alzairian;
	public static Block alzastone;
	public static Block cloudus;
	public static Block aconitum;
	public static Block speedy;
	public static Block speedyS;
	public static Block trampoline;
	public static Block launcher; 
	public static Block alzairianOre; 
	public static Block Water;
	public static Block AlzTorch;
	public static Block Teleporter;
	public static Block AlzSap;
	public static Block AlzLog;
	public static Block AlzLeaf;
	public static Fluid AlzFluid;
	public static Block ParticleDoor;
	public static Block Dummy;
	public static void init() {

		AlzFluid = new com.kyrptonaught.Alzairio.common.liquids.AlzFluid();

		alzadirt = new Blockalzadirt(254).setUnlocalizedName("alzadirt").setHardness(0.7F);
		GameRegistry.registerBlock(alzadirt, "alzadirt");
		LanguageRegistry.addName(alzadirt, "Alzairio Grass");

		alzairianOre = new BlockalzairianOre(3031).setUnlocalizedName("alzairianOre");
		GameRegistry.registerBlock(alzairianOre, "alzairianOre");
		LanguageRegistry.addName(alzairianOre, "Alzairian Ore");

		alzastone = new Blockalzastone(255).setUnlocalizedName("alzastone").setHardness(11F);
		GameRegistry.registerBlock(alzastone, "alzastone");
		LanguageRegistry.addName(alzastone, "Alzairio Stone");

		cloudus = new Blockcloudus(3004).setUnlocalizedName("cloudus").setHardness(1F);
		GameRegistry.registerBlock(cloudus, "cloudus");
		LanguageRegistry.addName(cloudus, "Cloudus");

		aconitum = new Blockaconitum(3005).setUnlocalizedName("aconitum").setHardness(1F);
		GameRegistry.registerBlock(aconitum, "aconitum");
		LanguageRegistry.addName(aconitum, "Aconitum");

		alzairian = new Blockalzairian(3007).setUnlocalizedName("alzairian").setHardness(1F);
		GameRegistry.registerBlock(alzairian, "alzairian");
		LanguageRegistry.addName(alzairian, "Alzairian");

		speedy = new Blockspeedy(3008).setUnlocalizedName("speedy").setHardness(1F);
		GameRegistry.registerBlock(speedy, "speedy");
		LanguageRegistry.addName(speedy,"Speedy Block");

		speedyS = new BlockspeedyS(3009, speedy, 0).setUnlocalizedName("speedyS").setHardness(1F);	
		GameRegistry.registerBlock(speedyS, "speedyS");
		LanguageRegistry.addName(speedyS,"Speedy Stairs");

		launcher = new Blocklauncher(3014, speedy,0).setUnlocalizedName("launcher").setHardness(1F);
		GameRegistry.registerBlock(launcher,"launcher");
		LanguageRegistry.addName(launcher, "Launcher");

		trampoline = new Blocktrampoline(3010).setUnlocalizedName("trampoline").setHardness(1F);
		GameRegistry.registerBlock(trampoline,"trampoline");
		LanguageRegistry.addName(trampoline,"Trampoline");

		Water = new BlockAlzairioWater(2999).setUnlocalizedName("Acid");
		GameRegistry.registerBlock(Water,"Water");
		LanguageRegistry.addName(Water,"Acid");

		AlzTorch = new BlockAlzTorch(3035).setUnlocalizedName("AlzTorch").setHardness(1F);
		GameRegistry.registerBlock(AlzTorch,"AlzTorch");
		LanguageRegistry.addName(AlzTorch, "AlzTorch");

		Teleporter = new BlockTeleporter(3036).setUnlocalizedName("Teleporter");
		GameRegistry.registerBlock(Teleporter,"teleporter");
		LanguageRegistry.addName(Teleporter, "Portal");

		AlzSap = new BlockAlzSap(3037, 0).setUnlocalizedName("AlzSap");
		GameRegistry.registerBlock(AlzSap,"AlzSap");
		LanguageRegistry.addName(AlzSap, "AlzSap");

		AlzLog= new BlockAlzLog(3038).setUnlocalizedName("AlzLog").setHardness(1F);
		GameRegistry.registerBlock(AlzLog,"AlzLog");
		LanguageRegistry.addName(AlzLog, "AlzLog");

		AlzLeaf = new BlockAlzLeaf(3039).setUnlocalizedName("AlzLeaf");
		GameRegistry.registerBlock(AlzLeaf,"AlzLeaf");
		LanguageRegistry.addName(AlzLeaf, "AlzLeaf");

		ParticleDoor = new BlockParticleDoor(3040).setUnlocalizedName("Particle Door");
		GameRegistry.registerBlock(ParticleDoor,"Particle Door");
		LanguageRegistry.addName(ParticleDoor, "Particle Door");
	
		Dummy = new BlockDummy(3041).setUnlocalizedName("Dummy");
		GameRegistry.registerBlock(Dummy,"Dummy");
		LanguageRegistry.addName(Dummy, "Dummy Block");
	}
}
