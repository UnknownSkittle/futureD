/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import net.impactclient.0v;
import net.impactclient.1A;
import net.impactclient.2b;
import net.impactclient.2w;
import net.impactclient.3r;
import net.impactclient.6K;
import net.impactclient.7f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6F<T extends 2b & 7f>
extends 6K {
    private 3r 1;
    private 3r 0;
    private final T 2;
    public static final boolean \u2004\u2006\u200d\u200d\u2005\u200f\u200b\u200a\u2001;

    /*
     * Enabled aggressive block sorting
     */
    public 6F(T t2) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2006\u200d\u200d\u2005\u200f\u200b\u200a\u2001;
                if (bl2 || bl2) break block2;
                this.2 = t2;
                if (bl2 || bl2) break block2;
                this.0 = new 3r();
                if (bl2 || bl2) break block2;
                this.1 = new 3r();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2, boolean bl2, float f2, float f3, float f4) {
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    bl3 = \u2004\u2006\u200d\u200d\u2005\u200f\u200b\u200a\u2001;
                    if (bl3 || bl3) break block2;
                    this.0.0(f4, bl2);
                    if (bl3 || bl3) break block2;
                    this.1.0(f4, ((7f)this.2).4());
                    if (bl3 || bl3) break block2;
                    int n2 = 2w.0((int)((long)1749444641 ^ (long)-1749444642), (int)((long)-1281887309 ^ (long)1279088921), this.1.1);
                    if (bl3 || bl3) break block2;
                    bip2.a(this.2.2(), 4.0f + this.0.1 * 2.0f, 1.0f, n2);
                    if (bl3 || bl3) break block2;
                    if (!((7f)this.2).4()) break block3;
                    if (bl3 || bl3) break block2;
                    n2 = (int)((long)881649392 ^ (long)0x34EE4434) | (int)(200.0f * this.1.1) << (int)((long)1941027652 ^ (long)1941027676);
                    if (bl3 || bl3) break block2;
                    1A.0(0.5f, 0.5f, 2.0f, (float)(bip2.a + (int)((long)-1185693856 ^ (long)-1185693854)) - 0.5f, n2);
                    if (bl3) break block2;
                }
                if (bl3) break block2;
                super.0(bip2, bl2, f2, f3, f4);
                if (!bl3 && !bl3) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(0v v2) {
        boolean bl2 = \u2004\u2006\u200d\u200d\u2005\u200f\u200b\u200a\u2001;
        if (bl2 || bl2) return true;
        if (!super.0(v2)) {
            if (bl2 || bl2) return true;
            if (v2 == 0v.e) {
                if (bl2 || bl2) return true;
                ((7f)this.2).5();
                if (bl2 || bl2) return true;
                return (int)((long)-1796296816 ^ (long)-1796296815) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)-2007766983 ^ (long)-2007766983) != 0;
            }
        }
        if (!bl2) return (int)((long)1673793696 ^ (long)1673793697) != 0;
        return true;
    }

    @Override
    public final float 1(bip bip2) {
        boolean bl2 = \u2004\u2006\u200d\u200d\u2005\u200f\u200b\u200a\u2001;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return (int)((long)-1420150078 ^ (long)-1420150074) + bip2.a(this.2.2()) + (int)((long)-1730298098 ^ (long)-1730298108);
    }
}

