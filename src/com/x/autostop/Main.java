package com.x.autostop;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getScheduler().scheduleSyncDelayedTask(this, () -> Bukkit.shutdown(), 1);
	}
	
	@Override
	public void onDisable() {
		getFile().delete();
	}
}
