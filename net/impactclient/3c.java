/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  kq
 *  qe
 */
package net.impactclient;

import net.impactclient.3Z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 3c {
    private final long 1;
    final 3Z 2;
    final qe 0;
    public static final boolean \u200b\u2006\u200c\u200e\u2002\u2007\u2002\u200c\u2008;

    /*
     * Enabled aggressive block sorting
     */
    private 3c(kq kq2) {
        block3: {
            block2: {
                boolean bl2 = \u200b\u2006\u200c\u200e\u2002\u2007\u2002\u200c\u2008;
                if (bl2 || bl2) break block2;
                this.0 = kq2.a();
                if (bl2 || bl2) break block2;
                this.2 = new 3Z(kq2.c(), kq2.d(), kq2.e());
                if (bl2 || bl2) break block2;
                this.1 = System.currentTimeMillis();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    final double 0() {
        boolean bl2 = \u200b\u2006\u200c\u200e\u2002\u2007\u2002\u200c\u2008;
        if (bl2 || bl2) {
            return 0.0;
        }
        return (double)(System.currentTimeMillis() - this.1) / 1000.0;
    }

    /* synthetic */ 3c(kq kq2, byte by2) {
        boolean bl2 = \u200b\u2006\u200c\u200e\u2002\u2007\u2002\u200c\u2008;
        this(kq2);
    }
}

