package tpawithgui;

import org.bukkit.plugin.java.JavaPlugin;
import tpawithgui.commands.admin;
import tpawithgui.commands.tpa;
import tpawithgui.system.dataHandler;

public final class Main extends JavaPlugin {

    public dataHandler data;

    @Override
    public void onEnable() {
        this.data = new dataHandler(this);
        this.getCommand("admin").setExecutor(new admin(this));
        this.getCommand("tpa").setExecutor(new tpa(this));
        System.out.println("======= [ Plugin tpa is enable ] =======");
    }

    @Override
    public void onDisable() {
        System.out.println("======= [ Plugin tpa is disable ] =======");
    }
}
