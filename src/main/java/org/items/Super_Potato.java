package org.items;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.main.Potato;

import java.util.ArrayList;

public class Super_Potato implements Listener {
	Plugin plugin = Potato.getPlugin(Potato.class);

	ItemStack item = new ItemStack(Material.POTATO);
	ItemMeta meta = item.getItemMeta();

	/**
	 * this creates a custom potato which increases the players speed along with has knockback.
	 * The potato also has curse of vanishing
	 *
	 */
	public void potatositem() {
		ArrayList<String> lore = new ArrayList<>();
		lore.add("I don't need to walk");
		lore.add("who loves the speed");
		meta.setLore(lore);
		meta.setDisplayName("Super Potato");
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("GENERIC_SPEED", 1, AttributeModifier.Operation.ADD_NUMBER));
		meta.addEnchant(Enchantment.KNOCKBACK, 5, true);
		meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		item.setItemMeta(meta);


		@SuppressWarnings("deprecation")
		ShapedRecipe s = new ShapedRecipe(item);
		s.shape("&&&","&#&","&&&");
		s.setIngredient('#', Material.POTATO);
		s.setIngredient('&', Material.GOLD_BLOCK);
		plugin.getServer().addRecipe(s);

	}
	}


