/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  bqj
 *  bus
 *  org.lwjgl.opengl.GL11
 *  vg
 */
package net.impactclient;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.1A;
import net.impactclient.3T;
import net.impactclient.3Z;
import net.impactclient.5Y;
import net.impactclient.5t;
import net.impactclient.99;
import net.impactclient.9m;
import org.lwjgl.opengl.GL11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rT
extends 9m<99> {
    private static final String a;
    @EventHandler
    private final Listener<5Y> 1;
    public static final boolean \u2006\u2003\u2005;
    private static final Map<aed, float[][]> 0;

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(aed aed2, bqj bqj2) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2003\u2005;
                if (bl2 || bl2) break block2;
                float[][] fArrayArray = new float[(int)((long)-1144189156 ^ (long)-1144189159)][];
                float[] fArray = new float[(int)((long)-1387131506 ^ (long)-1387131507)];
                fArray[(int)((long)1761281258 ^ (long)1761281258)] = bqj2.e.f;
                fArray[(int)((long)1171559154 ^ (long)1171559155)] = bqj2.e.g;
                fArray[(int)((long)-1024542282 ^ (long)-1024542284)] = bqj2.e.h;
                fArrayArray[(int)((long)-463193698 ^ (long)-463193698)] = fArray;
                float[] fArray2 = new float[(int)((long)-493783701 ^ (long)-493783704)];
                fArray2[(int)((long)-828875477 ^ (long)-828875477)] = bqj2.h.f;
                fArray2[(int)((long)-1656226559 ^ (long)-1656226560)] = bqj2.h.g;
                fArray2[(int)((long)279561677 ^ (long)279561679)] = bqj2.h.h;
                fArrayArray[(int)((long)-1293361194 ^ (long)-1293361193)] = fArray2;
                float[] fArray3 = new float[(int)((long)411139040 ^ (long)411139043)];
                fArray3[(int)((long)-2024559832 ^ (long)-2024559832)] = bqj2.i.f;
                fArray3[(int)((long)-85436182 ^ (long)-85436181)] = bqj2.i.g;
                fArray3[(int)((long)-836158452 ^ (long)-836158450)] = bqj2.i.h;
                fArrayArray[(int)((long)1897038137 ^ (long)1897038139)] = fArray3;
                float[] fArray4 = new float[(int)((long)-823935492 ^ (long)-823935489)];
                fArray4[(int)((long)-839843170 ^ (long)-839843170)] = bqj2.j.f;
                fArray4[(int)((long)-440791240 ^ (long)-440791239)] = bqj2.j.g;
                fArray4[(int)((long)-456042487 ^ (long)-456042485)] = bqj2.j.h;
                fArrayArray[(int)((long)-1616776868 ^ (long)-1616776865)] = fArray4;
                float[] fArray5 = new float[(int)((long)565574563 ^ (long)565574560)];
                fArray5[(int)((long)770043904 ^ (long)770043904)] = bqj2.k.f;
                fArray5[(int)((long)-69356067 ^ (long)-69356068)] = bqj2.k.g;
                fArray5[(int)((long)543309070 ^ (long)543309068)] = bqj2.k.h;
                fArrayArray[(int)((long)793531813 ^ (long)793531809)] = fArray5;
                0.put(aed2, fArrayArray);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 0rT(99 var1_1) {
        boolean bl2 = \u2006\u2003\u2005;
        super(var1_1, a, null);
        this.1 = new Listener<5Y>(y2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u2006\u2003\u2005;
                    if (bl2 || bl2) break block2;
                    1A.0((boolean)((long)799345621 ^ (long)799345620));
                    if (bl2 || bl2) break block2;
                    GL11.glDisable((int)((int)((long)-861018765 ^ (long)-861016493)));
                    if (bl2 || bl2) break block2;
                    0.keySet().removeIf(aed2 -> {
                        boolean bl2 = \u2006\u2003\u2005;
                        if (bl2 || bl2) return true;
                        if (!0rT.2.f.i.contains(aed2)) {
                            if (bl2) return true;
                            return (int)((long)-879384939 ^ (long)-879384940) != 0;
                        }
                        if (!bl2) return (int)((long)-1475372530 ^ (long)-1475372530) != 0;
                        return true;
                    });
                    if (bl2 || bl2) break block2;
                    0rT.2.f.i.forEach(aed2 -> {
                        double d2;
                        double d3;
                        float f2;
                        double d4;
                        double d5;
                        double d6;
                        float f3;
                        double d7;
                        boolean bl2 = \u2006\u2003\u2005;
                        if (bl2 || bl2) return;
                        if (!((99)this.5).0((vg)aed2)) {
                            if (bl2 || bl2) return;
                            return;
                        }
                        if (bl2) return;
                        float[][] fArray = 0.get(aed2);
                        if (fArray == null) {
                            if (bl2 || bl2) return;
                            return;
                        }
                        if (bl2) return;
                        bus.G();
                        if (bl2 || bl2) return;
                        bus.d((float)1.0f);
                        if (bl2 || bl2) return;
                        bus.c((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                        if (bl2 || bl2) return;
                        y2 = 3T.0((vg)aed2, ((5t)y2).0());
                        bus.b((double)((3Z)object).2, (double)((3Z)object).0, (double)((3Z)object).1);
                        if (bl2 || bl2) return;
                        bus.b((float)(-aed2.aN), (float)0.0f, (float)1.0f, (float)0.0f);
                        if (bl2 || bl2) {
                            return;
                        }
                        if (aed2.aU()) {
                            d7 = -0.235;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d7 = 0.0;
                        }
                        bus.b((double)0.0, (double)0.0, (double)d7);
                        if (aed2.aU()) {
                            f3 = 0.6f;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            f3 = 0.75f;
                        }
                        float f4 = f3;
                        bus.G();
                        bus.b((double)-0.125, (double)f4, (double)0.0);
                        if (fArray[(int)((long)-2036555281 ^ (long)-2036555284)][(int)((long)30683008 ^ (long)30683008)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-459234998 ^ (long)-459234999)][(int)((long)1568338079 ^ (long)1568338079)] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)1563602521 ^ (long)1563602522)][(int)((long)-282944487 ^ (long)-282944488)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)1834275572 ^ (long)1834275575)][(int)((long)-1514612137 ^ (long)-1514612138)] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)1316569334 ^ (long)1316569333)][(int)((long)213656312 ^ (long)213656314)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)1197063855 ^ (long)1197063852)][(int)((long)2022219767 ^ (long)2022219765)] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                        bus.r((int)((int)((long)258975534 ^ (long)258975533)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)(-f4), (double)0.0);
                        bus.J();
                        bus.H();
                        bus.G();
                        bus.b((double)0.125, (double)f4, (double)0.0);
                        if (fArray[(int)((long)-2003744934 ^ (long)-2003744930)][(int)((long)-1084009375 ^ (long)-1084009375)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)839022926 ^ (long)839022922)][(int)((long)1871796140 ^ (long)1871796140)] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)-470164764 ^ (long)-470164768)][(int)((long)-110347137 ^ (long)-110347138)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)1588003987 ^ (long)1588003991)][(int)((long)1497273997 ^ (long)1497273996)] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)-188193377 ^ (long)-188193381)][(int)((long)-1781340192 ^ (long)-1781340190)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-874642591 ^ (long)-874642587)][(int)((long)-1389299051 ^ (long)-1389299049)] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                        bus.r((int)((int)((long)-1139543585 ^ (long)-1139543588)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)(-f4), (double)0.0);
                        bus.J();
                        bus.H();
                        if (aed2.aU()) {
                            d6 = 0.25;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d6 = 0.0;
                        }
                        bus.b((double)0.0, (double)0.0, (double)d6);
                        bus.G();
                        if (aed2.aU()) {
                            d5 = -0.05;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d5 = 0.0;
                        }
                        if (aed2.aU()) {
                            d4 = -0.01725;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d4 = 0.0;
                        }
                        bus.b((double)0.0, (double)d5, (double)d4);
                        bus.G();
                        bus.b((double)-0.375, (double)((double)f4 + 0.55), (double)0.0);
                        if (fArray[(int)((long)2007738548 ^ (long)2007738549)][(int)((long)-460240486 ^ (long)-460240486)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-765804271 ^ (long)-765804272)][(int)((long)-1149497875 ^ (long)-1149497875)] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)-844319503 ^ (long)-844319504)][(int)((long)425315933 ^ (long)425315932)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-688585667 ^ (long)-688585668)][(int)((long)-1948458230 ^ (long)-1948458229)] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)1971537227 ^ (long)1971537226)][(int)((long)395569259 ^ (long)395569257)] != 0.0f) {
                            bus.b((float)(-fArray[(int)((long)-855141195 ^ (long)-855141196)][(int)((long)636468581 ^ (long)636468583)] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                        bus.r((int)((int)((long)1191153864 ^ (long)1191153867)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.G();
                        bus.b((double)0.375, (double)((double)f4 + 0.55), (double)0.0);
                        if (fArray[(int)((long)1496086395 ^ (long)1496086393)][(int)((long)-1921051460 ^ (long)-1921051460)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-2019665946 ^ (long)-2019665948)][(int)((long)-1167909509 ^ (long)-1167909509)] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)2108683134 ^ (long)2108683132)][(int)((long)610430005 ^ (long)610430004)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)-1456711049 ^ (long)-1456711051)][(int)((long)-562138630 ^ (long)-562138629)] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
                        }
                        if (fArray[(int)((long)955226772 ^ (long)955226774)][(int)((long)-1910350471 ^ (long)-1910350469)] != 0.0f) {
                            bus.b((float)(-fArray[(int)((long)-905994424 ^ (long)-905994422)][(int)((long)597222159 ^ (long)597222157)] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                        bus.r((int)((int)((long)-177933645 ^ (long)-177933648)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.G();
                        bus.b((double)0.0, (double)((double)f4 + 0.55), (double)0.0);
                        if (fArray[(int)((long)-758061965 ^ (long)-758061965)][(int)((long)1222464354 ^ (long)1222464354)] != 0.0f) {
                            bus.b((float)(fArray[(int)((long)1528081458 ^ (long)1528081458)][(int)((long)-1137281708 ^ (long)-1137281708)] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                        bus.r((int)((int)((long)-1797361441 ^ (long)-1797361444)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)0.3, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.H();
                        if (aed2.aU()) {
                            f2 = 25.0f;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        bus.b((float)f2, (float)1.0f, (float)0.0f, (float)0.0f);
                        if (aed2.aU()) {
                            d3 = -0.16175;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d3 = 0.0;
                        }
                        if (aed2.aU()) {
                            d2 = -0.48025;
                            if (\u2006\u2003\u2005) {
                                throw null;
                            }
                        } else {
                            d2 = 0.0;
                        }
                        bus.b((double)0.0, (double)d3, (double)d2);
                        bus.G();
                        bus.b((double)0.0, (double)f4, (double)0.0);
                        bus.r((int)((int)((long)132979554 ^ (long)132979553)));
                        GL11.glVertex3d((double)-0.125, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.125, (double)0.0, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.G();
                        bus.b((double)0.0, (double)f4, (double)0.0);
                        bus.r((int)((int)((long)1663354251 ^ (long)1663354248)));
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)0.55, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.G();
                        bus.b((double)0.0, (double)((double)f4 + 0.55), (double)0.0);
                        bus.r((int)((int)((long)-199843917 ^ (long)-199843920)));
                        GL11.glVertex3d((double)-0.375, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.375, (double)0.0, (double)0.0);
                        bus.J();
                        bus.H();
                        bus.H();
                    });
                    if (bl2 || bl2) break block2;
                    1A.0((boolean)((long)104362935 ^ (long)104362935));
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)-1892012059 ^ (long)-1892012059)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var1 = 0rT.\u2006\u2003\u2005;
                    if (!var1) break block15;
                    break block16;
                }
                v0 = (int)((long)1483830268 ^ (long)-1483830269);
                if (0rT.\u2006\u2003\u2005) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        0rT.a = new String(v1).intern();
                        if (0rT.\u2006\u2003\u2005) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u9892\u3182\uf25f\u0fdf\u9880\u31a6\uf268\u0fda", -884719872).toCharArray();
                v3 = v2.length;
                var0_1 = (int)((long)194710687 ^ (long)194710687);
                v4 = (int)((long)1357992924 ^ (long)1357992851);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-1761281061 ^ (long)-1761281062)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var0_1;
                        do {
                            switch (var0_1 % (int)((long)-806429209 ^ (long)-806429216)) {
                                case 0: {
                                    v11 = (int)((long)-415612690 ^ (long)-415612730);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)187944938 ^ (long)187944933);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)711424714 ^ (long)711424730);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)-1783854467 ^ (long)-1783854510);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-957943839 ^ (long)-957943827);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)305094006 ^ (long)305093954);
                                    if (!0rT.\u2006\u2003\u2005) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-958011444 ^ (long)-958011423);
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var0_1;
                            v4 = v7;
                            if (v7 != 0) break block14;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        } while (!0rT.\u2006\u2003\u2005);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var0_1);
                ** while (!0rT.\u2006\u2003\u2005)
lbl76:
                // 1 sources

                throw null;
            }
            0rT.0 = new HashMap<aed, float[][]>();
        }
    }
}

