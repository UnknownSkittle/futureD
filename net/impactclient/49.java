/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.utils.Helper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.SignatureException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 49
implements Helper {
    public final String 4;
    private static final String[] a;
    private final boolean 2;
    public static final boolean \u2007\u2002\u2007\u2007\u2006\u2006;
    private final String 3;
    @Nullable
    private static final JwtParser 0;
    private static final String[] b;
    private final List<String> 1;

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 49.\u2007\u2002\u2007\u2007\u2006\u2006;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-361840390 ^ (long)361843085)) & (int)((long)-1451996499 ^ (long)-1451969198);
            if (var9_2) ** GOTO lbl-1000
            if (49.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 49.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)1776102316 ^ (long)1776102316)] & (int)((long)-116608346 ^ (long)-116608423)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1855239057 ^ (long)1855239115);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1774131558 ^ (long)-1774131564);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-49894826 ^ (long)-49894901);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-680920062 ^ (long)-680919942);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)2022429764 ^ (long)2022429939);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)616696926 ^ (long)616696859);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)320015426 ^ (long)320015498);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1108878644 ^ (long)1108878605);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1940425541 ^ (long)-1940425666);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)402088905 ^ (long)402088899);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)983833988 ^ (long)983834102);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1965186242 ^ (long)-1965186101);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1098265997 ^ (long)-1098265906);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-2058567374 ^ (long)-2058567357);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)464994293 ^ (long)464994219);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)179262942 ^ (long)179262765);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)2011027614 ^ (long)2011027579);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)1086019703 ^ (long)1086019688);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1635527276 ^ (long)-1635527318);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-900642708 ^ (long)-900642811);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-114372231 ^ (long)-114372109);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)168887404 ^ (long)168887520);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1799191557 ^ (long)1799191744);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)113031603 ^ (long)113031495);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-426015182 ^ (long)-426015031);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1418705267 ^ (long)-1418705215);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-534569803 ^ (long)-534569944);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)1742051608 ^ (long)1742051735);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-485430927 ^ (long)-485430926);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1906442186 ^ (long)-1906442130);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-471746915 ^ (long)-471746881);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)132912295 ^ (long)132912368);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-165851413 ^ (long)-165851448);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-36281368 ^ (long)-36281511);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-521292385 ^ (long)-521292357);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-104064647 ^ (long)-104064730);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1599577887 ^ (long)-1599577901);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1736135206 ^ (long)-1736135293);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1395850510 ^ (long)-1395850654);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1107041409 ^ (long)1107041491);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1013393540 ^ (long)-1013393654);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1073649276 ^ (long)1073649373);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)411436970 ^ (long)411436900);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1206562134 ^ (long)-1206562258);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1831392606 ^ (long)-1831392546);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1436162043 ^ (long)-1436161930);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)150494165 ^ (long)150494002);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)1069480524 ^ (long)1069480612);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1551711619 ^ (long)1551711683);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)935985513 ^ (long)935985643);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)46996306 ^ (long)46996404);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-717413447 ^ (long)-717413542);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-240812837 ^ (long)-240813021);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1876261672 ^ (long)1876261876);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)-2023000499 ^ (long)-2023000427);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1439745079 ^ (long)1439745210);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1835101373 ^ (long)-1835101294);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)356048939 ^ (long)356049027);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)2001387424 ^ (long)2001387428);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-719861321 ^ (long)-719861486);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)468099423 ^ (long)468099537);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-2079615250 ^ (long)-2079615241);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1988485426 ^ (long)1988485411);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)898790765 ^ (long)898790897);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1335309871 ^ (long)1335309948);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1704024183 ^ (long)-1704024094);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1388573483 ^ (long)1388573481);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1040770353 ^ (long)1040770471);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-1604390109 ^ (long)-1604389944);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)742542670 ^ (long)742542724);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1694034041 ^ (long)-1694034077);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-462006849 ^ (long)-462006795);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)1672165281 ^ (long)1672165139);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1595952877 ^ (long)-1595952872);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-2106713757 ^ (long)-2106713629);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-648688892 ^ (long)-648688816);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-793125688 ^ (long)-793125763);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-2050179389 ^ (long)-2050179332);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)2033115487 ^ (long)2033115518);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)2009428008 ^ (long)2009428164);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)846311016 ^ (long)846311147);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)172657890 ^ (long)172657911);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1154226994 ^ (long)1154226994);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1281964780 ^ (long)-1281964636);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1807126617 ^ (long)1807126545);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)1730621559 ^ (long)1730621598);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-2106235694 ^ (long)-2106235867);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-795765810 ^ (long)-795765798);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-223240630 ^ (long)-223240567);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-1741948048 ^ (long)-1741947939);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1671567293 ^ (long)1671567141);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-1709298650 ^ (long)-1709298620);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1241791079 ^ (long)-1241791050);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)1791786963 ^ (long)1791786813);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1932685350 ^ (long)-1932685404);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-1900860695 ^ (long)-1900860878);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-896723182 ^ (long)-896723200);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1301805336 ^ (long)-1301805324);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-1294447964 ^ (long)-1294447955);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)833067187 ^ (long)833067117);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1739350032 ^ (long)1739350190);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1969000306 ^ (long)1969000283);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1026766355 ^ (long)-1026766374);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1479529847 ^ (long)-1479529800);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)1443374199 ^ (long)1443374285);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-1374011089 ^ (long)-1374011058);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-999330931 ^ (long)-999330963);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-93024846 ^ (long)-93024945);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)2101291320 ^ (long)2101291439);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)152194970 ^ (long)152195040);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-152718567 ^ (long)-152718447);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-267826091 ^ (long)-267826152);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-1393960581 ^ (long)-1393960651);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1931234958 ^ (long)1931234860);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-199362752 ^ (long)-199362577);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-639284569 ^ (long)-639284717);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)21701682 ^ (long)21701730);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-405453593 ^ (long)-405453749);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-785349128 ^ (long)-785349182);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-197406137 ^ (long)-197406099);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)1353803636 ^ (long)1353803599);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)1741092054 ^ (long)1741091950);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-829565457 ^ (long)-829565613);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-137802071 ^ (long)-137802092);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)1126132270 ^ (long)1126132407);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-1755186985 ^ (long)-1755187128);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)165691446 ^ (long)165691409);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1592682628 ^ (long)-1592682618);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-2093261618 ^ (long)-2093261650);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-740201311 ^ (long)-740201258);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)904801197 ^ (long)904801075);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-1178648068 ^ (long)-1178648168);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1618030256 ^ (long)-1618030085);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1243727298 ^ (long)-1243727322);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-2144454762 ^ (long)-2144454864);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)429657946 ^ (long)429657862);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-704443567 ^ (long)-704443491);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1659950444 ^ (long)-1659950341);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-54934145 ^ (long)-54934161);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1480575509 ^ (long)1480575616);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-431821880 ^ (long)-431822013);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-1667579009 ^ (long)-1667579032);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1699412681 ^ (long)1699412608);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-1243390668 ^ (long)-1243390623);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-704623616 ^ (long)-704623379);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)1520808305 ^ (long)1520808257);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)399386365 ^ (long)399386328);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1719010651 ^ (long)1719010805);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)946061565 ^ (long)946061387);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-464183562 ^ (long)-464183801);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)2098909319 ^ (long)2098909376);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-493521350 ^ (long)-493521161);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1392612562 ^ (long)1392612570);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-1076856649 ^ (long)-1076856588);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)1413676291 ^ (long)1413676389);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-187030840 ^ (long)-187031001);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1097007428 ^ (long)-1097007402);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1274029107 ^ (long)-1274029306);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)1204750000 ^ (long)1204749956);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1821153971 ^ (long)-1821154037);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-2093936977 ^ (long)-2093936989);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-653592080 ^ (long)-653592311);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-560332288 ^ (long)-560332273);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)1563471714 ^ (long)1563471689);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1136624570 ^ (long)1136624444);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)263103417 ^ (long)263103399);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1659606192 ^ (long)1659606065);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-972487611 ^ (long)-972487650);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1868793800 ^ (long)-1868793799);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)514731228 ^ (long)514731193);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1771085729 ^ (long)1771085775);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1289333742 ^ (long)1289333519);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)127630270 ^ (long)127630180);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1470926731 ^ (long)-1470926711);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-640974083 ^ (long)-640974323);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)424905135 ^ (long)424905084);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-2017064796 ^ (long)-2017064853);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-139980134 ^ (long)-139980042);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-2121916458 ^ (long)-2121916463);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-746983617 ^ (long)-746983605);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)674611886 ^ (long)674611816);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)788068509 ^ (long)788068569);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)679518488 ^ (long)679518625);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)1821988476 ^ (long)1821988510);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)1132163338 ^ (long)1132163378);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)1674172085 ^ (long)1674172056);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)165442224 ^ (long)165442159);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-862861363 ^ (long)-862861325);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-315282453 ^ (long)-315282567);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-298938228 ^ (long)-298938143);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1436836548 ^ (long)1436836368);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)1808968632 ^ (long)1808968489);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)2140176942 ^ (long)2140176966);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)1107107288 ^ (long)1107107310);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)304304124 ^ (long)304304003);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1412043906 ^ (long)-1412044003);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1683893435 ^ (long)1683893321);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-747652261 ^ (long)-747652248);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)670541684 ^ (long)670541807);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1943296807 ^ (long)1943296910);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)2044994391 ^ (long)2044994434);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-616786289 ^ (long)-616786353);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)1256134781 ^ (long)1256134827);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)291244479 ^ (long)291244452);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1282980460 ^ (long)-1282980589);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1370474928 ^ (long)-1370474781);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1062940626 ^ (long)1062940472);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)605144374 ^ (long)605144469);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-223550235 ^ (long)-223550370);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-544842547 ^ (long)-544842693);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-847184503 ^ (long)-847184400);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)1571344336 ^ (long)1571344196);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1413115915 ^ (long)1413116076);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1505793028 ^ (long)1505793068);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1784281704 ^ (long)-1784281619);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1588520362 ^ (long)-1588520206);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-95429640 ^ (long)-95429790);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1790910875 ^ (long)-1790910858);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-392094878 ^ (long)-392094935);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1480918998 ^ (long)-1480918877);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-1851052147 ^ (long)-1851052208);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1926706624 ^ (long)-1926706687);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1461458551 ^ (long)1461458545);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)197008789 ^ (long)197008721);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-994279199 ^ (long)-994279279);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1895887926 ^ (long)-1895888099);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1381586199 ^ (long)-1381586189);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1378897857 ^ (long)-1378897815);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)102475238 ^ (long)102475235);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1254355164 ^ (long)1254355043);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)100191604 ^ (long)100191525);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1936517656 ^ (long)-1936517690);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)1359612173 ^ (long)1359612193);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)968711397 ^ (long)968711326);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-1702866693 ^ (long)-1702866714);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-577379127 ^ (long)-577379076);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)335290700 ^ (long)335290667);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1687417812 ^ (long)-1687417844);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-1896438141 ^ (long)-1896438207);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)456609615 ^ (long)456609712);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-603522635 ^ (long)-603522692);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-804390398 ^ (long)-804390338);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-2006246300 ^ (long)-2006246295);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1520832399 ^ (long)1520832334);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)201962052 ^ (long)201962041);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-313962131 ^ (long)-313962070);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-2023802230 ^ (long)-2023802336);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)588693882 ^ (long)588693993);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1106940697 ^ (long)1106940873);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)2121014548 ^ (long)2121014708);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1296897463 ^ (long)-1296897441);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)676944464 ^ (long)676944514);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)568584555 ^ (long)568584626);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)2004868250 ^ (long)2004868309);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-485654864 ^ (long)-485654890);
                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)997732360 ^ (long)997732426);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-1036326684 ^ (long)-1036326885)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)983839110 ^ (long)983879289)) >>> (int)((long)-1889866475 ^ (long)-1889866467)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)946410223 ^ (long)946410223);
            if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1523250007 ^ (long)1523250005);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)1947065911 ^ (long)1947065908) | var5_6 << (int)((long)1955551236 ^ (long)1955551233)) ^ var3_4[var7_8]) & (int)((long)-488240902 ^ (long)-488241147);
                    if (49.\u2007\u2002\u2007\u2007\u2006\u2006) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-286503328 ^ (long)-286503325) | var6_7 << (int)((long)319668367 ^ (long)319668362)) ^ var3_4[var7_8]) & (int)((long)-15178112 ^ (long)-15178113);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            49.b[var2_3] = new String(var3_4).intern();
        }
        return 49.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static 49 0(String string) {
        boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
        if (bl2 || bl2) return null;
        if (0 == null) {
            if (bl2 || bl2) return null;
            return null;
        }
        try {
            if (bl2) return null;
            Claims claims = (Claims)0.parseClaimsJws(string).getBody();
            if (bl2 || bl2) return null;
            0ay.0a.info(49.a((int)((long)-1701220147 ^ (long)1701247417), (int)((long)-745677411 ^ (long)745700262)));
            if (bl2 || bl2) return null;
            return new 49(string, claims);
        } catch (ExpiredJwtException expiredJwtException) {
            if (bl2 || bl2) return null;
            0ay.0a.error(49.a((int)((long)-1955554347 ^ (long)1955533474), (int)((long)-341834227 ^ (long)341825964)));
            if (bl2 || bl2) return null;
            if (\u2007\u2002\u2007\u2007\u2006\u2006) {
                throw null;
            }
        } catch (SignatureException signatureException) {
            if (bl2 || bl2) return null;
            0ay.0a.error(49.a((int)((long)381882501 ^ (long)-381904400), (int)((long)1033252331 ^ (long)1033246193)));
            if (bl2 || bl2) return null;
            if (\u2007\u2002\u2007\u2007\u2006\u2006) {
                throw null;
            }
        } catch (MalformedJwtException | UnsupportedJwtException | IllegalArgumentException runtimeException) {
            if (bl2 || bl2) return null;
            0ay.0a.error(49.a((int)((long)710929258 ^ (long)-710909413), (int)((long)-1750389415 ^ (long)1750372008)), (Throwable)runtimeException);
            if (bl2 || bl2) return null;
            if (\u2007\u2002\u2007\u2007\u2006\u2006) {
                throw null;
            }
        } catch (Throwable throwable) {
            if (bl2 || bl2) return null;
            0ay.0a.error(49.a((int)((long)-528904868 ^ (long)528876576), (int)((long)-1057079249 ^ (long)1057074071)), throwable);
            if (bl2 || bl2) return null;
            throwable.printStackTrace();
            if (bl2) return null;
        }
        if (!bl2) return null;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private 49(String string, Claims claims) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                if (bl2 || bl2) break block2;
                this.3 = string;
                if (bl2 || bl2) break block2;
                this.1 = Optional.ofNullable(claims.get(49.a((int)((long)-951465806 ^ (long)951468493), (int)((long)-647650989 ^ (long)647636995)))).filter(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return true;
                    }
                    return object instanceof List;
                }).map(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return (List)object;
                }).orElse(Collections.emptyList());
                if (bl2 || bl2) break block2;
                this.2 = Optional.ofNullable(claims.get(49.a((int)((long)2036274003 ^ (long)-2036295133), (int)((long)1170868891 ^ (long)1170868885)))).filter(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return true;
                    }
                    return object instanceof Boolean;
                }).map(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return (Boolean)object;
                }).orElse(Boolean.FALSE);
                if (bl2 || bl2) break block2;
                this.4 = Optional.ofNullable(claims.get(49.a((int)((long)-665127525 ^ (long)665156838), (int)((long)-1863291983 ^ (long)-1863317604)))).filter(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return true;
                    }
                    return object instanceof String;
                }).map(object -> {
                    boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
                    if (bl2 || bl2) {
                        return null;
                    }
                    return (String)object;
                }).orElse(null);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                var9 = 49.\u2007\u2002\u2007\u2007\u2006\u2006;
                if (!var9) break block27;
                break block28;
            }
            var5_1 = new String[(int)((long)1443500015 ^ (long)1443500003)];
            if (var9) break block28;
            var3_2 = (int)((long)-1028880681 ^ (long)-1028880681);
            if (var9) break block28;
            var2_3 = 0rB$1f.XNZw("\u4c86\u64a5\ua792\u5a5d\u4c2d\u64d7\ua77c\u5a23\u4c92\u64ad\ua72a\u5a99\u4cbe\u645d\ua78e\u5aba\u4c01\u64c1\ua7aa\u5a1f\u4cd2\u6478\ua7c5\u5af0\u4c5d\u646d\ua74e\u5a19\u4c1d\u64ef\ua763\u5a10\u4c60\u64de\ua705\u5a86\u4c19\u64e6\ua74f\u5afe\u4c02\u649c\ua7b8\u5ab2\u4cdd\u647c\ua7ef\u5a78\u4cef\u64be\ua701\u5abb\u4c02\u64a8\ua71f\u5a53\u4ce8\u6487\ua7f6\u5ac1\u4cdf\u6436\ua777\u5a8e\u4c33\u6474\ua7b0\u5a28\u4cc5\u64fa\ua735\u5a7d\u4cf1\u646d\ua762\u5a32\u4cf6\u6473\ua7f5\u5a1a\u4c32\u643a\ua749\u5af5\u4cb4\u649f\ua7ea\u5a37\u4cb9\u64a4\ua75a\u5aca\u4c81\u649a\ua7ed\u5aed\u4c38\u64ee\ua7ce\u5acb\u4cda\u6484\ua7b9\u5a21\u4c2f\u642e\ua778\u5a77\u4cdb\u6409\ua71b\u5a90\u4c66\u649c\ua731\u5adb\u4c3b\u647b\ua7c8\u5a3f\u4c80\u64f3\ua759\u5afe\u4cef\u6457\ua705\u5ab4\u4cc1\u64bf\ua7bd\u5a43\u4c51\u64a4\ua739\u5a16\u4c71\u64a5\ua789\u5aef\u4cc7\u64b9\ua7f9\u5ace\u4cd4\u64bc\ua7bb\u5a60\u4c65\u64bc\ua742\u5a89\u4c77\u64df\ua757\u5aa4\u4cad\u6475\ua795\u5a43\u4c73\u64da\ua760\u5aad\u4cd1\u645c\ua755\u5ab3\u4cc1\u6483\ua70f\u5a80\u4c89\u6485\ua5f0\u5aac\u4ced\u64ad\ua75f\u5aae\u4c5d\u64bb\ua7c3\u5ac2\u4cc3\u6478\ua705\u5a6d\u4c15\u6420\ua7c8\u5ad9\u4c4e\u6412\ua7ab\u5a4f\u4c61\u646e\ua704\u5a15\u4c86\u64bd\ua735\u5ae4\u4c8f\u6458\ua7fa\u5a4b\u4c88\u648b\ua733\u5acc\u4c71\u64b8\ua761\u5a78\u4ce1\u64a2\ua7dd\u5a69\u4c68\u6435\ua70c\u5ac9\u4caf\u64b5\ua773\u5a08\u4cba\u645f\ua778\u5a47\u4c7d\u641e\ua743\u5a77\u4cb0\u6445\ua715\u5a8d\u4c07\u6489\ua7ff\u5af5\u4c1c\u6427\ua7f2\u5a5b\u4c11\u6403\ua7d9\u5aae\u4c5d\u64c8\ua7b5\u5a22\u4ceb\u64f3\ua70e\u5a76\u4c2f\u641c\ua74b\u5a9a\u4c42\u64ce\ua710\u5a6a\u4cba\u64a7\ua7fe\u5a12\u4cb8\u64c9\ua712\u5a77\u4c85\u64e2\ua7d3\u5a23\u4c96\u64d3\ua7fb\u5a5b\u4cbf\u64d9\ua71e\u5a3d\u4ce8\u6443\ua7fd\u5ab9\u4ca3\u6485\ua779\u5a40\u4c47\u6402\ua709\u5a1d\u4cfd\u64da\ua714\u5abc\u4cd1\u64d4\ua7bf\u5a28\u4ca0\u640d\ua7af\u5a81\u4c67\u6404\ua783\u5a66\u4c64\u64ba\ua7be\u5a58\u4cec\u6456\ua770\u5a43\u4c01\u645e\ua7f6\u5aea\u4c46\u64bf\ua7f6\u5ae2\u4c16\u64f1\ua7c8\u5a86\u4c39\u64e1\ua7d2\u5a1b\u4c92\u6438\ua766\u5abd\u4c6a\u644c\ua731\u5aee\u4cdb\u64d3\ua758\u5a2f\u4c80\u64f9\ua71e\u5abb\u4c01\u645c\ua70a\u5a5c\u4c61\u6490\ua74e\u5a3b\u4c08\u6402\ua7ba\u5a56\u4c37\u641f\ua780\u5adc\u4c1b\u644f\ua7b9\u5aea\u4ccd\u6477\ua712\u5a25\u4cc8\u648d\ua79f\u5abf\u4c62\u6499\ua79c\u5abc\u4c3e\u64e3\ua782\u5aa4\u4caf\u64c2\ua7a2\u5aad\u4c0c\u64d8\ua733\u5afe\u4c52\u6400\ua74a\u5a4d\u4ce5\u6429\ua7da\u5a2e\u4cd1\u64a5\ua7c4\u5aef\u4cf3\u64ee\ua715\u5a1e\u4c08\u646a\ua736\u5a9d\u4c2d\u6497\ua729\u5a3a\u4c15\u64c7\ua7b8\u5a57\u4c77\u64b0\ua7b4\u5a85\u4c1c\u647e\ua702\u5ac7\u4c11\u6412\ua7fb\u5a4b\u4cff\u6498\ua722\u5a17\u4c8d\u6415\ua7b7\u5aca\u4c6c\u64e6\ua7bf\u5ac1\u4c5a\u6438\ua774\u5a50\u4c80\u6438\ua79f\u5ad5\u4cd0\u6454\ua775\u5a95\u4c75\u64b7\ua76c\u5a04\u4cf1\u64b0\ua723\u5a4d\u4ce2\u64af\ua765\u5a65\u4c18\u64d9\ua772\u5a71\u4ca8\u6467\ua7f9\u5abf\u4c8c\u64e4\ua718\u5a6e\u4c1f\u64f9\ua768\u5afc\u4c3e\u644e\ua7ae\u5aa2\u4cfa\u643c\ua706\u5a2f\u4c7e\u64c6\ua792\u5a8c\u4c80\u645c\ua723\u5af6\u4c86\u6489\ua723\u5a54\u4c06\u64ca\ua74b\u5abd\u4c86\u6448\ua74a\u5a8b\u4c83\u64d7\ua78e\u5ada\u4cb5\u6459\ua704\u5a19\u4c47\u6462\ua760\u5a24\u4cd4\u6413\ua769\u5a55\u4c43\u6474\ua796\u5a86\u4c7a\u6414\ua775\u5ae0\u4cfb\u64e3\ua71a\u5af3\u4c15\u64a4\ua739\u5a4d\u4cd0\u64ce\ua7b9\u5af1\u4cf8\u6413\ua7a5\u5a2c\u4c42\u6413\ua7f8\u5a1b\u4ca9\u64d9\ua785\u5aeb\u4cea\u641b\ua7d9\u5aea\u4c79\u64ed\ua760\u5a4f\u4c64\u64f1\ua75f\u5aa4\u4c40\u6462\ua7b3\u5a83\u4c58\u645c\ua791\u5a49\u4c5a\u64a7\ua79d\u5adc\u4c33\u648c\ua720\u5a52\u4ca2\u64c2\ua789\u5af5\u4ca2\u64ae\ua79a\u5a4d\u4c24\u6498\ua722\u5a45\u4c7d\u64f1\ua755\u5ae1\u4c13\u64f1\ua7cb\u5a6e\u4ccf\u6484\ua787\u5ab4\u4cd0\u64e0\ua73d\u5ab1\u4c42\u64c6\ua7b8\u5ae7\u4c2d\u6437\ua7f5\u5a89\u4c0f\u64fc\ua7e3\u5a53\u4ced\u64b5\ua736\u5a59\u4c28\u6452\ua757\u5a31\u4c1d\u6424\ua78e\u5a04\u4cdf\u6415\ua78b\u5a82\u4c4f\u6467\ua7b8\u5ad8\u4cfc\u645b\ua7b5\u5a7f\u4c96\u6404\ua760\u5a96\u4c77\u64f5\ua769\u5a7e\u4ca3\u6487\ua7b5\u5a22\u4c17\u646e\ua7d9\u5a3d\u4c25\u6466\ua729\u5a1a\u4ca5\u6454\ua795\u5aa9\u4c7c\u6441\ua7c4\u5a74\u4c4c\u6489\ua7ce\u5a41\u4c9b\u64d1\ua725\u5ac4\u4c52\u6473\ua733\u5af0\u4c5c\u6446\ua766\u5aa4\u4c84\u6464\ua78d\u5ae8\u4cd1\u64f9\ua7f8\u5ab8\u4cfe\u6456\ua701\u5a75\u4cfc\u64b9\ua7c0\u5a53\u4c23\u640e\ua780\u5a3d\u4c4b\u645b\ua74e\u5a0c\u4ce5\u644c\ua773\u5af9\u4c4a\u642d\ua7d9\u5a22\u4c55\u64cf\ua720\u5ab7\u4c8f\u644d\ua7b5\u5afc\u4c17\u64ea\ua7e5\u5a29\u4c3a\u6440\ua77b\u5aa9\u4cdf\u64fd\ua702\u5a77\u4ce5\u647c\ua7ff\u5a0b\u4cd8\u646c\ua7bb\u5a2f\u4c2a\u6425\ua74d\u5ac5\u4c6b\u647c\ua703\u5a34\u4c30\u645b\ua7c7\u5ac8\u4ccc\u64a7\ua784\u5a58\u4c9b\u6476\ua761\u5a71\u4cb1\u645f\ua7bf\u5af5\u4cc2\u6494\ua761\u5a41\u4c29\u64dd\ua722\u5aa9\u4cb8\u64a4\ua7c7\u5a75\u4c79\u64a8\ua7cf\u5a4e\u4ce8\u645d\ua786\u5abc\u4c9c\u6438\ua7d2\u5a56\u4c70\u640a\ua744\u5a16\u4c78\u64e7\ua741\u5aa9\u4c60\u64a6\ua7a9\u5a8a\u4ce6\u647a\ua701\u5a33\u4cf9\u6470\ua777\u5a30\u4cc9\u64ea\ua761\u5a65\u4cc7\u64d0\ua740\u5a0a\u4cd3\u64b5\ua7fa\u5acd\u4ca7\u64e8\ua7e2\u5ade\u4c4f\u6484\ua753\u5af2\u4c37\u64da\ua7b3\u5adb\u4ca8\u647b\ua7b4\u5a7b\u4c13\u6454\ua7e7\u5a52\u4cac\u64d3\ua792\u5a21\u4caa\u642c\ua7a1\u5a8a\u4cf6\u640b\ua7f8\u5ac7\u4c3c\u64bc\ua753\u5a2c\u4c83\u645e\ua7b3\u5ac1\u4c20\u640b\ua772\u5a60\u4c9c\u64fd\ua7da\u5a34\u4c67\u6431\ua710\u5af5\u4c1d\u6456\ua768\u5a34\u4ce1\u64eb\ua77a\u5a8e\u4c76\u6468\ua7d7\u5a93\u4c35\u6469\ua7e1", -662082955);
            var4_4 = var2_3.length();
            if (var9) break block28;
            var1_5 = (int)((long)157001885 ^ (long)157001874);
            if (var9) break block28;
            var0_6 = (int)((long)-2053366279 ^ (long)2053366278);
            if (var9) break block28;
            block13: while (!var9) {
                block25: {
                    block24: {
                        v0 = (int)((long)-890747821 ^ (long)-890747844);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)73290792 ^ (long)-73290793);
                        if (49.\u2007\u2002\u2007\u2007\u2006\u2006) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) continue block13;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u19b0\u3181\uf28f\u0f07\u19b3\u315f\uf2b8\u0f28\u190e\u31fe\uf2a4\u0f6f\u1910\u3131\uf2f6\u0ffb\u1950\u31a8\uf272\u0fa8\u195a\u31f5\uf2b0\u0fae\u19ea\u3186\uf20b\u0fd9\u19a9\u3172\uf2a0\u0f11\u19f9\u319f\uf2a3\u0fe0\u19c1\u313d\uf296\u0f17\u194f\u31da", -1096859650);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)42327254 ^ (long)42327248);
                                var0_6 = (int)((long)-508105416 ^ (long)508105415);
                                while (true) {
                                    v0 = (int)((long)1005700098 ^ (long)1005700170);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)1368893705 ^ (long)1368893705);
                                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break block24;
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
                                    if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) ** continue;
                                    throw null;
                                }
                                49.a = var5_1;
                                49.b = new String[(int)((long)-1865568938 ^ (long)-1865568934)];
                                if (49.\u2007\u2002\u2007\u2007\u2006\u2006) {
                                    throw null;
                                }
                                break block25;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)1714491823 ^ (long)1714491823);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)1672173610 ^ (long)1672173611)) ** GOTO lbl108
                    do {
                        block26: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)101026947 ^ (long)101026948)) {
                                    case 0: {
                                        v15 = (int)((long)177556833 ^ (long)177556769);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-2140780757 ^ (long)-2140780785);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-894922400 ^ (long)-894922377);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)-2101895902 ^ (long)-2101895827);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)2111401531 ^ (long)2111401556);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-728142604 ^ (long)-728142674);
                                        if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)-1229608404 ^ (long)-1229608444);
                                    }
                                }
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                                ++var6_7;
                                v8 = v11;
                                if (v11 != 0) break block26;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            } while (!49.\u2007\u2002\u2007\u2007\u2006\u2006);
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
                var7_8 = null;
                try {
                    var8_9 = (RSAPublicKey)KeyFactory.getInstance(49.a((int)((long)1009850345 ^ (long)-1009869157), (int)((long)920484115 ^ (long)920455307))).generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(49.a((int)((long)285242114 ^ (long)-285214084), (int)((long)80567256 ^ (long)-80552167)))));
                    var7_8 = Jwts.parser().setSigningKey(var8_9).setAllowedClockSkewSeconds(-8611865313691947748L ^ -8611865313691947676L).requireIssuer(49.a((int)((long)736538602 ^ (long)-736549223), (int)((long)-1627187148 ^ (long)-1627172196)));
                    ** if (!49.\u2007\u2002\u2007\u2007\u2006\u2006) goto lbl-1000
                } catch (NoSuchAlgorithmException | InvalidKeySpecException var8_10) {
                    if (var9 || var9) break;
                    0ay.0a.error(49.a((int)((long)1272346158 ^ (long)-1272316072), (int)((long)-2090516349 ^ (long)-2090532529)), (Throwable)var8_10);
                    if (var9) break;
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
                if (var9) break;
                49.0 = var7_8;
                if (var9 || var9) break;
            }
        }
    }

    public final String toString() {
        boolean bl2 = \u2007\u2002\u2007\u2007\u2006\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return this.3;
    }
}

