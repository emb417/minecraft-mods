package org.devoxx4kids.forge.mods;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
@SubscribeEvent
public void sendMessage(BreakEvent event)
{
	event
		.getPlayer()
		.addChatComponentMessage(
				new ChatComponentText(
						EnumChatFormatting.GOLD +
						(event.getPlayer().getDisplayNameString() +
						" broke a " +
						event.state.getBlock().getLocalizedName() +		
								" block! That's INSANE!")));
	}
}
