/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.37;
import net.impactclient.43;
import net.impactclient.73;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 8K
extends 73
implements 37 {
    @EventHandler
    private final Listener<43> 0;
    private static final String[] e;
    private static final String[] d;
    public static final boolean \u2006;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 2() {
        block3: {
            block2: {
                boolean bl2 = \u2006;
                if (bl2 || bl2) break block2;
                BaritoneAPI.getProvider().getPrimaryBaritone().getFarmProcess().farm();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1() {
        block3: {
            block2: {
                boolean bl2 = \u2006;
                if (bl2 || bl2) break block2;
                BaritoneAPI.getProvider().getPrimaryBaritone().getFarmProcess().onLostControl();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public 8K() {
        boolean bl2 = \u2006;
        super(8K.b((int)((long)656888847 ^ (long)-656874847), (int)((long)2029990300 ^ (long)-2030001012)), 8K.b((int)((long)-1698632671 ^ (long)1698650766), (int)((long)1964881340 ^ (long)1964873640)));
        this.0 = new Listener<43>(var1_1 -> {
            block4: {
                block2: {
                    boolean bl2;
                    block3: {
                        bl2 = \u2006;
                        if (bl2 || bl2) break block2;
                        if (BaritoneAPI.getProvider().getPrimaryBaritone().getFarmProcess().isActive()) break block3;
                        if (bl2 || bl2) break block2;
                        this.0((boolean)((long)-1056487022 ^ (long)-1056487022));
                        if (bl2) break block2;
                    }
                    if (!bl2) break block4;
                }
                return;
            }
        }, new Predicate[(int)((long)1218927556 ^ (long)1218927556)]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                var7 = 8K.\u2006;
                if (!var7) break block15;
                break block16;
            }
            var5_1 = new String[(int)((long)270570717 ^ (long)270570719)];
            if (var7) break block16;
            var3_2 = (int)((long)649145731 ^ (long)649145731);
            if (var7) break block16;
            var2_3 = 0rB$1f.XNZw("\uba99\u93be\u5080\uadc0\ubab1\u93f7\u50b6\uad6b\uba21\u935b\u5087\uad1f\uba52\u93c1\u50b7\uadc5\uba96\u93c0\u508d\uadf7\uba04\u93e4\u5062\uadfc\uba64\u9343\u5062\uad2c\ubaf9\u9302\u505b\uad8c\uba82\u93a3\u50aa\uadbb\uba7b\u93f4\u5059\uad65\uba5f\u9387\u50ef\uad38\uba14\u9393\u500e\uad91\uba94\u9393\u50a9\uad9f\uba8c\u937b\u50b0\uadf5\ubabd\u934f\u500c\uadd6\uba36\u9369\u50f0\uad57\uba3f\u935d\u5032\uad0d\uba44\u9356\u5038\uad3e\uba96\u93c2\u502b\uadc1\ubafb\u93f2\u50d3\uadc2\uba9f\u9384\u5073\uadd0\uba9b\u9313\u5029\uadfa\uba17\u939d\u50ce\uadfc\ubadd\u93b6\u500d\uade1\uba4d\u935c\u506d\uad4f\uba80\u93e4\u50e1\uadfd\uba41\u9393\u503a\uadbb\ubad8\u9304\u50f4\uadab\uba43\u93d1\u5003\uadd0\uba50\u93a4\u503e\uad3b\uba33\u93e4\u5082\uad55\ubaaa\u93f3\u5006\uad70\ubace\u93a8\u504e\uad81\ubaa5\u93f2\u50a3\uad80\uba2d\u93c2\u5023\uad74\ubaf6\u934f\u505e\uadc8\uba25\u939c\u50ea", -1746821765);
            var4_4 = var2_3.length();
            if (var7) break block16;
            var1_5 = (int)((long)-2030511269 ^ (long)-2030511278);
            if (var7) break block16;
            var0_6 = (int)((long)-357730322 ^ (long)357730321);
            if (var7) break block16;
            block8: while (!var7) {
                v0 = ++var0_6;
                v1 = (int)((long)1043470462 ^ (long)-1043470463);
                if (8K.\u2006) {
                    throw null;
                    while (true) {
                        var5_1[var3_2++] = new String(v2).intern();
                        if ((var0_6 += var1_5) < var4_4) {
                            var1_5 = var2_3.charAt(var0_6);
                            if (!8K.\u2006) continue block8;
                            throw null;
                        }
                        8K.d = var5_1;
                        8K.e = new String[(int)((long)-1183568078 ^ (long)-1183568080)];
                        if (!8K.\u2006) break block8;
                        throw null;
                    }
                }
                v3 = var2_3.substring(v0, v0 + var1_5).toCharArray();
                v4 = v3.length;
                var6_7 = (int)((long)-1122730822 ^ (long)-1122730822);
                v5 = (int)((long)950372584 ^ (long)950372550);
                v6 = v3;
                v7 = v4;
                if (v4 > (int)((long)1896021599 ^ (long)1896021598)) ** GOTO lbl87
                do {
                    block14: {
                        v8 = v5;
                        v6 = v6;
                        v9 = v6;
                        v10 = v5;
                        v11 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)2022494666 ^ (long)2022494669)) {
                                case 0: {
                                    v12 = (int)((long)-1721020137 ^ (long)-1721020093);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                case 1: {
                                    v12 = (int)((long)1922574578 ^ (long)1922574510);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                case 2: {
                                    v12 = (int)((long)1425110688 ^ (long)1425110777);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                case 3: {
                                    v12 = (int)((long)265061813 ^ (long)265061764);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                case 4: {
                                    v12 = (int)((long)-2067098085 ^ (long)-2067098073);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                case 5: {
                                    v12 = (int)((long)259647622 ^ (long)259647655);
                                    if (!8K.\u2006) break;
                                    throw null;
                                }
                                default: {
                                    v12 = (int)((long)1171874838 ^ (long)1171874857);
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
                        } while (!8K.\u2006);
                        throw null;
                    }
                    v2 = v6;
                    v7 = v7;
                } while (v7 > var6_7);
                if (!8K.\u2006) ** continue;
                throw null;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 8K.\u2006;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1501083659 ^ (long)-1501098331)) & (int)((long)1939516697 ^ (long)1939493606);
            if (var9_2) ** GOTO lbl-1000
            if (8K.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 8K.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)66197755 ^ (long)66197755)] & (int)((long)-602515442 ^ (long)-602515215)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)1348382525 ^ (long)1348382656);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-813382426 ^ (long)-813382605);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)602457901 ^ (long)602457971);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1242801362 ^ (long)1242801260);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1519530719 ^ (long)-1519530506);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)607702630 ^ (long)607702636);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1759602626 ^ (long)1759602546);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)-1540394341 ^ (long)-1540394398);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-692483231 ^ (long)-692483287);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)2073994493 ^ (long)2073994478);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1953010527 ^ (long)-1953010463);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-1926527831 ^ (long)-1926527872);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-1819633882 ^ (long)-1819633686);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-1435285910 ^ (long)-1435286008);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1834516406 ^ (long)-1834516377);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)882242890 ^ (long)882243019);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-1966197232 ^ (long)-1966197110);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)841416639 ^ (long)841416481);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-257745449 ^ (long)-257745444);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)195667833 ^ (long)195667951);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1727598239 ^ (long)1727598328);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1982552239 ^ (long)1982552260);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-381053463 ^ (long)-381053601);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-2091541476 ^ (long)-2091541428);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)1821488921 ^ (long)1821489054);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)335018372 ^ (long)335018453);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)1375271384 ^ (long)1375271332);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1226467929 ^ (long)-1226468017);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)1033573525 ^ (long)1033573434);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)66419696 ^ (long)66419528);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-362741439 ^ (long)-362741460);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)159725807 ^ (long)159725799);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1680410323 ^ (long)-1680410173);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-1819988731 ^ (long)-1819988506);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)190340418 ^ (long)190340600);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)-1751942393 ^ (long)-1751942238);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)814115087 ^ (long)814115258);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-323389929 ^ (long)-323389912);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-1708398973 ^ (long)-1708399029);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-491585412 ^ (long)-491585435);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)-1436117382 ^ (long)-1436117249);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-54784829 ^ (long)-54784840);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1799238274 ^ (long)1799238162);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)908923268 ^ (long)908923344);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)1222597 ^ (long)1222471);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-401973687 ^ (long)-401973634);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)-419658673 ^ (long)-419658593);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-370889937 ^ (long)-370889739);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)1319585476 ^ (long)1319585528);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)845579417 ^ (long)845579357);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-1403956425 ^ (long)-1403956308);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)1338873188 ^ (long)1338873328);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-2067877417 ^ (long)-2067877573);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1998195388 ^ (long)-1998195302);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)386075856 ^ (long)386075874);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1745141875 ^ (long)1745141797);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1460079475 ^ (long)-1460079417);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-494455858 ^ (long)-494455865);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)-823231402 ^ (long)-823231479);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1744686423 ^ (long)-1744686356);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)647843883 ^ (long)647843934);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)318004813 ^ (long)318004980);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)1190506864 ^ (long)1190506827);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-1519687890 ^ (long)-1519687772);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-349439412 ^ (long)-349439275);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1141093635 ^ (long)-1141093659);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-390827089 ^ (long)-390827072);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-1750772857 ^ (long)-1750772877);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)-652165002 ^ (long)-652164984);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-1956888336 ^ (long)-1956888447);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)1298584191 ^ (long)1298584199);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-360179541 ^ (long)-360179573);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)1432627446 ^ (long)1432627391);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1622734998 ^ (long)-1622735027);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)-1816982971 ^ (long)-1816982842);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)96780492 ^ (long)96780342);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1163470184 ^ (long)-1163470167);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)988654305 ^ (long)988654246);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1499116583 ^ (long)1499116713);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)324096074 ^ (long)324096092);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)1946810884 ^ (long)1946811019);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-721940184 ^ (long)-721940082);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1700270448 ^ (long)1700270399);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)164360715 ^ (long)164360834);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1775483929 ^ (long)1775483997);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)467206100 ^ (long)467206066);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)527384676 ^ (long)527384604);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-1352585153 ^ (long)-1352585021);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1049495937 ^ (long)-1049495822);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1821625015 ^ (long)1821624985);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)792397713 ^ (long)792397603);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)539666287 ^ (long)539666273);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1643121162 ^ (long)-1643121158);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)916484706 ^ (long)916484732);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)1991602988 ^ (long)1991603143);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)105670953 ^ (long)105670940);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1088569249 ^ (long)1088569098);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)-1766209845 ^ (long)-1766210022);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)1658942288 ^ (long)1658942290);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)213447435 ^ (long)213447480);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-987417041 ^ (long)-987416913);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1202792743 ^ (long)1202792942);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-1598218222 ^ (long)-1598218145);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1223700823 ^ (long)-1223700869);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)144574201 ^ (long)144574030);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)727572874 ^ (long)727572940);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-1731485928 ^ (long)-1731485851);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)1776231757 ^ (long)1776231873);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-359130368 ^ (long)-359130128);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-1972770917 ^ (long)-1972770833);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)666534439 ^ (long)666534460);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-1606449729 ^ (long)-1606449700);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-1409734928 ^ (long)-1409734966);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-588361633 ^ (long)-588361708);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-2079023045 ^ (long)-2079022876);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-903346137 ^ (long)-903346157);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)1939503318 ^ (long)1939503143);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1261031525 ^ (long)1261031629);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-258131951 ^ (long)-258131956);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-880679038 ^ (long)-880679128);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-2128118718 ^ (long)-2128118621);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)610486613 ^ (long)610486609);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-39337455 ^ (long)-39337428);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)935245389 ^ (long)935245332);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-38866279 ^ (long)-38866236);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-464354550 ^ (long)-464354386);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-80610008 ^ (long)-80609857);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)2048721759 ^ (long)2048721758);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-2144467789 ^ (long)-2144467773);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-776066298 ^ (long)-776066180);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)658438544 ^ (long)658438522);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)340484885 ^ (long)340485102);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)1481028154 ^ (long)1481028201);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-945679287 ^ (long)-945679169);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1730373987 ^ (long)1730373954);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)-1084957936 ^ (long)-1084957789);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-350513483 ^ (long)-350513576);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)2061493313 ^ (long)2061493401);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1602308591 ^ (long)1602308381);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-1890681269 ^ (long)-1890681170);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-397920574 ^ (long)-397920517);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)717671185 ^ (long)717671220);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-1506299697 ^ (long)-1506299810);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-849582564 ^ (long)-849582522);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-1678404565 ^ (long)-1678404403);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)1460010087 ^ (long)1460010226);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)-683940788 ^ (long)-683940765);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)1056057560 ^ (long)1056057391);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)869534355 ^ (long)869534444);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)1652528614 ^ (long)1652528423);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)-2051187279 ^ (long)-2051187350);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-1737127610 ^ (long)-1737127574);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-597006987 ^ (long)-597007092);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)1521017161 ^ (long)1521017158);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-500570370 ^ (long)-500570446);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)-1931011140 ^ (long)-1931011176);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-400773526 ^ (long)-400773520);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)1371222181 ^ (long)1371222220);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)539701341 ^ (long)539701407);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)207211764 ^ (long)207211747);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)-981286253 ^ (long)-981286271);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-86915615 ^ (long)-86915739);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1195171844 ^ (long)1195171980);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)255586132 ^ (long)255586195);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-286754050 ^ (long)-286754083);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)935113745 ^ (long)935113823);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)631608858 ^ (long)631608948);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)-1538104322 ^ (long)-1538104364);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)1955452143 ^ (long)1955452083);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-311451800 ^ (long)-311451826);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1830053612 ^ (long)-1830053461);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1811995715 ^ (long)1811995902);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)1275202804 ^ (long)1275202665);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-374046187 ^ (long)-374045986);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)68685037 ^ (long)68684926);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1918228197 ^ (long)1918228096);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1663203510 ^ (long)1663203341);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1680129117 ^ (long)1680129066);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-1367203119 ^ (long)-1367203300);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-2014361519 ^ (long)-2014361394);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)1163869543 ^ (long)1163869529);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)100956734 ^ (long)100956799);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-504734 ^ (long)-504779);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-2024075502 ^ (long)-2024075330);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)78587316 ^ (long)78587276);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-1223161973 ^ (long)-1223161925);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-671863185 ^ (long)-671863077);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)227801161 ^ (long)227801236);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-995314002 ^ (long)-995313939);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1390166438 ^ (long)1390166451);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1037224619 ^ (long)1037224643);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1911654517 ^ (long)-1911654591);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1239160814 ^ (long)-1239160611);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-1595330439 ^ (long)-1595330335);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)2137415467 ^ (long)2137415469);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)496509325 ^ (long)496509231);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1153525223 ^ (long)-1153525201);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-637972990 ^ (long)-637972798);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)911266246 ^ (long)911266205);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)1422954066 ^ (long)1422954113);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1514871498 ^ (long)-1514871402);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-1890168108 ^ (long)-1890168250);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)-2145856015 ^ (long)-2145856038);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)2044445944 ^ (long)2044445727);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-758322528 ^ (long)-758322628);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)1098109717 ^ (long)1098109880);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)2002852524 ^ (long)2002852575);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)714652591 ^ (long)714652491);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)378762786 ^ (long)378762874);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)1576409055 ^ (long)1576408895);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-1912018214 ^ (long)-1912018234);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)830743392 ^ (long)830743306);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)2139107930 ^ (long)2139107902);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1864323532 ^ (long)1864323566);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)2038607843 ^ (long)2038607628);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1260928005 ^ (long)1260928142);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)2117162035 ^ (long)2117162138);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1223056428 ^ (long)1223056445);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-750207678 ^ (long)-750207709);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)116102897 ^ (long)116102801);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)-283901344 ^ (long)-283901410);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)1312138673 ^ (long)1312138584);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)693907392 ^ (long)693907423);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)-1408228794 ^ (long)-1408228844);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-1823243703 ^ (long)-1823243713);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)690351520 ^ (long)690351564);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1040861867 ^ (long)-1040861872);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)-1064728105 ^ (long)-1064728155);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)639743393 ^ (long)639743261);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1144274164 ^ (long)1144274148);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-371073610 ^ (long)-371073723);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)317956482 ^ (long)317956471);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1931017081 ^ (long)-1931017069);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-1216278703 ^ (long)-1216278636);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1740817070 ^ (long)1740816911);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)995793532 ^ (long)995793599);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1853750490 ^ (long)-1853750399);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1098150548 ^ (long)1098150614);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1680462329 ^ (long)1680462167);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-2135436618 ^ (long)-2135436688);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1316670179 ^ (long)1316670015);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1145025355 ^ (long)-1145025462);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)-152998243 ^ (long)-152998243);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1952164450 ^ (long)1952164480);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)-2073442785 ^ (long)-2073442788);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)583858637 ^ (long)583858542);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1371947514 ^ (long)-1371947297);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)346568988 ^ (long)346569170);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1345792872 ^ (long)1345792829);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-1859659409 ^ (long)-1859659298);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1989011317 ^ (long)-1989011322);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-112477318 ^ (long)-112477268);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)-1704210980 ^ (long)-1704210956);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-567699514 ^ (long)-567699648);
                    if (!8K.\u2006) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)579552691 ^ (long)579552692);
                    if (!8K.\u2006) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)793767112 ^ (long)793766940);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-1445774721 ^ (long)-1445774720)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-1700180987 ^ (long)-1700154374)) >>> (int)((long)-535317290 ^ (long)-535317282)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-196838634 ^ (long)-196838634);
            if (!8K.\u2006) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)1207191088 ^ (long)1207191090);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)-836681658 ^ (long)-836681659) | var5_6 << (int)((long)-1101919472 ^ (long)-1101919467)) ^ var3_4[var7_8]) & (int)((long)-292956204 ^ (long)-292956373);
                    if (8K.\u2006) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)-687730354 ^ (long)-687730355) | var6_7 << (int)((long)-68368828 ^ (long)-68368831)) ^ var3_4[var7_8]) & (int)((long)-527787068 ^ (long)-527787205);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            8K.e[var2_3] = new String(var3_4).intern();
        }
        return 8K.e[var2_3];
    }
}

