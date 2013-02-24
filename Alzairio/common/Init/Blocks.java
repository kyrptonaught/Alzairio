package Alzairio.common.Init;

import net.minecraft.block.Block;
import Alzairio.common.Block.BlockAlzTorch;
import Alzairio.common.Block.BlockAlzawool;
import Alzairio.common.Block.BlockInvisi;
import Alzairio.common.Block.BlockPlanter;
import Alzairio.common.Block.BlockReducer;
import Alzairio.common.Block.BlockWall;
import Alzairio.common.Block.Blockaconitum;
import Alzairio.common.Block.Blockalzadirt;
import Alzairio.common.Block.Blockalzairian;
import Alzairio.common.Block.BlockalzairianOre;
import Alzairio.common.Block.Blockalzastone;
import Alzairio.common.Block.Blockcloudus;
import Alzairio.common.Block.Blocklauncher;
import Alzairio.common.Block.Blockscaffold;
import Alzairio.common.Block.Blockspeedy;
import Alzairio.common.Block.BlockspeedyS;
import Alzairio.common.Block.Blocktrampoline;
import Alzairio.common.Models.TileEntityReducer;
import Alzairio.common.dimension.Blockalzairio_portal;
import Alzairio.common.liquids.BlockAlzairioStill;
import Alzairio.common.liquids.BlockAlzairioWater;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block alzairio_portal;
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
    public static Block Reducer;
    public static Block Planter;
    public static Block Alzawool;  
    public static Block AlzTorch;
    public static void init() {
    	
    	alzadirt = new Blockalzadirt(151,0).setBlockName("alzadirt");
		GameRegistry.registerBlock(alzadirt, "alzadirt");
		LanguageRegistry.addName(alzadirt, "Alzairio Grass");

		alzairio_portal = new Blockalzairio_portal(3001, 0).setBlockName("alzairio_portal");
		GameRegistry.registerBlock(alzairio_portal, "alzairio_portal");
		LanguageRegistry.addName(alzairio_portal, "Alzairio Portal");

		alzairianOre = new BlockalzairianOre(150, 1).setBlockName("alzairianOre");
		GameRegistry.registerBlock(alzairianOre, "alzairianOre");
		LanguageRegistry.addName(alzairianOre, "Alzairian Ore");
			
		 alzastone = new Blockalzastone(152, 2).setBlockName("alzastone");
		GameRegistry.registerBlock(alzastone, "alzastone");
		LanguageRegistry.addName(alzastone, "Alzairio Stone");

	cloudus = new Blockcloudus(3004, 3).setBlockName("cloudus");
	GameRegistry.registerBlock(cloudus, "cloudus");
	LanguageRegistry.addName(cloudus, "Cloudus");

	aconitum = new Blockaconitum(3005, 4).setBlockName("aconitum");
	GameRegistry.registerBlock(aconitum, "aconitum");
	LanguageRegistry.addName(aconitum, "Aconitum");
	
	alzairian = new Blockalzairian(3007, 6).setBlockName("alzairian");
    GameRegistry.registerBlock(alzairian, "alzairian");
	LanguageRegistry.addName(alzairian, "Alzairian");
		
	speedy = new Blockspeedy(3008,5).setBlockName("speedy");
	GameRegistry.registerBlock(speedy, "speedy");
	LanguageRegistry.addName(speedy,"Speedy Block");
	
	speedyS = (new BlockspeedyS(3009, speedy, 5)).setBlockName("speedyS").setRequiresSelfNotify();	
	GameRegistry.registerBlock(speedyS, "speedyS");
	LanguageRegistry.addName(speedyS,"Speedy Stairs");
	
	launcher = (new Blocklauncher(3014, speedy, 7)).setBlockName("launcher").setRequiresSelfNotify();
	GameRegistry.registerBlock(launcher,"launcher");
	LanguageRegistry.addName(launcher, "Launcher");
	
	trampoline = new Blocktrampoline(3010,6).setBlockName("trampoline");
	GameRegistry.registerBlock(trampoline,"trampoline");
	LanguageRegistry.addName(trampoline,"Trampoline");
	
	scaffold = new Blockscaffold(3012,7).setBlockName("scaffold");
	GameRegistry.registerBlock(scaffold,"scaffold");
	LanguageRegistry.addName(scaffold,"Scaffold");
   
	Water1 = new BlockAlzairioStill(3000).setBlockName("Water1");
	GameRegistry.registerBlock(Water1,"Water1");
	LanguageRegistry.addName(Water1,"Stil Alzairian water");
    
	Water2 = new BlockAlzairioWater(2999).setBlockName("Water2");
	GameRegistry.registerBlock(Water2,"Water2");
	LanguageRegistry.addName(Water2,"Flowing Alzairian Water");
    
	Cannon = new BlockInvisi(155,8).setBlockName("Cannon");
	GameRegistry.registerBlock(Cannon,"Cannon");
	LanguageRegistry.addName(Cannon,"Invisible Block");
    
    Wall = new BlockWall(154).setBlockName("Wall");
    GameRegistry.registerBlock(Wall,"Wall");
    LanguageRegistry.addName(Wall,"Fake Wall/Mimic WIP");
    
    Reducer = new BlockReducer(3018,10, TileEntityReducer.class).setBlockName("Reducer");
    GameRegistry.registerBlock(Reducer,"Reducer");
    LanguageRegistry.addName(Reducer, "WIP Crafting Table");
   
    Planter = new BlockPlanter(3019,11).setBlockName("Planter");
    GameRegistry.registerBlock(Planter,"Planter");
    LanguageRegistry.addName(Planter,"Planter WIP");
     
    Alzawool = new BlockAlzawool(3020).setBlockName("Alzawool");
    GameRegistry.registerBlock(Alzawool,"Alzawool");
    LanguageRegistry.addName(Alzawool,"Alzawool");
   
    AlzTorch = new BlockAlzTorch(153,12).setBlockName("AlzTorch");
    GameRegistry.registerBlock(AlzTorch,"AlzTorch");
    LanguageRegistry.addName(AlzTorch, "AlzTorch");
    }
    
/*public static void Block(Block block, int id, int slot, String BlockName, Class Blockblock(id, slot)){
	block = new Blockblock(id,slot).setBlockName(block);
	GameRegistry.registerBlock(block, BlockName);
	LanguageRegistry.addName(block,BlockName);
}*/
	
}
