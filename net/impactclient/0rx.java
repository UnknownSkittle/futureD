/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0aO;
import net.impactclient.0rB$1f;
import net.impactclient.1t;
import net.impactclient.2O;
import net.impactclient.9f;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rx
extends 9m<9f> {
    private static final String a;
    public static final boolean \u2007\u2007\u2004;
    @EventHandler
    private final Listener<0aO> 0;

    public 0rx(9f f2) {
        boolean bl2 = \u2007\u2007\u2004;
        super(f2, a, null);
        this.0 = new Listener<0aO>(aO -> {
            boolean bl2;
            block10: {
                block9: {
                    bl2 = \u2007\u2007\u2004;
                    if (bl2 || bl2) return;
                    if (!((9f)this.5).0.0(aO.0)) break block9;
                    if (bl2) return;
                    if (aO.1 != EventState.PRE) break block9;
                    if (bl2) return;
                    if (aO.0 != 2.aa()) break block10;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            aO.cancel();
            if (bl2 || bl2) return;
            bus.G();
            if (bl2 || bl2) return;
            if (((9f)this.5).1.0) {
                if (bl2 || bl2) return;
                bus.j();
                if (bl2 || bl2) return;
                1t.0((int)((long)-856514353 ^ (long)856531151));
                if (bl2 || bl2) return;
                2O.0(aO);
                if (bl2) return;
            }
            if (bl2) return;
            bus.k();
            if (bl2 || bl2) return;
            1t.0((int)((long)-1519300569 ^ (long)1517399847));
            if (bl2 || bl2) return;
            2O.0(aO);
            if (bl2 || bl2) return;
            bus.H();
            if (!bl2 && !bl2) return;
        }, new Predicate[(int)((long)-1874190637 ^ (long)-1874190637)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0rx.\u2007\u2007\u2004;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)801947607 ^ (long)-801947608);
            if (0rx.\u2007\u2007\u2004) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0rx.a = new String(v1).intern();
                    if (0rx.\u2007\u2007\u2004) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u7086\ud9c5\u1a61\ue7c6\u7081\ud9fa\u1a42", -929376511).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-252840278 ^ (long)-252840278);
            v4 = (int)((long)1878744016 ^ (long)1878744003);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-1465746156 ^ (long)-1465746155)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-1576868961 ^ (long)-1576868968)) {
                            case 0: {
                                v11 = (int)((long)-1945886753 ^ (long)-1945886763);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1834207182 ^ (long)1834207189);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-1982679523 ^ (long)-1982679437);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)1483743121 ^ (long)1483743202);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)100472626 ^ (long)100472606);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)532507591 ^ (long)532507636);
                                if (!0rx.\u2007\u2007\u2004) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1154665155 ^ (long)1154665107);
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
                    } while (!0rx.\u2007\u2007\u2004);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0rx.\u2007\u2007\u2004)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

