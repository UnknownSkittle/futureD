/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import net.impactclient.0av;
import net.impactclient.0az;
import net.impactclient.0m;
import net.impactclient.0r7;
import net.impactclient.0rB$1f;
import net.impactclient.45;
import net.impactclient.4C;
import net.impactclient.4t;
import net.impactclient.5Q;
import net.impactclient.68;
import net.impactclient.75;
import net.impactclient.7b;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 73
extends 7b
implements 0az,
4C {
    private static String 8;
    private List<9m> 7;
    private 9m 9;
    public static final boolean \u200a;
    private static final String[] b;
    private static final String[] c;
    private final List<0r7> 3;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(boolean bl2) {
        boolean bl3;
        block12: {
            block11: {
                bl3 = \u200a;
                if (bl3) return;
                String[] stringArray = 7b.0();
                if (bl3 || bl3) return;
                if (bl2 == this.1) {
                    if (bl3 || bl3) return;
                    return;
                }
                if (bl3) return;
                0m m2 = new 0m(this, bl2);
                if (bl3 || bl3) return;
                4t.1.post(m2);
                if (bl3 || bl3) return;
                if (m2.isCancelled()) {
                    if (bl3 || bl3) return;
                    return;
                }
                if (bl3) return;
                this.1 = bl2;
                if (!this.1) break block11;
                if (bl3 || bl3) return;
                this.2();
                if (bl3 || bl3) return;
                if (!this.1) break block12;
                if (bl3 || bl3) return;
                4t.1.subscribe(this);
                if (bl3) return;
                if (stringArray != null) break block12;
                if (bl3) return;
            }
            if (bl3) return;
            4t.1.unsubscribe(this);
            if (bl3 || bl3) return;
            this.1();
            if (bl3) return;
        }
        if (bl3) return;
        if (this.7()) {
            if (bl3) return;
            if (this.9 != null) {
                if (bl3 || bl3) return;
                this.9.0(bl2);
                if (bl3) return;
            }
        }
        if (!bl3) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(9m ... mArray) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.0(Arrays.asList(mArray));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 6() {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return;
        if (!this.7()) {
            if (bl2 || bl2) return;
            throw new UnsupportedOperationException(73.a((int)((long)299139880 ^ (long)299167891), (int)((long)-1984716219 ^ (long)-1984710939)));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 2(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.6();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        73 v0 = this;
        return v0.0(v0.3(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 7() {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return true;
        if (this.7 != null) {
            if (bl2) return true;
            return (int)((long)-1123974830 ^ (long)-1123974829) != 0;
        }
        if (!bl2) return (int)((long)472572415 ^ (long)472572415) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 5() {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.6();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return this.9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2) break block2;
                8 = string;
                if (!bl2) break block3;
            }
            return;
        }
    }

    public 73(String string, String string2) {
        boolean bl2 = \u200a;
        this(string, string2, (int)((long)-634455656 ^ (long)-634455656));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                var7 = 73.\u200a;
                if (!var7) break block15;
                break block16;
            }
            var5_1 = new String[(int)((long)-857008673 ^ (long)-857008675)];
            if (var7) break block16;
            var3_2 = (int)((long)-1846314413 ^ (long)-1846314413);
            var2_3 = 0rB$1f.XNZw("\u8f64\ua67e\u6597\u98dc\u8f86\ua611\u6565\u9828\u8fbf\ua652\u6578\u9814\u8f6e\ua686\u652d\u981e\u8f80\ua687\u6525\u9824\u8f45\ua69d\u650d\u9837\u8f3a\ua6a0\u65ea\u98b8\u8ffc\ua6b1\u65eb\u98f7\u8f46\ua6c9\u6593\u9840\u8f3d\ua608\u65db\u98b0\u8ff5\ua651\u6522\u98c5\u8fa6\ua6eb\u6584\u9847\u8fa9\ua68f\u6552\u98a4\u8f69\ua636\u656c\u9842\u8f46\ua68d\u65cf\u981f\u8ff1\ua6cc\u6587\u9886\u8f01\ua6b9\u659c\u9800\u8f05\ua678\u654c\u98d8\u8f2d\ua6c2\u65f9\u985d\u8fd9\ua6c7\u65c8\u98af\u8f98\ua6f0\u6548\u98a2\u8f8b\ua63b\u6548\u98e4\u8f72\ua630\u656d\u988b\u8f10\ua609\u6528", 282568923);
            var4_4 = var2_3.length();
            73.0(0rB$1f.XNZw("\u233d\u0a9e\uc97e\u349b\u2314\u0ab1", 1949893754));
            if (var7) break block16;
            var1_5 = (int)((long)-1272230685 ^ (long)-1272230689);
            if (var7) break block16;
            var0_6 = (int)((long)1804562160 ^ (long)-1804562161);
            if (var7) break block16;
            block8: while (!var7) {
                v0 = ++var0_6;
                v1 = (int)((long)729987331 ^ (long)-729987332);
                if (73.\u200a) {
                    throw null;
                    while (true) {
                        var5_1[var3_2++] = new String(v2).intern();
                        if ((var0_6 += var1_5) < var4_4) {
                            var1_5 = var2_3.charAt(var0_6);
                            if (!73.\u200a) continue block8;
                            throw null;
                        }
                        73.b = var5_1;
                        73.c = new String[(int)((long)1434749142 ^ (long)1434749140)];
                        if (!73.\u200a) break block8;
                        throw null;
                    }
                }
                v3 = var2_3.substring(v0, v0 + var1_5).toCharArray();
                v4 = v3.length;
                var6_7 = (int)((long)-556645907 ^ (long)-556645907);
                v5 = (int)((long)-781324586 ^ (long)-781324554);
                v6 = v3;
                v7 = v4;
                if (v4 > (int)((long)30925301 ^ (long)30925300)) ** GOTO lbl88
                do {
                    block14: {
                        v8 = v5;
                        v6 = v6;
                        v9 = v6;
                        v10 = v5;
                        v11 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1888027954 ^ (long)-1888027959)) {
                                case 0: {
                                    v12 = (int)((long)-319863901 ^ (long)-319863827);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                case 1: {
                                    v12 = (int)((long)-1815944824 ^ (long)-1815944757);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                case 2: {
                                    v12 = (int)((long)2031719381 ^ (long)2031719330);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                case 3: {
                                    v12 = (int)((long)-1376030535 ^ (long)-1376030589);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                case 4: {
                                    v12 = (int)((long)1619956684 ^ (long)1619956666);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                case 5: {
                                    v12 = (int)((long)1316538450 ^ (long)1316538399);
                                    if (!73.\u200a) break;
                                    throw null;
                                }
                                default: {
                                    v12 = (int)((long)1602714486 ^ (long)1602714447);
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
                        } while (!73.\u200a);
                        throw null;
                    }
                    v2 = v6;
                    v7 = v7;
                } while (v7 > var6_7);
                if (!73.\u200a) ** continue;
                throw null;
            }
        }
    }

    public static String 4() {
        boolean bl2 = \u200a;
        if (bl2) {
            return null;
        }
        return 8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 73(String string, String string2, int n2) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return;
        this.3 = new ArrayList<0r7>();
        if (bl2 || bl2) return;
        this.5 = string;
        if (bl2 || bl2) return;
        this.6 = string2;
        if (bl2 || bl2) return;
        this.4 = new 75(0av.a, n2, var1_1 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u200a;
                        if (bl2 || bl2) break block2;
                        if (var1_1 != 45.a) break block3;
                        if (bl2) break block2;
                        this.5();
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        });
        if (bl2 || bl2) return;
        String[] stringArray = new String[(int)((long)991100470 ^ (long)991100468)];
        stringArray[(int)((long)1646832889 ^ (long)1646832889)] = string;
        stringArray[(int)((long)1696785234 ^ (long)1696785235)] = string2;
        if (68.0(stringArray)) {
            if (bl2 || bl2) return;
            throw new NullPointerException(73.a((int)((long)-709326101 ^ (long)-709297839), (int)((long)951081105 ^ (long)-951082766)));
        }
        if (!bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 4(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.0(string).ifPresent(this.3::remove);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 73.\u200a;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)248149080 ^ (long)248121315)) & (int)((long)1970678120 ^ (long)1970722455);
            if (var9_2) ** GOTO lbl-1000
            if (73.c[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 73.b[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-501127174 ^ (long)-501127174)] & (int)((long)2092189717 ^ (long)2092189930)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-48699415 ^ (long)-48699417);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)595084071 ^ (long)595084048);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1350277617 ^ (long)1350277511);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1865381123 ^ (long)1865381245);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-846752758 ^ (long)-846752724);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1537627785 ^ (long)-1537627807);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)23735465 ^ (long)23735544);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-258317170 ^ (long)-258317081);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)9102930 ^ (long)9103049);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-1321661925 ^ (long)-1321661913);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)969128996 ^ (long)969129046);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1404447872 ^ (long)-1404447894);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)933185183 ^ (long)933185186);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)1130561281 ^ (long)1130561514);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)644578118 ^ (long)644578105);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1019324416 ^ (long)-1019324195);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-972544936 ^ (long)-972544977);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-774841859 ^ (long)-774842096);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-390808863 ^ (long)-390808958);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-2108503914 ^ (long)-2108503935);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-213589851 ^ (long)-213589999);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-1130719384 ^ (long)-1130719311);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-745432759 ^ (long)-745432651);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)797727530 ^ (long)797727493);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-96338539 ^ (long)-96338448);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-525056701 ^ (long)-525056673);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-500760804 ^ (long)-500760749);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1962814056 ^ (long)-1962814084);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)502494985 ^ (long)502495163);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1054265871 ^ (long)1054266050);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)1202585276 ^ (long)1202585267);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)2123976953 ^ (long)2123976880);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)47916628 ^ (long)47916566);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1942188318 ^ (long)-1942188380);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)1273846680 ^ (long)1273846581);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)489345671 ^ (long)489345591);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)1363972435 ^ (long)1363972532);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)436222374 ^ (long)436222221);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1918509697 ^ (long)-1918509810);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1914373700 ^ (long)-1914373640);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-2127281842 ^ (long)-2127281792);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1647999580 ^ (long)-1647999548);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1960492276 ^ (long)1960492218);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)36336937 ^ (long)36336903);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1087828170 ^ (long)-1087827983);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1110801302 ^ (long)-1110801302);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-545181127 ^ (long)-545181148);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-1565057703 ^ (long)-1565057787);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-629058129 ^ (long)-629058077);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)480898243 ^ (long)480898220);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1209797079 ^ (long)1209796920);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-2022847199 ^ (long)-2022847117);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)2132630998 ^ (long)2132630871);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1349393907 ^ (long)1349393799);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)776573841 ^ (long)776573799);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)167348150 ^ (long)167348036);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)1265271437 ^ (long)1265271396);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-609040081 ^ (long)-609040074);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-1880038790 ^ (long)-1880038721);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-774146998 ^ (long)-774146969);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)631831792 ^ (long)631831568);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1505207388 ^ (long)1505207419);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-547758586 ^ (long)-547758341);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-2017538489 ^ (long)-2017538384);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1063772244 ^ (long)1063772303);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-566905122 ^ (long)-566905177);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1082830075 ^ (long)-1082829883);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1226193847 ^ (long)-1226193812);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)137348975 ^ (long)137348910);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-996990522 ^ (long)-996990708);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1019300745 ^ (long)1019300831);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)27823592 ^ (long)27823587);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1531348265 ^ (long)-1531348354);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-728255933 ^ (long)-728255880);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-398177204 ^ (long)-398177259);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)390682839 ^ (long)390682670);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)282057563 ^ (long)282057607);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)270895411 ^ (long)270895570);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1978483432 ^ (long)1978483362);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1591463243 ^ (long)1591463373);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)416004548 ^ (long)416004427);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)790661936 ^ (long)790662037);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1191462805 ^ (long)1191462850);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1583962764 ^ (long)-1583962673);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1094765531 ^ (long)1094765549);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-1632367000 ^ (long)-1632366875);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-551183650 ^ (long)-551183782);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-1637644180 ^ (long)-1637644266);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1288600214 ^ (long)-1288600109);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)736251666 ^ (long)736251738);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-2135595688 ^ (long)-2135595655);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-205655591 ^ (long)-205655717);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1298202798 ^ (long)-1298202725);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-619059477 ^ (long)-619059597);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)311734845 ^ (long)311735026);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1985900516 ^ (long)-1985900536);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1563081595 ^ (long)-1563081522);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-851838907 ^ (long)-851838857);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)606028971 ^ (long)606028998);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-293784985 ^ (long)-293784871);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1771091163 ^ (long)1771091130);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-663599692 ^ (long)-663599706);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)939645730 ^ (long)939645934);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-604979182 ^ (long)-604979115);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1368479104 ^ (long)1368479103);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-1011091208 ^ (long)-1011091315);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1615007373 ^ (long)-1615007459);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)768768963 ^ (long)768768864);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)1429951587 ^ (long)1429951687);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)78757018 ^ (long)78756878);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)888095805 ^ (long)888095899);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)686460882 ^ (long)686460751);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-1974330104 ^ (long)-1974330037);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-512018199 ^ (long)-512018326);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1189887184 ^ (long)1189887205);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)720990732 ^ (long)720990771);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-269394462 ^ (long)-269394556);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)790254483 ^ (long)790254575);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-1709914469 ^ (long)-1709914596);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-319960972 ^ (long)-319960922);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)939795528 ^ (long)939795680);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-312716305 ^ (long)-312716393);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)2102816568 ^ (long)2102816683);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-253423609 ^ (long)-253423423);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)849987131 ^ (long)849987220);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1440193882 ^ (long)1440194004);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)734365369 ^ (long)734365251);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1278739432 ^ (long)1278739204);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1750765603 ^ (long)-1750765694);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-546842896 ^ (long)-546842936);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-81673516 ^ (long)-81673705);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1927108287 ^ (long)1927108321);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1344443787 ^ (long)-1344443836);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-2130757504 ^ (long)-2130757414);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)947287741 ^ (long)947287651);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1647759400 ^ (long)1647759387);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-2036498694 ^ (long)-2036498775);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-500318688 ^ (long)-500318542);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-1716518945 ^ (long)-1716518984);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-2092801710 ^ (long)-2092801769);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)624959559 ^ (long)624959609);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)148205368 ^ (long)148205351);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1430107670 ^ (long)1430107785);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)392394382 ^ (long)392394399);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1588560397 ^ (long)1588560486);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-2071335493 ^ (long)-2071335637);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-50439645 ^ (long)-50439634);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1384388126 ^ (long)-1384388111);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-482920976 ^ (long)-482921094);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-1507926924 ^ (long)-1507927024);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-695738319 ^ (long)-695738200);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)2106881874 ^ (long)2106881933);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-941964142 ^ (long)-941964176);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)931194710 ^ (long)931194709);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1494820887 ^ (long)-1494821047);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-170568701 ^ (long)-170568554);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1885276926 ^ (long)1885276688);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-44790968 ^ (long)-44790909);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)482631713 ^ (long)482631797);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-607104404 ^ (long)-607104281);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)641019300 ^ (long)641019322);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-1417663433 ^ (long)-1417663429);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1999762097 ^ (long)1999761994);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)1721179510 ^ (long)1721179527);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-226511976 ^ (long)-226511928);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-2097581558 ^ (long)-2097581386);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-13003644 ^ (long)-13003750);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-1670078010 ^ (long)-1670078009);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1730627599 ^ (long)1730627747);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)471983432 ^ (long)471983381);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-345079555 ^ (long)-345079683);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-134576101 ^ (long)-134575933);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1782858924 ^ (long)1782858999);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)740777595 ^ (long)740777553);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1846128635 ^ (long)1846128537);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1543038953 ^ (long)1543038783);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)927796895 ^ (long)927796964);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-12243105 ^ (long)-12243025);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-494939783 ^ (long)-494939779);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)1715014958 ^ (long)1715015035);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)2075436765 ^ (long)2075436551);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-534591170 ^ (long)-534591150);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1536480152 ^ (long)-1536480065);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1699957363 ^ (long)-1699957503);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)87678035 ^ (long)87678080);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-869542115 ^ (long)-869541979);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1614140792 ^ (long)-1614140720);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1975251037 ^ (long)-1975251046);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)518115776 ^ (long)518115808);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-1853798206 ^ (long)-1853798223);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-1723086939 ^ (long)-1723087102);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1007079455 ^ (long)-1007079627);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1443233550 ^ (long)-1443233638);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-911660323 ^ (long)-911660446);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-570332265 ^ (long)-570332374);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-180546027 ^ (long)-180545851);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1542609154 ^ (long)1542609301);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1911702761 ^ (long)-1911702745);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-2047794005 ^ (long)-2047794091);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)973369637 ^ (long)973369808);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1142477766 ^ (long)-1142477750);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1430465022 ^ (long)-1430464876);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1206697961 ^ (long)-1206697770);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)631742328 ^ (long)631742434);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-804389139 ^ (long)-804389320);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)201483190 ^ (long)201483047);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-1304435838 ^ (long)-1304435871);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-351293029 ^ (long)-351293009);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1098460760 ^ (long)1098460828);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1588515487 ^ (long)1588515460);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-1866222686 ^ (long)-1866222836);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-648223379 ^ (long)-648223418);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-1487763685 ^ (long)-1487763709);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-193165515 ^ (long)-193165496);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)104325277 ^ (long)104325243);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-699268201 ^ (long)-699268162);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-955984777 ^ (long)-955984841);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-101963012 ^ (long)-101963014);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-146685139 ^ (long)-146685129);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)776578714 ^ (long)776578591);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1705877183 ^ (long)-1705877178);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1400465834 ^ (long)1400465664);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-307916473 ^ (long)-307916298);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)3069399 ^ (long)3069421);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-846600682 ^ (long)-846600482);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1875453109 ^ (long)-1875453111);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)1179578705 ^ (long)1179578739);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1827025492 ^ (long)-1827025554);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1054901404 ^ (long)-1054901295);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)466126494 ^ (long)466126454);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1678160385 ^ (long)-1678160541);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1578930683 ^ (long)-1578930442);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1995688137 ^ (long)1995687960);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1521378518 ^ (long)1521378423);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-598905558 ^ (long)-598905393);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-387987238 ^ (long)-387987360);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1206044394 ^ (long)-1206044388);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)183324441 ^ (long)183324531);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)101686409 ^ (long)101686315);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-74833857 ^ (long)-74833721);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1304862117 ^ (long)1304862081);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)467793160 ^ (long)467793342);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)610260745 ^ (long)610260864);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)433922248 ^ (long)433922272);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-226918704 ^ (long)-226918809);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)573402203 ^ (long)573402287);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1877865107 ^ (long)1877865182);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)504769583 ^ (long)504769574);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-1744384631 ^ (long)-1744384615);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-790521873 ^ (long)-790521862);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1452682625 ^ (long)-1452682660);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1396793843 ^ (long)-1396793666);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)2078623680 ^ (long)2078623724);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1038193044 ^ (long)-1038193052);
                    if (!73.\u200a) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-2075505990 ^ (long)-2075505985);
                    if (!73.\u200a) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1803030588 ^ (long)1803030708);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1655501116 ^ (long)1655501251)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1860075610 ^ (long)-1860075431)) >>> (int)((long)122478111 ^ (long)122478103)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-2130650160 ^ (long)-2130650160);
            if (!73.\u200a) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)891251718 ^ (long)891251716);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-1602697197 ^ (long)-1602697200) | var5_6 << (int)((long)399788129 ^ (long)399788132)) ^ var3_4[var7_8]) & (int)((long)36599817 ^ (long)36600054);
                    if (73.\u200a) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)659167362 ^ (long)659167361) | var6_7 << (int)((long)1866509808 ^ (long)1866509813)) ^ var3_4[var7_8]) & (int)((long)-793794798 ^ (long)-793794579);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            73.c[var2_3] = new String(var3_4).intern();
        }
        return 73.c[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(0r7 r7) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a;
                    if (bl2 || bl2) break block2;
                    if (this.0((5Q)r7).isPresent()) break block3;
                    if (bl2 || bl2) break block2;
                    this.3.add(r7);
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
    public final 9m 3(String string) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.6();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return this.7.stream().filter(m2 -> {
            boolean bl2 = \u200a;
            if (bl2 || bl2) {
                return true;
            }
            return m2.2().equalsIgnoreCase(string);
        }).findFirst().orElse(null);
    }

    public final boolean 1(String string) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) {
            return true;
        }
        return this.0(string).isPresent();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(List<9m> list) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return;
        if (list.size() == 0) {
            if (bl2) return;
            return;
        }
        if (bl2) return;
        this.7 = new ArrayList<9m>(list);
        if (bl2 || bl2) return;
        this.7.removeIf(Objects::isNull);
        if (bl2 || bl2) return;
        73 v0 = this;
        v0.0(v0.7.get((int)((long)-1978452628 ^ (long)-1978452628)));
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final List<9m> 9() {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.6();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new ArrayList<9m>(this.7);
    }

    @Override
    public final Optional<0r7> 0(String string) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) {
            return null;
        }
        return this.3.stream().filter(r7 -> {
            boolean bl2 = \u200a;
            if (bl2 || bl2) {
                return true;
            }
            return r7.0.equals(string);
        }).findFirst();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 0(9m m2) {
        boolean bl2;
        block12: {
            block11: {
                bl2 = \u200a;
                if (bl2 || bl2) return null;
                this.6();
                if (bl2 || bl2) return null;
                if (m2 == null) break block11;
                if (bl2) return null;
                if (m2.0() == this) break block12;
                if (bl2) return null;
            }
            if (bl2) return null;
            return null;
        }
        if (bl2) return null;
        if (m2 == this.9) {
            if (bl2 || bl2) return null;
            return m2;
        }
        if (bl2) return null;
        if (this.9 != null) {
            if (bl2 || bl2) return null;
            this.9.0((boolean)((long)219592664 ^ (long)219592664));
            if (bl2) return null;
        }
        if (bl2) return null;
        this.9 = m2;
        this.9.0((boolean)((long)-93585761 ^ (long)-93585762));
        if (!bl2 && !bl2) return this.9;
        return null;
    }

    public final List<0r7> 8() {
        boolean bl2 = \u200a;
        if (bl2 || bl2) {
            return null;
        }
        return this.3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 0a() {
        int n2;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a;
                    if (bl2 || bl2) break block2;
                    this.6();
                    if (bl2 || bl2) break block2;
                    n2 = this.7.indexOf(this.5());
                    if (bl2 || bl2) break block2;
                    ++n2;
                    if (bl2) break block2;
                    if (n2 <= this.7.size() - (int)((long)2061282786 ^ (long)2061282787)) break block3;
                    if (bl2 || bl2) break block2;
                    n2 = (int)((long)-136035506 ^ (long)-136035506);
                    if (bl2) return null;
                }
                if (!bl2) break block4;
            }
            return null;
        }
        return this.0(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 0(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.6();
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        73 v0 = this;
        return v0.0(v0.7.get(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final 9m 0b() {
        int n2;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a;
                    if (bl2 || bl2) break block2;
                    this.6();
                    if (bl2 || bl2) break block2;
                    n2 = this.7.indexOf(this.5());
                    if (bl2 || bl2) break block2;
                    --n2;
                    if (bl2) break block2;
                    if (n2 >= 0) break block3;
                    if (bl2 || bl2) break block2;
                    n2 = this.7.size() - (int)((long)2028983330 ^ (long)2028983331);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return null;
        }
        return this.0(n2);
    }
}

