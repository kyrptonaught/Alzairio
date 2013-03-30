package Alzairio.common.Init;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {
	public static void init() {
		//Blocks
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.aconitum, 2), new Object[] { "###", "&*&","&&&", Character.valueOf('#'), Item.flint, Character.valueOf('*'), Item.swordStone,Character.valueOf('&'),Block.cobblestone });
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.alzairian, 4), new Object[] { "#@#","@&#","#@#", Character.valueOf('#'), Block.blockLapis,Character.valueOf('@'), Block.cloth,Character.valueOf('&'),Block.obsidian});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.cloudus, 5), new Object[] { "###","#@#","###",Character.valueOf('#'), Item.feather,Character.valueOf('@'), Block.cloth });
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.Cannon,1), new Object[] { "###","#$#","%%%", Character.valueOf('#'),Block.glass,Character.valueOf('$'),Block.ice});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.launcher,2), new Object[] { "#*#","###","%%%",Character.valueOf('#'),Block.tnt,Character.valueOf('%'),Block.glass});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.speedy,4), new Object[] { "###","#%#","###",Character.valueOf('#'),Block.blockLapis,Character.valueOf('%'),Block.brewingStand});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.speedyS,4), new Object[] {"#$$","##$","###",Character.valueOf('#'),Alzairio.common.Init.Blocks.speedy});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.trampoline,4), new Object[] {"###","$&$","&$&",Character.valueOf('#'),Alzairio.common.Init.Blocks.cloudus,Character.valueOf('&'),Alzairio.common.Init.Blocks.launcher});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Blocks.Wall,5), new Object[]{ "!@#","$%^","&*(",Character.valueOf('!') ,Block.cobblestone});

		//Items 
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Items.JetPack,1), new Object [] { "!@!","#$#","%^%", Character.valueOf('!'),Item.ingotIron,Character.valueOf('@'),Item.diamond,Character.valueOf('#'),Item.ingotGold,Character.valueOf('$'),Item.flintAndSteel,Character.valueOf('%'),Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Alzairio.common.Init.Items.lightning,1), new Object[]{"!@#","!$@","^%%",Character.valueOf('@'),Item.diamond,Character.valueOf('#'),Item.ingotGold,Character.valueOf('$'),Item.flintAndSteel,Character.valueOf('^'),Item.stick});

		//Smelting
		GameRegistry.addSmelting(Alzairio.common.Init.Blocks.alzairianOre.blockID, new ItemStack(Alzairio.common.Init.Items.AlzairianIngot), 2F);
	}
}

