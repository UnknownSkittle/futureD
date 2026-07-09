/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  hb
 *  ht
 */
package net.impactclient;

import me.zero.alpine.event.EventState;
import net.impactclient.1l;
import net.impactclient.4t;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 31<T extends hb>
implements Runnable {
    public static final boolean \u2004;
    private final ht<T> 0;
    private final T 1;

    /*
     * Enabled aggressive block sorting
     */
    public 31(ht<T> ht2, T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block2;
                this.0 = ht2;
                if (bl2 || bl2) break block2;
                this.1 = t2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void run() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) return;
        1l l2 = new 1l(this.0, EventState.PRE);
        if (bl2 || bl2) return;
        4t.1.post(l2);
        if (bl2 || bl2) return;
        if (l2.isCancelled()) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        this.0.a(this.1);
        if (bl2 || bl2) return;
        4t.1.post(new 1l(this.0, EventState.POST));
        if (!bl2 && !bl2) return;
    }
}

