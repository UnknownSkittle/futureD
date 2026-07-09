/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Level
 */
package net.impactclient;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import net.impactclient.0O;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1R;
import net.impactclient.1S;
import net.impactclient.1k;
import net.impactclient.1w;
import net.impactclient.2G;
import net.impactclient.3j;
import net.impactclient.4d;
import net.impactclient.5d;
import net.impactclient.7Q;
import net.impactclient.7b;
import net.impactclient.7p;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 3J
extends 3j<1R> {
    public static final boolean \u2001\u200c\u2005\u2008;
    private static final Path 0;
    private static final String[] a;
    private static final String[] b;
    private final Path 1;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    private void 0(List<String> list) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200c\u2005\u2008;
                if (bl2 || bl2) break block2;
                list.forEach((? super T stringArray) -> {
                    1R r2;
                    boolean bl2 = \u2001\u200c\u2005\u2008;
                    if (bl2 || bl2) return;
                    if ((stringArray = stringArray.split(0rB$1f.XNZw("\uf967", 434954238))).length <= 0) {
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    String string = stringArray[(int)((long)-574505878 ^ (long)-574505878)];
                    if (bl2 || bl2) {
                        return;
                    }
                    if (((String[])stringArray).length == (int)((long)1226605731 ^ (long)1226605730)) {
                        r2 = new 1w(string);
                        if (\u2001\u200c\u2005\u2008) {
                            throw null;
                        }
                    } else {
                        r2 = new 1S(string, stringArray[(int)((long)-1694904799 ^ (long)-1694904800)]);
                    }
                    this.add(r2);
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 3J.\u2001\u200c\u2005\u2008;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)95791772 ^ (long)95799544)) & (int)((long)996582889 ^ (long)996563478);
            if (var9_2) ** GOTO lbl-1000
            if (3J.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 3J.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-1509073741 ^ (long)-1509073741)] & (int)((long)-273633997 ^ (long)-273633844)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1180921503 ^ (long)-1180921411);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1083182887 ^ (long)-1083182933);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1477275948 ^ (long)-1477275919);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)494113914 ^ (long)494113924);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1156393689 ^ (long)-1156393503);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)90727986 ^ (long)90727968);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-1712328464 ^ (long)-1712328506);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)682618528 ^ (long)682618604);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1823004703 ^ (long)-1823004891);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)526346853 ^ (long)526346926);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-2008542890 ^ (long)-2008542721);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)1566058731 ^ (long)1566058740);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)1586862151 ^ (long)1586862296);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)2141999509 ^ (long)2141999402);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)750174233 ^ (long)750174442);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1286252965 ^ (long)-1286252979);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)1196698777 ^ (long)1196698725);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-856732235 ^ (long)-856732267);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)1720666283 ^ (long)1720666233);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1581585588 ^ (long)1581585545);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-78833500 ^ (long)-78833452);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-273042605 ^ (long)-273042589);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)94186190 ^ (long)94186211);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)1698882837 ^ (long)1698882877);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)2093465380 ^ (long)2093465460);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1146280326 ^ (long)1146280302);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1125205681 ^ (long)-1125205573);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)1291481554 ^ (long)1291481483);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1991730922 ^ (long)-1991730853);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)842434714 ^ (long)842434768);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1288274650 ^ (long)-1288274474);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1926732503 ^ (long)1926732384);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1109445868 ^ (long)-1109445758);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-281819833 ^ (long)-281819833);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)658016995 ^ (long)658016890);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-1577687897 ^ (long)-1577687819);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)519631634 ^ (long)519631622);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1465326644 ^ (long)-1465326762);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)833759650 ^ (long)833759622);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1806402052 ^ (long)1806402110);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)60928632 ^ (long)60928684);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1028627210 ^ (long)-1028627314);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-1187618809 ^ (long)-1187618613);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)1711707747 ^ (long)1711707770);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1172177202 ^ (long)-1172177313);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1111434298 ^ (long)-1111434323);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-1547457275 ^ (long)-1547457135);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-558680661 ^ (long)-558680691);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-941451386 ^ (long)-941451395);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1712434481 ^ (long)-1712434556);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)656275045 ^ (long)656275083);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1706768516 ^ (long)-1706768608);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1043274109 ^ (long)1043273993);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1902163852 ^ (long)1902163793);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)257163998 ^ (long)257163983);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1532364224 ^ (long)-1532364046);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1809828138 ^ (long)-1809828148);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-658521577 ^ (long)-658521358);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-962816382 ^ (long)-962816402);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1972325687 ^ (long)-1972325768);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-2072813715 ^ (long)-2072813634);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1266231616 ^ (long)-1266231754);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1134683823 ^ (long)1134683831);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1391299902 ^ (long)-1391299922);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)337650231 ^ (long)337650210);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)653386668 ^ (long)653386745);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1164459846 ^ (long)-1164459849);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1792904166 ^ (long)-1792904089);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-591322138 ^ (long)-591322332);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)1645547249 ^ (long)1645547060);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-2130528499 ^ (long)-2130528313);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1652585168 ^ (long)-1652585202);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1911178023 ^ (long)-1911178145);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-941662880 ^ (long)-941662741);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1129864038 ^ (long)-1129864019);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-208237444 ^ (long)-208237371);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-267974498 ^ (long)-267974458);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-2012603292 ^ (long)-2012603177);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1168235601 ^ (long)-1168235619);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-2051120575 ^ (long)-2051120533);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-61859333 ^ (long)-61859428);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)306586479 ^ (long)306586623);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-1737894755 ^ (long)-1737894694);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)961791258 ^ (long)961791323);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-746165267 ^ (long)-746165328);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1620482303 ^ (long)1620482168);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)423955055 ^ (long)423955038);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-875757831 ^ (long)-875758048);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1308798951 ^ (long)-1308798809);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1037824205 ^ (long)1037824073);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1959520245 ^ (long)1959520054);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)855141257 ^ (long)855141362);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-964751172 ^ (long)-964751295);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-1598912537 ^ (long)-1598912635);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1573941560 ^ (long)-1573941696);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1838106786 ^ (long)-1838106632);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1556035574 ^ (long)1556035437);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1118337581 ^ (long)1118337730);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-1698060541 ^ (long)-1698060306);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)1323314509 ^ (long)1323314525);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-1507865467 ^ (long)-1507865364);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)882437386 ^ (long)882437526);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-971742514 ^ (long)-971742584);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1404779174 ^ (long)-1404779116);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1757597739 ^ (long)-1757597865);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1888608083 ^ (long)1888608022);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)411053234 ^ (long)411053283);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)956045580 ^ (long)956045789);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)1222825264 ^ (long)1222825241);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)936537008 ^ (long)936537086);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1093338138 ^ (long)1093338143);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-839649119 ^ (long)-839649026);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1531300345 ^ (long)1531300175);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1383214014 ^ (long)-1383213847);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)1971603747 ^ (long)1971603865);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1975626660 ^ (long)-1975626700);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-447180895 ^ (long)-447181055);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1242482364 ^ (long)1242482195);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)922784581 ^ (long)922784738);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)314279231 ^ (long)314279399);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-309613505 ^ (long)-309613348);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)1894080868 ^ (long)1894081006);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1207650547 ^ (long)-1207650469);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)309923070 ^ (long)309922822);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)279159734 ^ (long)279159753);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)531611541 ^ (long)531611627);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)561835966 ^ (long)561835909);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)347709840 ^ (long)347709740);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1308329283 ^ (long)-1308329423);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1355379541 ^ (long)-1355379510);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1889315926 ^ (long)1889316046);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)71191284 ^ (long)71191175);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1385740508 ^ (long)-1385740466);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)109397259 ^ (long)109397472);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-780833032 ^ (long)-780833189);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-1262698550 ^ (long)-1262698622);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)208810851 ^ (long)208810808);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)263888956 ^ (long)263889067);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1898694010 ^ (long)1898694087);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1879074113 ^ (long)1879074117);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-1570715876 ^ (long)-1570715798);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-2069830025 ^ (long)-2069830127);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-596809391 ^ (long)-596809227);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-1467340664 ^ (long)-1467340564);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1512507869 ^ (long)-1512507677);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1339728783 ^ (long)-1339728819);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)155371903 ^ (long)155371807);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-501170076 ^ (long)-501170096);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-1913259944 ^ (long)-1913259888);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)1225205459 ^ (long)1225205444);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-344426024 ^ (long)-344425989);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)761047524 ^ (long)761047486);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)496805871 ^ (long)496805786);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1921863516 ^ (long)-1921863581);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)1319405796 ^ (long)1319405795);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-329799335 ^ (long)-329799183);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-184305375 ^ (long)-184305384);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-854338951 ^ (long)-854339064);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1294700680 ^ (long)-1294700644);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)1589104227 ^ (long)1589104284);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)33401346 ^ (long)33401551);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-571056070 ^ (long)-571055877);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1143387929 ^ (long)1143387923);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)1841460768 ^ (long)1841460915);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-577641687 ^ (long)-577641688);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-475201567 ^ (long)-475201566);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)606624856 ^ (long)606624983);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)689823925 ^ (long)689823803);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)2033938001 ^ (long)2033938116);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)201562636 ^ (long)201562782);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1068270941 ^ (long)1068271023);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-556880586 ^ (long)-556880552);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-1214443828 ^ (long)-1214443890);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)545189393 ^ (long)545189470);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)2126645390 ^ (long)2126645376);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)2031860950 ^ (long)2031860823);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)485138130 ^ (long)485138018);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-160405456 ^ (long)-160405265);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1581030834 ^ (long)-1581030855);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-555085706 ^ (long)-555085589);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1993133841 ^ (long)1993133940);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)1636390789 ^ (long)1636390759);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-75385685 ^ (long)-75385704);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1760674224 ^ (long)-1760674072);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-928441124 ^ (long)-928441286);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1602318605 ^ (long)1602318764);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)1392506243 ^ (long)1392506336);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1554012419 ^ (long)-1554012665);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-202943025 ^ (long)-202943050);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-999642010 ^ (long)-999642044);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)321542680 ^ (long)321542854);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)383498310 ^ (long)383498331);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)444092195 ^ (long)444092279);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-293892705 ^ (long)-293892680);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1038130031 ^ (long)-1038130117);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)881000943 ^ (long)881000761);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-569108296 ^ (long)-569108333);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-284252164 ^ (long)-284252394);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)958392070 ^ (long)958392106);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1508098386 ^ (long)1508098394);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)385372230 ^ (long)385372363);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1331659972 ^ (long)-1331659887);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-880743842 ^ (long)-880743851);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)515908285 ^ (long)515908340);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-2126640684 ^ (long)-2126640893);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)949016219 ^ (long)949016197);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-1155574900 ^ (long)-1155574999);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)912469906 ^ (long)912469826);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)718998567 ^ (long)718998667);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-867486763 ^ (long)-867486765);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-602092873 ^ (long)-602092958);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-185944464 ^ (long)-185944432);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)512431491 ^ (long)512431559);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)2086793895 ^ (long)2086793798);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-2071709191 ^ (long)-2071709392);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1507709402 ^ (long)1507709400);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-187190542 ^ (long)-187190713);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)678248626 ^ (long)678248605);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-2014164844 ^ (long)-2014164969);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-882346800 ^ (long)-882346953);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1891831510 ^ (long)-1891831521);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1821085370 ^ (long)-1821085187);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-1223327467 ^ (long)-1223327474);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1618036458 ^ (long)-1618036263);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-605972102 ^ (long)-605972155);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)1777273523 ^ (long)1777273410);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-332250752 ^ (long)-332250630);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)923803007 ^ (long)923802943);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-833833324 ^ (long)-833833257);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)884739702 ^ (long)884739617);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)1238357228 ^ (long)1238357097);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-457737390 ^ (long)-457737301);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1809820575 ^ (long)1809820620);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-687212587 ^ (long)-687212549);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-355656713 ^ (long)-355656821);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1484596973 ^ (long)1484596836);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1834379971 ^ (long)1834379800);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1724591095 ^ (long)1724591076);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1676204612 ^ (long)1676204740);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-1886260408 ^ (long)-1886260289);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)595927236 ^ (long)595927245);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1440020365 ^ (long)1440020435);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-974825546 ^ (long)-974825620);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1797640273 ^ (long)1797640435);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)1647873046 ^ (long)1647873145);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)1740046847 ^ (long)1740046673);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-850989108 ^ (long)-850989068);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-36686658 ^ (long)-36686773);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)80273051 ^ (long)80272943);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1857969071 ^ (long)-1857969075);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)1907456867 ^ (long)1907457021);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1299920992 ^ (long)1299921007);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)143197235 ^ (long)143197278);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1762997030 ^ (long)-1762996997);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-872728608 ^ (long)-872728823);
                    if (!3J.\u2001\u200c\u2005\u2008) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-1033311540 ^ (long)-1033311552);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-1011331080 ^ (long)-1011331321)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1015535156 ^ (long)1015491019)) >>> (int)((long)1280891378 ^ (long)1280891386)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-304329597 ^ (long)-304329597);
            if (!3J.\u2001\u200c\u2005\u2008) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1264016981 ^ (long)-1264016983);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1246470331 ^ (long)1246470328) | var5_6 << (int)((long)783132756 ^ (long)783132753)) ^ var3_4[var7_8]) & (int)((long)-1593604123 ^ (long)-1593604326);
                    if (3J.\u2001\u200c\u2005\u2008) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)522152380 ^ (long)522152383) | var6_7 << (int)((long)-1936938303 ^ (long)-1936938300)) ^ var3_4[var7_8]) & (int)((long)-1060758899 ^ (long)-1060758926);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            3J.b[var2_3] = new String(var3_4).intern();
        }
        return 3J.b[var2_3];
    }

    public final List<String> 0() {
        boolean bl2 = \u2001\u200c\u2005\u2008;
        if (bl2 || bl2) {
            return null;
        }
        return this.stream().map(1R::2).filter(Objects::nonNull).collect(Collectors.toList());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200c\u2005\u2008;
                if (bl2 || bl2) break block2;
                JsonArray jsonArray = new JsonArray();
                if (bl2 || bl2) break block2;
                this.stream().map(1R::5).filter(Objects::nonNull).forEach(jsonArray::add);
                if (bl2 || bl2) break block2;
                5d.0(jsonArray, this.1);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 3J.\u2001\u200c\u2005\u2008;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)1062472854 ^ (long)1062472833)];
            if (var7) break block25;
            var3_2 = (int)((long)1050051342 ^ (long)1050051342);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\u2234\u0a1d\uc93b\u34f3\u22b5\u0a3c\uc9af\u3434\u22ff\u0a71\uc95f\u34fc\u22da\u0a81\uc9c2\u340f\u228a\u0a49\uc933\u340b\u22ca\u0a1e\uc9a0\u347b\u2277\u0ae4\uc933\u34a3\u2278\u0a91\uc996\u34de\u2274\u0aa1\uc9f4\u34de\u22bd\u0a93\uc94f\u3451\u22a1\u0aa5\uc957\u34a7\u22c7\u0a7a\uc984\u34d7\u222c\u0a43\uc90c\u34fe\u226f\u0a4e\uc983\u343f\u226c\u0a4c\uc9b7\u3465\u22bf\u0ac6\uc969\u343d\u225a\u0a56\uc95b\u3441\u22b7\u0a4f\uc9f5\u346d\u22b9\u0a27\uc932\u34ba\u22dd\u0ab6\uc9fa\u3405\u2250\u0ae8\uc9ef\u3438\u222c\u0a2f\uc987\u34ab\u22bf\u0ab3\uc9b9\u3421\u22b8\u0a69\uc9d3\u3487\u22ec\u0af1\uc9f4\u34f0\u22df\u0a2e\uc9e9\u34d7\u2283\u0a59\uc959\u34c5\u2271\u0a6e\uc91b\u349a\u2293\u0a1e\uc95f\u340a\u226e\u0aba\uc992\u348e\u224c\u0af0\uc9f3\u345d\u2233\u0afd\uc96f\u3498\u22d2\u0a39\uc939\u345a\u22ed\u0a5b\uc906\u346d\u228c\u0afe\uc920\u3485\u227e\u0a00\uc9a9\u34f3\u2270\u0a8b\uc947\u3425\u22d0\u0ad7\uc9e7\u34f0\u226f\u0a41\uc9c7\u34b6\u2280\u0a1e\uc9b5\u345a\u22da\u0a90\uc9bb\u3454\u22d4\u0a80\uc958\u3488\u22b7\u0aa8\uc97f\u3483\u220b\u0afd\uc911\u34d3\u22cb\u0a74\uc913\u3469\u2256\u0a39\uc9f1\u3449\u220d\u0a2f\uc975\u3441\u227c\u0aea\uc96f\u34b6\u22b6\u0a3a\uc970\u34bf\u22f1\u0a5b\uc966\u3451\u2278\u0ad4\uc98c\u34b4\u225d\u0a08\uc959\u348a\u2215\u0a72\uc9b7\u341d\u228d\u0a21\uc984\u34ef\u220d\u0ae6\uc95b\u3475\u22fe\u0a1c\uc926\u341b\u2237\u0a78\uc976\u345e\u22c5\u0a08\uc939\u34c8\u22af\u0a99\uc9b8\u3435\u22e4\u0ac9\uc9f8\u34bc\u2267\u0a51\uc9b7\u34f3\u227b\u0aae\uc9f0\u3429\u22b8\u0a46\uc9d1\u34f0\u2269\u0a13\uc93f\u3470\u228d\u0af0\uc976\u3470\u2218\u0a00\uc960\u3480\u22e7\u0a09\uc945\u344d\u2269\u0a81\uc928\u34f9\u2265\u0a70\uc960\u3497\u2270\u0aa5\uc90a\u34b5\u2200\u0a17\uc954\u340d\u2271\u0a35\uc908\u3410\u2283\u0a5e\uc95b\u3442\u225e\u0a24\uc964\u34dc\u228c\u0abb\uc993\u3438\u223c\u0acc\uc9a9\u3452\u22da\u0a06\uc9f3\u3429\u222d\u0a85\uc9a5\u34cc\u22b1\u0a25\uc98b\u345a\u2204\u0aa0\uc988\u348e\u2276\u0a8b\uc94d\u346f\u2286\u0a92\uc9a0\u34f1\u2214\u0a80\uc9be\u34b1\u222c", -1220213721);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)-108617200 ^ (long)-108617197);
            if (var7) break block25;
            var0_6 = (int)((long)949250727 ^ (long)-949250728);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)-1233216056 ^ (long)-1233216081);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)-840928265 ^ (long)840928264);
                        if (3J.\u2001\u200c\u2005\u2008) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!3J.\u2001\u200c\u2005\u2008) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u7b3a\u53d9\u906b\u6d58\u7b67\u5373\u9008\u6d8f\u7b72\u53ed\u90f9\u6d2b\u7bbf\u53d5\u9028\u6d73\u7b5e\u5374\u902a\u6d33\u7bd0\u5313\u9081\u6d83\u7bb5\u530b\u90c2\u6d68\u7b41\u539b\u90de\u6d7b\u7b9d\u532c\u90d3\u6d75\u7b73\u534d\u9010\u6dc0\u7b83\u530e\u906b\u6d12\u7b6e\u5310\u90ac\u6d1a\u7b3a\u539a\u90e2\u6d8d\u7b51\u53cc\u9027\u6db3\u7b67\u53fd\u900b\u6d3e\u7bab\u5389\u90a4\u6dfb\u7b2d\u5353\u90c3\u6d64\u7bf0\u5379\u9034\u6d07\u7ba2\u5361\u90d0\u6d9f\u7b97\u53e8", 284908969);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)1208697181 ^ (long)1208697212);
                                var0_6 = (int)((long)-305503556 ^ (long)305503555);
                                while (true) {
                                    v0 = (int)((long)1233869480 ^ (long)1233869495);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)1779440133 ^ (long)1779440133);
                                    if (!3J.\u2001\u200c\u2005\u2008) break block21;
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
                                    if (!3J.\u2001\u200c\u2005\u2008) ** continue;
                                    throw null;
                                }
                                3J.a = var5_1;
                                3J.b = new String[(int)((long)490167157 ^ (long)490167138)];
                                if (3J.\u2001\u200c\u2005\u2008) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)109034799 ^ (long)109034799);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)1138013613 ^ (long)1138013612)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)1511237865 ^ (long)1511237870)) {
                                    case 0: {
                                        v15 = (int)((long)861516715 ^ (long)861516775);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-165329641 ^ (long)-165329651);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)1803821067 ^ (long)1803821179);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)-1743459367 ^ (long)-1743459431);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)-1228543511 ^ (long)-1228543578);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-1242458562 ^ (long)-1242458501);
                                        if (!3J.\u2001\u200c\u2005\u2008) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)1743765231 ^ (long)1743765168);
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
                            } while (!3J.\u2001\u200c\u2005\u2008);
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
                v17 = (int)((long)1050518332 ^ (long)1050526028);
                0ay.3();
                3J.0 = Paths.get(0ay.1(3J.a(v17, (int)((long)493615571 ^ (long)493612124))), new String[(int)((long)-1303866044 ^ (long)-1303866044)]);
                break;
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Optional<1R> 0(JsonObject object) {
        boolean bl2;
        block25: {
            UUID uUID;
            Object object2;
            String string;
            Object object3;
            bl2 = \u2001\u200c\u2005\u2008;
            if (bl2) return null;
            try {
                block24: {
                    String string2;
                    if (bl2) return null;
                    object3 = ((JsonObject)object).get(3J.a((int)((long)698052322 ^ (long)698027151), (int)((long)-2119960899 ^ (long)-2119964235))).getAsString();
                    if (bl2 || bl2) return null;
                    string = ((JsonObject)object).get(3J.a((int)((long)-1395119960 ^ (long)-1395111226), (int)((long)1973717418 ^ (long)-1973719963))).getAsString();
                    if (bl2 || bl2) return null;
                    if (((JsonObject)object).has(3J.a((int)((long)-1301108988 ^ (long)-1301101212), (int)((long)71878368 ^ (long)71866459)))) {
                        if (bl2) return null;
                        string2 = ((JsonObject)object).get(3J.a((int)((long)1094326266 ^ (long)1094350224), (int)((long)143190835 ^ (long)-143185172))).getAsString();
                        if (\u2001\u200c\u2005\u2008) {
                            throw null;
                        }
                    } else {
                        string2 = 0rB$1f.XNZw("", -851895893);
                    }
                    object2 = string2;
                    uUID = null;
                    if (!((String)object2).isEmpty()) {
                        try {
                            uUID = 7p.0((String)object2);
                            if (!\u2001\u200c\u2005\u2008) break block24;
                            throw null;
                        } catch (IllegalArgumentException illegalArgumentException) {
                            if (bl2 || bl2) return null;
                            0ay.0a.log(Level.WARN, 3J.a((int)((long)-1455796667 ^ (long)-1455805392), (int)((long)1517294496 ^ (long)-1517317570)), (Object)string, (Object)illegalArgumentException.getLocalizedMessage());
                            if (bl2) return null;
                        }
                    }
                }
                if (bl2) return null;
                if (((String)object3).equalsIgnoreCase(3J.a((int)((long)-1788076286 ^ (long)-1788052106), (int)((long)55381684 ^ (long)55397509)))) {
                    if (bl2 || bl2) return null;
                    return Optional.of(new 1w(string));
                }
            } catch (Exception exception) {
                if (bl2 || bl2) return null;
                0ay.0a.log(Level.ERROR, 3J.a((int)((long)-792991346 ^ (long)-793015300), (int)((long)-940851753 ^ (long)940862902)), (Object)exception.getLocalizedMessage());
                if (bl2) return null;
                break block25;
            }
            {
                if (bl2) return null;
                if (((String)object3).equalsIgnoreCase(3J.a((int)((long)-1581683358 ^ (long)-1581707509), (int)((long)239092439 ^ (long)239087903)))) {
                    0O o2;
                    if (bl2 || bl2) return null;
                    if (Files.exists(0, new LinkOption[(int)((long)-494067619 ^ (long)-494067619)])) {
                        if (bl2) return null;
                        o2 = 4d.1();
                        if (\u2001\u200c\u2005\u2008) {
                            throw null;
                        }
                    } else {
                        o2 = 4d.0();
                    }
                    object2 = o2;
                    object3 = o2.0(((JsonObject)object).get(3J.a((int)((long)1985693223 ^ (long)1985684555), (int)((long)-1868799631 ^ (long)-1868810585))).getAsString());
                    object = object2.0(((JsonObject)object).get(3J.a((int)((long)-55793658 ^ (long)-55784859), (int)((long)723611507 ^ (long)-723609899))).getAsString());
                    if (object3 == null || object == null) throw new NullPointerException(3J.a((int)((long)1618102665 ^ (long)1618095073), (int)((long)-1336306152 ^ (long)-1336295486)));
                    return Optional.of(new 1S((String)object3, (String)object, string, uUID));
                }
                if (((String)object3).equalsIgnoreCase(3J.a((int)((long)601394032 ^ (long)601417990), (int)((long)1462012494 ^ (long)1462013473)))) {
                    block26: {
                        object2 = ((JsonObject)object).get(3J.a((int)((long)-303413159 ^ (long)-303420882), (int)((long)916910529 ^ (long)-916886363))).getAsString();
                        object3 = null;
                        if (((JsonObject)object).has(3J.a((int)((long)295736310 ^ (long)295760275), (int)((long)-1068629275 ^ (long)1068607894)))) {
                            try {
                                object3 = 2G.2.parse((CharSequence)((JsonObject)object).get(3J.a((int)((long)737407235 ^ (long)737383266), (int)((long)415141129 ^ (long)-415169009))).getAsString(), Instant::from);
                                if (!\u2001\u200c\u2005\u2008) break block26;
                                throw null;
                            } catch (Throwable throwable) {
                                if (bl2) return null;
                            }
                        }
                    }
                    if (bl2) return null;
                    return Optional.of(new 1k((String)object2, string, (Instant)object3, uUID));
                }
                if (bl2) return null;
                if (!\u2001\u200c\u2005\u2008) break block25;
            }
            throw null;
        }
        if (!bl2) return Optional.empty();
        return null;
    }

    public final boolean 0(1R r2) {
        boolean bl2 = \u2001\u200c\u2005\u2008;
        if (bl2 || bl2) {
            return true;
        }
        return this.stream().anyMatch(r3 -> {
            boolean bl2 = \u2001\u200c\u2005\u2008;
            if (bl2 || bl2) {
                return true;
            }
            return r3.3().equalsIgnoreCase(r2.3());
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(Path path) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200c\u2005\u2008;
                if (bl2 || bl2) break block2;
                this.0(7Q.1((Path)path).1);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 1() {
        boolean bl2;
        block25: {
            block24: {
                Object object;
                bl2 = \u2001\u200c\u2005\u2008;
                if (bl2) return;
                String[] stringArray = 7b.0();
                if (bl2) return;
                try {
                    if (bl2) return;
                    object = 5d.0(Files.newBufferedReader(this.1));
                    if (!((JsonElement)object).isJsonArray()) {
                        if (bl2 || bl2) return;
                        throw new Exception(3J.a((int)((long)1201433792 ^ (long)1201409711), (int)((long)427893933 ^ (long)-427908411)));
                    }
                } catch (FileNotFoundException fileNotFoundException) {
                    block29: {
                        block28: {
                            block27: {
                                block26: {
                                    if (bl2 || bl2) return;
                                    if (!Files.exists(this.1, new LinkOption[(int)((long)-1510950354 ^ (long)-1510950354)])) {
                                        if (bl2 || bl2) return;
                                        return;
                                    }
                                    if (bl2) return;
                                    0ay.3();
                                    if (bl2) return;
                                    object = 7Q.1((Path)0ay.0((String)3J.a((int)((int)((long)350559075 ^ (long)350583045)), (int)((int)((long)-1774540876 ^ (long)1774545527))))).0;
                                    if (!((String)object).contains(0rB$1f.XNZw("\u10b7", 1853240878))) break block26;
                                    if (bl2 || bl2) return;
                                    0ay.0a.warn(3J.a((int)((long)1932932875 ^ (long)1932940666), (int)((long)1551536199 ^ (long)-1551543432)));
                                    if (bl2) return;
                                    if (stringArray != null) break block27;
                                    if (bl2) return;
                                }
                                if (bl2) return;
                                object = 4d.0().0((String)object);
                                if (bl2) return;
                            }
                            if (bl2) return;
                            if (object == null) break block28;
                            if (bl2) return;
                            if (!((String)object).isEmpty()) break block29;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    this.clear();
                    if (bl2 || bl2) return;
                    this.0(Arrays.asList(((String)object).split(0rB$1f.XNZw("\ue788", -2096905951))));
                    if (bl2 || bl2) return;
                    if (\u2001\u200c\u2005\u2008) {
                        throw null;
                    }
                    break block24;
                } catch (Exception exception) {
                    if (bl2 || bl2) return;
                    0ay.0a.log(Level.FATAL, 3J.a((int)((long)-635825360 ^ (long)-635801262), (int)((long)575693095 ^ (long)575695311)), (Object)exception.getMessage());
                    if (bl2) return;
                    break block24;
                }
                {
                    if (bl2) return;
                    this.clear();
                    if (bl2 || bl2) return;
                    ((JsonElement)object).getAsJsonArray().forEach((? super T jsonElement) -> {
                        block4: {
                            block2: {
                                boolean bl2;
                                block3: {
                                    bl2 = \u2001\u200c\u2005\u2008;
                                    if (bl2 || bl2) break block2;
                                    if (!jsonElement.isJsonObject()) break block3;
                                    if (bl2 || bl2) break block2;
                                    3J.0(jsonElement.getAsJsonObject()).ifPresent(this::add);
                                    if (bl2) break block2;
                                }
                                if (!bl2) break block4;
                            }
                            return;
                        }
                    });
                    if (bl2 || bl2) return;
                    if (!\u2001\u200c\u2005\u2008) break block24;
                }
                throw null;
            }
            if (bl2) return;
            if (!Files.exists(0, new LinkOption[(int)((long)2033800553 ^ (long)2033800553)])) {
                if (bl2) return;
                try {
                    if (bl2) return;
                    Files.createFile(0, new FileAttribute[(int)((long)253723371 ^ (long)253723371)]);
                    if (bl2 || bl2) return;
                    Files.write(0, Collections.singletonList(3J.a((int)((long)-1400179219 ^ (long)-1400203382), (int)((long)-1381595005 ^ (long)1381584997))), new OpenOption[(int)((long)1362010824 ^ (long)1362010824)]);
                    if (bl2 || bl2) return;
                    if (!\u2001\u200c\u2005\u2008) break block25;
                    throw null;
                } catch (IOException iOException) {
                    if (bl2) return;
                }
            }
        }
        if (bl2) return;
        this.0();
        if (!bl2 && !bl2) return;
    }

    public 3J() {
        boolean bl2 = \u2001\u200c\u2005\u2008;
        super(3J.a((int)((long)436726712 ^ (long)436701660), (int)((long)61105479 ^ (long)61099973)));
        0ay.3();
        this.1 = 0ay.0(3J.a((int)((long)1212215465 ^ (long)1212191426), (int)((long)-1455896761 ^ (long)1455909884)));
    }
}

