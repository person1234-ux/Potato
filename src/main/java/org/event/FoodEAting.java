/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.event;

import org.bukkit.Bukkit;
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

import java.util.Random;

public class FoodEAting implements Listener {
	Random rn = new Random();
	@EventHandler
	public void carroneating(PlayerItemConsumeEvent event){
		final ItemStack items =  event.getItem();
		System.out.println(items.getItemMeta().getLocalizedName());
		Player player = event.getPlayer();
		final int randomnumber = rn.nextInt(2);
		if (items.getItemMeta().getLocalizedName().equals("CUSTOM_CARROT")) {
			if (randomnumber == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 3));
			}
			else {
				Bukkit.broadcastMessage(player.getName() + " was unlucky and got nausa from the golden carrot");
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 6000,3,true, false));
			}


		}
		}
	@EventHandler public void Godpotatoeating(PlayerItemConsumeEvent event)	{
		final ItemStack item = event.getItem();
		Player player = event.getPlayer();
		if (item.getItemMeta().getLocalizedName().equals("GOD_POTATO")){
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 12000, 3));
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION , 12000, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 12000, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 12000,3));
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000,3));


		}
	}

}
