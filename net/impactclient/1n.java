/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0av;
import net.impactclient.0i;
import net.impactclient.0rB$1f;
import net.impactclient.3k;
import net.impactclient.45;
import net.impactclient.75;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1n
extends Enum<1n>
implements Listenable,
0T {
    public static final /* enum */ 1n a;
    private static final /* synthetic */ 1n[] 2;
    @EventHandler
    private final Listener<0i> 0;
    public static final boolean \u2002\u2003\u2006;
    @EventHandler
    private final Listener<3k> 1;

    private 1n() {
        n2 = \u2002\u2003\u2006 ? 1 : 0;
        Predicate[] predicateArray = new Predicate[(int)((long)-80010538 ^ (long)-80010537)];
        predicateArray[(int)((long)1847069434 ^ (long)1847069434)] = k2 -> {
            boolean bl2 = \u2002\u2003\u2006;
            if (bl2 || bl2) return true;
            if (!k2.isCancelled()) {
                if (bl2) return true;
                return (int)((long)-930299751 ^ (long)-930299752) != 0;
            }
            if (!bl2) return (int)((long)-796417690 ^ (long)-796417690) != 0;
            return true;
        };
        this.1 = new Listener<3k>(k2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u2002\u2003\u2006;
                    if (bl2 || bl2) break block2;
                    75.0().stream().filter(var1_1 -> {
                        boolean bl2 = \u2002\u2003\u2006;
                        if (bl2 || bl2) return true;
                        if (var1_1.0 != 0) {
                            if (bl2) return true;
                            if (var1_1.0 == k2.0()) {
                                if (bl2) return true;
                                return (int)((long)745877725 ^ (long)745877724) != 0;
                            }
                        }
                        if (!bl2) return (int)((long)-2091802844 ^ (long)-2091802844) != 0;
                        return true;
                    }).forEach(var0 -> {
                        block5: {
                            block2: {
                                boolean bl2;
                                block4: {
                                    block3: {
                                        bl2 = \u2002\u2003\u2006;
                                        if (bl2 || bl2) break block2;
                                        75 var1_2 = var0;
                                        var1_2.2.accept(45.b);
                                        if (bl2 || bl2) break block2;
                                        if (var1_2.1 != 0av.b) break block3;
                                        if (bl2 || bl2) break block2;
                                        var1_2.2();
                                        if (bl2) break block2;
                                    }
                                    if (bl2) break block2;
                                    if (var0.1 != 0av.a) break block4;
                                    if (bl2 || bl2) break block2;
                                    var0.2();
                                    if (bl2) break block2;
                                }
                                if (!bl2) break block5;
                            }
                            return;
                        }
                    });
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        }, (byte)((long)-1300813267 ^ (long)-1300813272), predicateArray);
        this.0 = new Listener<0i>(i2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u2002\u2003\u2006;
                    if (bl2 || bl2) break block2;
                    75.0().stream().filter(var1_1 -> {
                        boolean bl2 = \u2002\u2003\u2006;
                        if (bl2 || bl2) return true;
                        if (var1_1.0 == i2.1) {
                            if (bl2) return true;
                            return (int)((long)-1705253486 ^ (long)-1705253485) != 0;
                        }
                        if (!bl2) return (int)((long)-872909168 ^ (long)-872909168) != 0;
                        return true;
                    }).forEach(75::1);
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)-877223294 ^ (long)-877223294)]);
    }

    public static 1n valueOf(String string) {
        boolean bl2 = \u2002\u2003\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(1n.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 1n.\u2002\u2003\u2006;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-706205142 ^ (long)706205141);
                if (1n.\u2002\u2003\u2006) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (1n.\u2002\u2003\u2006) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u1607\u3e21\ufda0L\u1649\u3e32\ufda0Q", 1134637196).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)-683079172 ^ (long)-683079172);
                v4 = (int)((long)-1654005278 ^ (long)-1654005375);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)1042843754 ^ (long)1042843755)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)509416931 ^ (long)509416932)) {
                                case 0: {
                                    v11 = (int)((long)586930906 ^ (long)586930930);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-2089885744 ^ (long)-2089885703);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-1913959006 ^ (long)-1913958949);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)-545356484 ^ (long)-545356520);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-1052380862 ^ (long)-1052380884);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-563657238 ^ (long)-563657264);
                                    if (!1n.\u2002\u2003\u2006) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)494944490 ^ (long)494944387);
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
                        } while (!1n.\u2002\u2003\u2006);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!1n.\u2002\u2003\u2006)
lbl76:
                // 1 sources

                throw null;
            }
            1n.a = new 1n(var0_1);
            v12 = new 1n[(int)((long)-1702323275 ^ (long)-1702323276)];
            v12[(int)((long)1032544462 ^ (long)1032544462)] = 1n.a;
            1n.2 = v12;
        }
    }

    public static 1n[] values() {
        boolean bl2 = \u2002\u2003\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return (1n[])2.clone();
    }
}

