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
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.3Z;
import net.impactclient.5d;
import net.impactclient.6r;
import net.impactclient.7Q;
import net.impactclient.7b;
import net.impactclient.9O;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 4V
implements 6r {
    public static final boolean \u2003\u200c\u2008\u2002\u200d\u2000;
    private static final String[] a;
    private static final String[] b;
    private final Path 0;

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 4V.\u2003\u200c\u2008\u2002\u200d\u2000;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-2011378657 ^ (long)-2011388280)) & (int)((long)-273753134 ^ (long)-273800147);
            if (var9_2) ** GOTO lbl-1000
            if (4V.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 4V.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-124656682 ^ (long)-124656682)] & (int)((long)1131574913 ^ (long)1131574910)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1071424343 ^ (long)1071424432);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-38589309 ^ (long)-38589333);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1647584114 ^ (long)-1647584098);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)2080994657 ^ (long)2080994670);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1739678719 ^ (long)1739678493);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1531741874 ^ (long)-1531741699);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-787074895 ^ (long)-787074960);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)474447054 ^ (long)474446909);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1020470846 ^ (long)-1020470814);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1741838684 ^ (long)1741838822);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-632307568 ^ (long)-632307547);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1786875072 ^ (long)-1786874920);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)597948211 ^ (long)597948241);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-951668569 ^ (long)-951668736);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1958550538 ^ (long)-1958550572);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-1568305532 ^ (long)-1568305611);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)168774019 ^ (long)168774015);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1933765186 ^ (long)-1933765192);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)345979298 ^ (long)345979389);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-899872832 ^ (long)-899872934);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)852961962 ^ (long)852961865);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-865680530 ^ (long)-865680395);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)474149976 ^ (long)474150003);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-1075012544 ^ (long)-1075012583);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-1796410156 ^ (long)-1796410156);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1572999301 ^ (long)1572999337);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1241320009 ^ (long)1241320113);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)712074589 ^ (long)712074526);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1558250648 ^ (long)-1558250590);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-743146623 ^ (long)-743146510);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)723962680 ^ (long)723962872);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1356000742 ^ (long)1356000592);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)1252397860 ^ (long)1252397870);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)2096339594 ^ (long)2096339642);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-460106986 ^ (long)-460106928);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-1075920542 ^ (long)-1075920418);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)317660814 ^ (long)317660704);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-989510214 ^ (long)-989510193);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1831621951 ^ (long)-1831621957);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-719411176 ^ (long)-719410998);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-421682977 ^ (long)-421683192);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1229746697 ^ (long)1229746740);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1352162951 ^ (long)1352163007);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)301878963 ^ (long)301878829);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)1076821499 ^ (long)1076821348);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1604050599 ^ (long)1604050687);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)708533538 ^ (long)708533623);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)1028934130 ^ (long)1028934071);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-329042648 ^ (long)-329042599);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)1884568368 ^ (long)1884568345);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)448920595 ^ (long)448920722);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1233317778 ^ (long)-1233317851);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)970856854 ^ (long)970856812);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-95617074 ^ (long)-95617248);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)987103129 ^ (long)987103158);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1842390841 ^ (long)-1842390933);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1089351040 ^ (long)-1089351041);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)2076662285 ^ (long)2076662313);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-113973482 ^ (long)-113973361);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-664015634 ^ (long)-664015828);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-2133080997 ^ (long)-2133081079);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1346761432 ^ (long)1346761216);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)36139186 ^ (long)36139222);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)528785036 ^ (long)528784952);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1970525178 ^ (long)1970525042);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)703712494 ^ (long)703712345);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1519500804 ^ (long)1519500975);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1416237311 ^ (long)-1416237251);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1640197455 ^ (long)1640197558);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-1278320304 ^ (long)-1278320372);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-809289871 ^ (long)-809289768);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)1367312820 ^ (long)1367312753);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-612881855 ^ (long)-612881803);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)896274657 ^ (long)896274477);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1094746435 ^ (long)1094746488);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1038555131 ^ (long)-1038555064);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1294935471 ^ (long)-1294935319);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)1592684545 ^ (long)1592684621);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)368910351 ^ (long)368910350);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-1242175030 ^ (long)-1242175230);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)196065157 ^ (long)196065057);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-1249245639 ^ (long)-1249245612);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-704307277 ^ (long)-704307339);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1581795238 ^ (long)1581795130);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-403304789 ^ (long)-403304865);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)408951329 ^ (long)408951382);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)2101823094 ^ (long)2101823148);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-874806494 ^ (long)-874806295);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1996185109 ^ (long)-1996185342);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-1264376588 ^ (long)-1264376815);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)389004189 ^ (long)389004286);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)736707419 ^ (long)736707410);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1296630419 ^ (long)-1296630527);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-514568757 ^ (long)-514568898);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1078893836 ^ (long)1078893846);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)276682108 ^ (long)276682074);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1399717435 ^ (long)-1399717451);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1811595379 ^ (long)1811595481);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)567432291 ^ (long)567432322);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)564446331 ^ (long)564446461);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-865634494 ^ (long)-865634459);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-962604020 ^ (long)-962603835);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-456957726 ^ (long)-456957721);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)1815523905 ^ (long)1815523989);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1662845060 ^ (long)-1662844929);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-36831133 ^ (long)-36831191);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-682648163 ^ (long)-682648243);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1852194611 ^ (long)-1852194765);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)983979995 ^ (long)983979968);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)626367007 ^ (long)626367069);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)784687069 ^ (long)784686920);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1783581668 ^ (long)1783581633);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1095699401 ^ (long)1095699267);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)277361718 ^ (long)277361669);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1527941009 ^ (long)-1527940960);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-309671535 ^ (long)-309671547);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1580832015 ^ (long)-1580832118);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1574150456 ^ (long)1574150625);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-100303782 ^ (long)-100303835);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)433066338 ^ (long)433066297);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)775081665 ^ (long)775081707);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1399364508 ^ (long)-1399364461);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1961955680 ^ (long)-1961955618);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-877910803 ^ (long)-877910864);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)1540691233 ^ (long)1540691223);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1205060843 ^ (long)1205060795);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-114429781 ^ (long)-114429784);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1235167000 ^ (long)1235167056);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)1119774412 ^ (long)1119774431);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)341726612 ^ (long)341726707);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)55983571 ^ (long)55983477);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1226844343 ^ (long)1226844375);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1696494635 ^ (long)-1696494809);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1188210585 ^ (long)-1188210609);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)878938699 ^ (long)878938707);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)972355264 ^ (long)972355256);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1761507543 ^ (long)-1761507541);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-982469549 ^ (long)-982469566);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)420104212 ^ (long)420104203);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-2023136447 ^ (long)-2023136385);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)768664964 ^ (long)768665070);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)812146677 ^ (long)812146556);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)237369335 ^ (long)237369288);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)305843492 ^ (long)305843514);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1650427274 ^ (long)1650427143);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)852068933 ^ (long)852068881);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-1974326602 ^ (long)-1974326757);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)437048074 ^ (long)437048183);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)474204725 ^ (long)474204867);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)1909152285 ^ (long)1909152509);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)689231079 ^ (long)689231083);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1845754735 ^ (long)1845754800);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-784043105 ^ (long)-784043235);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1602159501 ^ (long)-1602159390);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)2030050392 ^ (long)2030050460);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)200703175 ^ (long)200703230);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1465838190 ^ (long)-1465838159);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1207834892 ^ (long)1207834986);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)515930332 ^ (long)515930192);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-83653419 ^ (long)-83653550);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1524110096 ^ (long)1524110167);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)337216653 ^ (long)337216703);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)873122375 ^ (long)873122558);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-1991681643 ^ (long)-1991681657);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-1923005045 ^ (long)-1923005153);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-877168781 ^ (long)-877168785);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-1517750481 ^ (long)-1517750492);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)2069024791 ^ (long)2069024952);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1430202897 ^ (long)-1430203022);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1645510847 ^ (long)1645510687);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)14695232 ^ (long)14695211);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1175110350 ^ (long)1175110213);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-210205798 ^ (long)-210205913);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)1365963512 ^ (long)1365963292);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1019248115 ^ (long)1019247987);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)620771227 ^ (long)620771118);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-626052387 ^ (long)-626052437);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1850018358 ^ (long)1850018354);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-338830456 ^ (long)-338830499);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-2025502681 ^ (long)-2025502714);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1449921152 ^ (long)1449921102);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)258189376 ^ (long)258189526);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)1956738105 ^ (long)1956738140);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)309273282 ^ (long)309273264);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)711466786 ^ (long)711467004);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-2131329547 ^ (long)-2131329560);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1096634783 ^ (long)-1096634735);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1607151424 ^ (long)-1607151519);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)583979095 ^ (long)583979178);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1486162918 ^ (long)1486162923);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-991022730 ^ (long)-991022691);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1705095428 ^ (long)1705095511);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)2131602814 ^ (long)2131602792);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1640833496 ^ (long)1640833436);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)2069684976 ^ (long)2069684906);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-322633388 ^ (long)-322633282);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1689741720 ^ (long)-1689741689);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)1211118070 ^ (long)1211117983);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-1698250222 ^ (long)-1698250118);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1245048669 ^ (long)1245048806);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1484828967 ^ (long)-1484829081);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-118855962 ^ (long)-118856124);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-849446709 ^ (long)-849446756);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1112538232 ^ (long)1112538134);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1949555258 ^ (long)-1949555320);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1171016803 ^ (long)-1171016935);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1040857067 ^ (long)1040856932);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-528723878 ^ (long)-528723930);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1493491408 ^ (long)1493491267);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-1196640720 ^ (long)-1196640515);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)769692910 ^ (long)769692723);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1084825638 ^ (long)-1084825782);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)276476097 ^ (long)276476046);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1693531006 ^ (long)1693530887);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)1151035701 ^ (long)1151035864);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1299245375 ^ (long)-1299245520);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-1269616519 ^ (long)-1269616475);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)686194908 ^ (long)686194736);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)142802129 ^ (long)142802017);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-492597886 ^ (long)-492597977);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)2008645092 ^ (long)2008645045);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)18846935 ^ (long)18846784);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)291659872 ^ (long)291659863);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1988865059 ^ (long)1988865221);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-304122032 ^ (long)-304121886);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1067638572 ^ (long)-1067638535);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1837955346 ^ (long)-1837955523);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-632623850 ^ (long)-632623682);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)542496293 ^ (long)542496364);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-268839513 ^ (long)-268839580);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1742928430 ^ (long)-1742928408);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-390601631 ^ (long)-390601707);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1661251829 ^ (long)-1661251782);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1925747340 ^ (long)1925747290);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)683108622 ^ (long)683108809);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1086951067 ^ (long)1086951042);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1505323169 ^ (long)1505323055);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-117648573 ^ (long)-117648637);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1616732883 ^ (long)-1616732852);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1172007829 ^ (long)1172007883);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)418774529 ^ (long)418774746);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-657365608 ^ (long)-657365601);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)467335432 ^ (long)467335527);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)793329610 ^ (long)793329604);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)445450669 ^ (long)445450661);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-30775308 ^ (long)-30775465);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-506448501 ^ (long)-506448438);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)1556238915 ^ (long)1556238869);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)301969980 ^ (long)301969963);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-285460105 ^ (long)-285460126);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)213839648 ^ (long)213839857);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1796906049 ^ (long)-1796906182);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1606526371 ^ (long)1606526236);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-1305815082 ^ (long)-1305815228);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)1472732006 ^ (long)1472731976);
                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-25180481 ^ (long)-25180604);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)364746373 ^ (long)364746362)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1037187223 ^ (long)1037223784)) >>> (int)((long)-2090686968 ^ (long)-2090686976)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)581447153 ^ (long)581447153);
            if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1917817593 ^ (long)-1917817595);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-230886571 ^ (long)-230886570) | var5_6 << (int)((long)1175593430 ^ (long)1175593427)) ^ var3_4[var7_8]) & (int)((long)-1327238228 ^ (long)-1327238317);
                    if (4V.\u2003\u200c\u2008\u2002\u200d\u2000) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)667946467 ^ (long)667946464) | var6_7 << (int)((long)1257519672 ^ (long)1257519677)) ^ var3_4[var7_8]) & (int)((long)1390975826 ^ (long)1390975917);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            4V.b[var2_3] = new String(var3_4).intern();
        }
        return 4V.b[var2_3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                var7 = 4V.\u2003\u200c\u2008\u2002\u200d\u2000;
                if (!var7) break block15;
                break block16;
            }
            var5_1 = new String[(int)((long)158854242 ^ (long)158854241)];
            if (var7) break block16;
            var3_2 = (int)((long)929129551 ^ (long)929129551);
            if (var7) break block16;
            var2_3 = 0rB$1f.XNZw("\u508e\u7897\ubb84\u469b\u5036\u78ae\ubbe6\u469f\u50c2\u788d\ubb44\u46f9\u502f\u7857\ubb25\u46b1\u50e7\u78e0\ubbf8\u4612\u500e\u781a\ubb30\u4683\u5093\u78f5\ubb85\u467e\u508e\u78ed\ubb3b\u46ce\u5009\u7849\ubb99\u4687\u50a2\u7859\ubb01\u4642\u5086\u7895\ubbf0\u46f8\u5000\u7861\ubb1c\u4664\u5024\u78e4\ubb44\u46c7\u50cb\u782e\ubb7d\u46cb\u50be\u7821\ubb26\u46e4\u5051\u7819\ubbdd\u46e3\u5083\u7840\ubb19\u46f8\u50e9\u780c\ubbfd\u46d8\u5050\u7875\ubb8a\u4687\u50ce\u78fd\ubb72\u4637\u5093\u78e1\ubbcc\u46f5\u50a6\u78e5\ubb8e\u464c\u50c3\u7889\ubb79\u4654\u50cc\u78f1\ubb35\u460f\u50d2\u7884\ubb08\u46c4\u5042\u7862\ubbaf\u46f9\u502a\u78e8\ubb2e\u467c\u502e\u7869\ubbcb\u46d8\u50db\u7866\ubb5a\u4698\u5065\u7843", 306214520);
            var4_4 = var2_3.length();
            if (var7) break block16;
            var1_5 = (int)((long)1145728665 ^ (long)1145728698);
            if (var7) break block16;
            var0_6 = (int)((long)-1429882583 ^ (long)1429882582);
            if (var7) break block16;
            block8: while (!var7) {
                v0 = ++var0_6;
                v1 = (int)((long)1331502336 ^ (long)-1331502337);
                if (4V.\u2003\u200c\u2008\u2002\u200d\u2000) {
                    throw null;
                    while (true) {
                        var5_1[var3_2++] = new String(v2).intern();
                        if ((var0_6 += var1_5) < var4_4) {
                            var1_5 = var2_3.charAt(var0_6);
                            if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) continue block8;
                            throw null;
                        }
                        4V.a = var5_1;
                        4V.b = new String[(int)((long)1874948838 ^ (long)1874948837)];
                        if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break block8;
                        throw null;
                    }
                }
                v3 = var2_3.substring(v0, v0 + var1_5).toCharArray();
                v4 = v3.length;
                var6_7 = (int)((long)1504212367 ^ (long)1504212367);
                v5 = (int)((long)-678887347 ^ (long)-678887350);
                v6 = v3;
                v7 = v4;
                if (v4 > (int)((long)-1096490346 ^ (long)-1096490345)) ** GOTO lbl87
                do {
                    block14: {
                        v8 = v5;
                        v6 = v6;
                        v9 = v6;
                        v10 = v5;
                        v11 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-372717582 ^ (long)-372717579)) {
                                case 0: {
                                    v12 = (int)((long)-1239870479 ^ (long)-1239870570);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                case 1: {
                                    v12 = (int)((long)-1726122802 ^ (long)-1726122880);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                case 2: {
                                    v12 = (int)((long)1867789788 ^ (long)1867789783);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                case 3: {
                                    v12 = (int)((long)1858423901 ^ (long)1858423882);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                case 4: {
                                    v12 = (int)((long)1940963125 ^ (long)1940963105);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                case 5: {
                                    v12 = (int)((long)-948217028 ^ (long)-948217077);
                                    if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) break;
                                    throw null;
                                }
                                default: {
                                    v12 = (int)((long)1412917212 ^ (long)1412917139);
                                }
                            }
                            v9[v11] = (char)(v9[v11] ^ (v10 ^ v12));
                            ++var6_7;
                            v5 = v8;
                            if (v8 != 0) break block14;
                            v8 = v5;
                            v6 = v6;
                            v11 = v5;
                            v9 = v6;
                            v10 = v5;
                        } while (!4V.\u2003\u200c\u2008\u2002\u200d\u2000);
                        throw null;
                    }
                    v2 = v6;
                    v7 = v7;
                } while (v7 > var6_7);
                if (!4V.\u2003\u200c\u2008\u2002\u200d\u2000) ** continue;
                throw null;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0() {
        boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
        if (bl2 || bl2) return;
        if (!Files.exists(this.0, new LinkOption[(int)((long)1408715015 ^ (long)1408715015)])) {
            if (bl2 || bl2) return;
            7Q.0(this.0);
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        JsonObject jsonObject = new JsonObject();
        if (bl2 || bl2) return;
        0ay.3().5.0(9O.class).8.int2ObjectEntrySet().forEach(entry -> {
            block3: {
                block2: {
                    boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
                    if (bl2 || bl2) break block2;
                    JsonArray jsonArray = new JsonArray();
                    if (bl2 || bl2) break block2;
                    ((List)entry.getValue()).forEach(z2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
                                if (bl2 || bl2) break block2;
                                JsonObject jsonObject = new JsonObject();
                                jsonObject.addProperty(0rB$1f.XNZw("\ud5d7", -684526751), z2.2);
                                if (bl2 || bl2) break block2;
                                jsonObject.addProperty(0rB$1f.XNZw("\u45bf", -1410768120), z2.0);
                                if (bl2 || bl2) break block2;
                                jsonObject.addProperty(0rB$1f.XNZw("\uda89", -340132803), z2.1);
                                if (bl2 || bl2) break block2;
                                jsonArray.add(jsonObject);
                                if (!bl2 && !bl2) break block3;
                            }
                            return;
                        }
                    });
                    if (bl2 || bl2) break block2;
                    jsonObject.add(String.valueOf(entry.getIntKey()), jsonArray);
                    if (!bl2 && !bl2) break block3;
                }
                return;
            }
        });
        if (bl2 || bl2) return;
        5d.0(jsonObject, this.0);
        if (!bl2 && !bl2) return;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 1() {
        JsonElement jsonElement;
        boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
        if (bl2) return;
        try {
            if (bl2) return;
            jsonElement = 5d.0(Files.newBufferedReader(this.0));
            if (!jsonElement.isJsonObject()) {
                if (bl2 || bl2) return;
                throw new Exception(4V.a((int)((long)2099446759 ^ (long)2099472754), (int)((long)1662497752 ^ (long)-1662500993)));
            }
        } catch (Exception exception) {
            if (bl2 || bl2) return;
            0ay.0a.log(Level.FATAL, 4V.a((int)((long)-2065388752 ^ (long)-2065383001), (int)((long)-48376755 ^ (long)-48390469)), (Object)exception.getMessage());
            if (bl2 || bl2) return;
            return;
        }
        {
            if (bl2) return;
            9O o2 = 0ay.3().5.0(9O.class);
            o2.3();
            if (bl2 || bl2) return;
            jsonElement.getAsJsonObject().entrySet().forEach(entry -> {
                boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
                if (bl2) return;
                String[] stringArray = 7b.0();
                if (bl2) return;
                try {
                    if (bl2) return;
                    int n2 = Integer.parseInt((String)entry.getKey());
                    if (bl2 || bl2) return;
                    Iterator<JsonElement> iterator = ((JsonElement)entry.getValue()).getAsJsonArray().iterator();
                    if (bl2) return;
                    while (!bl2) {
                        if (iterator.hasNext()) {
                            if (bl2) return;
                            JsonElement jsonElement = iterator.next();
                            if (bl2 || bl2) return;
                            o2.0(n2).add(new 3Z(jsonElement.getAsJsonObject().get(0rB$1f.XNZw("\uf477", 711316161)).getAsDouble(), jsonElement.getAsJsonObject().get(0rB$1f.XNZw("\udb1e", -1213923927)).getAsDouble(), jsonElement.getAsJsonObject().get(0rB$1f.XNZw("\u2b6e", 1717898714)).getAsDouble()));
                            if (bl2 || bl2) return;
                            if (stringArray != null) continue;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    return;
                } catch (Exception exception) {
                    if (bl2 || bl2) return;
                    0ay.0a.log(Level.FATAL, 4V.a((int)((long)-1701711563 ^ (long)-1701733469), (int)((long)-1460092888 ^ (long)-1460081996)), entry.getKey());
                    if (bl2 || bl2) return;
                    return;
                }
            });
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 4V(Path path) {
        block3: {
            block2: {
                boolean bl2 = \u2003\u200c\u2008\u2002\u200d\u2000;
                if (bl2 || bl2) break block2;
                this.0 = path;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

