/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 */
package net.impactclient;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorRenderManager;
import net.impactclient.0ah;
import net.impactclient.0rA;
import net.impactclient.0rB$1f;
import net.impactclient.0rL;
import net.impactclient.0rM;
import net.impactclient.0ri;
import net.impactclient.1A;
import net.impactclient.1H;
import net.impactclient.1_;
import net.impactclient.23;
import net.impactclient.2a;
import net.impactclient.2r;
import net.impactclient.3Z;
import net.impactclient.5O;
import net.impactclient.5Y;
import net.impactclient.5b;
import net.impactclient.73;
import net.impactclient.7c;
import pw.knx.feather.structures.Color;
import pw.knx.feather.tessellate.Tessellator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9O
extends 73
implements 5O {
    private static final String[] e;
    private static final String[] d;
    private 0rL 3;
    private 0ri 5;
    public static final boolean \u200a\u200f;
    @EventHandler
    private final Listener<0ah> 0b;
    private 0ri 0;
    private 0rM 4;
    @EventHandler
    private final Listener<5Y> 7;
    public Int2ObjectMap<List<3Z>> 8;
    @EventHandler
    private final Listener<7c> 1;
    private 0rA 9;
    private 0rL 0a;
    private 0rL 6;

    public final List<3Z> 0(int n3) {
        boolean bl2 = \u200a\u200f;
        if (bl2 || bl2) {
            return null;
        }
        return (List)this.8.computeIfAbsent((Object)n3, n2 -> {
            boolean bl2 = \u200a\u200f;
            if (bl2 || bl2) {
                return null;
            }
            return new ArrayList();
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 3() {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200f;
                if (bl2 || bl2) break block2;
                this.8.clear();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 9O.\u200a\u200f;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-106524268 ^ (long)-106512826)) & (int)((long)1761389715 ^ (long)1761366892);
            if (var9_2) ** GOTO lbl-1000
            if (9O.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 9O.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-259596257 ^ (long)-259596257)] & (int)((long)-62482858 ^ (long)-62482775)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1959178633 ^ (long)1959178722);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)785836198 ^ (long)785836082);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-2032604105 ^ (long)-2032604139);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1897131781 ^ (long)1897132016);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-2095096872 ^ (long)-2095096954);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1351715190 ^ (long)-1351715277);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-1450316877 ^ (long)-1450316923);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1755946595 ^ (long)1755946678);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-1986046621 ^ (long)-1986046626);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1877033018 ^ (long)1877033064);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)1075540678 ^ (long)1075540585);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1517830637 ^ (long)-1517830568);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-784330293 ^ (long)-784330279);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-240978670 ^ (long)-240978625);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-587693956 ^ (long)-587694001);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)868732512 ^ (long)868732644);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-543003579 ^ (long)-543003491);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-1438761406 ^ (long)-1438761401);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)1679591096 ^ (long)1679591083);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)-1864069157 ^ (long)-1864069321);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1586647215 ^ (long)1586647231);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-884322935 ^ (long)-884322848);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)1584650079 ^ (long)1584649989);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)1795819086 ^ (long)1795819135);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)823762337 ^ (long)823762230);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-1667480587 ^ (long)-1667480728);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1768288390 ^ (long)-1768288330);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)283487686 ^ (long)283487734);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-440359256 ^ (long)-440359242);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)977800344 ^ (long)977800422);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)1118491322 ^ (long)1118491385);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)1860046508 ^ (long)1860046577);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-277642278 ^ (long)-277642293);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1457186695 ^ (long)-1457186790);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)996714093 ^ (long)996714167);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)899369301 ^ (long)899369325);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1841276148 ^ (long)-1841276092);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1336454714 ^ (long)-1336454848);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-558055802 ^ (long)-558055931);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1040196593 ^ (long)-1040196570);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1175558418 ^ (long)-1175558419);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)234367979 ^ (long)234367867);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1253651984 ^ (long)1253652214);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1300443649 ^ (long)-1300443839);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-190519728 ^ (long)-190519608);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1285178148 ^ (long)1285178354);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)1864948637 ^ (long)1864948686);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)660552370 ^ (long)660552360);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)567902522 ^ (long)567902587);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)956746483 ^ (long)956746472);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1178048981 ^ (long)1178048888);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1971501901 ^ (long)1971501842);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-1754030499 ^ (long)-1754030561);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1625882652 ^ (long)1625882675);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1482784914 ^ (long)1482784797);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)701643274 ^ (long)701643464);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)1091789572 ^ (long)1091789603);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1877145781 ^ (long)1877145729);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-2075972138 ^ (long)-2075972240);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-905110931 ^ (long)-905110945);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)1431163956 ^ (long)1431164144);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1478428222 ^ (long)-1478428280);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1712683012 ^ (long)1712683261);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)992203534 ^ (long)992203654);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)180507417 ^ (long)180507503);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1927067807 ^ (long)-1927067710);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)812113481 ^ (long)812113408);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)1281633452 ^ (long)1281633307);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-2079276340 ^ (long)-2079276424);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)911614253 ^ (long)911614388);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)741900149 ^ (long)741900111);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-542191907 ^ (long)-542192006);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)1564955112 ^ (long)1564954885);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-792212756 ^ (long)-792212954);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)557563847 ^ (long)557563881);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1660599499 ^ (long)1660599517);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-96680446 ^ (long)-96680382);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1791712463 ^ (long)-1791712506);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-290359356 ^ (long)-290359483);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-812721445 ^ (long)-812721453);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-1163927405 ^ (long)-1163927444);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-1497603800 ^ (long)-1497603605);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1330583952 ^ (long)1330583908);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-833465292 ^ (long)-833465131);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)70656456 ^ (long)70656284);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)2114051045 ^ (long)2114050947);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-1458332403 ^ (long)-1458332313);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)1839020482 ^ (long)1839020506);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1746619191 ^ (long)-1746619274);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-734199771 ^ (long)-734199799);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)230847503 ^ (long)230847577);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)510122182 ^ (long)510121998);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1889496412 ^ (long)-1889496407);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)869741225 ^ (long)869741146);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)512964133 ^ (long)512964191);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)89811423 ^ (long)89811230);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)471496252 ^ (long)471496223);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)778242186 ^ (long)778242136);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-1783234486 ^ (long)-1783234463);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-773133846 ^ (long)-773134016);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-1218416710 ^ (long)-1218416779);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-962186511 ^ (long)-962186595);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)30990324 ^ (long)30990221);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-2118147148 ^ (long)-2118147132);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-2063553094 ^ (long)-2063553233);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)2070045580 ^ (long)2070045656);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-300871619 ^ (long)-300871509);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)194288461 ^ (long)0xB949B4B);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)875724054 ^ (long)875724277);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-222934219 ^ (long)-222934192);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1788948395 ^ (long)1788948389);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)615017531 ^ (long)615017684);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)186408728 ^ (long)186408825);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1778381958 ^ (long)1778381848);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-486126678 ^ (long)-486126700);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-995085716 ^ (long)-995085603);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)334662867 ^ (long)334662739);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)875834604 ^ (long)875834416);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)267673247 ^ (long)267673192);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1015956085 ^ (long)1015955975);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-868797435 ^ (long)-868797356);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)313569406 ^ (long)313569319);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)1206018428 ^ (long)1206018439);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)303923549 ^ (long)303923473);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-1526860767 ^ (long)-1526860757);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1197848431 ^ (long)1197848532);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-810208988 ^ (long)-810209022);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-957174338 ^ (long)-957174331);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1652651982 ^ (long)-1652651878);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1053122805 ^ (long)-1053122708);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-182177975 ^ (long)-182177900);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-223173083 ^ (long)-223172923);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-882513611 ^ (long)-882513422);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)303335236 ^ (long)303335257);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-1562142950 ^ (long)-1562142957);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)2079537422 ^ (long)2079537481);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1307107500 ^ (long)-1307107414);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)1791560056 ^ (long)1791560093);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1770310939 ^ (long)1770311154);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-766188538 ^ (long)-766188371);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)1786042396 ^ (long)1786042377);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)1351807024 ^ (long)1351807229);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1243752261 ^ (long)-1243752437);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)93117520 ^ (long)93117470);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-932910014 ^ (long)-932910046);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)2075103933 ^ (long)2075103860);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)306583985 ^ (long)306583854);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-824619719 ^ (long)-824619567);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-925308615 ^ (long)-925308493);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-1145651831 ^ (long)-1145651880);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1857642791 ^ (long)-1857642957);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1997699166 ^ (long)-1997699215);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-30962748 ^ (long)-30962850);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-707213014 ^ (long)-707212872);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)840653253 ^ (long)840653209);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)1175980165 ^ (long)1175980054);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1740909391 ^ (long)1740909508);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-161759415 ^ (long)-161759449);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)2060480239 ^ (long)2060480237);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)1368940688 ^ (long)1368940594);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-138782514 ^ (long)-138782565);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-1916518768 ^ (long)-1916518709);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)379047643 ^ (long)379047533);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)1727728305 ^ (long)1727728270);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)77433352 ^ (long)77433460);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-519619170 ^ (long)-519619303);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1327341352 ^ (long)1327341539);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-1898660763 ^ (long)-1898660848);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-234914689 ^ (long)-234914787);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-2063104847 ^ (long)-2063105000);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)1904990075 ^ (long)1904990083);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1931216492 ^ (long)1931216514);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-1422931144 ^ (long)-1422931125);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)152356796 ^ (long)152356743);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1532278934 ^ (long)-1532278904);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-612968041 ^ (long)-612968147);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)100661693 ^ (long)100661552);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)388516991 ^ (long)388517086);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1169416311 ^ (long)-1169416267);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-642646718 ^ (long)-642646629);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-1462447905 ^ (long)-1462447874);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-113727667 ^ (long)-113727503);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1878295952 ^ (long)-1878295952);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-564373966 ^ (long)-564373891);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1109313647 ^ (long)-1109313696);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)2128341142 ^ (long)2128341243);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-2121970134 ^ (long)-2121970122);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)198976505 ^ (long)198976271);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)451523588 ^ (long)451523811);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1435323765 ^ (long)1435323685);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-888933041 ^ (long)-888933111);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)503286475 ^ (long)503286387);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)1289114026 ^ (long)1289113870);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-2006791951 ^ (long)-2006791979);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)1598299867 ^ (long)1598299812);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1324161940 ^ (long)-1324161810);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-549428886 ^ (long)-549428764);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-258782229 ^ (long)-258782345);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-1549723059 ^ (long)-1549723054);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-1842057064 ^ (long)-1842057207);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1135123128 ^ (long)-1135123004);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)1205319904 ^ (long)1205319684);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)810448796 ^ (long)810448706);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-459789317 ^ (long)-459789561);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-1161738562 ^ (long)-1161738594);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1168660249 ^ (long)-1168660317);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-2000131651 ^ (long)-2000131840);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)894626503 ^ (long)894626365);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1120798233 ^ (long)-1120798389);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-700051542 ^ (long)-700051515);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-1024691932 ^ (long)-1024691967);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-110246753 ^ (long)-110246886);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1760971268 ^ (long)1760971385);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1334744896 ^ (long)1334745075);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)1989054082 ^ (long)1989054094);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-410497215 ^ (long)-410497101);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-2014803097 ^ (long)-2014803181);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1427877752 ^ (long)-1427877887);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1429550685 ^ (long)-1429550711);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-671952455 ^ (long)-671952535);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-725556454 ^ (long)-725556451);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1335272811 ^ (long)1335272732);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-598730935 ^ (long)-598730865);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1053488809 ^ (long)-1053488647);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-563959176 ^ (long)-563959185);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)613108735 ^ (long)613108666);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1117575358 ^ (long)-1117575398);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)623560942 ^ (long)623560761);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1138895840 ^ (long)-1138895744);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1884845340 ^ (long)-1884845364);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-918474102 ^ (long)-918474118);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)1385445464 ^ (long)1385445613);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-564942891 ^ (long)-564942931);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-2053241626 ^ (long)-2053241714);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-349339554 ^ (long)-349339639);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)600873394 ^ (long)600873387);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)615340612 ^ (long)615340682);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1114473315 ^ (long)1114473262);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1622978058 ^ (long)1622978295);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-826986858 ^ (long)-826986862);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1523296127 ^ (long)1523296116);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-2046605267 ^ (long)-2046605255);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-1525443561 ^ (long)-1525443469);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-981585755 ^ (long)-981585756);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)904995290 ^ (long)904995243);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)362900081 ^ (long)362900040);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1822986016 ^ (long)-1822986203);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)749076112 ^ (long)749076047);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1067079536 ^ (long)1067079659);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-531723239 ^ (long)-531723070);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-52783866 ^ (long)-52783821);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)746676543 ^ (long)746676634);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-1840592916 ^ (long)-1840593108);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1966317778 ^ (long)1966317789);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)310168286 ^ (long)310168117);
                    if (!9O.\u200a\u200f) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1059327542 ^ (long)1059327620);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1011818144 ^ (long)1011818079)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)54564276 ^ (long)54553163)) >>> (int)((long)-696778641 ^ (long)-696778649)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-803728071 ^ (long)-803728071);
            if (!9O.\u200a\u200f) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1332815239 ^ (long)-1332815237);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)400073293 ^ (long)400073294) | var5_6 << (int)((long)-989672985 ^ (long)-989672990)) ^ var3_4[var7_8]) & (int)((long)-2057548075 ^ (long)-2057548246);
                    if (9O.\u200a\u200f) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1367798147 ^ (long)1367798144) | var6_7 << (int)((long)-1080941444 ^ (long)-1080941447)) ^ var3_4[var7_8]) & (int)((long)1067251627 ^ (long)1067251540);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            9O.e[var2_3] = new String(var3_4).intern();
        }
        return 9O.e[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void 0(AtomicInteger atomicInteger, Tessellator tessellator, AccessorRenderManager accessorRenderManager, 3Z z2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a\u200f;
                    if (bl2 || bl2) break block2;
                    if (!((double)atomicInteger.incrementAndGet() > ((Float)this.0a.1()).doubleValue() - (double)this.0a.2)) break block3;
                    if (bl2 || bl2) break block2;
                    tessellator.addVertex((float)(z2.2 - accessorRenderManager.getRenderPosX()), (float)(z2.0 - accessorRenderManager.getRenderPosY() + (double)this.3.2), (float)(z2.1 - accessorRenderManager.getRenderPosZ()));
                    if (bl2 || bl2) break block2;
                    atomicInteger.set((int)((long)218916640 ^ (long)218916640));
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    public 9O() {
        boolean bl2 = \u200a\u200f;
        super(9O.b((int)((long)1158340992 ^ (long)1158336095), (int)((long)-1345442762 ^ (long)1345449104)), 9O.b((int)((long)-2132868208 ^ (long)-2132857773), (int)((long)-579705570 ^ (long)579729530)));
        Object object2 = Boolean.TRUE;
        1_ _ = (2r)((2r)((2r)this.5().2(9O.b((int)((long)-1095892898 ^ (long)-1095880824), (int)((long)1024247142 ^ (long)1024247518)))).1(9O.b((int)((long)-2005442756 ^ (long)-2005438210), (int)((long)-1442627966 ^ (long)1442612443)))).0(9O.b((int)((long)1579551613 ^ (long)1579558062), (int)((long)1235191237 ^ (long)1235210193)));
        ((2r)((2r)((2r)this.5().2(9O.b((int)((long)-1095892898 ^ (long)-1095880824), (int)((long)1024247142 ^ (long)1024247518)))).1(9O.b((int)((long)-2005442756 ^ (long)-2005438210), (int)((long)-1442627966 ^ (long)1442612443)))).0(9O.b((int)((long)1579551613 ^ (long)1579558062), (int)((long)1235191237 ^ (long)1235210193)))).2 = object2;
        this.5 = (0ri)_.0();
        this.0 = (0ri)((2r)((2r)((2r)this.5().2(9O.b((int)((long)-553106437 ^ (long)-553096134), (int)((long)21744681 ^ (long)21751357)))).1(9O.b((int)((long)2032731519 ^ (long)2032741048), (int)((long)-620534887 ^ (long)-620538366)))).0(9O.b((int)((long)-2112202765 ^ (long)-2112194521), (int)((long)1971657981 ^ (long)1971660010)))).0();
        object2 = Color.fromRGB((int)((long)-1474445640 ^ (long)-1474445753), (int)((long)1620414359 ^ (long)1620414359), (int)((long)-16098540 ^ (long)-16098540));
        _ = (2a)((2a)((2a)this.4().2(9O.b((int)((long)-258089050 ^ (long)-258084749), (int)((long)-556469715 ^ (long)-556471213)))).1(9O.b((int)((long)440305273 ^ (long)440314283), (int)((long)-1135480309 ^ (long)1135487784)))).0(9O.b((int)((long)-784557501 ^ (long)-784550509), (int)((long)-1229719133 ^ (long)-1229724065)));
        ((2a)((2a)((2a)this.4().2(9O.b((int)((long)-258089050 ^ (long)-258084749), (int)((long)-556469715 ^ (long)-556471213)))).1(9O.b((int)((long)440305273 ^ (long)440314283), (int)((long)-1135480309 ^ (long)1135487784)))).0(9O.b((int)((long)-784557501 ^ (long)-784550509), (int)((long)-1229719133 ^ (long)-1229724065)))).2 = object2;
        this.9 = (0rA)((2a)_).0();
        object2 = (int)((long)-1551229673 ^ (long)-1551229464);
        _ = ((1H)((1H)((1H)this.2().2(9O.b((int)((long)1983009139 ^ (long)1983020715), (int)((long)804100440 ^ (long)804114545)))).1(9O.b((int)((long)-1904085866 ^ (long)-1904092334), (int)((long)1936819345 ^ (long)1936825152)))).0(9O.b((int)((long)-773755195 ^ (long)-773766888), (int)((long)-1890776167 ^ (long)1890758558)))).1((int)((long)2067044950 ^ (long)2067044950)).0((int)((long)1547478807 ^ (long)1547479016));
        ((1_)((1H)((1H)((1H)this.2().2(9O.b((int)((long)1983009139 ^ (long)1983020715), (int)((long)804100440 ^ (long)804114545)))).1(9O.b((int)((long)-1904085866 ^ (long)-1904092334), (int)((long)1936819345 ^ (long)1936825152)))).0(9O.b((int)((long)-773755195 ^ (long)-773766888), (int)((long)-1890776167 ^ (long)1890758558)))).1((int)((long)2067044950 ^ (long)2067044950)).0((int)((long)1547478807 ^ (long)1547479016))).2 = object2;
        this.4 = (0rM)((1H)_).0();
        object2 = Float.valueOf(10.0f);
        _ = ((1H)((1H)((1H)this.0().2(9O.b((int)((long)850792973 ^ (long)850804188), (int)((long)-253095945 ^ (long)253079482)))).1(9O.b((int)((long)-850935241 ^ (long)-850924053), (int)((long)-1591878176 ^ (long)1591896158)))).0(9O.b((int)((long)1777963827 ^ (long)1777974505), (int)((long)703893292 ^ (long)-703910733)))).1(Float.valueOf(1.0f)).0(Float.valueOf(10.0f));
        ((1_)((1H)((1H)((1H)this.0().2(9O.b((int)((long)850792973 ^ (long)850804188), (int)((long)-253095945 ^ (long)253079482)))).1(9O.b((int)((long)-850935241 ^ (long)-850924053), (int)((long)-1591878176 ^ (long)1591896158)))).0(9O.b((int)((long)1777963827 ^ (long)1777974505), (int)((long)703893292 ^ (long)-703910733)))).1(Float.valueOf(1.0f)).0(Float.valueOf(10.0f))).2 = object2;
        this.0a = (0rL)((1H)_).0();
        object2 = Float.valueOf(1.0f);
        _ = ((1H)((1H)((1H)this.0().2(9O.b((int)((long)1209889195 ^ (long)1209884272), (int)((long)1653347874 ^ (long)1653357531)))).1(9O.b((int)((long)-1490688988 ^ (long)-1490695174), (int)((long)-502336077 ^ (long)-502361724)))).0(9O.b((int)((long)-887484582 ^ (long)-887480189), (int)((long)-272109084 ^ (long)272120854)))).1(Float.valueOf(0.1f)).0(Float.valueOf(5.0f));
        ((1_)((1H)((1H)((1H)this.0().2(9O.b((int)((long)1209889195 ^ (long)1209884272), (int)((long)1653347874 ^ (long)1653357531)))).1(9O.b((int)((long)-1490688988 ^ (long)-1490695174), (int)((long)-502336077 ^ (long)-502361724)))).0(9O.b((int)((long)-887484582 ^ (long)-887480189), (int)((long)-272109084 ^ (long)272120854)))).1(Float.valueOf(0.1f)).0(Float.valueOf(5.0f))).2 = object2;
        this.6 = (0rL)((1H)_).0();
        object2 = Float.valueOf(0.1f);
        _ = ((1H)((1H)((1H)this.0().2(9O.b((int)((long)1850124140 ^ (long)1850116265), (int)((long)317938965 ^ (long)-317940963)))).1(9O.b((int)((long)506421850 ^ (long)506416540), (int)((long)1600534240 ^ (long)1600541322)))).0(9O.b((int)((long)2043475792 ^ (long)2043467920), (int)((long)-494507332 ^ (long)-494504486)))).1(Float.valueOf(0.0f)).0(Float.valueOf(1.0f));
        ((1_)((1H)((1H)((1H)this.0().2(9O.b((int)((long)1850124140 ^ (long)1850116265), (int)((long)317938965 ^ (long)-317940963)))).1(9O.b((int)((long)506421850 ^ (long)506416540), (int)((long)1600534240 ^ (long)1600541322)))).0(9O.b((int)((long)2043475792 ^ (long)2043467920), (int)((long)-494507332 ^ (long)-494504486)))).1(Float.valueOf(0.0f)).0(Float.valueOf(1.0f))).2 = object2;
        this.3 = (0rL)((1H)_).0();
        this.8 = new Int2ObjectArrayMap();
        this.1 = new Listener<7c>(object -> {
            boolean bl2;
            block15: {
                block14: {
                    bl2 = \u200a\u200f;
                    if (bl2 || bl2) return;
                    if (9O.2.h == null) break block14;
                    if (bl2) return;
                    if (((7c)object).0 == EventState.PRE) break block15;
                    if (bl2) return;
                }
                if (bl2) return;
                return;
            }
            if (bl2) return;
            23.0(this, 9O.b((int)((long)-881115683 ^ (long)-881126902), (int)((long)-645544609 ^ (long)645549677)), String.valueOf((int)((double)this.4().size() / (((Float)this.0a.1()).doubleValue() / (double)this.0a.2))));
            if (bl2 || bl2) return;
            if (!this.5.0) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            if (this.4().isEmpty()) {
                if (bl2 || bl2) return;
                this.7();
                if (bl2) return;
                return;
            }
            if (bl2) return;
            object = this.4().get(this.4().size() - (int)((long)-1215074355 ^ (long)-1215074356));
            if (bl2 || bl2) return;
            if (9O.2.h.e(((3Z)object).2, ((3Z)object).0, ((3Z)object).1) > 1.0 / ((Float)this.0a.1()).doubleValue()) {
                if (bl2 || bl2) return;
                this.7();
                if (bl2) return;
            }
            if (!bl2) return;
        }, new Predicate[(int)((long)-838975003 ^ (long)-838975003)]);
        this.0b = new Listener<0ah>(ah2 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u200a\u200f;
                        if (bl2 || bl2) break block2;
                        if (ah2.0 != 9O.2.h) break block3;
                        if (bl2 || bl2) break block2;
                        this.3();
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)1696038638 ^ (long)1696038638)]);
        this.7 = new Listener<5Y>(object -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u200a\u200f;
                        if (bl2 || bl2) break block2;
                        1A.0((boolean)((long)873240009 ^ (long)873240008));
                        if (bl2 || bl2) break block2;
                        5b[] bArray = new 5b[(int)((long)1070655915 ^ (long)1070655914)];
                        bArray[(int)((long)311180235 ^ (long)311180235)] = 5b.c;
                        1A.0(bArray);
                        if (bl2 || bl2) break block2;
                        if (this.0.0) break block3;
                        if (bl2 || bl2) break block2;
                        bus.k();
                        if (bl2 || bl2) break block2;
                        bus.a((boolean)((long)125328794 ^ (long)125328795));
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    bus.c((float)this.9.3(), this.9.1(), (float)this.9.0(), (float)((float)this.4.2 / 255.0f));
                    if (bl2 || bl2) break block2;
                    bus.d((float)this.6.2);
                    if (bl2 || bl2) break block2;
                    object = new AtomicInteger((int)((long)651641765 ^ (long)651641765));
                    if (bl2 || bl2) break block2;
                    Tessellator tessellator = 1A.1;
                    if (bl2 || bl2) break block2;
                    AccessorRenderManager accessorRenderManager = (AccessorRenderManager)2.ac();
                    if (bl2 || bl2) break block2;
                    this.4().forEach(arg_0 -> this.0((AtomicInteger)object, tessellator, accessorRenderManager, arg_0));
                    if (bl2 || bl2) break block2;
                    tessellator.draw((int)((long)1942859136 ^ (long)1942859139));
                    if (bl2 || bl2) break block2;
                    1A.0();
                    if (bl2 || bl2) break block2;
                    1A.0((boolean)((long)229549021 ^ (long)229549021));
                    if (!bl2 && !bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)-1754779270 ^ (long)-1754779270)]);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 7() {
        block3: {
            block2: {
                boolean bl2 = \u200a\u200f;
                if (bl2 || bl2) break block2;
                this.4().add(new 3Z(9O.2.h.p, 9O.2.h.q, 9O.2.h.r));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 2() {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a\u200f;
                    if (bl2 || bl2) break block2;
                    if (9O.2.h == null) break block3;
                    if (bl2 || bl2) break block2;
                    this.3();
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    private List<3Z> 4() {
        boolean bl2 = \u200a\u200f;
        if (bl2 || bl2) {
            return null;
        }
        return this.0(9O.2.h.am);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 9O.\u200a\u200f;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-1772562285 ^ (long)-1772562293)];
            if (var7) break block23;
            var3_2 = (int)((long)-426878753 ^ (long)-426878753);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u852c\uac84\u6f20\u9263\u85cb\uac6f\u6f57\u92a1\u8513\uac0e\u6f78\u9213\u85be\uacd6\u6fc3\u9285\u85ec\uaca3\u6f54\u922d\u8568\uac96\u6f80\u9216\u85af\uacfa\u6f9d\u92ff\u858b\uac88\u6fad\u928e\u85b9\uac47\u6f05\u924a\u8570\uace1\u6fdc\u923a\u85e7\uacec\u6ff7\u920b\u858d\uac9d\u6f65\u92a6\u85b9\uac48\u6f86\u927e\u85f7\uac48\u6f6a\u92d7\u8563\uac22\u6f26\u925f\u8581\uaca2\u6f22\u920b\u85dd\uacd6\u6fd3\u92c7\u8531\uac66\u6f89\u92c3\u853c\uac59\u6f30\u92d3\u8542\uac45\u6f56\u927e\u8590\uac59\u6f6a\u92b4\u85aa\uac75\u6f7c\u92f1\u85ab\uacdd\u6f1a\u9279\u859c\uacd7\u6ffe\u92b2\u85c8\uac73\u6ff5\u9228\u8584\uac43\u6f10\u92a5\u85d4\uac01\u6f54\u92e4\u8523\uacbd\u6f96\u921f\u85c7\uac15\u6fad\u92ee\u8576\uacbd\u6fde\u923c\u85fb\uacdd\u6ffe\u9248\u8510\uac5d\u6f7b\u92cd\u85e5\uacb3\u6f84\u9281\u857f\uac1f\u6f07\u921c\u853c\uac51\u6f0e\u9287\u8502\uaca0\u6fc3\u92c3\u851d\uac60\u6f6a\u92ca\u85f1\uaca0\u6faa\u92e6\u851a\uac85\u6f0a\u920e\u858d\uac0b\u6fe4\u92b1\u859a\uacf7\u6f8a\u9233\u85ae\uac43\u6f8d\u9203\u8595\uacac\u6f49\u9237\u853e\uac24\u6ffb\u9247\u85c2\uac65\u6f1e\u9268\u8595\uac37\u6f51\u9250\u85c6\uaca9\u6f4c\u92ca\u85ba\uac8d\u6fad\u9294\u85ba\uac23\u6f96\u9278\u85cd\uace1\u6f8a\u92fa\u8501\uac9e\u6fc1\u9227\u8583\uac6c\u6f57\u92eb\u8581\uac91\u6f9c\u9226\u85a9\uac28\u6f4a\u92a8\u858e\uac17\u6fed\u9299\u8524\uac84\u6fec\u9228\u85c0\uaca4\u6fc7\u9203\u85bb\uac5d\u6f18\u9288\u85c0\uacc0\u6f5a\u92ce\u8564\uac27\u6fff\u9254\u855a\uac45\u6fdf\u92ed\u85e3\uacf0\u6f4b\u9272\u8592\uac4b\u6f4c\u922e\u85e2\uac39\u6ff6\u9220\u8577\uacc5\u6f2c\u929f\u858f\uac10\u6fe5\u924b\u8578\uacd6\u6f9f\u92e8\u8536\uacad\u6f41\u92be\u8598\uacb7\u6f8b\u9226\u8506\uac82\u6f30\u92ec\u85ab\uaca8\u6f36\u9251\u85cd\uac1c\u6f2a\u9213\u85aa\uac07\u6fbe\u92f7\u85b3\uac7b\u6f9b\u92c6\u859c\uac69\u6f6b\u92a7\u85c7\uacfe\u6fa0\u92b7\u8502\uacc2\u6fcd\u923c\u8578\uacca\u6f18\u9266\u85cd\uac45\u6fec\u926c\u85b0\uac08\u6f81\u92b3\u858d\uac7d\u6f38\u9253\u8510\uacb9", 936813290);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-1185772742 ^ (long)-1185772737);
            if (var7) break block23;
            var0_6 = (int)((long)1345018402 ^ (long)-1345018403);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)851382123 ^ (long)851382017);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)1451777333 ^ (long)-1451777334);
                    if (9O.\u200a\u200f) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!9O.\u200a\u200f) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u92f3\ubba6\u781c\u85da\u9259\ubb15\u7833\u8547\u92f6\ubbf4\u78d0\u85b5", -1562135110);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-2129378809 ^ (long)-2129378814);
                            var0_6 = (int)((long)1832694141 ^ (long)-1832694142);
                            while (true) {
                                v0 = (int)((long)71551211 ^ (long)71551142);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)-1484600941 ^ (long)-1484600941);
                                if (!9O.\u200a\u200f) break block20;
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
                                if (!9O.\u200a\u200f) ** continue;
                                throw null;
                            }
                            9O.d = var5_1;
                            9O.e = new String[(int)((long)-873753403 ^ (long)-873753379)];
                            if (!9O.\u200a\u200f) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-1232363911 ^ (long)-1232363911);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)196971105 ^ (long)196971104)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)2052017559 ^ (long)2052017552)) {
                                case 0: {
                                    v15 = (int)((long)1579762550 ^ (long)1579762438);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)773269942 ^ (long)773269991);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)647044750 ^ (long)647044863);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)1155701246 ^ (long)1155701180);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)422751920 ^ (long)422751900);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-311540665 ^ (long)-311540684);
                                    if (!9O.\u200a\u200f) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)962605668 ^ (long)962605593);
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
                        } while (!9O.\u200a\u200f);
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

