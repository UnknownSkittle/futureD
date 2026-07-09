/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.05;
import net.impactclient.0rB$1f;
import net.impactclient.5H;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 7T {
    public static final String b;
    public static final boolean \u200a\u200c\u2004\u2002\u2002\u2005\u200d;

    /*
     * Enabled aggressive block sorting
     */
    default public String 0() {
        StringBuilder stringBuilder;
        block5: {
            boolean bl2 = \u200a\u200c\u2004\u2002\u2002\u2005\u200d;
            if (!bl2 && !bl2) {
                stringBuilder = new StringBuilder();
                if (!bl2 && !bl2) {
                    String[] stringArray = this.2();
                    int n2 = stringArray.length;
                    if (!bl2) {
                        int n3 = (int)((long)827705011 ^ (long)827705011);
                        if (bl2) return null;
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2) break;
                                String string = stringArray[n3];
                                if (bl2 || bl2) break;
                                stringBuilder.append(string);
                                if (bl2 || bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (!\u200a\u200c\u2004\u2002\u2002\u2005\u200d) continue;
                                throw null;
                            }
                            if (!bl2) break block5;
                        }
                    }
                }
            }
            return null;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1393004903 ^ (long)1393004902);
            if (7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    7T.b = new String(v1).intern();
                    if (7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uaf6e\u86d5\u4542\ub8bc\uaf69", -1751480282).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-226383831 ^ (long)-226383831);
            v4 = (int)((long)971227147 ^ (long)971227261);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)455081055 ^ (long)455081054)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)1044120608 ^ (long)1044120615)) {
                            case 0: {
                                v11 = (int)((long)-754088515 ^ (long)-754088455);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)875215042 ^ (long)875215014);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-349725295 ^ (long)-349725273);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)1738620721 ^ (long)1738620707);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1184635499 ^ (long)-1184635468);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1993864229 ^ (long)-1993864302);
                                if (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)2080781482 ^ (long)2080781440);
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
                    } while (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!7T.\u200a\u200c\u2004\u2002\u2002\u2005\u200d)
lbl76:
            // 1 sources

            throw null;
        }
    }

    public String[] 2();

    default public String 1() {
        boolean bl2 = \u200a\u200c\u2004\u2002\u2002\u2005\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return 05.0(b).0(this.0(), 5H.0);
    }
}

