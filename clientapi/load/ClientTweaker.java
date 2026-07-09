/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package clientapi.load;

import io.github.impactdevelopment.simpletweaker.SimpleTweaker;
import java.util.List;
import net.impactclient.0rB$1f;
import net.impactclient.4e;
import net.impactclient.4t;
import net.impactclient.7Z;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ClientTweaker
extends SimpleTweaker {
    private static final String[] b;
    public static final boolean \u2001\u200c;
    private static final String[] a;
    private static int[] 0;

    /*
     * Enabled aggressive block sorting
     */
    private void loadMixinConfig(String string) {
        boolean bl2 = \u2001\u200c;
        if (bl2 || bl2) return;
        if (this.getClass().getResourceAsStream(0rB$1f.XNZw("\ua201", -1448313301).concat(String.valueOf(string))) == null) {
            if (bl2 || bl2) return;
            Object[] objectArray = new Object[(int)((long)75446185 ^ (long)75446184)];
            objectArray[(int)((long)-478494591 ^ (long)-478494591)] = string;
            throw new 4e(ClientTweaker.a((int)((long)1961424119 ^ (long)-1961424048), (int)((long)1705477102 ^ (long)1705508162)), objectArray);
        }
        if (bl2) return;
        Mixins.addConfiguration(string);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setupMixin() {
        block4: {
            block2: {
                String string2;
                boolean bl2;
                block3: {
                    bl2 = \u2001\u200c;
                    if (bl2 || bl2) break block2;
                    MixinBootstrap.init();
                    if (bl2 || bl2) break block2;
                    4t.0.info(ClientTweaker.a((int)((long)-1571138653 ^ (long)1571138561), (int)((long)-1464684031 ^ (long)1464685240)));
                    if (bl2 || bl2) break block2;
                    List list = (List)Launch.blackboard.get(ClientTweaker.a((int)((long)982573137 ^ (long)-982573063), (int)((long)1362420330 ^ (long)1362396746)));
                    if (bl2) break block2;
                    string2 = ClientTweaker.a((int)((long)1687400870 ^ (long)-1687400947), (int)((long)-1459513062 ^ (long)-1459511620));
                    if (bl2 || bl2) break block2;
                    if (!list.stream().anyMatch(string -> {
                        boolean bl2 = \u2001\u200c;
                        if (bl2 || bl2) {
                            return true;
                        }
                        return string.contains(ClientTweaker.a((int)((long)1503584508 ^ (long)-1503584423), (int)((long)834836921 ^ (long)-834838755)));
                    })) break block3;
                    if (bl2 || bl2) break block2;
                    string2 = ClientTweaker.a((int)((long)1461523734 ^ (long)-1461523786), (int)((long)2115594784 ^ (long)2115571843));
                    if (bl2 || bl2) break block2;
                    4t.0.info(ClientTweaker.a((int)((long)674805799 ^ (long)-674805874), (int)((long)1470191194 ^ (long)1470185176)));
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
                if (bl2 || bl2) break block2;
                MixinEnvironment.getDefaultEnvironment().setObfuscationContext(string2);
                if (bl2 || bl2) break block2;
                4t.0.info(ClientTweaker.a((int)((long)-49738138 ^ (long)49738178), (int)((long)517112186 ^ (long)517120590)));
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = ClientTweaker.\u2001\u200c;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1308310428 ^ (long)1308310469)) & (int)((long)2078528970 ^ (long)2078485045);
            if (var9_2) ** GOTO lbl-1000
            if (ClientTweaker.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = ClientTweaker.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)11273090 ^ (long)11273090)] & (int)((long)-423974099 ^ (long)-423973934)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-1337936479 ^ (long)-1337936594);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)2059194306 ^ (long)2059194126);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1546325815 ^ (long)1546325783);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-2064142117 ^ (long)-2064142141);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-913747374 ^ (long)-913747215);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1563393394 ^ (long)-1563393291);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-1283962245 ^ (long)-1283962129);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)952390179 ^ (long)952390385);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)1862612556 ^ (long)1862612537);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-1421043362 ^ (long)-1421043230);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1554947119 ^ (long)-1554947135);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1294624403 ^ (long)-1294624285);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)735064967 ^ (long)735065075);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)467749515 ^ (long)467749404);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)967503292 ^ (long)967503233);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)928590902 ^ (long)928591045);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-1091854432 ^ (long)-1091854393);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)171982588 ^ (long)171982553);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1156812194 ^ (long)-1156812046);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)656711018 ^ (long)656710975);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-545768376 ^ (long)-545768252);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)67364164 ^ (long)67364207);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)2010871509 ^ (long)2010871472);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-597985301 ^ (long)-597985398);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)1434414579 ^ (long)1434414586);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)964282926 ^ (long)964282896);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1373671721 ^ (long)-1373671763);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-571848901 ^ (long)-571848837);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)714995851 ^ (long)714995933);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)1990383447 ^ (long)1990383428);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)534695998 ^ (long)534695983);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)736988426 ^ (long)736988480);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)15350937 ^ (long)15350938);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1454596198 ^ (long)1454596152);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)1340354111 ^ (long)1340354284);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)19955275 ^ (long)19955434);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1236017095 ^ (long)-1236017025);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-1481110422 ^ (long)-1481110373);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)586984211 ^ (long)586984339);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)13697899 ^ (long)13697983);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)109639202 ^ (long)109639373);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)345888968 ^ (long)345888812);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)2112184159 ^ (long)2112184114);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1872677940 ^ (long)-1872678076);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-209345938 ^ (long)-209346024);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-1151883752 ^ (long)-1151883745);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-975931928 ^ (long)-975931942);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)127604502 ^ (long)127604670);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1159433902 ^ (long)1159433880);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-503678375 ^ (long)-503678210);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-928177372 ^ (long)-928177192);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)351042535 ^ (long)351042436);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-1366509744 ^ (long)-1366509727);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-271511795 ^ (long)-271511576);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1845000010 ^ (long)1844999944);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1142290779 ^ (long)-1142290784);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1829708751 ^ (long)-1829708594);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1707296737 ^ (long)-1707296670);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1261633090 ^ (long)1261633222);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)80049596 ^ (long)80049486);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)763376643 ^ (long)763376857);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)201605310 ^ (long)201605365);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)2080766018 ^ (long)2080766124);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1756589781 ^ (long)-1756589630);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)870310447 ^ (long)870310517);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-162650496 ^ (long)-162650413);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)2047175725 ^ (long)2047175718);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-666394678 ^ (long)-666394770);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)2032022199 ^ (long)2032022078);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)665284757 ^ (long)665284739);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1608243925 ^ (long)1608243731);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1220603308 ^ (long)-1220603353);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-1006723614 ^ (long)-1006723825);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)667670626 ^ (long)667670783);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1658378748 ^ (long)-1658378726);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)-2002383042 ^ (long)-2002382874);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1085287350 ^ (long)1085287180);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1088738543 ^ (long)-1088738499);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1191046813 ^ (long)1191046701);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-747882280 ^ (long)-747882245);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-218659061 ^ (long)-218659003);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-31270841 ^ (long)-31270695);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)906148470 ^ (long)906148419);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-250885411 ^ (long)-250885389);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-1173823193 ^ (long)-1173823021);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)135216179 ^ (long)135216376);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-51155213 ^ (long)-51155343);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)1454744620 ^ (long)1454744828);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)2084033274 ^ (long)2084033068);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)71554892 ^ (long)71554856);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)1909705243 ^ (long)1909705366);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-1024626945 ^ (long)-1024627057);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)298726769 ^ (long)298726878);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)1135484659 ^ (long)1135484596);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1816994470 ^ (long)1816994457);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-579445281 ^ (long)-579445383);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1902301125 ^ (long)1902301085);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)513594167 ^ (long)513594289);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-707482763 ^ (long)-707482642);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-1985343213 ^ (long)-1985343126);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1512873286 ^ (long)1512873346);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)2028743866 ^ (long)2028743926);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)535380866 ^ (long)535380894);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-166320187 ^ (long)-166320214);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-340540228 ^ (long)-340540226);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)-106213528 ^ (long)-106213388);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)569089096 ^ (long)569089275);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-883451492 ^ (long)-883451398);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)279493175 ^ (long)279493213);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1236295532 ^ (long)-1236295554);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)626289252 ^ (long)626289292);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)308271106 ^ (long)308271230);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1115054222 ^ (long)1115054112);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1853922098 ^ (long)-1853922102);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1638741992 ^ (long)-1638741766);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1307955060 ^ (long)-1307954957);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1707836396 ^ (long)-1707836246);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-735086665 ^ (long)-735086624);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)472187239 ^ (long)472187190);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)531005122 ^ (long)531005151);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-1369039321 ^ (long)-1369039237);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)1868122437 ^ (long)1868122559);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)84659171 ^ (long)84659106);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)-1243090221 ^ (long)-1243090430);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-2009437713 ^ (long)-2009437714);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-912053656 ^ (long)-912053727);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)1142861089 ^ (long)1142861085);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-1567704649 ^ (long)-1567704806);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1561824827 ^ (long)-1561824971);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-648122817 ^ (long)-648122741);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)511091344 ^ (long)511091413);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-1765856081 ^ (long)-1765856154);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)528413448 ^ (long)528413623);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)35811164 ^ (long)35811324);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)993693860 ^ (long)993693916);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)187459545 ^ (long)187459478);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)1875194661 ^ (long)1875194790);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1232461107 ^ (long)-1232461302);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)562048108 ^ (long)562048138);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1440382593 ^ (long)1440382641);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)35904000 ^ (long)35904154);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-149792287 ^ (long)-149792275);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)1163482303 ^ (long)1163482256);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)153782543 ^ (long)153782740);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1689993296 ^ (long)-1689993286);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-902247551 ^ (long)-902247616);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)1932175880 ^ (long)1932175959);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1425918 ^ (long)1425895);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-1607931959 ^ (long)-1607931949);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)2017527082 ^ (long)2017527082);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-1873313277 ^ (long)-1873313216);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1277763531 ^ (long)1277763368);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)1501058345 ^ (long)1501058375);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)172016222 ^ (long)172016359);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1787668286 ^ (long)-1787668311);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)732229461 ^ (long)732229393);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-1170474581 ^ (long)-1170474736);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1107328207 ^ (long)1107328159);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-100627156 ^ (long)-100627080);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-488196 ^ (long)-488290);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)592135660 ^ (long)592135539);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1029517093 ^ (long)1029517063);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1045202600 ^ (long)1045202494);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)613173761 ^ (long)613173800);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)128109096 ^ (long)128109194);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)963532464 ^ (long)963532402);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-1844898949 ^ (long)-1844898991);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)725117012 ^ (long)725117101);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)949897385 ^ (long)949897297);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-117390188 ^ (long)-117390231);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1983076359 ^ (long)-1983076583);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-818766413 ^ (long)-818766411);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1829384912 ^ (long)1829384841);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1683958723 ^ (long)-1683958667);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-464059741 ^ (long)-464059855);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)330440992 ^ (long)330441110);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)2076402324 ^ (long)2076402263);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)811276777 ^ (long)811276588);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1297605998 ^ (long)-1297606011);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-354457565 ^ (long)-354457418);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-1099028492 ^ (long)-1099028532);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-126164694 ^ (long)-126164527);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-1129559436 ^ (long)-1129559324);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1420477983 ^ (long)-1420478022);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-2071664038 ^ (long)-2071663984);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)2113488468 ^ (long)2113488597);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)288900392 ^ (long)288900380);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-14815861 ^ (long)-14815828);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)437597008 ^ (long)437597072);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)590548410 ^ (long)590548325);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-505319443 ^ (long)-505319577);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)2067548070 ^ (long)2067548024);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)110097334 ^ (long)110097374);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-2098892496 ^ (long)-2098892325);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)1406196991 ^ (long)1406196852);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-1589756940 ^ (long)-1589756967);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1244497474 ^ (long)-1244497549);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-122729819 ^ (long)-122729870);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)676871314 ^ (long)676871348);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-1833228367 ^ (long)-1833228417);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)2048556483 ^ (long)2048556502);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1405117576 ^ (long)-1405117485);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-741846720 ^ (long)-741846641);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-476725538 ^ (long)-476725728);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)1979929563 ^ (long)1979929346);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)2144658293 ^ (long)2144658252);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1137266796 ^ (long)1137266852);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)900991397 ^ (long)900991315);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)1357212150 ^ (long)1357211907);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-94312410 ^ (long)-94312446);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-569578606 ^ (long)-569578717);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)100902499 ^ (long)100902640);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)87073670 ^ (long)87073739);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)667267386 ^ (long)667267432);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-88479175 ^ (long)-88479229);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1587239960 ^ (long)1587240049);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-37808372 ^ (long)-37808365);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1737816223 ^ (long)1737816104);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-1904506650 ^ (long)-1904506659);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1589939667 ^ (long)1589939656);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1967832272 ^ (long)1967832076);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1501020333 ^ (long)1501020234);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)1755044049 ^ (long)1755043888);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1297763537 ^ (long)1297763568);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-730030377 ^ (long)-730030510);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)1757241040 ^ (long)1757241048);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)737387112 ^ (long)737387130);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1139213564 ^ (long)-1139213386);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)521523836 ^ (long)521523929);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1054200365 ^ (long)1054200560);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-1902677580 ^ (long)-1902677663);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1563754240 ^ (long)-1563754095);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)276804343 ^ (long)276804266);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1799977758 ^ (long)1799977836);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1671244163 ^ (long)1671244271);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)-877869184 ^ (long)-877869270);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)667316670 ^ (long)667316672);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-123254377 ^ (long)-123254397);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-627316229 ^ (long)-627316382);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1891382065 ^ (long)1891382097);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)2114543932 ^ (long)2114543892);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-31991776 ^ (long)-31991789);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1438945265 ^ (long)1438945142);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-510619748 ^ (long)-510619759);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-1860337104 ^ (long)-1860337087);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-2051644864 ^ (long)-2051644745);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1696865499 ^ (long)-1696865396);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-389280419 ^ (long)-389280288);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-250970595 ^ (long)-250970518);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1395990237 ^ (long)1395990117);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)1436714617 ^ (long)1436714721);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1218619086 ^ (long)1218619129);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)502952157 ^ (long)502952147);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-2043128353 ^ (long)-2043128525);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)1013417060 ^ (long)1013417169);
                    if (!ClientTweaker.\u2001\u200c) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-1215593527 ^ (long)-1215593530);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1038649509 ^ (long)1038649434)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)1592164708 ^ (long)1592163995)) >>> (int)((long)433515328 ^ (long)433515336)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-633462321 ^ (long)-633462321);
            if (!ClientTweaker.\u2001\u200c) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)803050629 ^ (long)803050631);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)218495244 ^ (long)218495247) | var5_6 << (int)((long)-1623411225 ^ (long)-1623411230)) ^ var3_4[var7_8]) & (int)((long)679500895 ^ (long)679500960);
                    if (ClientTweaker.\u2001\u200c) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1306850992 ^ (long)1306850995) | var6_7 << (int)((long)-1507141357 ^ (long)-1507141354)) ^ var3_4[var7_8]) & (int)((long)-477616928 ^ (long)-477617121);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            ClientTweaker.b[var2_3] = new String(var3_4).intern();
        }
        return ClientTweaker.b[var2_3];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = ClientTweaker.\u2001\u200c;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)-1480878448 ^ (long)-1480878436)];
            if (var7) break block23;
            var3_2 = (int)((long)-1447020407 ^ (long)-1447020407);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\ub34f\u6102\ua292\u5f6c\ub304\u61c8\ua2d5\u5f43\ub3c2\u61c2\ua25e\u5f08\ub3ed\u6157\ua2f2\u5f24\ub348\u61d9\ua243\u5fa7\ub39d\u61eb\ua28e\u5f82\ub371\u616a\ua2e7\u5f8a\ub3f7\u619e\ua240\u5f63\ub3d9\u613a\ua2fb\u5f0d\ub347\u61a3\ua235\u5f08\ub341\u617f\ua299\u5f96\ub3d6\u61b1\ua2e0\u5f30\ub37a\u61a9\ua235\u5f10\ub3cf\u61de\ua20c\u5ff6\ub312\u6138\ua261\u5f21\ub3a2\u6141\ua29e\u5fca\ub32a\u61d4\ua2f6\u5f63\ub3f4\u6198\ua2b1\u5fa9\ub3ab\u614c\ua238\u5fe7\ub3d3\u61c2\ua208\u5f3a\ub3d2\u6145\ua29f\u5f3f\ub379\u6187\ua209\u5f8d\ub335\u61eb\ua2df\u5f03\ub383\u61e4\ua236\u5f99\ub3d1\u61a3\ua2f1\u5f09\ub393\u6147\ua233\u5f6d\ub34b\u6130\ua21e\u5f8c\ub39d\u618b\ua21b\u5fe5\ub348\u61ca\ua2c5\u5f8e\ub300\u61f5\ua2bc\u5f5a\ub375\u61c3\ua207\u5fc4\ub367\u61c4\ua2ee\u5f55\ub38a\u61fb\ua2d3\u5fce\ub38a\u619b\ua258\u5f59\ub316\u61b6\ua2dc\u5f5c\ub3d4\u61c5\ua236\u5ffe\ub3f7\u612a\ua2fc\u5f49\ub3ea\u6185\ua288\u5f8a\ub3b1\u612f\ua2d0\u5ffd\ub30a\u611f\ua258\u5f46\ub309\u6102\ua2d4\u5f7d\ub30c\u61ba\ua2e8\u5f36\ub3f1\u61c2\ua2f4\u5fd4\ub3c8\u6114\ua272\u5fe1\ub36f\u6107\ua2d1\u5f86\ub323\u61f9\ua218\u5f5a\ub308\u6199\ua20a\u5ff8\ub31c\u61ab\ua250\u5f09\ub369\u610d\ua22d\u5fba\ub385\u619a\ua297\u5f98\ub370\u6150\ua22f\u5f94\ub35f\u6163\ua25c\u5f46\ub372\u61cf\ua25b\u5ff1\ub37b\u612d\ua23e\u5f9b\ub394\u61a8\ua2a0\u5fad\ub3b3\u612e\ua27b\u5ffc\ub3c1\u61f2\ua2ad\u5f0c\ub3aa\u611e\ua2aa\u5f75\ub3c1\u6170\ua239\u5f8d\ub3d0\u6134\ua2c7\u5fea\ub336\u6111\ua25a\u5f4b\ub3a2\u61f7\ua24a\u5f5b\ub3b7\u6163\ua285\u5f87\ub3f8\u61a8\ua279\u5f94\ub3e5\u61b1\ua2c4\u5fcf\ub375\u6185\ua21c\u5fde\ub3e3\u6130\ua226\u5f68", 1150381899);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)-903444705 ^ (long)-903444721);
            if (var7) break block23;
            var0_6 = (int)((long)91305980 ^ (long)-91305981);
            ClientTweaker.0(new int[(int)((long)-1726192586 ^ (long)-1726192590)]);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)570161221 ^ (long)570161260);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)2058784030 ^ (long)-2058784031);
                    if (ClientTweaker.\u2001\u200c) {
                        throw null;
lbl25:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!ClientTweaker.\u2001\u200c) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\ua538\u7725\ub415\u4942\ua579\u77e7\ub472\u4925\ua55f\u77bb\ub4d7\u4901\ua5c5\u7743\ub4a6\u49ba\ua53d\u7779\ub4fc\u49f3\ua562\u7768\ub4c1\u4979", -11175588);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)1314094356 ^ (long)1314094353);
                            var0_6 = (int)((long)-1918443033 ^ (long)1918443032);
                            while (true) {
                                v0 = (int)((long)-1723537954 ^ (long)-1723538037);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)896565041 ^ (long)896565041);
                                if (!ClientTweaker.\u2001\u200c) break block20;
                                throw null;
                            }
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!ClientTweaker.\u2001\u200c) ** continue;
                                throw null;
                            }
                            ClientTweaker.a = var5_1;
                            ClientTweaker.b = new String[(int)((long)1491100370 ^ (long)1491100382)];
                            if (!ClientTweaker.\u2001\u200c) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-2057529283 ^ (long)-2057529283);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)824758037 ^ (long)824758036)) ** GOTO lbl108
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-502553835 ^ (long)-502553838)) {
                                case 0: {
                                    v15 = (int)((long)-1174880878 ^ (long)-1174880845);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-2141070211 ^ (long)-2141070261);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)-504614867 ^ (long)-504614879);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)-1429590148 ^ (long)-1429590157);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)-972638257 ^ (long)-972638330);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-1051304353 ^ (long)-1051304399);
                                    if (!ClientTweaker.\u2001\u200c) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)-1446133538 ^ (long)-1446133564);
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
                        } while (!ClientTweaker.\u2001\u200c);
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
        }
    }

    public static int[] 0() {
        boolean bl2 = \u2001\u200c;
        if (bl2) {
            return null;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void injectIntoClassLoader(LaunchClassLoader launchClassLoader) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2001\u200c;
                    if (bl2) break block2;
                    int[] nArray = ClientTweaker.0();
                    super.injectIntoClassLoader(launchClassLoader);
                    4t.0.info(ClientTweaker.a((int)((long)537706827 ^ (long)-537706776), (int)((long)-752291671 ^ (long)752291370)));
                    this.setupMixin();
                    this.loadMixinConfig(ClientTweaker.a((int)((long)-1369279565 ^ (long)1369279506), (int)((long)929232174 ^ (long)929212174)));
                    this.loadMixinConfig(ClientTweaker.a((int)((long)371400581 ^ (long)-371400657), (int)((long)229409971 ^ (long)-229438072)));
                    int[] nArray2 = nArray;
                    if (bl2 || bl2) break block2;
                    4t.0.info(ClientTweaker.a((int)((long)-1336585699 ^ (long)1336585659), (int)((long)1222105982 ^ (long)-1222083810)));
                    if (bl2 || bl2) break block2;
                    if (nArray2 != null) break block3;
                    if (bl2) break block2;
                    7Z.0(new 7Z[(int)((long)1069146606 ^ (long)1069146604)]);
                    if (bl2) break block2;
                }
                if (!bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ClientTweaker() {
        boolean bl2 = \u2001\u200c;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(int[] nArray) {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200c;
                if (bl2) break block2;
                0 = nArray;
                if (!bl2) break block3;
            }
            return;
        }
    }
}

