/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  ic
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.1J;
import net.impactclient.1l;
import net.impactclient.3Z;
import net.impactclient.4n;
import net.impactclient.50;
import net.impactclient.5h;
import net.impactclient.7w;
import net.impactclient.9h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9Z
extends 9h {
    public static final boolean \u200f;
    private final 3Z 0;
    @EventHandler
    private final Listener<1l> 1;
    private static final String a;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9Z.\u200f;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1943890079 ^ (long)1943890078);
            if (9Z.\u200f) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9Z.a = new String(v1).intern();
                    if (9Z.\u200f) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u3696\u1f59\udcf8\u2118\u369a\u1f36", 1880691074).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)323066979 ^ (long)323066979);
            v4 = (int)((long)-1401075362 ^ (long)-1401075402);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-662512461 ^ (long)-662512462)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)780347553 ^ (long)780347558)) {
                            case 0: {
                                v11 = (int)((long)-1625402335 ^ (long)-1625402272);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1649219600 ^ (long)-1649219701);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1420275349 ^ (long)1420275329);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)463881525 ^ (long)463881599);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)247226476 ^ (long)247226388);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-237063634 ^ (long)-237063633);
                                if (!9Z.\u200f) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)674286232 ^ (long)674286297);
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
                    } while (!9Z.\u200f);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9Z.\u200f)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public 9Z(7w w2) {
        boolean bl2 = \u200f;
        super(w2, a);
        this.0 = new 3Z();
        Predicate[] predicateArray = new Predicate[(int)((long)-609695772 ^ (long)-609695771)];
        Class[] classArray = new Class[(int)((long)-1748675296 ^ (long)-1748675295)];
        classArray[(int)((long)-1315663400 ^ (long)-1315663400)] = ic.class;
        predicateArray[(int)((long)1800163741 ^ (long)1800163741)] = new 4n(classArray);
        this.1 = new Listener<1l>(l2 -> {
            double d2;
            boolean bl2 = \u200f;
            if (bl2 || bl2) return;
            if (l2.0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            ic ic2 = (ic)((1J)l2).0;
            if (bl2 || bl2) return;
            double d3 = ic2.d();
            3Z z2 = this.0;
            this.0.2 = d3;
            if (bl2 || bl2) return;
            v0.0 = d3 = ic2.e();
            if (bl2 || bl2) return;
            z2.1 = ic2.f();
            if (bl2 || bl2) return;
            3Z z3 = ((50)9Z.2.h).getPos();
            double d4 = z3.0(this.0);
            if (d2 <= 17.0) {
                if (bl2) return;
                if (d4 > 0.0) {
                    if (bl2) return;
                    if (this.0.0 > z3.0 + 1.0) {
                        if (bl2 || bl2) return;
                        l2.cancel();
                        if (bl2) return;
                    }
                }
            }
            if (!bl2) return;
        }, predicateArray);
    }

    @Override
    public final int 0(aed aed2) {
        boolean bl2 = \u200f;
        if (bl2 || bl2) {
            return 1688766700;
        }
        return 5h.b;
    }
}

