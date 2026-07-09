/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.cache;

import baritone.api.cache.IWaypoint$Tag;
import baritone.api.utils.BetterBlockPos;

public interface IWaypoint {
    public String getName();

    public IWaypoint$Tag getTag();

    public long getCreationTimestamp();

    public BetterBlockPos getLocation();
}

