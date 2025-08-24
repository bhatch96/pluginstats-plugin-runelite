package com.example;

import com.pluginstats.PluginStatsPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginStatsTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PluginStatsPlugin.class);
		RuneLite.main(args);
	}
}