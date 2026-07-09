/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  acl
 *  vg
 *  vp
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.2O;
import net.impactclient.5Y;
import net.impactclient.99;
import net.impactclient.9m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0rt
extends 9m<99> {
    @EventHandler
    private final Listener<5Y> 0;
    private static final String a;
    public static final boolean \u2005\u2008\u200c;

    public 0rt(99 var1_1) {
        boolean bl2 = \u2005\u2008\u200c;
        super(var1_1, a, null);
        this.0 = new Listener<5Y>(y2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u2005\u2008\u200c;
                    if (bl2 || bl2) break block2;
                    0rt.2.f.L().stream().filter(((99)this.5)::0).forEach(vg2 -> {
                        boolean bl2 = \u2005\u2008\u200c;
                        if (bl2 || bl2) return;
                        if (vg2 instanceof vp) {
                            if (bl2 || bl2) return;
                            2O.0((vg)((vp)vg2), ((99)this.5).1((vg)vg2), (boolean)((long)1483313014 ^ (long)1483313015), y2.0());
                            if (bl2) return;
                            return;
                        }
                        if (bl2) return;
                        if (vg2 instanceof acl) {
                            if (bl2 || bl2) return;
                            2O.0((acl)vg2, ((99)this.5).1((vg)vg2), ((99)this.5).7.2, y2.0());
                            if (bl2) return;
                        }
                        if (!bl2) return;
                    });
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)-1377872955 ^ (long)-1377872955)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0rt.\u2005\u2008\u200c;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-841960110 ^ (long)841960109);
            if (0rt.\u2005\u2008\u200c) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0rt.a = new String(v1).intern();
                    if (0rt.\u2005\u2008\u200c) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u9da4\u34a5\uf720", -356697532).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-2040669440 ^ (long)-2040669440);
            v4 = (int)((long)-1783245277 ^ (long)-1783245225);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-2067729749 ^ (long)-2067729750)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)722424374 ^ (long)722424369)) {
                            case 0: {
                                v11 = (int)((long)1996820677 ^ (long)1996820693);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1249553939 ^ (long)1249553984);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)847811730 ^ (long)847811743);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)1831276165 ^ (long)1831276253);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)394012330 ^ (long)394012316);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1146225967 ^ (long)-1146225959);
                                if (!0rt.\u2005\u2008\u200c) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1486024399 ^ (long)1486024349);
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
                    } while (!0rt.\u2005\u2008\u200c);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0rt.\u2005\u2008\u200c)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

