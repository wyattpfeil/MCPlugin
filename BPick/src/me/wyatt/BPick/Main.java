package me.wyatt.BPick;

import org.bukkit.plugin.java.JavaPlugin;

import me.wyatt.BPick.commands.TestCommand;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		new TestCommand(this);
	}
}