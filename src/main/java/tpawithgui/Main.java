package tpawithgui;

import org.bukkit.plugin.java.JavaPlugin;
import tpawithgui.commands.admin;
import tpawithgui.system.dataHandler;

public final class Main extends JavaPlugin {

    public dataHandler data;

    @Override
    public void onEnable() {
        this.data = new dataHandler(this);
        this.getCommand("admin").setExecutor(new admin(this));
        System.out.println("======= [ Plugin tpa is enable ] =======");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
