/*
 * Copyright (c) 2021. This is open source and provided by person
 */

package org.event;

import javafx.scene.effect.Lighting;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.mineacademy.fo.Common;

public class AXE implements Listener {
	@EventHandler
	public void customaxe(EntityDamageByEntityEvent event) {
		if (event.getDamager() instanceof Player) {
			Player player = (Player) event.getDamager();
			try {if (player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().equals("LIGHTNING_AXE")) {


				event.getEntity().getWorld().strikeLightningEffect(event.getEntity().getLocation());
				player.setLastDamage(0); // cancels the event



				Common.log("k");
				

			} }catch (NullPointerException e){
				Common.log("Cought");
			}

		}
	}
}
