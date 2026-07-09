/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  aae
 *  aai
 *  aaj
 *  aak
 *  abd
 *  acy
 *  ade
 *  adf
 *  adi
 *  adl
 *  ady
 *  aed
 *  amu
 *  aow
 *  bus
 *  et
 *  fa
 *  org.lwjgl.opengl.GL11
 *  ub
 *  ud
 *  vg
 *  vp
 *  vq
 *  zo
 *  zt
 *  zv
 */
package net.impactclient;

import java.awt.Color;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import me.zero.clarinet.hook.mixin.accessor.AccessorKeyBinding;
import net.impactclient.0T;
import net.impactclient.0_;
import net.impactclient.0g;
import net.impactclient.0r6;
import net.impactclient.0rG;
import net.impactclient.19;
import net.impactclient.1A;
import net.impactclient.38;
import net.impactclient.3Z;
import net.impactclient.6f;
import net.impactclient.7Q;
import net.impactclient.7b;
import org.lwjgl.opengl.GL11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class 2w
implements 0r6,
0T {
    public final Method 0;
    public final String[] 1;
    public final 6f 3;
    private static int 6;
    public final List<7Q> 4;
    public static final boolean \u2001\u2002\u2002\u2009\u200b\u2002;
    private final String 5;

    /*
     * Enabled aggressive block sorting
     */
    public static void 3() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) break block2;
                    if ((6 += (int)((long)535303066 ^ (long)535303067)) != (int)((long)1618928257 ^ (long)1618928256)) break block3;
                    if (bl2 || bl2) break block2;
                    GL11.glEnable((int)((int)((long)119745432 ^ (long)119742472)));
                    if (bl2 || bl2) break block2;
                    bus.m((int)((int)((long)1235823195 ^ (long)1235824219)));
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                GL11.glPushAttrib((int)((int)((long)123125845 ^ (long)123126869)));
                if (bl2 || bl2) break block2;
                bus.a((boolean)((long)1688051260 ^ (long)1688051260), (boolean)((long)-86246382 ^ (long)-86246382), (boolean)((long)-1663369037 ^ (long)-1663369037), (boolean)((long)-682502239 ^ (long)-682502239));
                if (bl2 || bl2) break block2;
                bus.a((boolean)((long)488115164 ^ (long)488115164));
                if (bl2 || bl2) break block2;
                int n2 = 6;
                GL11.glStencilFunc((int)((int)((long)1946905250 ^ (long)1946904741)), (int)n2, (int)n2);
                if (bl2 || bl2) break block2;
                GL11.glStencilOp((int)((int)((long)665464740 ^ (long)665465254)), (int)((int)((long)1251748958 ^ (long)1251750492)), (int)((int)((long)-1725772247 ^ (long)-1725771733)));
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean 0(aae aae2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return true;
        if (aae2.l_()) {
            if (bl2 || bl2) return true;
            return (int)((long)-36127912 ^ (long)-36127912) != 0;
        }
        if (bl2) return true;
        if (2w.0((vq)aae2, (vp)2w.2.h)) {
            if (bl2 || bl2) return true;
            return (int)((long)-853220006 ^ (long)-853220005) != 0;
        }
        if (!bl2) return (int)((long)1521737195 ^ (long)1521737195) != 0;
        return true;
    }

    public static int 0(char c2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return -1156560686;
        }
        return (int)((long)368970991 ^ (long)-352449297) | 2w.2.k.b(c2);
    }

    public static 0rG 2(Supplier<Boolean> supplier) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return new 0g(0_.a, vg2 -> {
            boolean bl2;
            block8: {
                block7: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) return true;
                    if (((Boolean)supplier.get()).booleanValue()) break block7;
                    if (bl2) return true;
                    if (vg2.aX()) break block8;
                    if (bl2) return true;
                }
                if (bl2) return true;
                return (int)((long)-1686298706 ^ (long)-1686298705) != 0;
            }
            if (!bl2) return (int)((long)-998141703 ^ (long)-998141703) != 0;
            return true;
        });
    }

    public static float[] 1(int n2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        float[] fArray = new float[(int)((long)155808819 ^ (long)155808823)];
        fArray[(int)((long)546913760 ^ (long)546913760)] = (float)(n2 >> (int)((long)-1404794878 ^ (long)-1404794862) & (int)((long)-1269168207 ^ (long)-1269168306)) / 255.0f;
        fArray[(int)((long)-2058893904 ^ (long)-2058893903)] = (float)(n2 >> (int)((long)-444158859 ^ (long)-444158851) & (int)((long)173930857 ^ (long)173930902)) / 255.0f;
        fArray[(int)((long)1348015340 ^ (long)1348015342)] = (float)(n2 & (int)((long)468809856 ^ (long)468809855)) / 255.0f;
        fArray[(int)((long)1369702362 ^ (long)1369702361)] = (float)(n2 >>> (int)((long)-740462021 ^ (long)-740462045)) / 255.0f;
        return fArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 2() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                2w.2.c.c();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 1() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) break block2;
                    GL11.glPopAttrib();
                    if (bl2 || bl2) break block2;
                    int n2 = 6;
                    6 = n2 - (int)((long)-520214890 ^ (long)-520214889);
                    if (n2 != (int)((long)-266285919 ^ (long)-266285920)) break block3;
                    if (bl2 || bl2) break block2;
                    GL11.glDisable((int)((int)((long)1332452111 ^ (long)1332449439)));
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
    public static boolean 1(vg vg2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return true;
        if (vg2 instanceof adf) {
            if (bl2 || bl2) return true;
            if (!((adf)vg2).dp()) {
                if (bl2) return true;
                return (int)((long)509359233 ^ (long)509359232) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)1523022567 ^ (long)1523022567) != 0;
            }
        }
        if (bl2) return true;
        if (vg2 instanceof aak) {
            if (bl2 || bl2) return true;
            if (!2w.0((aak)vg2)) {
                if (bl2) return true;
                return (int)((long)1540790306 ^ (long)1540790307) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)-1813804063 ^ (long)-1813804063) != 0;
            }
        }
        if (bl2) return true;
        if (vg2 instanceof aae) {
            if (bl2 || bl2) return true;
            if (!2w.0((aae)vg2)) {
                if (bl2) return true;
                return (int)((long)-1924545151 ^ (long)-1924545152) != 0;
            } else {
                if (bl2) return true;
                return (int)((long)-266663816 ^ (long)-266663816) != 0;
            }
        }
        if (bl2) return true;
        if (vg2 instanceof zv) {
            if (bl2 || bl2) return true;
            return (int)((long)41251081 ^ (long)41251080) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof aaj) {
            if (bl2 || bl2) return true;
            return (int)((long)999388356 ^ (long)999388357) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof zt) {
            if (bl2 || bl2) return true;
            return (int)((long)-1278583848 ^ (long)-1278583847) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof ady) {
            if (bl2 || bl2) return true;
            return (int)((long)200166243 ^ (long)200166242) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof aai) {
            if (bl2 || bl2) return true;
            return (int)((long)126998107 ^ (long)126998106) != 0;
        }
        if (!bl2) return (int)((long)802041950 ^ (long)802041950) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 4() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                bus.a((boolean)((long)-821994811 ^ (long)-821994812), (boolean)((long)1006435093 ^ (long)1006435092), (boolean)((long)1334273019 ^ (long)1334273018), (boolean)((long)-1079525580 ^ (long)-1079525579));
                if (bl2 || bl2) break block2;
                bus.a((boolean)((long)-617072645 ^ (long)-617072646));
                if (bl2 || bl2) break block2;
                int n2 = 6;
                GL11.glStencilFunc((int)((int)((long)-204062203 ^ (long)-204062713)), (int)n2, (int)n2);
                if (bl2 || bl2) break block2;
                GL11.glStencilOp((int)((int)((long)607695011 ^ (long)607694499)), (int)((int)((long)1178793896 ^ (long)1178790312)), (int)((int)((long)-701325411 ^ (long)-701333091)));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 0(vg vg2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return true;
        if (vg2 instanceof adf) {
            if (bl2 || bl2) return true;
            return ((adf)vg2).dp();
        }
        if (bl2) return true;
        if (vg2 instanceof aak) {
            if (bl2 || bl2) return true;
            return 2w.0((aak)vg2);
        }
        if (bl2) return true;
        if (vg2 instanceof aae) {
            if (bl2 || bl2) return true;
            return 2w.0((aae)vg2);
        }
        if (bl2) return true;
        if (vg2 instanceof ade) {
            if (bl2 || bl2) return true;
            return (int)((long)1091287090 ^ (long)1091287091) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof adl) {
            if (bl2 || bl2) return true;
            return (int)((long)-1615393748 ^ (long)-1615393747) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof adi) {
            if (bl2 || bl2) return true;
            return (int)((long)-766941573 ^ (long)-766941574) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof acy) {
            if (bl2 || bl2) return true;
            return (int)((long)-1797644224 ^ (long)-1797644223) != 0;
        }
        if (bl2) return true;
        if (vg2 instanceof abd) {
            if (bl2 || bl2) return true;
            return (int)((long)-914512021 ^ (long)-914512022) != 0;
        }
        if (!bl2) return (int)((long)469502648 ^ (long)469502648) != 0;
        return true;
    }

    public static 0rG 0(Supplier<Boolean> supplier) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return new 0g(0_.a, vg2 -> {
            boolean bl2;
            block8: {
                block7: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) return true;
                    if (((Boolean)supplier.get()).booleanValue()) break block7;
                    if (bl2) return true;
                    if (!vg2.aC()) break block8;
                    if (bl2) return true;
                }
                if (bl2) return true;
                return (int)((long)-785184709 ^ (long)-785184710) != 0;
            }
            if (!bl2) return (int)((long)-806874030 ^ (long)-806874030) != 0;
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public static aow 0(et et2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return null;
        if (2w.2.f == null) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return 2w.2.f.o(et2).u();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int 0(int n2, int n3, int n4, int n5) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                n2 = 2w.0(n2);
                if (bl2 || bl2) break block2;
                n3 = 2w.0(n3);
                if (bl2 || bl2) break block2;
                n4 = 2w.0(n4);
                if (!bl2 && !bl2) break block3;
            }
            return -654277660;
        }
        return (2w.0(n5) & (int)((long)1160478324 ^ (long)1160478347)) << (int)((long)277713590 ^ (long)277713582) | (n2 & (int)((long)1884339345 ^ (long)1884339310)) << (int)((long)-700830235 ^ (long)-700830219) | (n3 & (int)((long)2119212804 ^ (long)2119213051)) << (int)((long)-1451762679 ^ (long)-1451762687) | n4 & (int)((long)298363985 ^ (long)298364078);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(float f2, float f3, float f4, float f5) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                2w.3();
                if (bl2 || bl2) break block2;
                1A.0(f2, f3, f4, f5, (int)((long)2074495939 ^ (long)-2074495940));
                if (bl2 || bl2) break block2;
                2w.4();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean 0(aak aak2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return true;
        if (aak2.dn()) {
            if (bl2 || bl2) return true;
            return (int)((long)861635085 ^ (long)861635085) != 0;
        }
        if (bl2) return true;
        zo zo2 = aak2.p();
        if (zo2 != null) {
            if (bl2) return true;
            if (zo2.d(2w.2.h.h_())) {
                if (bl2 || bl2) return true;
                return (int)((long)1501696582 ^ (long)1501696583) != 0;
            }
        }
        if (bl2) return true;
        if (2w.0((vq)aak2, (vp)2w.2.h)) {
            if (bl2 || bl2) return true;
            return (int)((long)-158728154 ^ (long)-158728153) != 0;
        }
        if (!bl2) return (int)((long)-324814193 ^ (long)-324814193) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static aow 0(3Z z2) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                Objects.requireNonNull(z2);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return 2w.0(new et(z2.2, z2.0, z2.1));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(et et2, fa fa2, boolean bl2) {
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    bl3 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl3 || bl3) break block2;
                    if (!2w.2.c.b(et2, fa2)) break block3;
                    if (bl3) break block2;
                    if (!bl2) break block3;
                    if (bl3 || bl3) break block2;
                    2w.2.h.a(ub.a);
                    if (bl3) break block2;
                }
                if (!bl3) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean 0(vq vq2, vp vp2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return true;
        vp vp3 = vq2.z();
        if (bl2 || bl2) return true;
        vq2 = vq2.bS();
        if (bl2 || bl2) return true;
        if (vp3 != null) {
            if (bl2) return true;
            if (vp3.equals((Object)vp2)) {
                if (bl2 || bl2) return true;
                return (int)((long)2041787905 ^ (long)2041787904) != 0;
            }
        }
        if (bl2) return true;
        if (vq2 != null) {
            if (bl2) return true;
            if (vq2.equals((Object)vp2)) {
                if (bl2 || bl2) return true;
                return (int)((long)1415407940 ^ (long)1415407941) != 0;
            }
        }
        if (!bl2) return (int)((long)-1134238609 ^ (long)-1134238609) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void 0(19 stringArray) {
        boolean bl2;
        block5: {
            int n2;
            String[] stringArray2;
            block4: {
                block3: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2) return;
                    stringArray = stringArray.0();
                    stringArray2 = 7b.0();
                    if (bl2) return;
                    if (bl2) return;
                    int n3 = this.0.getParameterCount() - (int)((long)261859540 ^ (long)261859541);
                    if (bl2) return;
                    if (bl2) return;
                    if (stringArray.length != n3) {
                        if (bl2) return;
                        if (bl2) return;
                        stringArray = new String[n3];
                        if (bl2) return;
                        if (bl2) return;
                        n2 = (int)((long)251621669 ^ (long)251621669);
                        if (bl2) return;
                        do {
                            if (bl2) return;
                            if (n2 >= n3) break block3;
                            if (bl2) return;
                            if (bl2) return;
                            stringArray[n2] = this.0.getParameters()[n2 + (int)((long)1150357629 ^ (long)1150357628)].getName();
                            if (bl2) return;
                            if (bl2) return;
                            ++n2;
                            if (bl2) return;
                            if (stringArray2 == null) break block4;
                            if (bl2) return;
                        } while (stringArray2 != null);
                        if (bl2) return;
                    }
                }
                if (bl2) return;
                n2 = (int)((long)638463407 ^ (long)638463406);
                if (bl2) return;
            }
            do {
                if (bl2) return;
                if (n2 >= this.0.getGenericParameterTypes().length) break block5;
                if (bl2) return;
                if (bl2) return;
                Type type = this.0.getGenericParameterTypes()[n2];
                if (bl2) return;
                if (bl2) return;
                this.4.add(new 7Q(stringArray[n2 - (int)((long)1004805044 ^ (long)1004805045)], type));
                if (bl2) return;
                if (bl2) return;
                ++n2;
                if (bl2) return;
            } while (stringArray2 != null);
            if (bl2) return;
        }
        if (bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2w(6f f2, Method method) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                19 var3_4 = method.getAnnotation(19.class);
                if (bl2 || bl2) break block2;
                this.1 = var3_4.1();
                if (bl2 || bl2) break block2;
                this.5 = var3_4.2();
                if (bl2 || bl2) break block2;
                this.4 = new ArrayList<7Q>();
                if (bl2 || bl2) break block2;
                this.3 = f2;
                if (bl2 || bl2) break block2;
                this.0 = method;
                if (bl2 || bl2) break block2;
                this.0(var3_4);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int 0(float[] fArray) {
        float f2;
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) return 1477606055;
        if (fArray.length < (int)((long)-1576680705 ^ (long)-1576680708)) {
            return (int)((long)-346267937 ^ (long)346267936);
        }
        if (bl2 || bl2) {
            return 1477606055;
        }
        float f3 = fArray[(int)((long)195533465 ^ (long)195533465)];
        float f4 = fArray[(int)((long)-1830068447 ^ (long)-1830068448)];
        float f5 = fArray[(int)((long)232810410 ^ (long)232810408)];
        if (fArray.length > (int)((long)-1082569571 ^ (long)-1082569570)) {
            f2 = fArray[(int)((long)-815701084 ^ (long)-815701081)];
            if (!\u2001\u2002\u2002\u2009\u200b\u2002) return 2w.1(f3, f4, f5, f2);
            throw null;
        } else {
            f2 = 1.0f;
        }
        return 2w.1(f3, f4, f5, f2);
    }

    @Override
    public final String 0() {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return this.5;
    }

    public static 38 0(Supplier<Boolean> supplier, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        0rG[] rGArray = new 0rG[(int)((long)859573268 ^ (long)859573271)];
        rGArray[(int)((long)1814604664 ^ (long)1814604664)] = new 0g(0_.b, vg2 -> {
            boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
            if (bl2 || bl2) return true;
            if (((Boolean)supplier.get()).booleanValue()) {
                if (bl2) return true;
                if (vg2 instanceof aed) {
                    if (bl2) return true;
                    return (int)((long)441791640 ^ (long)441791641) != 0;
                }
            }
            if (!bl2) return (int)((long)-829108972 ^ (long)-829108972) != 0;
            return true;
        });
        supplier = supplier2;
        rGArray[(int)((long)-1395032270 ^ (long)-1395032269)] = new 0g(0_.b, vg2 -> {
            boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
            if (bl2 || bl2) return true;
            if (((Boolean)supplier.get()).booleanValue()) {
                if (bl2) return true;
                if (2w.0(vg2)) {
                    if (bl2) return true;
                    return (int)((long)-1809978666 ^ (long)-1809978665) != 0;
                }
            }
            if (!bl2) return (int)((long)1347262942 ^ (long)1347262942) != 0;
            return true;
        });
        supplier = supplier3;
        rGArray[(int)((long)1775729664 ^ (long)1775729666)] = new 0g(0_.b, vg2 -> {
            boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
            if (bl2 || bl2) return true;
            if (((Boolean)supplier.get()).booleanValue()) {
                if (bl2) return true;
                if (2w.1(vg2)) {
                    if (bl2) return true;
                    return (int)((long)-1944447182 ^ (long)-1944447181) != 0;
                }
            }
            if (!bl2) return (int)((long)881618857 ^ (long)881618857) != 0;
            return true;
        });
        return new 38(rGArray);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void 5() {
        boolean bl2;
        block4: {
            bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
            if (bl2) return;
            if (bl2) return;
            ((AccessorKeyBinding)2w.2.t.ad).setPressed((boolean)((long)1635447179 ^ (long)1635447178));
            if (bl2) return;
            if (bl2) return;
            if (2w.2.m != null) {
                if (bl2) return;
                if (bl2) return;
                ub[] ubArray = ub.values();
                int n2 = ubArray.length;
                if (bl2) return;
                int n3 = (int)((long)1992980831 ^ (long)1992980831);
                if (bl2) return;
                do {
                    if (bl2) return;
                    if (n3 >= n2) break block4;
                    if (bl2) return;
                    ub ub2 = ubArray[n3];
                    if (bl2) return;
                    if (bl2) return;
                    if (!2w.2.h.b(ub2).b()) {
                        if (bl2) return;
                        if (2w.2.c.a((aed)2w.2.h, (amu)2w.2.f, ub2) == ud.a) {
                            if (bl2) return;
                            if (bl2) return;
                            return;
                        }
                    }
                    if (bl2) return;
                    ++n3;
                    if (bl2) return;
                } while (!\u2001\u2002\u2002\u2009\u200b\u2002);
                throw null;
            }
        }
        if (bl2) return;
    }

    public static 0rG 1(Supplier<vg> supplier) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return new 0g(0_.a, vg2 -> {
            boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
            if (bl2 || bl2) return true;
            if (vg2 != supplier.get()) {
                if (bl2) return true;
                return (int)((long)-413448081 ^ (long)-413448082) != 0;
            }
            if (!bl2) return (int)((long)964982890 ^ (long)964982890) != 0;
            return true;
        });
    }

    public static int 0(int n2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return -1776348670;
        }
        return 7Q.0(n2, (int)((long)161143611 ^ (long)161143611), (int)((long)-17305574 ^ (long)-17305371));
    }

    public static 0rG 3(Supplier<Boolean> supplier) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return null;
        }
        return new 0g(0_.a, vg2 -> {
            boolean bl2;
            block8: {
                block7: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) return true;
                    if (((Boolean)supplier.get()).booleanValue()) break block7;
                    if (bl2) return true;
                    if (!2w.2.h.D(vg2)) break block8;
                    if (bl2) return true;
                }
                if (bl2) return true;
                return (int)((long)-1731530274 ^ (long)-1731530273) != 0;
            }
            if (!bl2) return (int)((long)-1913363383 ^ (long)-1913363383) != 0;
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int 0(int n2, int n3, float f2) {
        float[] fArray;
        float[] fArray2;
        float f3;
        block3: {
            block2: {
                boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                if (bl2 || bl2) break block2;
                f3 = 1.0f - f2;
                if (bl2 || bl2) break block2;
                fArray2 = 2w.1(n2);
                if (bl2 || bl2) break block2;
                fArray = 2w.1(n3);
                if (!bl2 && !bl2) break block3;
            }
            return -1679590224;
        }
        return 2w.1(fArray2[(int)((long)-489877532 ^ (long)-489877532)] * f2 + fArray[(int)((long)-1902691659 ^ (long)-1902691659)] * f3, fArray2[(int)((long)-1164373930 ^ (long)-1164373929)] * f2 + fArray[(int)((long)360602936 ^ (long)360602937)] * f3, fArray2[(int)((long)1731516126 ^ (long)1731516124)] * f2 + fArray[(int)((long)1943076118 ^ (long)1943076116)] * f3, fArray2[(int)((long)-707310513 ^ (long)-707310516)] * f2 + fArray[(int)((long)-839178982 ^ (long)-839178983)] * f3);
    }

    public static int 0(a a2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return 1657650760;
        }
        return 2w.0(a2.toString().charAt((int)((long)-1252249473 ^ (long)-1252249474)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
                    if (bl2 || bl2) break block2;
                    if (!2w.2.h.cG()) break block3;
                    if (bl2 || bl2) break block2;
                    2w.2.c.c((aed)2w.2.h);
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                ((AccessorKeyBinding)2w.2.t.ad).setPressed((boolean)((long)1750456386 ^ (long)1750456386));
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }

    public static int 1(float f2, float f3, float f4, float f5) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return 722784825;
        }
        return 2w.0((int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f), (int)(f5 * 255.0f));
    }

    public static int 0(float f2, float f3, int n2) {
        boolean bl2 = \u2001\u2002\u2002\u2009\u200b\u2002;
        if (bl2 || bl2) {
            return -266183101;
        }
        return Color.getHSBColor((float)((System.nanoTime() / (0xFE577D2DFF34966FL ^ 0xFE577D2DFF3BD42FL) + (long)n2) % (0xA0DEB765F3FEE3C0L ^ 0xA0DEB765F3FEE028L)) / 1000.0f, f2, f3).getRGB();
    }
}

