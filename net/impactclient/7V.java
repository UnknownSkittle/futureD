/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0rB$1f;
import net.impactclient.4t;
import net.impactclient.7c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 7V
extends Enum<7V>
implements 0T {
    public static final boolean \u200b;
    private boolean 1;
    public boolean e;
    public boolean d;
    public boolean b;
    private static final /* synthetic */ 7V[] 0;
    public boolean c;
    public static final /* enum */ 7V a;

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var2 = 7V.\u200b;
                    if (!var2) break block15;
                    break block16;
                }
                v0 = (int)((long)1757137874 ^ (long)-1757137875);
                if (7V.\u200b) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        var0_1 = new String(v1).intern();
                        if (7V.\u200b) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\ue35d\ucaf3\u091d\uf491\ue366\uca90\u093c\uf4a9", 1541129221).toCharArray();
                v3 = v2.length;
                var1_2 = (int)((long)1751441520 ^ (long)1751441520);
                v4 = (int)((long)89303912 ^ (long)89303873);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-1287458204 ^ (long)-1287458203)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var1_2;
                        do {
                            switch (var1_2 % (int)((long)-1205101959 ^ (long)-1205101954)) {
                                case 0: {
                                    v11 = (int)((long)1977385776 ^ (long)1977385763);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-2115211788 ^ (long)-2115211828);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)1701374153 ^ (long)1701374158);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)945372656 ^ (long)945372618);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)-728105866 ^ (long)-728105898);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)-474736449 ^ (long)-474736412);
                                    if (!7V.\u200b) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)-329456769 ^ (long)-329456823);
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
                        } while (!7V.\u200b);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var1_2);
                ** while (!7V.\u200b)
lbl76:
                // 1 sources

                throw null;
            }
            7V.a = new 7V(var0_1);
            v12 = new 7V[(int)((long)-1545918772 ^ (long)-1545918771)];
            v12[(int)((long)-210862991 ^ (long)-210862991)] = 7V.a;
            7V.0 = v12;
        }
    }

    public static 7V valueOf(String string) {
        boolean bl2 = \u200b;
        if (bl2 || bl2) {
            return null;
        }
        return Enum.valueOf(7V.class, string);
    }

    private 7V() {
        n2 = \u200b ? 1 : 0;
        Predicate[] predicateArray = new Predicate[(int)((long)891151732 ^ (long)891151733)];
        predicateArray[(int)((long)-1714035279 ^ (long)-1714035279)] = c2 -> {
            boolean bl2 = \u200b;
            if (bl2 || bl2) return true;
            if (c2.0 == EventState.PRE) {
                if (bl2) return true;
                return (int)((long)11108943 ^ (long)11108942) != 0;
            }
            if (!bl2) return (int)((long)1559583678 ^ (long)1559583678) != 0;
            return true;
        };
        4t.1.subscribe(new Listener<7c>(c2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    boolean bl3;
                    block3: {
                        bl3 = \u200b;
                        if (bl3 || bl3) break block2;
                        bl2 = 7V.2.t.ah.e();
                        if (!bl2) break block3;
                        if (bl3) break block2;
                        if (this.1) break block3;
                        if (bl3 || bl3) break block2;
                        this.b ^= (int)((long)-529811218 ^ (long)-529811217);
                        if (bl3) break block2;
                    }
                    if (bl3) break block2;
                    this.1 = bl2;
                    if (!bl3 && !bl3) break block4;
                }
                return;
            }
        }, predicateArray));
    }

    public static 7V[] values() {
        boolean bl2 = \u200b;
        if (bl2 || bl2) {
            return null;
        }
        return (7V[])0.clone();
    }
}

