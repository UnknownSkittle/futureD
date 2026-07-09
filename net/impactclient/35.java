/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  nf
 */
package net.impactclient;

import java.nio.file.Path;
import java.util.stream.Collectors;
import net.impactclient.0E;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.3j;
import net.impactclient.7Q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 35
extends 3j<aow>
implements 0T {
    public static final boolean \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
    protected final Path 0;
    private static final String a;

    /*
     * Enabled aggressive block sorting
     */
    public final void 3(aow aow2) {
        boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
        if (bl2 || bl2) return;
        if (this.0(aow2)) {
            if (bl2 || bl2) return;
            this.remove(aow2);
            if (bl2 || bl2) return;
            this.0(0E.c, aow2);
            if (bl2) return;
            return;
        }
        if (bl2) return;
        this.0(0E.d, aow2);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1() {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
                if (bl2 || bl2) break block2;
                7Q.1((Path)this.0).1.forEach((? super T string) -> {
                    block4: {
                        block2: {
                            boolean bl2;
                            block3: {
                                bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
                                if (bl2 || bl2) break block2;
                                if ((string = aow.b((String)string)) == null) break block3;
                                if (bl2 || bl2) break block2;
                                this.add(string);
                                if (bl2) break block2;
                            }
                            if (!bl2) break block4;
                        }
                        return;
                    }
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1(aow aow2) {
        boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
        if (bl2 || bl2) return;
        if (!this.0(aow2)) {
            if (bl2 || bl2) return;
            this.add(aow2);
            if (bl2 || bl2) return;
            this.0(0E.a, aow2);
            if (bl2) return;
            return;
        }
        if (bl2) return;
        this.0(0E.b, aow2);
        if (!bl2 && !bl2) return;
    }

    public final boolean 0(aow aow2) {
        boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
        if (bl2 || bl2) {
            return true;
        }
        return this.stream().anyMatch(aow3 -> {
            boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
            if (bl2 || bl2) {
                return true;
            }
            return aow3.equals(aow2);
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
                if (bl2 || bl2) break block2;
                7Q.0(this.stream().map(35::2).collect(Collectors.toList()), this.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public static String 2(aow aow2) {
        boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
        if (bl2 || bl2) {
            return null;
        }
        return ((nf)aow.h.b((Object)aow2)).toString();
    }

    public 35(String string) {
        boolean bl2 = \u2007\u2003\u2008\u2004\u200b\u2004\u2005;
        super(string);
        0ay.3();
        this.0 = 0ay.0(string.toLowerCase() + a);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)1469035304 ^ (long)-1469035305);
            if (35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    35.a = new String(v1).intern();
                    if (35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uecd1\uc4b7\u0708\ufa86", -1379022308).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-2019511898 ^ (long)-2019511898);
            v4 = (int)((long)343726072 ^ (long)343726064);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-2008766084 ^ (long)-2008766083)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)341427875 ^ (long)341427876)) {
                            case 0: {
                                v11 = (int)((long)-699777513 ^ (long)-699777422);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)349045911 ^ (long)349046014);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)924154696 ^ (long)924154711);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-1310091665 ^ (long)-1310091703);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)260713881 ^ (long)260713926);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)-1540639842 ^ (long)-1540639855);
                                if (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)900154043 ^ (long)900154051);
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
                    } while (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!35.\u2007\u2003\u2008\u2004\u200b\u2004\u2005)
lbl76:
            // 1 sources

            throw null;
        }
    }

    protected abstract void 0(int var1, aow var2);
}

