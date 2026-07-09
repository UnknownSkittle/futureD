/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import net.impactclient.0v;
import net.impactclient.2w;
import net.impactclient.3r;
import net.impactclient.5E;
import net.impactclient.6K;
import net.impactclient.7b;
import net.impactclient.7x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6o
extends 6K {
    private 3r 3;
    private 7x 2;
    private boolean 1;
    private 3r 0;
    public static final boolean \u2001\u2009\u200e\u2009\u2007\u2005\u200c;

    /*
     * Enabled aggressive block sorting
     */
    public 6o(7x x2) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2009\u200e\u2009\u2007\u2005\u200c;
                if (bl2 || bl2) break block2;
                this.2 = x2;
                if (bl2 || bl2) break block2;
                this.3 = new 3r();
                if (bl2 || bl2) break block2;
                this.0 = new 3r();
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
        block3: {
            block2: {
                boolean bl3 = \u2001\u2009\u200e\u2009\u2007\u2005\u200c;
                if (bl3 || bl3) break block2;
                this.3.0(f4, bl2);
                if (bl3 || bl3) break block2;
                this.0.0(f4, this.1);
                if (bl3 || bl3) break block2;
                int n2 = 2w.0((int)((long)970330460 ^ (long)-970330461), (int)((long)-1193968170 ^ (long)1199560572), this.0.1);
                if (bl3 || bl3) break block2;
                String string = this.2.3();
                if (bl3 || bl3) break block2;
                bip2.a(string, f2 - 4.0f - (float)bip2.a(string), 1.0f, n2);
                if (bl3 || bl3) break block2;
                bip2.a(this.2.1(), 4.0f + this.3.1 * 2.0f, 1.0f, n2);
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
    @Override
    public final boolean 0(0v v2) {
        boolean bl2 = \u2001\u2009\u200e\u2009\u2007\u2005\u200c;
        if (bl2) return true;
        String[] stringArray = 7b.0();
        if (bl2 || bl2) return true;
        if (this.1) {
            if (bl2 || bl2) return true;
            switch (5E.0[v2.ordinal()]) {
                case 1: {
                    if (bl2) return true;
                    this.1 = (int)((long)-505633744 ^ (long)-505633744);
                    if (bl2 || bl2) return true;
                    if (stringArray != null) break;
                    if (bl2) return true;
                }
                case 2: {
                    if (bl2) return true;
                    this.2.2();
                    if (bl2 || bl2) return true;
                    if (stringArray != null) break;
                    if (bl2) return true;
                }
                case 3: {
                    if (bl2) return true;
                    this.2.0();
                    if (bl2) return true;
                    break;
                }
            }
            if (bl2) return true;
            return (int)((long)-1425156837 ^ (long)-1425156838) != 0;
        }
        if (bl2) return true;
        if (!super.0(v2)) {
            if (bl2 || bl2) return true;
            if (v2 == 0v.e) {
                if (bl2 || bl2) return true;
                this.1 = (int)((long)-626940676 ^ (long)-626940675);
                if (bl2 || bl2) return true;
                return (int)((long)-158446613 ^ (long)-158446614) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)-1595105824 ^ (long)-1595105824) != 0;
            }
        }
        if (!bl2) return (int)((long)815281680 ^ (long)815281681) != 0;
        return true;
    }

    @Override
    public final float 1(bip bip2) {
        boolean bl2 = \u2001\u2009\u200e\u2009\u2007\u2005\u200c;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return (int)((long)-2126231180 ^ (long)-2126231184) + bip2.a(this.2.1()) + (int)((long)1542136173 ^ (long)1542136179) + bip2.a(this.2.3());
    }
}

