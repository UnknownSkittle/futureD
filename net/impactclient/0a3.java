/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 *  bus
 */
package net.impactclient;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.impactclient.0T;
import net.impactclient.0ab;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 0a3
extends 0ab
implements 0T {
    private static final DecimalFormat 1;
    public static final boolean \u2000\u2003\u200e\u200b\u200b;

    /*
     * Enabled aggressive block sorting
     */
    public 0a3() {
        boolean bl2 = \u2000\u2003\u200e\u200b\u200b;
        if (bl2) {
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
                    var3 = 0a3.\u2000\u2003\u200e\u200b\u200b;
                    if (!var3) break block15;
                    break block16;
                }
                v0 = (int)((long)75016496 ^ (long)-75016497);
                if (0a3.\u2000\u2003\u200e\u200b\u200b) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (0a3.\u2000\u2003\u200e\u200b\u200b) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\uda12\u71de\ub222\u4fa9\uda2a\u7197\ub237", -2049474792).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)1307115391 ^ (long)1307115391);
                v4 = (int)((long)-837675326 ^ (long)-837675311);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-1606967398 ^ (long)-1606967397)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)-1985095105 ^ (long)-1985095112)) {
                                case 0: {
                                    v11 = (int)((long)1604356809 ^ (long)1604356741);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)414770649 ^ (long)414770569);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-1507395096 ^ (long)-1507395193);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)363828602 ^ (long)363828520);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-1965053322 ^ (long)-1965053423);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-1413598683 ^ (long)-1413598658);
                                    if (!0a3.\u2000\u2003\u200e\u200b\u200b) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)1791132383 ^ (long)1791132342);
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var1_2;
                            v4 = v7;
                            if (v7 != 0) break block14;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        } while (!0a3.\u2000\u2003\u200e\u200b\u200b);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!0a3.\u2000\u2003\u200e\u200b\u200b)
lbl76:
                // 1 sources

                throw null;
            }
            var2_3 = new DecimalFormatSymbols(Locale.getDefault());
            var2_3.setGroupingSeparator((char)((long)-7266984 ^ (long)-7266956));
            0a3.1 = new DecimalFormat(var0_1, var2_3);
        }
    }

    public static String 0(double d2) {
        boolean bl2 = \u2000\u2003\u200e\u200b\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return 1.format(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    final int 0(bip bip2, String string, float f2, float f3, int n2) {
        int n3;
        block3: {
            block2: {
                boolean bl2 = \u2000\u2003\u200e\u200b\u200b;
                if (bl2 || bl2) break block2;
                n3 = bip2.a(string);
                if (bl2 || bl2) break block2;
                float f4 = this.4.0() * ((float)n3 - ((0ab)this).1);
                if (bl2 || bl2) break block2;
                bus.G();
                if (bl2 || bl2) break block2;
                bus.y();
                if (bl2 || bl2) break block2;
                bip2.a(string, f2 + f4, f3, n2);
                if (bl2 || bl2) break block2;
                bus.H();
                if (!bl2 && !bl2) break block3;
            }
            return -1276270742;
        }
        return n3;
    }
}

