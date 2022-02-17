package net.labymod.serverapi.bukkit.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.labymod.serverapi.Addon;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

/**
 * Class created by qlow | Jan
 */
@AllArgsConstructor
@Getter
public class LabyModPlayerJoinEvent extends Event {

    @Getter
    private final static HandlerList handlerList = new HandlerList();

    private final Player player;
    private final String modVersion;
    private final boolean chunkCachingEnabled;
    private final int chunkCachingVersion;
    private final List<Addon> addons;

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

}
