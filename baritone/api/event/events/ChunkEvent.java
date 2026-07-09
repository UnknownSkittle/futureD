/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events;

import baritone.api.event.events.ChunkEvent$Type;
import baritone.api.event.events.type.EventState;

public final class ChunkEvent {
    private final EventState state;
    private final ChunkEvent$Type type;
    private final int x;
    private final int z;

    public ChunkEvent(EventState eventState, ChunkEvent$Type chunkEvent$Type, int n2, int n3) {
        this.state = eventState;
        this.type = chunkEvent$Type;
        this.x = n2;
        this.z = n3;
    }

    public final EventState getState() {
        return this.state;
    }

    public final ChunkEvent$Type getType() {
        return this.type;
    }

    public final int getX() {
        return this.x;
    }

    public final int getZ() {
        return this.z;
    }
}

