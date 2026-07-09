/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bip
 */
package net.impactclient;

import java.awt.Color;
import javax.annotation.Nonnull;
import net.impactclient.0;
import net.impactclient.1A;
import net.impactclient.2w;
import net.impactclient.5Z;
import net.impactclient.62;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 1
extends 0 {
    protected bip 0;
    public static final boolean \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
    private float 1;
    public int 2;

    /*
     * Enabled aggressive block sorting
     */
    private void 0(int n2, int n3, int n4, int n5, int n6, float f2, int n7, int n8) {
        boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
        if (bl2 || bl2) return;
        float f3 = Math.max((float)n2, (float)n5 + ((float)n6 - this.1) / 2.0f);
        if (bl2 || bl2) return;
        float f4 = Math.min((float)(n2 + n4), (float)n5 + ((float)n6 + this.1) / 2.0f);
        if (bl2 || bl2) return;
        if (f3 > f4) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        1A.0(f3 + 0.5f, (float)n3 + f2, f4 + 0.5f, (float)n3 + 0.5f + f2, n8);
        if (bl2 || bl2) return;
        1A.0(f3, (float)n3 - 0.5f + f2, f4, (float)n3 + f2, n7);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Pair<Color, Color> 0(float f2) {
        int n2;
        int n3;
        block3: {
            block2: {
                boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
                if (bl2 || bl2) break block2;
                n3 = 2w.0((int)((long)2043440462 ^ (long)-2043440463), (int)((long)-39002719 ^ (long)40047214), f2);
                n2 = (n3 & (int)((long)1253667810 ^ (long)1246072606)) >> (int)((long)-1887133158 ^ (long)-1887133160) | n3 & (int)((long)-366391131 ^ (long)355029157);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new ImmutablePair<Color, Color>(new Color(n3), new Color(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(@Nonnull bib bib2, int n2, int n3, float f2) {
        block8: {
            int n4;
            block9: {
                block7: {
                    boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
                    if (bl2 || bl2) break block7;
                    if (!this.m) break block8;
                    if (!bl2 && !bl2) break block9;
                }
                return;
            }
            if (n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g) {
                n4 = (int)((long)791597602 ^ (long)791597603);
                if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                    throw null;
                }
            } else {
                n4 = (int)((long)-1602343385 ^ (long)-1602343385);
            }
            this.n = n4;
            float f3 = this.1();
            Pair<Color, Color> pair = this.0(f3);
            1 v1 = this;
            Pair<Color, Color> pair2 = pair;
            float f4 = f3;
            int n5 = this.f;
            int n6 = this.i + this.g;
            n3 = v1.h;
            1 var1_3 = v1;
            v1.1(n3, n6, n5, var1_3.h, var1_3.f, f4, pair2.getLeft().getRGB(), pair2.getRight().getRGB());
            this.0.a(this.j, (float)this.h + (float)this.f / 2.0f - (float)this.0.a(this.j) / 2.0f, (float)(this.i + (this.g - (int)((long)1162801723 ^ (long)1162801719))), pair.getLeft().getRGB());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void 0(bip bip2) {
        block3: {
            block2: {
                boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
                if (bl2 || bl2) break block2;
                this.0 = bip2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final int 0() {
        boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
        if (bl2 || bl2) {
            return 728123669;
        }
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final float 1() {
        int n2;
        float f2;
        int n3;
        block11: {
            block9: {
                block10: {
                    block8: {
                        boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
                        if (bl2 || bl2) break block8;
                        n3 = this.f;
                        if (bl2 || bl2) break block8;
                        if (!this.n) break block9;
                        if (!bl2) break block10;
                    }
                    return 0.0f;
                }
                f2 = n3;
                if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                    throw null;
                }
                break block11;
            }
            f2 = 0.0f;
        }
        float f3 = (Math.abs(f2 - this.1) / 4.0f + 2.5f) / 2.0f;
        if (this.n) {
            n2 = (int)((long)-1161844084 ^ (long)-1161844083);
            if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                throw null;
            }
        } else {
            n2 = (int)((long)-1795630402 ^ (long)1795630401);
        }
        this.1 += f3 * (float)n2;
        this.1 = Math.min((float)n3, this.1);
        this.1 = Math.max(0.0f, this.1);
        return this.1 / (float)n3;
    }

    public 1(int n2, int n3, int n4, int n5, int n6, String string, Runnable runnable) {
        boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
        super(n2, n3, n4, n5, n6, string, runnable);
        this.0 = 62.0;
        this.1 = 0.0f;
        this.2 = 5Z.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1(int n2, int n3, int n4, int n5, int n6, float f2, int n7, int n8) {
        float f3;
        float f4;
        block15: {
            float f5;
            block13: {
                block14: {
                    block12: {
                        boolean bl2 = \u200d\u200f\u200e\u2002\u2006\u2006\u2001;
                        if (bl2 || bl2) break block12;
                        if (this.2 != 5Z.c) break block13;
                        if (!bl2) break block14;
                    }
                    return;
                }
                f5 = -7.0f + -7.0f * f2;
                if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                    throw null;
                }
                break block15;
            }
            if (this.2 != 5Z.a) {
                f5 = -14.0f;
                if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                    throw null;
                }
            } else {
                f5 = f4 = 0.0f;
            }
        }
        if (this.2 != 5Z.a) {
            this.0(n2, n3, n4, n5, n6, f4, n7, n8);
        }
        if (this.2 == 5Z.c) {
            f3 = -7.0f + 7.0f * f2;
            if (\u200d\u200f\u200e\u2002\u2006\u2006\u2001) {
                throw null;
            }
        } else {
            f3 = 0.0f;
        }
        f4 = f3;
        this.0(n2, n3, n4, n5, n6, f4, n7, n8);
    }
}

