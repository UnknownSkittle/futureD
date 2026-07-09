/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.util.UUIDTypeAdapter
 *  io.netty.handler.codec.http.HttpMethod
 */
package net.impactclient;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.authlib.GameProfile;
import com.mojang.util.UUIDTypeAdapter;
import io.netty.handler.codec.http.HttpMethod;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URL;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1B;
import net.impactclient.1d;
import net.impactclient.2L;
import net.impactclient.3P;
import net.impactclient.3g;
import net.impactclient.5r;
import net.impactclient.7l;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.http.client.utils.URIBuilder;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2G {
    public static final DateTimeFormatter 2;
    private static final String[] a;
    private static final String[] b;
    private static 2L 0;
    private static final Gson 1;
    public static final boolean \u200e\u2003\u2009\u2003\u200b;

    public static String 2(String string) {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return 2G.4().orElse(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 2G.\u200e\u2003\u2009\u2003\u200b;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)-1626005395 ^ (long)-1626005381)];
            if (var7) break block25;
            var3_2 = (int)((long)-1395726787 ^ (long)-1395726787);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\u9671\ube1b\u7dce\u80e0\u9666\ubefa\u7dd3\u80f6\u96de\ube0b\u7dee\u806b\u96af\ube0d\u7dac\u8067\u965d\ube18\u7d40\u809d\u96fb\ubebb\u7df1\u8081\u9670\ube56\u7d11\u80ae\u969c\ube0f\u7d33\u8032\u9616\ubeb2\u7d91\u802c\u96da\ubeff\u7d96\u8058\u96ae\ube11\u7da7\u8052\u96f0\ube29\u7d9b\u80d7\u963b\ubeff\u7de4\u80a5\u965d\ubeb0\u7d44\u801f\u9600\ube14\u7d80\u801a\u96a1\ubee0\u7da9\u80a3\u9609\ube74\u7da3\u8053\u96d8\ube3c\u7da1\u8010\u96f5\ube12\u7d0d\u8051\u96a2\ubea4\u7d09\u8027\u9636\ubec0\u7d07\u800d\u967d\ube55\u7dfc\u80d0\u9679\ube25\u7d64\u80ef\u96d5\ubec5\u7d27\u80ab\u96aa\ube0c\u7dd0\u806f\u9633\ube18\u7dd0\u80e5\u963d\ubeb6\u7d70\u804a\u968c\ubefa\u7d31\u8026\u9608\ubef5\u7de8\u8026\u96cb\ube36\u7d53\u80d9\u961e\ube24\u7de8\u80fb\u96b7\ube67\u7d4f\u8046\u967e\ube35\u7d84\u80d2\u9646\ubeb0\u7dab\u8020\u963b\ubec8\u7d10\u8036\u96f0\ube5c\u7d98\u8093\u96f6\ube07\u7dcc\u8064\u9665\ube89\u7d9d\u8021\u9644\ubeca\u7d8a\u80b4\u965a\ubef3\u7d25\u80ed\u96ab\ube24\u7dff\u80e0\u9647\ubea6\u7def\u8038\u964b\ube0b\u7d48\u801f\u9636\ubeba\u7d83\u80b2\u96a9\ube76\u7df9\u805d\u96cb\ubeb7\u7d77\u809c\u96b9\ubeb0\u7d8e\u80f8\u96a4\ube5b\u7d35\u80b7\u968c\ubeb0\u7dbb\u8060\u964c\ubef8\u7d72\u8032\u96ab\ubeea\u7d93\u8093\u967f\ube44\u7d9d\u80d0\u96e6\ube5c\u7d5e\u8083\u96b5\ubee8\u7d13\u80b5\u9651\ubef1\u7d05\u80ef\u963d\ube63\u7d1f\u8046\u9667\ubeb2\u7dea\u8089\u96ea\ubeca\u7db2\u8069\u966b\ube68\u7deb\u8067\u96ad\ube51\u7d2f\u80db\u9665\ubeb9\u7df8\u80bd\u9631\ube83\u7d88\u804d\u962a\ube5d\u7d83\u8080\u960c\ube54\u7d3a\u80f8\u961b\ubed4\u7dd4\u8018\u9692\ube85\u7db0\u80ec\u96e2\ube5e\u7d74\u80ff\u96cf\ubeeb\u7dfb\u800e\u960e\ube66\u7df9\u8004\u9673\ubeeb\u7d3c\u8004\u9639\ubee5\u7d2b\u8085\u9615\ubef4\u7d7e\u8090\u96fa\ubedb\u7d69\u801e\u96ec\ube18\u7d90\u8072\u96eb\ubea7\u7d0d\u8084\u9635\ubeb0\u7de5\u80d7\u9602\ubee4\u7d56\u80ed\u962b\ube8d\u7dd8\u809d\u9695\ubeb6\u7da1\u80a2\u96b8\ube83\u7dfe\u8032\u9602\ube24\u7d4b\u806e\u9621\ubef2\u7d15\u80ee\u96ab\ube7f\u7d0c\u80eb\u96eb\ube6a\u7dc0\u8050\u96d9\ube5a\u7d5f\u80b7\u9621\ube09\u7dec\u80de\u96e6\ube55\u7d04\u8002\u9613\ubef1\u7de6\u8047\u9680\ubead\u7d66\u807f\u9628\ube43\u7d16\u8096\u96cd\ube44\u7dca\u8000\u9616\ubea9\u7d34\u8011\u965e\ube5c\u7d50\u80bb\u96a5\ube1f\u7d92\u8092\u9674\ube09\u7d17\u80b2\u9658\ubebe\u7d2b\u8013\u9602\ube6e\u7d97\u80be\u96b6\ube56\u7d88\u80bd\u96c3\ube50\u7dd4\u808c\u9616\ube73\u7d7b\u80d7\u96f1\ube25\u7d4b\u80a7\u9663\ube99\u7d41\u800b\u96de\ube69\u7d1a\u80b0\u96b0\ubea7\u7d92\u80c4\u961b\ubebd\u7dec\u8069\u96fa\ube16\u7d95\u8011\u9654\ube3f\u7d01\u80b8\u96b1\ube9a\u7dd5\u808e\u96e2\ube20\u7d43\u803d\u96c7\ubee1\u7dc4\u8088\u96bf\ube59\u7d7d\u80b9\u961a\ubee1\u7dd8\u8064\u96f6\ube9b\u7d96\u801d\u9691\ube98\u7dc5\u80fd\u96e6\ubec9\u7dd9\u80fc\u9645\ube6d\u7de0\u803f\u96ea\ubeac\u7db4\u8051\u9653\ube40\u7d37\u80d2\u96fb\ube00\u7de3\u80fc\u962e\ube90\u7dba\u80ce\u9627\ube8e\u7dbd\u809f\u9692\ube19\u7d3a\u80f9\u963d\ube12\u7df9\u8015\u9622\ubea0\u7d5b\u80a2\u9690\ube7d\u7dfc\u8008\u966f\ube84\u7d63\u8065\u967f\ube98\u7dfe", -20271023);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)-1148452778 ^ (long)-1148452781);
            if (var7) break block25;
            var0_6 = (int)((long)-517233264 ^ (long)517233263);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)-52963544 ^ (long)-52963583);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)1322721082 ^ (long)-1322721083);
                        if (2G.\u200e\u2003\u2009\u2003\u200b) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!2G.\u200e\u2003\u2009\u2003\u200b) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\ua488\u8c28\u4f32\ub226\ua4a9\u8c67\u4f82\ub2c4\ua454\u8c08\u4fc0\ub2d5\ua497\u8c46\u4fc6\ub218\ua4ab\u8c1b\u4fb6\ub204\ua486\u8c15\u4f9b\ub2cb\ua495\u8cca\u4f6b\ub2b9\ua4de\u8ce0\u4f97\ub211\ua4ff\u8c1c\u4fda\ub2ac\ua41c\u8c03\u4f55", -199130437);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)-425246784 ^ (long)-425246750);
                                var0_6 = (int)((long)330047245 ^ (long)-330047246);
                                while (true) {
                                    v0 = (int)((long)352489276 ^ (long)352489339);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)-1531535809 ^ (long)-1531535809);
                                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break block21;
                                    throw null;
                                }
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!2G.\u200e\u2003\u2009\u2003\u200b) ** continue;
                                    throw null;
                                }
                                2G.a = var5_1;
                                2G.b = new String[(int)((long)1383203997 ^ (long)1383203979)];
                                if (2G.\u200e\u2003\u2009\u2003\u200b) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)-1011567131 ^ (long)-1011567131);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)567518849 ^ (long)567518848)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)278000338 ^ (long)278000341)) {
                                    case 0: {
                                        v15 = (int)((long)-766390920 ^ (long)-766391013);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)1945015482 ^ (long)1945015425);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-998223537 ^ (long)-998223577);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)-451471332 ^ (long)-451471273);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)-978347058 ^ (long)-978347102);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)1290019595 ^ (long)1290019616);
                                        if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)1591110407 ^ (long)1591110489);
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var6_7;
                                v8 = v11;
                                if (v11 != 0) break block23;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            } while (!2G.\u200e\u2003\u2009\u2003\u200b);
                            throw null;
                        }
                        v16 = v9;
                        v10 = v10;
                    } while (v10 > var6_7);
                    v4 = new String(v16);
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl119:
                        // 1 sources

                        ** continue;
                    }
                }
                2G.2 = DateTimeFormatter.ofPattern(2G.a((int)((long)992116423 ^ (long)-992105089), (int)((long)-698043991 ^ (long)-698050156))).withZone(ZoneOffset.UTC);
                2G.1 = new GsonBuilder().registerTypeAdapter((Type)UUID.class, new UUIDTypeAdapter()).create();
                2G.0 = null;
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static 1d 8() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        String string = 2G.4().orElseThrow(() -> {
            boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
            if (bl2 || bl2) {
                return null;
            }
            return new IllegalAccessException(2G.a((int)((long)-839614055 ^ (long)839602750), (int)((long)-2109713586 ^ (long)-2109733809)));
        });
        if (bl2) return null;
        try {
            if (bl2) return null;
            return 7l.0(new URIBuilder(2G.a((int)((long)1401294321 ^ (long)-1401299379), (int)((long)1425911594 ^ (long)-1425929522))).addParameter(2G.a((int)((long)-1718593982 ^ (long)1718584816), (int)((long)1118006139 ^ (long)-1117989930)), string).addParameter(2G.a((int)((long)-85434359 ^ (long)85439400), (int)((long)-366215639 ^ (long)-366223011)), 2G.a((int)((long)-1907561210 ^ (long)1907572402), (int)((long)1209603607 ^ (long)1209623672))).build().toString(), null).0(1d.class);
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return null;
        }
    }

    public static boolean 6() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) {
            return true;
        }
        return 0T.2.K() instanceof 3g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(String string) {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return;
        if (2G.2(0rB$1f.XNZw("", -945289107)).equals(string)) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        0ay.3().0b.1(2G.a((int)((long)-1429703175 ^ (long)1429710415), (int)((long)137113970 ^ (long)-137106053)), string);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static URL 0() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        2L l2 = 0;
        if (l2.2 == null) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return l2.2.0;
        return null;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 2G.\u200e\u2003\u2009\u2003\u200b;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1814094175 ^ (long)-1814088981)) & (int)((long)1121487123 ^ (long)1121482476);
            if (var9_2) ** GOTO lbl-1000
            if (2G.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 2G.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)826212829 ^ (long)826212829)] & (int)((long)1694998437 ^ (long)1694998362)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)863064559 ^ (long)863064456);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)13490668 ^ (long)13490685);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)992325444 ^ (long)992325630);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-209904988 ^ (long)-209904941);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)4239959 ^ (long)4239958);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1939177021 ^ (long)-1939177094);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)828161556 ^ (long)828161716);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)235834659 ^ (long)235834695);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1462441149 ^ (long)1462441194);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)885812790 ^ (long)885812923);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)1284610305 ^ (long)1284610375);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-229766526 ^ (long)-229766647);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)717264512 ^ (long)717264480);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-257571034 ^ (long)-257570948);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)1962633090 ^ (long)1962633208);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1377469242 ^ (long)1377469381);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)85383102 ^ (long)85382986);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-365873198 ^ (long)-365873404);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)344188988 ^ (long)344189146);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-618124350 ^ (long)-618124425);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)215182783 ^ (long)215182731);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1108760008 ^ (long)1108759876);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1698936171 ^ (long)1698936311);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)918504470 ^ (long)918504632);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-73221140 ^ (long)-73221277);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-277562410 ^ (long)-277562511);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-2134256322 ^ (long)-2134256141);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)208413674 ^ (long)208413480);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)222090747 ^ (long)222090580);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1528673865 ^ (long)1528674016);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)970976354 ^ (long)970976322);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1202611910 ^ (long)1202611879);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1801625037 ^ (long)1801625051);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1398297114 ^ (long)1398297124);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1579485772 ^ (long)-1579485905);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1808473071 ^ (long)1808472920);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-433989537 ^ (long)-433989499);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-65452868 ^ (long)-65453013);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-814340263 ^ (long)-814340284);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)130181843 ^ (long)130181804);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)194263897 ^ (long)194263849);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-431966259 ^ (long)-431966239);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-2007018254 ^ (long)-2007018486);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)555211026 ^ (long)555211202);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)330169443 ^ (long)330169460);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1328985059 ^ (long)1328984981);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)2042483236 ^ (long)2042483426);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)756802875 ^ (long)756803006);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1410734036 ^ (long)-1410733996);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-468654209 ^ (long)-468654184);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-654237294 ^ (long)-654237255);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1585667504 ^ (long)1585667384);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1163676015 ^ (long)1163675964);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1283385842 ^ (long)1283385711);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-13641046 ^ (long)-13641086);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1517811488 ^ (long)1517811572);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1989117505 ^ (long)-1989117509);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)425880303 ^ (long)425880202);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1026032493 ^ (long)1026032535);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)240622873 ^ (long)240623039);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-727372924 ^ (long)-727372965);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-2027933765 ^ (long)-2027933703);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-2029200771 ^ (long)-2029200818);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)165849706 ^ (long)165849617);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-465693540 ^ (long)-465693614);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)890955642 ^ (long)890955548);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-203544262 ^ (long)-203544094);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1937339043 ^ (long)-1937339110);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-973919504 ^ (long)-973919545);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-945657823 ^ (long)-945657622);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1823813576 ^ (long)-1823813454);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1670864136 ^ (long)-1670864239);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-131539312 ^ (long)-131539403);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-23253784 ^ (long)-23253853);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)115973967 ^ (long)115974132);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1427792719 ^ (long)1427792782);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1564612515 ^ (long)1564612442);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)1656977102 ^ (long)1656977106);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1836556060 ^ (long)-1836556265);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1537731781 ^ (long)-1537731829);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)1198765043 ^ (long)1198764988);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1328831704 ^ (long)1328831624);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-174470187 ^ (long)-174470153);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)153681866 ^ (long)153681831);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1437436460 ^ (long)1437436504);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1202452405 ^ (long)1202452232);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)412423258 ^ (long)412423368);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-523497666 ^ (long)-523497493);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-308809281 ^ (long)-308809290);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)632606833 ^ (long)632606968);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1812493537 ^ (long)-1812493506);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)578639763 ^ (long)578639821);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-254065613 ^ (long)-254065623);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-861534095 ^ (long)-861534134);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1012311344 ^ (long)1012311546);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)1465461867 ^ (long)1465461918);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1076103909 ^ (long)1076103740);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1333715288 ^ (long)1333715418);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-510518970 ^ (long)-510518888);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)2136226128 ^ (long)2136226056);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-256527324 ^ (long)-256527132);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1393740464 ^ (long)1393740369);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)51848638 ^ (long)51848450);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)1554127846 ^ (long)1554127690);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1481720655 ^ (long)1481720682);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)458416600 ^ (long)458416568);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)1523377891 ^ (long)1523377786);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-118647142 ^ (long)-118647269);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)523943264 ^ (long)523943304);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1356949804 ^ (long)-1356949765);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1840946428 ^ (long)1840946414);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)781670564 ^ (long)781670572);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-984542162 ^ (long)-984542049);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)328145515 ^ (long)328145544);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1194552143 ^ (long)1194552096);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)864314944 ^ (long)864314982);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)587588157 ^ (long)587588175);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-294900623 ^ (long)-294900580);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-2085150005 ^ (long)-2085149998);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-237704013 ^ (long)-237704008);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1938992230 ^ (long)1938992353);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1440081282 ^ (long)-1440081302);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-91769950 ^ (long)-91769995);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-390527354 ^ (long)-390527281);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)71446689 ^ (long)71446729);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1837656854 ^ (long)1837656909);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-756105096 ^ (long)-756105166);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)964672486 ^ (long)964672331);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)872524088 ^ (long)872524283);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1233405212 ^ (long)1233405325);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)705601861 ^ (long)705601937);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)558765764 ^ (long)558765736);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1519642986 ^ (long)-1519643000);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1301450709 ^ (long)-1301450646);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1306901605 ^ (long)-1306901756);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1696109143 ^ (long)1696109128);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-722452258 ^ (long)-722452236);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)534895181 ^ (long)534895240);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1775325794 ^ (long)1775325779);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1035478242 ^ (long)-1035478063);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-97987442 ^ (long)-97987421);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-231101430 ^ (long)-231101213);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1736452637 ^ (long)1736452844);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)1927112009 ^ (long)1927112054);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1873191439 ^ (long)1873191648);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-589650442 ^ (long)-589650675);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-311978866 ^ (long)-311978839);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1481088325 ^ (long)1481088439);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)799457201 ^ (long)799457256);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-862518811 ^ (long)-862518897);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1899203318 ^ (long)-1899203205);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-974332566 ^ (long)-974332594);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-1624885201 ^ (long)-1624885127);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)472192592 ^ (long)472192736);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-2119086459 ^ (long)-2119086380);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-732262411 ^ (long)-732262406);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1351307644 ^ (long)1351307580);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1453841628 ^ (long)1453841478);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1338261930 ^ (long)-1338261778);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-583827281 ^ (long)-583827443);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-948415675 ^ (long)-948415685);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-505260195 ^ (long)-505260091);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-1023997374 ^ (long)-1023997385);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)464952933 ^ (long)464952975);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1244065909 ^ (long)1244065859);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-1592415796 ^ (long)-1592415912);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-2121243691 ^ (long)-2121243760);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)436853993 ^ (long)436854002);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1872354510 ^ (long)-1872354333);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)808255658 ^ (long)808255655);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1685430 ^ (long)-1685300);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1744862469 ^ (long)1744862544);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1589526654 ^ (long)1589526763);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1981953973 ^ (long)-1981953861);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1958885030 ^ (long)-1958884970);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)276361287 ^ (long)276361378);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-1786091168 ^ (long)-1786091218);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1309090602 ^ (long)-1309090588);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-231342819 ^ (long)-231342829);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-437168597 ^ (long)-437168554);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-327026465 ^ (long)-327026542);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-1359166144 ^ (long)-1359166137);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)616207894 ^ (long)616207935);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-455349589 ^ (long)-455349717);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1598695093 ^ (long)-1598695042);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-480137779 ^ (long)-480137743);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)432604782 ^ (long)432604684);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)238600540 ^ (long)238600583);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-781380272 ^ (long)-781380293);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1719657091 ^ (long)1719657120);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-1162090566 ^ (long)-1162090748);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-473556299 ^ (long)-473556413);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1017572207 ^ (long)-1017572302);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-881698323 ^ (long)-881698399);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)1132864343 ^ (long)1132864403);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)2121266862 ^ (long)2121266793);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-2053446158 ^ (long)-2053446292);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)379422002 ^ (long)379422063);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-2124280705 ^ (long)-2124280580);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-1733653599 ^ (long)-1733653635);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1188294907 ^ (long)1188294840);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-172724264 ^ (long)-172724394);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1406956222 ^ (long)-1406956161);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1490941244 ^ (long)1490941327);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1586682041 ^ (long)1586681962);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-392557401 ^ (long)-392557320);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)2019184649 ^ (long)2019184829);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-150879187 ^ (long)-150879097);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-269377971 ^ (long)-269377797);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1270135019 ^ (long)1270134995);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-947535713 ^ (long)-947535806);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1095474612 ^ (long)-1095474456);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)2041428362 ^ (long)2041428249);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1182017010 ^ (long)-1182016847);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)1431469230 ^ (long)1431469061);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1297603427 ^ (long)1297603417);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-2082477423 ^ (long)-2082477342);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)221266869 ^ (long)221266871);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1249792740 ^ (long)-1249792746);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1341518347 ^ (long)1341518403);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-472412932 ^ (long)-472412932);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)828379411 ^ (long)828379620);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)834995325 ^ (long)834995301);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)755162580 ^ (long)0x2D02DDD2);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)131667094 ^ (long)131667069);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-488311013 ^ (long)-488310901);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1161231837 ^ (long)-1161231637);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-617723547 ^ (long)-617723452);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)531672512 ^ (long)531672517);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-480491025 ^ (long)-480491261);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-338347936 ^ (long)-338348004);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)1460928073 ^ (long)1460928183);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1787344184 ^ (long)1787344173);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)976328676 ^ (long)976328680);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)358548490 ^ (long)358548566);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1598973658 ^ (long)1598973496);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)681835642 ^ (long)681835545);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-367682912 ^ (long)-367683004);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-766936480 ^ (long)-766936461);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)269110227 ^ (long)269110017);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1163127950 ^ (long)1163127846);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)701758393 ^ (long)701758269);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1405775493 ^ (long)-1405775496);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1731669613 ^ (long)-1731669567);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1042432727 ^ (long)-1042432697);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1462385524 ^ (long)1462385498);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1663476294 ^ (long)1663476468);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)171384015 ^ (long)171383947);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-325135891 ^ (long)-325135916);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1108038273 ^ (long)-1108038255);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1149731860 ^ (long)-1149732080);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1013369102 ^ (long)-1013369244);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-712931048 ^ (long)-712930975);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1742384107 ^ (long)1742383906);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1362190349 ^ (long)-1362190365);
                    if (!2G.\u200e\u2003\u2009\u2003\u200b) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-1527186013 ^ (long)-1527186082);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)2126900226 ^ (long)2126900477)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-800809413 ^ (long)-800824892)) >>> (int)((long)-784126834 ^ (long)-784126842)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-51384370 ^ (long)-51384370);
            if (!2G.\u200e\u2003\u2009\u2003\u200b) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1935215831 ^ (long)1935215829);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)2028963956 ^ (long)2028963959) | var5_6 << (int)((long)452554874 ^ (long)452554879)) ^ var3_4[var7_8]) & (int)((long)1975002070 ^ (long)1975001897);
                    if (2G.\u200e\u2003\u2009\u2003\u200b) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)478565267 ^ (long)478565264) | var6_7 << (int)((long)-91133216 ^ (long)-91133211)) ^ var3_4[var7_8]) & (int)((long)1973695934 ^ (long)1973695809);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            2G.b[var2_3] = new String(var3_4).intern();
        }
        return 2G.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static 3g 1(String string) {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        String string2 = 0rB$1f.XNZw("", -2067280453);
        if (bl2) return null;
        try {
            Object object;
            if (bl2) return null;
            string2 = 1.toJson((Object)new 3P(string), (Type)((Object)3P.class));
            if (bl2 || bl2) return null;
            Object object2 = string2;
            object2 = 1.fromJson(7l.0(2G.a((int)((long)798200949 ^ (long)-798210093), (int)((long)25542444 ^ (long)-25546053)), null, (String)object2, HttpMethod.POST).0(), 1B.class);
            if (object2 == null) {
                if (bl2) return null;
                throw new IOException(2G.a((int)((long)1609088509 ^ (long)-1609077172), (int)((long)1086826762 ^ (long)-1086843033)));
            }
            if (bl2) return null;
            if (object2.0()) {
                if (bl2 || bl2) return null;
                throw new IOException(2G.a((int)((long)712583189 ^ (long)-712574042), (int)((long)-1499767996 ^ (long)-1499789395)) + object2.getError() + 2G.a((int)((long)423477836 ^ (long)-423489031), (int)((long)1007935229 ^ (long)1007937658)) + object2.getErrorMessage());
            }
            if (bl2) return null;
            Object object3 = object2;
            if (object3.getSelectedProfile() != null) {
                if (bl2 || bl2) return null;
                object = object3.getSelectedProfile();
                if (\u200e\u2003\u2009\u2003\u200b) {
                    throw null;
                }
            } else if (ArrayUtils.isNotEmpty(object3.getAvailableProfiles())) {
                object = object3.getAvailableProfiles()[(int)((long)1993633670 ^ (long)1993633670)];
                if (\u200e\u2003\u2009\u2003\u200b) {
                    throw null;
                }
            } else {
                object = object3 = null;
            }
            if (object != null) return new 3g(object2.getAccessToken(), (GameProfile)object3);
            throw new IOException(2G.a((int)((long)235143446 ^ (long)-235154778), (int)((long)26719502 ^ (long)26713063)));
        } catch (IOException iOException) {
            if (bl2 || bl2) return null;
            0ay.0a.error(2G.a((int)((long)1935813713 ^ (long)-1935802392), (int)((long)1660700800 ^ (long)-1660689792)).concat(String.valueOf(string)), (Throwable)iOException);
            if (bl2 || bl2) return null;
            0ay.0a.error(2G.a((int)((long)-1317379829 ^ (long)1317384880), (int)((long)630419780 ^ (long)630407307)).concat(String.valueOf(string2)));
            if (!bl2 && !bl2) return null;
            return null;
        }
    }

    public static 1d 0a() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) {
            return null;
        }
        return 2G.8();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static URL 9() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        2L l2 = 0;
        if (l2.1 == null) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return l2.1.0;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Optional<String> 4() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        Optional<String> optional = Optional.ofNullable(0ay.3().0b.0(2G.a((int)((long)922858722 ^ (long)-922851513), (int)((long)-979821134 ^ (long)-979827817)), null));
        if (optional.isPresent()) {
            if (bl2) return null;
            if (optional.get().isEmpty()) {
                if (bl2) return null;
                return Optional.empty();
            }
        }
        if (!bl2) return optional;
        return null;
    }

    public static boolean 5() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) {
            return true;
        }
        return 2G.4().isPresent();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void 3() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2) return;
        try {
            if (bl2) return;
            Object object = 7l.0(2G.a((int)((long)-1491120887 ^ (long)1491115693), (int)((long)1721369829 ^ (long)-1721375174)), null);
            if (!((5r)object).2()) {
                if (bl2 || bl2) return;
                throw new IOException(2G.a((int)((long)-586560540 ^ (long)586553435), (int)((long)30425642 ^ (long)30439152)) + ((5r)object).0 + 2G.a((int)((long)-810096805 ^ (long)810104033), (int)((long)1177389040 ^ (long)-1177411780)));
            }
            if (bl2) return;
            if ((object = ((5r)object).0(2L.class)) == null) {
                if (bl2 || bl2) return;
                throw new IOException(2G.a((int)((long)-1919910240 ^ (long)1919921438), (int)((long)-1952182354 ^ (long)-1952169416)));
            }
            if (bl2) return;
            0 = object;
            if (bl2 || bl2) return;
            return;
        } catch (IOException iOException) {
            if (bl2 || bl2) return;
            0ay.0a.error(2G.a((int)((long)-1433335031 ^ (long)1433327796), (int)((long)359234539 ^ (long)-359226122)), (Throwable)iOException);
            if (!bl2 && !bl2) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static 1d 3(String string) {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2) return null;
        try {
            if (bl2) return null;
            1d d2 = 7l.0(new URIBuilder(2G.a((int)((long)-92760384 ^ (long)92751200), (int)((long)2015608624 ^ (long)-2015617953))).addParameter(2G.a((int)((long)813304720 ^ (long)-813311961), (int)((long)-1312976477 ^ (long)-1312965308)), string).build().toString(), null).0(1d.class);
            if (d2 != null) {
                if (bl2 || bl2) return null;
                d2.4 = string;
                if (bl2) return null;
            }
            if (bl2) return null;
            return d2;
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return null;
        }
    }

    public static boolean 7() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) {
            return true;
        }
        return 2G.0.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static URL 2() {
        boolean bl2 = \u200e\u2003\u2009\u2003\u200b;
        if (bl2 || bl2) return null;
        2L l2 = 0;
        if (l2.2 == null) {
            if (bl2) return null;
            return null;
        }
        if (!bl2) return l2.2.1;
        return null;
    }
}

