package me.wyatt.BPick.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.wyatt.BPick.Main;

public class ChatPlayer implements CommandExecutor {
	@SuppressWarnings("unused")
	private Main plugin;
	public ChatPlayer(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("chatplayer").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String[] split = args;
		if (!(sender instanceof Player)) {
			sender.sendMessage("You gotta be a player to use the Chat Player command!");
			return true;
		}
		
		Player player = (Player) sender;
		if (player.hasPermission("chatplayer.use")) {
			String playerToChatName = split[1];
			String messageToChat = split[2];
			Player playertochat = sender.getServer().getPlayer(playerToChatName);
			player.sendMessage("You chatted for someone!");
			playertochat.chat(messageToChat);
			return true;
		}else {
			player.sendMessage("You don't have permission to run this command!");
		}
		return false;
	}
}
