/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0aa;
import net.impactclient.0ro;
import net.impactclient.4t;
import net.impactclient.7c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 0ai
implements Listenable {
    private final 0aa 3;
    @EventHandler
    private final Listener<7c> 1;
    private 0ro 2;
    public static final boolean \u2006\u200d\u2005\u2009\u2005\u200e;
    private boolean 4;
    private List<0ro> 0;

    /*
     * Enabled aggressive block sorting
     */
    private 0ai() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
                if (bl2 || bl2) break block2;
                this.0 = new ArrayList<0ro>();
                if (bl2 || bl2) break block2;
                this.3 = new 0aa();
                if (bl2 || bl2) break block2;
                this.1 = new Listener<7c>(object -> {
                    boolean bl2;
                    block13: {
                        block12: {
                            bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
                            if (bl2 || bl2) return;
                            if (0T.2.h == null) {
                                if (bl2 || bl2) return;
                                this.0();
                                if (bl2 || bl2) return;
                                return;
                            }
                            if (bl2) return;
                            if (!this.4) break block12;
                            if (bl2) return;
                            if (this.2 == null) break block12;
                            if (bl2) return;
                            if (this.3.0(this.2.3)) break block13;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    this.3.0();
                    if (bl2 || bl2) return;
                    object = this.2;
                    0T.2.h.g(((0ro)object).1[((0ro)object).2]);
                    if (bl2 || bl2) return;
                    object = this.2;
                    if ((((0ro)object).2 += (int)((long)-1145254912 ^ (long)-1145254911)) >= ((0ro)object).1.length) {
                        if (bl2 || bl2) return;
                        ((0ro)object).2 = (int)((long)-1694349529 ^ (long)-1694349529);
                        if (bl2) return;
                    }
                    if (!bl2) return;
                }, new Predicate[(int)((long)-1114485636 ^ (long)-1114485636)]);
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ boolean 0(0ai ai2, String object) {
        boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
        if (bl2 || bl2) return true;
        if ((object = ai2.0((String)object)) != null) {
            if (bl2 || bl2) return true;
            ai2.2 = object;
            if (bl2 || bl2) return true;
            return (int)((long)-411823388 ^ (long)-411823387) != 0;
        }
        if (!bl2) return (int)((long)1846036325 ^ (long)1846036325) != 0;
        return true;
    }

    static /* synthetic */ List 2(0ai ai2) {
        boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return ai2.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ void 1(0ai ai2) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
                if (bl2 || bl2) break block2;
                ai2.4 = (int)((long)-868682237 ^ (long)-868682238);
                if (bl2 || bl2) break block2;
                4t.1.subscribe(ai2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    final 0ro 0(String string) {
        boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return this.0.stream().filter(ro -> {
            boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
            if (bl2 || bl2) {
                return true;
            }
            return ro.0.equals(string);
        }).findFirst().orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ boolean 0(0ai ai2, 0ro ro) {
        boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
        if (bl2 || bl2) return true;
        if (ai2.0(ro.0) != null) {
            if (bl2 || bl2) return true;
            return (int)((long)-289904759 ^ (long)-289904759) != 0;
        }
        if (bl2) return true;
        ai2.0.add(ro);
        if (!bl2 && !bl2) return (int)((long)971709096 ^ (long)971709097) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    /* synthetic */ 0ai(byte by2) {
        boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
        this();
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
                if (bl2 || bl2) break block2;
                this.4 = (int)((long)1303461052 ^ (long)1303461052);
                if (bl2 || bl2) break block2;
                4t.1.unsubscribe(this);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ void 0(0ai ai2) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2005\u2009\u2005\u200e;
                if (bl2 || bl2) break block2;
                ai2.0();
                if (!bl2) break block3;
            }
            return;
        }
    }
}

