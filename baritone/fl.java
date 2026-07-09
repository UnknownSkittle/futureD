/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fl
implements Helper {
    final IPlayerContext a;
    boolean a;

    fl(IPlayerContext iPlayerContext) {
        this.a = iPlayerContext;
    }

    public final void a() {
        if (this.a.player() != null && this.a) {
            if (!this.a.playerController().hasBrokenBlock()) {
                this.a.playerController().setHittingBlock(true);
            }
            this.a.playerController().resetBlockRemoving();
            this.a = false;
        }
    }
}

