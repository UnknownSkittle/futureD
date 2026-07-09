/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0n;
import net.impactclient.0rB$1f;
import net.impactclient.4b;
import net.impactclient.57;
import net.impactclient.7Q;
import net.impactclient.7b;
import net.impactclient.7c;
import net.impactclient.8S;
import net.impactclient.9m;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0r5
extends 9m<8S> {
    private int 5;
    private double 1;
    @EventHandler
    private final Listener<4b> 4;
    private double 3;
    private static final String a;
    public static final boolean \u200c\u200f\u2008;
    @EventHandler
    private final Listener<7c> 0;

    public 0r5(8S s2) {
        boolean bl2 = \u200c\u200f\u2008;
        super(s2, a, null);
        this.0 = new Listener<7c>(c2 -> {
            boolean bl2;
            block8: {
                block7: {
                    bl2 = \u200c\u200f\u2008;
                    if (bl2 || bl2) return;
                    if (0r5.2.h == null) break block7;
                    if (bl2) return;
                    if (c2.0 == EventState.PRE) break block8;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            this.1 = 57.0();
            if (!bl2 && !bl2) return;
        }, new Predicate[(int)((long)1814893697 ^ (long)1814893697)]);
        this.4 = new Listener<4b>(b2 -> {
            boolean bl2;
            block19: {
                String[] stringArray;
                block18: {
                    bl2 = \u200c\u200f\u2008;
                    if (bl2) return;
                    stringArray = 7b.0();
                    if (bl2 || bl2) return;
                    if (0r5.2.h.L > 1.0f) {
                        if (bl2 || bl2) return;
                        return;
                    }
                    if (bl2) return;
                    if (0r5.2.h.bg != 0.0f) break block18;
                    if (bl2) return;
                    if (0r5.2.h.be == 0.0f) break block19;
                    if (bl2) return;
                }
                if (bl2) return;
                double[] dArray = new double[(int)((long)131624070 ^ (long)131624066)];
                dArray[(int)((long)-894107663 ^ (long)-894107663)] = 0.943;
                dArray[(int)((long)-2099103110 ^ (long)-2099103109)] = 0.443;
                dArray[(int)((long)-724355990 ^ (long)-724355992)] = 0.005;
                dArray[(int)((long)-1897598125 ^ (long)-1897598128)] = 0.88;
                double[] dArray2 = dArray;
                if (bl2 || bl2) return;
                if (!0r5.2.h.A) {
                    if (bl2) return;
                    if (ArrayUtils.contains(dArray2, 7Q.0(0r5.2.h.q - (double)((int)0r5.2.h.q), (int)((long)493020773 ^ (long)493020774)))) {
                        if (bl2 || bl2) return;
                        0r5.2.h.t = -0.2;
                        if (bl2 || bl2) return;
                        b2.2 = -0.2;
                        if (bl2) return;
                    }
                }
                if (bl2) return;
                switch (this.5) {
                    case 1: {
                        if (bl2) return;
                        this.5 = (int)((long)-650553159 ^ (long)-650553157);
                        if (bl2 || bl2) return;
                        this.3 = 2.149 * 57.0(0n.b) - 0.01;
                        if (bl2 || bl2) return;
                        if (stringArray != null) break;
                        if (bl2) return;
                    }
                    case 2: {
                        if (bl2) return;
                        if (!0r5.2.h.z) break;
                        if (bl2 || bl2) return;
                        this.5 = (int)((long)1253740988 ^ (long)1253740991);
                        if (bl2 || bl2) return;
                        0r5.2.h.t = 0.4;
                        if (bl2 || bl2) return;
                        b2.2 = 0.4;
                        if (bl2 || bl2) return;
                        this.3 *= 2.149;
                        if (bl2) return;
                        if (stringArray != null) break;
                        if (bl2) return;
                    }
                    case 3: {
                        if (bl2) return;
                        this.5 = (int)((long)-1431455443 ^ (long)-1431455447);
                        if (bl2 || bl2) return;
                        this.3 = this.1 - 0.66 * (this.1 - 57.0(0n.b));
                        if (bl2 || bl2) return;
                        if (stringArray != null) break;
                        if (bl2) return;
                    }
                    case 4: {
                        if (bl2) return;
                        if (0r5.2.f.a((vg)0r5.2.h, 0r5.2.h.bw().d(0.0, 0r5.2.h.t, 0.0)).size() > 0) {
                            if (bl2 || bl2) return;
                            this.5 = (int)((long)449390008 ^ (long)449390009);
                            if (bl2) return;
                        }
                        if (bl2) return;
                        this.3 = this.1 - this.1 / 159.0;
                        if (bl2) return;
                        break;
                    }
                }
            }
            if (bl2) return;
            57.0(b2, Math.max(this.3, 57.0(0n.b)));
            if (!bl2 && !bl2) return;
        }, new Predicate[(int)((long)-560307190 ^ (long)-560307190)]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 2() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u200f\u2008;
                if (bl2 || bl2) break block2;
                this.5 = (int)((long)2025092093 ^ (long)2025092092);
                if (bl2 || bl2) break block2;
                this.3 = 57.1(0n.b);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0r5.\u200c\u200f\u2008;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-253209847 ^ (long)253209846);
            if (0r5.\u200c\u200f\u2008) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0r5.a = new String(v1).intern();
                    if (0r5.\u200c\u200f\u2008) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\ua588\u0cf2\ucf0d\u32d9", 887751184).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-98593186 ^ (long)-98593186);
            v4 = (int)((long)-1681124049 ^ (long)-1681124066);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)1752668155 ^ (long)1752668154)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-1584170202 ^ (long)-1584170207)) {
                            case 0: {
                                v11 = (int)((long)164965074 ^ (long)164965034);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1085196490 ^ (long)-1085196508);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-1768081114 ^ (long)-1768081152);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-2109927702 ^ (long)-2109927759);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)1752508318 ^ (long)1752508314);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1426264294 ^ (long)-1426264302);
                                if (!0r5.\u200c\u200f\u2008) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-2033558557 ^ (long)-2033558638);
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
                    } while (!0r5.\u200c\u200f\u2008);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0r5.\u200c\u200f\u2008)
lbl76:
            // 1 sources

            throw null;
        }
    }
}

