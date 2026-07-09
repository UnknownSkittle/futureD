/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.event.events.type;

import baritone.api.event.events.type.ICancellable;

public class Cancellable
implements ICancellable {
    private boolean cancelled;

    @Override
    public final void cancel() {
        this.cancelled = true;
    }

    @Override
    public final boolean isCancelled() {
        return this.cancelled;
    }
}

