/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  blk
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0i;
import net.impactclient.0rB$1f;
import net.impactclient.0rg;
import net.impactclient.5T;
import net.impactclient.7V;
import net.impactclient.7b;
import net.impactclient.7c;
import pw.knx.feather.animate.TimeAnimation;
import pw.knx.feather.animate.Transition;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2l
extends Enum<2l>
implements Listenable,
0T {
    private static final /* synthetic */ 2l[] 1;
    @EventHandler
    private final Listener<5T> 3;
    public static final /* enum */ 2l a;
    private blk 4;
    private final TimeAnimation 6;
    public static final boolean \u200e\u2009\u2007;
    @EventHandler
    private final Listener<7c> 5;
    private float 0;

    public static 2l[] values() {
        boolean bl2 = \u200e\u2009\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return (2l[])1.clone();
    }

    public static 2l valueOf(String string) {
        boolean bl2 = \u200e\u2009\u2007;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(2l.class, string);
    }

    private 2l() {
        n2 = \u200e\u2009\u2007 ? 1 : 0;
        this.6 = new TimeAnimation();
        this.5 = new Listener<7c>(c2 -> {
            boolean bl2;
            block10: {
                block12: {
                    block11: {
                        bl2 = \u200e\u2009\u2007;
                        if (bl2) return;
                        String[] stringArray = 7b.0();
                        if (bl2 || bl2) return;
                        if (0ay.3().9 != 0) {
                            if (bl2 || bl2) return;
                            0i.3();
                            if (bl2) return;
                        }
                        if (bl2) return;
                        this.6.setTransition(Transition.CURVE);
                        if (bl2 || bl2) return;
                        this.6.setDuration((int)((long)-960212681 ^ (long)-960212531));
                        if (bl2 || bl2) return;
                        this.0 = -1.0f;
                        if (bl2 || bl2) return;
                        if (2l.2.f == null) {
                            if (bl2 || bl2) return;
                            this.6.forward();
                            if (bl2 || bl2) return;
                            return;
                        }
                        if (bl2) return;
                        if (this.4 == 2l.2.m) break block10;
                        if (bl2 || bl2) return;
                        if (2l.2.m != null) break block11;
                        if (bl2 || bl2) return;
                        this.6.reverse();
                        if (bl2) return;
                        if (stringArray != null) break block12;
                        if (bl2) return;
                    }
                    if (bl2) return;
                    this.6.forward();
                    if (bl2) return;
                }
                if (bl2) return;
                this.6.play();
                if (bl2) return;
            }
            if (bl2) return;
            this.0 = (float)this.6.get();
            if (bl2 || bl2) return;
            if (Float.isNaN(this.0)) {
                if (bl2 || bl2) return;
                this.0 = 0.0f;
                if (bl2) return;
            }
            if (bl2) return;
            this.4 = 2l.2.m;
            if (!bl2 && !bl2) return;
        }, new Predicate[(int)((long)175542589 ^ (long)175542589)]);
        this.3 = new Listener<5T>(t2 -> {
            boolean bl2;
            block8: {
                block7: {
                    bl2 = \u200e\u2009\u2007;
                    if (bl2 || bl2) return;
                    if (this.0 < 0.0f) break block7;
                    if (bl2) return;
                    if (7V.a.c) break block8;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            0rg.0((int)((long)-2059455227 ^ (long)-2059455227), (int)((long)1966336682 ^ (long)1966336682), 2l.2.d, 2l.2.e, 3.0f, this.0);
            if (!bl2 && !bl2) return;
        }, (byte)((long)1963259646 ^ (long)1963259647), new Predicate[(int)((long)581508422 ^ (long)581508422)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 2l.\u200e\u2009\u2007;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-1652002211 ^ (long)1652002210);
                if (2l.\u200e\u2009\u2007) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (2l.\u200e\u2009\u2007) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u3b09\u137c\ud092\u2d5f\u3b7f\u1349\ud083\u2d70", -1850139167).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)1625393590 ^ (long)1625393590);
                v4 = (int)((long)-2008127551 ^ (long)-2008127493);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-550817364 ^ (long)-550817363)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)-1969659268 ^ (long)-1969659269)) {
                                case 0: {
                                    v11 = (int)((long)-642713801 ^ (long)-642713846);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-1915428469 ^ (long)-1915428405);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)426478557 ^ (long)426478498);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)2035848471 ^ (long)2035848468);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-1096386275 ^ (long)-1096386210);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)1466317804 ^ (long)1466317721);
                                    if (!2l.\u200e\u2009\u2007) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-1912429518 ^ (long)-1912429492);
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
                        } while (!2l.\u200e\u2009\u2007);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!2l.\u200e\u2009\u2007)
lbl76:
                // 1 sources

                throw null;
            }
            2l.a = new 2l(var0_1);
            v12 = new 2l[(int)((long)2033099310 ^ (long)2033099311)];
            v12[(int)((long)1669735836 ^ (long)1669735836)] = 2l.a;
            2l.1 = v12;
        }
    }
}

