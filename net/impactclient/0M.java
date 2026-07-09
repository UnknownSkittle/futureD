/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0aL;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0M
extends Enum<0M>
implements 0aL {
    public static final boolean \u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
    public static final /* enum */ 0M a;
    private float 1;
    private static /* enum */ 0M 0;
    public static final /* enum */ 0M b;
    private static final /* synthetic */ 0M[] 2;

    @Override
    public final float 0() {
        boolean bl2 = \u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return this.1;
    }

    public static 0M[] values() {
        boolean bl2 = \u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return (0M[])2.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                var8 = 0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
                if (!var8) break block17;
                break block18;
            }
            var6_1 = new String[(int)((long)-2046335810 ^ (long)-2046335811)];
            if (var8) break block18;
            var4_2 = (int)((long)-1334973785 ^ (long)-1334973785);
            if (var8) break block18;
            var3_3 = 0rB$1f.XNZw("\u2d6c\u05fa\uc647\u3bcc\u2d07\u0583\uc636\u3bf9\u2d56\u05df\uc67b\u3bdf\u2d64\u05ea\uc65e\u3b8c\u2d6a\u05aa\uc602", -384955578);
            var5_4 = var3_3.length();
            if (var8) break block18;
            var2_5 = (int)((long)1538171344 ^ (long)1538171348);
            if (var8) break block18;
            var1_6 = (int)((long)-2052015969 ^ (long)2052015968);
            if (var8) break block18;
            block8: while (!var8) {
                block15: {
                    v0 = ++var1_6;
                    v1 = (int)((long)1004642815 ^ (long)-1004642816);
                    if (0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) {
                        throw null;
                        while (true) {
                            var6_1[var4_2++] = new String(v2).intern();
                            if ((var1_6 += var2_5) < var5_4) {
                                var2_5 = var3_3.charAt(var1_6);
                                if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) continue block8;
                                throw null;
                            }
                            var0_8 = var6_1;
                            if (0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) {
                                throw null;
                            }
                            break block15;
                            break;
                        }
                    }
                    v3 = var3_3.substring(v0, v0 + var2_5).toCharArray();
                    v4 = v3.length;
                    var7_7 = (int)((long)-1458846405 ^ (long)-1458846405);
                    v5 = (int)((long)1952600419 ^ (long)1952600421);
                    v6 = v3;
                    v7 = v4;
                    if (v4 > (int)((long)582305340 ^ (long)582305341)) ** GOTO lbl87
                    do {
                        block16: {
                            v8 = v5;
                            v6 = v6;
                            v9 = v6;
                            v10 = v5;
                            v11 = var7_7;
                            do {
                                switch (var7_7 % (int)((long)1750600287 ^ (long)1750600280)) {
                                    case 0: {
                                        v12 = (int)((long)1202764799 ^ (long)1202764758);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v12 = (int)((long)-1617046438 ^ (long)-1617046516);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v12 = (int)((long)1646827375 ^ (long)1646827339);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v12 = (int)((long)-538927230 ^ (long)-538927223);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v12 = (int)((long)1586582031 ^ (long)1586582140);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v12 = (int)((long)1754988096 ^ (long)1754988108);
                                        if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) break;
                                        throw null;
                                    }
                                    default: {
                                        v12 = (int)((long)1123281979 ^ (long)1123281970);
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
                            } while (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006);
                            throw null;
                        }
                        v2 = v6;
                        v7 = v7;
                    } while (v7 > var7_7);
                    if (!0M.\u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006) ** continue;
                    throw null;
                }
                0M.a = new 0M(-1.0f);
                0M.0 = new 0M(-0.5f);
                0M.b = new 0M(0.0f);
                v13 = new 0M[(int)((long)-1344445619 ^ (long)-1344445618)];
                v13[(int)((long)523682562 ^ (long)523682562)] = 0M.a;
                v13[(int)((long)201451629 ^ (long)201451628)] = 0M.0;
                v13[(int)((long)-1685526678 ^ (long)-1685526680)] = 0M.b;
                0M.2 = v13;
                break;
            }
        }
    }

    private 0M(float f2) {
        boolean bl2 = \u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
        this.1 = f2;
    }

    public static 0M valueOf(String string) {
        boolean bl2 = \u200e\u2003\u2007\u200e\u2005\u200c\u200a\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(0M.class, string);
    }
}

