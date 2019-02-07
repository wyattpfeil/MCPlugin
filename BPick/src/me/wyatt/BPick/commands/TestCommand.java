package me.wyatt.BPick.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.wyatt.BPick.Main;

public class TestCommand implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public TestCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("test").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You gotta be a player to use the test command!");
			return true;
		}
		
		Player player = (Player) sender;
		if (player.hasPermission("TestCmd.use")) {
			player.sendMessage("You ran the test command!");
			return true;
		}else {
			player.sendMessage("You don't have permission to run this command!");
		}
		return false;
	}
}
