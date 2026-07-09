/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  aow
 */
package net.impactclient;

import java.util.ArrayList;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.19;
import net.impactclient.1C;
import net.impactclient.34;
import net.impactclient.3i;
import net.impactclient.5_;
import net.impactclient.6f;
import net.impactclient.7D;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@7D(0={"nuker"}, 1="Manage Nuker target blocks")
public final class 6Q
extends 6f {
    public static final boolean \u200a\u200a\u200b\u200c\u2006\u2008;
    private static final String b;

    /*
     * Enabled aggressive block sorting
     */
    public 6Q() {
        boolean bl2 = \u200a\u200a\u200b\u200c\u2006\u2008;
        if (bl2) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 6Q.\u200a\u200a\u200b\u200c\u2006\u2008;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)1579481135 ^ (long)-1579481136);
            if (6Q.\u200a\u200a\u200b\u200c\u2006\u2008) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    6Q.b = new String(v1).intern();
                    if (6Q.\u200a\u200a\u200b\u200c\u2006\u2008) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u8e42\ua789", -656430744).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)1274851351 ^ (long)1274851351);
            v4 = (int)((long)-147758616 ^ (long)-147758656);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-63865633 ^ (long)-63865634)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-1299066394 ^ (long)-1299066399)) {
                            case 0: {
                                v11 = (int)((long)-1724414264 ^ (long)-1724414239);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-961456144 ^ (long)-961456208);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-798794825 ^ (long)-798794758);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-196595586 ^ (long)-196595614);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1372577799 ^ (long)-1372577855);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)2030150876 ^ (long)2030150894);
                                if (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1700706603 ^ (long)1700706648);
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
                    } while (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!6Q.\u200a\u200a\u200b\u200c\u2006\u2008)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @19(1={"del", "delete", "rem", "remove", "-"}, 0={"block"})
    private void 0(5_ _, aow aow2) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200a\u200b\u200c\u2006\u2008;
                if (bl2 || bl2) break block2;
                0ay.3().4.3(aow2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @19(1={"list"})
    private void 0(5_ object) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200a\u200b\u200c\u2006\u2008;
                if (bl2 || bl2) break block2;
                object = 0ay.3().4;
                if (bl2 || bl2) break block2;
                3i i2 = new 3i();
                if (bl2 || bl2) break block2;
                Object object2 = object;
                ((ArrayList)object2).forEach(arg_0 -> 6Q.0((34)object2, i2, arg_0));
                if (bl2 || bl2) break block2;
                1C.0(i2.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @19(1={"add", "+"}, 0={"block"})
    private void 1(5_ _, aow aow2) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200a\u200b\u200c\u2006\u2008;
                if (bl2 || bl2) break block2;
                0ay.3().4.1(aow2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 0(34 var0, 3i i2, aow aow2) {
        String string;
        int n2;
        block11: {
            block9: {
                block10: {
                    block8: {
                        boolean bl2 = \u200a\u200a\u200b\u200c\u2006\u2008;
                        if (bl2 || bl2) break block8;
                        if (var0.indexOf(aow2) != var0.size() - (int)((long)-919738196 ^ (long)-919738195)) break block9;
                        if (!bl2) break block10;
                    }
                    return;
                }
                n2 = (int)((long)-2356191 ^ (long)-2356192);
                if (\u200a\u200a\u200b\u200c\u2006\u2008) {
                    throw null;
                }
                break block11;
            }
            n2 = (int)((long)-1657384961 ^ (long)-1657384961);
        }
        int n3 = n2;
        StringBuilder stringBuilder = new StringBuilder().append(aow2.c());
        if (n3 != 0) {
            string = 0rB$1f.XNZw("\u659c", 676676277);
            if (\u200a\u200a\u200b\u200c\u2006\u2008) {
                throw null;
            }
        } else {
            string = b;
        }
        a[] aArray = new a[(int)((long)2090587973 ^ (long)2090587972)];
        aArray[(int)((long)-880687997 ^ (long)-880687997)] = a.h;
        i2.0(stringBuilder.append(string).toString(), aArray);
    }
}

