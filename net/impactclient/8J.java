/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ajm
 *  ajy
 *  bus
 *  bwc$b
 *  ly
 *  rk
 *  vo
 *  vp
 */
package net.impactclient;

import java.util.Random;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorItemRenderer;
import net.impactclient.0rB$1f;
import net.impactclient.0rQ;
import net.impactclient.0rh;
import net.impactclient.0ri;
import net.impactclient.1H;
import net.impactclient.1_;
import net.impactclient.1f;
import net.impactclient.2J;
import net.impactclient.2r;
import net.impactclient.3p;
import net.impactclient.4n;
import net.impactclient.6_;
import net.impactclient.73;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 8J
extends 73
implements 3p {
    private Random 1;
    private static final String[] d;
    public 0ri 0;
    private 0rh 5;
    private float 6;
    @EventHandler
    private final Listener<6_> 4;
    private 0ri 3;
    public static final boolean \u200c\u200c\u2007\u200f\u2008\u2002;
    public 0rQ 7;
    @EventHandler
    private final Listener<1f> 8;
    private static final String[] e;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 8J.\u200c\u200c\u2007\u200f\u2008\u2002;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-29401557 ^ (long)-29401539)];
            if (var7) break block23;
            var3_2 = (int)((long)1543976579 ^ (long)1543976579);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\ucce9\ue5ef\u26e6\udb6c\ucc61\ue5f9\u26d7\udbfb\uccbc\ue524\u26cc\udb5c\ucc61\ue50e\u26cc\udb0e\uccd9\ue54b\u26d0\udb88\ucc80\ue5b8\u2696\udbaf\uccfc\ue566\u2604\udb98\uccf4\ue53c\u2697\udb33\ucc11\ue5ac\u2652\udbf5\ucc24\ue5f2\u2677\udb67\ucc15\ue58d\u26e6\udbab\uccfe\ue5f9\u2674\udb6e\uccca\ue5ca\u26c8\udb1a\uccac\ue5dd\u26a7\udb9b\uccef\ue53e\u26c2\udb86\ucc3d\ue504\u2601\udbf3\ucc29\ue539\u265f\udb73\ucc50\ue504\u268a\udbd8\ucc9e\ue55a\u2605\udbb1\ucc09\ue506\u26bf\udb10\ucc99\ue5af\u260f\udb7c\ucc1b\ue573\u26f9\udbb3\ucc4e\ue50d\u26c1\udb2c\ucc61\ue508\u266f\udb58\ucc5a\ue586\u26be\udb06\uccfa\ue5ac\u2602\udba1\uccd0\ue589\u26ff\udbab\ucc5a\ue53a\u260b\udb65\ucc2a\ue5d2\u26ec\udbee\ucce3\ue552\u266b\udb72\ucc4a\ue53e\u26b2\udb6a\uccd9\ue548\u2666\udb50\ucca5\ue589\u2676\udba6\uccc8\ue52f\u2609\udb86\ucc01\ue5e0\u264b\udbcc\ucc6f\ue516\u2685\udbd8\ucc3b\ue5f3\u2620\udb87\ucc6c\ue564\u26da\udb14\uccda\ue504\u26e3\udb59\ucc16\ue50b\u260e\udb4e\ucc65\ue58e\u2600\udbb5\ucc78\ue52d\u265a\udbb9\uccac\ue5f3\u2645\udb08\uccbd\ue518\u269a\udba6\ucc38\ue555\u2621\udb62\ucc41\ue516\u2635\udb54\ucc20\ue59f\u2634\udb94\ucc82\ue528\u2662\udbfb\ucc9e\ue59b\u26c2\udb07\ucc80\ue56e\u269e\udb0b\ucca3\ue50d\u260e\udba7\ucc7c\ue575\u26c1\udb47\ucc7d\ue5c4\u2696\udb85\ucc10\ue50f\u26db\udb59\ucc90\ue55d\u26c6\udb90\ucc14\ue500\u266b\udb22\ucca6\ue504\u264d\udb2b\ucc76\ue526\u26aa\udbab\ucc59\ue506\u2648\udb1c\ucc74\ue50e\u26cd\udb6f\ucc99\ue55a\u2664\udbd5\ucc35\ue531\u26b8\udbed\ucc37\ue547\u26fd\udb2c\ucc93\ue5ea\u26dc\udb04\ucc3d\ue557\u269c\udb8b\ucc5f\ue5c5\u26d4\udb0a\uccc3\ue5a1\u2668\udbf2\ucc4a\ue55b\u26fd\udb38\ucc46\ue5cf\u268d\udb40\uccc1\ue529\u26de\udbe9\ucc82\ue50f\u2607\udb66\ucc4f\ue5a9\u2673\udbe8\ucc1f\ue5a1\u26cc\udbc5\ucc97\ue53d\u26ca\udb76\ucc8f\ue53a\u26c3\udb41", 879553450);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-1943002925 ^ (long)-1943002919);
            if (var7) break block23;
            var0_6 = (int)((long)1030547228 ^ (long)-1030547229);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)1622483405 ^ (long)1622483328);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)1957946327 ^ (long)-1957946328);
                    if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\ubcd3\u95d6\u5660\uab33\ubce1\u95fc\u560e\uab1e\ubcc1\u9536\u5627\uab01", -1333421229);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)197340642 ^ (long)197340647);
                            var0_6 = (int)((long)-1136593643 ^ (long)1136593642);
                            while (true) {
                                v0 = (int)((long)974006413 ^ (long)974006490);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-1307105903 ^ (long)-1307105903);
                                if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break block20;
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
                                if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) ** continue;
                                throw null;
                            }
                            8J.d = var5_1;
                            8J.e = new String[(int)((long)-1256728402 ^ (long)-1256728392)];
                            if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-641187422 ^ (long)-641187422);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)-1002055736 ^ (long)-1002055735)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)270166286 ^ (long)270166281)) {
                                case 0: {
                                    v15 = (int)((long)-1338946428 ^ (long)-1338946427);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)1275487028 ^ (long)1275487096);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)787586593 ^ (long)787586659);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)1958271095 ^ (long)1958271068);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)925925286 ^ (long)925925375);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)994303742 ^ (long)994303635);
                                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)755536837 ^ (long)755536776);
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
                        } while (!8J.\u200c\u200c\u2007\u200f\u2008\u2002);
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
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 8J.\u200c\u200c\u2007\u200f\u2008\u2002;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)2122379602 ^ (long)2122366968)) & (int)((long)435564922 ^ (long)435605125);
            if (var9_2) ** GOTO lbl-1000
            if (8J.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 8J.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-1959115265 ^ (long)-1959115265)] & (int)((long)263149496 ^ (long)263149383)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1445743100 ^ (long)1445743068);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)722335186 ^ (long)722335227);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-429483489 ^ (long)-429483280);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1328006939 ^ (long)-1328007105);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)150118732 ^ (long)150118809);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-2007014212 ^ (long)-2007014303);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)824629817 ^ (long)824629780);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)595765063 ^ (long)595765186);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)599444012 ^ (long)599444020);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-2139214646 ^ (long)-2139214767);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-241504040 ^ (long)-241504128);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)126871828 ^ (long)126871856);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-557987321 ^ (long)-557987117);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-2116045291 ^ (long)-2116045125);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1446139211 ^ (long)-1446139293);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1048750569 ^ (long)1048750367);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-200205643 ^ (long)-200205641);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)89723360 ^ (long)89723363);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)483380031 ^ (long)483380018);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1561120343 ^ (long)1561120388);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1106626777 ^ (long)1106626736);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-837852885 ^ (long)-837852736);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-962588581 ^ (long)-962588573);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-82296583 ^ (long)-82296589);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1478292315 ^ (long)-1478292378);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1010020214 ^ (long)-1010020187);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1983421276 ^ (long)-1983421434);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-2041443412 ^ (long)-2041443333);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)894527045 ^ (long)894527062);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1490771074 ^ (long)-1490771108);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)807444171 ^ (long)807444037);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-56997101 ^ (long)-56997116);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-376525255 ^ (long)-376525072);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-647803276 ^ (long)-647803277);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)1726762891 ^ (long)1726762928);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-1678250818 ^ (long)-1678250916);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1483879434 ^ (long)-1483879458);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-986486900 ^ (long)-986486936);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1601795173 ^ (long)-1601795160);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)724856119 ^ (long)724856157);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-438295609 ^ (long)-438295726);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-598075740 ^ (long)-598075766);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-1686106231 ^ (long)-1686106234);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1494735335 ^ (long)-1494735206);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-2089499516 ^ (long)-2089499596);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-730093555 ^ (long)-730093447);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)495213227 ^ (long)495213123);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)2031785078 ^ (long)2031785035);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1445083573 ^ (long)-1445083617);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)1099374273 ^ (long)1099374224);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)737552520 ^ (long)737552596);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-936735233 ^ (long)-936735263);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-1331090076 ^ (long)-1331089968);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)2043781670 ^ (long)2043781725);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-1801007788 ^ (long)-1801007792);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1094510179 ^ (long)1094510278);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-601626648 ^ (long)-601626714);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1823057576 ^ (long)1823057622);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1156763713 ^ (long)1156763839);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-428857261 ^ (long)-428857169);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-842696389 ^ (long)-842696420);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)937849977 ^ (long)937849871);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-528576976 ^ (long)-528576871);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-586860157 ^ (long)-586860229);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1363901810 ^ (long)1363901815);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)1156531430 ^ (long)1156531410);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)2146265849 ^ (long)2146265792);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1964500683 ^ (long)1964500518);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1021293107 ^ (long)1021293165);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)810257885 ^ (long)810257774);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1762616850 ^ (long)-1762617081);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)73449604 ^ (long)73449518);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-724995412 ^ (long)-724995411);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)2069338373 ^ (long)2069338453);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1690784310 ^ (long)1690784336);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)221795223 ^ (long)221795323);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-852234182 ^ (long)-852234078);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)1032539930 ^ (long)1032540056);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1008418889 ^ (long)-1008419044);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-596136457 ^ (long)-596136646);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)1464090147 ^ (long)1464090329);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-1637401361 ^ (long)-1637401582);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-1362725978 ^ (long)-1362726055);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1637353619 ^ (long)-1637353697);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)860699706 ^ (long)860699893);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1528239553 ^ (long)1528239553);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1777990020 ^ (long)1777990094);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)292358526 ^ (long)292358559);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-469254737 ^ (long)-469254903);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1167296637 ^ (long)1167296737);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)607863836 ^ (long)607863863);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)1441406463 ^ (long)1441406438);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-910567291 ^ (long)-910567406);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-480855814 ^ (long)-480855912);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1531999619 ^ (long)-1531999507);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-906327801 ^ (long)-906327622);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)285971282 ^ (long)285971208);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-2044243554 ^ (long)-2044243509);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1706454751 ^ (long)1706454680);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-1169967768 ^ (long)-1169967713);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)224522853 ^ (long)224522862);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1545490486 ^ (long)-1545490570);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-51717634 ^ (long)-51717704);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)956570444 ^ (long)956570419);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1947839709 ^ (long)-1947839605);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-526846878 ^ (long)-526846836);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-479799624 ^ (long)-479799678);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)404858958 ^ (long)404858946);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)522874367 ^ (long)522874138);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1432574881 ^ (long)-1432574736);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)718952840 ^ (long)718952802);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)2061107914 ^ (long)2061107712);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1321433305 ^ (long)1321433262);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-164004557 ^ (long)-164004516);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1170023544 ^ (long)1170023476);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)434253684 ^ (long)434253682);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1355217629 ^ (long)-1355217578);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1640398283 ^ (long)-1640398126);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)451383721 ^ (long)451383562);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1069724624 ^ (long)1069724618);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)637587857 ^ (long)637587742);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-368349257 ^ (long)-368349198);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1085850720 ^ (long)-1085850627);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-698388890 ^ (long)-698388971);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1228771085 ^ (long)-1228771273);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-807185965 ^ (long)-807186076);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-957398910 ^ (long)-957398814);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1559557274 ^ (long)-1559557255);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)1544200431 ^ (long)1544200214);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1694761001 ^ (long)1694761066);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-608932848 ^ (long)-608932771);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-540313641 ^ (long)-540313714);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-986443098 ^ (long)-986443085);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)438316742 ^ (long)438316709);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1364447685 ^ (long)1364447728);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)204370349 ^ (long)204370315);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1264752042 ^ (long)-1264751985);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)1405536918 ^ (long)1405536812);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)651500671 ^ (long)651500570);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1329338169 ^ (long)-1329338233);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-184026939 ^ (long)-184027048);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)283134614 ^ (long)283134487);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)668136638 ^ (long)668136492);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-81279316 ^ (long)-81279292);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1544475292 ^ (long)1544475245);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-376288880 ^ (long)-376288790);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)304123214 ^ (long)304123383);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1982210002 ^ (long)1982209794);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-1939908765 ^ (long)-1939908654);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-837880562 ^ (long)-837880353);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)1663144601 ^ (long)1663144629);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)117371029 ^ (long)117370951);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-1368967932 ^ (long)-1368967717);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)250665809 ^ (long)250665851);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-27594761 ^ (long)-27594866);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)2106132811 ^ (long)2106132883);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-537349528 ^ (long)-537349538);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-241961163 ^ (long)-241961094);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-523305075 ^ (long)-523305038);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)220553806 ^ (long)220553936);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)267281921 ^ (long)267282099);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-1216806380 ^ (long)-1216806215);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-763698414 ^ (long)-763698400);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)95964914 ^ (long)95964923);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-2062594139 ^ (long)-2062594104);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)415923226 ^ (long)415923382);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-364214100 ^ (long)-364214183);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-2075301347 ^ (long)-2075301165);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1742141008 ^ (long)1742141144);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-1822922039 ^ (long)-1822922121);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-236561620 ^ (long)-236561511);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)272723668 ^ (long)272723474);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1288426529 ^ (long)1288426662);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-40796152 ^ (long)-40795909);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)2143739436 ^ (long)2143739583);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-971278613 ^ (long)-971278629);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1272350857 ^ (long)1272350910);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1817401514 ^ (long)-1817401414);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1591962070 ^ (long)1591961993);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)503538142 ^ (long)503537982);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1756011039 ^ (long)1756011201);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1671927501 ^ (long)1671927339);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-2038012715 ^ (long)-2038012822);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1622721264 ^ (long)-1622721236);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-581967831 ^ (long)-581967708);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1991381412 ^ (long)1991381359);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-401080042 ^ (long)-401079936);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-668118149 ^ (long)-668118215);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-119155616 ^ (long)-119155476);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)2135922326 ^ (long)2135922194);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1737917904 ^ (long)1737917894);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)955205304 ^ (long)955205196);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)178556811 ^ (long)178556714);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1621240560 ^ (long)1621240417);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-987751127 ^ (long)-987751156);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-2120337859 ^ (long)-2120337837);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1542909372 ^ (long)-1542909273);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-530337129 ^ (long)-530337098);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-976884521 ^ (long)-976884639);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1517107537 ^ (long)1517107659);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1852510735 ^ (long)-1852510854);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)969641327 ^ (long)969641446);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)17619616 ^ (long)17619456);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-1966853481 ^ (long)-1966853547);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1652555162 ^ (long)-1652555146);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)229267964 ^ (long)229267844);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-1233960645 ^ (long)-1233960509);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)37143423 ^ (long)37143358);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1388239224 ^ (long)1388239164);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-363584163 ^ (long)-363584198);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1514713861 ^ (long)1514713939);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1425685603 ^ (long)-1425685547);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)0x9FF93FF ^ (long)167744291);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)348451761 ^ (long)348451789);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-110008652 ^ (long)-110008624);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1581739190 ^ (long)-1581739087);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)565063028 ^ (long)565063136);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1574105587 ^ (long)1574105428);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)215365641 ^ (long)215365650);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1969948179 ^ (long)-1969948164);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1793961486 ^ (long)-1793961598);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)312654408 ^ (long)312654426);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1012412342 ^ (long)1012412207);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)878974744 ^ (long)878974794);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-2094348350 ^ (long)-2094348405);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-37934611 ^ (long)-37934607);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1557868128 ^ (long)1557868215);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-420183578 ^ (long)-420183773);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-466080908 ^ (long)-466080789);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)35376681 ^ (long)35376738);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)1602634275 ^ (long)1602634449);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-89300969 ^ (long)-89300924);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)426143302 ^ (long)426143271);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1652450880 ^ (long)1652450843);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1904573804 ^ (long)1904573852);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1618501115 ^ (long)-1618501082);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)2045934148 ^ (long)2045934154);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)990489448 ^ (long)990489508);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-301112207 ^ (long)-301112144);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-739824942 ^ (long)-739824954);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)672720874 ^ (long)672720859);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-27564000 ^ (long)-27563957);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1110381483 ^ (long)1110381530);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)2108092216 ^ (long)2108092208);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)2076561864 ^ (long)2076561779);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-216172 ^ (long)-216237);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1353233253 ^ (long)-1353233379);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-2099279558 ^ (long)-2099279545);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1241545042 ^ (long)1241545170);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)2012120341 ^ (long)2012120479);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)326723605 ^ (long)326723592);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1751391726 ^ (long)1751391534);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1877012369 ^ (long)1877012399);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1212022878 ^ (long)-1212023034);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-377649382 ^ (long)-377649198);
                    if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-367048363 ^ (long)-367048306);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1228224268 ^ (long)1228224499)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1053451804 ^ (long)-1053465061)) >>> (int)((long)791481970 ^ (long)791481978)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1349593082 ^ (long)-1349593082);
            if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1484020439 ^ (long)-1484020437);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1352379080 ^ (long)1352379083) | var5_6 << (int)((long)445209318 ^ (long)445209315)) ^ var3_4[var7_8]) & (int)((long)-2015635311 ^ (long)-2015635346);
                    if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)172478679 ^ (long)172478676) | var6_7 << (int)((long)1459565413 ^ (long)1459565408)) ^ var3_4[var7_8]) & (int)((long)-555227089 ^ (long)-555226928);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            8J.e[var2_3] = new String(var3_4).intern();
        }
        return 8J.e[var2_3];
    }

    public 8J() {
        boolean bl2 = \u200c\u200c\u2007\u200f\u2008\u2002;
        super(8J.b((int)((long)464019707 ^ (long)464006737), (int)((long)1001777822 ^ (long)-1001767329)), 8J.b((int)((long)-389468780 ^ (long)-389455052), (int)((long)770434309 ^ (long)-770439802)));
        Object object = Boolean.TRUE;
        1_ _ = (2r)((2r)((2r)this.5().2(8J.b((int)((long)24450628 ^ (long)24467685), (int)((long)1657993452 ^ (long)1657983411)))).1(8J.b((int)((long)1874879181 ^ (long)1874865248), (int)((long)-476147066 ^ (long)476125577)))).0(8J.b((int)((long)-1654386943 ^ (long)-1654373982), (int)((long)1643912233 ^ (long)1643908884)));
        ((2r)((2r)((2r)this.5().2(8J.b((int)((long)24450628 ^ (long)24467685), (int)((long)1657993452 ^ (long)1657983411)))).1(8J.b((int)((long)1874879181 ^ (long)1874865248), (int)((long)-476147066 ^ (long)476125577)))).0(8J.b((int)((long)-1654386943 ^ (long)-1654373982), (int)((long)1643912233 ^ (long)1643908884)))).2 = object;
        this.3 = (0ri)_.0();
        String[] stringArray = new String[(int)((long)-1817160773 ^ (long)-1817160769)];
        stringArray[(int)((long)-1377025401 ^ (long)-1377025401)] = 8J.b((int)((long)1800735136 ^ (long)1800750856), (int)((long)1408103386 ^ (long)1408085468));
        stringArray[(int)((long)273331354 ^ (long)273331355)] = 8J.b((int)((long)-1366153745 ^ (long)-1366135977), (int)((long)418569439 ^ (long)418545965));
        stringArray[(int)((long)-789038085 ^ (long)-789038087)] = 8J.b((int)((long)1235890608 ^ (long)1235910430), (int)((long)205846744 ^ (long)-205820572));
        stringArray[(int)((long)423343893 ^ (long)423343894)] = 8J.b((int)((long)626860676 ^ (long)626879546), (int)((long)1804405393 ^ (long)-1804421747));
        object = stringArray;
        _ = (2J)((2J)((2J)this.1().2(8J.b((int)((long)1372787649 ^ (long)1372806509), (int)((long)-344844675 ^ (long)344818751)))).1(8J.b((int)((long)-1472862147 ^ (long)-1472878949), (int)((long)1502243325 ^ (long)1502223729)))).0(8J.b((int)((long)55697508 ^ (long)55684831), (int)((long)1889481939 ^ (long)-1889484057)));
        ((2J)((2J)((2J)this.1().2(8J.b((int)((long)1372787649 ^ (long)1372806509), (int)((long)-344844675 ^ (long)344818751)))).1(8J.b((int)((long)-1472862147 ^ (long)-1472878949), (int)((long)1502243325 ^ (long)1502223729)))).0(8J.b((int)((long)55697508 ^ (long)55684831), (int)((long)1889481939 ^ (long)-1889484057)))).2 = object;
        this.5 = (0rh)((2J)_.0(this.3)).0();
        object = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(8J.b((int)((long)-153207536 ^ (long)-153193537), (int)((long)60438988 ^ (long)-60451811)))).1(8J.b((int)((long)11285273 ^ (long)11304358), (int)((long)-1973805949 ^ (long)1973799812)))).0(8J.b((int)((long)-1337676693 ^ (long)-1337662767), (int)((long)-515097545 ^ (long)-515090929)));
        ((2r)((2r)((2r)this.5().2(8J.b((int)((long)-153207536 ^ (long)-153193537), (int)((long)60438988 ^ (long)-60451811)))).1(8J.b((int)((long)11285273 ^ (long)11304358), (int)((long)-1973805949 ^ (long)1973799812)))).0(8J.b((int)((long)-1337676693 ^ (long)-1337662767), (int)((long)-515097545 ^ (long)-515090929)))).2 = object;
        this.0 = (0ri)((2r)_).0();
        object = 0.05;
        _ = ((1H)((1H)((1H)this.3().2(8J.b((int)((long)-248633779 ^ (long)-248616721), (int)((long)-1093162656 ^ (long)-1093149401)))).1(8J.b((int)((long)1751969507 ^ (long)1751949382), (int)((long)-487578027 ^ (long)487582524)))).0(8J.b((int)((long)-733648839 ^ (long)-733665648), (int)((long)493601819 ^ (long)-493604453)))).1(0.0).0(0.2);
        ((1_)((1H)((1H)((1H)this.3().2(8J.b((int)((long)-248633779 ^ (long)-248616721), (int)((long)-1093162656 ^ (long)-1093149401)))).1(8J.b((int)((long)1751969507 ^ (long)1751949382), (int)((long)-487578027 ^ (long)487582524)))).0(8J.b((int)((long)-733648839 ^ (long)-733665648), (int)((long)493601819 ^ (long)-493604453)))).1(0.0).0(0.2)).2 = object;
        this.7 = (0rQ)((1H)_).0();
        this.1 = new Random();
        this.4 = new Listener<6_>(this::0, new Predicate[(int)((long)-1142358863 ^ (long)-1142358863)]);
        Predicate[] predicateArray = new Predicate[(int)((long)1962284597 ^ (long)1962284596)];
        Class[] classArray = new Class[(int)((long)-1673778101 ^ (long)-1673778102)];
        classArray[(int)((long)866935358 ^ (long)866935358)] = ly.class;
        predicateArray[(int)((long)-972740875 ^ (long)-972740875)] = new 4n(classArray);
        this.8 = new Listener<1f>(f2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u200c\u200c\u2007\u200f\u2008\u2002;
                        if (bl2 || bl2) break block2;
                        if (((String)this.5.1()).equals(8J.b((int)((long)-236749292 ^ (long)-236769107), (int)((long)-306583110 ^ (long)-306607801)))) break block3;
                        if (bl2) break block2;
                        if (!(this.6 > 1.0f)) break block3;
                        if (bl2) break block2;
                        if (this.1.nextInt((int)((long)-799407689 ^ (long)-799407683)) != (int)((long)-1210861447 ^ (long)-1210861443)) break block3;
                        if (bl2 || bl2) break block2;
                        this.6 = -0.1f;
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, predicateArray);
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void 0(6_ var1_1) {
        block39: {
            block38: {
                var11_2 = 8J.\u200c\u200c\u2007\u200f\u2008\u2002;
                if (var11_2) lbl-1000:
                // 9 sources

                {
                    return;
                }
                var3_3 = var1_1.4;
                var4_4 = (AccessorItemRenderer)var3_3;
                var2_5 = 7b.0();
                if (var11_2 || var11_2) ** GOTO lbl-1000
                if (this.3.0) break block38;
                if (var11_2) ** GOTO lbl-1000
                return;
            }
            if (var11_2) ** GOTO lbl-1000
            if (!(var1_1.3.c() instanceof ajm)) break block39;
            if (var11_2 || var11_2) ** GOTO lbl-1000
            var1_1.cancel();
            if (var11_2 || var11_2) ** GOTO lbl-1000
            return;
        }
        if (var11_2) ** GOTO lbl-1000
        if (!(8J.2.h.co().c() instanceof ajy)) ** GOTO lbl-1000
        if (var11_2) ** GOTO lbl-1000
        if (8J.2.h.cJ().c() instanceof ajm) {
            if (!var11_2) ** break;
            ** continue;
            v0 = (int)((long)2141972154 ^ (long)2141972155);
            if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                throw null;
            }
        } else lbl-1000:
        // 2 sources

        {
            v0 = (int)((long)-2135983741 ^ (long)-2135983741);
        }
        if (v0 == 0) {
            return;
        }
        var1_1.cancel();
        bus.G();
        var5_6 = 0.0f;
        if (!8J.2.T()) {
            this.6 += 0.15f * var1_1.6;
        }
        if (this.6 < 1.0f) {
            var5_6 = Math.max(0.0f, this.6);
            if (v1 > 0.5f) {
                var5_6 = 1.0f - this.6;
            }
        }
        var4_4.callTransformSideFirstPerson(var1_1.7, var5_6);
        var5_7 = (String)this.5.1();
        var6_12 = (int)((long)-1795191193 ^ (long)1795191192);
        switch (var5_7.hashCode()) {
            case 867554807: {
                if (!var5_7.equals(8J.b((int)((long)620082308 ^ (long)620100128), (int)((long)879990532 ^ (long)880000402)))) break;
                var6_12 = (int)((long)-514978341 ^ (long)-514978341);
                if (var2_5 != null) break;
            }
            case 79882757: {
                if (!var5_7.equals(8J.b((int)((long)214364970 ^ (long)214351251), (int)((long)110580478 ^ (long)110572035)))) break;
                var6_12 = (int)((long)-1741457218 ^ (long)-1741457217);
                if (var2_5 != null) break;
            }
            case 48570: {
                if (!var5_7.equals(8J.b((int)((long)1134001994 ^ (long)1133982189), (int)((long)363375781 ^ (long)-363365985)))) break;
                var6_12 = (int)((long)-12132686 ^ (long)-12132688);
                if (var2_5 != null) break;
            }
            case 48571: {
                if (!var5_7.equals(8J.b((int)((long)1025798253 ^ (long)1025785542), (int)((long)702261476 ^ (long)-702259038)))) break;
                var6_12 = (int)((long)719932341 ^ (long)719932342);
            }
        }
        switch (var6_12) {
            case 0: {
                bus.b((float)93.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                bus.b((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                bus.b((float)-17.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                var5_8 = rk.a((float)((float)(Math.sqrt(var1_1.1) * 3.141592653589793)));
                bus.c((float)-0.15f, (float)0.25f, (float)0.15f);
                bus.b((float)(-var5_8 * 30.0f - 10.0f), (float)1.0f, (float)-0.4f, (float)0.0f);
                if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                throw null;
            }
            case 1: {
                var5_9 = rk.a((float)((float)(Math.sqrt(var1_1.1) * 3.141592653589793)));
                bus.b((double)(0.4 + (double)var5_9 * -0.2), (double)0.1, (double)-0.2);
                var4_4.callTransformFirstPerson(var1_1.7, var1_1.1);
                bus.b((double)-0.2, (double)0.1, (double)0.0);
                bus.b((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                bus.b((float)80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                bus.b((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                if (!8J.\u200c\u200c\u2007\u200f\u2008\u2002) break;
                throw null;
            }
            case 2: 
            case 3: {
                var4_4.callTransformFirstPerson(var1_1.7, var1_1.1);
                var5_10 = ((String)this.5.1()).equals(8J.b((int)((long)-520905553 ^ (long)-520891896), (int)((long)-1547834311 ^ (long)1547843843)));
                if (var5_10) {
                    v2 = 0.18;
                    if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                        throw null;
                    }
                } else {
                    v2 = var7_13 = 0.25;
                }
                if (var5_10) {
                    v3 = 0.125;
                    if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                        throw null;
                    }
                } else {
                    v3 = var9_14 = 0.1;
                }
                if (var5_10) {
                    v4 = -0.05;
                    if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                        throw null;
                    }
                } else {
                    v4 = 0.0;
                }
                bus.b((double)v4, (double)var9_14, (double)var7_13);
                bus.b((float)-25.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                bus.b((float)80.0f, (float)0.0f, (float)1.0f, (float)0.0f);
                bus.b((float)-75.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                bus.b((double)0.0, (double)(-var9_14 + 0.2), (double)(-var7_13 + 0.25));
                if (!var5_10) break;
                bus.b((double)-0.15, (double)0.05, (double)0.0);
            }
        }
        if (var1_1.7 == vo.b) {
            v5 = (int)((long)711280060 ^ (long)711280061);
            if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                throw null;
            }
        } else {
            v5 = (int)((long)159235789 ^ (long)159235789);
        }
        var5_11 = v5;
        v6 = 8J.2.h;
        v7 = var1_1.3;
        if (var5_11 != 0) {
            v8 = bwc.b.e;
            if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                throw null;
            }
        } else {
            v8 = bwc.b.d;
        }
        if (var5_11 == 0) {
            v9 = (int)((long)-959566790 ^ (long)-959566789);
            if (8J.\u200c\u200c\u2007\u200f\u2008\u2002) {
                throw null;
            }
        } else {
            v9 = (int)((long)1851166461 ^ (long)1851166461);
        }
        var3_3.a((vp)v6, v7, v8, (boolean)v9);
        bus.H();
    }
}

