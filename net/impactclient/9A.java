/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  aed
 *  vg
 */
package net.impactclient;

import java.util.Objects;
import java.util.stream.Collectors;
import net.impactclient.0rB$1f;
import net.impactclient.5h;
import net.impactclient.7w;
import net.impactclient.9h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9A
extends 9h {
    private static final String a;
    public static final boolean \u2004\u200a;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int 0(aed aed2) {
        boolean bl2;
        block11: {
            block10: {
                bl2 = \u2004\u200a;
                if (bl2 || bl2) return 308590065;
                if (9A.2.h.h((vg)aed2) < 100.0) {
                    if (bl2 || bl2) return 308590065;
                    return 5h.b;
                }
                if (bl2) return 308590065;
                if (aed2.i_().d().equalsIgnoreCase(aed2.h_() + a.h)) break block10;
                if (bl2 || bl2) return 308590065;
                if (2.v().d().stream().map(bsc2 -> {
                    boolean bl2 = \u2004\u200a;
                    if (bl2 || bl2) return null;
                    if (bsc2 == null) {
                        if (bl2) return null;
                        return null;
                    }
                    if (!bl2) return 9A.2.f.b(bsc2.a().getId());
                    return null;
                }).filter(Objects::nonNull).collect(Collectors.toList()).contains(aed2)) break block11;
                if (bl2) return 308590065;
            }
            if (bl2) return 308590065;
            return 5h.a;
        }
        if (!bl2) return 5h.b;
        return 308590065;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9A.\u2004\u200a;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)1677470444 ^ (long)-1677470445);
            if (9A.\u2004\u200a) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9A.a = new String(v1).intern();
                    if (9A.\u2004\u200a) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u7e07\u57d2\u9405\u69e8\u7e4a\u57d6\u946c", 1173248338).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)894050873 ^ (long)894050873);
            v4 = (int)((long)95885004 ^ (long)95885008);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)556564976 ^ (long)556564977)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-897066852 ^ (long)-897066853)) {
                            case 0: {
                                v11 = (int)((long)-443349315 ^ (long)-443349272);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-414506873 ^ (long)-414506805);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-366919471 ^ (long)-366919537);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)491606879 ^ (long)491606851);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-675369456 ^ (long)-675369416);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)671968998 ^ (long)671968946);
                                if (!9A.\u2004\u200a) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)259291165 ^ (long)259291190);
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
                    } while (!9A.\u2004\u200a);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9A.\u2004\u200a)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 9A(7w w2) {
        boolean bl2 = \u2004\u200a;
        super(w2, a);
    }
}

