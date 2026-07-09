/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  jq
 *  jq$a
 *  lk$b
 */
package net.impactclient;

import java.util.Set;
import java.util.function.Predicate;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import me.zero.clarinet.hook.mixin.accessor.AccessorCPacketPlayer;
import me.zero.clarinet.hook.mixin.accessor.AccessorSPacketPlayerPosLook;
import net.impactclient.0rB$1f;
import net.impactclient.1J;
import net.impactclient.1f;
import net.impactclient.1l;
import net.impactclient.37;
import net.impactclient.41;
import net.impactclient.4n;
import net.impactclient.73;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 8W
extends 73
implements 37 {
    private Float 0;
    private Float 1;
    @EventHandler
    private final Listener<1f> 3;
    private static final String[] e;
    @EventHandler
    private final Listener<1l> 4;
    public static final boolean \u2006\u2001\u2003\u200e\u200a\u200b;
    private static final String[] d;

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 8W.\u2006\u2001\u2003\u200e\u200a\u200b;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1193533685 ^ (long)1193523591)) & (int)((long)-1989615255 ^ (long)-1989665130);
            if (var9_2) ** GOTO lbl-1000
            if (8W.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 8W.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-8877364 ^ (long)-8877364)] & (int)((long)-1990341712 ^ (long)-1990341809)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)150648757 ^ (long)150648607);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-996369023 ^ (long)-996368913);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1576776344 ^ (long)-1576776259);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1823321554 ^ (long)-1823321535);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1608845713 ^ (long)1608845754);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)1180206034 ^ (long)1180206032);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-228913885 ^ (long)-228913764);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1921795169 ^ (long)1921795183);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-212130646 ^ (long)-212130739);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)1635665515 ^ (long)1635665603);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1721720359 ^ (long)-1721720472);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)18878711 ^ (long)18878524);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-2079871793 ^ (long)-2079871815);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)378361551 ^ (long)378361375);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)1088149912 ^ (long)1088149983);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1144360 ^ (long)1144444);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-1453425105 ^ (long)-1453424899);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)-922171575 ^ (long)-922171393);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)297793955 ^ (long)297793795);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)826738282 ^ (long)826738256);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)414875524 ^ (long)414875521);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)2041287137 ^ (long)2041287112);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)259914470 ^ (long)259914249);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-573731714 ^ (long)-573731690);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)-386832663 ^ (long)-386832832);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)1741590710 ^ (long)1741590716);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-736889135 ^ (long)-736889321);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1258764058 ^ (long)-1258764217);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)2093997136 ^ (long)2093997309);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1519068490 ^ (long)1519068621);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-1910769929 ^ (long)-1910770115);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-1323999401 ^ (long)-1323999338);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)317505310 ^ (long)317505506);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)330903441 ^ (long)330903441);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)-1776207895 ^ (long)-1776208057);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)399205496 ^ (long)399205479);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)756108270 ^ (long)756108112);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1397129050 ^ (long)1397129199);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-14093670 ^ (long)-14093582);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1873742623 ^ (long)1873742741);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-474522040 ^ (long)-474522037);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1199666025 ^ (long)-1199666125);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1086476132 ^ (long)1086476198);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)2084574833 ^ (long)2084574732);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)1259658381 ^ (long)1259658283);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1991936061 ^ (long)-1991936117);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)1431749264 ^ (long)1431749362);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)2105774144 ^ (long)2105774131);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-1826080300 ^ (long)-1826080336);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)131333313 ^ (long)131333182);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)753169746 ^ (long)753169666);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1479308117 ^ (long)1479308159);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)563421803 ^ (long)563421872);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1814806252 ^ (long)-1814806106);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1420997303 ^ (long)1420997311);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-652955165 ^ (long)-652955329);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)2083280721 ^ (long)2083280851);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)1898011420 ^ (long)1898011585);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-348043870 ^ (long)-348044001);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)1698901002 ^ (long)1698901141);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)900177577 ^ (long)900177542);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-877707545 ^ (long)-877707549);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1439435552 ^ (long)-1439435531);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)1998291003 ^ (long)1998290988);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)2023862927 ^ (long)2023862920);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)1356308453 ^ (long)1356308238);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-562337568 ^ (long)-562337678);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)270563260 ^ (long)270563076);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1710965711 ^ (long)1710965694);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)148092106 ^ (long)148092063);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)356876047 ^ (long)356876269);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1990454066 ^ (long)-1990454193);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1145953606 ^ (long)-1145953653);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)145682339 ^ (long)145682200);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1786174761 ^ (long)1786174734);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)831397020 ^ (long)831397109);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1168920421 ^ (long)1168920370);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)1703244020 ^ (long)1703243806);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1600492615 ^ (long)1600492713);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-253947261 ^ (long)-253947198);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)633342562 ^ (long)633342715);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-940420204 ^ (long)-940420155);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)-617856983 ^ (long)-617856820);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)319496877 ^ (long)319496792);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1862024254 ^ (long)1862024375);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)485254845 ^ (long)485254801);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1476030240 ^ (long)1476030364);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-2086631147 ^ (long)-2086630951);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-566903718 ^ (long)-566903707);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-323928418 ^ (long)-323928504);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1074513142 ^ (long)-1074513081);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-380049575 ^ (long)-380049637);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1491332059 ^ (long)-1491332052);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-283702426 ^ (long)-283702389);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-1447855161 ^ (long)-1447855130);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)427802234 ^ (long)427802348);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-2025812082 ^ (long)-2025812022);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)858024762 ^ (long)858024861);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)886837298 ^ (long)886837500);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)714789826 ^ (long)714789761);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-970668996 ^ (long)-970668851);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-1000070823 ^ (long)-1000070783);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)1840315833 ^ (long)1840315698);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-158267234 ^ (long)-158267141);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1248070982 ^ (long)-1248071007);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-1326448956 ^ (long)-1326449011);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)119603684 ^ (long)119603604);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-372306294 ^ (long)-372306349);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-107327805 ^ (long)-107327975);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-2109862106 ^ (long)-2109862007);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)-439525455 ^ (long)-439525424);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)1802543755 ^ (long)1802543767);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-453875575 ^ (long)-453875603);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1818572969 ^ (long)1818572864);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1429488888 ^ (long)-1429488813);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)198722241 ^ (long)198722294);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-444568323 ^ (long)-444568337);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)111875198 ^ (long)111875149);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)420336807 ^ (long)420336861);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1609965553 ^ (long)1609965429);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)283530203 ^ (long)283530055);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-760639131 ^ (long)-760638999);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1713968831 ^ (long)-1713968677);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1676546878 ^ (long)1676546979);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-781136710 ^ (long)-781136664);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)183629575 ^ (long)183629661);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-377279463 ^ (long)-377279270);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1294787115 ^ (long)1294787282);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1334872897 ^ (long)-1334872858);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1866519295 ^ (long)-1866519054);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-1858907614 ^ (long)-1858907428);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1588348261 ^ (long)1588348259);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1554309256 ^ (long)-1554309366);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1486854140 ^ (long)1486854003);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1672646290 ^ (long)1672646220);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)491285302 ^ (long)491285477);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)439792590 ^ (long)439792635);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)771821085 ^ (long)771821211);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-842057555 ^ (long)-842057653);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1961683534 ^ (long)1961683511);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)1278195868 ^ (long)1278195962);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)15853359 ^ (long)15853396);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1848211157 ^ (long)1848211041);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)920876467 ^ (long)920876403);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)731372801 ^ (long)731372954);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)939157704 ^ (long)939157631);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-41807665 ^ (long)-41807617);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-2013310534 ^ (long)-2013310492);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)1680271743 ^ (long)1680271726);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-534954215 ^ (long)-534954095);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1548709070 ^ (long)-1548708924);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1555359264 ^ (long)-1555359263);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-835447438 ^ (long)-835447406);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)1887599456 ^ (long)1887599421);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1411127329 ^ (long)-1411127385);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1216417408 ^ (long)-1216417352);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-529446897 ^ (long)-529446714);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)714377099 ^ (long)714377191);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-263961654 ^ (long)-263961615);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)2032792301 ^ (long)2032792226);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)238398941 ^ (long)238398974);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-147686607 ^ (long)-147686617);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-449732607 ^ (long)-449732458);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-773399633 ^ (long)-773399685);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)1599219820 ^ (long)1599219919);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)1940233267 ^ (long)1940233412);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)2103182024 ^ (long)2103182007);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-767458886 ^ (long)-767459050);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-1211093853 ^ (long)-1211093844);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)1229585406 ^ (long)1229585300);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1463775823 ^ (long)-1463775756);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-702541176 ^ (long)-702541126);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)-44951812 ^ (long)-44951900);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)201218656 ^ (long)201218620);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)438351800 ^ (long)438351797);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)-1413952473 ^ (long)-1413952423);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1436408434 ^ (long)1436408431);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1155546329 ^ (long)-1155546145);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1314819867 ^ (long)1314819855);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)1767490449 ^ (long)1767490495);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-575002392 ^ (long)-575002465);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-11605863 ^ (long)-11605923);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1720212782 ^ (long)-1720212885);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)83221341 ^ (long)83221394);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1937735359 ^ (long)-1937735217);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-1513655656 ^ (long)-1513655634);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)687566766 ^ (long)687566658);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1188447065 ^ (long)-1188447047);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-2103998419 ^ (long)-2103998330);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-1245163932 ^ (long)-1245163985);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-953200908 ^ (long)-953201081);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1971292229 ^ (long)-1971292163);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)2127382946 ^ (long)2127382808);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-1181201397 ^ (long)-1181201234);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-1812590294 ^ (long)-1812590303);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)1163502202 ^ (long)1163502233);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)823969020 ^ (long)823968938);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1352283970 ^ (long)-1352283958);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-15010713 ^ (long)-15010665);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)779733969 ^ (long)779733857);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1654031241 ^ (long)1654031108);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)51259979 ^ (long)51260013);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-1413249091 ^ (long)-1413249143);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-1397620993 ^ (long)-1397621033);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-692895259 ^ (long)-692895242);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-875835019 ^ (long)-875834912);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-380895127 ^ (long)-380895058);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-1640300121 ^ (long)-1640300134);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)530887731 ^ (long)530887721);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-1034629749 ^ (long)-1034629867);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)718524036 ^ (long)718524061);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-116595584 ^ (long)-116595596);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)2469420 ^ (long)2469556);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)23014008 ^ (long)23013901);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1262054663 ^ (long)-1262054692);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1768251086 ^ (long)1768250973);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)2062195080 ^ (long)2062195121);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)126286905 ^ (long)126286855);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)991276203 ^ (long)991276148);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)856265676 ^ (long)856265664);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)753733670 ^ (long)753733686);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1879850850 ^ (long)1879850792);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)628123817 ^ (long)628123877);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)491390586 ^ (long)491390534);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-96919807 ^ (long)-96919676);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1356747039 ^ (long)-1356747167);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-85227305 ^ (long)-85227483);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)1241921506 ^ (long)1241921398);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-1625127964 ^ (long)-1625128151);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1632064588 ^ (long)-1632064731);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)121485539 ^ (long)121485336);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)254350982 ^ (long)254351046);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)2068904262 ^ (long)2068904230);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-262659334 ^ (long)-262659534);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1601221278 ^ (long)1601221199);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-1562333814 ^ (long)-1562333739);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)1736589445 ^ (long)1736589412);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1716903087 ^ (long)-1716903044);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-300403019 ^ (long)-300402984);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-1452634454 ^ (long)-1452634419);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-2146518595 ^ (long)-2146518631);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)1352355628 ^ (long)1352355793);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1603086803 ^ (long)1603086835);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)540234427 ^ (long)540234456);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)289433735 ^ (long)289433836);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1497798640 ^ (long)-1497798562);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1895362355 ^ (long)-1895362321);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-731853071 ^ (long)-731853229);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)538834873 ^ (long)538834755);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1034415978 ^ (long)-1034416063);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-774885985 ^ (long)-774886129);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1022508526 ^ (long)-1022508329);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1404170603 ^ (long)1404170519);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-644076880 ^ (long)-644076888);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-769094720 ^ (long)-769094845);
                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1360534452 ^ (long)1360534503);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-97484602 ^ (long)-97484743)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-2078324209 ^ (long)-2078296592)) >>> (int)((long)724126391 ^ (long)724126399)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-855357952 ^ (long)-855357952);
            if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)250007337 ^ (long)250007339);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)513903955 ^ (long)513903952) | var5_6 << (int)((long)185398341 ^ (long)185398336)) ^ var3_4[var7_8]) & (int)((long)-1168996678 ^ (long)-1168996795);
                    if (8W.\u2006\u2001\u2003\u200e\u200a\u200b) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1778075945 ^ (long)1778075946) | var6_7 << (int)((long)651544802 ^ (long)651544807)) ^ var3_4[var7_8]) & (int)((long)-390002339 ^ (long)-390002270);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            8W.e[var2_3] = new String(var3_4).intern();
        }
        return 8W.e[var2_3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                var7 = 8W.\u2006\u2001\u2003\u200e\u200a\u200b;
                if (!var7) break block15;
                break block16;
            }
            var5_1 = new String[(int)((long)262109570 ^ (long)262109568)];
            if (var7) break block16;
            var3_2 = (int)((long)-381160157 ^ (long)-381160157);
            if (var7) break block16;
            var2_3 = 0rB$1f.XNZw("\u9c7e\ub543\u769e\u8bce\u9c8f\ub5a6\u761c\u8b77\u9cad\ub561\u76df\u8b27\u9c59\ub580\u76ab\u8b4b\u9cb9\ub53e\u7612\u8b95\u9c74\ub5da\u76fd\u8be6\u9c59\ub507\u76b3\u8bdd\u9c0d\ub54b\u7621\u8b60\u9cb7\ub50f\u76c8\u8b04\u9c7b\ub568\u768e\u8b60\u9cbe\ub5f5", -38224920);
            var4_4 = var2_3.length();
            if (var7) break block16;
            var1_5 = (int)((long)-13708089 ^ (long)-13708082);
            if (var7) break block16;
            var0_6 = (int)((long)1503300782 ^ (long)-1503300783);
            if (var7) break block16;
            block8: while (!var7) {
                v0 = ++var0_6;
                v1 = (int)((long)-1294231762 ^ (long)1294231761);
                if (8W.\u2006\u2001\u2003\u200e\u200a\u200b) {
                    throw null;
                    while (true) {
                        var5_1[var3_2++] = new String(v2).intern();
                        if ((var0_6 += var1_5) < var4_4) {
                            var1_5 = var2_3.charAt(var0_6);
                            if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) continue block8;
                            throw null;
                        }
                        8W.d = var5_1;
                        8W.e = new String[(int)((long)-310389608 ^ (long)-310389606)];
                        if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break block8;
                        throw null;
                    }
                }
                v3 = var2_3.substring(v0, v0 + var1_5).toCharArray();
                v4 = v3.length;
                var6_7 = (int)((long)-1905142067 ^ (long)-1905142067);
                v5 = (int)((long)-1408885843 ^ (long)-1408885884);
                v6 = v3;
                v7 = v4;
                if (v4 > (int)((long)1697286808 ^ (long)1697286809)) ** GOTO lbl87
                do {
                    block14: {
                        v8 = v5;
                        v6 = v6;
                        v9 = v6;
                        v10 = v5;
                        v11 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)1962126704 ^ (long)1962126711)) {
                                case 0: {
                                    v12 = (int)((long)2060665633 ^ (long)2060665656);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                case 1: {
                                    v12 = (int)((long)1830522970 ^ (long)1830522889);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                case 2: {
                                    v12 = (int)((long)1394631179 ^ (long)1394631211);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                case 3: {
                                    v12 = (int)((long)1690093107 ^ (long)1690093104);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                case 4: {
                                    v12 = (int)((long)-1373966801 ^ (long)-1373966814);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                case 5: {
                                    v12 = (int)((long)811789770 ^ (long)811789715);
                                    if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) break;
                                    throw null;
                                }
                                default: {
                                    v12 = (int)((long)1723684349 ^ (long)1723684263);
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
                        } while (!8W.\u2006\u2001\u2003\u200e\u200a\u200b);
                        throw null;
                    }
                    v2 = v6;
                    v7 = v7;
                } while (v7 > var6_7);
                if (!8W.\u2006\u2001\u2003\u200e\u200a\u200b) ** continue;
                throw null;
            }
        }
    }

    public 8W() {
        boolean bl2 = \u2006\u2001\u2003\u200e\u200a\u200b;
        super(8W.b((int)((long)875214111 ^ (long)875228269), (int)((long)940233362 ^ (long)940217922)), 8W.b((int)((long)507113968 ^ (long)507095171), (int)((long)1600574430 ^ (long)-1600582102)));
        Predicate[] predicateArray = new Predicate[(int)((long)728634468 ^ (long)728634469)];
        Class[] classArray = new Class[(int)((long)1813836203 ^ (long)1813836202)];
        classArray[(int)((long)1543317524 ^ (long)1543317524)] = jq.class;
        predicateArray[(int)((long)1027130919 ^ (long)1027130919)] = new 4n(classArray);
        this.4 = new Listener<1l>(l2 -> {
            boolean bl2 = \u2006\u2001\u2003\u200e\u200a\u200b;
            if (bl2 || bl2) return;
            if (l2.0 != EventState.PRE) {
                if (bl2 || bl2) return;
                return;
            }
            if (bl2) return;
            Object object = (jq)((1J)l2).0;
            Set set = object.g();
            if (bl2 || bl2) return;
            this.0 = Float.valueOf(object.d());
            if (bl2 || bl2) return;
            this.1 = Float.valueOf(object.e());
            if (bl2 || bl2) return;
            if (set.contains(jq.a.d)) {
                if (bl2 || bl2) return;
                this.0 = Float.valueOf(this.0.floatValue() + 8W.2.h.v);
                if (bl2) return;
            }
            if (bl2) return;
            if (set.contains(jq.a.e)) {
                if (bl2 || bl2) return;
                this.1 = Float.valueOf(this.1.floatValue() + 8W.2.h.w);
                if (bl2) return;
            }
            if (bl2) return;
            set.removeIf(a2 -> {
                boolean bl2 = \u2006\u2001\u2003\u200e\u200a\u200b;
                if (bl2 || bl2) return true;
                if (a2.ordinal() > (int)((long)-358443418 ^ (long)-358443420)) {
                    if (bl2) return true;
                    return (int)((long)163490194 ^ (long)163490195) != 0;
                }
                if (!bl2) return (int)((long)1344861498 ^ (long)1344861498) != 0;
                return true;
            });
            if (bl2 || bl2) return;
            object = (AccessorSPacketPlayerPosLook)((1J)l2).0;
            object.setYaw(8W.2.h.v);
            if (bl2 || bl2) return;
            object.setPitch(8W.2.h.w);
            if (!bl2 && !bl2) return;
        }, predicateArray);
        Predicate[] predicateArray2 = new Predicate[(int)((long)912605171 ^ (long)912605170)];
        Class[] classArray2 = new Class[(int)((long)0x2C777C2C ^ (long)746028077)];
        classArray2[(int)((long)-1487762020 ^ (long)-1487762020)] = lk.b.class;
        predicateArray2[(int)((long)-1136191689 ^ (long)-1136191689)] = new 41(classArray2);
        this.3 = new Listener<1f>(object -> {
            block5: {
                block2: {
                    boolean bl2;
                    block4: {
                        block3: {
                            bl2 = \u2006\u2001\u2003\u200e\u200a\u200b;
                            if (bl2 || bl2) break block2;
                            object = (AccessorCPacketPlayer)((1J)object).0;
                            if (bl2 || bl2) break block2;
                            if (this.0 == null) break block3;
                            if (bl2 || bl2) break block2;
                            object.setYaw(this.0.floatValue());
                            if (bl2 || bl2) break block2;
                            this.0 = null;
                            if (bl2) break block2;
                        }
                        if (bl2) break block2;
                        if (this.1 == null) break block4;
                        if (bl2 || bl2) break block2;
                        object.setPitch(this.1.floatValue());
                        if (bl2 || bl2) break block2;
                        this.1 = null;
                        if (bl2) break block2;
                    }
                    if (!bl2) break block5;
                }
                return;
            }
        }, predicateArray2);
    }
}

