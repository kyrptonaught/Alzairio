package Alzairio.common.Handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.EnumSet;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.packet.Packet250CustomPayload;

import org.lwjgl.input.Keyboard;

import Alzairio.common.Block.BlockWall;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;

public class FakeWallKeyHandler extends KeyHandler {
	
	static KeyBinding mimicID = new KeyBinding("FakeWall Texture +", Keyboard.KEY_M);
	public FakeWallKeyHandler() {
        //the first value is an array of KeyBindings, the second is whether or not the call 
        //keyDown should repeat as long as the key is down
        super(new KeyBinding[]{mimicID}, new boolean[]{false});
}
	@Override
	public String getLabel() {
		
		return "FakeWallTexture++";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,
			boolean tickEnd, boolean isRepeat) {
		EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
		 Alzairio.common.Block.BlockWall.Mimic++;
		 if (BlockWall.Mimic >256){
			 BlockWall.Mimic = 0;
		 }
		 int adjustMimic = Alzairio.common.Block.BlockWall.Mimic++;
	     
	     ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
	     DataOutputStream outputStream = new DataOutputStream(bos);
	     try {
	         
	    	     outputStream.writeInt(adjustMimic);
	            
	     } catch (Exception ex) {
	             ex.printStackTrace();
	     }
	     
	     Packet250CustomPayload packet = new Packet250CustomPayload();
	     packet.channel = "Alzairio";
	     packet.data = bos.toByteArray();
	     packet.length = bos.size();
	     
	     Side side = FMLCommonHandler.instance().getEffectiveSide();
	     if (side == Side.SERVER) {
	             // We are on the server side.
	             EntityPlayerMP player = (EntityPlayerMP) thePlayer;
	            PacketDispatcher.sendPacketToServer(packet);
	     } else if (side == Side.CLIENT) {
	             // We are on the client side.
	             EntityClientPlayerMP player = (EntityClientPlayerMP) thePlayer;
	             PacketDispatcher.sendPacketToAllPlayers(packet);
	             PacketDispatcher.sendPacketToServer(packet);
	     } else {
	             // We are on the Bukkit server.
	     
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
	