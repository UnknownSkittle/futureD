/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  lk
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorCPacketPlayer;
import net.impactclient.0rB$1f;
import net.impactclient.1f;
import net.impactclient.4n;
import net.impactclient.7F;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9I
extends 9m<7F> {
    private static final String a;
    @EventHandler
    private final Listener<1f> 0;
    public static final boolean \u2004\u200b\u200a\u2000\u2004\u2005\u200c;

    public 9I(7F f3) {
        boolean bl2 = \u2004\u200b\u200a\u2000\u2004\u2005\u200c;
        super(f3, a, null);
        Predicate[] predicateArray = new Predicate[(int)((long)439624747 ^ (long)439624746)];
        Class[] classArray = new Class[(int)((long)2079582606 ^ (long)2079582607)];
        classArray[(int)((long)-82532743 ^ (long)-82532743)] = lk.class;
        predicateArray[(int)((long)-1242466680 ^ (long)-1242466680)] = new 4n(classArray);
        this.0 = new Listener<1f>(f2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u2004\u200b\u200a\u2000\u2004\u2005\u200c;
                    if (bl2 || bl2) break block2;
                    ((AccessorCPacketPlayer)f2.0).setOnGround((boolean)((long)534527988 ^ (long)534527988));
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        }, predicateArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-350157396 ^ (long)350157395);
            if (9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9I.a = new String(v1).intern();
                    if (9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u77f8\u5e77\u9d87\u6068\u77ff\u5e7f\u9d82\u6044\u7781", -1973202764).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)548635007 ^ (long)548635007);
            v4 = (int)((long)896052634 ^ (long)896052647);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)656110439 ^ (long)656110438)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)1667074127 ^ (long)1667074120)) {
                            case 0: {
                                v11 = (int)((long)-549077473 ^ (long)-549077385);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1135293705 ^ (long)-1135293754);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)573091880 ^ (long)573091877);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-1438904064 ^ (long)-1438903977);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)438264377 ^ (long)438264432);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)232686150 ^ (long)232686189);
                                if (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1802133104 ^ (long)1802133111);
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
                    } while (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9I.\u2004\u200b\u200a\u2000\u2004\u2005\u200c)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

