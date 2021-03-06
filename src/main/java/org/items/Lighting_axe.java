/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.items;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.main.Potato;

import java.util.ArrayList;

public class Lighting_axe implements Listener {
	 Plugin plugin = Potato.getPlugin(Potato.class);
	private ItemStack items = new ItemStack(Material.DIAMOND_AXE);
	private ItemMeta meta = items.getItemMeta();
	private final NamespacedKey itemskey = new NamespacedKey(plugin, "items_key");

	public void axe(){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Lightning Axe");
		meta.setLore(lore);
		meta.setDisplayName("Lightning");
		meta.setLocalizedName("LIGHTNING_AXE");

		items.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(itemskey, items);
		r.shape("%%%","%#%","%%%");
		r.setIngredient('#',Material.DIAMOND_AXE);
		r.setIngredient('%',Material.DIAMOND_BLOCK);
		Bukkit.addRecipe(r);

	}

	public void getItem(Player player){
		ArrayList<String> lore = new ArrayList<>();
		lore.add("Lightning Axe");
		meta.setLore(lore);
		meta.setDisplayName("Lightning");
		meta.setLocalizedName("LIGHTNING_AXE");
		items.setItemMeta(meta);
		player.getInventory().addItem(items);



	}

}
