/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.api.process.PathingCommandType;
import baritone.ar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class as
implements IBaritoneProcess {
    private /* synthetic */ boolean[] a;
    private /* synthetic */ ar a;

    as(ar ar2, boolean[] blArray) {
        this.a = ar2;
        this.a = blArray;
    }

    @Override
    public final boolean isActive() {
        return this.a[0];
    }

    @Override
    public final PathingCommand onTick(boolean bl2, boolean bl3) {
        return new PathingCommand(null, PathingCommandType.REQUEST_PAUSE);
    }

    @Override
    public final boolean isTemporary() {
        return true;
    }

    @Override
    public final void onLostControl() {
    }

    @Override
    public final double priority() {
        return 0.0;
    }

    @Override
    public final String displayName0() {
        return "Pause/Resume Commands";
    }
}

