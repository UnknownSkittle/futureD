/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vp
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import net.impactclient.0aa;
import net.impactclient.0rB$1f;
import net.impactclient.38;
import net.impactclient.3T;
import net.impactclient.4Z;
import net.impactclient.7Q;
import net.impactclient.7S;
import net.impactclient.9b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9R
extends 9b {
    private float 2;
    private 0aa 0;
    private static final String c;
    public static final boolean \u2004;
    private List<vp> 1;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 9R.\u2004;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1961496491 ^ (long)1961496490);
            if (9R.\u2004) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    9R.c = new String(v1).intern();
                    if (9R.\u2004) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u4351\u6aaf\ua948\u54b2\u4379", 821912632).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-2045435446 ^ (long)-2045435446);
            v4 = (int)((long)-1394586796 ^ (long)-1394586815);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)2002258415 ^ (long)2002258414)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)1941482051 ^ (long)1941482052)) {
                            case 0: {
                                v11 = (int)((long)-589492394 ^ (long)-589492478);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-2096384565 ^ (long)-2096384619);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)2093338815 ^ (long)2093338835);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-740435898 ^ (long)-740435842);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1761292016 ^ (long)-1761291960);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)1730451854 ^ (long)1730451896);
                                if (!9R.\u2004) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)1596157542 ^ (long)1596157519);
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
                    } while (!9R.\u2004);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!9R.\u2004)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(4Z z2) {
        int n2;
        block8: {
            block7: {
                boolean bl2 = \u2004;
                if (bl2 || bl2) break block7;
                38[] nullArray = new 38[(int)((long)-828914986 ^ (long)-828914985)];
                nullArray[(int)((long)288962188 ^ (long)288962188)] = ((7S)this.5).0c;
                this.1 = ((7S)this.5).0(3T.0(((7S)this.5).9.2, ((7S)this.5).0g.2, nullArray).1());
                if (!bl2 && !bl2) break block8;
            }
            return;
        }
        7S s2 = (7S)this.5;
        if (this.1.size() > 0) {
            n2 = (int)((long)1360735354 ^ (long)1360735355);
            if (\u2004) {
                throw null;
            }
        } else {
            n2 = (int)((long)-78683823 ^ (long)-78683823);
        }
        s2.1 = n2;
    }

    public 9R(7S s2) {
        boolean bl2 = \u2004;
        super(s2, c);
        this.1 = new ArrayList<vp>();
        this.0 = new 0aa();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 4() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2004;
                    if (bl2 || bl2) break block2;
                    if (this.1.size() <= 0) break block3;
                    if (bl2 || bl2) break block2;
                    if (!this.0.0(7Q.0(Float.valueOf(((7S)this.5).5.2 + this.2), Float.valueOf(1.0f), Float.valueOf(20.0f)).floatValue() / 2.0f)) break block3;
                    if (bl2 || bl2) break block2;
                    if (!9R.8()) break block3;
                    if (bl2 || bl2) break block2;
                    9R.6();
                    if (bl2 || bl2) break block2;
                    this.1.forEach(9b::0);
                    if (bl2 || bl2) break block2;
                    this.0.0();
                    if (bl2 || bl2) break block2;
                    this.2 = ((float)Math.random() - 0.5f) * (((7S)this.5).7.2 * 2.0f);
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                9R.7();
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }
}

