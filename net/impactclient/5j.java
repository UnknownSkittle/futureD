/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  buk
 *  bus
 *  bve
 *  cdy
 */
package net.impactclient;

import net.impactclient.0r6;
import net.impactclient.1t;
import net.impactclient.72;
import net.impactclient.74;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 5j
implements 0r6 {
    public static final boolean \u2004\u2006\u2003\u2005\u200b\u2002\u2004\u200b\u2006;
    74 0;
    private int 1;

    /*
     * Enabled aggressive block sorting
     */
    5j() {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2006\u2003\u2005\u200b\u2002\u2004\u200b\u2006;
                if (bl2 || bl2) break block2;
                this.0 = new 74();
                if (bl2 || bl2) break block2;
                this.1 = (int)((long)1834622146 ^ (long)1834622146);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected static void 0(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        block3: {
            block2: {
                boolean bl2 = \u2004\u2006\u2003\u2005\u200b\u2002\u2004\u200b\u2006;
                if (bl2 || bl2) break block2;
                buk buk2 = bve.a().c();
                buk2.a((int)((long)-1122440822 ^ (long)-1122440818), cdy.g);
                if (bl2 || bl2) break block2;
                buk2.b((double)(f2 + f4), (double)f3, 0.0).a((double)f8, (double)f7).d();
                if (bl2 || bl2) break block2;
                buk2.b((double)f2, (double)f3, 0.0).a((double)f6, (double)f7).d();
                if (bl2 || bl2) break block2;
                buk2.b((double)f2, (double)(f3 + f5), 0.0).a((double)f6, (double)f9).d();
                if (bl2 || bl2) break block2;
                buk2.b((double)f2, (double)(f3 + f5), 0.0).a((double)f6, (double)f9).d();
                if (bl2 || bl2) break block2;
                buk2.b((double)(f2 + f4), (double)(f3 + f5), 0.0).a((double)f8, (double)f9).d();
                if (bl2 || bl2) break block2;
                buk2.b((double)(f2 + f4), (double)f3, 0.0).a((double)f8, (double)f7).d();
                if (bl2 || bl2) break block2;
                bve.a().b();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int 0(String string, float f2, float f3, int n2) {
        int n3;
        float f4;
        block6: {
            boolean bl2 = \u2004\u2006\u2003\u2005\u200b\u2002\u2004\u200b\u2006;
            if (bl2) return 1830459155;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return 1830459155;
            int n4 = n2;
            float f5 = f3;
            f4 = f2;
            String string2 = string;
            74 var2_4 = this.0;
            if (!var2_4.2()) {
                if (bl2 || bl2) return 1830459155;
                return (int)((long)-2145662481 ^ (long)-2145662481);
            }
            if (bl2) return 1830459155;
            bus.G();
            if (bl2 || bl2) return 1830459155;
            bus.G();
            if (bl2 || bl2) return 1830459155;
            bus.b((float)0.25f, (float)0.25f, (float)0.25f);
            if (bl2 || bl2) return 1830459155;
            f4 *= 4.0f;
            if (bl2 || bl2) return 1830459155;
            f5 *= 4.0f;
            if (bl2 || bl2) return 1830459155;
            bus.m();
            if (bl2 || bl2) return 1830459155;
            bus.i((int)var2_4.0.0);
            if (bl2 || bl2) return 1830459155;
            1t.0(n4);
            if (bl2 || bl2) return 1830459155;
            int n5 = string2.length();
            if (bl2 || bl2) return 1830459155;
            n4 = (int)((long)1747909299 ^ (long)1747909299);
            if (bl2) return 1830459155;
            while (!bl2) {
                if (n4 < n5) {
                    if (bl2 || bl2) return 1830459155;
                    char c2 = string2.charAt(n4);
                    n3 = 74.0(c2) ? 1 : 0;
                    if (stringArray == null) return n3;
                    if (n3 != 0) {
                        if (bl2 || bl2) return 1830459155;
                        72 var8_14 = var2_4.1(c2);
                        if (bl2 || bl2) return 1830459155;
                        5j.0(f4, f5, var8_14.0, var8_14.1, (float)var8_14.3 / (float)var2_4.0.1, (float)var8_14.2 / (float)var2_4.0.2, (float)(var8_14.3 + var8_14.0) / (float)var2_4.0.1, (float)(var8_14.2 + var8_14.1) / (float)var2_4.0.2);
                        if (bl2 || bl2) return 1830459155;
                        f4 += (float)var8_14.0;
                        if (bl2) return 1830459155;
                    }
                    if (bl2) return 1830459155;
                    ++n4;
                    if (bl2) return 1830459155;
                    if (stringArray != null) continue;
                    if (bl2) return 1830459155;
                }
                if (bl2) return 1830459155;
                bus.H();
                if (!bl2 && !bl2) break block6;
            }
            return 1830459155;
        }
        n3 = (int)f4;
        return n3;
    }
}

