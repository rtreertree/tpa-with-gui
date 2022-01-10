package tpawithgui.system;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tpawithgui.Main;

import java.util.HashMap;
import java.util.Map;

public class dataHandler {

    Main plugin;
    public HashMap<Player, Player> inRequests;

    public void addRequest(Player sender, Player receiver){
        this.inRequests.put(sender, receiver);
    }

    public void cancelRequest(Player sender){
        this.inRequests.remove(sender);
    }

    public void printList(CommandSender sender){
        for (Map.Entry<Player, Player> inRequest : this.inRequests.entrySet()){
            sender.sendMessage(ChatColor.YELLOW + "Sender : " + inRequest.getKey() + "Receiver : " + inRequest.getValue());
        }
    }

    //on create class
    public dataHandler(Main plugin){
        this.plugin = plugin;
        this.inRequests = new HashMap<Player, Player>();
    }

}
