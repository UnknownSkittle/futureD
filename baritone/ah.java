/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.ag;
import baritone.api.IBaritone;
import baritone.api.command.datatypes.IDatatypeContext;

final class ah
implements IDatatypeContext {
    private /* synthetic */ ag a;

    private ah(ag ag2) {
        this.a = ag2;
    }

    @Override
    public final IBaritone getBaritone() {
        return ag.a(this.a).getBaritone();
    }

    /* synthetic */ ah(ag ag2, byte by2) {
        this(ag2);
    }
}

