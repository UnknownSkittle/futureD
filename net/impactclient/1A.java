/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  bus$l
 *  bus$r
 *  org.lwjgl.opengl.GL11
 *  rk
 */
package net.impactclient;

import java.util.Stack;
import net.impactclient.1s;
import net.impactclient.5b;
import net.impactclient.7b;
import org.lwjgl.opengl.GL11;
import pw.knx.feather.structures.Color;
import pw.knx.feather.tessellate.Tessellator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1A {
    private static final Stack<5b[]> 0;
    public static final Tessellator 1;
    public static final boolean \u200f\u200f\u2001\u2008\u200e\u200b\u200f;

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(5b ... bArray) {
        block5: {
            boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
            if (!bl2 && !bl2) {
                0.push(bArray);
                if (!bl2 && !bl2) {
                    int n2 = bArray.length;
                    if (!bl2) {
                        int n3 = (int)((long)-1424928134 ^ (long)-1424928134);
                        if (bl2) return;
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2) break;
                                bus.q((int)bArray[n3].d);
                                if (bl2 || bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (!\u200f\u200f\u2001\u2008\u200e\u200b\u200f) continue;
                                throw null;
                            }
                            if (!bl2) break block5;
                        }
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, float f4, float f5, float f6) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                if (bl2 || bl2) break block2;
                1A.1(f2, f3, f4, f5, f6);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(1s s2, 1s s3, float f2) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                if (bl2 || bl2) break block2;
                1A.0(s2.1, s2.0, s3.1, s3.0, f2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    static {
        boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
        if (bl2 || bl2) {
        } else {
            1 = Tessellator.createExpanding((int)((long)-310807776 ^ (long)-310807772), 1.0f, 2.0f);
            if (!bl2 && !bl2) {
                0 = new Stack();
                if (!bl2) {
                    // empty if block
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, float f4, float f5, float f6, int n2, int n3) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                if (bl2 || bl2) break block2;
                1A.0(f2 + f6, f3 + f6, f4 - f6, f5 - f6, n3);
                if (bl2 || bl2) break block2;
                1A.0(f2 + f6, f3, f4 - f6, f3 + f6, n2);
                if (bl2 || bl2) break block2;
                1A.0(f2, f3, f2 + f6, f5, n2);
                if (bl2 || bl2) break block2;
                1A.0(f4 - f6, f3, f4, f5, n2);
                if (bl2 || bl2) break block2;
                1A.0(f2 + f6, f5 - f6, f4 - f6, f5, n2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void 1(float f2, float f3, float f4, float f5, float f6) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                if (bl2 || bl2) break block2;
                bus.d((float)f6);
                if (bl2 || bl2) break block2;
                1A.0((boolean)((long)-1893013598 ^ (long)-1893013597));
                if (bl2 || bl2) break block2;
                5b[] bArray = new 5b[(int)((long)581245222 ^ (long)581245223)];
                bArray[(int)((long)-495915423 ^ (long)-495915423)] = 5b.c;
                1A.0(bArray);
                if (bl2 || bl2) break block2;
                1.addVertex(f2, f3, 0.0f).addVertex(f4, f5, 0.0f).draw((int)((long)-195422183 ^ (long)-195422182));
                if (bl2 || bl2) break block2;
                1A.0();
                if (bl2 || bl2) break block2;
                1A.0((boolean)((long)-413487981 ^ (long)-413487981));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, float f4, float f5, int n2) {
        block5: {
            block2: {
                boolean bl2;
                block4: {
                    float f6;
                    block3: {
                        bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                        if (bl2 || bl2) break block2;
                        if (!(f2 > f4)) break block3;
                        if (bl2 || bl2) break block2;
                        f6 = f2;
                        if (bl2 || bl2) break block2;
                        f2 = f4;
                        if (bl2 || bl2) break block2;
                        f4 = f6;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    if (!(f3 > f5)) break block4;
                    if (bl2 || bl2) break block2;
                    f6 = f3;
                    if (bl2 || bl2) break block2;
                    f3 = f5;
                    if (bl2 || bl2) break block2;
                    f5 = f6;
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                1A.0((boolean)((long)45393615 ^ (long)45393614));
                if (bl2 || bl2) break block2;
                5b[] bArray = new 5b[(int)((long)-653583060 ^ (long)-653583058)];
                bArray[(int)((long)-1771217047 ^ (long)-1771217047)] = 5b.c;
                bArray[(int)((long)-796028664 ^ (long)-796028663)] = 5b.a;
                1A.0(bArray);
                if (bl2 || bl2) break block2;
                1.setColor(1A.0(n2)).addVertex(f2, f5, 0.0f).setColor(1A.0(n2)).addVertex(f4, f5, 0.0f).setColor(1A.0(n2)).addVertex(f4, f3, 0.0f).setColor(1A.0(n2)).addVertex(f2, f3, 0.0f).draw((int)((long)432890637 ^ (long)432890634));
                if (bl2 || bl2) break block2;
                1A.0();
                if (bl2 || bl2) break block2;
                1A.0((boolean)((long)906588490 ^ (long)906588490));
                if (!bl2 && !bl2) break block5;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(boolean bl2) {
        int n2;
        block10: {
            block8: {
                block9: {
                    block5: {
                        boolean bl3;
                        block7: {
                            block6: {
                                bl3 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                                if (bl3) break block5;
                                String[] stringArray = 7b.0();
                                if (bl3 || bl3) break block5;
                                if (!bl2) break block6;
                                if (bl3 || bl3) break block5;
                                bus.m();
                                if (bl3 || bl3) break block5;
                                GL11.glEnable((int)((int)((long)-1078035001 ^ (long)-1078036761)));
                                if (bl3 || bl3) break block5;
                                bus.j();
                                if (bl3 || bl3) break block5;
                                bus.z();
                                if (bl3 || bl3) break block5;
                                bus.a((bus.r)bus.r.l, (bus.l)bus.l.j);
                                if (bl3 || bl3) break block5;
                                GL11.glHint((int)((int)((long)1017718893 ^ (long)1017717823)), (int)((int)((long)1427909412 ^ (long)1427913254)));
                                if (bl3) break block5;
                                if (stringArray != null) break block7;
                                if (bl3) break block5;
                            }
                            if (bl3) break block5;
                            bus.l();
                            if (bl3 || bl3) break block5;
                            bus.y();
                            if (bl3 || bl3) break block5;
                            GL11.glDisable((int)((int)((long)-214706433 ^ (long)-214704673)));
                            if (bl3 || bl3) break block5;
                            bus.k();
                            if (bl3) break block5;
                        }
                        if (bl3) break block5;
                        if (bl2) break block8;
                        if (!bl3) break block9;
                    }
                    return;
                }
                n2 = (int)((long)284278920 ^ (long)284278921);
                if (\u200f\u200f\u2001\u2008\u200e\u200b\u200f) {
                    throw null;
                }
                break block10;
            }
            n2 = (int)((long)-1221295688 ^ (long)-1221295688);
        }
        bus.a(n2 != 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2) {
        block6: {
            boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
            if (!bl2) {
                String[] stringArray = 7b.0();
                1A.0((boolean)((long)1128741019 ^ (long)1128741018));
                5b[] bArray = new 5b[(int)((long)-396699950 ^ (long)-396699952)];
                bArray[(int)((long)422531051 ^ (long)422531051)] = 5b.c;
                bArray[(int)((long)995817577 ^ (long)995817576)] = 5b.a;
                1A.0(bArray);
                String[] stringArray2 = stringArray;
                if (!bl2 && !bl2) {
                    int n2 = (int)((long)1428943392 ^ (long)1428943688);
                    if (bl2) return;
                    while (!bl2) {
                        if (n2 >= 0) {
                            if (bl2 || bl2) break;
                            float f3 = 0.0f + rk.b((float)((float)n2 / 180.0f * (float)Math.PI)) * f2;
                            if (bl2 || bl2) break;
                            float f4 = 0.0f + rk.a((float)((float)n2 / 180.0f * (float)Math.PI)) * f2;
                            if (bl2 || bl2) break;
                            1.setColor(1A.0((int)((long)1845345285 ^ (long)-1845345286))).addVertex(f3, f4, 0.0f);
                            if (bl2 || bl2) break;
                            --n2;
                            if (bl2) break;
                            if (stringArray2 != null) {
                                if (bl2) break;
                                if (stringArray2 != null) continue;
                                if (bl2) break;
                            }
                        } else {
                            if (bl2) break;
                            1.draw((int)((long)330396732 ^ (long)330396725));
                            if (bl2 || bl2) break;
                            1A.0();
                            if (bl2 || bl2) break;
                            1A.0((boolean)((long)-2046174408 ^ (long)-2046174408));
                            if (bl2) break;
                        }
                        if (!bl2) break block6;
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0() {
        block4: {
            boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
            if (!bl2 && !bl2) {
                5b[] bArray = 0.pop();
                int n2 = bArray.length;
                if (!bl2) {
                    int n3 = (int)((long)233256009 ^ (long)233256009);
                    if (bl2) return;
                    while (!bl2) {
                        if (n3 < n2) {
                            if (bl2) break;
                            bus.p((int)bArray[n3].d);
                            if (bl2 || bl2) break;
                            ++n3;
                            if (bl2) break;
                            if (!\u200f\u200f\u2001\u2008\u200e\u200b\u200f) continue;
                            throw null;
                        }
                        if (!bl2) break block4;
                    }
                }
            }
            return;
        }
    }

    public static int 0(int n2) {
        boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
        if (bl2 || bl2) {
            return -839216906;
        }
        return Color.HexFormat.ARGB.convert(n2, Color.HexFormat.ABGR);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, float f4, float f5) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u200f\u2001\u2008\u200e\u200b\u200f;
                if (bl2 || bl2) break block2;
                1A.0(f2, f3, f4, f5, 0.5f, (int)((long)1731441387 ^ (long)-245901681), (int)((long)-1927428075 ^ (long)454541855));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

