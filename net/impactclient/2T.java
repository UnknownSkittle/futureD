/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.43;
import net.impactclient.7b;
import net.impactclient.7v;
import net.impactclient.9s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 2T
implements Listenable {
    public static final boolean \u2005\u200a\u2005\u2000\u2006;
    @EventHandler
    private final Listener<7v> 0;
    private /* synthetic */ 9s 1;
    @EventHandler
    private final Listener<43> 3;
    private float 2;

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void 0(43 var1_1) {
        block17: {
            block14: {
                block16: {
                    block15: {
                        block13: {
                            var3_3 = 2T.\u2005\u200a\u2005\u2000\u2006;
                            if (var3_3) lbl-1000:
                            // 6 sources

                            {
                                return;
                            }
                            var2_4 = 7b.0();
                            if (var3_3 || var3_3) ** GOTO lbl-1000
                            if (var1_1.0 == EventState.PRE) break block13;
                            if (var3_3 || var3_3) ** GOTO lbl-1000
                            return;
                        }
                        if (var3_3) ** GOTO lbl-1000
                        if (!this.1.4()) ** GOTO lbl-1000
                        if (var3_3) ** GOTO lbl-1000
                        if (9s.0((9s)this.1).0) {
                            if (!var3_3) ** break;
                            ** continue;
                            v0 = (int)((long)676558952 ^ (long)676558953);
                            if (2T.\u2005\u200a\u2005\u2000\u2006) {
                                throw null;
                            }
                        } else lbl-1000:
                        // 2 sources

                        {
                            v0 = var1_2 = (int)((long)364792017 ^ (long)364792017);
                        }
                        if (!9s.3((9s)this.1).0) break block14;
                        if (var1_2 == 0) break block15;
                        9s.2(this.1).forward();
                        if (var2_4 != null) break block16;
                    }
                    9s.2(this.1).reverse();
                }
                v1 = this;
                v2 = v1;
                v3 = (float)9s.2(v1.1).get() * (9s.1((9s)this.1).2 - 0T.2.t.aE) + 0T.2.t.aE;
                if (2T.\u2005\u200a\u2005\u2000\u2006) {
                    throw null;
                }
                break block17;
            }
            v2 = this;
            if (var1_2 != 0) {
                v3 = 9s.1((9s)this.1).2;
                if (2T.\u2005\u200a\u2005\u2000\u2006) {
                    throw null;
                }
            } else {
                v3 = 0T.2.t.aE;
            }
        }
        v2.2 = v3;
    }

    /*
     * Enabled aggressive block sorting
     */
    2T(9s s2) {
        block3: {
            block2: {
                boolean bl2 = \u2005\u200a\u2005\u2000\u2006;
                this.1 = s2;
                if (bl2 || bl2) break block2;
                this.2 = 0T.2.t.aE;
                if (bl2 || bl2) break block2;
                this.0 = new Listener<7v>(v2 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2005\u200a\u2005\u2000\u2006;
                            if (bl2 || bl2) break block2;
                            v2.0 = this.2;
                            if (!bl2 && !bl2) break block3;
                        }
                        return;
                    }
                }, new Predicate[(int)((long)-2120611019 ^ (long)-2120611019)]);
                if (bl2 || bl2) break block2;
                this.3 = new Listener<43>(this::0, new Predicate[(int)((long)-1584536352 ^ (long)-1584536352)]);
                if (!bl2) break block3;
            }
            return;
        }
    }
}

