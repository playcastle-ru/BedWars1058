package com.andrei1058.bedwars.support.leaderheads;

import com.andrei1058.bedwars.BedWars;
import com.andrei1058.bedwars.stats.StatsManager;
import me.robin.leaderheads.datacollectors.OnlineDataCollector;
import me.robin.leaderheads.objects.BoardType;
import org.bukkit.entity.Player;

import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class BedWarsBedsDestroyed extends OnlineDataCollector {

    public BedWarsBedsDestroyed() {
        super("bw-beds", BedWars.plugin.getName(), BoardType.DEFAULT, "&8BedWars Beds Destroyed", "openbwbeds", Arrays.asList(null, null, "&e{amount} beds destroyed", null));
    }

    @Override
    public Double getScore(Player player) {
        return (double) StatsManager.getStatsCache().getPlayerBedsDestroyed(player.getUniqueId());
    }
}
