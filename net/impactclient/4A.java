/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bud
 */
package net.impactclient;

import me.zero.alpine.event.ICancellable;
import net.impactclient.4h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 4A
extends 4h
implements ICancellable {
    public static final boolean \u2005;
    private boolean 0;

    @Override
    public boolean isCancelled() {
        boolean bl2 = \u2005;
        if (bl2 || bl2) {
            return true;
        }
        return this.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void cancel() {
        block3: {
            block2: {
                boolean bl2 = \u2005;
                if (bl2 || bl2) break block2;
                this.0 = (int)((long)-898568205 ^ (long)-898568206);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 4A(bud bud2) {
        boolean bl2 = \u2005;
        super(bud2);
    }
}

