package org.main;

import org.commands.about;
import org.event.join;
import org.items.God_Potato;
import org.items.Super_Potato;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class Potato extends SimplePlugin {
	@Override
	protected void onPluginStart() {
		Common.log("Potato plugin started");
		Super_Potato po = new Super_Potato();
		God_Potato go = new God_Potato();
		registerEvents(new join());
		po.potatositem();
		go.goditem();
registerCommand(new about());
	}

}
