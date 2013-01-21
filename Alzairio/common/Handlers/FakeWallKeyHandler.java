package Alzairio.common.Handlers;

import java.util.EnumSet;

import org.lwjgl.input.Keyboard;

import Alzairio.common.Block.BlockWall;

import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class FakeWallKeyHandler extends KeyHandler {
	
	static KeyBinding myBinding = new KeyBinding("FakeWall Texture +", Keyboard.KEY_M);
	public FakeWallKeyHandler() {
        //the first value is an array of KeyBindings, the second is whether or not the call 
        //keyDown should repeat as long as the key is down
        super(new KeyBinding[]{myBinding}, new boolean[]{false});
}
	@Override
	public String getLabel() {
		
		return "FakeWallTexture++";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,
			boolean tickEnd, boolean isRepeat) {
		BlockWall.Mimic++;
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
		
	}

	@Override
	public EnumSet<TickType> ticks() {
		// TODO Auto-generated method stub
		return EnumSet.of(TickType.CLIENT);
	}

}
