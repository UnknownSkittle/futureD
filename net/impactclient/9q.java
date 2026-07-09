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
public final class 9q
extends 9m<7F> {
    @EventHandler
    private final Listener<1f> 0;
    private static final String a;
    public static final boolean \u2003\u2004\u2008\u2004;

    public 9q(7F f3) {
        boolean bl2 = \u2003\u2004\u2008\u2004;
        super(f3, a, null);
        Predicate[] predicateArray = new Predicate[(int)((long)1250400131 ^ (long)1250400130)];
        Class[] classArray = new Class[(int)((long)1710507517 ^ (long)1710507516)];
        classArray[(int)((long)-562412895 ^ (long)-562412895)] = lk.class;
        predicateArray[(int)((long)588089153 ^ (long)588089153)] = new 4n(classArray);
        this.0 = new Listener<1f>(f2 -> {
            int n2;
            block9: {
                block7: {
                    block8: {
                        block6: {
                            boolean bl2 = \u2003\u2004\u2008\u2004;
                            if (bl2 || bl2) break block6;
                            if (((lk)f2.0).b(9q.2.h.q) - 9q.2.h.N != 0.0) break block7;
                            if (!bl2) break block8;
                        }
                        return;
                    }
                    n2 = (int)((long)-1557013563 ^ (long)-1557013564);
                    if (\u2003\u2004\u2008\u2004) {
                        throw null;
                    }
                    break block9;
                }
                n2 = (int)((long)2002153980 ^ (long)2002153980);
            }
            if (n2 != 0 && !9q.2.c.m()) {
                ((AccessorCPacketPlayer)f2.0).setOnGround((boolean)((long)989877265 ^ (long)989877265));
            }
        }, predicateArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9q.\u2003\u2004\u2008\u2004;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-2000695696 ^ (long)2000695695);
            if (9q.\u2003\u2004\u2008\u2004) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9q.a = new String(v1).intern();
                    if (9q.\u2003\u2004\u2008\u2004) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u853d\uac6e\u6f97\u926f\u856b", 1404347126).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)1717359766 ^ (long)1717359766);
            v4 = (int)((long)531463155 ^ (long)531463126);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)1410305210 ^ (long)1410305211)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)2036437872 ^ (long)2036437879)) {
                            case 0: {
                                v11 = (int)((long)463267335 ^ (long)463267390);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1036559341 ^ (long)1036559252);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1771531112 ^ (long)1771531048);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-120354111 ^ (long)-120354084);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-2044935442 ^ (long)-2044935514);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-536144189 ^ (long)-536144147);
                                if (!9q.\u2003\u2004\u2008\u2004) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1800958775 ^ (long)1800958779);
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
                    } while (!9q.\u2003\u2004\u2008\u2004);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9q.\u2003\u2004\u2008\u2004)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

