/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.cache;

import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IContainerMemory;
import baritone.api.cache.IWaypointCollection;

public interface IWorldData {
    public ICachedWorld getCachedWorld();

    public IWaypointCollection getWaypoints();

    public IContainerMemory getContainerMemory();
}

