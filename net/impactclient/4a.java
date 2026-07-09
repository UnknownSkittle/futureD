/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 */
package net.impactclient;

import net.impactclient.0rB$1f;
import net.impactclient.42;
import net.impactclient.4J;
import net.impactclient.4j;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
abstract class 4a
extends Enum<4a> {
    public static final boolean \u2008\u200d\u2007\u2001;
    private static final /* synthetic */ 4a[] 2;
    private static /* enum */ 4a 1;
    private static /* enum */ 4a 3;
    private static /* enum */ 4a 0;

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                var8 = 4a.\u2008\u200d\u2007\u2001;
                if (!var8) break block17;
                break block18;
            }
            var6_1 = new String[(int)((long)-272530471 ^ (long)-272530470)];
            if (var8) break block18;
            var4_2 = (int)((long)-1655146103 ^ (long)-1655146103);
            if (var8) break block18;
            var3_3 = 0rB$1f.XNZw("\u688a\u40e5\u830a\u7e9e\u68a5\u40eb\u836d\u7ebf\u688f\u40ff\u830a\u7e8d\u68b6\u40e2\u833c\u7ead\u6884\u40c0\u8321\u7eda", 823807592);
            var5_4 = var3_3.length();
            if (var8) break block18;
            var2_5 = (int)((long)1505241418 ^ (long)1505241421);
            if (var8) break block18;
            var1_6 = (int)((long)262363004 ^ (long)-262363005);
            if (var8) break block18;
            block8: while (!var8) {
                block15: {
                    v0 = ++var1_6;
                    v1 = (int)((long)-1344894723 ^ (long)1344894722);
                    if (4a.\u2008\u200d\u2007\u2001) {
                        throw null;
                        while (true) {
                            var6_1[var4_2++] = new String(v2).intern();
                            if ((var1_6 += var2_5) < var5_4) {
                                var2_5 = var3_3.charAt(var1_6);
                                if (!4a.\u2008\u200d\u2007\u2001) continue block8;
                                throw null;
                            }
                            var0_8 = var6_1;
                            if (4a.\u2008\u200d\u2007\u2001) {
                                throw null;
                            }
                            break block15;
                            break;
                        }
                    }
                    v3 = var3_3.substring(v0, v0 + var2_5).toCharArray();
                    v4 = v3.length;
                    var7_7 = (int)((long)552529321 ^ (long)552529321);
                    v5 = (int)((long)1614675671 ^ (long)1614675602);
                    v6 = v3;
                    v7 = v4;
                    if (v4 > (int)((long)1628170422 ^ (long)1628170423)) ** GOTO lbl87
                    do {
                        block16: {
                            v8 = v5;
                            v6 = v6;
                            v9 = v6;
                            v10 = v5;
                            v11 = var7_7;
                            do {
                                switch (var7_7 % (int)((long)-794309409 ^ (long)-794309416)) {
                                    case 0: {
                                        v12 = (int)((long)1461274097 ^ (long)1461274055);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v12 = (int)((long)762579176 ^ (long)762579152);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v12 = (int)((long)953879646 ^ (long)953879628);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v12 = (int)((long)269571127 ^ (long)269571102);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v12 = (int)((long)1268570974 ^ (long)1268570967);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v12 = (int)((long)-570119435 ^ (long)-570119457);
                                        if (!4a.\u2008\u200d\u2007\u2001) break;
                                        throw null;
                                    }
                                    default: {
                                        v12 = (int)((long)44355467 ^ (long)44355554);
                                    }
                                }
                                v9[v11] = (char)(v9[v11] ^ (v10 ^ v12));
                                ++var7_7;
                                v5 = v8;
                                if (v8 != 0) break block16;
                                v8 = v5;
                                v6 = v6;
                                v11 = v5;
                                v9 = v6;
                                v10 = v5;
                            } while (!4a.\u2008\u200d\u2007\u2001);
                            throw null;
                        }
                        v2 = v6;
                        v7 = v7;
                    } while (v7 > var7_7);
                    if (!4a.\u2008\u200d\u2007\u2001) ** continue;
                    throw null;
                }
                4a.3 = new 4j();
                4a.1 = new 4J();
                4a.0 = new 42();
                v13 = new 4a[(int)((long)394126557 ^ (long)394126558)];
                v13[(int)((long)295652967 ^ (long)295652967)] = 4a.3;
                v13[(int)((long)-797440017 ^ (long)-797440018)] = 4a.1;
                v13[(int)((long)952610705 ^ (long)952610707)] = 4a.0;
                4a.2 = v13;
                break;
            }
        }
    }

    abstract boolean 2(ain var1);

    abstract boolean 1(ain var1);

    abstract boolean 0(ain var1);

    private 4a() {
        boolean bl2 = \u2008\u200d\u2007\u2001;
    }

    public static 4a[] values() {
        boolean bl2 = \u2008\u200d\u2007\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return (4a[])2.clone();
    }

    public static 4a valueOf(String string) {
        boolean bl2 = \u2008\u200d\u2007\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(4a.class, string);
    }

    /* synthetic */ 4a(String string, int n2, byte by2) {
        boolean bl2 = \u2008\u200d\u2007\u2001;
        this();
    }
}

