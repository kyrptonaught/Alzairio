package com.kyrptonaught.Alzairio.common;

import java.io.IOException;
import java.net.MalformedURLException;

import com.kyrptonaught.Alzairio.common.Proxys.ClientProxyAlzairio;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class AlzConnectionHandler implements IConnectionHandler {

	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler,INetworkManager manager) {
	try {
		if (UpdateChecker.isUpdateAvailable()){
			ClientProxyAlzairio.printMessageToPlayer("["+EnumChatFormatting.AQUA+"Alzairio]"+EnumChatFormatting.RESET+"An update is available for this mod. Check the Forum page for more info");	
		}
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public String connectionReceived(NetLoginHandler netHandler,
		INetworkManager manager) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void connectionOpened(NetHandler netClientHandler, String server,
		int port, INetworkManager manager) {
	// TODO Auto-generated method stub

}

@Override
public void connectionOpened(NetHandler netClientHandler,
		MinecraftServer server, INetworkManager manager) {
	// TODO Auto-generated method stub

}

@Override
public void connectionClosed(INetworkManager manager) {
	// TODO Auto-generated method stub

}

@Override
public void clientLoggedIn(NetHandler clientHandler,
		INetworkManager manager, Packet1Login login) {
	// TODO Auto-generated method stub

}

}
