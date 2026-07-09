/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.7c;
import net.impactclient.80;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0re
extends 9m<80> {
    public static final boolean \u200e\u200e\u2003\u2004\u2000;
    private static final String a;
    @EventHandler
    private final Listener<7c> 0;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0re.\u200e\u200e\u2003\u2004\u2000;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)1099695236 ^ (long)-1099695237);
            if (0re.\u200e\u200e\u2003\u2004\u2000) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0re.a = new String(v1).intern();
                    if (0re.\u200e\u200e\u2003\u2004\u2000) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uaaa3\u03e4\uc033\u3dd9\uaaa4", -1959195281).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-577301381 ^ (long)-577301381);
            v4 = (int)((long)2119501462 ^ (long)2119501443);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)595792309 ^ (long)595792308)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-368145741 ^ (long)-368145740)) {
                            case 0: {
                                v11 = (int)((long)-348354680 ^ (long)-348354651);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-62772061 ^ (long)-62771979);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1672547022 ^ (long)1672546966);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-68899797 ^ (long)-68899784);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1243099776 ^ (long)-1243099775);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-2017834580 ^ (long)-2017834507);
                                if (!0re.\u200e\u200e\u2003\u2004\u2000) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-707177515 ^ (long)-707177583);
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
                    } while (!0re.\u200e\u200e\u2003\u2004\u2000);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0re.\u200e\u200e\u2003\u2004\u2000)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 0re(80 var1_1) {
        boolean bl2 = \u200e\u200e\u2003\u2004\u2000;
        super(var1_1, a, null);
        this.0 = new Listener<7c>(c2 -> {
            boolean bl2;
            block10: {
                block9: {
                    bl2 = \u200e\u200e\u2003\u2004\u2000;
                    if (bl2 || bl2) return;
                    if (0re.2.h == null) break block9;
                    if (bl2) return;
                    if (c2.0 == EventState.PRE) break block10;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            if (0re.2.h.L > 3.0f) {
                if (bl2 || bl2) return;
                0re.2.h.t = 0.1f;
                if (bl2 || bl2) return;
                0re.2.h.L = 0.0f;
                if (bl2) return;
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)190733989 ^ (long)190733989)]);
    }
}

