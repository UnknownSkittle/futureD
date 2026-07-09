/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhc
 *  bhc$a
 *  bhe
 *  et
 *  vg
 *  vk
 */
package net.impactclient;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.LambdaMetafactory;
import java.util.function.Consumer;
import net.impactclient.0T;
import net.impactclient.0rd;
import net.impactclient.0rn;
import net.impactclient.6n;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0r0
implements 0T {
    public static final boolean \u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
    private static final 0rd<bhc> 0;

    /*
     * Enabled aggressive block sorting
     */
    public static bhc 0(float f2, float f3, int n2) {
        bhc bhc2;
        block3: {
            block2: {
                boolean bl2 = \u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
                if (bl2 || bl2) break block2;
                float f4 = 0r0.2.h.v;
                if (bl2 || bl2) break block2;
                float f5 = 0r0.2.h.w;
                if (bl2 || bl2) break block2;
                0r0.2.h.v = f2;
                if (bl2 || bl2) break block2;
                0r0.2.h.w = f3;
                if (bl2 || bl2) break block2;
                bhc2 = 0r0.0((vg)0r0.2.h, 1.0f, n2);
                if (bl2 || bl2) break block2;
                0r0.2.h.v = f4;
                if (bl2 || bl2) break block2;
                0r0.2.h.w = f5;
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return bhc2;
    }

    /*
     * Unable to fully structure code
     */
    private static 6n 0(vg var0, bhe var1_1, bhe var2_2, double var3_3) {
        block7: {
            var14_5 = 0r0.\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
            if (var14_5 || var14_5) lbl-1000:
            // 13 sources

            {
                return null;
            }
            var2_2 = var2_2.a(var3_3);
            if (var14_5 || var14_5) ** GOTO lbl-1000
            v0 = var0;
            var6_6 = 0r0.2.f.a(v0, v0.bw().b(var2_2.b, var2_2.c, var2_2.d).c(1.0, 1.0, 1.0), Predicates.and(vk.e, (Predicate)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, ay(), (Lvg;)Z)()));
            if (var14_5) ** GOTO lbl-1000
            var7_7 = null;
            var8_8 = null;
            var10_9 = var3_3;
            var5_10 = 7b.0();
            if (var14_5 || var14_5) ** GOTO lbl-1000
            var3_4 = var6_6.iterator();
            if (var14_5) ** GOTO lbl-1000
            do lbl-1000:
            // 4 sources

            {
                block9: {
                    block8: {
                        if (var14_5) ** GOTO lbl-1000
                        if (!var3_4.hasNext()) break;
                        if (var14_5) ** GOTO lbl-1000
                        var4_11 = (vg)var3_4.next();
                        var6_6 = var4_11.bw().g((double)var4_11.aI());
                        v1 = var1_1;
                        var9_12 = var6_6.b(v1, v1.e(var2_2));
                        if (var14_5 || var14_5) ** GOTO lbl-1000
                        if (var5_10 == null) break block7;
                        if (var14_5) ** GOTO lbl-1000
                        if (!var6_6.b(var1_1)) break block8;
                        if (var14_5 || var14_5) ** GOTO lbl-1000
                        if (!(var10_9 >= 0.0)) continue;
                        if (var14_5 || var14_5) ** GOTO lbl-1000
                        var7_7 = var4_11;
                        if (var14_5 || var14_5) ** GOTO lbl-1000
                        if (var9_12 == null) {
                            if (!var14_5) ** break;
                            ** continue;
                            v2 = var1_1;
                            if (0r0.\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                                throw null;
                            }
                        } else {
                            v2 = var9_12.c;
                        }
                        var8_8 = v2;
                        var10_9 = 0.0;
                        if (var5_10 != null) ** GOTO lbl-1000
                    }
                    if (var9_12 == null || !((var12_13 = var1_1.f(var9_12.c)) < var10_9) && var10_9 != 0.0) continue;
                    if (var4_11.bH() != var0.bH()) break block9;
                    if (var10_9 != 0.0) continue;
                    var7_7 = var4_11;
                    var8_8 = var9_12.c;
                    if (var5_10 != null) ** GOTO lbl-1000
                }
                var7_7 = var4_11;
                var8_8 = var9_12.c;
                var10_9 = var12_13;
            } while (var5_10 != null);
            if (var7_7 == null) {
                return null;
            }
        }
        return new 6n(var7_7, var8_8, var10_9);
    }

    static {
        boolean bl2 = \u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
        if (bl2 || bl2) {
        } else {
            0 = 0rn.6();
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bhc 0(vg object, float f2, int n2) {
        bhe bhe2;
        6n n3;
        void var1_2;
        double d2;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        boolean bl2;
        block22: {
            block21: {
                bl2 = \u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
                if (bl2) return null;
                if (bl2) return null;
                if (object == null) break block21;
                if (bl2) return null;
                if (0r0.2.f != null) break block22;
                if (bl2) return null;
            }
            if (bl2) return null;
            return null;
        }
        if (bl2) return null;
        if ((n9 & (int)((long)426143666 ^ (long)426143664)) != 0) {
            if (bl2) return null;
            n8 = (int)((long)1787853708 ^ (long)1787853709);
            if (\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                throw null;
            }
        } else {
            n8 = n7 = (int)((long)1453951120 ^ (long)1453951120);
        }
        if ((n9 & (int)((long)-2103086775 ^ (long)-2103086776)) != 0) {
            n6 = (int)((long)-581862090 ^ (long)-581862089);
            if (\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                throw null;
            }
        } else {
            n6 = n5 = (int)((long)-1771788653 ^ (long)-1771788653);
        }
        if ((n9 & (int)((long)-1703793346 ^ (long)-1703793350)) != 0) {
            n4 = (int)((long)-1525142274 ^ (long)-1525142273);
            if (\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                throw null;
            }
        } else {
            n4 = n9 = (int)((long)-1693764860 ^ (long)-1693764860);
        }
        if (n4 != 0) {
            d2 = 256.0;
            if (\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                throw null;
            }
        } else {
            d2 = 0r0.2.c.d();
        }
        double d3 = d2;
        bhc bhc2 = object.a(d3, (float)var1_2);
        boolean bl3 = 0r0.2.c.i();
        double d4 = d3;
        if (bl3 && n9 == 0) {
            d3 = 6.0;
            d4 = 6.0;
        }
        bhe bhe3 = object.f((float)var1_2);
        if (n7 != 0 && bhc2 != null) {
            d4 = bhc2.c.f(bhe3);
            if (\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) {
                throw null;
            }
        } else {
            bhc2 = null;
        }
        if ((n3 = 0r0.0(object, bhe3, bhe2 = object.e(1.0f), d3)) == null) return bhc2;
        if (n5 == 0) return bhc2;
        if (n9 == 0 && !bl3 && bhe3.f(n3.0) > 3.0) {
            bhc2 = new bhc(bhc.a.a, n3.0, null, new et(n3.0));
            if (!\u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d) return bhc2;
            throw null;
        }
        if (n3.1 < d4) return new bhc(n3.2, n3.0);
        if (bhc2 != null) return bhc2;
        return new bhc(n3.2, n3.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, Consumer<bhc> consumer) {
        block3: {
            block2: {
                boolean bl2 = \u200d\u200c\u2004\u200b\u200b\u200f\u200a\u200d;
                if (bl2 || bl2) break block2;
                bhc bhc2 = 0r0.0(f2, f3, (int)((long)-1354365105 ^ (long)-1354365076));
                if (bl2 || bl2) break block2;
                0.accept(bhc2);
                if (bl2 || bl2) break block2;
                consumer.accept(0r0.2.s);
                if (bl2 || bl2) break block2;
                0.0();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

