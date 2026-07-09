/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.process.IBaritoneProcess;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class fk
implements IBaritoneProcess,
Helper {
    public final a a;
    protected final IPlayerContext a;

    public fk(a a2) {
        this.a = a2;
        this.a = a2.getPlayerContext();
        a2.a.registerProcess(this);
    }

    @Override
    public boolean isTemporary() {
        return false;
    }
}

