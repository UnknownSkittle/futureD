/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 *  fh
 */
package net.impactclient;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Objects;
import java.util.stream.Collectors;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.6r;
import net.impactclient.7Q;
import net.impactclient.8g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 58
implements 6r {
    public static final boolean \u2009\u2004\u2008\u200d\u2006\u2007;
    private static final String a;
    private final Path 0;
    private /* synthetic */ 8g 1;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 58.\u2009\u2004\u2008\u200d\u2006\u2007;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1994925033 ^ (long)1994925032);
            if (58.\u2009\u2004\u2008\u200d\u2006\u2007) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    58.a = new String(v1).intern();
                    if (58.\u2009\u2004\u2008\u200d\u2006\u2007) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uaebd\u86a0\u4554\ub8e6\uae9f\u8691\u4504\ub8a2\uaecb", -780760991).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)1250558670 ^ (long)1250558670);
            v4 = (int)((long)-250862306 ^ (long)-250862290);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)1290365059 ^ (long)1290365058)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)458765727 ^ (long)458765720)) {
                            case 0: {
                                v11 = (int)((long)-2141429423 ^ (long)-2141429481);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1014466285 ^ (long)-1014466271);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)738255683 ^ (long)738255686);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-677684968 ^ (long)-677684961);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)1572261290 ^ (long)1572261343);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)1408950390 ^ (long)1408950321);
                                if (!58.\u2009\u2004\u2008\u200d\u2006\u2007) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1494175328 ^ (long)1494175283);
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
                    } while (!58.\u2009\u2004\u2008\u200d\u2006\u2007);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!58.\u2009\u2004\u2008\u200d\u2006\u2007)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private 58(8g g2) {
        block3: {
            block2: {
                boolean bl2 = \u2009\u2004\u2008\u200d\u2006\u2007;
                this.1 = g2;
                if (bl2 || bl2) break block2;
                0ay.3();
                this.0 = 0ay.0(a);
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        boolean bl2 = \u2009\u2004\u2008\u200d\u2006\u2007;
        if (bl2 || bl2) return;
        if (!Files.exists(this.0, new LinkOption[(int)((long)294138443 ^ (long)294138443)])) {
            if (bl2 || bl2) return;
            7Q.0(this.0);
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        7Q.1((Path)this.0).1.stream().map(ain::b).filter(Objects::nonNull).forEach(8g.0(this.1)::add);
        if (!bl2 && !bl2) return;
    }

    /* synthetic */ 58(8g g2, byte by2) {
        boolean bl2 = \u2009\u2004\u2008\u200d\u2006\u2007;
        this(g2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2009\u2004\u2008\u200d\u2006\u2007;
                if (bl2 || bl2) break block2;
                7Q.0(8g.0(this.1).stream().map(arg_0 -> ((fh)ain.g).b(arg_0)).filter(Objects::nonNull).map(Object::toString).collect(Collectors.toList()), this.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

