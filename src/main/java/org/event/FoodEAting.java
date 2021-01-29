/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.event;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.items.Custom_carot;
import org.main.Potato;

public class FoodEAting implements Listener {
	@EventHandler
	public void carroneating(PlayerItemConsumeEvent event){
		final ItemStack items =  event.getItem();
		System.out.println(items.getItemMeta().getLocalizedName());
		Player player = event.getPlayer();
		if (items.getItemMeta().getLocalizedName().equals("CUSTOM_CARROT")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 3000, 1));

		}
		}
	@EventHandler public void Godpotatoeating(PlayerItemConsumeEvent event)	{
		final ItemStack item = event.getItem();
		Player player = event.getPlayer();
		if (item.getItemMeta().getLocalizedName().equals("GOD_POTATO")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600000, 3));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION , 600000, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 600000, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 600000,5));



		}
	}

}
