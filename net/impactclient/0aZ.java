/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import me.zero.alpine.event.Cancellable;
import me.zero.alpine.event.EventState;
import net.impactclient.3Z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0aZ
extends Cancellable {
    public static final boolean \u2007\u2005\u200c\u2000\u200d\u200e\u2003\u200a\u2004;
    public final EventState 1;
    public final 3Z 0;

    public 0aZ() {
        boolean bl2 = \u2007\u2005\u200c\u2000\u200d\u200e\u2003\u200a\u2004;
        this(EventState.POST, null);
    }

    public 0aZ(3Z z2) {
        boolean bl2 = \u2007\u2005\u200c\u2000\u200d\u200e\u2003\u200a\u2004;
        this(EventState.PRE, z2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private 0aZ(EventState eventState, 3Z z2) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2005\u200c\u2000\u200d\u200e\u2003\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.1 = eventState;
                if (bl2 || bl2) break block2;
                this.0 = z2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

