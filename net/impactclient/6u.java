/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import net.impactclient.0rB$1f;
import net.impactclient.3r;
import net.impactclient.6K;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6u
extends 6K {
    private String 0;
    public static final boolean \u200f\u2003\u2003\u2003\u2006\u2005\u2005\u2004\u2005;
    private 3r 1;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2, boolean bl2, float f2, float f3, float f4) {
        block3: {
            block2: {
                boolean bl3 = \u200f\u2003\u2003\u2003\u2006\u2005\u2005\u2004\u2005;
                if (bl3 || bl3) break block2;
                this.1.0(f4, bl2);
                if (bl3 || bl3) break block2;
                bip2.a(this.0, 4.0f + this.1.1 * 2.0f, 1.0f, (int)((long)-1909736879 ^ (long)1909736878));
                if (bl3 || bl3) break block2;
                super.0(bip2, bl2, f2, f3, f4);
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 6u(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2003\u2003\u2003\u2006\u2005\u2005\u2004\u2005;
                if (bl2 || bl2) break block2;
                this.0 = string;
                if (bl2 || bl2) break block2;
                this.1 = new 3r();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 6u() {
        boolean bl2 = \u200f\u2003\u2003\u2003\u2006\u2005\u2005\u2004\u2005;
        this(0rB$1f.XNZw("", -1230031112));
    }

    @Override
    public final float 1(bip bip2) {
        boolean bl2 = \u200f\u2003\u2003\u2003\u2006\u2005\u2005\u2004\u2005;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return (int)((long)1670536672 ^ (long)1670536676) + bip2.a(this.0) + (int)((long)-747025203 ^ (long)-747025209);
    }
}

