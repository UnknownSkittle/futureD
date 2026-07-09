/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import net.impactclient.0rB$1f;
import net.impactclient.23;
import net.impactclient.8;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0G {
    public 8 1;
    public static final boolean \u200a;
    public final List<8> 2;
    private static final String a;
    public static final 0G 0;

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block13: {
                block15: {
                    var1 = 0G.\u200a;
                    if (!var1) break block15;
                    break block16;
                }
                v0 = (int)((long)-1301762866 ^ (long)1301762865);
                if (0G.\u200a) {
                    throw null;
lbl8:
                    // 1 sources

                    while (true) {
                        0G.a = new String(v1).intern();
                        if (0G.\u200a) {
                            throw null;
                        }
                        break block13;
                        break;
                    }
                }
                v2 = 0rB$1f.XNZw("\u6b8f\u4368", -1425912409).toCharArray();
                v3 = v2.length;
                var0_1 = (int)((long)-1124238561 ^ (long)-1124238561);
                v4 = (int)((long)1995584848 ^ (long)1995584887);
                v5 = v2;
                v6 = v3;
                if (v3 > (int)((long)-1239164062 ^ (long)-1239164061)) ** GOTO lbl68
                do {
                    block14: {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var0_1;
                        do {
                            switch (var0_1 % (int)((long)1314762024 ^ (long)1314762031)) {
                                case 0: {
                                    v11 = (int)((long)593901935 ^ (long)593901898);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                case 1: {
                                    v11 = (int)((long)-1131144291 ^ (long)-1131144264);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                case 2: {
                                    v11 = (int)((long)24240004 ^ (long)24240055);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                case 3: {
                                    v11 = (int)((long)170269916 ^ (long)170269911);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                case 4: {
                                    v11 = (int)((long)896529874 ^ (long)896529878);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                case 5: {
                                    v11 = (int)((long)1192684482 ^ (long)1192684424);
                                    if (!0G.\u200a) break;
                                    throw null;
                                }
                                default: {
                                    v11 = (int)((long)1765749033 ^ (long)1765749064);
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
                        } while (!0G.\u200a);
                        throw null;
                    }
                    v1 = v5;
                    v6 = v6;
                } while (v6 > var0_1);
                ** while (!0G.\u200a)
lbl76:
                // 1 sources

                throw null;
            }
            0G.0 = new 0G();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean 0(8 var1_1) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) return true;
        if (var1_1.1) {
            if (bl2 || bl2) return true;
            return (int)((long)-376058110 ^ (long)-376058110) != 0;
        }
        try {
            if (bl2) return true;
            var1_1.3();
            if (bl2 || bl2) return true;
            this.2.add(var1_1);
            if (bl2 || bl2) return true;
            return (int)((long)-1200213932 ^ (long)-1200213931) != 0;
        } catch (NullPointerException nullPointerException) {
            if (bl2 || bl2) return true;
            return (int)((long)-1066658497 ^ (long)-1066658497) != 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 0(String object) {
        boolean bl2;
        block10: {
            block9: {
                bl2 = \u200a;
                if (bl2 || bl2) return true;
                if (object == null) break block9;
                if (bl2) return true;
                if ((object = this.1((String)object)) != null) break block10;
                if (bl2) return true;
            }
            if (bl2) return true;
            return (int)((long)793893607 ^ (long)793893607) != 0;
        }
        if (bl2) return true;
        if (!((8)object).1) {
            if (bl2 || bl2) return true;
            ((8)object).0();
            if (bl2) return true;
        }
        if (bl2) return true;
        this.1 = object;
        if (!bl2 && !bl2) return (int)((long)989545508 ^ (long)989545509) != 0;
        return true;
    }

    private 8 1(String string) {
        boolean bl2 = \u200a;
        if (bl2 || bl2) {
            return null;
        }
        return this.2.stream().filter(var1_1 -> {
            boolean bl2 = \u200a;
            if (bl2 || bl2) {
                return true;
            }
            return string.equals(23.0(var1_1, a));
        }).findFirst().orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private 0G() {
        block3: {
            block2: {
                boolean bl2 = \u200a;
                if (bl2 || bl2) break block2;
                this.2 = new ArrayList<8>();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

