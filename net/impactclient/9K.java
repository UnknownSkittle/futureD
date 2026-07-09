/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bub
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.0rX;
import net.impactclient.8T;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9K
extends 9m<8T> {
    private static final String a;
    @EventHandler
    private final Listener<0rX> 0;
    public static final boolean \u2006;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9K.\u2006;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-471217769 ^ (long)471217768);
            if (9K.\u2006) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9K.a = new String(v1).intern();
                    if (9K.\u2006) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uf44d\uddc0\u1e2d\ue3f0\uf474", 774937).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-1655738786 ^ (long)-1655738786);
            v4 = (int)((long)1292651307 ^ (long)1292651290);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)579509173 ^ (long)579509172)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)2128737730 ^ (long)2128737733)) {
                            case 0: {
                                v11 = (int)((long)-442870422 ^ (long)-442870509);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1396416740 ^ (long)1396416708);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)21248861 ^ (long)21248846);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-1490761525 ^ (long)-1490761559);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1137859581 ^ (long)-1137859486);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1628347724 ^ (long)-1628347718);
                                if (!9K.\u2006) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-2098455178 ^ (long)-2098455271);
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
                    } while (!9K.\u2006);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9K.\u2006)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 9K(8T t2) {
        boolean bl2 = \u2006;
        super(t2, a, null);
        this.0 = new Listener<0rX>(rX -> {
            float f2;
            block8: {
                block7: {
                    boolean bl2 = \u2006;
                    if (bl2 || bl2) break block7;
                    rX.0.c = (int)((long)-780091412 ^ (long)-780091411);
                    if (!bl2 && !bl2) break block8;
                }
                return;
            }
            bub bub2 = rX.0;
            if (9K.2.h.aU()) {
                f2 = 0.3f;
                if (\u2006) {
                    throw null;
                }
            } else {
                f2 = 1.0f;
            }
            bub2.b = f2;
        }, new Predicate[(int)((long)1316640627 ^ (long)1316640627)]);
    }
}

