package org.commands;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.awt.print.Book;
import java.util.ArrayList;
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
			ItemStack item = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta meta =(BookMeta) item.getItemMeta();
			ArrayList<String> lore = new ArrayList<>();
			Bukkit.broadcastMessage("Plugin was made by person1 please see " + "https://github.com/person1234-ux/Potato");;
			meta.setTitle("POTATO PLUGIN");
			meta.setAuthor("Person1");
			meta.setDisplayName("POTATO PlUGIN");
			meta.addPage("This is Potato plugin by person please see"+ "https://github.com/person1234-ux/Potato");
			meta.addEnchant(Enchantment.VANISHING_CURSE, 1,true);
			lore.add("By Person");
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

			item.setItemMeta(meta);
			player.getInventory().setItemInMainHand(item);

		} else {
			System.out.println("Potato plugin");
			System.out.println("Plugin was made by person1 please see" + " https://github.com/person1234-ux/Potato");
		}
	}
}


