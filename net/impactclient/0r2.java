/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0n;
import net.impactclient.0rB$1f;
import net.impactclient.4Z;
import net.impactclient.4b;
import net.impactclient.57;
import net.impactclient.7Q;
import net.impactclient.7b;
import net.impactclient.8S;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0r2
extends 9m<8S> {
    public static final boolean \u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007;
    private static final String a;
    @EventHandler
    private final Listener<4b> 0;
    @EventHandler
    private final Listener<4Z> 1;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-958961734 ^ (long)958961733);
            if (0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0r2.a = new String(v1).intern();
                    if (0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u8685\u2f88\uec7f\u11f6\u86d1", -159571691).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-865715895 ^ (long)-865715895);
            v4 = (int)((long)118239611 ^ (long)118239524);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)305824853 ^ (long)305824852)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-974200219 ^ (long)-974200222)) {
                            case 0: {
                                v11 = (int)((long)-1302804146 ^ (long)-1302804157);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)2087594842 ^ (long)2087594845);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-909700731 ^ (long)-909700678);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-920946130 ^ (long)-920946144);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)426665833 ^ (long)426665730);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1155644269 ^ (long)-1155644188);
                                if (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1997139733 ^ (long)1997139737);
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
                    } while (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0r2.\u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 0r2(8S s2) {
        boolean bl2 = \u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007;
        super(s2, a, null);
        this.1 = new Listener<4Z>(z2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        double d2;
                        bl2 = \u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007;
                        if (bl2 || bl2) break block2;
                        if (0r2.2.h.bg != 0.0f) break block3;
                        if (bl2) break block2;
                        if (0r2.2.h.be != 0.0f) break block3;
                        if (bl2 || bl2) break block2;
                        z2.1.2 = d2 = z2.1.2 + (Math.random() * 0.1 - 0.025);
                        if (bl2 || bl2) break block2;
                        z2.1.1 = d2 = z2.1.1 + (Math.random() * 0.1 - 0.025);
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)1210070270 ^ (long)1210070270)]);
        this.0 = new Listener<4b>(b2 -> {
            block8: {
                block2: {
                    boolean bl2;
                    block7: {
                        block6: {
                            block4: {
                                block5: {
                                    double d2;
                                    String[] stringArray;
                                    block3: {
                                        bl2 = \u200e\u200d\u2004\u2008\u2005\u200d\u200a\u2007;
                                        if (bl2) break block2;
                                        stringArray = 7b.0();
                                        if (bl2 || bl2) break block2;
                                        d2 = 7Q.0(0r2.2.h.q - (double)((int)0r2.2.h.q), (int)((long)-767893280 ^ (long)-767893277));
                                        if (d2 != 0.425) break block3;
                                        if (bl2 || bl2) break block2;
                                        b2.2 *= -0.005;
                                        if (bl2 || bl2) break block2;
                                        if (stringArray != null) break block4;
                                        if (bl2) break block2;
                                    }
                                    if (bl2) break block2;
                                    if (!(d2 < 0.425)) break block5;
                                    if (bl2 || bl2) break block2;
                                    b2.2 *= 9.07E-14;
                                    if (bl2 || bl2) break block2;
                                    if (stringArray != null) break block4;
                                    if (bl2) break block2;
                                }
                                if (bl2) break block2;
                                b2.2 = -0.09;
                                if (bl2) break block2;
                            }
                            if (bl2) break block2;
                            if (0r2.2.h.bg != 0.0f) break block6;
                            if (bl2) break block2;
                            if (0r2.2.h.be == 0.0f) break block7;
                            if (bl2) break block2;
                        }
                        if (bl2) break block2;
                        if (!0r2.2.h.z) break block7;
                        if (bl2 || bl2) break block2;
                        b2.2 = 0.425;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    0r2.2.h.t = b2.2;
                    if (bl2 || bl2) break block2;
                    57.0(b2, 57.0(0n.b));
                    if (!bl2 && !bl2) break block8;
                }
                return;
            }
        }, new Predicate[(int)((long)-772735800 ^ (long)-772735800)]);
    }
}

