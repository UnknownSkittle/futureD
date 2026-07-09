/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.event.events.TickEvent;
import baritone.api.event.events.TickEvent$Type;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.fv;

final class fw
implements AbstractGameEventListener {
    private /* synthetic */ fv a;

    fw(fv fv2) {
        this.a = fv2;
    }

    @Override
    public final void onTick(TickEvent tickEvent) {
        if (tickEvent.getType() == TickEvent$Type.IN) {
            fv.a(this.a);
        }
    }
}

