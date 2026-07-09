/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import java.util.Objects;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0a3;
import net.impactclient.0ab;
import net.impactclient.0af;
import net.impactclient.0ay;
import net.impactclient.0v;
import net.impactclient.1b;
import net.impactclient.1c;
import net.impactclient.30;
import net.impactclient.3k;
import net.impactclient.44;
import net.impactclient.4c;
import net.impactclient.4t;
import net.impactclient.67;
import net.impactclient.68;
import net.impactclient.6F;
import net.impactclient.6K;
import net.impactclient.6g;
import net.impactclient.6o;
import net.impactclient.6u;
import net.impactclient.73;
import net.impactclient.7b;
import net.impactclient.7x;
import net.impactclient.9e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0ao
extends 0a3
implements Listenable {
    @EventHandler
    private final Listener<3k> 3;
    public static final boolean \u200c;
    private 0af 1;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200c;
                    if (bl2 || bl2) break block2;
                    if (this.1 != null) break block3;
                    if (bl2 || bl2) break block2;
                    30 var2_3 = new 30();
                    68.0(0ay.3().5).forEach(string -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u200c;
                                if (bl2 || bl2) break block2;
                                6u u2 = new 6u((String)string);
                                if (bl2 || bl2) break block2;
                                30 var3_4 = new 30();
                                if (bl2 || bl2) break block2;
                                0ay.3().5.0((String)string).forEach(var1_1 -> {
                                    block3: {
                                        block2: {
                                            boolean bl2 = \u200c;
                                            if (bl2 || bl2) break block2;
                                            var3_4.2().add(0ao.0(var1_1));
                                            if (!bl2) break block3;
                                        }
                                        return;
                                    }
                                });
                                if (bl2 || bl2) break block2;
                                u2.0(var3_4);
                                if (bl2 || bl2) break block2;
                                var2_3.2().add(u2);
                                if (!bl2 && !bl2) break block3;
                            }
                            return;
                        }
                    });
                    this.1 = var2_3;
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                float f2 = 0ao.0.getTimer().c;
                if (bl2 || bl2) break block2;
                this.1.0(bip2, f2);
                if (bl2 || bl2) break block2;
                ((0ab)this).3 = this.1.0(bip2);
                if (bl2 || bl2) break block2;
                ((0ab)this).1 = this.1.1(bip2);
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static 4c 0(1b b2) {
        6K k2;
        boolean bl2;
        block11: {
            block14: {
                String[] stringArray;
                block13: {
                    block12: {
                        block10: {
                            bl2 = \u200c;
                            if (bl2) return null;
                            stringArray = 7b.0();
                            if (bl2 || bl2) return null;
                            if (!(b2 instanceof 73)) break block10;
                            if (bl2 || bl2) return null;
                            k2 = new 6F<73>((73)b2);
                            if (bl2) return null;
                            if (stringArray != null) break block11;
                            if (bl2) return null;
                        }
                        if (bl2) return null;
                        if (!(b2 instanceof 1c)) break block12;
                        if (bl2 || bl2) return null;
                        k2 = new 6F<1c>((1c)b2);
                        if (bl2) return null;
                        if (stringArray != null) break block11;
                        if (bl2) return null;
                    }
                    if (bl2) return null;
                    if (!(b2 instanceof 44)) break block13;
                    if (bl2 || bl2) return null;
                    k2 = new 67((44)b2);
                    if (bl2) return null;
                    if (stringArray != null) break block11;
                    if (bl2) return null;
                }
                if (bl2) return null;
                if (!(b2 instanceof 6g)) break block14;
                if (bl2 || bl2) return null;
                k2 = new 6o(7x.0((6g)b2));
                if (bl2) return null;
                if (stringArray != null) break block11;
                if (bl2) return null;
            }
            if (bl2) return null;
            return null;
        }
        if (bl2) return null;
        30 var3_4 = new 30();
        if (bl2 || bl2) return null;
        if (b2 instanceof 73) {
            if (bl2 || bl2) return null;
            7x x2 = 7x.0((73)b2);
            if (x2 != null) {
                if (bl2 || bl2) return null;
                var3_4.2().add(new 6o(x2));
                if (bl2) return null;
            }
        }
        if (bl2) return null;
        b2.0().forEach(w2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u200c;
                    if (bl2 || bl2) break block2;
                    var3_4.2().add(0ao.0(w2));
                    if (!bl2) break block3;
                }
                return;
            }
        });
        if (bl2 || bl2) return null;
        var3_4.2().removeIf(Objects::isNull);
        if (bl2 || bl2) return null;
        k2.0(var3_4);
        if (!bl2 && !bl2) return k2;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0ao() {
        block3: {
            block2: {
                boolean bl2 = \u200c;
                if (bl2 || bl2) break block2;
                this.3 = new Listener<3k>(k2 -> {
                    int n2;
                    boolean bl2;
                    block10: {
                        block9: {
                            bl2 = \u200c;
                            if (bl2 || bl2) return;
                            9e e2 = 0ay.3().5.0(9e.class);
                            if (bl2 || bl2) return;
                            n2 = k2.0();
                            if (bl2 || bl2) return;
                            if (!this.0) break block9;
                            if (bl2) return;
                            if (0ao.2.t.ax) break block9;
                            if (bl2) return;
                            if (e2.4()) break block10;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    0v v2 = 0v.0(n2);
                    if (v2 != null) {
                        if (bl2 || bl2) return;
                        this.1.0(v2);
                        if (bl2) return;
                    }
                    if (!bl2) return;
                }, new Predicate[(int)((long)-474481211 ^ (long)-474481211)]);
                if (bl2 || bl2) break block2;
                4t.1.subscribe(this);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

