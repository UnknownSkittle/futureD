/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  cdr
 *  cds
 *  nf
 */
package net.impactclient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import net.impactclient.05;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.2E;
import net.impactclient.2_;
import net.impactclient.5H;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3L
implements 0T {
    private static final Map<String, nf> 1;
    private final Map<String, nf> 0;
    private static final String[] b;
    private static final String[] a;
    public static final boolean \u200a\u200d\u200c\u2004;

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 3L.\u200a\u200d\u200c\u2004;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)184974110 ^ (long)184974106)];
            if (var7) break block25;
            var3_2 = (int)((long)-360958092 ^ (long)-360958092);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\ude86\uf688\u350e\uc880\ude68\uf693\u35fa\uc8ca\udebe\uf67d\u350b\uc895\ude67\uf651\u357c\uc837\ude7b", -1961232335);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)1611123681 ^ (long)1611123684);
            if (var7) break block25;
            var0_6 = (int)((long)647210459 ^ (long)-647210460);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)1610216201 ^ (long)1610216202);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)-1102408691 ^ (long)1102408690);
                        if (3L.\u200a\u200d\u200c\u2004) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!3L.\u200a\u200d\u200c\u2004) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u6eed\u46de\u8520\u785b\u6e99\u4617\u85bd\u78f1\u6e09\u4667\u851d\u7847\u6e19\u468c\u8527\u78f2\u6eeb\u46a2\u850f\u786b\u6e69\u4617\u85ac\u7887\u6ea3\u46a7\u8579\u7858\u6e11\u466b\u8517\u7812\u6eac\u465b\u85b8\u787c\u6e86\u46e8\u85d1", -1166260163);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)-186146778 ^ (long)-186146783);
                                var0_6 = (int)((long)561747035 ^ (long)-561747036);
                                while (true) {
                                    v0 = (int)((long)668537229 ^ (long)668537251);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)1248390938 ^ (long)1248390938);
                                    if (!3L.\u200a\u200d\u200c\u2004) break block21;
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
                                    if (!3L.\u200a\u200d\u200c\u2004) ** continue;
                                    throw null;
                                }
                                3L.a = var5_1;
                                3L.b = new String[(int)((long)-1401784826 ^ (long)-1401784830)];
                                if (3L.\u200a\u200d\u200c\u2004) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)1282348810 ^ (long)1282348810);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)1787459090 ^ (long)1787459091)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)-1949885426 ^ (long)-1949885431)) {
                                    case 0: {
                                        v15 = (int)((long)1191925517 ^ (long)1191925543);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)1229699465 ^ (long)1229699578);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-1337531552 ^ (long)-1337531610);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)-1854338721 ^ (long)-1854338722);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)360791319 ^ (long)360791379);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-982212534 ^ (long)-982212594);
                                        if (!3L.\u200a\u200d\u200c\u2004) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)-1597595673 ^ (long)-1597595756);
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
                            } while (!3L.\u200a\u200d\u200c\u2004);
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
                3L.1 = new HashMap<String, nf>();
                break;
            }
        }
    }

    public static nf 0(String string) {
        boolean bl2 = \u200a\u200d\u200c\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return 3L.0(string, (boolean)((long)-1295499807 ^ (long)-1295499807));
    }

    /*
     * Enabled aggressive block sorting
     */
    public 3L() {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200d\u200c\u2004;
                if (bl2 || bl2) break block2;
                this.0 = new HashMap<String, nf>();
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 3L.\u200a\u200d\u200c\u2004;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1841131848 ^ (long)-1841104187)) & (int)((long)-1344084593 ^ (long)-1344136592);
            if (var9_2) ** GOTO lbl-1000
            if (3L.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 3L.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-2020446167 ^ (long)-2020446167)] & (int)((long)170782867 ^ (long)170782828)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1077138289 ^ (long)1077138192);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)1986805962 ^ (long)1986805924);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1107959607 ^ (long)-1107959791);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)233482899 ^ (long)233482875);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)390270897 ^ (long)390270915);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)468512931 ^ (long)468512887);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1641953294 ^ (long)1641953402);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1239263639 ^ (long)1239263503);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1227856042 ^ (long)-1227856042);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)132834509 ^ (long)132834482);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)435538641 ^ (long)435538649);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)150009090 ^ (long)150009231);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1280547013 ^ (long)-1280546893);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)1146514205 ^ (long)1146514268);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)2000624290 ^ (long)2000624227);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1559190341 ^ (long)-1559190360);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)996648430 ^ (long)996648424);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)2138315776 ^ (long)2138315982);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-374789995 ^ (long)-374790035);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-371823275 ^ (long)-371823297);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-583227108 ^ (long)-583227132);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1889352454 ^ (long)1889352598);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1501468233 ^ (long)1501468238);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)939358362 ^ (long)939358443);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)239876339 ^ (long)239876192);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1380757463 ^ (long)-1380757303);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-423396272 ^ (long)-423396281);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1317164133 ^ (long)-1317164155);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1307729203 ^ (long)-1307729258);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1810489194 ^ (long)-1810489165);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)272126785 ^ (long)272126828);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1980264598 ^ (long)1980264617);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1947026964 ^ (long)-1947026954);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1152277759 ^ (long)-1152277668);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1921357749 ^ (long)-1921357698);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-387187938 ^ (long)-387187839);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1397469890 ^ (long)-1397469746);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)282289253 ^ (long)282289337);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)1585186756 ^ (long)1585186804);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-30032720 ^ (long)-30032873);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1860964174 ^ (long)-1860964343);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-223883802 ^ (long)-223883830);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-37821321 ^ (long)-37821247);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)1208357639 ^ (long)1208357634);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1116039982 ^ (long)-1116040091);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1574624529 ^ (long)-1574624580);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)507390896 ^ (long)507390946);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-184253322 ^ (long)-184253221);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1107979733 ^ (long)-1107979538);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1040536136 ^ (long)-1040536068);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)511501881 ^ (long)511501891);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-2138865832 ^ (long)-2138865906);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1721269862 ^ (long)1721269936);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-928030633 ^ (long)-928030571);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-608854509 ^ (long)-608854336);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-387048008 ^ (long)-387048037);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)2125126583 ^ (long)2125126478);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)244751595 ^ (long)244751439);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1542136142 ^ (long)-1542136079);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-38184413 ^ (long)-38184200);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)525361707 ^ (long)525361888);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1628050632 ^ (long)-1628050608);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1854466023 ^ (long)1854465917);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1812076354 ^ (long)-1812076428);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1149613079 ^ (long)-1149613253);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)242479045 ^ (long)242478894);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1898430729 ^ (long)1898430726);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1392199939 ^ (long)1392200138);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-1592194899 ^ (long)-1592194838);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)239593838 ^ (long)239593951);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1080434260 ^ (long)1080434286);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)231604339 ^ (long)231604293);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)955167063 ^ (long)955167005);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)399167336 ^ (long)399167323);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1159917276 ^ (long)1159917174);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1487795823 ^ (long)1487795838);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)219221860 ^ (long)219221878);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1050984479 ^ (long)-1050984700);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1709427786 ^ (long)-1709427779);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-821631939 ^ (long)-821631999);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)296660678 ^ (long)296660669);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1859912215 ^ (long)1859912390);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-850703043 ^ (long)-850702873);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-436293656 ^ (long)-436293807);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1911489468 ^ (long)1911489431);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1036144109 ^ (long)1036143913);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1355298294 ^ (long)1355298075);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)353883001 ^ (long)353882996);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)1589797539 ^ (long)1589797502);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1078211064 ^ (long)1078210854);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1208549390 ^ (long)-1208549527);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)76209879 ^ (long)76209806);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-421015742 ^ (long)-421015573);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)607075369 ^ (long)607075457);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1890751341 ^ (long)1890751382);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1448866212 ^ (long)1448866063);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-109601795 ^ (long)-109601987);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-250008460 ^ (long)-250008393);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)708602556 ^ (long)708602531);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1332176070 ^ (long)1332175929);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)2145067221 ^ (long)2145067032);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-2010363671 ^ (long)-2010363725);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)639833459 ^ (long)639833466);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)1580993540 ^ (long)1580993665);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1121114502 ^ (long)-1121114418);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-329964151 ^ (long)-329964092);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1576113747 ^ (long)-1576113735);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)154918017 ^ (long)154917945);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)1414495594 ^ (long)1414495601);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)907321257 ^ (long)907321216);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)774108672 ^ (long)774108796);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)650878088 ^ (long)650878016);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1893286203 ^ (long)1893286283);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1468064314 ^ (long)1468064315);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)755303714 ^ (long)755303927);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1140004412 ^ (long)1140004534);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-373928326 ^ (long)-373928419);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-955842449 ^ (long)-955842453);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)392674502 ^ (long)392674446);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-1161062843 ^ (long)-1161062735);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-306756434 ^ (long)-306756465);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)1499362058 ^ (long)1499362169);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1917858366 ^ (long)-1917858350);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1531454075 ^ (long)1531453975);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1729261164 ^ (long)-1729261281);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1227398251 ^ (long)1227398373);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-280488954 ^ (long)-280488732);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-804170937 ^ (long)-804170827);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)2026332387 ^ (long)2026332257);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1211365531 ^ (long)1211365571);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-1387721850 ^ (long)-1387721767);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)2074034891 ^ (long)2074034780);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-2120470671 ^ (long)-2120470573);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-903063306 ^ (long)-903063433);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1130249570 ^ (long)1130249515);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-112409230 ^ (long)-112409145);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-515395515 ^ (long)-515395351);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1739673974 ^ (long)-1739673991);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-1219603198 ^ (long)-1219603011);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1688908530 ^ (long)1688908381);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-1398679943 ^ (long)-1398680038);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)442178406 ^ (long)442178534);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1847973016 ^ (long)-1847973060);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)869330191 ^ (long)869330411);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-528309246 ^ (long)-528309216);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-697524359 ^ (long)-697524320);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)3388559 ^ (long)3388549);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1755560097 ^ (long)1755560132);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-782503859 ^ (long)-782503769);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-522767978 ^ (long)-522768091);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-48714661 ^ (long)-48714664);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1009615925 ^ (long)-1009615941);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1079293513 ^ (long)1079293642);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-515155232 ^ (long)-515155343);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1864598697 ^ (long)-1864598649);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)971013076 ^ (long)971012914);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1606215335 ^ (long)1606215326);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1782201524 ^ (long)-1782201383);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)464852013 ^ (long)464852016);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-141694336 ^ (long)-141694457);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-1637582138 ^ (long)-1637582191);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1248759317 ^ (long)1248759531);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-1344880553 ^ (long)-1344880582);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-262258660 ^ (long)-262258477);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-1708992295 ^ (long)-1708992348);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-595119331 ^ (long)-595119359);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-2014674427 ^ (long)-2014674303);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)1636827649 ^ (long)1636827812);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-157325708 ^ (long)-157325797);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-1662467354 ^ (long)-1662467440);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1506782017 ^ (long)1506782070);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-259250161 ^ (long)-259250056);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1703301703 ^ (long)1703301743);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)2054039141 ^ (long)2054039067);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1338297866 ^ (long)1338297955);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-212063854 ^ (long)-212063785);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)715210974 ^ (long)715210761);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1383686473 ^ (long)-1383686513);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1134619275 ^ (long)1134619213);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-1752098253 ^ (long)-1752098160);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)2035599859 ^ (long)2035599618);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)120959445 ^ (long)120959264);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)565193754 ^ (long)565193854);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1041463184 ^ (long)-1041463246);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)1570233449 ^ (long)1570233383);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)517517975 ^ (long)517518040);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)1296002740 ^ (long)1296002594);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-601014874 ^ (long)-601014816);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-1923729991 ^ (long)-1923730133);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1171987026 ^ (long)1171986946);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-1661781314 ^ (long)-1661781501);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-573764813 ^ (long)-573764844);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-343377275 ^ (long)-343377177);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1114765135 ^ (long)1114765266);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-2143655946 ^ (long)-2143655993);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)2090038999 ^ (long)2090038857);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1594905626 ^ (long)1594905670);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)526262643 ^ (long)526262682);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)1437270050 ^ (long)1437270114);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1934027073 ^ (long)1934027021);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1435169607 ^ (long)-1435169556);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1750100752 ^ (long)-1750100887);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)2073962816 ^ (long)2073962950);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-770523174 ^ (long)-770523247);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1802747240 ^ (long)-1802747292);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)614783287 ^ (long)614783365);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-396255999 ^ (long)-396255795);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1322320761 ^ (long)1322320885);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1927471775 ^ (long)-1927471653);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-1514921315 ^ (long)-1514921413);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1020517346 ^ (long)1020517356);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)615065572 ^ (long)615065362);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1052195555 ^ (long)1052195553);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1403972546 ^ (long)1403972429);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-549232169 ^ (long)-549232265);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1762310675 ^ (long)-1762310709);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)1697416373 ^ (long)1697416264);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-26079637 ^ (long)-26079604);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-426188130 ^ (long)-426188265);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1629839383 ^ (long)-1629839376);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1060095469 ^ (long)1060095440);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)805219910 ^ (long)805219885);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1696576664 ^ (long)1696576633);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1242471742 ^ (long)-1242471699);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-981879408 ^ (long)-981879540);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-34048910 ^ (long)-34048818);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1749777153 ^ (long)1749777172);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1327985523 ^ (long)1327985418);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)862412973 ^ (long)862412941);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-872158750 ^ (long)-872158822);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)1060279807 ^ (long)1060279659);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-166770422 ^ (long)-166770426);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-112537550 ^ (long)-112537460);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-1291780508 ^ (long)-1291780530);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1410097312 ^ (long)1410097307);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1935526249 ^ (long)1935526172);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-423603157 ^ (long)-423603067);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-91577857 ^ (long)-91578084);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)753251835 ^ (long)753251605);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1961079238 ^ (long)1961079288);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-1879838580 ^ (long)-1879838552);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-339851729 ^ (long)-339851563);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1252449621 ^ (long)1252449633);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1636150436 ^ (long)-1636150357);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1897646240 ^ (long)-1897646143);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-768443459 ^ (long)-768443505);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-905983378 ^ (long)-905983440);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)1559098000 ^ (long)1559097990);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1768535031 ^ (long)1768534929);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1063429301 ^ (long)-1063429228);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)339882589 ^ (long)339882611);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-20000480 ^ (long)-20000308);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)2079745884 ^ (long)2079745805);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1909757446 ^ (long)-1909757542);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1956041702 ^ (long)-1956041507);
                    if (!3L.\u200a\u200d\u200c\u2004) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)986213604 ^ (long)986213387);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1557658308 ^ (long)1557658171)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-698814729 ^ (long)-698871544)) >>> (int)((long)-1115828518 ^ (long)-1115828526)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1250823467 ^ (long)-1250823467);
            if (!3L.\u200a\u200d\u200c\u2004) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-391914119 ^ (long)-391914117);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-2013905936 ^ (long)-2013905933) | var5_6 << (int)((long)465004852 ^ (long)465004849)) ^ var3_4[var7_8]) & (int)((long)-449140 ^ (long)-449165);
                    if (3L.\u200a\u200d\u200c\u2004) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)370022335 ^ (long)370022332) | var6_7 << (int)((long)-2133652824 ^ (long)-2133652819)) ^ var3_4[var7_8]) & (int)((long)-424617989 ^ (long)-424618236);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            3L.b[var2_3] = new String(var3_4).intern();
        }
        return 3L.b[var2_3];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static nf 1(String object, boolean bl2) {
        void var1_2;
        nf nf2;
        Object object2;
        boolean bl3;
        block3: {
            bl3 = \u200a\u200d\u200c\u2004;
            if (bl3 || bl3) return null;
            object2 = 05.0(3L.a((int)((long)818002160 ^ (long)-818007171), (int)((long)1993566508 ^ (long)1993566831))).0((String)object, 5H.0);
            if (bl3 || bl3) return null;
            nf2 = new nf(3L.a((int)((long)-190296955 ^ (long)190301961), (int)((long)-1393816303 ^ (long)1393811849)).concat(String.valueOf(object2)));
            if (bl3) return null;
            int n2 = (int)((long)-676011115 ^ (long)676030490);
            0ay.3();
            object2 = Paths.get(0ay.1(3L.a(n2, (int)((long)-1457332087 ^ (long)-1457355368)).concat(String.valueOf(object2))), new String[(int)((long)-627506303 ^ (long)-627506303)]);
            if (bl3) return null;
            try {
                if (bl3) return null;
                Files.createDirectories(object2.getParent(), new FileAttribute[(int)((long)523615637 ^ (long)523615637)]);
                if (bl3 || bl3) return null;
                if (!\u200a\u200d\u200c\u2004) break block3;
                throw null;
            } catch (IOException iOException) {
                if (bl3 || bl3) return null;
                0ay.0a.error(3L.a((int)((long)-404185280 ^ (long)404165838), (int)((long)373059161 ^ (long)-373038630)) + object2.toString(), (Throwable)iOException);
                if (bl3) return null;
            }
        }
        if (bl3) return null;
        cdr cdr2 = 2.N();
        if (bl3 || bl3) return null;
        2_ _ = new 2_((boolean)var1_2);
        if (bl3 || bl3) return null;
        2E e2 = new 2E(object2.toFile(), (String)object, _, (String)object, _, (Path)object2);
        if (bl3 || bl3) return null;
        cdr2.a(nf2, (cds)e2);
        if (!bl3 && !bl3) return nf2;
        return null;
    }

    public static nf 0(String string, boolean bl2) {
        boolean bl3 = \u200a\u200d\u200c\u2004;
        if (bl3 || bl3) {
            return null;
        }
        String string3 = string;
        return 1.computeIfAbsent(string3, string2 -> {
            boolean bl3 = \u200a\u200d\u200c\u2004;
            if (bl3 || bl3) {
                return null;
            }
            return 3L.1(string3, bl2);
        });
    }
}

