/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  bus$l
 *  bus$r
 */
package net.impactclient;

import java.awt.Color;
import java.awt.Rectangle;
import net.impactclient.02;
import net.impactclient.0rB$1f;
import net.impactclient.1A;
import net.impactclient.1t;
import net.impactclient.2K;
import net.impactclient.2w;
import net.impactclient.3F;
import net.impactclient.5A;
import net.impactclient.5b;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 27
extends 2K {
    private static final 5A[] 0c;
    private boolean 0d;
    private Rectangle 0e;
    public static final boolean \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
    private Rectangle 0a;
    private Rectangle 2;
    private static final String a;
    private boolean 4;
    private 3F 0f;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, int n4) {
        block8: {
            int n5;
            block9: {
                block7: {
                    boolean bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                    if (bl2 || bl2) break block7;
                    if (!this.1(n2, n3)) break block8;
                    if (bl2 || bl2) break block7;
                    if (n4 != 0) break block8;
                    if (bl2 || bl2) break block7;
                    this.0d = this.0(n2, n3, this.0e);
                    if (bl2 || bl2) break block7;
                    this.4 = this.0(n2, n3, this.0a);
                    if (bl2 || bl2) break block7;
                    if (!this.0(n2, n3, this.2)) break block8;
                    if (!bl2 && !bl2) break block9;
                }
                return;
            }
            if (!02.a.1(this.0f)) {
                n5 = (int)((long)-773410620 ^ (long)-773410619);
                if (\u200e\u2003\u2001\u2009\u2001\u200a\u200e) {
                    throw null;
                }
            } else {
                n5 = (int)((long)-2019013861 ^ (long)-2019013861);
            }
            02.a.0(this.0f, n5 != 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n4, int n5, float f2) {
        block25: {
            block26: {
                5A a2;
                String[] stringArray;
                pw.knx.feather.structures.Color color;
                boolean bl2;
                block28: {
                    block27: {
                        bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                        if (bl2 || bl2) break block26;
                        float f3 = Math.min(0.7f + this.9 * 0.3f, 1.0f);
                        n4 = 2w.1(f3, f3, f3, 1.0f);
                        if (bl2 || bl2) break block26;
                        1.a(this.7, (float)(this.3 + (int)((long)829176699 ^ (long)829176677)), (float)(this.6 + (int)((long)-651735337 ^ (long)-651735330)), n4);
                        if (bl2) break block26;
                        String[] stringArray2 = 7b.0();
                        1A.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)(this.6 + (int)((long)1014041644 ^ (long)1014041615)), (int)(this.9 * 0.1f * 255.0f) << (int)((long)840140894 ^ (long)840140870));
                        1A.0(this.3, this.6, this.3 + this.0b, this.6 + this.5, 1.0f, (int)((long)521422969 ^ (long)1595164793), (int)((long)-1797871867 ^ (long)-1797871867));
                        color = (pw.knx.feather.structures.Color)this.0f.1();
                        bus.G();
                        bus.c((float)this.3, (float)this.6, (float)0.0f);
                        1A.0(this.0b - (int)((long)1186456311 ^ (long)1186456307) - (int)((long)1632664813 ^ (long)1632664820), 5.0f, this.0b - (int)((long)2041859728 ^ (long)2041859732), 30.0f, 1.0f, (int)((long)1007311507 ^ (long)2081053331), color.getHex());
                        bus.G();
                        bus.b((double)this.0e.getX(), (double)this.0e.getY(), (double)0.0);
                        stringArray = stringArray2;
                        if (bl2 || bl2) break block26;
                        n5 = (int)(color.getHue() * 360.0f + 0.5f);
                        if (n5 != (int)((long)-1178792571 ^ (long)-1178792723)) break block27;
                        if (bl2 || bl2) break block26;
                        n5 = (int)((long)2051607674 ^ (long)2051607674);
                        if (bl2) return;
                    }
                    if (bl2) break block26;
                    a2 = 0c[n5];
                    if (a2 != null) break block28;
                    if (bl2 || bl2) break block26;
                    a2 = 27.0c[n5] = 5A.0((n2, n3) -> {
                        boolean bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                        if (bl2 || bl2) {
                            return null;
                        }
                        return Color.HSBtoRGB(color.getHue(), (float)n2.intValue() / 204.0f, 1.0f - (float)n3.intValue() / 204.0f);
                    });
                    if (bl2) break block26;
                }
                if (!bl2) {
                    1t.0((int)((long)-1745434517 ^ (long)1745434516));
                    if (!bl2 && !bl2) {
                        5b[] bArray = new 5b[(int)((long)1859127489 ^ (long)1859127491)];
                        bArray[(int)((long)1442162975 ^ (long)1442162975)] = 5b.c;
                        bArray[(int)((long)1655183368 ^ (long)1655183369)] = 5b.b;
                        1A.0(bArray);
                        if (!bl2 && !bl2) {
                            bus.y();
                            if (!bl2 && !bl2) {
                                bus.i((int)a2.0);
                                if (!bl2 && !bl2) {
                                    1A.1.setTexture(0.0f, 1.0f).addVertex(0.0f, (float)this.0e.getHeight(), 0.0f).setTexture(1.0f, 1.0f).addVertex((float)this.0e.getWidth(), (float)this.0e.getHeight(), 0.0f).setTexture(1.0f, 0.0f).addVertex((float)this.0e.getWidth(), 0.0f, 0.0f).setTexture(0.0f, 0.0f).addVertex(0.0f, 0.0f, 0.0f).draw((int)((long)-1770921812 ^ (long)-1770921813));
                                    if (!bl2 && !bl2) {
                                        bus.i((int)((int)((long)1943319458 ^ (long)1943319458)));
                                        if (!bl2 && !bl2) {
                                            bus.z();
                                            if (!bl2 && !bl2) {
                                                1A.0();
                                                if (!bl2 && !bl2) {
                                                    1A.0(-1.0f, -1.0f, (float)this.0e.getWidth() + 1.0f, (float)this.0e.getHeight() + 1.0f, 1.0f, (int)((long)520528957 ^ (long)1594270781), (int)((long)496014148 ^ (long)496014148));
                                                    if (!bl2 && !bl2) {
                                                        float f4 = (float)(this.0e.getWidth() * (double)color.getSaturation());
                                                        if (!bl2 && !bl2) {
                                                            float f5 = (float)(this.0e.getHeight() * (double)(1.0f - color.getBrightness()));
                                                            if (!bl2 && !bl2) {
                                                                27.1();
                                                                if (!bl2 && !bl2) {
                                                                    1A.0(f4 - 1.0f, f5 - 1.0f, f4 + 1.0f, f5 + 1.0f, 1.0f, (int)((long)1798441529 ^ (long)-1798441530), (int)((long)-1446063034 ^ (long)-1446063034));
                                                                    if (!bl2 && !bl2) {
                                                                        27.0();
                                                                        if (!bl2 && !bl2) {
                                                                            bus.H();
                                                                            if (!bl2 && !bl2) {
                                                                                bus.G();
                                                                                if (!bl2 && !bl2) {
                                                                                    bus.b((double)this.0a.getX(), (double)this.0a.getY(), (double)0.0);
                                                                                    if (!bl2 && !bl2) {
                                                                                        int n6 = (int)((long)129280727 ^ (long)129280727);
                                                                                        if (bl2) return;
                                                                                        while (!bl2) {
                                                                                            if ((double)n6 < this.0a.getWidth()) {
                                                                                                if (bl2 || bl2) break;
                                                                                                1A.0((float)n6, 0.0f, (float)(n6 + (int)((long)219902700 ^ (long)219902701)), (float)this.0a.getHeight(), Color.HSBtoRGB((float)n6 / (float)this.0a.getWidth(), 1.0f, 1.0f));
                                                                                                if (bl2 || bl2) break;
                                                                                                ++n6;
                                                                                                if (bl2) break;
                                                                                                if (stringArray != null) {
                                                                                                    if (bl2) break;
                                                                                                    if (stringArray != null) continue;
                                                                                                    if (bl2) break;
                                                                                                }
                                                                                            } else {
                                                                                                if (bl2) break;
                                                                                                1A.0(-1.0f, -1.0f, (float)this.0a.getWidth() + 1.0f, (float)this.0a.getHeight() + 1.0f, 1.0f, (int)((long)-111739342 ^ (long)-1185481166), (int)((long)483260414 ^ (long)483260414));
                                                                                                if (bl2 || bl2) break;
                                                                                                27.1();
                                                                                                if (bl2) break;
                                                                                            }
                                                                                            if (bl2) break;
                                                                                            float f6 = color.getHue() * (float)this.0a.getWidth();
                                                                                            1A.0(f6, 0.0f, f6 + 1.0f, (float)this.0a.getHeight(), (int)((long)-1663236379 ^ (long)1663236378));
                                                                                            if (bl2 || bl2) break;
                                                                                            27.0();
                                                                                            if (bl2 || bl2) break;
                                                                                            bus.H();
                                                                                            if (bl2 || bl2) break;
                                                                                            bus.G();
                                                                                            if (bl2 || bl2) break;
                                                                                            bus.b((double)this.2.getX(), (double)this.2.getY(), (double)0.0);
                                                                                            if (bl2 || bl2) break;
                                                                                            if (02.a.1(this.0f)) {
                                                                                                if (bl2 || bl2) break;
                                                                                                1A.0(3.0f, 3.0f, (float)this.2.getWidth() - 3.0f, (float)this.2.getHeight() - 3.0f, (int)((long)672834775 ^ (long)149248808));
                                                                                                if (bl2) break;
                                                                                            }
                                                                                            if (bl2) break;
                                                                                            1A.0(0.0f, 0.0f, (float)this.2.getWidth(), (float)this.2.getHeight(), 1.0f, (int)((long)-1280273505 ^ (long)-206531681), (int)((long)-112569530 ^ (long)-112569530));
                                                                                            if (bl2 || bl2) break;
                                                                                            1.a(a, 22.0f, 1.0f, (int)((long)1321413121 ^ (long)-1321413122));
                                                                                            if (bl2 || bl2) break;
                                                                                            bus.H();
                                                                                            if (bl2 || bl2) break;
                                                                                            bus.H();
                                                                                            if (!bl2 && !bl2) break block25;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var1 = 27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                    if (!var1) break block15;
                    break block16;
                }
                v0 = (int)((long)526155878 ^ (long)-526155879);
                if (27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        27.a = new String(v1).intern();
                        if (27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\uedf5\uc515\u06d5\ufb73\uedfb\uc502\u069a", -739128355).toCharArray();
                v3 = v2.length;
                var0_1 = (int)((long)-1133299408 ^ (long)-1133299408);
                v4 = (int)((long)-1716793495 ^ (long)-1716793564);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)24593456 ^ (long)24593457)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var0_1;
                        do {
                            switch (var0_1 % (int)((long)127896142 ^ (long)127896137)) {
                                case 0: {
                                    v11 = (int)((long)-2020029659 ^ (long)-2020029597);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-2133148307 ^ (long)-2133148384);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-895365114 ^ (long)-895365041);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)-1343464906 ^ (long)-1343464856);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)2002204605 ^ (long)2002204613);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-34719095 ^ (long)-34719011);
                                    if (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-665797583 ^ (long)-665797591);
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
                        } while (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var0_1);
                ** while (!27.\u200e\u2003\u2001\u2009\u2001\u200a\u200e)
lbl76:
                // 1 sources

                throw null;
            }
            27.0c = new 5A[(int)((long)1115892944 ^ (long)1115893176)];
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
                    bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                    if (bl2 || bl2) break block2;
                    if (n4 != 0) break block3;
                    if (bl2 || bl2) break block2;
                    27 v0 = this;
                    v0.0d = v0.4 = (int)((long)357184651 ^ (long)357184651);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 2(int n2, int n3) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                    if (bl2 || bl2) break block2;
                    if (!27.0(n2, n3, this.3, this.6, this.0b, (int)((long)-302899313 ^ (long)-302899284))) break block3;
                    if (bl2 || bl2) break block2;
                    super.2(n2, n3);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void 0() {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                if (bl2 || bl2) break block2;
                bus.a((bus.r)bus.r.l, (bus.l)bus.l.j, (bus.r)bus.r.e, (bus.l)bus.l.n);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void 1() {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                if (bl2 || bl2) break block2;
                bus.m();
                if (bl2 || bl2) break block2;
                bus.a((bus.r)bus.r.i, (bus.l)bus.l.k, (bus.r)bus.r.e, (bus.l)bus.l.n);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 27(3F f2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                if (bl2 || bl2) break block2;
                this.7 = f2.2();
                if (bl2 || bl2) break block2;
                this.8 = f2.0();
                if (bl2 || bl2) break block2;
                this.0f = f2;
                if (bl2 || bl2) break block2;
                this.0e = new Rectangle();
                if (bl2 || bl2) break block2;
                this.0a = new Rectangle();
                if (bl2 || bl2) break block2;
                this.2 = new Rectangle();
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
        block5: {
            block2: {
                boolean bl3;
                block4: {
                    float f3;
                    pw.knx.feather.structures.Color color;
                    block3: {
                        bl3 = \u200e\u2003\u2001\u2009\u2001\u200a\u200e;
                        if (bl3 || bl3) break block2;
                        this.5 = this.0b + (int)((long)-2105212169 ^ (long)-2105212223);
                        if (bl3 || bl3) break block2;
                        this.0e.setBounds((int)((long)-123809873 ^ (long)-123809871), (int)((long)-694569145 ^ (long)-694569116), this.0b - (int)((long)-1340083178 ^ (long)-1340083147), this.0b - (int)((long)876398427 ^ (long)876398456));
                        if (bl3 || bl3) break block2;
                        this.0a.setBounds((int)((long)374889365 ^ (long)374889355), (int)((long)1073940397 ^ (long)1073940366) + this.0b - (int)((long)-195249700 ^ (long)-195249726), this.0b - (int)((long)-1288449718 ^ (long)-1288449687), (int)((long)657941608 ^ (long)657941628));
                        if (bl3 || bl3) break block2;
                        this.2.setBounds((int)((long)840667178 ^ (long)840667191), (int)((long)206437884 ^ (long)206437855) + this.0b - (int)((long)-195707294 ^ (long)-195707268) + (int)((long)1450231714 ^ (long)1450231734) + (int)((long)2106121949 ^ (long)2106121945), (int)((long)157244497 ^ (long)157244485), (int)((long)718363344 ^ (long)718363332));
                        if (bl3 || bl3) break block2;
                        if (!this.0d) break block3;
                        if (bl3 || bl3) break block2;
                        color = (pw.knx.feather.structures.Color)this.0f.1();
                        if (bl3 || bl3) break block2;
                        f3 = (float)(((double)n2 - ((double)this.3 + this.0e.getX())) / this.0e.getWidth());
                        if (bl3 || bl3) break block2;
                        float f4 = 1.0f - (float)(((double)n3 - ((double)this.6 + this.0e.getY())) / this.0e.getHeight());
                        if (bl3 || bl3) break block2;
                        this.0f.0(color.saturation(f3).brightness(f4));
                        if (bl3) break block2;
                    }
                    if (bl3) break block2;
                    if (!this.4) break block4;
                    if (bl3 || bl3) break block2;
                    color = (pw.knx.feather.structures.Color)this.0f.1();
                    if (bl3 || bl3) break block2;
                    f3 = (float)(((double)n2 - ((double)this.3 + this.0a.getX())) / this.0a.getWidth());
                    if (bl3 || bl3) break block2;
                    this.0f.0(color.hue(f3));
                    if (bl3) break block2;
                }
                if (bl3) break block2;
                super.0(n2, n3, bl2, f2);
                if (!bl3 && !bl3) break block5;
            }
            return;
        }
    }
}

