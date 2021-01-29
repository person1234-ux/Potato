
package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.main.Potato;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class God_Potato implements Listener {
	HashSet<UUID> gods = new HashSet<>();
	ItemStack god = new ItemStack(Material.POTATO);
   ItemMeta meta = god.getItemMeta();




	/**
	 * creates a god potato
	 */
   public void goditem(){

   ArrayList<String> lore = new ArrayList<>();
   lore.add("EAT ME");
   meta.setLore(lore);
   meta.setDisplayName("GOD_POTATO");
   meta.setLocalizedName("GOD_POTATO");
   god.setItemMeta(meta);

	   @SuppressWarnings("")
	   ShapedRecipe r = new ShapedRecipe(god);
	   r.shape("###","#$#","###");
	   r.setIngredient('#', Material.DIAMOND_BLOCK);
	   r.setIngredient('$', Material.POTATO);

	   Bukkit.addRecipe(r);


   }





}

