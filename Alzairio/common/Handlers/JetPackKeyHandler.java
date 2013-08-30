package Alzairio.common.Handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.EnumSet;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;

public class JetPackKeyHandler extends KeyHandler {
	
	static KeyBinding Jetpack = new KeyBinding("Activate JetPack", Keyboard.KEY_N);
	
	public JetPackKeyHandler() {
        //the first value is an array of KeyBindings, the second is whether or not the call 
        //keyDown should repeat as long as the key is down
        super(new KeyBinding[]{Jetpack}, new boolean[]{true});
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
	
			if(itemstack != null && itemstack.itemID == Alzairio.common.Init.Items.JetPack.itemID){
			//ClientProxyAlzairio.printMessageToPlayer("Succes");
			thePlayer.motionY += 0.1;
		    thePlayer.fallDistance = 0.0F;
		   
		  double posx = thePlayer.posX;
          double posy = thePlayer.posY;
          double posz = thePlayer.posZ;
        /*  theWorld.spawnParticle("largesmoke", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("lava", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("dripLava", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("townaura", posx, posy, posz,0,-2,0);
          theWorld.spawnParticle("spell", posx, posy, posz,0,-2,0);
      */   
         
         ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
 	     DataOutputStream outputStream = new DataOutputStream(bos);
 	     try {
 	         
 	    	     outputStream.writeDouble(posx);
 	    	     outputStream.writeDouble(posy);
 	    	     outputStream.writeDouble(posz);
 	            
 	     } catch (Exception ex) {
 	             ex.printStackTrace();
 	     }
 	     
 	     Packet250CustomPayload packet = new Packet250CustomPayload();
 	     packet.channel = "JetPack";
 	     packet.data = bos.toByteArray();
 	     packet.length = bos.size();
 	     
 	     Side side = FMLCommonHandler.instance().getEffectiveSide();
 	     if (side == Side.SERVER) {
 	             // We are on the server side.
 	             EntityPlayerMP player = (EntityPlayerMP) thePlayer;
 	             PacketDispatcher.sendPacketToAllPlayers(packet);
 	     } else if (side == Side.CLIENT) {
 	             // We are on the client side.
 	             EntityClientPlayerMP player = (EntityClientPlayerMP) thePlayer;
              PacketDispatcher.sendPacketToServer(packet);
 	     } else {
 	             // We are on the Bukkit server.
 	     }
			} 
		}
	

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		
	}
	@Override
	public EnumSet<TickType> ticks() {
		
		return EnumSet.of(TickType.CLIENT);
	}

}