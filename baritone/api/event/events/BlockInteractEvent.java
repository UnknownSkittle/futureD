/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone.api.event.events;

import baritone.api.event.events.BlockInteractEvent$Type;

public final class BlockInteractEvent {
    private final et pos;
    private final BlockInteractEvent$Type type;

    public BlockInteractEvent(et et2, BlockInteractEvent$Type blockInteractEvent$Type) {
        this.pos = et2;
        this.type = blockInteractEvent$Type;
    }

    public final et getPos() {
        return this.pos;
    }

    public final BlockInteractEvent$Type getType() {
        return this.type;
    }
}

