/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 *  org.lwjgl.input.Keyboard
 */
package net.impactclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import net.impactclient.0J;
import net.impactclient.0aM;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.23;
import net.impactclient.3V;
import net.impactclient.5d;
import net.impactclient.6r;
import org.apache.logging.log4j.Level;
import org.lwjgl.input.Keyboard;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0a
implements 6r {
    private static final String[] b;
    private final Path 0;
    private static final String[] a;
    public final 3V 1;
    public static final boolean \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void 0(3V v2) {
        boolean bl2;
        block8: {
            Object object;
            bl2 = \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
            if (bl2) return;
            try {
                if (bl2) return;
                0ay.3();
                if (bl2) return;
                object = 0ay.0(0a.a((int)((long)290747387 ^ (long)290722012), (int)((long)-57952508 ^ (long)57947957)));
                if (!Files.exists((Path)object, new LinkOption[(int)((long)-384399319 ^ (long)-384399319)])) break block8;
                if (bl2 || bl2) return;
                if (!((JsonElement)(object = 5d.0(Files.newBufferedReader((Path)object)))).isJsonObject()) {
                    if (bl2 || bl2) return;
                    throw new Exception(0a.a((int)((long)1445336001 ^ (long)1445359856), (int)((long)349131369 ^ (long)-349119283)));
                }
            } catch (Exception exception) {
                if (bl2 || bl2) return;
                0ay.0a.log(Level.FATAL, 0a.a((int)((long)1306329641 ^ (long)1306353932), (int)((long)2000662276 ^ (long)2000659726)), (Throwable)exception);
                if (bl2 || bl2) return;
                return;
            }
            {
                if (bl2) return;
                0aM.0(v2, ((JsonElement)object).getAsJsonObject());
                if (bl2) return;
            }
        }
        if (bl2) return;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1078031789 ^ (long)1078007451)) & (int)((long)-1128398740 ^ (long)-1128333421);
            if (var9_2) ** GOTO lbl-1000
            if (0a.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 0a.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)749389391 ^ (long)749389391)] & (int)((long)-145910092 ^ (long)-145910197)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1932298907 ^ (long)-1932298929);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)182827788 ^ (long)182827918);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)660336071 ^ (long)660336047);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1102942478 ^ (long)1102942660);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1603092476 ^ (long)1603092312);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)206657195 ^ (long)206657270);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-1824820899 ^ (long)-1824820904);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-267336229 ^ (long)-267336320);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)509002534 ^ (long)509002602);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)214497540 ^ (long)214497541);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-769782409 ^ (long)-769782308);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-2083786924 ^ (long)-2083786838);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-473729626 ^ (long)-473729673);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)1008887914 ^ (long)1008887937);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-2106313201 ^ (long)-2106313159);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-862442723 ^ (long)-862442655);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)885327479 ^ (long)885327598);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)393413600 ^ (long)393413594);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)1189664038 ^ (long)1189664114);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1740381424 ^ (long)1740381189);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1079442179 ^ (long)1079442212);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-741943376 ^ (long)-741943357);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1373455385 ^ (long)1373455371);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-1395766427 ^ (long)-1395766483);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1228156933 ^ (long)-1228156957);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1366972242 ^ (long)1366972227);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1208321389 ^ (long)1208321396);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-267878142 ^ (long)-267878002);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-946827538 ^ (long)-946827750);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)2102416557 ^ (long)2102416629);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-120867138 ^ (long)-120867130);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)268632222 ^ (long)268632269);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1596485232 ^ (long)-1596485235);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-499426676 ^ (long)-499426577);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-941141358 ^ (long)-941141457);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1185573265 ^ (long)1185573252);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1542543751 ^ (long)-1542543697);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1526202695 ^ (long)1526202732);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-516135291 ^ (long)-516135186);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1678161768 ^ (long)1678161726);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)133117479 ^ (long)133117546);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1433759834 ^ (long)-1433759800);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1421568712 ^ (long)1421568700);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-753790703 ^ (long)-753790680);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1219548811 ^ (long)-1219548864);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-279020155 ^ (long)-279020084);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)2056086683 ^ (long)2056086693);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-195845009 ^ (long)-195844962);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1386955665 ^ (long)-1386955682);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-25914457 ^ (long)-25914560);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1438720553 ^ (long)1438720647);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1056592340 ^ (long)1056592134);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-474447528 ^ (long)-474447560);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-648063821 ^ (long)-648063947);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)890067386 ^ (long)890067452);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1288918170 ^ (long)-1288918129);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)508500359 ^ (long)508500454);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)599533205 ^ (long)599533134);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-2042389630 ^ (long)-2042389757);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)204823927 ^ (long)204823972);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-1709242169 ^ (long)-1709242265);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-868657248 ^ (long)-868657393);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1794009760 ^ (long)1794009842);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1840451870 ^ (long)-1840451937);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-2077038003 ^ (long)-2077038046);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-989364942 ^ (long)-989364834);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1907056195 ^ (long)-1907056332);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)516374281 ^ (long)516374355);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-82057128 ^ (long)-82056988);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-711205417 ^ (long)-711205539);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)2057390804 ^ (long)2057390758);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)173918774 ^ (long)173918779);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)1000192331 ^ (long)1000192497);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)967960799 ^ (long)967960757);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1732606248 ^ (long)1732606264);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1960384788 ^ (long)-1960384885);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1932547898 ^ (long)-1932547917);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-241286535 ^ (long)-241286466);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)217563009 ^ (long)217563126);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1668678767 ^ (long)-1668678903);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)2045736203 ^ (long)2045736366);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)1448465718 ^ (long)1448465897);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-1478331103 ^ (long)-1478331117);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1410665789 ^ (long)1410665920);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-304153405 ^ (long)-304153422);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1377836633 ^ (long)1377836782);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1015903651 ^ (long)-1015903552);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-19296230 ^ (long)-19296148);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-356937373 ^ (long)-356937406);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)367151003 ^ (long)367151094);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1139693353 ^ (long)1139693556);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)395986420 ^ (long)395986265);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)112497617 ^ (long)112497413);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)643280725 ^ (long)643280660);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-846723197 ^ (long)-846723237);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1469388233 ^ (long)-1469388225);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1378125357 ^ (long)-1378125498);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)2097002319 ^ (long)2097002491);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1644622120 ^ (long)1644622284);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1226313121 ^ (long)1226313050);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1141855225 ^ (long)1141855100);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1162028228 ^ (long)1162028118);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1119297788 ^ (long)-1119297588);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)1546055377 ^ (long)1546055405);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-487821128 ^ (long)-487821311);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-2127146337 ^ (long)-2127146382);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-846319885 ^ (long)-846320118);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1183009720 ^ (long)-1183009706);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)310444600 ^ (long)310444758);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)693903997 ^ (long)693904027);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-331879350 ^ (long)-331879169);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-318974560 ^ (long)-318974541);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1716422857 ^ (long)1716422841);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)2136763292 ^ (long)2136763143);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-738658778 ^ (long)-738658727);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1021116578 ^ (long)-1021116540);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-841524275 ^ (long)-841524243);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)169059466 ^ (long)169059505);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)386072560 ^ (long)386072532);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1893818724 ^ (long)1893818782);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-1564114444 ^ (long)-1564114677);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)1691921916 ^ (long)1691921668);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1918924937 ^ (long)-1918924834);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)352414032 ^ (long)352414026);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1876577278 ^ (long)-1876577053);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1410282667 ^ (long)1410282652);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-1535723143 ^ (long)-1535723020);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1775130693 ^ (long)-1775130833);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-414136929 ^ (long)-414136895);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)1846401 ^ (long)1846344);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1319284510 ^ (long)1319284496);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)754984413 ^ (long)754984372);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-715199939 ^ (long)-715199943);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-463694394 ^ (long)-463694568);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1774061713 ^ (long)-1774061733);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-524099157 ^ (long)-524099218);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1770846385 ^ (long)-1770846452);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1502243694 ^ (long)-1502243654);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-1629047052 ^ (long)-1629047070);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1118962414 ^ (long)1118962417);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-969958402 ^ (long)-969958629);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-1192869675 ^ (long)-1192869772);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1919986673 ^ (long)-1919986495);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)1969718225 ^ (long)1969718050);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1120966084 ^ (long)1120965928);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-2009363388 ^ (long)-2009363351);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-247089716 ^ (long)-247089885);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1850267537 ^ (long)-1850267495);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)2016477678 ^ (long)2016477689);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-849450076 ^ (long)-849450182);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1943734501 ^ (long)-1943734334);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1461247038 ^ (long)1461247088);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-1500350319 ^ (long)-1500350273);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1376004535 ^ (long)-1376004515);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-866793779 ^ (long)-866793802);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)176917807 ^ (long)176917878);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-211850483 ^ (long)-211850255);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-941528082 ^ (long)-941528200);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)509474571 ^ (long)509474780);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)928921925 ^ (long)928921874);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)49160815 ^ (long)49160715);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1649391816 ^ (long)1649391864);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-462915021 ^ (long)-462914897);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-1167407195 ^ (long)-1167407197);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-1803654951 ^ (long)-1803655111);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)649436554 ^ (long)649436486);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1350594881 ^ (long)1350595065);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)1640224219 ^ (long)1640224101);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)658583892 ^ (long)658583944);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1352009525 ^ (long)1352009527);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1131198311 ^ (long)1131198376);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)391238112 ^ (long)391238052);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-1258480684 ^ (long)-1258480648);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)461621628 ^ (long)461621622);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1721326148 ^ (long)1721326295);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-499717779 ^ (long)-499717794);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-1607537021 ^ (long)-1607537039);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)2124969937 ^ (long)2124969803);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1543638959 ^ (long)1543638924);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)408273239 ^ (long)408273303);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-243202997 ^ (long)-243202917);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-1650963898 ^ (long)-1650963956);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-67829681 ^ (long)-67829752);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-721375770 ^ (long)-721375903);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1370145403 ^ (long)-1370145337);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)986261728 ^ (long)986261557);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)1814516022 ^ (long)1814516044);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1900704760 ^ (long)-1900704668);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-1433599105 ^ (long)-1433599108);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-1521558033 ^ (long)-1521558097);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)22612098 ^ (long)22612035);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1145317136 ^ (long)-1145317301);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1862987456 ^ (long)-1862987293);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-703984181 ^ (long)-703984211);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-781314984 ^ (long)-781314852);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-304674795 ^ (long)-304674659);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1018551086 ^ (long)1018551230);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1471111856 ^ (long)-1471111710);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-570809444 ^ (long)-570809548);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)825555559 ^ (long)825555559);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-198382796 ^ (long)-198382608);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-525074218 ^ (long)-525074344);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-756505858 ^ (long)-756505919);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1975292274 ^ (long)1975292221);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-2006181217 ^ (long)-2006181329);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1340419839 ^ (long)-1340419794);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-1074359124 ^ (long)-1074359056);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-503824120 ^ (long)-503823953);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1876948327 ^ (long)1876948440);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-684241748 ^ (long)-684241687);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)190240015 ^ (long)190240113);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-806688538 ^ (long)-806688723);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-527367593 ^ (long)-527367435);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-765355331 ^ (long)-765355334);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-445904908 ^ (long)-445904943);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1342219232 ^ (long)1342219107);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)2110437511 ^ (long)2110437630);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1429059698 ^ (long)1429059607);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-842417391 ^ (long)-842417379);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1143027026 ^ (long)-1143027035);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1822911942 ^ (long)1822911852);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-2112228570 ^ (long)-2112228567);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)2096856132 ^ (long)2096856306);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1337508120 ^ (long)1337508233);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-1289025364 ^ (long)-1289025426);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)1698316410 ^ (long)1698316440);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1903187313 ^ (long)-1903187308);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)21081520 ^ (long)21081415);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)1560368642 ^ (long)1560368797);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1393379201 ^ (long)-1393379088);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)2138093731 ^ (long)2138093603);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)922541768 ^ (long)922541719);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)6652778 ^ (long)6652735);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1322660915 ^ (long)1322661081);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-2007798259 ^ (long)-2007798118);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)613672844 ^ (long)613672767);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-2071345754 ^ (long)-2071345734);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1187120447 ^ (long)1187120391);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1617201030 ^ (long)-1617201037);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-936406052 ^ (long)-936406209);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)978333033 ^ (long)978333081);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-173802417 ^ (long)-173802394);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-283835414 ^ (long)-283835607);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)93008480 ^ (long)93008582);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)605079179 ^ (long)605079258);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1770391152 ^ (long)-1770391176);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-669845561 ^ (long)-669845531);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)101684550 ^ (long)101684619);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-1513238685 ^ (long)-1513238574);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)281490502 ^ (long)281490528);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)399486966 ^ (long)399486886);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1772559534 ^ (long)-1772559505);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)370276503 ^ (long)370276380);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)885248201 ^ (long)885248015);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-626514172 ^ (long)-626514074);
                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-582884328 ^ (long)-582884269);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-102509403 ^ (long)-102509478)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1904079327 ^ (long)1904021024)) >>> (int)((long)-1720638407 ^ (long)-1720638415)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-1938681594 ^ (long)-1938681594);
            if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1546618412 ^ (long)-1546618410);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1536772043 ^ (long)1536772040) | var5_6 << (int)((long)-1881488772 ^ (long)-1881488775)) ^ var3_4[var7_8]) & (int)((long)1875724621 ^ (long)1875724722);
                    if (0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-1615041936 ^ (long)-1615041933) | var6_7 << (int)((long)-1839864725 ^ (long)-1839864722)) ^ var3_4[var7_8]) & (int)((long)-823555878 ^ (long)-823556059);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            0a.b[var2_3] = new String(var3_4).intern();
        }
        return 0a.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                if (bl2 || bl2) break block2;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(0a.a((int)((long)-1985747286 ^ (long)-1985772152), (int)((long)1042099038 ^ (long)-1042113870)), 0a.a((int)((long)1841684312 ^ (long)1841675390), (int)((long)1077748262 ^ (long)-1077741848)));
                if (bl2 || bl2) break block2;
                JsonArray jsonArray = new JsonArray();
                if (bl2 || bl2) break block2;
                this.1.forEach(var2_2 -> {
                    block5: {
                        block2: {
                            JsonObject jsonObject;
                            boolean bl2;
                            block4: {
                                JsonArray jsonArray2;
                                block3: {
                                    bl2 = \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                                    if (bl2 || bl2) break block2;
                                    jsonObject = new JsonObject();
                                    jsonObject.addProperty(0a.a((int)((long)765385767 ^ (long)765378333), (int)((long)1184254128 ^ (long)1184237706)), 3V.1(var2_2.2()));
                                    if (bl2 || bl2) break block2;
                                    jsonObject.addProperty(0a.a((int)((long)-60293112 ^ (long)-60267716), (int)((long)1535120104 ^ (long)1535145731)), var2_2.4());
                                    if (bl2 || bl2) break block2;
                                    jsonObject.addProperty(0a.a((int)((long)1508981042 ^ (long)1508989449), (int)((long)-1226757498 ^ (long)1226750252)), Keyboard.getKeyName((int)var2_2.0().0));
                                    if (bl2 || bl2) break block2;
                                    jsonObject.addProperty(0a.a((int)((long)1338704697 ^ (long)1338728448), (int)((long)919849406 ^ (long)-919840584)), (Boolean)23.0(var2_2, 0a.a((int)((long)1314638346 ^ (long)1314629942), (int)((long)-1327780668 ^ (long)-1327790322))));
                                    if (bl2 || bl2) break block2;
                                    jsonArray2 = 0J.0(var2_2);
                                    if (jsonArray2 == null) break block3;
                                    if (bl2 || bl2) break block2;
                                    jsonObject.add(0a.a((int)((long)-1672143724 ^ (long)-1672118357), (int)((long)-468377835 ^ (long)-468361048)), jsonArray2);
                                    if (bl2) break block2;
                                }
                                if (bl2) break block2;
                                if (!var2_2.7()) break block4;
                                if (bl2 || bl2) break block2;
                                jsonObject.addProperty(0a.a((int)((long)-1357759235 ^ (long)-1357750328), (int)((long)-658284910 ^ (long)-658284102)), var2_2.5().2());
                                if (bl2 || bl2) break block2;
                                jsonArray2 = new JsonArray();
                                if (bl2 || bl2) break block2;
                                var2_2.9().forEach(m2 -> {
                                    block4: {
                                        block2: {
                                            boolean bl2;
                                            block3: {
                                                bl2 = \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                                                if (bl2 || bl2) break block2;
                                                JsonArray jsonArray2 = 0J.0(m2);
                                                if (jsonArray2 == null) break block3;
                                                if (bl2 || bl2) break block2;
                                                JsonObject jsonObject = new JsonObject();
                                                jsonObject.addProperty(0a.a((int)((long)-2118098187 ^ (long)-2118123065), (int)((long)1410629410 ^ (long)1410606665)), m2.2());
                                                if (bl2 || bl2) break block2;
                                                jsonObject.add(0a.a((int)((long)752584212 ^ (long)752608553), (int)((long)361150099 ^ (long)361137796)), jsonArray2);
                                                if (bl2 || bl2) break block2;
                                                jsonArray2.add(jsonObject);
                                                if (bl2) break block2;
                                            }
                                            if (!bl2) break block4;
                                        }
                                        return;
                                    }
                                });
                                if (bl2 || bl2) break block2;
                                if (jsonArray2.size() <= 0) break block4;
                                if (bl2 || bl2) break block2;
                                jsonObject.add(0a.a((int)((long)2108224085 ^ (long)2108199270), (int)((long)-530096384 ^ (long)-530098039)), jsonArray2);
                                if (bl2) break block2;
                            }
                            if (bl2) break block2;
                            jsonArray.add(jsonObject);
                            if (!bl2 && !bl2) break block5;
                        }
                        return;
                    }
                });
                if (bl2 || bl2) break block2;
                jsonObject.add(0a.a((int)((long)-974094506 ^ (long)-974119819), (int)((long)-889187798 ^ (long)889180348)), jsonArray);
                if (bl2 || bl2) break block2;
                5d.0(jsonObject, this.0);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)1618056285 ^ (long)1618056267)];
            if (var7) break block23;
            var3_2 = (int)((long)782942068 ^ (long)782942068);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u0cfa\u24a7\ue708\u1adb\u0c28\u24d0\ue76b\u1a51\u0c53\u24e3\ue7a8\u1a49\u0cfc\u2475\ue79c\u1a3b\u0c19\u24a3\ue728\u1ac4\u0cae\u244a\ue717\u1ad3\u0cfa\u249a\ue7a7\u1ade\u0c0e\u2452\ue73c\u1adc\u0cd0\u2490\ue79c\u1af5\u0c2a\u240b\ue7f3\u1ae7\u0c10\u24bd\ue78d\u1aec\u0cd9\u2487\ue72d\u1a6e\u0cf4\u24b3\ue79f\u1a8a\u0c0e\u2451\ue71a\u1a5f\u0c96\u24ce\ue78a\u1a76\u0c78\u24e2\ue737\u1a38\u0c41\u242c\ue74e\u1a15\u0c03\u24fe\ue736\u1a54\u0cb6\u24c0\ue754\u1a28\u0c0a\u2476\ue72c\u1a12\u0c6d\u2446\ue7bc\u1a56\u0cac\u2499\ue722\u1ac4\u0ca7\u244e\ue754\u1a67\u0c44\u2447\ue78c\u1a87\u0c70\u24be\ue73b\u1a73\u0c7a\u248e\ue77f\u1a32\u0ce3\u245c\ue7b4\u1aae\u0c3e\u2433\ue72b\u1aad\u0c9d\u24f1\ue731\u1a2e\u0ca8\u241f\ue7e5\u1a2c\u0c97\u2422\ue771\u1afb\u0c8e\u2435\ue7d6\u1a98\u0c53\u2460\ue709\u1a25\u0cca\u247b\ue744\u1a9c\u0cea\u2464\ue765\u1afc\u0c14\u2494\ue7b3\u1a82\u0c05\u24d5\ue796\u1af4\u0c55\u2476\ue7eb\u1ab0\u0ce1\u2444\ue76b\u1aca\u0ccf\u248c\ue775\u1a9b\u0c6c\u245e\ue746\u1ad0\u0cf0\u24cf\ue719\u1a40\u0ca3\u243f\ue779\u1a07\u0c49\u249e\ue713\u1aa8\u0ccd\u246f\ue7af\u1a9c\u0cf1\u24f0\ue71a\u1a77\u0c93\u245b\ue7aa\u1a6d\u0cd2\u2436\ue711\u1aaa\u0ceb\u240f\ue7ec\u1a3f\u0c7b\u2471\ue7e0\u1a5f\u0c92\u249b\ue754\u1a1a\u0c73\u2485\ue736\u1a4b\u0c6e\u24dc\ue791\u1a3a\u0cda\u24f7\ue73f\u1a44\u0c6f\u24fd\ue710\u1a51\u0ce6\u246f\ue70f\u1ae3\u0cfe\u2432\ue703\u1aa5\u0c6d\u2449\ue788\u1a53\u0ced\u249a\ue7fb\u1a5b\u0cf6\u2462\ue786\u1aa1\u0c77\u249a\ue7cc\u1ac5\u0c2f\u2472\ue748\u1a02\u0ca4\u249e\ue7b4\u1a3a\u0c9d\u2494\ue7a2\u1aea\u0cdd\u2452\ue7a1\u1a6e\u0c99\u2416\ue70c\u1ae0\u0c00\u24bb\ue7d8\u1a06\u0cad\u24d4\ue795\u1ac0\u0c30\u24d2\ue78a\u1a50\u0c93\u2427\ue7b9\u1aff\u0c0f\u242a\ue7ec\u1afa\u0c59\u24ae\ue7c8\u1a35\u0c75\u24de\ue7da\u1a60\u0c5a\u24b0\ue732\u1a67\u0cfb\u24c9\ue7ce\u1ad6\u0c59\u2472\ue783\u1acd\u0cb7\u244a\ue7d6\u1a57\u0c2a\u24e3\ue7ff", 1226254900);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-1275986265 ^ (long)-1275986290);
            if (var7) break block23;
            var0_6 = (int)((long)-1520084417 ^ (long)1520084416);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)1282602069 ^ (long)1282602006);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)-1562431866 ^ (long)1562431865);
                    if (0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\ufb28\ud3a5\u10f3\uedeb\ufbe6\ud347\u10d2\ued69\ufb32\ud335\u10de\uedb4\ufb92\ud360\u10e4", -1624449603);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-282142831 ^ (long)-282142826);
                            var0_6 = (int)((long)-1005516305 ^ (long)1005516304);
                            while (true) {
                                v0 = (int)((long)-2041373776 ^ (long)-2041373721);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-925905675 ^ (long)-925905675);
                                if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break block20;
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
                                if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) ** continue;
                                throw null;
                            }
                            0a.a = var5_1;
                            0a.b = new String[(int)((long)-1280519094 ^ (long)-1280519076)];
                            if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-491554138 ^ (long)-491554138);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)-312562332 ^ (long)-312562331)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-743385779 ^ (long)-743385782)) {
                                case 0: {
                                    v15 = (int)((long)1507493235 ^ (long)1507493219);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-1213433907 ^ (long)-1213433872);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)999494581 ^ (long)999494642);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)2141272548 ^ (long)2141272567);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-82837095 ^ (long)-82836998);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)378583351 ^ (long)378583417);
                                    if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)1634789682 ^ (long)1634789635);
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
                        } while (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006);
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
     * Unable to fully structure code
     */
    public final void 1() {
        block14: {
            block13: {
                block16: {
                    block12: {
                        block15: {
                            block11: {
                                block10: {
                                    var4_1 = 0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                                    if (var4_1) lbl-1000:
                                    // 23 sources

                                    {
                                        return;
                                    }
                                    if (var4_1) ** GOTO lbl-1000
                                    if (Files.exists(this.0, new LinkOption[(int)((long)780080968 ^ (long)780080968)])) break block10;
                                    if (var4_1 || var4_1) ** GOTO lbl-1000
                                    0a.0(this.1);
                                    if (var4_1 || var4_1) ** GOTO lbl-1000
                                    this.0();
                                    if (var4_1 || var4_1) ** GOTO lbl-1000
                                    return;
                                }
                                if (var4_1) ** GOTO lbl-1000
                                var1_2 = 5d.0(Files.newBufferedReader(this.0));
                                if (var1_2.isJsonObject()) break block11;
                                if (var4_1 || var4_1) ** GOTO lbl-1000
                                throw new Exception(0a.a((int)((long)169282369 ^ (long)169306230), (int)((long)-885881510 ^ (long)-885880603)));
                            }
                            if (var4_1) ** GOTO lbl-1000
                            if (!(var1_2 = var1_2.getAsJsonObject()).has(0a.a((int)((long)-663279115 ^ (long)-663270703), (int)((long)393881131 ^ (long)-393897754)))) break block15;
                            if (var4_1) ** GOTO lbl-1000
                            if (var1_2.get(0a.a((int)((long)-182958933 ^ (long)-182966391), (int)((long)2012734858 ^ (long)-2012720026))).isJsonPrimitive()) break block12;
                            if (var4_1) ** GOTO lbl-1000
                        }
                        if (var4_1) ** GOTO lbl-1000
                        throw new Exception(0a.a((int)((long)2027808438 ^ (long)2027783552), (int)((long)-694533589 ^ (long)694520845)));
                    }
                    if (var4_1) ** GOTO lbl-1000
                    if (!var1_2.has(0a.a((int)((long)342468394 ^ (long)342475794), (int)((long)-555748049 ^ (long)555755157)))) break block16;
                    if (var4_1) ** GOTO lbl-1000
                    if (var1_2.get(0a.a((int)((long)204487791 ^ (long)204496716), (int)((long)1948060496 ^ (long)-1948071482))).isJsonArray()) break block13;
                    if (var4_1) ** GOTO lbl-1000
                }
                if (var4_1) ** GOTO lbl-1000
                throw new Exception(0a.a((int)((long)-117346506 ^ (long)-117371897), (int)((long)-1062364090 ^ (long)1062343394)));
            }
            if (var4_1) ** GOTO lbl-1000
            var2_4 = var1_2.get(0a.a((int)((long)1689126502 ^ (long)1689150788), (int)((long)-1918535951 ^ (long)1918551837))).getAsString();
            var3_5 = 0aM.0(var2_4);
            if (var3_5 != null) break block14;
            if (var4_1 || var4_1) ** GOTO lbl-1000
            v0 = new Object[(int)((long)-37587704 ^ (long)-37587703)];
            v0[(int)((long)1239442034 ^ (long)1239442034)] = var2_4;
            throw new Exception(String.format(0a.a((int)((long)1440227284 ^ (long)1440251114), (int)((long)-562494800 ^ (long)562490168)), v0));
        }
        try {
            if (var4_1) ** GOTO lbl-1000
            var3_5.0(this, var1_2.getAsJsonArray(0a.a((int)((long)67249434 ^ (long)67257913), (int)((long)1781110146 ^ (long)-1781115116))));
            if (var4_1 || var4_1) ** GOTO lbl-1000
            ** if (!0a.\u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006) goto lbl-1000
        } catch (Exception var1_3) {
            if (var4_1 || var4_1) ** GOTO lbl-1000
            0ay.0a.log(Level.FATAL, 0a.a((int)((long)-1387400374 ^ (long)-1387425670), (int)((long)-1430648271 ^ (long)1430642852)), (Object)var1_3.getMessage());
            if (var4_1) ** GOTO lbl-1000
        }
lbl-1000:
        // 1 sources

        {
            throw null;
        }
lbl-1000:
        // 1 sources

        {
        }
        if (var4_1) ** GOTO lbl-1000
        this.0();
        if (!var4_1 && !var4_1) ** break;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0a(String string, 3V v2) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2007\u200c\u2008\u2000\u200b\u200b\u2006;
                if (bl2 || bl2) break block2;
                this.1 = v2;
                if (bl2 || bl2) break block2;
                0ay.3();
                this.0 = 0ay.0(string);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

