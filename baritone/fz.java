/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ahq
 *  ain$a
 *  aip
 *  alk
 *  alm
 *  alo
 *  aow
 *  awt
 *  bud
 *  vb
 */
package baritone;

import baritone.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fz {
    private final Map<aow, Double> a;
    private final Function<aow, Double> a;
    private final bud a = new HashMap<aow, Double>();

    public fz(bud object) {
        this.a = object;
        if (((Boolean)baritone.a.a().considerPotionEffects.value).booleanValue()) {
            object = this;
            double d2 = 1.0;
            if (((fz)object).a.a(vb.c)) {
                d2 = 1.0 * (1.0 + (double)(((fz)object).a.b(vb.c).c() + 1) * 0.2);
            }
            if (((fz)object).a.a(vb.d)) {
                switch (((fz)object).a.b(vb.d).c()) {
                    case 0: {
                        d2 *= 0.3;
                        break;
                    }
                    case 1: {
                        d2 *= 0.09;
                        break;
                    }
                    case 2: {
                        d2 *= 0.0027;
                        break;
                    }
                    default: {
                        d2 *= 8.1E-4;
                    }
                }
            }
            object = d3 -> d2 * d3;
            this.a = object.compose(this::a);
            return;
        }
        this.a = this::a;
    }

    public final double a(awt awt2) {
        return this.a.computeIfAbsent(awt2.u(), (Function<aow, Double>)((Object)this.a));
    }

    private static int a(aip aip2) {
        if (aip2.c() instanceof ahq) {
            return ain.a.valueOf((String)((ahq)aip2.c()).h()).ordinal();
        }
        return -1;
    }

    private static boolean a(aip aip2) {
        return alm.a((alk)alo.t, (aip)aip2) > 0;
    }

    public final int a(aow aow2, boolean bl2) {
        int n2 = 0;
        double d2 = Double.NEGATIVE_INFINITY;
        int n3 = Integer.MIN_VALUE;
        boolean bl3 = false;
        aow2 = aow2.t();
        for (int i2 = 0; i2 < 9; ++i2) {
            int n4;
            aip aip2 = this.a.bv.a(i2);
            double d3 = fz.a(aip2, (awt)aow2);
            boolean bl4 = fz.a(aip2);
            if (d3 > d2) {
                d2 = d3;
                n2 = i2;
                n3 = fz.a(aip2);
                bl3 = bl4;
                continue;
            }
            if (d3 != d2 || ((n4 = fz.a(aip2)) >= n3 || !bl4 && bl3) && (!bl2 || bl3 || !bl4)) continue;
            d2 = d3;
            n2 = i2;
            n3 = n4;
            bl3 = bl4;
        }
        return n2;
    }

    private double a(aow aow2) {
        return fz.a(this.a.bv.a(this.a(aow2, false)), aow2.t()) * (((List)baritone.a.a().blocksToAvoidBreaking.value).contains(aow2) ? 0.1 : 1.0);
    }

    public static double a(aip aip2, awt awt2) {
        int n2;
        float f2;
        float f3;
        float f4 = awt2.b(null, null);
        if (f3 < 0.0f) {
            return -1.0;
        }
        float f5 = aip2.a(awt2);
        if (f2 > 1.0f && (n2 = alm.a((alk)alo.s, (aip)aip2)) > 0 && !aip2.b()) {
            int n3 = n2;
            f5 += (float)(n3 * n3 + 1);
        }
        f5 /= f4;
        if (awt2.a().l() || !aip2.b() && aip2.b(awt2)) {
            return f5 / 30.0f;
        }
        return f5 / 100.0f;
    }
}

