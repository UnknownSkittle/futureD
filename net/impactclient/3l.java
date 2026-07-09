/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 */
package net.impactclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import me.zero.alpine.listener.Listenable;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.25;
import net.impactclient.3j;
import net.impactclient.4t;
import net.impactclient.5d;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3l
extends 3j<25>
implements Listenable {
    public static final boolean \u2007\u2008\u2009;
    private final Path 0;
    private static final String[] b;
    private static final String[] a;

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 3l.\u2007\u2008\u2009;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)527588193 ^ (long)527588197)];
            if (var7) break block23;
            var3_2 = (int)((long)2058820734 ^ (long)2058820734);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u3ef5\u1679\ud501\u2856\u3eb9\u16d5\ud5b9\u282d\u3e38\u1650\ud56a\u2876\u3e23\u1669\ud518\u2863\u3ed3\u1642\ud549\u2849\u3e9d\u168e\ud57e\u28cd\u3ea1\u16e0\ud54d\u28fc\u3ebb\u162d\ud51b\u288b\u3e3a\u1615\ud5fa\u287e\u3e49\u160c\ud5d3\u28a2\u3ebb\u16de\ud51c\u2807\u3ef1\u16fe\ud543\u2837\u3ef8\u16ed\ud519\u28ee\u3e43\u16d7\ud5a1\u28de\u3efc\u16e2", -522905495);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)609575374 ^ (long)609575383);
            if (var7) break block23;
            var0_6 = (int)((long)-248334307 ^ (long)248334306);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-827751529 ^ (long)-827751477);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)1748479257 ^ (long)-1748479258);
                    if (3l.\u2007\u2008\u2009) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!3l.\u2007\u2008\u2009) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u6856\u4018\u8327\u7eeb\u6853\u4009\u83e6\u7e13\u686f\u406a\u8372\u7e96\u686c\u4030\u8344\u7eee\u683f", -2098835904);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-230416722 ^ (long)-230416731);
                            var0_6 = (int)((long)286690268 ^ (long)-286690269);
                            while (true) {
                                v0 = (int)((long)-1285092368 ^ (long)-1285092433);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)93358947 ^ (long)93358947);
                                if (!3l.\u2007\u2008\u2009) break block20;
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
                                if (!3l.\u2007\u2008\u2009) ** continue;
                                throw null;
                            }
                            3l.a = var5_1;
                            3l.b = new String[(int)((long)-29260258 ^ (long)-29260262)];
                            if (!3l.\u2007\u2008\u2009) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-28075639 ^ (long)-28075639);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)1207663739 ^ (long)1207663738)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1131305720 ^ (long)-1131305713)) {
                                case 0: {
                                    v15 = (int)((long)-928856046 ^ (long)-928855965);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)853742009 ^ (long)853741966);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-1059217209 ^ (long)-1059217274);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-233202601 ^ (long)-233202564);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)783457708 ^ (long)783457734);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)522712505 ^ (long)522712520);
                                    if (!3l.\u2007\u2008\u2009) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)981911964 ^ (long)981912016);
                                }
                            }
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                            ++var6_7;
                            v8 = v11;
                            if (v11 != 0) break block21;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        } while (!3l.\u2007\u2008\u2009);
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
lbl118:
                    // 1 sources

                    ** continue;
                }
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 1() {
        JsonElement jsonElement2;
        boolean bl2 = \u2007\u2008\u2009;
        if (bl2) return;
        try {
            if (bl2) return;
            jsonElement2 = 5d.0(Files.newBufferedReader(this.0));
            if (!jsonElement2.isJsonArray()) {
                if (bl2 || bl2) return;
                throw new Exception(3l.a((int)((long)1860556079 ^ (long)1860554957), (int)((long)1330222264 ^ (long)-1330247969)));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            if (bl2 || bl2) return;
            return;
        } catch (Throwable throwable) {
            if (bl2 || bl2) return;
            0ay.0a.log(Level.FATAL, 3l.a((int)((long)-1922322421 ^ (long)-1922320920), (int)((long)162752514 ^ (long)162738094)), (Object)throwable.getMessage());
            if (bl2 || bl2) return;
            return;
        }
        {
            if (bl2) return;
            this.clear();
            if (bl2 || bl2) return;
            jsonElement2.getAsJsonArray().forEach((? super T jsonElement) -> {
                block4: {
                    block2: {
                        boolean bl2;
                        block3: {
                            bl2 = \u2007\u2008\u2009;
                            if (bl2 || bl2) break block2;
                            if (!jsonElement.isJsonObject()) break block3;
                            if (bl2 || bl2) break block2;
                            25.0(jsonElement.getAsJsonObject()).ifPresent(this::add);
                            if (bl2) break block2;
                        }
                        if (!bl2) break block4;
                    }
                    return;
                }
            });
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 3l.\u2007\u2008\u2009;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-113426242 ^ (long)-113425059)) & (int)((long)-1937857225 ^ (long)-1937876280);
            if (var9_2) ** GOTO lbl-1000
            if (3l.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 3l.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-534315825 ^ (long)-534315825)] & (int)((long)-491353856 ^ (long)-491353601)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1445960718 ^ (long)-1445960915);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)441569720 ^ (long)441569662);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1623530254 ^ (long)-1623530297);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-253369074 ^ (long)-253369061);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-380176320 ^ (long)-380176374);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-2058881858 ^ (long)-2058881879);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-526806264 ^ (long)-526806061);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-1646156471 ^ (long)-1646156510);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-448679846 ^ (long)-448679876);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1606357462 ^ (long)1606357431);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1974715935 ^ (long)-1974715905);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-827003460 ^ (long)-827003498);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)829033380 ^ (long)829033363);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-40531393 ^ (long)-40531262);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1893200250 ^ (long)-1893200137);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1451575361 ^ (long)-1451575379);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)910546379 ^ (long)910546410);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-703078146 ^ (long)-703078254);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)519205161 ^ (long)519205145);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-525889251 ^ (long)-525889155);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1401350152 ^ (long)1401350150);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)942147458 ^ (long)942147370);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1771908854 ^ (long)1771908665);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-944843101 ^ (long)-944843074);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-358136205 ^ (long)-358136310);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-48269093 ^ (long)-48269144);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-517679271 ^ (long)-517679326);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)794877043 ^ (long)794877002);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-4296325 ^ (long)-4296247);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1087290559 ^ (long)-1087290441);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)1448969505 ^ (long)1448969567);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1369439561 ^ (long)1369439704);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)415881683 ^ (long)415881713);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1400118326 ^ (long)1400118471);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)576182373 ^ (long)576182323);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-213458072 ^ (long)-213457931);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)482504794 ^ (long)482504708);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1161100447 ^ (long)-1161100356);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1980276214 ^ (long)-1980276071);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)455110070 ^ (long)455110016);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1743494824 ^ (long)-1743494878);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1998454329 ^ (long)1998454303);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1711803854 ^ (long)1711803668);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-281414081 ^ (long)-281413900);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1824793345 ^ (long)-1824793449);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)336431447 ^ (long)336431560);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-823646046 ^ (long)-823645960);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)981933765 ^ (long)981933676);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1672841106 ^ (long)1672841183);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-79219908 ^ (long)-79219860);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1245800601 ^ (long)1245800519);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-823237805 ^ (long)-823237778);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1911773792 ^ (long)1911773858);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)103177556 ^ (long)103177557);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-789721381 ^ (long)-789721476);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-2132372459 ^ (long)-2132372407);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-269228511 ^ (long)-269228506);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1423778649 ^ (long)-1423778710);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1643378456 ^ (long)1643378580);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)1412302120 ^ (long)1412302269);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-298052164 ^ (long)-298052245);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1531518952 ^ (long)-1531518721);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1145504859 ^ (long)1145504944);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-2118894158 ^ (long)-2118894152);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-785472873 ^ (long)-785472830);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)1987264133 ^ (long)1987264097);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1068756606 ^ (long)1068756692);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-317563378 ^ (long)-317563160);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-503122513 ^ (long)-503122650);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-106867017 ^ (long)-106867101);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-550457130 ^ (long)-550457279);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)271238782 ^ (long)271238830);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1465660100 ^ (long)-1465660132);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1180707714 ^ (long)-1180707749);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1557317429 ^ (long)-1557317444);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)402292993 ^ (long)402293103);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)632131916 ^ (long)632131998);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)870735240 ^ (long)870735304);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1860514608 ^ (long)-1860514631);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-123882623 ^ (long)-123882595);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-1089122927 ^ (long)-1089123017);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)2136236576 ^ (long)2136236689);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-367218428 ^ (long)-367218318);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)355594497 ^ (long)355594594);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1352435784 ^ (long)1352435773);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1833781593 ^ (long)1833781705);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1902224819 ^ (long)-1902224694);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)915812083 ^ (long)915811991);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)364629518 ^ (long)364629758);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-905259709 ^ (long)-905259530);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-2122550290 ^ (long)-2122550410);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-1878712580 ^ (long)-1878712692);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-982468777 ^ (long)-982468682);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)43965113 ^ (long)43965156);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1157467160 ^ (long)1157467266);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-110846899 ^ (long)-110846926);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1313179103 ^ (long)1313179123);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1547287763 ^ (long)-1547287597);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-595101584 ^ (long)-595101475);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-994040542 ^ (long)-994040377);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1392319941 ^ (long)1392319870);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)560851139 ^ (long)560851150);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-824380843 ^ (long)-824380727);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-264802231 ^ (long)-264802094);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1122648838 ^ (long)-1122648925);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)538760719 ^ (long)538760948);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)142810220 ^ (long)142810293);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)493150473 ^ (long)493150489);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-1563108790 ^ (long)-1563108852);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-36574238 ^ (long)-36574463);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-168057446 ^ (long)-168057451);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1307300714 ^ (long)1307300834);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-1367612591 ^ (long)-1367612631);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1978812814 ^ (long)-1978812854);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-232882164 ^ (long)-232882139);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-987395822 ^ (long)-987395694);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-13387038 ^ (long)-13387159);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)576043394 ^ (long)576043264);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)1377074208 ^ (long)1377074339);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-1790304593 ^ (long)-1790304719);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)46418854 ^ (long)46418761);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-253263387 ^ (long)-253263447);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)544356323 ^ (long)544356266);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1959462550 ^ (long)1959462451);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-734441056 ^ (long)-734440977);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-2080747338 ^ (long)-2080747353);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)1876293294 ^ (long)1876293330);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1396992001 ^ (long)1396992198);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)5514534 ^ (long)5514723);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1021317582 ^ (long)1021317494);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)108454469 ^ (long)108454578);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-1131693207 ^ (long)-1131693185);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1356373433 ^ (long)-1356373251);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1869731537 ^ (long)1869731577);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1440401541 ^ (long)-1440401496);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1910449766 ^ (long)1910449866);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-696292444 ^ (long)-696292383);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1889376939 ^ (long)-1889376773);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-854685863 ^ (long)-854685781);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1681509575 ^ (long)-1681509439);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-2073660854 ^ (long)-2073660825);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)143911794 ^ (long)143911885);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1667883195 ^ (long)1667883140);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)850555554 ^ (long)850555526);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1013136532 ^ (long)-1013136496);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1185142759 ^ (long)-1185142568);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)1560652478 ^ (long)1560652452);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1052577736 ^ (long)-1052577618);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)307003264 ^ (long)307003291);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-869220693 ^ (long)-869220799);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-74143548 ^ (long)-74143513);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1363284039 ^ (long)1363284039);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)192526254 ^ (long)192526138);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)1787278227 ^ (long)1787278305);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-882507627 ^ (long)-882507636);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)334736368 ^ (long)334736165);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)879641413 ^ (long)879641540);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1850730346 ^ (long)-1850730463);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-186917902 ^ (long)-186918098);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-876368246 ^ (long)-876368318);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1638433340 ^ (long)1638433384);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-480208129 ^ (long)-480208289);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1492116716 ^ (long)1492116671);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)156598013 ^ (long)156597955);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1404232780 ^ (long)1404232952);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)391487430 ^ (long)391487242);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1156936352 ^ (long)1156936282);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)301650501 ^ (long)301650461);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)284844285 ^ (long)284844076);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)67938817 ^ (long)67939004);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-125272619 ^ (long)-125272815);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)462176369 ^ (long)462176434);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1897833884 ^ (long)1897833842);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)542213832 ^ (long)542213750);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1765571693 ^ (long)1765571828);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-77358818 ^ (long)-77358602);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)543601879 ^ (long)543601780);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-479173004 ^ (long)-479173083);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)844482654 ^ (long)844482673);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)351341143 ^ (long)351341291);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)302520198 ^ (long)302520300);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)215902170 ^ (long)215902100);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)1197797514 ^ (long)1197797519);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)226438385 ^ (long)226438292);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)86152664 ^ (long)86152572);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1571420056 ^ (long)1571420059);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-375638607 ^ (long)-375638782);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)1328711551 ^ (long)1328711456);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-1806462678 ^ (long)-1806462509);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-2090571341 ^ (long)-2090571384);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-710761679 ^ (long)-710761508);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)605190872 ^ (long)605190705);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1824900574 ^ (long)-1824900487);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-1208184618 ^ (long)-1208184622);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)510786733 ^ (long)510786754);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1424230721 ^ (long)-1424230848);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)2107619420 ^ (long)2107619357);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)157544326 ^ (long)157544404);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-422361182 ^ (long)-422361200);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-1584562930 ^ (long)-1584562748);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1852770109 ^ (long)1852770102);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)785860636 ^ (long)785860623);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1315123351 ^ (long)-1315123323);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)348845157 ^ (long)348845161);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-932490465 ^ (long)-932490450);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)940436617 ^ (long)940436543);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1929980307 ^ (long)1929980300);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1963781809 ^ (long)1963781878);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1431914500 ^ (long)1431914724);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-290140806 ^ (long)-290140879);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)125566298 ^ (long)125566421);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)1641560360 ^ (long)1641560545);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1070098681 ^ (long)1070098687);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1306480328 ^ (long)1306480134);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1392667264 ^ (long)-1392667387);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)204351446 ^ (long)204351403);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)1899061317 ^ (long)1899061463);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1942335363 ^ (long)-1942335265);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)493874052 ^ (long)493873988);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1871744019 ^ (long)1871744178);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1776243875 ^ (long)1776243724);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-657262423 ^ (long)-657262553);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)395215160 ^ (long)395215227);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1744483867 ^ (long)-1744484074);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-544396072 ^ (long)-544396070);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1264510152 ^ (long)-1264510159);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1296356504 ^ (long)-1296356382);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1351673798 ^ (long)-1351673640);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)406203601 ^ (long)406203479);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-2069414254 ^ (long)-2069414219);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1935123691 ^ (long)-1935123674);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1637129256 ^ (long)-1637129226);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1208864324 ^ (long)1208864367);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1374525811 ^ (long)1374525799);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-706504291 ^ (long)-706504235);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)608212887 ^ (long)608212782);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)327366013 ^ (long)327366053);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)434123113 ^ (long)434123121);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)155346183 ^ (long)155346291);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)2123207973 ^ (long)2123207981);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)261860438 ^ (long)261860404);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1397069437 ^ (long)-1397069369);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1396119571 ^ (long)-1396119783);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-854103966 ^ (long)-854103970);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1636054121 ^ (long)-1636054080);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1883484023 ^ (long)1883484034);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)2086483580 ^ (long)2086483697);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-1943837989 ^ (long)-1943838026);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)409757841 ^ (long)409757867);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1568821669 ^ (long)1568821525);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)225339783 ^ (long)225339729);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1648780246 ^ (long)1648780157);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1439591143 ^ (long)1439591123);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1562169524 ^ (long)-1562169400);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1819420819 ^ (long)-1819420881);
                    if (!3l.\u2007\u2008\u2009) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-610038810 ^ (long)-610038911);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)722791071 ^ (long)722791008)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1702690246 ^ (long)1702625849)) >>> (int)((long)1263254153 ^ (long)1263254145)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-808505797 ^ (long)-808505797);
            if (!3l.\u2007\u2008\u2009) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)398612221 ^ (long)398612223);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)391486099 ^ (long)391486096) | var5_6 << (int)((long)675260779 ^ (long)675260782)) ^ var3_4[var7_8]) & (int)((long)-1323465576 ^ (long)-1323465625);
                    if (3l.\u2007\u2008\u2009) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-1930715624 ^ (long)-1930715621) | var6_7 << (int)((long)-543894764 ^ (long)-543894767)) ^ var3_4[var7_8]) & (int)((long)-1755630482 ^ (long)-1755630447);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            3l.b[var2_3] = new String(var3_4).intern();
        }
        return 3l.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2008\u2009;
                if (bl2 || bl2) break block2;
                JsonArray jsonArray = new JsonArray();
                if (bl2 || bl2) break block2;
                this.stream().map(25::0).filter(Objects::nonNull).forEach(jsonArray::add);
                if (bl2 || bl2) break block2;
                5d.0(jsonArray, this.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 3l() {
        boolean bl2 = \u2007\u2008\u2009;
        super(3l.a((int)((long)-1298254035 ^ (long)-1298255155), (int)((long)1576549630 ^ (long)-1576556886)));
        0ay.3();
        this.0 = 0ay.0(3l.a((int)((long)-518277889 ^ (long)-518278882), (int)((long)-847510056 ^ (long)-847480372)));
        4t.1.subscribe(this);
    }
}

