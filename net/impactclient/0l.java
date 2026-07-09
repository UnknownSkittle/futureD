/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 *  bit
 *  bus
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.impactclient.0a5;
import net.impactclient.1A;
import net.impactclient.1Y;
import net.impactclient.1g;
import net.impactclient.1p;
import net.impactclient.1s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0l {
    private float 0;
    private final 1p 1;
    private final List<1g> 2;
    public float 5;
    public float 4;
    private final Map<0a5, List<1g>> 3;
    public static final boolean \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(bip bip2, bit bit2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                if (bl2 || bl2) break block2;
                this.3.forEach((a5, list) -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                            if (bl2 || bl2) break block2;
                            list.clear();
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (bl2 || bl2) break block2;
                this.2.forEach(g2 -> {
                    boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                    if (bl2 || bl2) return;
                    List<1g> list = this.3.get(g2.4());
                    if (list == null) {
                        if (bl2 || bl2) return;
                        list = new ArrayList<1g>();
                        if (bl2) return;
                    }
                    if (bl2) return;
                    if (!g2.3()) {
                        if (bl2 || bl2) return;
                        return;
                    }
                    if (bl2) return;
                    list.add((1g)g2);
                    if (bl2 || bl2) return;
                    this.3.put(g2.4(), list);
                    if (!bl2 && !bl2) return;
                });
                if (bl2 || bl2) break block2;
                1A.0((boolean)((long)1709556172 ^ (long)1709556173));
                if (bl2 || bl2) break block2;
                this.3.forEach((a5, list) -> {
                    boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                    if (bl2 || bl2) return;
                    if (list.isEmpty()) {
                        if (bl2 || bl2) return;
                        return;
                    }
                    if (bl2) return;
                    bus.G();
                    if (bl2 || bl2) return;
                    1s s2 = a5.0(bit2);
                    bus.c((float)s2.1, (float)s2.0, (float)0.0f);
                    if (bl2 || bl2) return;
                    this.0 = 0.0f;
                    if (bl2 || bl2) return;
                    bus.f((int)((1Y)this.1).0, (int)((int)((long)1021741016 ^ (long)1021744344)));
                    if (bl2 || bl2) return;
                    list.forEach(g2 -> {
                        float f2;
                        block8: {
                            block6: {
                                block7: {
                                    block5: {
                                        boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                                        if (bl2 || bl2) break block5;
                                        if (g2.1().0() + 0.5f == 0.0f) break block6;
                                        if (!bl2) break block7;
                                    }
                                    return;
                                }
                                f2 = 1.0f;
                                if (\u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008) {
                                    throw null;
                                }
                                break block8;
                            }
                            f2 = 0.0f;
                        }
                        float f3 = f2;
                        f3 = a5.1().1 * this.5 * f3;
                        float f4 = a5.1().0 * this.5;
                        bus.G();
                        bus.c((float)(g2.1().0() * g2.0() + f3), (float)f4, (float)0.0f);
                        g2.0(bip2);
                        bus.H();
                        bus.c((float)0.0f, (float)(g2.2() + this.4), (float)0.0f);
                        this.0 += g2.2();
                    });
                    if (bl2 || bl2) return;
                    bus.K();
                    if (bl2 || bl2) return;
                    this.0 += this.4 * (float)(list.size() - (int)((long)-1373231805 ^ (long)-1373231806));
                    if (bl2 || bl2) return;
                    bus.c((float)0.0f, (float)(this.0 * a5.2()), (float)0.0f);
                    if (bl2 || bl2) return;
                    bus.s((int)((1Y)this.1).0);
                    if (bl2 || bl2) return;
                    bus.H();
                    if (!bl2 && !bl2) return;
                });
                if (bl2 || bl2) break block2;
                1A.0((boolean)((long)1077330544 ^ (long)1077330544));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0l() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                if (bl2 || bl2) break block2;
                this.2 = new ArrayList<1g>();
                if (bl2 || bl2) break block2;
                this.3 = new HashMap<0a5, List<1g>>();
                if (bl2 || bl2) break block2;
                this.1 = new 1p();
                if (bl2 || bl2) break block2;
                this.1.1();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(1g g2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200c\u2004\u2004\u200c\u2004\u200e\u2007\u200d\u2008;
                    if (bl2 || bl2) break block2;
                    if (this.2.contains(g2)) break block3;
                    if (bl2 || bl2) break block2;
                    this.2.add(g2);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }
}

