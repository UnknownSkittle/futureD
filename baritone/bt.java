/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  et
 */
package baritone;

import baritone.a;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.bs;
import baritone.fq;
import java.awt.Color;

final class bt
implements AbstractGameEventListener {
    private /* synthetic */ bs a;

    bt(bs bs2) {
        this.a = bs2;
    }

    @Override
    public final void onRenderPass(RenderEvent object) {
        if (!((Boolean)baritone.a.a().renderSelectionCorners.value).booleanValue() || bs.a(this.a) == null) {
            return;
        }
        object = (Color)baritone.a.a().colorSelectionPos1.value;
        float f2 = ((Float)baritone.a.a().selectionOpacity.value).floatValue();
        float f3 = ((Float)baritone.a.a().selectionLineWidth.value).floatValue();
        boolean bl2 = (Boolean)baritone.a.a().renderSelectionIgnoreDepth.value;
        fq.a((Color)object, f2, f3, bl2);
        fq.a(new bhb((et)bs.a(this.a), bs.a(this.a).a(1, 1, 1)));
        fq.a(bl2);
    }
}

