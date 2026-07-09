/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  id
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  jt
 *  vg
 */
package net.impactclient;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.Listener;
import net.impactclient.0C;
import net.impactclient.0rB$1f;
import net.impactclient.1J;
import net.impactclient.1l;
import net.impactclient.4n;
import net.impactclient.4t;
import net.impactclient.5h;
import net.impactclient.7b;
import net.impactclient.7w;
import net.impactclient.9h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9i
extends 9h {
    private static final String a;
    public static final boolean \u200e\u200d\u200d\u200b\u2005\u2008;
    private final IntSet 0;

    public 9i(7w w2) {
        boolean bl2 = \u200e\u200d\u200d\u200b\u2005\u2008;
        super(w2, a);
        this.0 = new IntArraySet();
        Predicate[] predicateArray = new Predicate[(int)((long)687667734 ^ (long)687667735)];
        Class[] classArray = new Class[(int)((long)-1715910602 ^ (long)-1715910601)];
        classArray[(int)((long)-1422030255 ^ (long)-1422030255)] = id.class;
        predicateArray[(int)((long)1742211474 ^ (long)1742211474)] = new 4n(classArray);
        4t.1.subscribe(new Listener<1l>(l2 -> {
            boolean bl2 = \u200e\u200d\u200d\u200b\u2005\u2008;
            if (bl2 || bl2) return;
            if (l2.0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            l2 = (id)((1J)l2).0;
            if (l2.b() != 0) {
                if (bl2) return;
                if (l2.b() != (int)((long)-729517154 ^ (long)-729517155)) {
                    if (bl2 || bl2) return;
                    return;
                }
            }
            if (bl2) return;
            if ((l2 = 9i.2.f.a(l2.a())) != null) {
                if (bl2 || bl2) return;
                this.0.add(l2.S());
                if (bl2) return;
            }
            if (!bl2) return;
        }, predicateArray));
        Predicate[] predicateArray2 = new Predicate[(int)((long)-884117765 ^ (long)-884117766)];
        Class[] classArray2 = new Class[(int)((long)1180523269 ^ (long)1180523268)];
        classArray2[(int)((long)-47682021 ^ (long)-47682021)] = jt.class;
        predicateArray2[(int)((long)624455123 ^ (long)624455123)] = new 4n(classArray2);
        4t.1.subscribe(new Listener<1l>(object -> {
            boolean bl2 = \u200e\u200d\u200d\u200b\u2005\u2008;
            if (bl2) return;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return;
            if (((1l)object).0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            int[] nArray = ((jt)((1J)object).0).a();
            object = nArray;
            int n2 = nArray.length;
            if (bl2) return;
            int n3 = (int)((long)-156984402 ^ (long)-156984402);
            if (bl2) return;
            while (!bl2) {
                if (n3 < n2) {
                    if (bl2) return;
                    Object object2 = object[n3];
                    if (bl2 || bl2) return;
                    vg vg2 = 9i.2.f.a((int)object2);
                    if (vg2 != null) {
                        if (bl2 || bl2) return;
                        this.0.remove(vg2.S());
                        if (bl2) return;
                    }
                    if (bl2) return;
                    ++n3;
                    if (bl2) return;
                    if (stringArray != null) continue;
                    if (bl2) return;
                }
                if (!bl2) return;
            }
        }, predicateArray2));
        4t.1.subscribe(new Listener<0C>(c2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u200e\u200d\u200d\u200b\u2005\u2008;
                    if (bl2 || bl2) break block2;
                    this.0.clear();
                    if (!bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)-906112286 ^ (long)-906112286)]));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final int 0(aed aed2) {
        boolean bl2 = \u200e\u200d\u200d\u200b\u2005\u2008;
        if (bl2 || bl2) return -538278807;
        if (this.0.contains(aed2.S())) {
            if (bl2) return -538278807;
            return 5h.b;
        }
        if (!bl2) return 5h.a;
        return -538278807;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9i.\u200e\u200d\u200d\u200b\u2005\u2008;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-217193671 ^ (long)217193670);
            if (9i.\u200e\u200d\u200d\u200b\u2005\u2008) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9i.a = new String(v1).intern();
                    if (9i.\u200e\u200d\u200d\u200b\u2005\u2008) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\ufb55\ud2da\u1139", -1087447956).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)1238504467 ^ (long)1238504467);
            v4 = (int)((long)-1301698920 ^ (long)-1301698825);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)450609455 ^ (long)450609454)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)889745846 ^ (long)889745841)) {
                            case 0: {
                                v11 = (int)((long)32625587 ^ (long)32625624);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1085816290 ^ (long)-1085816273);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1260799913 ^ (long)1260799925);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-1392889799 ^ (long)-1392889834);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1892277163 ^ (long)-1892277144);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1919302472 ^ (long)-1919302512);
                                if (!9i.\u200e\u200d\u200d\u200b\u2005\u2008) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-701161190 ^ (long)-701161198);
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
                    } while (!9i.\u200e\u200d\u200d\u200b\u2005\u2008);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9i.\u200e\u200d\u200d\u200b\u2005\u2008)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

