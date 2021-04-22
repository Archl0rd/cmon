package svex.tgy;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tgy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("modop").setExecutor(new daClass());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
