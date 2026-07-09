/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rp;
import net.impactclient.7Q;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rM
extends 0rp<Integer> {
    public static final boolean \u2007\u2004\u2006\u200b;
    public int 2;

    public final int hashCode() {
        boolean bl2 = \u2007\u2004\u2006\u200b;
        if (bl2 || bl2) {
            return -1763448989;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ void 1(Object object) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2004\u2006\u200b;
                if (bl2 || bl2) break block2;
                this.0((Integer)object);
                if (!bl2) break block3;
            }
            return;
        }
    }

    0rM(String string, String string2, String string3, Integer n2, Integer n3) {
        boolean bl2 = \u2007\u2004\u2006\u200b;
        super(string, string2, string3, n2, n3);
        this.0((Integer)((int)((long)850395106 ^ (long)850395106)));
    }

    @Override
    public final /* synthetic */ Object 1() {
        boolean bl2 = \u2007\u2004\u2006\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return this.2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = \u2007\u2004\u2006\u200b;
        if (bl2 || bl2) {
            return true;
        }
        throw new UnsupportedOperationException();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(float f2) {
        block5: {
            block2: {
                double d2;
                boolean bl2;
                block4: {
                    block3: {
                        bl2 = \u2007\u2004\u2006\u200b;
                        if (bl2) break block2;
                        int n2 = (Integer)this.1() - (Integer)this.0();
                        String[] stringArray = 7b.0();
                        if (bl2 || bl2) break block2;
                        d2 = (double)this.2 + (double)n2 / 10.0 * (double)f2;
                        if (bl2 || bl2) break block2;
                        if (!(f2 > 0.0f)) break block3;
                        if (bl2 || bl2) break block2;
                        d2 = Math.ceil(d2);
                        if (bl2) break block2;
                        if (stringArray != null) break block4;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    if (!(f2 < 0.0f)) break block4;
                    if (bl2 || bl2) break block2;
                    d2 = Math.floor(d2);
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                this.0(Integer.valueOf((int)d2));
                if (!bl2 && !bl2) break block5;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    private void 0(Integer n2) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2004\u2006\u200b;
                if (bl2 || bl2) break block2;
                this.2 = (Integer)7Q.0(n2, this.0, this.1);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

