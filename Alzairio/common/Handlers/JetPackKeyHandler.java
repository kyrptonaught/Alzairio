package Alzairio.common.Handlers;

import java.util.EnumSet;

import org.lwjgl.input.Keyboard;

import Alzairio.common.Block.BlockWall;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

import net.minecraft.block.Block;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.TickType;

public class JetPackKeyHandler extends KeyHandler {
	
	static KeyBinding myBinding = new KeyBinding("Activate JetPack", Keyboard.KEY_N);
	
	public JetPackKeyHandler() {
        //the first value is an array of KeyBindings, the second is whether or not the call 
        //keyDown should repeat as long as the key is down
        super(new KeyBinding[]{myBinding}, new boolean[]{true});
}
	@Override
	public String getLabel() {
		
		return "Activate JetPack";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,
			boolean tickEnd, boolean isRepeat) {
		EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
		World theWorld = FMLClientHandler.instance().getClient().theWorld;
		ItemStack itemstack = thePlayer.inventory.armorItemInSlot(2);
		if(!thePlayer.capabilities.isCreativeMode){
			if(itemstack != null && itemstack.itemID == Alzairio.common.Init.Items.JetPack.itemID){
			//ClientProxyAlzairio.printMessageToPlayer("Succes");
			thePlayer.motionY += 0.1;
		    thePlayer.fallDistance = 0;
        
		  double posx = thePlayer.posX;
          double posy = thePlayer.posY;
          double posz = thePlayer.posZ;
          theWorld.spawnParticle("largesmoke", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("lava", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("dripLava", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("townaura", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("spell", posx, posy, posz,0,-2,0);

			} 
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
		ItemStack itemstack = thePlayer.inventory.armorItemInSlot(2);
		
		if(itemstack != null && itemstack.itemID == Alzairio.common.Init.Items.JetPack.itemID){
			//ClientProxyAlzairio.printMessageToPlayer("Succes");
			 thePlayer.fallDistance = 0;
		}
	}
	@Override
	public EnumSet<TickType> ticks() {
		
		return EnumSet.of(TickType.CLIENT);
	}

}