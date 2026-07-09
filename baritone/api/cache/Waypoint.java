/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.cache;

import baritone.api.cache.IWaypoint;
import baritone.api.cache.IWaypoint$Tag;
import baritone.api.utils.BetterBlockPos;
import java.util.Date;

public class Waypoint
implements IWaypoint {
    private final String name;
    private final IWaypoint$Tag tag;
    private final long creationTimestamp;
    private final BetterBlockPos location;

    public Waypoint(String string, IWaypoint$Tag iWaypoint$Tag, BetterBlockPos betterBlockPos) {
        this(string, iWaypoint$Tag, betterBlockPos, System.currentTimeMillis());
    }

    public Waypoint(String string, IWaypoint$Tag iWaypoint$Tag, BetterBlockPos betterBlockPos, long l2) {
        this.name = string;
        this.tag = iWaypoint$Tag;
        this.location = betterBlockPos;
        this.creationTimestamp = l2;
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.tag.hashCode() ^ this.location.hashCode() ^ Long.hashCode(this.creationTimestamp);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public IWaypoint$Tag getTag() {
        return this.tag;
    }

    @Override
    public long getCreationTimestamp() {
        return this.creationTimestamp;
    }

    @Override
    public BetterBlockPos getLocation() {
        return this.location;
    }

    public String toString() {
        return String.format("%s %s %s", this.name, BetterBlockPos.from(this.location).toString(), new Date(this.creationTimestamp).toString());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof IWaypoint)) {
            return false;
        }
        return this.name.equals((object = (IWaypoint)object).getName()) && this.tag == object.getTag() && this.location.equals((Object)object.getLocation());
    }
}

