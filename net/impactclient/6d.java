/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6d
extends Enum<6d> {
    private static final /* synthetic */ 6d[] 3;
    public static final boolean \u2004;
    private static /* enum */ 6d 0;
    private static /* enum */ 6d 1;
    private static /* enum */ 6d 2;

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                var8 = 6d.\u2004;
                if (!var8) break block17;
                break block18;
            }
            var6_1 = new String[(int)((long)-1798127515 ^ (long)-1798127514)];
            if (var8) break block18;
            var4_2 = (int)((long)-730552588 ^ (long)-730552588);
            if (var8) break block18;
            var3_3 = 0rB$1f.XNZw("\u6baf\u4222\u81ea\u7c7d\u6b9b\u4248\u8188\u7c6f\u6b80\u4224\u81d5\u7c5f\u6bec\u423f\u81d0\u7c58\u6b95\u4207\u81e4\u7c32\u6bf7\u4215\u81ff\u7c4f\u6bb6\u4220\u81f9\u7c69\u6b90\u4235\u81c1\u7c5f\u6bee", 354503834);
            var5_4 = var3_3.length();
            if (var8) break block18;
            var2_5 = (int)((long)-612542724 ^ (long)-612542735);
            if (var8) break block18;
            var1_6 = (int)((long)-1071243202 ^ (long)1071243201);
            if (var8) break block18;
            block8: while (!var8) {
                block15: {
                    v0 = ++var1_6;
                    v1 = (int)((long)1057975293 ^ (long)-1057975294);
                    if (6d.\u2004) {
                        throw null;
                        while (true) {
                            var6_1[var4_2++] = new String(v2).intern();
                            if ((var1_6 += var2_5) < var5_4) {
                                var2_5 = var3_3.charAt(var1_6);
                                if (!6d.\u2004) continue block8;
                                throw null;
                            }
                            var0_8 = var6_1;
                            if (6d.\u2004) {
                                throw null;
                            }
                            break block15;
                            break;
                        }
                    }
                    v3 = var3_3.substring(v0, v0 + var2_5).toCharArray();
                    v4 = v3.length;
                    var7_7 = (int)((long)-1088426274 ^ (long)-1088426274);
                    v5 = (int)((long)224734788 ^ (long)224734793);
                    v6 = v3;
                    v7 = v4;
                    if (v4 > (int)((long)-1664500612 ^ (long)-1664500611)) ** GOTO lbl87
                    do {
                        block16: {
                            v8 = v5;
                            v6 = v6;
                            v9 = v6;
                            v10 = v5;
                            v11 = var7_7;
                            do {
                                switch (var7_7 % (int)((long)1350423493 ^ (long)1350423490)) {
                                    case 0: {
                                        v12 = (int)((long)-849411413 ^ (long)-849411384);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v12 = (int)((long)-363673253 ^ (long)-363673335);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v12 = (int)((long)-374392405 ^ (long)-374392334);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v12 = (int)((long)-750399959 ^ (long)-750399913);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v12 = (int)((long)-2052880545 ^ (long)-2052880635);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v12 = (int)((long)-2016737710 ^ (long)-2016737667);
                                        if (!6d.\u2004) break;
                                        throw null;
                                    }
                                    default: {
                                        v12 = (int)((long)680029166 ^ (long)680029124);
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
                            } while (!6d.\u2004);
                            throw null;
                        }
                        v2 = v6;
                        v7 = v7;
                    } while (v7 > var7_7);
                    if (!6d.\u2004) ** continue;
                    throw null;
                }
                6d.2 = new 6d();
                6d.0 = new 6d();
                6d.1 = new 6d();
                v13 = new 6d[(int)((long)-1837249246 ^ (long)-1837249247)];
                v13[(int)((long)2137766700 ^ (long)2137766700)] = 6d.2;
                v13[(int)((long)-706438657 ^ (long)-706438658)] = 6d.0;
                v13[(int)((long)1995587023 ^ (long)1995587021)] = 6d.1;
                6d.3 = v13;
                break;
            }
        }
    }

    public static 6d valueOf(String string) {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(6d.class, string);
    }

    private 6d() {
        boolean bl2 = \u2004;
    }

    public static 6d[] values() {
        boolean bl2 = \u2004;
        if (bl2 || bl2) {
            return null;
        }
        return (6d[])3.clone();
    }
}

