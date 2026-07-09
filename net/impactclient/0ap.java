/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ko
 */
package net.impactclient;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0C;
import net.impactclient.0T;
import net.impactclient.0aa;
import net.impactclient.0rB$1f;
import net.impactclient.1l;
import net.impactclient.2D;
import net.impactclient.4n;
import net.impactclient.7Q;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0ap
extends Enum<0ap>
implements Listenable,
0T {
    private final 2D 5;
    @EventHandler
    private final Listener<0C> 2;
    private final 0aa 1;
    public static final boolean \u200b\u2004\u2001\u2005\u2002\u2004;
    private static final /* synthetic */ 0ap[] 4;
    private final Queue<Float> 3;
    public float b;
    @EventHandler
    private final Listener<1l> 0;
    public static final /* enum */ 0ap a;

    private 0ap() {
        n2 = \u200b\u2004\u2001\u2005\u2002\u2004 ? 1 : 0;
        this.3 = new ArrayDeque<Float>((int)((long)-960814610 ^ (long)-960814598));
        this.1 = new 0aa();
        this.5 = 2D.0(this.1::0);
        Predicate[] predicateArray = new Predicate[(int)((long)331622902 ^ (long)331622900)];
        Class[] classArray = new Class[(int)((long)1712792934 ^ (long)1712792935)];
        classArray[(int)((long)-175646667 ^ (long)-175646667)] = ko.class;
        predicateArray[(int)((long)1121191715 ^ (long)1121191715)] = new 4n(classArray);
        predicateArray[(int)((long)1838640025 ^ (long)1838640024)] = l2 -> {
            boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
            if (bl2 || bl2) return true;
            if (l2.0 == EventState.PRE) {
                if (bl2) return true;
                return (int)((long)-436221600 ^ (long)-436221599) != 0;
            }
            if (!bl2) return (int)((long)1960537490 ^ (long)1960537490) != 0;
            return true;
        };
        this.0 = new Listener<1l>(l2 -> {
            boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
            if (bl2) return;
            String[] stringArray = 7b.0();
            if (bl2 || bl2) return;
            if (this.5.0()) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            float f3 = 20.0f * (1000.0f / (float)this.1.1());
            if (bl2 || bl2) return;
            this.3.add(7Q.0(Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(20.0f)));
            if (bl2) return;
            while (!bl2) {
                if (this.3.size() > (int)((long)1489955761 ^ (long)1489955749)) {
                    if (bl2 || bl2) return;
                    this.3.poll();
                    if (bl2) return;
                    if (stringArray != null) {
                        if (bl2) return;
                        if (stringArray != null) continue;
                        if (bl2) return;
                    }
                } else {
                    if (bl2) return;
                    this.b = (float)this.3.stream().mapToDouble(f2 -> {
                        boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
                        if (bl2 || bl2) {
                            return 0.0;
                        }
                        return f2.floatValue();
                    }).average().orElse(20.0);
                    if (bl2 || bl2) return;
                    this.1.0();
                    if (bl2) return;
                }
                if (!bl2) return;
            }
        }, predicateArray);
        this.2 = new Listener<0C>(c2 -> {
            block3: {
                block2: {
                    boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
                    if (bl2 || bl2) break block2;
                    this.3.clear();
                    if (!bl2) break block3;
                }
                return;
            }
        }, new Predicate[(int)((long)675596071 ^ (long)675596071)]);
    }

    public static 0ap[] values() {
        boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return (0ap[])4.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 0ap.\u200b\u2004\u2001\u2005\u2002\u2004;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)-1198881221 ^ (long)1198881220);
                if (0ap.\u200b\u2004\u2001\u2005\u2002\u2004) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (0ap.\u200b\u2004\u2001\u2005\u2002\u2004) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u5890\uf3e9\u305c\ucd8d\u58a4\uf3ec\u3020\ucdfc", -995492588).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)-624445336 ^ (long)-624445336);
                v4 = (int)((long)-2092971470 ^ (long)-2092971434);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-2053444124 ^ (long)-2053444123)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)656822798 ^ (long)656822793)) {
                                case 0: {
                                    v11 = (int)((long)-1309545615 ^ (long)-1309545621);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-1042057556 ^ (long)-1042057518);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-952881120 ^ (long)-952881094);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)2038788821 ^ (long)2038788783);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)1521634281 ^ (long)1521634255);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)1781556121 ^ (long)1781556194);
                                    if (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-1109654505 ^ (long)-1109654431);
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
                        } while (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!0ap.\u200b\u2004\u2001\u2005\u2002\u2004)
lbl76:
                // 1 sources

                throw null;
            }
            0ap.a = new 0ap(var0_1);
            v12 = new 0ap[(int)((long)-1143624699 ^ (long)-1143624700)];
            v12[(int)((long)-533426332 ^ (long)-533426332)] = 0ap.a;
            0ap.4 = v12;
        }
    }

    public static 0ap valueOf(String string) {
        boolean bl2 = \u200b\u2004\u2001\u2005\u2002\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(0ap.class, string);
    }
}

