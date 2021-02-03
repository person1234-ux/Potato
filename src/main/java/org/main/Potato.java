package org.main;

import org.commands.about;
import org.event.AXE;
import org.event.FoodEAting;
import org.event.join;
import org.items.*;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Potato extends SimplePlugin  {

	@Override
	protected void onPluginStart() {
		Common.log("Potato plugin started by Person");
		Evanmcgaming_head ph = new Evanmcgaming_head();
		Super_Potato po = new Super_Potato();
		God_Potato go = new God_Potato();
		Custom_carot co = new Custom_carot();
		Special_soup so = new Special_soup();
		Lighting_axe li = new Lighting_axe();
		registerEvents(new join());
		registerEvents(new AXE());
		po.potatositem();
		go.goditem();
		co.customcarot();
		li.axe();
		registerEvents(new FoodEAting());
		registerCommand(new about());
		so.soup();
//		ph.Evanskull();

	}





}
