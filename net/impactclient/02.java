/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.3F;
import net.impactclient.3m;
import pw.knx.feather.structures.Color;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 02
extends Enum<02>
implements Listenable {
    public static final /* enum */ 02 a;
    private static final /* synthetic */ 02[] 2;
    private final Map<3F, Boolean> 1;
    public static final boolean \u200c\u200d\u2006\u2000\u2003;
    @EventHandler
    private Listener<3m> 0;

    public static 02 valueOf(String string) {
        boolean bl2 = \u200c\u200d\u2006\u2000\u2003;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(02.class, string);
    }

    public final boolean 1(3F f3) {
        boolean bl2 = \u200c\u200d\u2006\u2000\u2003;
        if (bl2 || bl2) {
            return true;
        }
        return this.1.computeIfAbsent(f3, f2 -> {
            boolean bl2 = \u200c\u200d\u2006\u2000\u2003;
            if (bl2 || bl2) {
                return null;
            }
            return Boolean.FALSE;
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 02.\u200c\u200d\u2006\u2000\u2003;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)1304785310 ^ (long)-1304785311);
                if (02.\u200c\u200d\u2006\u2000\u2003) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (02.\u200c\u200d\u2006\u2000\u2003) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u0930\u21c1\ue276\u1ff7\u097b\u21e9\ue272\u1fc1", -1328337044).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)-1484898342 ^ (long)-1484898342);
                v4 = (int)((long)1195034973 ^ (long)1195034933);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-1932284434 ^ (long)-1932284433)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)-2025406361 ^ (long)-2025406368)) {
                                case 0: {
                                    v11 = (int)((long)-1538753966 ^ (long)-1538754047);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)1491528427 ^ (long)1491528393);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)-692025965 ^ (long)-692025897);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)198703148 ^ (long)198703192);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)403755776 ^ (long)403755792);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-1411923096 ^ (long)-1411923102);
                                    if (!02.\u200c\u200d\u2006\u2000\u2003) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-632253933 ^ (long)-632253885);
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
                        } while (!02.\u200c\u200d\u2006\u2000\u2003);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!02.\u200c\u200d\u2006\u2000\u2003)
lbl76:
                // 1 sources

                throw null;
            }
            02.a = new 02(var0_1);
            v12 = new 02[(int)((long)430958618 ^ (long)430958619)];
            v12[(int)((long)-876696461 ^ (long)-876696461)] = 02.a;
            02.2 = v12;
        }
    }

    private 02() {
        n2 = \u200c\u200d\u2006\u2000\u2003 ? 1 : 0;
        this.1 = new HashMap<3F, Boolean>();
        Predicate[] predicateArray = new Predicate[(int)((long)-1973541378 ^ (long)-1973541377)];
        predicateArray[(int)((long)-639350564 ^ (long)-639350564)] = m2 -> {
            boolean bl2 = \u200c\u200d\u2006\u2000\u2003;
            if (bl2 || bl2) return true;
            if (m2.0 == EventState.PRE) {
                if (bl2) return true;
                return (int)((long)1253920783 ^ (long)1253920782) != 0;
            }
            if (!bl2) return (int)((long)1152929555 ^ (long)1152929555) != 0;
            return true;
        };
        this.0 = new Listener<3m>(m2 -> {
            block3: {
                block2: {
                    boolean bl3 = \u200c\u200d\u2006\u2000\u2003;
                    if (bl3 || bl3) break block2;
                    this.1.forEach((f2, bl2) -> {
                        block4: {
                            block2: {
                                boolean bl3;
                                block3: {
                                    bl3 = \u200c\u200d\u2006\u2000\u2003;
                                    if (bl3 || bl3) break block2;
                                    if (!bl2.booleanValue()) break block3;
                                    if (bl3 || bl3) break block2;
                                    3F f3 = f2;
                                    f3.0(((Color)f3.1()).hsb((float)(System.nanoTime() / (0xB3EBC5345B2D9FA5L ^ 0xB3EBC5345B22DDE5L) % (0xFAAD06C710DBC25EL ^ 0xFAAD06C710DBC1B6L)) / 1000.0f, 1.0f, 1.0f));
                                    if (bl3) break block2;
                                }
                                if (!bl3) break block4;
                            }
                            return;
                        }
                    });
                    if (!bl3) break block3;
                }
                return;
            }
        }, predicateArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(3F f2, boolean bl2) {
        block3: {
            block2: {
                boolean bl3 = \u200c\u200d\u2006\u2000\u2003;
                if (bl3 || bl3) break block2;
                this.1.put(f2, bl2);
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }

    public static 02[] values() {
        boolean bl2 = \u200c\u200d\u2006\u2000\u2003;
        if (bl2 || bl2) {
            return null;
        }
        return (02[])2.clone();
    }
}

