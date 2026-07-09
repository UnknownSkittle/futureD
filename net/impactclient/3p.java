/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0rB$1f;
import net.impactclient.4C;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 3p
extends 4C {
    public static final String a;
    public static final boolean \u2002;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 3p.\u2002;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)946361987 ^ (long)-946361988);
            if (3p.\u2002) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    3p.a = new String(v1).intern();
                    if (3p.\u2002) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u97d8\ubf86\u7c6f\u81cc", -2104119028).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-2108003302 ^ (long)-2108003302);
            v4 = (int)((long)1846285342 ^ (long)1846285409);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-235811431 ^ (long)-235811432)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-2052322797 ^ (long)-2052322796)) {
                            case 0: {
                                v11 = (int)((long)-379865476 ^ (long)-379865517);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1341094764 ^ (long)-1341094751);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-567305681 ^ (long)-567305691);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-1072233043 ^ (long)-1072233054);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1749314439 ^ (long)-1749314553);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1652745432 ^ (long)-1652745355);
                                if (!3p.\u2002) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1590014008 ^ (long)1590013971);
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var0_1;
                        v4 = v7;
                        if (v7 != 0) break block14;
                        v7 = v4;
                        v5 = v5;
                        v10 = v4;
                        v8 = v5;
                        v9 = v4;
                    } while (!3p.\u2002);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!3p.\u2002)
lbl76:
            // 1 sources

            throw null;
        }
    }

    @Override
    default public int 4() {
        boolean bl2 = \u2002;
        if (bl2 || bl2) {
            return -973769076;
        }
        return (int)((long)-1519643115 ^ (long)1511003882);
    }

    @Override
    default public String 3() {
        boolean bl2 = \u2002;
        if (bl2 || bl2) {
            return null;
        }
        return a;
    }
}

