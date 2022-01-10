package tpawithgui.system;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import tpawithgui.Main;

import java.util.HashMap;

public class dataHandler {

    Main plugin;
    public HashMap<Player, Player> inRequests;

    void addRequest(Player sender, Player receiver){
        this.inRequests.put(sender, receiver);
    }

    void cancelRequest(String sender, String receiver){
        if(this.inRequests.containsKey(sender) == true){
            if(true){

            }
        }
    }

    //on create class
    public dataHandler(Main plugin){
        this.plugin = plugin;
        this.inRequests = new HashMap<Player, Player>();
    }

}
