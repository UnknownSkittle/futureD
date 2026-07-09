/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  hh
 */
package net.impactclient;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0a2;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1C;
import net.impactclient.3i;
import net.impactclient.3j;
import net.impactclient.4t;
import net.impactclient.5n;
import net.impactclient.7Q;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3f
extends 3j<0a2>
implements Listenable {
    private static final hh 2;
    public static final boolean \u2004\u200f\u200b\u2004\u2000;
    private static final String[] b;
    private static final String[] a;
    @EventHandler
    private final Listener<5n> 1;
    private static final hh 0;

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(0a2 a2) {
        boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
        if (bl2 || bl2) return;
        if (this.2(a2.0)) {
            if (bl2 || bl2) return;
            1C.0(2);
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        this.add(a2);
        if (bl2 || bl2) return;
        a[] aArray = new a[(int)((long)-198235458 ^ (long)-198235457)];
        aArray[(int)((long)-613758509 ^ (long)-613758509)] = a.j;
        a[] aArray2 = new a[(int)((long)641970396 ^ (long)641970397)];
        aArray2[(int)((long)-411128037 ^ (long)-411128037)] = a.h;
        1C.0(new 3i().0((String)3f.a((int)((int)((long)-883115738 ^ (long)883100041)), (int)((int)((long)581146097 ^ (long)-581149526)))).0((String)a2.0, (a[])aArray).0((String)3f.a((int)((int)((long)-1661463166 ^ (long)1661445422)), (int)((int)((long)66444850 ^ (long)66433048))), (a[])aArray2).0);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        block3: {
            block2: {
                boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                if (bl2 || bl2) break block2;
                int n2 = (int)((long)-992119714 ^ (long)992134387);
                0ay.3();
                7Q.1((Path)0ay.0((String)3f.a((int)n2, (int)((int)((long)33065801 ^ (long)33075369))))).1.stream().map(string -> {
                    boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return string.split(0rB$1f.XNZw("\u97cc", -1573539511));
                }).filter(stringArray -> {
                    boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                    if (bl2 || bl2) return true;
                    if (((String[])stringArray).length == (int)((long)2030871299 ^ (long)2030871297)) {
                        if (bl2) return true;
                        return (int)((long)-737078597 ^ (long)-737078598) != 0;
                    }
                    if (!bl2) return (int)((long)1085911177 ^ (long)1085911177) != 0;
                    return true;
                }).forEach((? super T stringArray) -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                            if (bl2 || bl2) break block2;
                            this.0(new 0a2(stringArray[(int)((long)567808469 ^ (long)567808469)], stringArray[(int)((long)-1441959089 ^ (long)-1441959090)]));
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 3f() {
        boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
        super(3f.a((int)((long)-1004631847 ^ (long)1004615807), (int)((long)1944843825 ^ (long)-1944822307)));
        this.1 = new Listener<5n>(n2 -> {
            block8: {
                boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                if (!bl2) {
                    String string = n2.0;
                    String[] stringArray = 7b.0();
                    if (!bl2 && !bl2) {
                        Iterator iterator = this.iterator();
                        if (!bl2) {
                            while (!bl2) {
                                if (iterator.hasNext()) {
                                    if (bl2) break;
                                    0a2 a2 = (0a2)iterator.next();
                                    if (bl2 || bl2) break;
                                    if (stringArray != null) {
                                        if (bl2) break;
                                        if (string.contains(a2.0)) {
                                            if (bl2 || bl2) break;
                                            string = a2.2.matcher(string).replaceAll(a2.1);
                                            if (bl2) break;
                                        }
                                        if (bl2) break;
                                        if (stringArray != null) continue;
                                        if (bl2) break;
                                    }
                                } else {
                                    if (bl2) break;
                                    n2.0 = string;
                                    if (bl2) break;
                                }
                                if (!bl2) break block8;
                            }
                        }
                    }
                }
                return;
            }
        }, new Predicate[(int)((long)-461955428 ^ (long)-461955428)]);
        4t.1.subscribe(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 2(String string) {
        boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
        if (bl2 || bl2) return true;
        if (this.3(string) != null) {
            if (bl2) return true;
            return (int)((long)-1399779983 ^ (long)-1399779984) != 0;
        }
        if (!bl2) return (int)((long)-604839302 ^ (long)-604839302) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1(String object) {
        boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
        if (bl2 || bl2) return;
        if (!this.2((String)object)) {
            if (bl2 || bl2) return;
            1C.0(0);
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        object = this.3((String)object);
        if (bl2 || bl2) return;
        this.remove(object);
        if (bl2 || bl2) return;
        a[] aArray = new a[(int)((long)-1666254236 ^ (long)-1666254235)];
        aArray[(int)((long)835937269 ^ (long)835937269)] = a.j;
        a[] aArray2 = new a[(int)((long)1318241379 ^ (long)1318241378)];
        aArray2[(int)((long)650860692 ^ (long)650860692)] = a.h;
        1C.0(new 3i().0((String)3f.a((int)((int)((long)-778787055 ^ (long)778770362)), (int)((int)((long)-52265086 ^ (long)52286485)))).0((String)((0a2)object).0, (a[])aArray).0((String)3f.a((int)((int)((long)1033695113 ^ (long)-1033674975)), (int)((int)((long)239782578 ^ (long)-239764206))), (a[])aArray2).0);
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 3f.\u2004\u200f\u200b\u2004\u2000;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1378882144 ^ (long)1378901262)) & (int)((long)1746433623 ^ (long)1746438568);
            if (var9_2) ** GOTO lbl-1000
            if (3f.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 3f.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-504418916 ^ (long)-504418916)] & (int)((long)-241234337 ^ (long)-241234272)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)566750966 ^ (long)566750774);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)1961583668 ^ (long)1961583669);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)617016441 ^ (long)617016489);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-506013161 ^ (long)-506013008);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-300947173 ^ (long)-300947023);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1746163768 ^ (long)-1746163835);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1959433969 ^ (long)1959433828);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)205143561 ^ (long)205143567);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-458435034 ^ (long)-458435058);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-2120153453 ^ (long)-2120153351);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)749398629 ^ (long)749398643);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)467152748 ^ (long)467152804);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-373263947 ^ (long)-373263964);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-137483632 ^ (long)-137483537);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-79342534 ^ (long)-79342357);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)843307457 ^ (long)843307508);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)1816970502 ^ (long)1816970664);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1724718269 ^ (long)-1724718153);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-337189608 ^ (long)-337189554);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-320445267 ^ (long)-320445362);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-665681671 ^ (long)-665681760);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-849630644 ^ (long)-849630690);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)148660033 ^ (long)148660031);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-872840856 ^ (long)-872840777);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)858119780 ^ (long)858119873);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1161662076 ^ (long)1161662108);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-996409255 ^ (long)-996409319);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-834045870 ^ (long)-834045903);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)1658189404 ^ (long)1658189335);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-2112616149 ^ (long)-2112616062);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)2000512040 ^ (long)2000512188);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)170042606 ^ (long)170042466);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1262254019 ^ (long)1262253981);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1401497119 ^ (long)1401497248);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)754288760 ^ (long)754288669);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)952225493 ^ (long)952225348);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)652353748 ^ (long)652353748);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-881043466 ^ (long)-881043712);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)158924895 ^ (long)158924910);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1237234842 ^ (long)1237234760);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1322210193 ^ (long)-1322210058);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1834301763 ^ (long)1834301788);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-88008466 ^ (long)-88008548);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-697637814 ^ (long)-697637854);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-599051059 ^ (long)-599051201);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1973887517 ^ (long)-1973887736);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-1346860583 ^ (long)-1346860725);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-603407546 ^ (long)-603407563);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1079612478 ^ (long)1079612467);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)1247191779 ^ (long)1247191718);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1483956799 ^ (long)1483956776);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-31398242 ^ (long)-31398165);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1747215737 ^ (long)1747215837);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-610959461 ^ (long)-610959596);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-233422981 ^ (long)-233422888);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1098210679 ^ (long)1098210800);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)574999812 ^ (long)574999976);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)2017723586 ^ (long)2017723465);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1316598166 ^ (long)-1316598036);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)424549625 ^ (long)424549498);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-1603396514 ^ (long)-1603396423);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-38155392 ^ (long)-38155465);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)905680127 ^ (long)905680084);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)514465140 ^ (long)514465214);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1946723430 ^ (long)1946723465);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)6162312 ^ (long)6162386);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1423911891 ^ (long)1423911825);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-802876007 ^ (long)-802876022);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-1671726061 ^ (long)-1671725846);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)659027091 ^ (long)659027043);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1229539983 ^ (long)1229539956);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-2084819033 ^ (long)-2084819122);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1348527765 ^ (long)-1348527664);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)378096364 ^ (long)378096132);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1154560648 ^ (long)1154560642);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1716932052 ^ (long)-1716932005);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1353056214 ^ (long)1353056031);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1758704744 ^ (long)-1758704687);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1796829833 ^ (long)1796829933);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-20552418 ^ (long)-20552426);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-501739248 ^ (long)-501739066);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1183603700 ^ (long)1183603672);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1755895114 ^ (long)1755895135);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)378041770 ^ (long)378041742);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)629462248 ^ (long)629462210);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-1171256420 ^ (long)-1171256372);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1115705539 ^ (long)-1115705580);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)311586759 ^ (long)311586803);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-2030142219 ^ (long)-2030142267);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1812039075 ^ (long)1812039131);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1698801820 ^ (long)-1698801834);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-578622133 ^ (long)-578622056);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-997739027 ^ (long)-997739017);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-1837708498 ^ (long)-1837708385);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1138237922 ^ (long)-1138237810);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1993970742 ^ (long)1993970870);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1764287477 ^ (long)-1764287420);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1914455845 ^ (long)-1914456058);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)268157451 ^ (long)268157548);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-649343972 ^ (long)-649343765);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1279844863 ^ (long)1279844618);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)862758449 ^ (long)862758591);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)93969868 ^ (long)93969744);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-26770835 ^ (long)-26770867);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1921807100 ^ (long)1921806921);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1043628270 ^ (long)1043628084);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1601021950 ^ (long)-1601021700);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)216989197 ^ (long)216989379);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)220014040 ^ (long)220014073);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)1175440568 ^ (long)1175440578);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1977686445 ^ (long)1977686369);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-585979709 ^ (long)-585979899);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-1525299396 ^ (long)-1525299338);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)923241476 ^ (long)923241560);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1243938635 ^ (long)-1243938694);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1873709941 ^ (long)1873710056);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-500476433 ^ (long)-500476636);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)229107800 ^ (long)229107918);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)623285842 ^ (long)623286004);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)542136000 ^ (long)542135859);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-105179904 ^ (long)-105179890);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-314703671 ^ (long)-314703705);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)1292060377 ^ (long)1292060269);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-229311769 ^ (long)-229311844);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)1733108272 ^ (long)1733108328);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-45012879 ^ (long)-45012741);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-83463309 ^ (long)-83463343);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)640608879 ^ (long)640608950);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-126267628 ^ (long)-126267543);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1593917524 ^ (long)1593917568);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)919725650 ^ (long)919725631);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)421873617 ^ (long)421873592);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)1081914693 ^ (long)1081914697);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1330867376 ^ (long)1330867274);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1911760353 ^ (long)-1911760377);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1088476810 ^ (long)1088476803);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1637923751 ^ (long)-1637923596);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1697471999 ^ (long)-1697471761);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)94005106 ^ (long)94005060);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-839238350 ^ (long)-839238387);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)219032716 ^ (long)219032828);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)778684579 ^ (long)778684631);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-429265792 ^ (long)-429265722);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-1462243504 ^ (long)-1462243342);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)70118319 ^ (long)70118369);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)329523464 ^ (long)329523493);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-435934735 ^ (long)-435934874);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1357112584 ^ (long)-1357112745);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-1704823780 ^ (long)-1704823628);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)633365882 ^ (long)633365895);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)1364317285 ^ (long)1364317209);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1669437290 ^ (long)1669437423);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-923479345 ^ (long)-923479433);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-421226278 ^ (long)-421226346);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)978472365 ^ (long)978472358);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-752795807 ^ (long)-752795655);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1435479136 ^ (long)-1435479195);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-814515580 ^ (long)-814515712);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1046901513 ^ (long)-1046901592);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-255199334 ^ (long)-255199322);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)439364533 ^ (long)439364556);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)807275513 ^ (long)807275456);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-380378751 ^ (long)-380378749);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)583662276 ^ (long)583662080);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1823857245 ^ (long)1823857380);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)934581915 ^ (long)934581940);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)840523007 ^ (long)840522782);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-275934720 ^ (long)-275934465);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)197461652 ^ (long)197461632);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-1749607960 ^ (long)-1749607985);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1875363136 ^ (long)-1875363157);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-1194709139 ^ (long)-1194709002);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1207637308 ^ (long)1207637371);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1827383892 ^ (long)-1827383957);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)398488930 ^ (long)398489067);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1493300847 ^ (long)1493300909);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-1538724792 ^ (long)-1538724747);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-226494868 ^ (long)-226494789);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1993958555 ^ (long)1993958548);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-2046596642 ^ (long)-2046596781);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-1882222738 ^ (long)-1882222795);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1860639973 ^ (long)1860639822);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1633834524 ^ (long)-1633834694);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)547532482 ^ (long)547532519);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1587891681 ^ (long)-1587891708);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1261078437 ^ (long)1261078397);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)709490657 ^ (long)709490497);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-169724345 ^ (long)-169724253);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1442778678 ^ (long)1442778832);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)615389890 ^ (long)615389841);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-454610984 ^ (long)-454610954);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1209001208 ^ (long)-1209001088);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1730543380 ^ (long)-1730543364);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-897854932 ^ (long)-897854835);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1332368537 ^ (long)-1332368490);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-648616205 ^ (long)-648616315);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1217033738 ^ (long)1217033794);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)1198554055 ^ (long)1198553919);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)958966281 ^ (long)958966419);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1940815736 ^ (long)1940815639);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)302586726 ^ (long)302586873);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1504869801 ^ (long)-1504869783);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)1580411155 ^ (long)1580411282);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)18498230 ^ (long)18498279);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1411866847 ^ (long)-1411866627);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-721579979 ^ (long)-721579945);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)2137050135 ^ (long)2137050326);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-699347634 ^ (long)-699347672);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1376108685 ^ (long)-1376108603);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1695488854 ^ (long)1695488853);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)2093037623 ^ (long)2093037706);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1760059417 ^ (long)-1760059561);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-1363365008 ^ (long)-1363364893);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1368373812 ^ (long)-1368373902);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-193811968 ^ (long)-193811912);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)215315161 ^ (long)215315141);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-1007862237 ^ (long)-1007862210);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)651866402 ^ (long)651866389);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1976810192 ^ (long)-1976810229);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1607964641 ^ (long)1607964560);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)148106174 ^ (long)148106234);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)29264269 ^ (long)29264346);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-674068086 ^ (long)-674068039);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)300201209 ^ (long)300201018);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)944158678 ^ (long)944158491);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1862849569 ^ (long)-1862849576);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)459930544 ^ (long)459930549);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-106579674 ^ (long)-106579528);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-2063336193 ^ (long)-2063336286);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)760616351 ^ (long)760616221);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-406096311 ^ (long)-406096297);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-134605717 ^ (long)-134605687);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-166538623 ^ (long)-166538585);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1807457280 ^ (long)1807457345);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)371903069 ^ (long)371903037);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1915232995 ^ (long)-1915232849);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1916924252 ^ (long)-1916924281);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1365633325 ^ (long)-1365633401);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1828424379 ^ (long)1828424302);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)60064757 ^ (long)60064694);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)206767199 ^ (long)206767236);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1943108723 ^ (long)-1943108809);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1697239148 ^ (long)1697239177);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)302953970 ^ (long)302953895);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)638797256 ^ (long)638797179);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1754191792 ^ (long)1754191628);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)498320565 ^ (long)498320551);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)552964700 ^ (long)552964768);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)741338395 ^ (long)741338614);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)884693838 ^ (long)884693847);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1064944936 ^ (long)-1064944932);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1468036015 ^ (long)-1468035909);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)744633403 ^ (long)744633559);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1289941724 ^ (long)1289941734);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)2044382810 ^ (long)2044382779);
                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-714456616 ^ (long)-714456652);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1677309067 ^ (long)1677309044)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)334637409 ^ (long)334681758)) >>> (int)((long)1948434124 ^ (long)1948434116)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-2120341186 ^ (long)-2120341186);
            if (!3f.\u2004\u200f\u200b\u2004\u2000) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1837599795 ^ (long)1837599793);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)438490389 ^ (long)438490390) | var5_6 << (int)((long)-1999110111 ^ (long)-1999110108)) ^ var3_4[var7_8]) & (int)((long)508497143 ^ (long)508496904);
                    if (3f.\u2004\u200f\u200b\u2004\u2000) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1055933798 ^ (long)1055933797) | var6_7 << (int)((long)905908521 ^ (long)905908524)) ^ var3_4[var7_8]) & (int)((long)641209234 ^ (long)641209197);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            3f.b[var2_3] = new String(var3_4).intern();
        }
        return 3f.b[var2_3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 3f.\u2004\u200f\u200b\u2004\u2000;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)-718561178 ^ (long)-718561169)];
            if (var7) break block25;
            var3_2 = (int)((long)2128568031 ^ (long)2128568031);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\u745c\u5c5e\u9f10\u62f8\u74ab\u5cf7\u9f64\u6220\u7404\u5c32\u9fa5\u62d5\u74dc\u5cfc\u9f59\u6224\u74c6\u5cac\u9f19\u629f\u745f\u5c20\u9f90\u627b\u748e\u5c48\u9f02\u62d6\u743d\u5c7e\u9f40\u62b4\u74e6\u5c59\u9f0e\u6202\u74c0\u5c7a\u9f31\u62e0\u746e\u5c97\u9fbf\u62d1\u7423\u5c08\u9f5f\u624c\u744d\u5cb3\u9f59\u6272\u74d7\u5c73\u9f12\u62bb\u7463\u5c5a\u9f3c\u62d8\u7409\u5c35\u9faf\u6252\u7414\u5cc6\u9f2b\u6292\u7477\u5c8d\u9f0b\u625e\u74a7\u5ca2\u9f5d\u6231\u7480\u5c6e\u9f67\u629c\u748a\u5c3b\u9f56\u62d1\u748b\u5c14\u9ff0\u6211\u743f\u5c78\u9f62\u6238\u7412\u5c4a\u9f51\u62dd\u74a2\u5c76\u9f4a\u621c\u7460\u5cb9\u9f4d\u6212\u74d8\u5cf0\u9fdf\u62e6\u7435\u5c73\u9fb7\u6270\u7404\u5c74\u9fb9\u62dd\u74cd\u5c0a\u9fc9\u6248\u74c4\u5ca0\u9f39", -1692970281);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)-1753753349 ^ (long)-1753753384);
            if (var7) break block25;
            var0_6 = (int)((long)-307425002 ^ (long)307425001);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)1330412560 ^ (long)1330412576);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)219220336 ^ (long)-219220337);
                        if (3f.\u2004\u200f\u200b\u2004\u2000) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!3f.\u2004\u200f\u200b\u2004\u2000) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u82af\uaae2\u6999\u94ac\u8256\uaad1\u69c1\u94a5\u82ff\uaad7\u694a\u94c1\u82d1\uaaa7\u6972\u9404\u822b\uaac4", 2078385172);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)-636191280 ^ (long)-636191269);
                                var0_6 = (int)((long)1157516142 ^ (long)-1157516143);
                                while (true) {
                                    v0 = (int)((long)947983705 ^ (long)947983666);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)1639150687 ^ (long)1639150687);
                                    if (!3f.\u2004\u200f\u200b\u2004\u2000) break block21;
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
                                    if (!3f.\u2004\u200f\u200b\u2004\u2000) ** continue;
                                    throw null;
                                }
                                3f.a = var5_1;
                                3f.b = new String[(int)((long)2077630392 ^ (long)2077630385)];
                                if (3f.\u2004\u200f\u200b\u2004\u2000) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)39956717 ^ (long)39956717);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)-1683163650 ^ (long)-1683163649)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)1342794934 ^ (long)1342794929)) {
                                    case 0: {
                                        v15 = (int)((long)-1649677811 ^ (long)-1649677822);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-1044979050 ^ (long)-1044979070);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-1110103982 ^ (long)-1110104034);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)196199506 ^ (long)196199439);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)1148531749 ^ (long)1148531808);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)1905081031 ^ (long)1905081030);
                                        if (!3f.\u2004\u200f\u200b\u2004\u2000) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)-1806870788 ^ (long)-1806870899);
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var6_7;
                                v8 = v11;
                                if (v11 != 0) break block23;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            } while (!3f.\u2004\u200f\u200b\u2004\u2000);
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
lbl119:
                        // 1 sources

                        ** continue;
                    }
                }
                v17 = new a[(int)((long)-547955661 ^ (long)-547955662)];
                v17[(int)((long)1019490684 ^ (long)1019490684)] = a.m;
                3f.2 = new 3i().0((String)3f.a((int)((int)((long)610207980 ^ (long)-610224062)), (int)((int)((long)1523410998 ^ (long)1523407889))), (a[])v17).0;
                v18 = new a[(int)((long)-157520314 ^ (long)-157520313)];
                v18[(int)((long)1082241501 ^ (long)1082241501)] = a.m;
                3f.0 = new 3i().0((String)3f.a((int)((int)((long)-376493884 ^ (long)376477806)), (int)((int)((long)-1179689655 ^ (long)1179683901))), (a[])v18).0;
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
                if (bl2 || bl2) break block2;
                0ay.3();
                7Q.0(this.stream().map(Object::toString).collect(Collectors.toList()), 0ay.0(3f.a((int)((long)-1154680791 ^ (long)1154697344), (int)((long)1926366010 ^ (long)-1926389137))));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final 0a2 3(String string) {
        boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
        if (bl2 || bl2) {
            return null;
        }
        return this.stream().filter(a2 -> {
            boolean bl2 = \u2004\u200f\u200b\u2004\u2000;
            if (bl2 || bl2) {
                return true;
            }
            return a2.0.equalsIgnoreCase(string);
        }).findFirst().orElse(null);
    }
}

