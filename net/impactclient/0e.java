/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bii
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.UserAuthentication
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 */
package net.impactclient;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.net.Proxy;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0e {
    private static final String c;
    public String 1;
    private Proxy 2;
    public static final boolean \u2006\u2006\u2007;
    public String 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final bii 0() {
        UserAuthentication userAuthentication;
        boolean bl2;
        block6: {
            bl2 = \u2006\u2006\u2007;
            if (bl2 || bl2) return null;
            userAuthentication = new YggdrasilAuthenticationService(this.2, 0rB$1f.XNZw("", -482020756)).createUserAuthentication(Agent.MINECRAFT);
            userAuthentication.setUsername(this.0);
            if (bl2 || bl2) return null;
            userAuthentication.setPassword(this.1);
            if (bl2) return null;
            try {
                if (bl2) return null;
                userAuthentication.logIn();
                if (bl2 || bl2) return null;
                if (!\u2006\u2006\u2007) break block6;
                throw null;
            } catch (AuthenticationException authenticationException) {
                if (bl2 || bl2) return null;
                return null;
            }
        }
        if (bl2) return null;
        GameProfile gameProfile = userAuthentication.getSelectedProfile();
        if (!bl2 && !bl2) return new bii(gameProfile.getName(), gameProfile.getId().toString(), userAuthentication.getAuthenticatedToken(), c);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 0e.\u2006\u2006\u2007;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)858692344 ^ (long)-858692345);
            if (0e.\u2006\u2006\u2007) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    0e.c = new String(v1).intern();
                    if (0e.\u2006\u2006\u2007) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\u9706\ubfcb\u7c5e\u81d6\u9710\ubffc", -1032474319).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-1668007446 ^ (long)-1668007446);
            v4 = (int)((long)-1839158581 ^ (long)-1839158577);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-727794145 ^ (long)-727794146)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)1785776360 ^ (long)1785776367)) {
                            case 0: {
                                v11 = (int)((long)-718115454 ^ (long)-718115427);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1999029372 ^ (long)-1999029348);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)1314141192 ^ (long)1314141260);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-690192359 ^ (long)-690192280);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)1249873087 ^ (long)1249873077);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)198090480 ^ (long)198090455);
                                if (!0e.\u2006\u2006\u2007) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-546034712 ^ (long)-546034801);
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
                    } while (!0e.\u2006\u2006\u2007);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!0e.\u2006\u2006\u2007)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0e() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2006\u2007;
                if (bl2 || bl2) break block2;
                this.2 = Proxy.NO_PROXY;
                if (!bl2) break block3;
            }
            return;
        }
    }
}

