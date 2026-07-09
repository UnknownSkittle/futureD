/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  et
 */
package baritone;

import baritone.a;
import baritone.api.Settings;
import baritone.api.event.events.RenderEvent;
import baritone.api.event.listener.AbstractGameEventListener;
import baritone.api.selection.ISelection;
import baritone.fh;
import baritone.fq;
import java.awt.Color;

public final class fi
implements AbstractGameEventListener,
fq {
    private final fh a;

    fi(a a2, fh fh2) {
        this.a = fh2;
        a2.getGameEventHandler().registerEventListener(this);
    }

    @Override
    public final void onRenderPass(RenderEvent iSelectionArray) {
        iSelectionArray = this.a.getSelections();
        float f2 = ((Float)((Settings)((Object)fi.a)).selectionOpacity.value).floatValue();
        boolean bl2 = (Boolean)((Settings)((Object)fi.a)).renderSelectionIgnoreDepth.value;
        float f3 = ((Float)((Settings)((Object)fi.a)).selectionLineWidth.value).floatValue();
        if (((Boolean)((Settings)((Object)fi.a)).renderSelection.value).booleanValue()) {
            int n2;
            fq.a((Color)((Settings)((Object)fi.a)).colorSelection.value, f2, f3, bl2);
            ISelection[] iSelectionArray2 = iSelectionArray;
            int n3 = iSelectionArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                fq.a(iSelectionArray2[n2].aabb(), 0.005);
            }
            if (((Boolean)((Settings)((Object)fi.a)).renderSelectionCorners.value).booleanValue()) {
                ISelection iSelection;
                fq.a((Color)((Settings)((Object)fi.a)).colorSelectionPos1.value, f2);
                iSelectionArray2 = iSelectionArray;
                n3 = iSelectionArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    iSelection = iSelectionArray2[n2];
                    fq.a(new bhb((et)iSelection.pos1(), iSelection.pos1().a(1, 1, 1)));
                }
                fq.a((Color)((Settings)((Object)fi.a)).colorSelectionPos2.value, f2);
                iSelectionArray2 = iSelectionArray;
                n3 = iSelectionArray.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    iSelection = iSelectionArray2[n2];
                    fq.a(new bhb((et)iSelection.pos2(), iSelection.pos2().a(1, 1, 1)));
                }
            }
            fq.a(bl2);
        }
    }
}

