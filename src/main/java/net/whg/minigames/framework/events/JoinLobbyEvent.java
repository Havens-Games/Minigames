package net.whg.minigames.framework.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class JoinLobbyEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private final Player player;
    private final String minigame;
    private boolean cancelled = false;

    /**
     * Creates a new JoinMinigameEvent.
     * 
     * @param player   - The player that is attempting to join the minigame.
     * @param minigame - The name of the minigame that is being joined.
     */
    public JoinLobbyEvent(Player player, String minigame) {
        this.player = player;
        this.minigame = minigame;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return getHandlerList();
    }

    /**
     * Gets the player involved in this event.
     * 
     * @return The player.
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the minigame that is involved in this event.
     * 
     * @return The minigame.
     */
    public String getMinigame() {
        return minigame;
    }
}
