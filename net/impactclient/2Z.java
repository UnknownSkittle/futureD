/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhe
 *  et
 *  fa$a
 *  rk
 *  vg
 */
package net.impactclient;

import java.util.Random;
import java.util.function.Function;
import net.impactclient.0T;
import net.impactclient.1s;
import net.impactclient.2Q;
import net.impactclient.3Z;
import net.impactclient.50;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2Z
implements 0T {
    private static final Random 0;
    public static final boolean \u2007\u2003\u200a\u200a\u200e\u2007;
    public static final et 1;

    public static 1s 2(vg vg2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return 2Z.0(2Z.3(vg2));
    }

    static {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
        } else {
            1 = new et((int)((long)-1827220978 ^ (long)-1827220977), (int)((long)-161952194 ^ (long)-161952193), (int)((long)1464041711 ^ (long)1464041710));
            if (!bl2 && !bl2) {
                0 = new Random();
                if (!bl2) {
                    // empty if block
                }
            }
        }
    }

    public static double 0(double d2, double d3, double d4, double d5) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return 0.0;
        }
        return d2 * (d5 - d4) / d3 + d4;
    }

    public static 3Z 0(et et2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return new 3Z(et2.p(), et2.q(), et2.r());
    }

    public static et 1(3Z z2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return new et(z2.2, z2.0, z2.1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float 0(float f2, float f3, float f4) {
        block5: {
            block2: {
                boolean bl2;
                block4: {
                    block3: {
                        float f5;
                        bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                        if (bl2) break block2;
                        String[] stringArray = 7b.0();
                        if (bl2 || bl2) break block2;
                        f3 -= f2;
                        if (!(f5 > f4)) break block3;
                        if (bl2) break block2;
                        f3 = f4;
                        if (bl2) break block2;
                        if (stringArray != null) break block4;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    if (!(f3 < -f4)) break block4;
                    if (bl2) break block2;
                    f3 = -f4;
                    if (bl2) break block2;
                }
                if (!bl2) break block5;
            }
            return 0.0f;
        }
        return f2 + f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static 1s 0(3Z object) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                if (bl2 || bl2) break block2;
                object = 2Z.3((vg)2Z.2.h).2((3Z)object);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return 2Z.0(((50)2Z.2.h).getRotations(), (1s)object);
    }

    public static Function<Float, Float> 0(float f2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return f3 -> {
            boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
            if (bl2 || bl2) {
                return null;
            }
            return Float.valueOf(f2 * (float)Math.round(f3.floatValue() / f2));
        };
    }

    public static 3Z 1(bhe bhe2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return new 3Z(bhe2.b, bhe2.c, bhe2.d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static et 0(et et2, fa.a a2, double d2) {
        block6: {
            block5: {
                boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                if (bl2 || bl2) break block5;
                switch (2Q.0[a2.ordinal()]) {
                    case 1: {
                        if (bl2) break;
                        return new et(d2, (double)et2.q(), (double)et2.r());
                    }
                    case 2: {
                        if (bl2) break;
                        return new et((double)et2.p(), d2, (double)et2.r());
                    }
                    case 3: {
                        if (bl2) break;
                        return new et((double)et2.p(), (double)et2.q(), d2);
                    }
                    default: {
                        if (!bl2) break block6;
                    }
                }
            }
            return null;
        }
        return et2;
    }

    public static 1s 0(bhe bhe2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return 2Z.0(2Z.1(bhe2));
    }

    public static double 0() {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return 0.0;
        }
        return 0.nextDouble() * (double)0.95f + (double)0.025f;
    }

    public static 3Z 3(vg vg2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return ((50)vg2).getPos().1(0.0, vg2.by(), 0.0);
    }

    public static double 0(vg vg2) {
        boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
        if (bl2 || bl2) {
            return 0.0;
        }
        return Math.abs(2Z.1(vg2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double 1(vg object) {
        1s s2;
        1s s3;
        block3: {
            block2: {
                boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                if (bl2 || bl2) break block2;
                s3 = ((50)2Z.2.h).getRotations();
                float f2 = rk.g((float)s3.1);
                1s s4 = s3;
                s3.1 = f2;
                if (bl2 || bl2) break block2;
                s4.0 = rk.g((float)s3.0);
                if (bl2 || bl2) break block2;
                s2 = 2Z.0(2Z.3(object));
                if (!bl2 && !bl2) break block3;
            }
            return 0.0;
        }
        return rk.g((float)(s3.1 - s2.1));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bhe 0(bhe bhe2, fa.a a2, double d2) {
        block6: {
            block5: {
                boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                if (bl2 || bl2) break block5;
                switch (2Q.0[a2.ordinal()]) {
                    case 1: {
                        if (bl2) break;
                        return new bhe(d2, bhe2.c, bhe2.d);
                    }
                    case 2: {
                        if (bl2) break;
                        return new bhe(bhe2.b, d2, bhe2.d);
                    }
                    case 3: {
                        if (bl2) break;
                        return new bhe(bhe2.b, bhe2.c, d2);
                    }
                    default: {
                        if (!bl2) break block6;
                    }
                }
            }
            return null;
        }
        return bhe2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static 1s 0(1s s2, 1s s3) {
        1s s4;
        block3: {
            block2: {
                boolean bl2 = \u2007\u2003\u200a\u200a\u200e\u2007;
                if (bl2 || bl2) break block2;
                s4 = new 1s();
                float f2 = rk.g((float)(s3.1 - s2.1)) + s2.1;
                1s s5 = s4;
                s4.1 = f2;
                if (bl2 || bl2) break block2;
                s5.0 = rk.g((float)(s3.0 - s2.0)) + s2.0;
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return s4;
    }
}

