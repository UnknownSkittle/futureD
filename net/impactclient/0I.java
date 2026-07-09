/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  rk
 */
package net.impactclient;

import net.impactclient.0B;
import net.impactclient.1s;
import net.impactclient.2w;
import net.impactclient.7Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class 0I
extends 0B {
    private final int 5;
    private final int 4;
    private int 3;
    public static final boolean \u200a\u200a\u2006\u2009\u200e\u200c\u2008\u200b\u2006;
    private final int 1;
    private final int 2;

    /*
     * Enabled aggressive block sorting
     */
    public final int 0() {
        float f2;
        block3: {
            block2: {
                boolean bl2 = \u200a\u200a\u2006\u2009\u200e\u200c\u2008\u200b\u2006;
                if (bl2 || bl2) break block2;
                f2 = (float)this.3 / (float)this.2 * 0.6f + 0.1f;
                if (!bl2 && !bl2) break block3;
            }
            return -569340558;
        }
        return 2w.1(0.90588236f, 0.78431374f, 0.96862745f, f2);
    }

    0I(int n2, int n3) {
        boolean bl2 = \u200a\u200a\u2006\u2009\u200e\u200c\u2008\u200b\u2006;
        super(new 1s(7Q.0((int)((long)-155411793 ^ (long)155411763), n2 + (int)((long)-720559525 ^ (long)-720559553)), 7Q.0((int)((long)-924937716 ^ (long)924937616), n3 + (int)((long)-1635208969 ^ (long)-1635209069))));
        this.1 = n2;
        this.5 = n3;
        this.3 = 7Q.0((int)((long)305445387 ^ (long)305445440), (int)((long)-394665489 ^ (long)-394665832));
        this.4 = 7Q.0((int)((long)-794974271 ^ (long)-794974271), (int)((long)-338102928 ^ (long)-338103272));
        this.2 = this.3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0() {
        boolean bl2 = \u200a\u200a\u2006\u2009\u200e\u200c\u2008\u200b\u2006;
        if (bl2 || bl2) return true;
        float f2 = this.0.1;
        if (bl2 || bl2) return true;
        float f3 = this.0.0;
        if (bl2 || bl2) return true;
        float f4 = rk.b((float)((float)Math.toRadians(this.4))) * 0.25f;
        if (bl2 || bl2) return true;
        float f5 = rk.a((float)((float)Math.toRadians(this.4))) * 0.25f;
        if (bl2 || bl2) return true;
        float f6 = f2 + f4;
        1s s2 = this.0;
        this.0.1 = f6;
        if (bl2 || bl2) return true;
        s2.0 = f3 + f5;
        if (bl2 || bl2) return true;
        if ((this.3 -= (int)((long)1831485728 ^ (long)1831485729)) > 0) {
            if (bl2) return true;
            if (f2 > 0.0f) {
                if (bl2) return true;
                if (f3 > 0.0f) {
                    if (bl2) return true;
                    if (f2 < (float)this.1) {
                        if (bl2) return true;
                        if (f3 < (float)this.5) {
                            if (bl2) return true;
                            return (int)((long)-1074721215 ^ (long)-1074721216) != 0;
                        }
                    }
                }
            }
        }
        if (!bl2) return (int)((long)858148912 ^ (long)858148912) != 0;
        return true;
    }
}

