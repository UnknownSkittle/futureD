/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  lk
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorCPacketPlayer;
import net.impactclient.0rB$1f;
import net.impactclient.1f;
import net.impactclient.4b;
import net.impactclient.4n;
import net.impactclient.57;
import net.impactclient.7c;
import net.impactclient.8v;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9C
extends 9m<8v> {
    private static final String a;
    @EventHandler
    private final Listener<1f> 3;
    @EventHandler
    private final Listener<7c> 1;
    @EventHandler
    private final Listener<4b> 0;
    public static final boolean \u2004\u2003\u2000\u2007;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9C.\u2004\u2003\u2000\u2007;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1749966520 ^ (long)1749966519);
            if (9C.\u2004\u2003\u2000\u2007) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9C.a = new String(v1).intern();
                    if (9C.\u2004\u2003\u2000\u2007) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u097e\u20cd\ue30b", -114348538).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-1560398518 ^ (long)-1560398518);
            v4 = (int)((long)2112012400 ^ (long)2112012407);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-1869914271 ^ (long)-1869914272)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-689976609 ^ (long)-689976616)) {
                            case 0: {
                                v11 = (int)((long)-1498789735 ^ (long)-1498789647);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1432017395 ^ (long)1432017367);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)65600675 ^ (long)65600655);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)1848270205 ^ (long)1848270127);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)1324559582 ^ (long)1324559602);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)63967431 ^ (long)63967408);
                                if (!9C.\u2004\u2003\u2000\u2007) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-1180577603 ^ (long)-1180577552);
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
                    } while (!9C.\u2004\u2003\u2000\u2007);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9C.\u2004\u2003\u2000\u2007)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 9C(8v v2) {
        boolean bl2 = \u2004\u2003\u2000\u2007;
        super(v2, a, null);
        this.0 = new Listener<4b>(b2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u2004\u2003\u2000\u2007;
                        if (bl2 || bl2) break block2;
                        if (9C.2.h.z) break block3;
                        if (bl2) break block2;
                        if (9C.2.h.ao()) break block3;
                        if (bl2 || bl2) break block2;
                        57.0(b2, 0.46210965514183044);
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)-1500926158 ^ (long)-1500926158)]);
        this.1 = new Listener<7c>(c2 -> {
            boolean bl2;
            block10: {
                block9: {
                    bl2 = \u2004\u2003\u2000\u2007;
                    if (bl2 || bl2) return;
                    if (9C.2.h == null) break block9;
                    if (bl2) return;
                    if (c2.0 == EventState.PRE) break block10;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            if ((float)9C.2.h.ay == 10.0f) {
                if (bl2 || bl2) return;
                9C.2.h.t = 0.83;
                if (bl2) return;
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)-1421123791 ^ (long)-1421123791)]);
        Predicate[] predicateArray = new Predicate[(int)((long)-1618591584 ^ (long)-1618591583)];
        Class[] classArray = new Class[(int)((long)544131289 ^ (long)544131288)];
        classArray[(int)((long)375764387 ^ (long)375764387)] = lk.class;
        predicateArray[(int)((long)-836148378 ^ (long)-836148378)] = new 4n(classArray);
        this.3 = new Listener<1f>(f2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u2004\u2003\u2000\u2007;
                        if (bl2 || bl2) break block2;
                        if (!(9C.2.h.L > 3.8f)) break block3;
                        if (bl2 || bl2) break block2;
                        ((AccessorCPacketPlayer)f2.0).setOnGround((boolean)((long)-1767204051 ^ (long)-1767204052));
                        if (bl2 || bl2) break block2;
                        9C.2.h.L = 0.0f;
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, predicateArray);
    }
}

