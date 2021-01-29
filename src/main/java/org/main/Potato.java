package org.main;

import org.commands.about;
import org.event.FoodEAting;
import org.event.join;
import org.items.Custom_carot;
import org.items.God_Potato;
import org.items.Super_Potato;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Potato extends SimplePlugin {
	@Override
	protected void onPluginStart() {
		Common.log("Potato plugin started by Person");
		Super_Potato po = new Super_Potato();
		God_Potato go = new God_Potato();
		Custom_carot co = new Custom_carot();
		registerEvents(new join());
		po.potatositem();
		go.goditem();
		co.customcarot();
		registerEvents(new FoodEAting());
		registerCommand(new about());
	}

}
