package tpawithgui.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tpawithgui.Main;

public class admin implements CommandExecutor {

    Main plugin;

    public admin(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length == 1) {
            switch (args[0]) {
                case "print":
                    plugin.data.printList(sender);
                    break;
            }
        }else if(args.length == 2){
            switch (args[0]) {
                case "delete":
                    plugin.data.cancelRequest(Bukkit.getPlayer(sender.getName()));
                    break;
            }
        } else if(args.length == 3){
            switch (args[0]) {
                case "add":
                    plugin.data.addRequest(Bukkit.getPlayer(args[1]), Bukkit.getPlayer(args[2]));
                    break;
            }
        }
        return true;
    }
}
