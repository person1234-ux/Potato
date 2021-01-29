/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Custom_carot implements Listener {
	ItemStack customcarto = new ItemStack(Material.GOLDEN_CARROT);
	ItemMeta metas = customcarto.getItemMeta();
	public void customcarot(){
		ArrayList<String> lores = new ArrayList<>();
		lores.add("Everyone favorite carrot");
		metas.setLore(lores);
		metas.setDisplayName("Person favorite carrot");
		metas.addAttributeModifier(Attribute.GENERIC_KNOCKBACK_RESISTANCE, new AttributeModifier("KNOCKBACK", .2f,AttributeModifier.Operation.ADD_NUMBER ));
		metas.setLocalizedName("CUSTOM_CARROT");
		metas.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		customcarto.setItemMeta(metas);
		@SuppressWarnings("")
		ShapedRecipe s = new ShapedRecipe(customcarto);
		s.shape("^^^","^$^","^^^");
		s.setIngredient('^', Material.GOLD_BLOCK);
		s.setIngredient('$', Material.GOLDEN_CARROT);
		Bukkit.addRecipe(s);



	}
}
