/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bkn
 *  blk
 */
package net.impactclient;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0A;
import net.impactclient.0S;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0q;
import net.impactclient.0rB$1f;
import net.impactclient.0s;
import net.impactclient.1i;
import net.impactclient.3j;
import net.impactclient.3k;
import net.impactclient.4t;
import net.impactclient.5_;
import net.impactclient.6f;
import net.impactclient.7i;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 4K
implements Listenable,
0T {
    private final List<0s> 4;
    public static final boolean \u200f\u2003;
    private static final String a;
    @EventHandler
    private final Listener<3k> 0;
    public final 3j<6f> 5;
    private 7i 3;
    public String 6;
    private final List<1i<?>> 7;
    public boolean 1;

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(0s s2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200f\u2003;
                    if (bl2 || bl2) break block2;
                    if (this.4.contains(s2)) break block3;
                    if (bl2 || bl2) break block2;
                    this.4.add(s2);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    private static /* synthetic */ boolean 0(0A a2, 0s s2) {
        boolean bl2 = \u200f\u2003;
        if (bl2 || bl2) {
            return true;
        }
        return s2.0(a2.getClass());
    }

    public final 1i 0(Type type) {
        boolean bl2 = \u200f\u2003;
        if (bl2 || bl2) {
            return null;
        }
        return this.7.stream().filter(i2 -> {
            boolean bl2 = \u200f\u2003;
            if (bl2 || bl2) {
                return true;
            }
            return i2.0(type);
        }).findFirst().orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public 4K(3j<6f> j2) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2003;
                if (bl2 || bl2) break block2;
                this.4 = new ArrayList<0s>();
                if (bl2 || bl2) break block2;
                this.7 = new ArrayList();
                if (bl2 || bl2) break block2;
                this.3 = 7i.0;
                if (bl2 || bl2) break block2;
                this.6 = 0rB$1f.XNZw("\uf045", 292607656);
                if (bl2 || bl2) break block2;
                this.1 = (int)((long)1005672694 ^ (long)1005672694);
                if (bl2 || bl2) break block2;
                this.0 = new Listener<3k>(k2 -> {
                    boolean bl2;
                    block13: {
                        block12: {
                            bl2 = \u200f\u2003;
                            if (bl2 || bl2) return;
                            if (!this.1) break block12;
                            if (bl2) return;
                            if (this.6 == null) break block12;
                            if (bl2) return;
                            if (4K.2.f != null) break block13;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    if (!0ay.3().0b.0(a, (boolean)((long)-186491247 ^ (long)-186491248))) {
                        if (bl2 || bl2) return;
                        return;
                    }
                    if (bl2) return;
                    if (this.6.length() == (int)((long)-1538112452 ^ (long)-1538112451)) {
                        if (bl2) return;
                        if (this.6.charAt((int)((long)-1742212043 ^ (long)-1742212043)) == k2.1) {
                            if (bl2 || bl2) return;
                            2.a((blk)new bkn(this.6));
                            if (bl2) return;
                        }
                    }
                    if (!bl2) return;
                }, new Predicate[(int)((long)311728877 ^ (long)311728877)]);
                if (bl2 || bl2) break block2;
                this.5 = j2;
                if (bl2 || bl2) break block2;
                4t.1.subscribe(this);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(1i<?> i2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200f\u2003;
                    if (bl2 || bl2) break block2;
                    if (this.7.contains(i2)) break block3;
                    if (bl2 || bl2) break block2;
                    this.7.add(i2);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 0(6f list, 5_ object, String[] stringArray) {
        boolean bl2 = \u200f\u2003;
        if (bl2) return;
        try {
            if (bl2) return;
            if (list != null) {
                if (bl2 || bl2) return;
                0q q2 = new 0q((6f)((Object)list), (5_)object, stringArray);
                if (bl2 || bl2) return;
                4t.1.post(q2);
                if (bl2 || bl2) return;
                if (!q2.isCancelled()) {
                    if (bl2 || bl2) return;
                    this.3.0((6f)((Object)list), (5_)object, stringArray);
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
        } catch (0A a2) {
            if (bl2 || bl2) return;
            object = a2;
            list = this.4.stream().filter(arg_0 -> 4K.0((0A)object, arg_0)).collect(Collectors.toList());
            if (list.isEmpty()) {
                if (bl2 || bl2) return;
                a2.printStackTrace();
                if (bl2 || bl2) return;
                return;
            } else {
                if (bl2) return;
                list.forEach(s2 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u200f\u2003;
                            if (bl2 || bl2) break block2;
                            s2.0(a2);
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (bl2 || bl2) return;
                return;
            }
        }
        {
            if (bl2) return;
            throw new 0S();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 4K.\u200f\u2003;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)393234022 ^ (long)-393234023);
            if (4K.\u200f\u2003) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    4K.a = new String(v1).intern();
                    if (4K.\u200f\u2003) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uf27b\uda79\u19a3\ue478\uf203\uda02\u19a7\ue474\uf211\uda6f\u19c6\ue409\uf24f\uda57\u19c5\ue410\uf214", 538170601).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)1051854553 ^ (long)1051854553);
            v4 = (int)((long)-612542041 ^ (long)-612542066);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)881440391 ^ (long)881440390)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-1400019731 ^ (long)-1400019734)) {
                            case 0: {
                                v11 = (int)((long)1041179211 ^ (long)1041179203);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)1288381749 ^ (long)1288381783);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1540957449 ^ (long)1540957546);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)787944323 ^ (long)787944334);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-453071525 ^ (long)-453071566);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)681574911 ^ (long)681574892);
                                if (!4K.\u200f\u2003) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)129117389 ^ (long)129117328);
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
                    } while (!4K.\u200f\u2003);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!4K.\u200f\u2003)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

