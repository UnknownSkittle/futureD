/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bii
 */
package net.impactclient;

import com.google.gson.JsonObject;
import java.util.UUID;
import net.impactclient.0T;
import net.impactclient.0ar;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 1R
implements 0T {
    protected 0ar 4;
    public static final boolean \u2003;
    private static final String[] a;
    protected UUID 1;
    protected bii 3;
    private static final String[] b;
    protected String 5;

    public abstract String 2();

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                var7 = 1R.\u2003;
                if (!var7) break block15;
                break block16;
            }
            var5_1 = new String[(int)((long)-1018919697 ^ (long)-1018919700)];
            if (var7) break block16;
            var3_2 = (int)((long)2070331655 ^ (long)2070331655);
            if (var7) break block16;
            var2_3 = 0rB$1f.XNZw("\ube2d\u9641\u55e5\ua847\ube86\u96e8\u55c0\ua837\ube4b\u9642\u55d5\ua807\ube8f\u962d", 316184815);
            var4_4 = var2_3.length();
            if (var7) break block16;
            var1_5 = (int)((long)-931594903 ^ (long)-931594899);
            if (var7) break block16;
            var0_6 = (int)((long)622696295 ^ (long)-622696296);
            if (var7) break block16;
            block8: while (!var7) {
                v0 = ++var0_6;
                v1 = (int)((long)1891346680 ^ (long)-1891346681);
                if (1R.\u2003) {
                    throw null;
                    while (true) {
                        var5_1[var3_2++] = new String(v2).intern();
                        if ((var0_6 += var1_5) < var4_4) {
                            var1_5 = var2_3.charAt(var0_6);
                            if (!1R.\u2003) continue block8;
                            throw null;
                        }
                        1R.a = var5_1;
                        1R.b = new String[(int)((long)-2054167363 ^ (long)-2054167362)];
                        if (!1R.\u2003) break block8;
                        throw null;
                    }
                }
                v3 = var2_3.substring(v0, v0 + var1_5).toCharArray();
                v4 = v3.length;
                var6_7 = (int)((long)-1503967687 ^ (long)-1503967687);
                v5 = (int)((long)-20222708 ^ (long)-20222672);
                v6 = v3;
                v7 = v4;
                if (v4 > (int)((long)-1444435068 ^ (long)-1444435067)) ** GOTO lbl87
                do {
                    block14: {
                        v8 = v5;
                        v6 = v6;
                        v9 = v6;
                        v10 = v5;
                        v11 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-761926709 ^ (long)-761926708)) {
                                case 0: {
                                    v12 = (int)((long)1100380296 ^ (long)1100380397);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                case 1: {
                                    v12 = (int)((long)-2144880957 ^ (long)-2144880949);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                case 2: {
                                    v12 = (int)((long)234166206 ^ (long)234166269);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                case 3: {
                                    v12 = (int)((long)1558303103 ^ (long)1558303094);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                case 4: {
                                    v12 = (int)((long)551670071 ^ (long)551670098);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                case 5: {
                                    v12 = (int)((long)2052047255 ^ (long)2052047260);
                                    if (!1R.\u2003) break;
                                    throw null;
                                }
                                default: {
                                    v12 = (int)((long)-1559547899 ^ (long)-1559547883);
                                }
                            }
                            v9[v11] = (char)(v9[v11] ^ (v10 ^ v12));
                            ++var6_7;
                            v5 = v8;
                            if (v8 != 0) break block14;
                            v8 = v5;
                            v6 = v6;
                            v11 = v5;
                            v9 = v6;
                            v10 = v5;
                        } while (!1R.\u2003);
                        throw null;
                    }
                    v2 = v6;
                    v7 = v7;
                } while (v7 > var6_7);
                if (!1R.\u2003) ** continue;
                throw null;
            }
        }
    }

    public abstract boolean 1();

    public abstract String 4();

    /*
     * Enabled aggressive block sorting
     */
    public final 0ar 6() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) return null;
        if (2.K() == this.3) {
            if (bl2) return null;
            return 0ar.f;
        }
        if (!bl2) return this.4;
        return null;
    }

    public final UUID 9() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return this.1;
    }

    public abstract String 0();

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 1R.\u2003;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)351034912 ^ (long)351039432)) & (int)((long)-278768849 ^ (long)-278745904);
            if (var9_2) ** GOTO lbl-1000
            if (1R.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 1R.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-525728736 ^ (long)-525728736)] & (int)((long)-123512619 ^ (long)-123512790)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-944778637 ^ (long)-944778565);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-2048314420 ^ (long)-2048314401);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1990667590 ^ (long)1990667705);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1813434068 ^ (long)-1813433941);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)741162522 ^ (long)741162672);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-319705548 ^ (long)-319705564);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-568421173 ^ (long)-568421374);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-149161079 ^ (long)-149161071);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)243011058 ^ (long)243010862);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-950060912 ^ (long)-950060877);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1247139282 ^ (long)-1247139082);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)1756282669 ^ (long)1756282757);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)280296481 ^ (long)280296696);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-409505234 ^ (long)-409505057);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)2035420815 ^ (long)2035420789);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)538783788 ^ (long)538783791);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)771448095 ^ (long)771448196);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1794847092 ^ (long)-1794847192);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1180146426 ^ (long)-1180146355);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-1545200654 ^ (long)-1545200703);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1016093308 ^ (long)1016093404);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-615571064 ^ (long)-615571019);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-421920335 ^ (long)-421920312);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-852004145 ^ (long)-852004186);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)72327382 ^ (long)72327168);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)163269565 ^ (long)163269488);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1921994825 ^ (long)1921994769);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-356236848 ^ (long)-356236865);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)2004795697 ^ (long)2004795747);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1314971776 ^ (long)-1314971881);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1510484881 ^ (long)-1510484771);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-279156191 ^ (long)-279156000);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)24354947 ^ (long)24354914);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1901933172 ^ (long)1901933179);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1004034951 ^ (long)-1004035015);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1503897711 ^ (long)1503897602);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)53295059 ^ (long)53294904);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-569615277 ^ (long)-569615155);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)1753864631 ^ (long)1753864571);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)407065483 ^ (long)407065559);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)1653859031 ^ (long)1653858860);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)730073382 ^ (long)730073465);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-186805135 ^ (long)-186805188);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1605711672 ^ (long)-1605711685);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)1806183685 ^ (long)1806183870);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-649779264 ^ (long)-649779366);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)2033224501 ^ (long)2033224628);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1842600717 ^ (long)-1842600912);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-432436306 ^ (long)-432436312);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-712132869 ^ (long)-712132959);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)2065231535 ^ (long)2065231597);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1217787146 ^ (long)-1217787178);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)67638251 ^ (long)67638189);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-443251238 ^ (long)-443251292);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-2103835098 ^ (long)-2103834989);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1669424106 ^ (long)-1669423919);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1508000496 ^ (long)-1508000417);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-820319964 ^ (long)-820319831);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)2123358042 ^ (long)2123358200);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)190638294 ^ (long)190638084);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-342649578 ^ (long)-342649454);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-419771778 ^ (long)-419771709);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-225630094 ^ (long)-225630178);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1808529526 ^ (long)-1808529413);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1175192716 ^ (long)-1175192577);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-51053636 ^ (long)-51053758);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1913561001 ^ (long)-1913560889);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1721063575 ^ (long)-1721063579);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1599087202 ^ (long)1599087359);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1174406283 ^ (long)1174406267);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1741301582 ^ (long)-1741301636);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)1951558020 ^ (long)1951557949);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-867251403 ^ (long)-867251217);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-207477953 ^ (long)-207477971);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-64291093 ^ (long)-64291173);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1506367678 ^ (long)1506367587);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1875453597 ^ (long)-1875453617);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)474181848 ^ (long)474181819);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1941133224 ^ (long)1941133236);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1850818538 ^ (long)1850818317);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-38243099 ^ (long)-38243170);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-1033333904 ^ (long)-1033333944);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)818496147 ^ (long)818496147);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1829189056 ^ (long)-1829188884);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-1545642247 ^ (long)-1545642426);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1563731157 ^ (long)1563731148);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1264690275 ^ (long)-1264690268);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)557290897 ^ (long)557290946);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)505018982 ^ (long)505019062);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1845473638 ^ (long)1845473778);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1731689694 ^ (long)1731689493);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)1868694886 ^ (long)1868694871);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)230103919 ^ (long)230103817);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-655309218 ^ (long)-655309145);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)350868863 ^ (long)350868935);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1357452415 ^ (long)-1357452355);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)2011423184 ^ (long)2011422994);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1052512911 ^ (long)-1052512901);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-963893458 ^ (long)-963893363);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)732928636 ^ (long)732928729);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)353466484 ^ (long)353466558);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)81606891 ^ (long)81606819);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1989671169 ^ (long)-1989671228);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-615051266 ^ (long)-615051402);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-642229839 ^ (long)-642229846);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-1178496975 ^ (long)-1178496785);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)2017439085 ^ (long)2017439042);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-2076000604 ^ (long)-2076000513);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-2142701613 ^ (long)-2142701719);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)604670217 ^ (long)604670216);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-1752881357 ^ (long)-1752881339);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1175857757 ^ (long)1175857816);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-2886114 ^ (long)-2886091);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1393699079 ^ (long)1393699180);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1484982348 ^ (long)1484982297);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-327703633 ^ (long)-327703601);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1746870409 ^ (long)-1746870298);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1171332967 ^ (long)-1171332928);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)361691816 ^ (long)361691714);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-1867512891 ^ (long)-1867512981);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1646274075 ^ (long)1646274145);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)625972339 ^ (long)625972386);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1254326783 ^ (long)-1254326775);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-1530542845 ^ (long)-1530542780);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-879328008 ^ (long)-879328023);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-1265912324 ^ (long)-1265912536);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-996821016 ^ (long)-996821041);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)626161834 ^ (long)626161816);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)787564165 ^ (long)787564211);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)898367174 ^ (long)898367095);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1014256150 ^ (long)1014256225);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-934773379 ^ (long)-934773432);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)1203850174 ^ (long)1203850116);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1709732957 ^ (long)-1709732886);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1767944558 ^ (long)-1767944461);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-682681157 ^ (long)-682681277);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-2008905231 ^ (long)-2008905345);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)888378984 ^ (long)888379009);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-1759026464 ^ (long)-1759026580);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)493917174 ^ (long)493917090);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)2018685217 ^ (long)2018685284);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-1038777371 ^ (long)-1038777501);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)626963507 ^ (long)626963627);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)8153892 ^ (long)8154107);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1709274867 ^ (long)1709274629);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-161365464 ^ (long)-161365462);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-931104382 ^ (long)-931104283);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)166025101 ^ (long)166024984);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)394705799 ^ (long)394705912);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-1572045162 ^ (long)-1572045198);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)2063654461 ^ (long)2063654410);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)276507891 ^ (long)276507821);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)706735353 ^ (long)706735268);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-2044205428 ^ (long)-2044205347);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-2103563909 ^ (long)-2103564023);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)52487668 ^ (long)52487495);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)645519210 ^ (long)645519322);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)2022884190 ^ (long)2022884150);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)348667653 ^ (long)348667713);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1777815270 ^ (long)-1777815198);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-1061771238 ^ (long)-1061771117);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)947611729 ^ (long)947611769);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1954133946 ^ (long)1954133804);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-1580373381 ^ (long)-1580373455);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)897930216 ^ (long)897930093);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)477683989 ^ (long)477684035);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1963145614 ^ (long)1963145707);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-1937049985 ^ (long)-1937049885);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)313446885 ^ (long)313446734);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)2100416066 ^ (long)2100416099);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-493509045 ^ (long)-493509113);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)669492911 ^ (long)669492912);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1052298392 ^ (long)1052298319);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)1531751624 ^ (long)1531751443);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-992563942 ^ (long)-992563937);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1448369987 ^ (long)1448370070);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)395453066 ^ (long)395452933);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1631283134 ^ (long)1631283107);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1869994810 ^ (long)1869994958);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-1464829199 ^ (long)-1464829436);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-631525191 ^ (long)-631525235);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1990284721 ^ (long)1990284711);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-385053373 ^ (long)-385053401);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-55379019 ^ (long)-55379172);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)561370952 ^ (long)561371015);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-973253487 ^ (long)-973253424);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-471738328 ^ (long)-471738358);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)2126426175 ^ (long)2126426348);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1138559522 ^ (long)1138559544);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)843102792 ^ (long)843102785);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-816148865 ^ (long)-816148756);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1974187461 ^ (long)1974187378);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)199507970 ^ (long)199508207);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)968132426 ^ (long)968132451);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)1274832216 ^ (long)1274832223);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1647792678 ^ (long)-1647792662);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1067261406 ^ (long)1067261228);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)239429146 ^ (long)239429366);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)507030767 ^ (long)507030569);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)865411614 ^ (long)865411832);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)784293295 ^ (long)784293257);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1001413740 ^ (long)-1001413766);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)132674965 ^ (long)132674938);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-539409236 ^ (long)-539409364);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1141314809 ^ (long)-1141314782);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1355345797 ^ (long)-1355345672);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)993155074 ^ (long)993155084);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1098981185 ^ (long)1098981350);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1209605157 ^ (long)-1209605236);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-2056462670 ^ (long)-2056462805);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1663759182 ^ (long)1663759336);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)938215240 ^ (long)938215174);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-1028218714 ^ (long)-1028218873);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1146661635 ^ (long)1146661761);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1506127960 ^ (long)-1506128123);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1054235473 ^ (long)1054235554);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)695069618 ^ (long)695069666);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)120633927 ^ (long)120633976);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)402204960 ^ (long)402204983);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1594087441 ^ (long)1594087428);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1206333941 ^ (long)1206333763);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1050467493 ^ (long)1050467338);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)17747469 ^ (long)17747507);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1838491260 ^ (long)1838491256);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)1391961262 ^ (long)1391961124);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-2106591110 ^ (long)-2106591042);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)174689893 ^ (long)174689957);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1763600444 ^ (long)1763600439);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-222210018 ^ (long)-222209932);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1630885228 ^ (long)1630885145);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)499454467 ^ (long)499454583);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1807469259 ^ (long)-1807469288);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)71274541 ^ (long)71274577);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-1820831792 ^ (long)-1820831892);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-1643485401 ^ (long)-1643485293);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1420592188 ^ (long)-1420592214);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)727220547 ^ (long)727220573);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1951568970 ^ (long)-1951569144);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-746852032 ^ (long)-746851907);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)295371500 ^ (long)295371291);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)727438956 ^ (long)727438968);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1457986549 ^ (long)-1457986325);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1095355614 ^ (long)1095355632);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1638536148 ^ (long)1638536105);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)114487600 ^ (long)114487613);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-935157841 ^ (long)-935157811);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1134598747 ^ (long)1134598680);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-797868620 ^ (long)-797868708);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)2045078053 ^ (long)2045078214);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1639993857 ^ (long)1639994084);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1411609157 ^ (long)-1411609185);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1135087171 ^ (long)-1135087326);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1471221910 ^ (long)1471221866);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1659269267 ^ (long)1659269121);
                    if (!1R.\u2003) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)2014228598 ^ (long)2014228628);
                    if (!1R.\u2003) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-728395530 ^ (long)-728395556);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1571983695 ^ (long)1571983792)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1221956306 ^ (long)-1221946671)) >>> (int)((long)-487109256 ^ (long)-487109264)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1864347084 ^ (long)-1864347084);
            if (!1R.\u2003) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-28917799 ^ (long)-28917797);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-1429085759 ^ (long)-1429085758) | var5_6 << (int)((long)-704891656 ^ (long)-704891651)) ^ var3_4[var7_8]) & (int)((long)-428138607 ^ (long)-428138642);
                    if (1R.\u2003) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)314986266 ^ (long)314986265) | var6_7 << (int)((long)383858716 ^ (long)383858713)) ^ var3_4[var7_8]) & (int)((long)7238461 ^ (long)7238594);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            1R.b[var2_3] = new String(var3_4).intern();
        }
        return 1R.b[var2_3];
    }

    public abstract String 3();

    /*
     * Enabled aggressive block sorting
     */
    public 1R() {
        block3: {
            block2: {
                boolean bl2 = \u2003;
                if (bl2 || bl2) break block2;
                this.4 = 0ar.a;
                if (bl2 || bl2) break block2;
                this.3 = null;
                if (!bl2) break block3;
            }
            return;
        }
    }

    public abstract void 8();

    /*
     * Enabled aggressive block sorting
     */
    public JsonObject 5() {
        JsonObject jsonObject;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2003;
                    if (bl2 || bl2) break block2;
                    jsonObject = new JsonObject();
                    if (bl2 || bl2) break block2;
                    UUID uUID = this.1;
                    if (bl2 || bl2) break block2;
                    jsonObject.addProperty(1R.a((int)((long)1791744639 ^ (long)1791749014), (int)((long)1895254470 ^ (long)-1895258451)), this.4());
                    if (bl2 || bl2) break block2;
                    jsonObject.addProperty(1R.a((int)((long)2048234873 ^ (long)2048238737), (int)((long)855585399 ^ (long)-855595092)), this.3());
                    if (bl2 || bl2) break block2;
                    if (uUID == null) break block3;
                    if (bl2) break block2;
                    jsonObject.addProperty(1R.a((int)((long)824774759 ^ (long)824779149), (int)((long)-515702428 ^ (long)-515685800)), uUID.toString());
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return null;
        }
        return jsonObject;
    }

    public String 7() {
        boolean bl2 = \u2003;
        if (bl2 || bl2) {
            return null;
        }
        return this.3();
    }
}

