package me.wyatt.BPick;

import org.bukkit.plugin.java.JavaPlugin;

import me.wyatt.BPick.commands.TestCommand;
import me.wyatt.BPick.commands.ChatPlayer;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		new TestCommand(this);
		new ChatPlayer(this);
	}
}
