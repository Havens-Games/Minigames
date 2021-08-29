package net.whg.minigames.framework.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import net.whg.minigames.framework.Minigame;

/**
 * Called when a minigame instance has started and the arena has finished being
 * built.
 */
public class MinigameReadyEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private final Minigame minigame;

    /**
     * Creates a new MinigameReadyEvent.
     * 
     * @param minigame - The minigame that is ready.
     */
    public MinigameReadyEvent(Minigame minigame) {
        this.minigame = minigame;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return getHandlerList();
    }

    /**
     * Gets the minigame involved in this event.
     * 
     * @return The minigame.
     */
    public Minigame getMinigame() {
        return minigame;
    }
}
