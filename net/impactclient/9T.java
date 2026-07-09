/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ahg
 *  ahv
 *  aib
 *  ain
 *  aip
 *  ajd
 *  aju
 *  bhb
 *  bhc
 *  bhe
 *  bud
 *  bus
 *  bus$l
 *  bus$r
 *  org.lwjgl.opengl.GL11
 *  rk
 *  rr
 *  vg
 *  vk
 */
package net.impactclient;

import com.google.common.base.Predicates;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorRenderManager;
import net.impactclient.0rA;
import net.impactclient.0rB$1f;
import net.impactclient.0rL;
import net.impactclient.0ri;
import net.impactclient.0ry;
import net.impactclient.1H;
import net.impactclient.1_;
import net.impactclient.1t;
import net.impactclient.2O;
import net.impactclient.2a;
import net.impactclient.2r;
import net.impactclient.5O;
import net.impactclient.5Y;
import net.impactclient.5t;
import net.impactclient.73;
import net.impactclient.7b;
import org.lwjgl.opengl.GL11;
import pw.knx.feather.structures.Color;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9T
extends 73
implements 5O {
    @EventHandler
    private final Listener<5Y> 4;
    private static final String[] d;
    public static final boolean \u2004\u200f\u200d\u2006;
    private 0ri 3;
    private 0ri 5;
    private static final String[] e;
    private 0rL 1;
    private 0rA 0;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 9T.\u2004\u200f\u200d\u2006;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)1242156873 ^ (long)1242156870)];
            if (var7) break block23;
            var3_2 = (int)((long)388061992 ^ (long)388061992);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\uf435\udd44\u1ee7\ue3c9\uf4a4\uddad\u1eaf\ue3cc\uf4f1\udd3d\u1e58\ue33a\uf4e3\uddac\u1edc\ue30a\uf404\udd31\u1e05\ue354\uf4aa\udd6d\u1e7c\ue3a0\uf424\udde7\u1ec7\ue3d8\uf44a\uddab\u1edd\ue322\uf4c8\udd20\u1ecb\ue3c1\uf455\udd54\u1e40\ue30d\uf497\udd02\u1e9e\ue334\uf439\udd2e\u1eb7\ue329\uf47e\uddf5\u1e0a\ue32d\uf4fe\udd70\u1eca\ue3c8\uf412\uddcd\u1e2c\ue3e0\uf42d\uddae\u1e78\ue366\uf465\udd3f\u1e9a\ue3bb\uf44e\udd59\u1e25\ue3df\uf4b4\udd24\u1e17\ue311\uf472\uddd4\u1eae\ue353\uf415\uddbe\u1ee1\ue32b\uf4fd\udd97\u1e2f\ue354\uf47f\udd3f\u1e3b\ue3b3\uf458\uddc4\u1e4f\ue327\uf470\udd48\u1ef3\ue33a\uf4bb\udd55\u1e4b\ue3e7\uf491\uddca\u1eb2\ue328\uf44c\uddf2\u1eb3\ue32e\uf451\udd49\u1e03\ue3bb\uf46a\udd73\u1ee2\ue320\uf4c1\uddf2\u1ed9\ue323\uf4f5\udd2a\u1eb9\ue3f4\uf4c0\udd33\u1ee2\ue36c\uf4b7\udd71\u1e24\ue313\uf4df\uddd6\u1ea7\ue394\uf474\uddc1\u1e24\ue393\uf4f6\udd14\u1eb5\ue33d\uf4f4\udd65\u1e1b\ue371\uf4f7\udd1a\u1e8a\ue365\uf438\udd06\u1ea9\ue319\uf425\udd60\u1eda\ue32c\uf4c2\udd6d\u1ecb\ue3bb\uf422\udd5b\u1e5d\ue37a\uf4a6\uddce\u1e66\ue300\uf4c5\uddb7\u1ef6\ue3c9\uf4d5\udd48\u1ec7\ue3bc\uf4c5\udd03\u1e2c\ue337", 1276957607);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-209826743 ^ (long)-209826733);
            if (var7) break block23;
            var0_6 = (int)((long)-678447371 ^ (long)678447370);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-138119417 ^ (long)-138119420);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)1079293516 ^ (long)-1079293517);
                    if (9T.\u2004\u200f\u200d\u2006) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!9T.\u2004\u200f\u200d\u2006) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u216a\u0869\ucb8a\u36d0\u21bb\u0802\ucb79\u3698\u2116\u0891\ucbfc\u3684\u21cf\u0887\ucb40\u36d5\u215d\u0883\ucb26\u368d\u2156\u08c1\ucbac\u36a6\u2151\u0863\ucbed\u36e0\u2120\u083a\ucbf5\u36e0\u2154\u0862\ucbcb\u3639\u21fa\u08b0\ucbbc\u366b\u218c\u08b4\ucb56\u36b5\u216a\u080c\ucb94\u36c8\u218c\u0811\ucbf0\u3685\u2131\u0863\ucb03\u364c\u2115\u08b3\ucbe9\u3657\u2151\u085d\ucbd5\u3615\u2164\u0883\ucb7b\u36e8\u218a\u08f7\ucbe1\u3642\u21f9\u080a\ucbeb\u36f5\u2190\u08cb\ucb76\u3685\u21ad\u08b6\ucb0a\u36cd\u21d4\u085a\ucbd7\u3665\u21ae\u085b\ucba8\u36e1\u21af", -1157691882);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-2017821519 ^ (long)-2017821555);
                            var0_6 = (int)((long)1396494990 ^ (long)-1396494991);
                            while (true) {
                                v0 = (int)((long)134538553 ^ (long)134538574);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-256879944 ^ (long)-256879944);
                                if (!9T.\u2004\u200f\u200d\u2006) break block20;
                                throw null;
                            }
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!9T.\u2004\u200f\u200d\u2006) ** continue;
                                throw null;
                            }
                            9T.d = var5_1;
                            9T.e = new String[(int)((long)-759063832 ^ (long)-759063833)];
                            if (!9T.\u2004\u200f\u200d\u2006) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-1184970295 ^ (long)-1184970295);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)1433499349 ^ (long)1433499348)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1884524277 ^ (long)-1884524276)) {
                                case 0: {
                                    v15 = (int)((long)1886548239 ^ (long)1886548347);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-1233130574 ^ (long)-1233130613);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-1921786249 ^ (long)-1921786281);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)923893434 ^ (long)923893376);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)893524490 ^ (long)893524495);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-508321377 ^ (long)-508321370);
                                    if (!9T.\u2004\u200f\u200d\u2006) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)1298280213 ^ (long)1298280315);
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var6_7;
                            v8 = v11;
                            if (v11 != 0) break block21;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        } while (!9T.\u2004\u200f\u200d\u2006);
                        throw null;
                    }
                    v16 = v9;
                    v10 = v10;
                } while (v10 > var6_7);
                v4 = new String(v16);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl118:
                    // 1 sources

                    ** continue;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static rr<vg, bhe> 0(bhe bhe2, bhe bhe3, boolean bl2) {
        bhe bhe4;
        vg vg2;
        block17: {
            boolean bl3 = \u2004\u200f\u200d\u2006;
            if (!bl3 && !bl3) {
                Object object = bhe3.d(bhe2);
                if (!bl3 && !bl3) {
                    double d2 = bhe2.d;
                    double d3 = bhe2.c;
                    double d4 = bhe2.b;
                    com.google.common.base.Predicate[] predicateArray = new com.google.common.base.Predicate[(int)((long)635932722 ^ (long)635932721)];
                    predicateArray[(int)((long)1840108253 ^ (long)1840108253)] = vk.e;
                    predicateArray[(int)((long)2027889783 ^ (long)2027889782)] = vk.a;
                    predicateArray[(int)((long)-2105111280 ^ (long)-2105111278)] = vg::ay;
                    object = 9T.2.f.a(null, new bhb(d4 - 0.25, d3, d2 - 0.25, d4 + 0.25, d3 + 0.5, d2 + 0.5).b(((bhe)object).b, ((bhe)object).c, ((bhe)object).d).g(1.0), Predicates.and(predicateArray));
                    if (!bl3 && !bl3) {
                        double d5 = 0.0;
                        if (bl3) return null;
                        if (!bl3) {
                            vg2 = null;
                            if (bl3) return null;
                            if (!bl3) {
                                bhe4 = null;
                                if (bl3) return null;
                                if (!bl3) {
                                    object = object.iterator();
                                    if (!bl3) {
                                        while (!bl3) {
                                            if (object.hasNext()) {
                                                if (bl3) break;
                                                vg vg3 = (vg)object.next();
                                                if (vg3 == 9T.2.h) {
                                                    if (bl3) break;
                                                    if (bl2) {
                                                        if (bl3) break;
                                                    }
                                                } else {
                                                    if (bl3) break;
                                                    bhc bhc2 = vg3.bw().g(0.3).b(bhe2, bhe3);
                                                    if (bhc2 != null) {
                                                        if (bl3 || bl3) break;
                                                        double d6 = bhe2.g(bhc2.c);
                                                        if (!(d6 < d5)) {
                                                            if (bl3) break;
                                                            if (d5 == 0.0) {
                                                                if (bl3) break;
                                                            }
                                                        } else {
                                                            if (bl3) break;
                                                            vg2 = vg3;
                                                            if (bl3 || bl3) break;
                                                            d5 = d6;
                                                            if (bl3 || bl3) break;
                                                            bhe4 = bhc2.c;
                                                            if (bl3) break;
                                                        }
                                                    }
                                                }
                                                if (bl3) break;
                                                if (!\u2004\u200f\u200d\u2006) continue;
                                                throw null;
                                            }
                                            if (bl3) break;
                                            if (vg2 == null) {
                                                if (bl3) break;
                                                return null;
                                            }
                                            if (!bl3) break block17;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        return new rr(vg2, bhe4);
    }

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 9T.\u2004\u200f\u200d\u2006;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-827879201 ^ (long)-827878872)) & (int)((long)569803070 ^ (long)569802433);
            if (var9_2) ** GOTO lbl-1000
            if (9T.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 9T.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)1600699774 ^ (long)1600699774)] & (int)((long)1172091606 ^ (long)1172091433)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1072100935 ^ (long)1072100900);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)1307368390 ^ (long)1307368223);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1766059693 ^ (long)-1766059700);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)580469375 ^ (long)580469399);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1309196209 ^ (long)1309196062);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)1856448020 ^ (long)1856448093);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)569080174 ^ (long)569080297);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-24006149 ^ (long)-24006341);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-573355274 ^ (long)-573355373);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-1766659872 ^ (long)-1766659897);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)1451655310 ^ (long)1451655318);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1039999469 ^ (long)-1039999338);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)406959485 ^ (long)406959603);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-110295270 ^ (long)-110295181);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)1624648408 ^ (long)1624648205);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-428981992 ^ (long)-428981841);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-17139747 ^ (long)-17139834);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)474210665 ^ (long)474210672);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)660669101 ^ (long)660668949);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)161699281 ^ (long)161699094);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-1955023401 ^ (long)-1955023401);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1354875776 ^ (long)1354875823);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-80407628 ^ (long)-80407791);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-1921029240 ^ (long)-1921029125);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-318513535 ^ (long)-318513612);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-156174730 ^ (long)-156174742);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1548050917 ^ (long)-1548050915);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-221206061 ^ (long)-221206171);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)911181029 ^ (long)911180988);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1661176352 ^ (long)1661176461);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1007747272 ^ (long)-1007747288);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-1842751148 ^ (long)-1842751175);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-367292213 ^ (long)-367292356);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-624580715 ^ (long)-624580864);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1772980410 ^ (long)-1772980256);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-464829495 ^ (long)-464829685);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1551200275 ^ (long)-1551200404);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1226093662 ^ (long)-1226093659);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-895624051 ^ (long)-895624110);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)516677005 ^ (long)516677000);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)361370013 ^ (long)361369931);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)829500162 ^ (long)829500287);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-1952573474 ^ (long)-1952573558);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-946164495 ^ (long)-946164623);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-972752781 ^ (long)-972752825);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1746707037 ^ (long)-1746707006);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-1929101199 ^ (long)-1929101079);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1476092707 ^ (long)-1476092733);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-2140242818 ^ (long)-2140242742);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)853046710 ^ (long)853046602);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)679291605 ^ (long)679291430);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1088455905 ^ (long)-1088455756);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-520830986 ^ (long)-520831080);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1986061279 ^ (long)1986061183);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1774701458 ^ (long)1774701546);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)271774466 ^ (long)271774464);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1152625544 ^ (long)-1152625519);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1958701021 ^ (long)-1958700866);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1024086904 ^ (long)-1024086975);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)1897169744 ^ (long)1897169735);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)762056843 ^ (long)762056805);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)363556882 ^ (long)363556870);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1227143979 ^ (long)-1227144161);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1982267504 ^ (long)-1982267592);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1506412125 ^ (long)-1506412225);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1472430428 ^ (long)-1472430473);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1478302888 ^ (long)1478302926);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)2071763776 ^ (long)2071763734);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-398994039 ^ (long)-398993982);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1173264505 ^ (long)1173264471);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-957405840 ^ (long)-957405697);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1556340520 ^ (long)-1556340519);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1088048280 ^ (long)-1088048158);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-692201976 ^ (long)-692201737);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-629939588 ^ (long)-629939592);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1043286881 ^ (long)-1043286959);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-38755107 ^ (long)-38755160);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1097289501 ^ (long)-1097289518);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1943260920 ^ (long)1943260783);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)839652220 ^ (long)839652202);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)548856799 ^ (long)548856718);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)403636773 ^ (long)403636739);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-2131106310 ^ (long)-2131106520);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1021848321 ^ (long)-1021848424);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-754658324 ^ (long)-754658543);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)765707518 ^ (long)765707329);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)775635103 ^ (long)775635064);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-577510043 ^ (long)-577510040);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)1842475193 ^ (long)1842475048);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1897427202 ^ (long)1897427270);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-205831128 ^ (long)-205830925);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)631161513 ^ (long)631161435);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)1793060572 ^ (long)1793060563);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-928186872 ^ (long)-928186726);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-740053306 ^ (long)-740053368);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1147195443 ^ (long)-1147195521);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)497705885 ^ (long)497705893);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1503184114 ^ (long)1503184123);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)2118534565 ^ (long)2118534599);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-827660209 ^ (long)-827660220);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)21302563 ^ (long)21302666);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1969325319 ^ (long)-1969325510);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)1533506408 ^ (long)1533506378);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-681252812 ^ (long)-681252860);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)532991847 ^ (long)532991756);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-668224683 ^ (long)-668224589);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-2096984477 ^ (long)-2096984427);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-785377336 ^ (long)-785377295);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-471022531 ^ (long)-471022478);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)809328081 ^ (long)809328032);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-802907110 ^ (long)-802906913);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1461325256 ^ (long)1461325239);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-2038325692 ^ (long)-2038325666);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)2063985725 ^ (long)2063985888);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1298576668 ^ (long)1298576873);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1835429809 ^ (long)-1835429819);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1321742036 ^ (long)-1321741988);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-714041521 ^ (long)-714041492);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)114647968 ^ (long)114647846);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1798673708 ^ (long)1798673758);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)185110281 ^ (long)185110481);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-890255105 ^ (long)-890255147);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1795053209 ^ (long)-1795053297);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-873900223 ^ (long)-873900279);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1357150428 ^ (long)-1357150305);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-1989681264 ^ (long)-1989681256);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)501096180 ^ (long)501096005);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1538041017 ^ (long)1538041002);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1786331006 ^ (long)-1786331062);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)447848228 ^ (long)447848328);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-189627775 ^ (long)-189627872);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1123607447 ^ (long)1123607534);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1995223460 ^ (long)-1995223441);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1648850838 ^ (long)-1648850714);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1424716498 ^ (long)1424716430);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1107416241 ^ (long)1107416308);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)447689385 ^ (long)447689460);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1975381958 ^ (long)-1975382004);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1894035063 ^ (long)1894034983);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1336224691 ^ (long)1336224636);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)995270612 ^ (long)995270474);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)2138735786 ^ (long)2138735785);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-120168705 ^ (long)-120168741);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)543022181 ^ (long)543022330);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1524830832 ^ (long)-1524830802);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)950396124 ^ (long)950396047);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)671883853 ^ (long)671883972);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-537578961 ^ (long)-537578875);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-650846928 ^ (long)-650846830);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)1121971350 ^ (long)1121971369);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)1618381958 ^ (long)1618382004);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)477778286 ^ (long)477778361);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1876975097 ^ (long)1876975043);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1691878062 ^ (long)-1691878022);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1113744945 ^ (long)-1113745148);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)1496288990 ^ (long)1496288772);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)308812955 ^ (long)308812816);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1563624346 ^ (long)1563624416);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)1663030360 ^ (long)1663030332);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)2035296598 ^ (long)2035296697);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)958794652 ^ (long)958794631);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1067894162 ^ (long)1067894201);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-705935753 ^ (long)-705935673);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)581092158 ^ (long)581092307);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1091679769 ^ (long)1091679874);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-642007208 ^ (long)-642007187);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)2038575272 ^ (long)2038575148);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-733891071 ^ (long)-733890986);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)2087129102 ^ (long)2087129168);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1950008033 ^ (long)1950007808);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1958472534 ^ (long)1958472655);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1440398027 ^ (long)1440397874);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-2107947891 ^ (long)-2107947914);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)15145357 ^ (long)15145340);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1828274927 ^ (long)1828274812);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)504542345 ^ (long)504542408);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1554877754 ^ (long)1554877818);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1474305062 ^ (long)-1474305258);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1285276347 ^ (long)1285276329);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-1776072881 ^ (long)-1776072766);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)345464439 ^ (long)345464455);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)767249449 ^ (long)767249495);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1800562474 ^ (long)-1800562540);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)1994601174 ^ (long)1994601097);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)536882672 ^ (long)536882636);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-228593222 ^ (long)-228593376);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-94597480 ^ (long)-94597409);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-2088120123 ^ (long)-2088120299);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)159282624 ^ (long)159282462);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1358566815 ^ (long)1358566747);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1822763097 ^ (long)1822763156);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)156315426 ^ (long)156315620);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1220543416 ^ (long)-1220543320);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)90454826 ^ (long)90454934);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)509332664 ^ (long)509332725);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)954449197 ^ (long)954449238);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)397890867 ^ (long)397890964);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-638333981 ^ (long)-638334059);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-1409258046 ^ (long)-1409258207);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1648239849 ^ (long)1648239687);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1128268515 ^ (long)1128268483);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)736025592 ^ (long)736025388);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1574974893 ^ (long)-1574974781);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-1755087795 ^ (long)-1755087632);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1288031237 ^ (long)1288031377);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1897563396 ^ (long)-1897563479);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)652913410 ^ (long)652913556);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)6116086 ^ (long)6116051);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1091967897 ^ (long)-1091967869);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-1943394382 ^ (long)-1943394319);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)245351295 ^ (long)245351184);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)1746976346 ^ (long)1746976418);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)216665293 ^ (long)216665274);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-870177778 ^ (long)-870177678);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-636970675 ^ (long)-636970567);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-842870123 ^ (long)-842870165);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-1600996279 ^ (long)-1600996118);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1353317934 ^ (long)-1353317922);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1007660318 ^ (long)-1007660463);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-429222944 ^ (long)-429223158);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1123443698 ^ (long)1123443616);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)27571547 ^ (long)27571530);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1077148496 ^ (long)1077148510);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1432009665 ^ (long)1432009708);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)74189571 ^ (long)74189610);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-323811345 ^ (long)-323811499);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1405892410 ^ (long)1405892566);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-822747468 ^ (long)-822747562);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1570315906 ^ (long)-1570315963);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-283938709 ^ (long)-283938633);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1667406520 ^ (long)-1667406346);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-2005671835 ^ (long)-2005671863);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1830644049 ^ (long)-1830644017);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-980176465 ^ (long)-980176530);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-2035936046 ^ (long)-2035936108);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1109490903 ^ (long)1109490733);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1124544859 ^ (long)1124544979);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1712830513 ^ (long)-1712830602);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1452773563 ^ (long)1452773617);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-76018895 ^ (long)-76018819);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-1539243543 ^ (long)-1539243669);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1104033826 ^ (long)-1104033793);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-357566883 ^ (long)-357566969);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-754076474 ^ (long)-754076627);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-907405179 ^ (long)-907405071);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-331901092 ^ (long)-331901119);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1239901499 ^ (long)1239901624);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-882884639 ^ (long)-882884860);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-103495172 ^ (long)-103495336);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-231961673 ^ (long)-231961728);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)224006653 ^ (long)224006444);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1912448858 ^ (long)1912448770);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)248865621 ^ (long)248865640);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)2093731988 ^ (long)2093731969);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)909264310 ^ (long)909264346);
                    if (!9T.\u2004\u200f\u200d\u2006) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-233790082 ^ (long)-233790188);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-1804343470 ^ (long)-1804343379)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-523147163 ^ (long)-523135078)) >>> (int)((long)-413580485 ^ (long)-413580493)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)560551715 ^ (long)560551715);
            if (!9T.\u2004\u200f\u200d\u2006) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1616061100 ^ (long)-1616061098);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)658913327 ^ (long)658913324) | var5_6 << (int)((long)-1780285565 ^ (long)-1780285562)) ^ var3_4[var7_8]) & (int)((long)-451042435 ^ (long)-451042430);
                    if (9T.\u2004\u200f\u200d\u2006) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-1489931686 ^ (long)-1489931687) | var6_7 << (int)((long)423620583 ^ (long)423620578)) ^ var3_4[var7_8]) & (int)((long)-1443434026 ^ (long)-1443434199);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            9T.e[var2_3] = new String(var3_4).intern();
        }
        return 9T.e[var2_3];
    }

    public 9T() {
        boolean bl2 = \u2004\u200f\u200d\u2006;
        super(9T.b((int)((long)1851795748 ^ (long)1851796432), (int)((long)-966347689 ^ (long)966343848)), 9T.b((int)((long)566510747 ^ (long)566511210), (int)((long)219029325 ^ (long)219044623)));
        this.5 = (0ri)((2r)((2r)((2r)this.5().2(9T.b((int)((long)58109332 ^ (long)58109799), (int)((long)-1958891071 ^ (long)-1958874486)))).1(9T.b((int)((long)475062909 ^ (long)475062408), (int)((long)-1849394635 ^ (long)1849416629)))).0(9T.b((int)((long)-428550663 ^ (long)-428550386), (int)((long)1396108588 ^ (long)-1396094882)))).0();
        Object object = Boolean.FALSE;
        1_ _ = (2r)((2r)((2r)this.5().2(9T.b((int)((long)-1004330633 ^ (long)-1004330103), (int)((long)265959002 ^ (long)-265962014)))).1(9T.b((int)((long)48635013 ^ (long)48635512), (int)((long)-90392367 ^ (long)90390982)))).0(9T.b((int)((long)1111056702 ^ (long)1111057348), (int)((long)18062303 ^ (long)-18086706)));
        ((2r)((2r)((2r)this.5().2(9T.b((int)((long)-1004330633 ^ (long)-1004330103), (int)((long)265959002 ^ (long)-265962014)))).1(9T.b((int)((long)48635013 ^ (long)48635512), (int)((long)-90392367 ^ (long)90390982)))).0(9T.b((int)((long)1111056702 ^ (long)1111057348), (int)((long)18062303 ^ (long)-18086706)))).2 = object;
        this.3 = (0ri)_.0();
        object = Color.fromRGB(1.0f, 0.5f, 0.0f);
        _ = (2a)((2a)((2a)this.4().2(9T.b((int)((long)207991399 ^ (long)207990939), (int)((long)-934252481 ^ (long)934250268)))).1(9T.b((int)((long)790213731 ^ (long)790214300), (int)((long)1871576354 ^ (long)-1871568739)))).0(9T.b((int)((long)1807746462 ^ (long)1807746926), (int)((long)-431662911 ^ (long)-431665672)));
        ((2a)((2a)((2a)this.4().2(9T.b((int)((long)207991399 ^ (long)207990939), (int)((long)-934252481 ^ (long)934250268)))).1(9T.b((int)((long)790213731 ^ (long)790214300), (int)((long)1871576354 ^ (long)-1871568739)))).0(9T.b((int)((long)1807746462 ^ (long)1807746926), (int)((long)-431662911 ^ (long)-431665672)))).2 = object;
        this.0 = (0rA)((2a)_).0();
        object = Float.valueOf(1.8f);
        _ = ((1H)((1H)((1H)this.0().2(9T.b((int)((long)1553260939 ^ (long)1553261424), (int)((long)1752574692 ^ (long)1752577610)))).1(9T.b((int)((long)-677569850 ^ (long)-677570512), (int)((long)2056730687 ^ (long)-2056717399)))).0(9T.b((int)((long)-1922396541 ^ (long)-1922397062), (int)((long)-391493999 ^ (long)-391480066)))).1(Float.valueOf(1.0f)).0(Float.valueOf(4.0f));
        ((1_)((1H)((1H)((1H)this.0().2(9T.b((int)((long)1553260939 ^ (long)1553261424), (int)((long)1752574692 ^ (long)1752577610)))).1(9T.b((int)((long)-677569850 ^ (long)-677570512), (int)((long)2056730687 ^ (long)-2056717399)))).0(9T.b((int)((long)-1922396541 ^ (long)-1922397062), (int)((long)-391493999 ^ (long)-391480066)))).1(Float.valueOf(1.0f)).0(Float.valueOf(4.0f))).2 = object;
        this.1 = (0rL)((1H)_).0();
        this.4 = new Listener<5Y>(t2 -> {
            double d2;
            AccessorRenderManager accessorRenderManager;
            9T t3;
            double d3;
            double d4;
            float f2;
            ain ain2;
            String[] stringArray;
            block49: {
                double d5;
                float f3;
                float f4;
                float f5;
                double d6;
                double d7;
                double d8;
                boolean bl2;
                block53: {
                    block52: {
                        float f6;
                        float f7;
                        float f8;
                        float f9;
                        aip aip2;
                        bud bud2;
                        boolean bl3;
                        block50: {
                            block51: {
                                bl3 = \u2004\u200f\u200d\u2006;
                                if (bl3) return;
                                stringArray = 7b.0();
                                if (bl3 || bl3) return;
                                bud2 = 9T.2.h;
                                aip2 = bud2.co();
                                ain2 = aip2.c();
                                if (ain2 instanceof ahg) break block50;
                                if (bl3) return;
                                if (ain2 instanceof aju) break block50;
                                if (bl3) return;
                                if (ain2 instanceof ahv) break block50;
                                if (bl3) return;
                                if (ain2 instanceof aib) break block50;
                                if (bl3) return;
                                if (!(ain2 instanceof ajd)) break block51;
                                if (bl3) return;
                                if (ain2.a().equalsIgnoreCase(9T.b((int)((long)837959701 ^ (long)837960423), (int)((long)1260222755 ^ (long)-1260218615)))) break block50;
                                if (bl3) return;
                            }
                            if (bl3) return;
                            return;
                        }
                        if (bl3) return;
                        bl2 = aip2.c() instanceof ahg;
                        if (bl3 || bl3) {
                            return;
                        }
                        double d9 = bud2.M + (bud2.p - bud2.M) * (double)((5t)t2).0();
                        if (this.3.0) {
                            f9 = 0.0f;
                            if (\u2004\u200f\u200d\u2006) {
                                throw null;
                            }
                        } else {
                            f9 = rk.b((float)((float)Math.toRadians(bud2.v))) * 0.16f;
                        }
                        d8 = d9 - (double)f9;
                        d7 = bud2.N + (bud2.q - bud2.N) * (double)((5t)t2).0() + (double)bud2.by() - 0.1;
                        double d10 = bud2.O + (bud2.r - bud2.O) * (double)((5t)t2).0();
                        if (this.3.0) {
                            f8 = 0.0f;
                            if (\u2004\u200f\u200d\u2006) {
                                throw null;
                            }
                        } else {
                            f8 = rk.a((float)((float)Math.toRadians(bud2.v))) * 0.16f;
                        }
                        d6 = d10 - (double)f8;
                        if (bl2) {
                            f7 = 1.0f;
                            if (\u2004\u200f\u200d\u2006) {
                                throw null;
                            }
                        } else {
                            f7 = 0.4f;
                        }
                        f5 = f7;
                        float f10 = (float)Math.toRadians(bud2.v);
                        float f11 = (float)Math.toRadians(bud2.w);
                        f4 = -rk.a((float)f10) * rk.b((float)f11) * f5;
                        f3 = -rk.a((float)f11) * f5;
                        f5 = rk.b((float)f10) * rk.b((float)f11) * f5;
                        float f12 = f4;
                        float f13 = f3;
                        float f14 = f5;
                        double d11 = Math.sqrt(f12 * f12 + f13 * f13 + f14 * f14);
                        f4 = (float)((double)f4 / d11);
                        f3 = (float)((double)f3 / d11);
                        f5 = (float)((double)f5 / d11);
                        if (!bl2) break block52;
                        float f15 = (float)((int)((long)1152586979 ^ (long)1152519587) - bud2.cK()) / 20.0f;
                        f15 = (f15 * f15 + f15 * 2.0f) / 3.0f;
                        if (f6 > 1.0f) {
                            f15 = 1.0f;
                        }
                        if (f15 <= 0.1f) {
                            f15 = 1.0f;
                        }
                        f4 *= (f15 *= 3.0f);
                        f3 *= f15;
                        f5 *= f15;
                        if (stringArray != null) break block53;
                    }
                    f4 = (float)((double)f4 * 1.5);
                    f3 = (float)((double)f3 * 1.5);
                    f5 = (float)((double)f5 * 1.5);
                }
                if (bl2) {
                    d5 = 0.05;
                    if (\u2004\u200f\u200d\u2006) {
                        throw null;
                    }
                } else if (ain2 instanceof ajd) {
                    d5 = 0.4;
                    if (\u2004\u200f\u200d\u2006) {
                        throw null;
                    }
                } else {
                    d5 = 0.03;
                }
                double d12 = d5;
                f2 = ((5t)t2).0();
                double d13 = d12;
                double d14 = f5;
                double d15 = f3;
                double d16 = f4;
                d4 = d6;
                d3 = d7;
                double d17 = d8;
                t3 = this;
                bus.G();
                GL11.glEnable((int)((int)((long)635424610 ^ (long)635421762)));
                bus.a((bus.r)bus.r.l, (bus.l)bus.l.j);
                bus.m();
                bus.z();
                bus.j();
                GL11.glEnable((int)((int)((long)-1177536389 ^ (long)-1177503514)));
                bus.a((boolean)((long)925206205 ^ (long)925206205));
                bus.d((float)t3.1.2);
                accessorRenderManager = (AccessorRenderManager)2.ac();
                1t.0(t3.0.2());
                bus.r((int)((int)((long)924465685 ^ (long)924465686)));
                ain2 = null;
                for (int i2 = (int)((long)259904573 ^ (long)259904573); i2 < (int)((long)-1365736401 ^ (long)-1365735481); d14 *= 0.99, d15 -= d13, ++i2) {
                    GL11.glVertex3d((double)(d17 - accessorRenderManager.getRenderPosX()), (double)(d3 - accessorRenderManager.getRenderPosY()), (double)(d4 - accessorRenderManager.getRenderPosZ()));
                    double d18 = d17;
                    double d19 = d3;
                    double d20 = d4;
                    d17 += d16;
                    d3 += d15;
                    d2 = d4 + d14;
                    if (stringArray != null) {
                        d4 = d2;
                        bhe bhe2 = new bhe(d18, d19, d20);
                        bhe bhe3 = new bhe(d17, d3, d4);
                        if (t3.5.0) {
                            rr<vg, bhe> rr2;
                            int n2;
                            if (i2 >= (int)((long)-1270676460 ^ (long)-1270676463)) {
                                n2 = (int)((long)-1202662319 ^ (long)-1202662320);
                                if (\u2004\u200f\u200d\u2006) {
                                    throw null;
                                }
                            } else {
                                n2 = (int)((long)-1867985023 ^ (long)-1867985023);
                            }
                            if ((rr2 = 9T.0(bhe2, bhe3, n2 != 0)) != null) {
                                ain2 = new bhc((vg)rr2.a());
                                d17 = ((bhe)rr2.b()).b;
                                d3 = ((bhe)rr2.b()).c;
                                d4 = ((bhe)rr2.b()).d;
                                if (stringArray != null) break;
                            }
                        }
                        if ((ain2 = 9T.2.f.a(bhe2, bhe3)) != null) {
                            d17 = ain2.c.b;
                            d3 = ain2.c.c;
                            d4 = ain2.c.d;
                            if (stringArray != null) break;
                        }
                        d16 *= 0.99;
                        d15 *= 0.99;
                        if (stringArray != null) continue;
                    }
                    break block49;
                }
                d2 = d17 - accessorRenderManager.getRenderPosX();
            }
            double d21 = d2;
            double d22 = d3 - accessorRenderManager.getRenderPosY();
            double d23 = d4 - accessorRenderManager.getRenderPosZ();
            GL11.glVertex3d((double)d21, (double)d22, (double)d23);
            if (ain2 != null && ain2.b != null) {
                switch (0ry.0[ain2.b.ordinal()]) {
                    case 1: 
                    case 2: {
                        GL11.glVertex3d((double)d21, (double)d22, (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 - 0.55), (double)d23);
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 - 0.55));
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 + 0.55));
                        GL11.glVertex3d((double)d21, (double)(d22 + 0.55), (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 - 0.55), (double)d23);
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 + 0.55));
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 - 0.55));
                        GL11.glVertex3d((double)d21, (double)(d22 + 0.55), (double)d23);
                        if (stringArray != null) break;
                    }
                    case 3: 
                    case 4: {
                        GL11.glVertex3d((double)d21, (double)d22, (double)d23);
                        GL11.glVertex3d((double)(d21 - 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 - 0.55), (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 + 0.55), (double)d23);
                        GL11.glVertex3d((double)(d21 + 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)(d21 - 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 + 0.55), (double)d23);
                        GL11.glVertex3d((double)d21, (double)(d22 - 0.55), (double)d23);
                        GL11.glVertex3d((double)(d21 + 0.55), (double)d22, (double)d23);
                        if (stringArray != null) break;
                    }
                    case 5: 
                    case 6: {
                        GL11.glVertex3d((double)d21, (double)d22, (double)d23);
                        GL11.glVertex3d((double)(d21 - 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 - 0.55));
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 + 0.55));
                        GL11.glVertex3d((double)(d21 + 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)(d21 - 0.55), (double)d22, (double)d23);
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 + 0.55));
                        GL11.glVertex3d((double)d21, (double)d22, (double)(d23 - 0.55));
                        GL11.glVertex3d((double)(d21 + 0.55), (double)d22, (double)d23);
                        break;
                    }
                }
            }
            bus.J();
            if (ain2 != null && ain2.d != null) {
                2O.0(ain2.d, t3.0.2(), (boolean)((long)-1328378168 ^ (long)-1328378168), f2);
            }
            bus.l();
            bus.y();
            bus.k();
            bus.a((boolean)((long)-330430837 ^ (long)-330430838));
            GL11.glDisable((int)((int)((long)150183128 ^ (long)150150213)));
            GL11.glDisable((int)((int)((long)14449432 ^ (long)14446648)));
            bus.H();
        }, new Predicate[(int)((long)-1779826002 ^ (long)-1779826002)]);
    }
}

