/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rY;
import net.impactclient.9P;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class 0rw<T>
extends 0rY<T> {
    private T 0;
    public static final boolean \u200d\u2005\u2007\u2003\u2006\u200f\u2009\u200c\u2001;
    private /* synthetic */ 9P 1;

    0rw(9P p2, String string, String string2, String string3) {
        boolean bl2 = \u200d\u2005\u2007\u2003\u2006\u200f\u2009\u200c\u2001;
        this.1 = p2;
        super(string, string2, string3);
    }

    @Override
    public T 1() {
        boolean bl2 = \u200d\u2005\u2007\u2003\u2006\u200f\u2009\u200c\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return this.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u200d\u2005\u2007\u2003\u2006\u200f\u2009\u200c\u2001;
                if (bl2 || bl2) break block2;
                this.0 = t2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

