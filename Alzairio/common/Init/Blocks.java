package Alzairio.common.Init;

import net.minecraft.block.Block;
import Alzairio.common.Block.BlockAlzTorch;
import Alzairio.common.Block.BlockInvisi;
import Alzairio.common.Block.BlockWall;
import Alzairio.common.Block.Blockaconitum;
import Alzairio.common.Block.Blockalzadirt;
import Alzairio.common.Block.Blockalzairian;
import Alzairio.common.Block.BlockalzairianOre;
import Alzairio.common.Block.Blockalzastone;
import Alzairio.common.Block.Blockcloudus;
import Alzairio.common.Block.Blocklauncher;
import Alzairio.common.Block.Blockspeedy;
import Alzairio.common.Block.BlockspeedyS;
import Alzairio.common.Block.Blocktrampoline;
import Alzairio.common.liquids.BlockAlzairioStill;
import Alzairio.common.liquids.BlockAlzairioWater;
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
	public static Block scaffold; 
	public static Block alzairianOre; 
	public static Block Water1;
	public static Block Water2;
	public static Block Cannon;
	public static Block Wall;
	public static Block AlzTorch;
	public static void init() {

		alzadirt = new Blockalzadirt(3030).setUnlocalizedName("alzadirt");
		GameRegistry.registerBlock(alzadirt, "alzadirt");
		LanguageRegistry.addName(alzadirt, "Alzairio Grass");

		alzairianOre = new BlockalzairianOre(3031).setUnlocalizedName("alzairianOre");
		GameRegistry.registerBlock(alzairianOre, "alzairianOre");
		LanguageRegistry.addName(alzairianOre, "Alzairian Ore");

		alzastone = new Blockalzastone(3032).setUnlocalizedName("alzastone");
		GameRegistry.registerBlock(alzastone, "alzastone");
		LanguageRegistry.addName(alzastone, "Alzairio Stone");

		cloudus = new Blockcloudus(3004).setUnlocalizedName("cloudus");
		GameRegistry.registerBlock(cloudus, "cloudus");
		LanguageRegistry.addName(cloudus, "Cloudus");

		aconitum = new Blockaconitum(3005).setUnlocalizedName("aconitum");
		GameRegistry.registerBlock(aconitum, "aconitum");
		LanguageRegistry.addName(aconitum, "Aconitum");

		alzairian = new Blockalzairian(3007).setUnlocalizedName("alzairian");
		GameRegistry.registerBlock(alzairian, "alzairian");
		LanguageRegistry.addName(alzairian, "Alzairian");

		speedy = new Blockspeedy(3008).setUnlocalizedName("speedy");
		GameRegistry.registerBlock(speedy, "speedy");
		LanguageRegistry.addName(speedy,"Speedy Block");

		speedyS = new BlockspeedyS(3009, speedy, 0).setUnlocalizedName("speedyS");	
		GameRegistry.registerBlock(speedyS, "speedyS");
		LanguageRegistry.addName(speedyS,"Speedy Stairs");

		launcher = new Blocklauncher(3014, speedy,0).setUnlocalizedName("launcher");
		GameRegistry.registerBlock(launcher,"launcher");
		LanguageRegistry.addName(launcher, "Launcher");

		trampoline = new Blocktrampoline(3010).setUnlocalizedName("trampoline");
		GameRegistry.registerBlock(trampoline,"trampoline");
		LanguageRegistry.addName(trampoline,"Trampoline");

		Water1 = new BlockAlzairioStill(3000).setUnlocalizedName("Water1");
		GameRegistry.registerBlock(Water1,"Water1");
		LanguageRegistry.addName(Water1,"Stil Alzairian water");

		Water2 = new BlockAlzairioWater(2999).setUnlocalizedName("Water2");
		GameRegistry.registerBlock(Water2,"Water2");
		LanguageRegistry.addName(Water2,"Flowing Alzairian Water");

		Cannon = new BlockInvisi(3034).setUnlocalizedName("Cannon");
		GameRegistry.registerBlock(Cannon,"Cannon");
		LanguageRegistry.addName(Cannon,"Invisible Block");

		Wall = new BlockWall(3033).setUnlocalizedName("Wall");
		GameRegistry.registerBlock(Wall,"Wall");
		LanguageRegistry.addName(Wall,"Fake Wall/Mimic WIP");

		AlzTorch = new BlockAlzTorch(3035).setUnlocalizedName("AlzTorch");
		GameRegistry.registerBlock(AlzTorch,"AlzTorch");
		LanguageRegistry.addName(AlzTorch, "AlzTorch");
	}



}
