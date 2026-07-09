/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0a9;
import net.impactclient.0aO;
import net.impactclient.0rB$1f;
import net.impactclient.9f;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rc
extends 9m<9f> {
    @EventHandler
    private final Listener<0aO> 0;
    public static final boolean \u200e\u2006;
    private static final String a;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0rc.\u200e\u2006;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-941692731 ^ (long)941692730);
            if (0rc.\u200e\u2006) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0rc.a = new String(v1).intern();
                    if (0rc.\u200e\u2006) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u6c15\uc55a\u06e0\ufb75\u6c4f\uc50d\u06a0\ufb4f", 1318964159).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-287515882 ^ (long)-287515882);
            v4 = (int)((long)1500170100 ^ (long)1500169999);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-1208420152 ^ (long)-1208420151)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-47207129 ^ (long)-47207136)) {
                            case 0: {
                                v11 = (int)((long)1945559907 ^ (long)1945559888);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1514886305 ^ (long)1514886391);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-44067878 ^ (long)-44067849);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-981186241 ^ (long)-981186255);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)67537325 ^ (long)67537403);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)2024424330 ^ (long)2024424331);
                                if (!0rc.\u200e\u2006) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-1887856030 ^ (long)-1887856128);
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
                    } while (!0rc.\u200e\u2006);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0rc.\u200e\u2006)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 0rc(9f f2) {
        boolean bl2 = \u200e\u2006;
        super(f2, a, null);
        this.0 = new Listener<0aO>(aO -> {
            boolean bl2 = \u200e\u2006;
            if (bl2 || bl2) return;
            if (!((9f)this.5).0.0(aO.0)) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            switch (0a9.0[aO.1.ordinal()]) {
                case 1: {
                    if (bl2) return;
                    bus.s();
                    if (bl2 || bl2) return;
                    bus.a((float)1.0f, (float)-1000000.0f);
                    if (bl2 || bl2) return;
                    return;
                }
                case 2: {
                    if (bl2) return;
                    bus.t();
                    if (bl2 || bl2) return;
                    bus.a((float)1.0f, (float)1000000.0f);
                    if (bl2) return;
                    break;
                }
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)1053695412 ^ (long)1053695412)]);
    }
}

