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
import java.util.Map;
import net.impactclient.0J;
import net.impactclient.0a;
import net.impactclient.0aM;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1b;
import net.impactclient.1u;
import net.impactclient.73;
import net.impactclient.9m;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 26
implements 1u {
    private static final String[] a;
    public static final boolean \u2008\u2008;
    private static final String[] b;

    /*
     * Enabled aggressive block sorting
     */
    static void 0(73 var0, JsonObject jsonObject) {
        9m m2;
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2008\u2008;
                if (bl2 || bl2) return;
                if (!jsonObject.has(26.a((int)((long)945937647 ^ (long)945940490), (int)((long)-2037840506 ^ (long)-2037829327)))) break block7;
                if (bl2) return;
                if (!jsonObject.get(26.a((int)((long)435754882 ^ (long)435757927), (int)((long)-524887358 ^ (long)-524882315))).isJsonPrimitive()) break block7;
                if (bl2) return;
                m2 = var0.3(jsonObject.get(26.a((int)((long)-474141154 ^ (long)-474146053), (int)((long)1169791820 ^ (long)1169797115))).getAsString());
                if (m2 != null) break block8;
                if (bl2) return;
            }
            if (bl2) return;
            return;
        }
        if (bl2) return;
        jsonObject.entrySet().forEach(object -> {
            boolean bl2 = \u2008\u2008;
            if (bl2 || bl2) return;
            String string = (String)object.getKey();
            if (bl2 || bl2) return;
            object = (JsonElement)object.getValue();
            if (bl2) return;
            try {
                if (bl2) return;
                if (string.equals(26.a((int)((long)-1104619541 ^ (long)-1104616695), (int)((long)-107609455 ^ (long)107587283)))) {
                    if (bl2) return;
                    if (((JsonElement)object).isJsonArray()) {
                        if (bl2 || bl2) return;
                        0J.0((1b)m2, ((JsonElement)object).getAsJsonArray());
                        if (bl2) return;
                    }
                }
                if (bl2) return;
                if (string.equals(26.a((int)((long)-284165177 ^ (long)-284176602), (int)((long)-1872631520 ^ (long)-1872631437)))) {
                    if (bl2 || bl2) return;
                    m2.0().0 = ((JsonElement)object).getAsInt();
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            } catch (Exception exception) {
                if (bl2 || bl2) return;
                0ay.0a.log(Level.WARN, 26.a((int)((long)-743872632 ^ (long)-743877780), (int)((long)-811257902 ^ (long)-811238551)), (Object)var0.2(), (Object)m2.2(), (Object)string);
                if (bl2 || bl2) return;
                return;
            }
        });
        if (!bl2 && !bl2) return;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 26.\u2008\u2008;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)274203996 ^ (long)274215358)) & (int)((long)488056289 ^ (long)488102430);
            if (var9_2) ** GOTO lbl-1000
            if (26.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 26.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)269794221 ^ (long)269794221)] & (int)((long)-398967233 ^ (long)-398967104)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)100333171 ^ (long)100333132);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)228966108 ^ (long)228966004);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-153409317 ^ (long)-153409416);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)350750763 ^ (long)350750969);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1680398007 ^ (long)-1680398057);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)440217747 ^ (long)440217667);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1487999997 ^ (long)1487999921);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1206120391 ^ (long)1206120349);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1603700026 ^ (long)-1603700099);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-1164884090 ^ (long)-1164884185);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)2111890738 ^ (long)2111890700);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)1266410784 ^ (long)1266410812);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-690319638 ^ (long)-690319739);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-1495931201 ^ (long)-1495931359);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1019066793 ^ (long)-1019066839);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1522948972 ^ (long)1522948879);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)908794369 ^ (long)908794572);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-89343487 ^ (long)-89343263);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1815897804 ^ (long)-1815897690);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1661603885 ^ (long)1661603883);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-1794413231 ^ (long)-1794413062);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)2080957482 ^ (long)2080957450);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)191603761 ^ (long)191603917);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)634349206 ^ (long)634349283);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)1594366302 ^ (long)1594366259);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1633274660 ^ (long)1633274646);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1536334951 ^ (long)-1536334958);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)951796100 ^ (long)951796206);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1602735433 ^ (long)-1602735557);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)246118242 ^ (long)246118291);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)974140525 ^ (long)974140562);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)804726281 ^ (long)804726342);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1622246654 ^ (long)-1622246641);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1408819368 ^ (long)-1408819443);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1175636141 ^ (long)-1175636078);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-545101298 ^ (long)-545101150);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)1149651348 ^ (long)1149651330);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-2128556354 ^ (long)-2128556334);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-288852576 ^ (long)-288852602);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1182067628 ^ (long)1182067537);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1472957466 ^ (long)-1472957668);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)34258209 ^ (long)34258416);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-454397000 ^ (long)-454396999);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1830793211 ^ (long)-1830793090);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-910618409 ^ (long)-910618463);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)2063593796 ^ (long)2063593947);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-1552249260 ^ (long)-1552249185);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-2002798638 ^ (long)-2002798669);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1892073035 ^ (long)1892073055);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1013959003 ^ (long)-1013959038);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-1181779683 ^ (long)-1181779656);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-2129282582 ^ (long)-2129282764);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-679531424 ^ (long)-679531273);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-583952118 ^ (long)-583951933);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)914067847 ^ (long)914067853);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1459004273 ^ (long)-1459004281);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)1340969468 ^ (long)1340969293);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1850590232 ^ (long)1850590231);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1594933824 ^ (long)1594933945);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1271532784 ^ (long)-1271532611);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)1808817526 ^ (long)1808817560);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-512011710 ^ (long)-512011681);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-2036966513 ^ (long)-2036966584);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)588978609 ^ (long)588978611);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)100240535 ^ (long)100240462);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1164539915 ^ (long)-1164540065);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-87678679 ^ (long)-87678479);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-757224779 ^ (long)-757224950);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-1042939525 ^ (long)-1042939500);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)863736575 ^ (long)863736463);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-273925261 ^ (long)-273925302);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1061640798 ^ (long)-1061640811);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1613939748 ^ (long)-1613939883);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1394407216 ^ (long)-1394407406);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-2034626084 ^ (long)-2034626085);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-1992920307 ^ (long)-1992920263);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-298342128 ^ (long)-298341912);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1922767817 ^ (long)-1922767757);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-175072368 ^ (long)-175072299);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)2046733492 ^ (long)2046733432);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-50602998 ^ (long)-50602921);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-788088013 ^ (long)-788087888);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-916395546 ^ (long)-916395653);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-57721413 ^ (long)-57721475);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-1977179472 ^ (long)-1977179520);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-1531343469 ^ (long)-1531343400);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1301758194 ^ (long)1301758079);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)612119573 ^ (long)612119778);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)438852561 ^ (long)438852583);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-699334619 ^ (long)-699334631);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)113547393 ^ (long)113547517);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)1518412020 ^ (long)1518411889);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1213581897 ^ (long)-1213581986);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)1124665377 ^ (long)1124665525);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1549581113 ^ (long)-1549581163);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)703959514 ^ (long)703959312);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)650360215 ^ (long)650360182);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1268771325 ^ (long)1268771227);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1746379038 ^ (long)1746379087);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-337449074 ^ (long)-337449093);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1303530846 ^ (long)1303530757);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1619781374 ^ (long)1619781244);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)1277276709 ^ (long)1277276870);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1201104153 ^ (long)-1201104220);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)827460639 ^ (long)827460661);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)1033011543 ^ (long)1033011506);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-84538204 ^ (long)-84538134);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)344155246 ^ (long)344155275);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)295442589 ^ (long)295442629);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)1423743778 ^ (long)1423743794);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)682931587 ^ (long)682931616);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1317022064 ^ (long)1317022006);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-173143315 ^ (long)-173143434);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1243786503 ^ (long)-1243786613);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)950569287 ^ (long)950569359);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)303008674 ^ (long)303008591);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)715162781 ^ (long)715162663);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)678704965 ^ (long)678704965);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)462748844 ^ (long)462748859);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-295028190 ^ (long)-295028181);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-1008662846 ^ (long)-1008662983);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)286392228 ^ (long)0x1111FF13);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-2073159648 ^ (long)-2073159552);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1855229900 ^ (long)1855229818);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-345169320 ^ (long)-345169317);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-1382795433 ^ (long)-1382795285);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-34533942 ^ (long)-34534086);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-174758004 ^ (long)-174757962);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)893942086 ^ (long)893942177);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-2129810433 ^ (long)-2129810525);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)737955351 ^ (long)737955330);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-95705578 ^ (long)-95705426);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1554358253 ^ (long)-1554358119);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)798536986 ^ (long)798537124);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-2016903587 ^ (long)-2016903534);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)640706361 ^ (long)640706382);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)920393525 ^ (long)920393486);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1063235883 ^ (long)-1063235890);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)75613860 ^ (long)75613719);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)854879189 ^ (long)854879180);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)881709836 ^ (long)881710040);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-725779236 ^ (long)-725779212);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1314119865 ^ (long)1314119902);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-744677138 ^ (long)-744677231);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)634784277 ^ (long)634784397);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-2120986490 ^ (long)-2120986590);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-925649784 ^ (long)-925649874);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1453762335 ^ (long)-1453762306);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-792009388 ^ (long)-792009409);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-2111735857 ^ (long)-2111736039);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-562877923 ^ (long)-562877884);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1390187691 ^ (long)-1390187729);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1499782026 ^ (long)1499782087);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-604303482 ^ (long)-604303585);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)1098320924 ^ (long)1098320957);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1893237650 ^ (long)-1893237540);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1693917777 ^ (long)1693917838);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1711456236 ^ (long)-1711456126);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1615526593 ^ (long)-1615526484);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-823560223 ^ (long)-823560347);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)776480258 ^ (long)776480378);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-625741935 ^ (long)-625742029);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1578325488 ^ (long)1578325262);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)139721217 ^ (long)139721317);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1450105794 ^ (long)1450105687);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)1291738209 ^ (long)1291738115);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)604634023 ^ (long)604633972);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-765621233 ^ (long)-765621134);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)637453766 ^ (long)637453711);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-812167058 ^ (long)-812167139);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-944619893 ^ (long)-944619879);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-1418971105 ^ (long)-1418970913);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1117422658 ^ (long)1117422828);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-726702236 ^ (long)-726702324);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)2007473832 ^ (long)2007473779);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-1030741999 ^ (long)-1030741912);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-2055740011 ^ (long)-2055740026);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1383840539 ^ (long)1383840533);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-63435803 ^ (long)-63436000);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-2132979622 ^ (long)-2132979571);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-2068497578 ^ (long)-2068497438);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-1974881637 ^ (long)-1974881572);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1347938971 ^ (long)-1347938975);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)2120594702 ^ (long)2120594722);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)573755683 ^ (long)573755678);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-1038636363 ^ (long)-1038636416);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-1819972528 ^ (long)-1819972481);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)591054612 ^ (long)591054740);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)1674479743 ^ (long)1674479659);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1987319541 ^ (long)1987319365);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1448498751 ^ (long)1448498851);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)518150444 ^ (long)518150563);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)641706631 ^ (long)641706708);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-1240934849 ^ (long)-1240934707);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1815662862 ^ (long)-1815662973);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-279717394 ^ (long)-279717435);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-371495882 ^ (long)-371495922);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-935090023 ^ (long)-935090089);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)348318081 ^ (long)348318153);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-2058856533 ^ (long)-2058856660);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1787905062 ^ (long)-1787905084);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-393459773 ^ (long)-393459862);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-419843992 ^ (long)-419843925);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-369390009 ^ (long)-369390056);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1826997278 ^ (long)1826997482);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)1011089563 ^ (long)1011089586);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)911970988 ^ (long)911971010);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1947523217 ^ (long)1947523200);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1547019200 ^ (long)1547019224);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)932200918 ^ (long)932200854);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)780147383 ^ (long)780147239);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)652419076 ^ (long)652419102);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)509699849 ^ (long)509700095);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)332912133 ^ (long)332912365);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-440246503 ^ (long)-440246455);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)466577995 ^ (long)466578071);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-1637142003 ^ (long)-1637141907);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1259832133 ^ (long)1259832079);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-522979927 ^ (long)-522980057);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-458169155 ^ (long)-458169326);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1289017097 ^ (long)1289017100);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1538301413 ^ (long)1538301193);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)267380831 ^ (long)267380891);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-2079610433 ^ (long)-2079610469);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-1392022130 ^ (long)-1392022100);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1643372904 ^ (long)-1643372987);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-949701419 ^ (long)-949701583);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1610851902 ^ (long)1610851859);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)1008378284 ^ (long)1008378148);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1980510091 ^ (long)1980510178);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)262350247 ^ (long)262350106);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-863353618 ^ (long)-863353827);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-343980899 ^ (long)-343981020);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1477336367 ^ (long)1477336321);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-2053263901 ^ (long)-2053264014);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1764200626 ^ (long)-1764200679);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)759210684 ^ (long)759210639);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1942275551 ^ (long)-1942275450);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-179306638 ^ (long)-179306685);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-974385077 ^ (long)-974385142);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-820623014 ^ (long)-820623092);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1756389852 ^ (long)1756389722);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-81053993 ^ (long)-81054116);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-254101481 ^ (long)-254101259);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)886215108 ^ (long)886215112);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)752920418 ^ (long)752920342);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)711121666 ^ (long)711121728);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-1861611390 ^ (long)-1861611415);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-569593537 ^ (long)-569593435);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1373297533 ^ (long)1373297575);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1071228322 ^ (long)-1071228277);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1453332196 ^ (long)1453332049);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1451466129 ^ (long)1451466036);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-283788866 ^ (long)-283788968);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1434887916 ^ (long)-1434887787);
                    if (!26.\u2008\u2008) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1526576648 ^ (long)1526576866);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1361287139 ^ (long)1361286940)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)39542485 ^ (long)39559466)) >>> (int)((long)1561827836 ^ (long)1561827828)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)541225071 ^ (long)541225071);
            if (!26.\u2008\u2008) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1357850671 ^ (long)1357850669);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1014335132 ^ (long)1014335135) | var5_6 << (int)((long)-1742065169 ^ (long)-1742065174)) ^ var3_4[var7_8]) & (int)((long)-1202316785 ^ (long)-1202316560);
                    if (26.\u2008\u2008) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-864691035 ^ (long)-864691034) | var6_7 << (int)((long)261379679 ^ (long)261379674)) ^ var3_4[var7_8]) & (int)((long)-2112904713 ^ (long)-2112904952);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            26.b[var2_3] = new String(var3_4).intern();
        }
        return 26.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(0a a2, JsonArray jsonArray) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2008;
                if (bl2 || bl2) break block2;
                jsonArray.forEach(jsonElement -> {
                    boolean bl2;
                    block11: {
                        block10: {
                            bl2 = \u2008\u2008;
                            if (bl2 || bl2) return;
                            if (!jsonElement.isJsonObject()) {
                                if (bl2 || bl2) return;
                                return;
                            }
                            if (bl2) return;
                            if (!((JsonObject)(jsonElement = jsonElement.getAsJsonObject())).has(26.a((int)((long)-1727740577 ^ (long)-1727729223), (int)((long)1112345760 ^ (long)-1112360790)))) break block10;
                            if (bl2) return;
                            if (!((JsonObject)jsonElement).get(26.a((int)((long)-332432340 ^ (long)-332445495), (int)((long)-924313601 ^ (long)-924310712))).isJsonPrimitive()) break block10;
                            if (bl2) return;
                            a2 = ((0a)object).1.2(((JsonObject)jsonElement).get(26.a((int)((long)2027755465 ^ (long)2027758380), (int)((long)-1601301002 ^ (long)-1601298111))).getAsString());
                            if (a2 != null) break block11;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        return;
                    }
                    if (bl2) return;
                    ((JsonObject)jsonElement).entrySet().forEach(arg_0 -> 26.0((73)((Object)a2), arg_0));
                    if (!bl2 && !bl2) return;
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 26() {
        boolean bl2 = \u2008\u2008;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void 0(73 var0, Map.Entry object) {
        boolean bl2 = \u2008\u2008;
        if (bl2 || bl2) return;
        String string = (String)object.getKey();
        if (bl2 || bl2) return;
        object = (JsonElement)object.getValue();
        if (bl2) return;
        try {
            if (bl2) return;
            if (string.equals(26.a((int)((long)1658665825 ^ (long)1658654594), (int)((long)-1466447627 ^ (long)1466441629)))) {
                if (bl2) return;
                if (((JsonElement)object).isJsonArray()) {
                    if (bl2 || bl2) return;
                    0J.0((1b)var0, ((JsonElement)object).getAsJsonArray());
                    if (bl2) return;
                }
            }
            if (bl2) return;
            if (string.equals(26.a((int)((long)-200194355 ^ (long)-200183254), (int)((long)2084946137 ^ (long)-2084957149)))) {
                if (bl2) return;
                if (((JsonElement)object).isJsonArray()) {
                    if (bl2) return;
                    if (var0.7()) {
                        if (bl2 || bl2) return;
                        ((JsonElement)object).getAsJsonArray().forEach(jsonElement -> {
                            block4: {
                                block2: {
                                    boolean bl2;
                                    block3: {
                                        bl2 = \u2008\u2008;
                                        if (bl2 || bl2) break block2;
                                        if (!jsonElement.isJsonObject()) break block3;
                                        if (bl2 || bl2) break block2;
                                        26.0(var0, jsonElement.getAsJsonObject());
                                        if (bl2) break block2;
                                    }
                                    if (!bl2) break block4;
                                }
                                return;
                            }
                        });
                        if (bl2) return;
                    }
                }
            }
            if (bl2) return;
            0aM.0(var0, string, (JsonElement)object);
            if (bl2 || bl2) return;
            return;
        } catch (Exception exception) {
            if (bl2 || bl2) return;
            0ay.0a.log(Level.WARN, 26.a((int)((long)1800107872 ^ (long)1800094592), (int)((long)-1387773584 ^ (long)1387773949)), (Object)var0.2(), (Object)string);
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 26.\u2008\u2008;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-420947 ^ (long)-420955)];
            if (var7) break block23;
            var3_2 = (int)((long)-456714563 ^ (long)-456714563);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\uef6e\uc7ba\u04af\uf9b9\uef5c\uc7b6\u0484\uf904\uef5f\uc75a\u0488\uf9d8\uef9f\uc76e\u0461\uf921\uefb3\uc706\u04cd\uf997\uefe0\uc737\u042d\uf907\uefa7\uc789\u04e5\uf975\uefa6\uc7f7\u0423\uf941\ueff4\uc792\u0425\uf93c\uefea\uc764\u044d\uf943\uef2d\uc7b8\u043c\uf9da\uef2f\uc72e\u0486\uf94f\uef2c\uc7a7\u04fe\uf930\ueff0\uc780\u0466\uf9ee\uef92\uc779\u04ad\uf9b0\uefbe\uc7af", 457427431);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-657688527 ^ (long)-657688521);
            if (var7) break block23;
            var0_6 = (int)((long)1756417255 ^ (long)-1756417256);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-1957915452 ^ (long)-1957915494);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)-1170822144 ^ (long)1170822143);
                    if (26.\u2008\u2008) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!26.\u2008\u2008) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\uccdf\ue4ea\u27d5\uda4c\uccb0\ue4ed\u27fe\uda4b\ucc5f\ue4bb\u2758\uda2d\uccab\ue4d2\u27de\uda30\ucc9d\ue48a\u2792\udad8\ucc58\ue446\u27f4\uda18\ucc3f\ue4ff\u27d2\uda1c\ucc72\ue47d\u2757\udae9\uccfb\ue4bb\u27c0\uda8a\ucc91\ue4b6\u274c\uda2e", 1993730653);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-1522301038 ^ (long)-1522301007);
                            var0_6 = (int)((long)-358178389 ^ (long)358178388);
                            while (true) {
                                v0 = (int)((long)1957901649 ^ (long)1957901601);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)2136856716 ^ (long)2136856716);
                                if (!26.\u2008\u2008) break block20;
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
                                if (!26.\u2008\u2008) ** continue;
                                throw null;
                            }
                            26.a = var5_1;
                            26.b = new String[(int)((long)-1819524012 ^ (long)-1819524004)];
                            if (!26.\u2008\u2008) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)1782443680 ^ (long)1782443680);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)1592297206 ^ (long)1592297207)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)2139813369 ^ (long)2139813374)) {
                                case 0: {
                                    v15 = (int)((long)-916185513 ^ (long)-916185571);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)82205210 ^ (long)82205228);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-37799930 ^ (long)-37799908);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)538516707 ^ (long)538516635);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-1802961298 ^ (long)-1802961326);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-74331812 ^ (long)-74331865);
                                    if (!26.\u2008\u2008) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)0x1AA66A6 ^ (long)27944683);
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
                        } while (!26.\u2008\u2008);
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
}

