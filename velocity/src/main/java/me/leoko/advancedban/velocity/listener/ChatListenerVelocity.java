package me.leoko.advancedban.velocity.listener;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.proxy.Player;
import me.leoko.advancedban.Universal;

public class ChatListenerVelocity {

    @Subscribe(order = PostOrder.FIRST)
    public void onChat(PlayerChatEvent event) {
        if (Universal.get().getMethods().callChat(event.getPlayer())) {
            event.setResult(PlayerChatEvent.ChatResult.denied());
        }
    }

    @Subscribe(order = PostOrder.FIRST)
    public void onCommand(CommandExecuteEvent event) {
        if (event.getCommandSource() instanceof Player) {
            if (Universal.get().getMethods().callCMD(event.getCommandSource(), event.getCommand())) {
                event.setResult(CommandExecuteEvent.CommandResult.denied());
            }
        }
    }

}


