/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.response.Response
 */
package net.impactclient;

import com.google.gson.annotations.SerializedName;
import com.mojang.authlib.yggdrasil.response.Response;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.2G;
import net.impactclient.4g;
import net.impactclient.7h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1d
extends Response
implements 7h {
    public static final boolean \u200a\u2009\u200e\u200b;
    @SerializedName(value="username")
    public String 1;
    @SerializedName(value="info")
    public 4g 6;
    @SerializedName(value="token")
    public String 4;
    @SerializedName(value="expires")
    private String 2;
    private static final String c;
    @SerializedName(value="cape")
    public String 0;
    @SerializedName(value="limit")
    public boolean 3;
    @SerializedName(value="skin")
    public String 5;

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 1d.\u200a\u2009\u200e\u200b;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)700016817 ^ (long)-700016818);
            if (1d.\u200a\u2009\u200e\u200b) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    1d.c = new String(v1).intern();
                    if (1d.\u200a\u2009\u200e\u200b) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uef7a\uc7ff\u047e\uf9c8\uef03\uc7d3\u0437\uf9f2\uef29\uc7b3\u0478\uf9b3\uef42\uc7ab\u0444\uf99b\uef62\uc7fd\u040e\uf9f1\uef2d\uc780\u0433\uf9c3\uef2b\uc7c3\u045e\uf985\uef5a", -636892815).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-82183057 ^ (long)-82183057);
            v4 = (int)((long)1195163237 ^ (long)1195163259);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-1115500915 ^ (long)-1115500916)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-1865663305 ^ (long)-1865663312)) {
                            case 0: {
                                v11 = (int)((long)-1941817871 ^ (long)-1941817890);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1991864089 ^ (long)-1991864148);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-1945371962 ^ (long)-1945371968);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-2084478005 ^ (long)-2084478000);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)41349711 ^ (long)41349678);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)1493408322 ^ (long)1493408375);
                                if (!1d.\u200a\u2009\u200e\u200b) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-55069767 ^ (long)-55069708);
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
                    } while (!1d.\u200a\u2009\u200e\u200b);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!1d.\u200a\u2009\u200e\u200b)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 1d() {
        boolean bl2 = \u200a\u2009\u200e\u200b;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Instant 0() {
        boolean bl2 = \u200a\u2009\u200e\u200b;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return 2G.2.parse((CharSequence)this.2, Instant::from);
        } catch (DateTimeParseException dateTimeParseException) {
            if (bl2 || bl2) return null;
            0ay.0a.error(c, (Throwable)dateTimeParseException);
            if (bl2 || bl2) return null;
            return null;
        }
    }
}

