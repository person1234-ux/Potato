package org.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.mineacademy.fo.Common;

public class join implements Listener {
	@EventHandler
	public void potatojoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("");
		Common.tell(player, "Welcome to the server!");
	}
}
