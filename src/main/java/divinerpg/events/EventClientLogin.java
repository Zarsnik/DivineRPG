package divinerpg.events;

import divinerpg.config.*;
import divinerpg.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.text.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.server.command.*;

public class EventClientLogin {

    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent evt){
        PlayerEntity player = evt.getPlayer();
        if (!player.getCommandSenderWorld().isClientSide) {

            //Send welcome messages
            if(Config.welcomeMessage.get()) {
            //TODO - colour
                if (Utils.isDeveloperName(player.getUUID())) {
                    TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.developer", player.getDisplayName());
                    message.getStyle().withColor(Color.fromLegacyFormat(TextFormatting.DARK_RED));
                    player.sendMessage(message, player.getUUID());
                } else if (Utils.isTesterName(player.getUUID())) {
                    TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.tester", player.getDisplayName());
                    message.getStyle().withColor(Color.fromLegacyFormat(TextFormatting.BLUE));
                    player.sendMessage(message, player.getUUID());
                } else if (Utils.isPatreon(player.getUUID())) {
                    TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.patreon", player.getDisplayName());
                    message.getStyle().withColor(Color.fromLegacyFormat(TextFormatting.GOLD));
                    player.sendMessage(message, player.getUUID());
                } else if (Utils.isFriend(player.getUUID())) {
                    TextComponent message = TextComponentHelper.createComponentTranslation(player, "message.friend", player.getDisplayName());
                    message.getStyle().withColor(Color.fromLegacyFormat(TextFormatting.LIGHT_PURPLE));
                    player.sendMessage(message, player.getUUID());
                }
            }
        }
    }

}
