package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.Potato;


import java.util.ArrayList;

public class God_Potato implements Listener
{
	ItemStack god = new ItemStack(Material.POTATO);
   ItemMeta meta = god.getItemMeta();

	/**
	 * creates a god potato
	 */
   public void goditem(){
   ArrayList<String> lore = new ArrayList<>();
   lore.add("new item");
   god.setItemMeta(meta);
	   ShapedRecipe r = new ShapedRecipe(god);
	   r.shape("###","#$#","###");
	   r.setIngredient('#', Material.DIAMOND);
	   r.setIngredient('$', Material.POTATO);
	   Bukkit.addRecipe(r);


   }
}
