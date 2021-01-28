package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.plugin.SimplePlugin;

public class about extends SimpleCommand{

	public about() {
		super("about");
	}

	@Override
	protected void onCommand() {
		checkConsole();
		Player player = getPlayer();
		player.sendMessage("Potato plugin by person");
		if(!Bukkit.getPlayer("potato19348").isOnline()){Bukkit.broadcastMessage("Potato is a noob"); }
	}
}
