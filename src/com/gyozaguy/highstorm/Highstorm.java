package com.gyozaguy.highstorm;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Highstorm extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getServer().broadcastMessage("Warning! Highstorms active!");
	}
	
	@Override
	public void onDisable() {
		// TODO
	}
}