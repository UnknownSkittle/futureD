/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  lk
 *  lk$b
 *  lk$c
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorCPacketPlayer;
import net.impactclient.0rB$1f;
import net.impactclient.1f;
import net.impactclient.41;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5g
extends Enum<5g>
implements Listenable {
    public static final /* enum */ 5g a;
    private static final /* synthetic */ 5g[] 0;
    public static final boolean \u2002\u2007\u2001;
    @EventHandler
    private final Listener<1f> 1;

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 5g.\u2002\u2007\u2001;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)623214731 ^ (long)-623214732);
                if (5g.\u2002\u2007\u2001) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (5g.\u2002\u2007\u2001) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u56e9\u7ee5\ubd29\u40bc\u568c\u7ec7\ubd7b\u40c8", -1446285247).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)-914226162 ^ (long)-914226162);
                v4 = (int)((long)-196055272 ^ (long)-196055237);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)895866193 ^ (long)895866192)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)617844416 ^ (long)617844423)) {
                                case 0: {
                                    v11 = (int)((long)1948484880 ^ (long)1948484908);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)1252684986 ^ (long)1252685018);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-1595928602 ^ (long)-1595928677);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)-1389415171 ^ (long)-1389415260);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-2080302674 ^ (long)-2080302593);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)570533816 ^ (long)570533882);
                                    if (!5g.\u2002\u2007\u2001) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-849934449 ^ (long)-849934416);
                                }
                            }
                            v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                            ++var1_2;
                            v4 = v7;
                            if (v7 != 0) break block14;
                            v7 = v4;
                            v5 = v5;
                            v10 = v4;
                            v8 = v5;
                            v9 = v4;
                        } while (!5g.\u2002\u2007\u2001);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!5g.\u2002\u2007\u2001)
lbl76:
                // 1 sources

                throw null;
            }
            5g.a = new 5g(var0_1);
            v12 = new 5g[(int)((long)296400529 ^ (long)296400528)];
            v12[(int)((long)-1675467485 ^ (long)-1675467485)] = 5g.a;
            5g.0 = v12;
        }
    }

    public static 5g valueOf(String string) {
        boolean bl2 = \u2002\u2007\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(5g.class, string);
    }

    public static 5g[] values() {
        boolean bl2 = \u2002\u2007\u2001;
        if (bl2 || bl2) {
            return null;
        }
        return (5g[])0.clone();
    }

    private 5g() {
        n2 = \u2002\u2007\u2001 ? 1 : 0;
        Predicate[] predicateArray = new Predicate[(int)((long)1577030408 ^ (long)1577030409)];
        Class[] classArray = new Class[(int)((long)-893525278 ^ (long)-893525280)];
        classArray[(int)((long)307013091 ^ (long)307013091)] = lk.b.class;
        classArray[(int)((long)-1698425517 ^ (long)-1698425518)] = lk.c.class;
        predicateArray[(int)((long)-71958685 ^ (long)-71958685)] = new 41(classArray);
        this.1 = new Listener<1f>(f2 -> {
            lk lk2;
            boolean bl2 = \u2002\u2007\u2001;
            if (bl2 || bl2) return;
            f2 = (lk)f2.0;
            if (lk2.b(0.0f) > 90.0f) {
                if (bl2 || bl2) return;
                ((AccessorCPacketPlayer)((Object)f2)).setPitch(90.0f);
                if (bl2) return;
                return;
            }
            if (bl2) return;
            if (f2.b(0.0f) < -90.0f) {
                if (bl2 || bl2) return;
                ((AccessorCPacketPlayer)((Object)f2)).setPitch(-90.0f);
                if (bl2) return;
            }
            if (!bl2) return;
        }, predicateArray);
    }
}

