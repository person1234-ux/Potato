package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.util.Objects;

public class about extends SimpleCommand {

	public about() {
		super("about");
	}

	@Override
	protected void onCommand() {
		if (sender instanceof Player) {
			Player player = getPlayer();
			player.sendMessage("Potato plugin by person");
			if (Bukkit.getPlayer("person1") == null) {
				Bukkit.broadcastMessage("Plugin was made by person please see " + "https://github.com/person1234-ux/Potato");
			} else {
				Bukkit.getPlayer("person1").sendMessage("Hello");
			}
		} else {
			System.out.println("Potato plugin");
			System.out.println("Plugin was made by person please see" + " https://github.com/person1234-ux/Potato");
		}
	}
}


