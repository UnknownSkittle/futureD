/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  rk
 */
package net.impactclient;

import net.impactclient.1A;
import net.impactclient.1t;
import net.impactclient.2F;
import net.impactclient.2w;
import net.impactclient.5b;
import net.impactclient.7f;
import pw.knx.feather.tessellate.Tessellator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 2y
extends 2F {
    private 7f 2;
    public static final boolean \u2008\u2008\u2009\u200a\u2007\u2002\u2001;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, int n4) {
        boolean bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
        if (bl2 || bl2) return;
        if (this.1(n2, n3)) {
            if (bl2 || bl2) return;
            if (n4 == 0) {
                if (bl2 || bl2) return;
                this.2.5();
                if (bl2 || bl2) return;
                return;
            }
        }
        if (bl2) return;
        super.0(n2, n3, n4);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2y(String string, String string2, 7f f2) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                if (bl2 || bl2) break block2;
                this.2 = f2;
                if (bl2 || bl2) break block2;
                this.7 = string;
                if (bl2 || bl2) break block2;
                this.8 = string2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 0(int n2, int n3, boolean bl2, float f2) {
        float f3;
        float f4;
        block8: {
            block7: {
                boolean bl3 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                if (bl3 || bl3) break block7;
                this.5 = (int)((long)1272251082 ^ (long)1272251113);
                if (bl3 || bl3) break block7;
                f4 = 0.1f * f2;
                if (!bl3 && !bl3) break block8;
            }
            return;
        }
        if (this.2.4()) {
            f3 = f4;
            if (\u2008\u2008\u2009\u200a\u2007\u2002\u2001) {
                throw null;
            }
        } else {
            f3 = -f4;
        }
        this.0a += f3;
        this.0a = Math.max(0.0f, Math.min(1.0f, this.0a));
        super.0(n2, n3, bl2, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, float f2) {
        block6: {
            block2: {
                boolean bl2;
                block5: {
                    block4: {
                        Tessellator tessellator;
                        block3: {
                            bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                            if (bl2 || bl2) break block2;
                            float f3 = Math.min(this.0a + 0.5f + this.9 * 0.3f, 1.0f);
                            int n4 = 2w.1(f3, f3, f3, 1.0f);
                            if (bl2 || bl2) break block2;
                            1.a(this.7, (float)(this.3 + (int)((long)-2111186823 ^ (long)-2111186841)), (float)(this.6 + (int)((long)1557635681 ^ (long)1557635688)), n4);
                            if (bl2 || bl2) break block2;
                            float f4 = Math.min(this.0a + 0.5f + this.4 * 0.3f, 1.0f);
                            n4 = 2w.1(f4, f4, f4, 1.0f);
                            if (bl2 || bl2) break block2;
                            this.3(n4);
                            if (bl2 || bl2) break block2;
                            1A.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)(this.6 + this.5), (int)(this.9 * 0.1f * 255.0f) << (int)((long)-1938857624 ^ (long)-1938857616));
                            if (bl2 || bl2) break block2;
                            1A.0(this.3, this.6, this.3 + this.0b, (float)this.6 + this.0d, 1.0f, (int)((long)1233399995 ^ (long)159658171), (int)((long)494469721 ^ (long)494469721));
                            if (bl2 || bl2) break block2;
                            n4 = this.3 + this.0b - (int)((long)2090550078 ^ (long)2090550057);
                            if (bl2 || bl2) break block2;
                            int n5 = this.6 + (int)((long)1009685150 ^ (long)1009685135);
                            if (bl2 || bl2) break block2;
                            bus.G();
                            if (bl2 || bl2) break block2;
                            1A.0((boolean)((long)1256128267 ^ (long)1256128266));
                            if (bl2 || bl2) break block2;
                            5b[] bArray = new 5b[(int)((long)-1697898060 ^ (long)-1697898059)];
                            bArray[(int)((long)-1484502123 ^ (long)-1484502123)] = 5b.c;
                            1A.0(bArray);
                            if (bl2 || bl2) break block2;
                            1t.0((int)((long)-862037936 ^ (long)862037935));
                            if (bl2 || bl2) break block2;
                            bus.d((float)1.0f);
                            if (bl2 || bl2) break block2;
                            tessellator = 1A.1;
                            tessellator.addVertex(n4, n5, 0.0f);
                            if (bl2 || bl2) break block2;
                            if (!(this.0a > 0.0f)) break block3;
                            if (bl2 || bl2) break block2;
                            float f5 = Math.min(this.0a, 0.5f) * 16.0f;
                            if (bl2 || bl2) break block2;
                            float f6 = rk.b((float)((float)Math.toRadians(45.0))) * f5 + (float)n4;
                            if (bl2 || bl2) break block2;
                            float f7 = rk.a((float)((float)Math.toRadians(45.0))) * f5 + (float)n5;
                            if (bl2 || bl2) break block2;
                            tessellator.addVertex(f6, f7, 0.0f);
                            if (bl2 || bl2) break block2;
                            if (!(this.0a > 0.5f)) break block3;
                            if (bl2 || bl2) break block2;
                            f5 = (this.0a - 0.5f) / 0.5f * 16.0f;
                            if (bl2 || bl2) break block2;
                            f6 = rk.b((float)((float)Math.toRadians(-65.0))) * f5 + f6;
                            if (bl2 || bl2) break block2;
                            f7 = rk.a((float)((float)Math.toRadians(-65.0))) * f5 + f7;
                            if (bl2 || bl2) break block2;
                            tessellator.addVertex(f6, f7, 0.0f);
                            if (bl2) break block2;
                        }
                        if (bl2) break block2;
                        tessellator.draw((int)((long)82112833 ^ (long)82112834));
                        if (bl2 || bl2) break block2;
                        1A.0();
                        if (bl2 || bl2) break block2;
                        1A.0((boolean)((long)-2042490148 ^ (long)-2042490148));
                        if (bl2 || bl2) break block2;
                        bus.H();
                        if (bl2 || bl2) break block2;
                        if (this.0g) break block4;
                        if (bl2) break block2;
                        if (!(this.0d > (float)this.5)) break block5;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    2w.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)this.6 + this.0d);
                    if (bl2 || bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                                if (bl2 || bl2) break block2;
                                k2.0(n2, n3, f2);
                                if (!bl2 && !bl2) break block3;
                            }
                            return;
                        }
                    });
                    if (bl2 || bl2) break block2;
                    2w.1();
                    if (bl2) break block2;
                }
                if (!bl2) break block6;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3, int n4) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                    if (bl2 || bl2) break block2;
                    if (!this.0g) break block3;
                    if (bl2 || bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u2008\u2008\u2009\u200a\u2007\u2002\u2001;
                                if (bl2 || bl2) break block2;
                                k2.1(n2, n3, n4);
                                if (!bl2) break block3;
                            }
                            return;
                        }
                    });
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }
}

