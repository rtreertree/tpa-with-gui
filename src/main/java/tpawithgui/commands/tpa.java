package tpawithgui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tpawithgui.Main;

public class tpa implements CommandExecutor {

    Main plugin;

    public tpa(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        return false;
    }
}
