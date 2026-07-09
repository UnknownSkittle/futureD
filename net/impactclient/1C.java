/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  aed
 *  afw
 *  aom
 *  aru
 *  bhb
 *  bja
 *  bko
 *  blk
 *  cey
 *  hh
 *  org.apache.logging.log4j.Level
 *  rk
 *  vg
 */
package net.impactclient;

import com.google.common.collect.Maps;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import me.zero.alpine.event.EventState;
import me.zero.alpine.listener.EventHook;
import me.zero.alpine.listener.Listener;
import net.impactclient.0T;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.2w;
import net.impactclient.3Z;
import net.impactclient.3i;
import net.impactclient.4t;
import net.impactclient.50;
import net.impactclient.7b;
import net.impactclient.7c;
import org.apache.logging.log4j.Level;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 1C
implements 0T {
    public static final boolean \u2007\u2004\u200b\u2000\u200a;
    private static hh 1;
    private static final TreeMap<Integer, String> 3;
    private static final Queue<Runnable> 0;
    private static final String[] a;
    private static final String[] b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void 0(7c queue) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return;
        if (((7c)((Object)queue)).0 != EventState.POST) {
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        if (0ay.3().9 != 0) {
            if (bl2 || bl2) return;
            System.out.println(1C.a((int)((long)-112023814 ^ (long)112015302), (int)((long)1013242397 ^ (long)-1013248714)) + 0ay.3().9);
            if (bl2) return;
        }
        if (bl2) return;
        queue = 0;
        synchronized (queue) {
            if (bl2) return;
            try {
                while (!bl2) {
                    if (0.peek() == null) return;
                    if (bl2 || bl2) return;
                    0.poll().run();
                    if (bl2) return;
                    if (!\u2007\u2004\u200b\u2000\u200a) continue;
                    throw null;
                }
                return;
            } finally {
                if (bl2) return;
                // MONITOREXIT @DISABLED, blocks:[2, 4] lbl26 : MonitorExitStatement: MONITOREXIT : var0
                if (bl2 || bl2) return;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 1C.\u2007\u2004\u200b\u2000\u200a;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)775840718 ^ (long)775840704)];
            if (var7) break block25;
            var3_2 = (int)((long)-443660968 ^ (long)-443660968);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\uf311\udbd3\u1805\ue543\uf32a\udb1d\u1803\ue5bf\uf369\udb82\u1888\ue5e9\uf3ca\udbf4\u185e\ue518\uf3cf\udb2f\u1811\ue552\uf351\udbd9\u18d9\ue577\uf32e\udb24\u18f5\ue5a7\uf3f5\udb1f\u18b6\ue5ed\uf3de\udb95\u1815\ue5c2\uf335\udbd9\u180b\ue50d\uf32e\udb51\u18b2\ue5a6\uf318\udbd2\u18b3\ue534\uf342\udbdc\u18ea\ue5a7\uf332\udb5c\u18f6\ue5e5\uf3ea\udbe6\u1814\ue55c\uf3c2\udb09\u1814\ue5d6\uf338\udb9a", -8989326);
            var4_4 = var2_3.length();
            if (var7) break block25;
            var1_5 = (int)((long)-1862776889 ^ (long)-1862776891);
            if (var7) break block25;
            var0_6 = (int)((long)0xBAEEAB ^ (long)-12250796);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)-947590536 ^ (long)-947590576);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)-834682629 ^ (long)834682628);
                        if (1C.\u2007\u2004\u200b\u2000\u200a) {
                            throw null;
lbl24:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!1C.\u2007\u2004\u200b\u2000\u200a) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\u348f\u1ca6\udffd\u222e\u349d\u1c48\udf07\u2268\u34ff\u1c78\udf7f\u2221\u341b\u1ce4\udf31\u2275\u3457\u1cf3\udf61\u227b\u34c2\u1c18\udffd\u224d\u3404\u1c01\udf1d\u227c\u347c\u1c4e\udf33\u2261\u3463\u1c4a", 657265328);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)1707188730 ^ (long)1707188709);
                                var0_6 = (int)((long)-100178203 ^ (long)100178202);
                                while (true) {
                                    v0 = (int)((long)1142633757 ^ (long)1142633806);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)-1007533956 ^ (long)-1007533956);
                                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break block21;
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
                                    if (!1C.\u2007\u2004\u200b\u2000\u200a) ** continue;
                                    throw null;
                                }
                                1C.a = var5_1;
                                1C.b = new String[(int)((long)19508568 ^ (long)19508566)];
                                if (1C.\u2007\u2004\u200b\u2000\u200a) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)137329436 ^ (long)137329436);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)35275211 ^ (long)35275210)) ** GOTO lbl108
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)-303782045 ^ (long)-303782044)) {
                                    case 0: {
                                        v15 = (int)((long)-1429691845 ^ (long)-1429691844);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-2000579795 ^ (long)-2000579746);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-1220000750 ^ (long)-1220000683);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)665553073 ^ (long)665553031);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)-2088954803 ^ (long)-2088954797);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-1448361382 ^ (long)-1448361393);
                                        if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)1322761177 ^ (long)1322761090);
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
                            } while (!1C.\u2007\u2004\u200b\u2000\u200a);
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
                1C.3 = Maps.newTreeMap();
                v17 = new a[(int)((long)1064116733 ^ (long)1064116732)];
                v17[(int)((long)-1556108954 ^ (long)-1556108954)] = a.i;
                v18 = new a[(int)((long)-24237362 ^ (long)-24237361)];
                v18[(int)((long)-949690453 ^ (long)-949690453)] = a.j;
                v19 = new a[(int)((long)-1918084117 ^ (long)-1918084118)];
                v19[(int)((long)-1832939011 ^ (long)-1832939011)] = a.i;
                v20 = new a[(int)((long)540601015 ^ (long)540601014)];
                v20[(int)((long)-138006550 ^ (long)-138006550)] = a.h;
                1C.1 = new 3i().0((String)0rB$1f.XNZw((Object)"\udfd4", (int)-365233711), (a[])v17).0((String)1C.a((int)((int)((long)609324723 ^ (long)-609345654)), (int)((int)((long)285987915 ^ (long)285984683))), (a[])v18).0((String)0rB$1f.XNZw((Object)"\u8491", (int)436052626), (a[])v19).0((String)0rB$1f.XNZw((Object)"\u4fa9", (int)-196646441), (a[])v20).0;
                1C.0 = new ArrayDeque<Runnable>();
                1C.3.put((int)((long)1621732447 ^ (long)1621733303), 0rB$1f.XNZw("\u2145", 993920854));
                1C.3.put((int)((long)-1394828302 ^ (long)-1394829194), 1C.a((int)((long)-1426673626 ^ (long)1426661661), (int)((long)-221020484 ^ (long)221025826)));
                1C.3.put((int)((long)264404722 ^ (long)264404742), 0rB$1f.XNZw("\u720d", -1177791465));
                1C.3.put((int)((long)1438625589 ^ (long)1438625445), 1C.a((int)((long)-1593724231 ^ (long)1593713540), (int)((long)1104391891 ^ (long)1104391148)));
                1C.3.put((int)((long)-1973219845 ^ (long)-1973219937), 0rB$1f.XNZw("\ua369", 1970832756));
                1C.3.put((int)((long)-306797086 ^ (long)-306797128), 1C.a((int)((long)963595344 ^ (long)-963584662), (int)((long)-1561984818 ^ (long)1561980130)));
                1C.3.put((int)((long)-634419171 ^ (long)-634419153), 0rB$1f.XNZw("\uf0d2", 295032512));
                1C.3.put((int)((long)1426946010 ^ (long)1426946034), 1C.a((int)((long)-987939962 ^ (long)987933366), (int)((long)619406230 ^ (long)-619393415)));
                1C.3.put((int)((long)675902060 ^ (long)675902054), 0rB$1f.XNZw("\ude5d", -1501038501));
                1C.3.put((int)((long)-407295158 ^ (long)-407295165), 1C.a((int)((long)805569953 ^ (long)-805596002), (int)((long)1780751284 ^ (long)1780744792)));
                1C.3.put((int)((long)1303191865 ^ (long)1303191868), 0rB$1f.XNZw("\u88e1", 15904489));
                1C.3.put((int)((long)1774389637 ^ (long)1774389633), 1C.a((int)((long)946627308 ^ (long)-946605102), (int)((long)-1504810389 ^ (long)1504836432)));
                1C.3.put((int)((long)69399341 ^ (long)69399340), 0rB$1f.XNZw("\u0110", 341321479));
                4t.1.subscribe(new Listener<7c>((EventHook<7c>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 0(net.impactclient.7c ), (Lnet/impactclient/7c;)V)(), new Predicate[(int)((long)1836176604 ^ (long)1836176604)]));
                break;
            }
        }
    }

    public static boolean 1() {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) {
            return true;
        }
        return 2w.0(((50)1C.2.h).getPos().0(0.0, 0.15, 0.0)) instanceof aru;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void 0(Runnable runnable) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return;
        Queue<Runnable> queue = 0;
        synchronized (queue) {
            if (bl2) return;
            try {
                if (bl2) return;
                0.offer(runnable);
                if (bl2 || bl2) return;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl11 : MonitorExitStatement: MONITOREXIT : var1_3
                if (bl2 || bl2) return;
                return;
            } catch (Throwable throwable) {
                if (bl2) return;
                // MONITOREXIT @DISABLED, blocks:[1, 2] lbl16 : MonitorExitStatement: MONITOREXIT : var1_3
                if (bl2 || bl2) return;
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(String string, boolean bl3) {
        Desktop desktop;
        boolean bl4;
        block10: {
            block9: {
                bl4 = \u2007\u2004\u200b\u2000\u200a;
                if (bl4 || bl4) return;
                desktop = 1C.2();
                if (desktop == null) break block9;
                if (bl4) return;
                if (desktop.isSupported(Desktop.Action.BROWSE)) break block10;
                if (bl4) return;
            }
            if (bl4) return;
            return;
        }
        if (bl4) return;
        blk blk2 = 1C.2.m;
        if (bl4 || bl4) return;
        string = new bko((bl2, n2) -> {
            boolean bl3;
            block4: {
                bl3 = \u2007\u2004\u200b\u2000\u200a;
                if (bl3 || bl3) return;
                if (bl2) {
                    if (bl3) return;
                    try {
                        if (bl3) return;
                        desktop.browse(URI.create(string));
                        if (bl3 || bl3) return;
                        if (!\u2007\u2004\u200b\u2000\u200a) break block4;
                        throw null;
                    } catch (Exception exception) {
                        if (bl3) return;
                    }
                }
            }
            if (bl3) return;
            2.a(blk2);
            if (!bl3 && !bl3) return;
        }, string, (int)((long)-39010985 ^ (long)-39010985), bl3);
        if (bl4 || bl4) return;
        if (bl3) {
            if (bl4 || bl4) return;
            string.f();
            if (bl4) return;
        }
        if (bl4) return;
        2.a((blk)string);
        if (!bl4 && !bl4) return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void 0(long l2) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return;
        if (l2 <= (0x8ABFB1A22D09E31AL ^ 0x8ABFB1A22D09E31AL)) {
            if (bl2 || bl2) return;
            return;
        }
        try {
            if (bl2) return;
            Thread.sleep(l2);
            if (bl2 || bl2) return;
            return;
        } catch (InterruptedException interruptedException) {
            if (bl2 || bl2) return;
            0ay.0a.log(Level.WARN, 1C.a((int)((long)-1493393444 ^ (long)1493372653), (int)((long)1215668479 ^ (long)1215678759)));
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(hh hh2) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
                if (bl2 || bl2) break block2;
                hh hh3 = 1.f();
                hh3.b().a(a.h);
                if (bl2 || bl2) break block2;
                hh3.a(hh2);
                if (bl2 || bl2) break block2;
                1C.2.q.d().a(hh3);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int 0(aed aed2) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return 65048201;
        if (aed2 != null) {
            if (bl2) return 65048201;
            if (2.v() != null) {
                if (bl2 || bl2) return 65048201;
                aed2 = 2.v().a(aed2.bm());
                if (aed2 != null) {
                    if (bl2 || bl2) return 65048201;
                    return rk.a((int)aed2.c(), (int)((int)((long)1022932778 ^ (long)-1022932779)), (int)((int)((long)-1064982956 ^ (long)-1064983117)));
                }
            }
        }
        if (!bl2) return (int)((long)346232889 ^ (long)-346232890);
        return 65048201;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String 0(int n2) {
        int n3;
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2) return null;
        try {
            if (bl2) return null;
            n3 = 3.floorKey(n2);
            if (bl2 || bl2) return null;
            if (n2 == n3) {
                if (bl2 || bl2) return null;
                return 3.get(n2);
            }
        } catch (Exception exception) {
            if (bl2) return null;
            return 1C.a((int)((long)296198607 ^ (long)-296210184), (int)((long)-145847214 ^ (long)145823150));
        }
        {
            if (bl2) return null;
            return 3.get(n3) + 1C.0(n2 - n3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static 3Z 0(vg vg2, double d2, double d3, double d4, double d5, bhb object) {
        Object object2;
        block37: {
            boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
            if (!bl2 && !bl2) {
                object2 = vg2.bw();
                if (!bl2 && !bl2) {
                    double d6 = d2;
                    if (!bl2) {
                        double d7 = d3;
                        bhb bhb2 = object2;
                        object2 = object;
                        object = vg2.l.a(vg2, object2.b(d4, 2.0, d5));
                        Object object3 = object2;
                        bhb bhb3 = object3.b(d4, 0.0, d5);
                        double d8 = 2.0;
                        int n2 = (int)((long)-832053676 ^ (long)-832053676);
                        String[] stringArray = 7b.0();
                        if (!bl2 && !bl2) {
                            int n3 = object.size();
                            if (!bl2) {
                                block0: while (!bl2) {
                                    if (n2 < n3) {
                                        if (bl2 || bl2) break;
                                        d8 = ((bhb)object.get(n2)).b(bhb3, d8);
                                        if (bl2 || bl2) break;
                                        ++n2;
                                        if (bl2) break;
                                        if (stringArray != null) {
                                            if (bl2) break;
                                            if (stringArray != null) continue;
                                            if (bl2) break;
                                        }
                                    } else {
                                        if (bl2) break;
                                        object3 = object3.d(0.0, d8, 0.0);
                                        if (bl2) break;
                                    }
                                    if (bl2) break;
                                    double d9 = d4;
                                    if (bl2 || bl2) break;
                                    int n4 = (int)((long)13302971 ^ (long)13302971);
                                    if (bl2) return null;
                                    if (bl2) break;
                                    int n5 = object.size();
                                    if (bl2) break;
                                    while (!bl2) {
                                        if (n4 < n5) {
                                            if (bl2 || bl2) break block0;
                                            d9 = ((bhb)object.get(n4)).a(object3, d9);
                                            if (bl2 || bl2) break block0;
                                            ++n4;
                                            if (bl2) break block0;
                                            if (stringArray != null) {
                                                if (bl2) break block0;
                                                if (stringArray != null) continue;
                                                if (bl2) break block0;
                                            }
                                        } else {
                                            if (bl2) break block0;
                                            object3 = object3.d(d9, 0.0, 0.0);
                                            if (bl2) break block0;
                                        }
                                        if (bl2) break block0;
                                        double d10 = d5;
                                        if (bl2 || bl2) break block0;
                                        n4 = (int)((long)-142963458 ^ (long)-142963458);
                                        if (bl2) return null;
                                        if (bl2) break block0;
                                        int n6 = object.size();
                                        if (bl2) break block0;
                                        while (!bl2) {
                                            if (n4 < n6) {
                                                if (bl2 || bl2) break block0;
                                                d10 = ((bhb)object.get(n4)).c(object3, d10);
                                                if (bl2 || bl2) break block0;
                                                ++n4;
                                                if (bl2) break block0;
                                                if (stringArray != null) {
                                                    if (bl2) break block0;
                                                    if (stringArray != null) continue;
                                                    if (bl2) break block0;
                                                }
                                            } else {
                                                if (bl2) break block0;
                                                object3 = object3.d(0.0, 0.0, d10);
                                                if (bl2) break block0;
                                            }
                                            if (bl2) break block0;
                                            Object object4 = object2;
                                            if (bl2 || bl2) break block0;
                                            double d11 = 2.0;
                                            if (bl2) return null;
                                            if (bl2) break block0;
                                            n4 = (int)((long)-1982070476 ^ (long)-1982070476);
                                            if (bl2) return null;
                                            if (bl2) break block0;
                                            int n7 = object.size();
                                            if (bl2) break block0;
                                            while (!bl2) {
                                                if (n4 < n7) {
                                                    if (bl2 || bl2) break block0;
                                                    d11 = ((bhb)object.get(n4)).b(object4, d11);
                                                    if (bl2 || bl2) break block0;
                                                    ++n4;
                                                    if (bl2) break block0;
                                                    if (stringArray != null) {
                                                        if (bl2) break block0;
                                                        if (stringArray != null) continue;
                                                        if (bl2) break block0;
                                                    }
                                                } else {
                                                    if (bl2) break block0;
                                                    object4 = object4.d(0.0, d11, 0.0);
                                                    if (bl2) break block0;
                                                }
                                                if (bl2) break block0;
                                                double d12 = d4;
                                                if (bl2 || bl2) break block0;
                                                n4 = (int)((long)1431031543 ^ (long)1431031543);
                                                if (bl2) return null;
                                                if (bl2) break block0;
                                                int n8 = object.size();
                                                if (bl2) break block0;
                                                while (!bl2) {
                                                    if (n4 < n8) {
                                                        if (bl2 || bl2) break block0;
                                                        d12 = ((bhb)object.get(n4)).a(object4, d12);
                                                        if (bl2 || bl2) break block0;
                                                        ++n4;
                                                        if (bl2) break block0;
                                                        if (stringArray != null) {
                                                            if (bl2) break block0;
                                                            if (stringArray != null) continue;
                                                            if (bl2) break block0;
                                                        }
                                                    } else {
                                                        if (bl2) break block0;
                                                        object4 = object4.d(d12, 0.0, 0.0);
                                                        if (bl2) break block0;
                                                    }
                                                    if (bl2) break block0;
                                                    double d13 = d5;
                                                    if (bl2 || bl2) break block0;
                                                    n4 = (int)((long)-1560349176 ^ (long)-1560349176);
                                                    if (bl2) return null;
                                                    if (bl2) break block0;
                                                    int n9 = object.size();
                                                    if (bl2) break block0;
                                                    while (!bl2) {
                                                        double d14;
                                                        double d15;
                                                        if (n4 < n9) {
                                                            if (bl2 || bl2) break block0;
                                                            d13 = ((bhb)object.get(n4)).c(object4, d13);
                                                            if (bl2 || bl2) break block0;
                                                            ++n4;
                                                            if (bl2) break block0;
                                                            if (stringArray != null) {
                                                                if (bl2) break block0;
                                                                if (stringArray != null) continue;
                                                                if (bl2) break block0;
                                                            }
                                                        } else {
                                                            if (bl2) break block0;
                                                            object4 = object4.d(0.0, 0.0, d13);
                                                            if (bl2) break block0;
                                                        }
                                                        if (bl2) break block0;
                                                        double d16 = d9;
                                                        double d17 = d10;
                                                        double d18 = d16 * d16 + d17 * d17;
                                                        if (bl2 || bl2) break block0;
                                                        double d19 = d12;
                                                        double d20 = d13;
                                                        double d21 = d19 * d19 + d20 * d20;
                                                        if (bl2 || bl2) break block0;
                                                        if (d18 > d21) {
                                                            if (bl2 || bl2) break block0;
                                                            d15 = d9;
                                                            if (bl2 || bl2) break block0;
                                                            d3 = d10;
                                                            if (bl2 || bl2) break block0;
                                                            d14 = -d8;
                                                            if (bl2 || bl2) break block0;
                                                            object2 = object3;
                                                            if (bl2) break block0;
                                                            if (\u2007\u2004\u200b\u2000\u200a) {
                                                                throw null;
                                                            }
                                                        } else {
                                                            if (bl2) break block0;
                                                            d15 = d12;
                                                            if (bl2 || bl2) break block0;
                                                            d3 = d13;
                                                            if (bl2 || bl2) break block0;
                                                            d14 = -d11;
                                                            if (bl2 || bl2) break block0;
                                                            object2 = object4;
                                                            if (bl2) break block0;
                                                        }
                                                        if (bl2) break block0;
                                                        int n10 = (int)((long)-925834842 ^ (long)-925834842);
                                                        if (bl2) return null;
                                                        if (bl2) break block0;
                                                        int n11 = object.size();
                                                        if (bl2) break block0;
                                                        while (!bl2) {
                                                            if (n10 < n11) {
                                                                if (bl2 || bl2) break block0;
                                                                d14 = ((bhb)object.get(n10)).b(object2, d14);
                                                                if (bl2 || bl2) break block0;
                                                                ++n10;
                                                                if (bl2) break block0;
                                                                if (stringArray != null) {
                                                                    if (bl2) break block0;
                                                                    if (stringArray != null) continue;
                                                                    if (bl2) break block0;
                                                                }
                                                            } else {
                                                                if (bl2) break block0;
                                                                object2 = object2.d(0.0, d14, 0.0);
                                                                if (bl2) break block0;
                                                            }
                                                            if (bl2) break block0;
                                                            double d22 = d6;
                                                            double d23 = d7;
                                                            double d24 = d15;
                                                            double d25 = d3;
                                                            if (d22 * d22 + d23 * d23 >= d24 * d24 + d25 * d25) {
                                                                if (bl2 || bl2) break block0;
                                                                object2 = bhb2;
                                                                if (bl2) break block0;
                                                            }
                                                            if (!bl2) break block37;
                                                        }
                                                        break block0;
                                                    }
                                                    break block0;
                                                }
                                                break block0;
                                            }
                                            break block0;
                                        }
                                        break block0;
                                    }
                                    break block0;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        return new 3Z(object2.a - vg2.bw().a, object2.b - vg2.bw().b, object2.c - vg2.bw().c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void 0(String string) {
        Desktop desktop;
        boolean bl2;
        block10: {
            block9: {
                bl2 = \u2007\u2004\u200b\u2000\u200a;
                if (bl2 || bl2) return;
                desktop = 1C.2();
                if (desktop == null) break block9;
                if (bl2) return;
                if (desktop.isSupported(Desktop.Action.OPEN)) break block10;
                if (bl2) return;
            }
            if (bl2) return;
            return;
        }
        try {
            if (bl2) return;
            desktop.open(new File(string));
            if (bl2 || bl2) return;
            return;
        } catch (IOException iOException) {
            iOException.printStackTrace();
            if (bl2 || bl2) return;
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 1C.\u2007\u2004\u200b\u2000\u200a;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)-1255648489 ^ (long)1255653930)) & (int)((long)-759116421 ^ (long)-759156092);
            if (var9_2) ** GOTO lbl-1000
            if (1C.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 1C.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-1275477019 ^ (long)-1275477019)] & (int)((long)217623763 ^ (long)217623596)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)182369115 ^ (long)182369103);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-215718572 ^ (long)-215718596);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1705085776 ^ (long)1705085829);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)-1348318316 ^ (long)-1348318454);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-299009741 ^ (long)-299009693);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1605115150 ^ (long)-1605115148);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-281189039 ^ (long)-281188951);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1815484004 ^ (long)1815483961);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-215425501 ^ (long)-215425344);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)-1997835998 ^ (long)-1997835887);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)-1635704266 ^ (long)-1635704277);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)1789473263 ^ (long)1789473250);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)-871859492 ^ (long)-871859667);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)958061227 ^ (long)958061298);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)70986706 ^ (long)70986565);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)1116359607 ^ (long)1116359519);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)-2118028095 ^ (long)-2118028161);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)1212299516 ^ (long)1212299266);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1441171717 ^ (long)-1441171947);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)1422695456 ^ (long)1422695666);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-792935166 ^ (long)-792934966);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)949431105 ^ (long)949431167);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-811578271 ^ (long)-811578144);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-193733760 ^ (long)-193733758);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)1147212199 ^ (long)1147212128);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-25956881 ^ (long)-25957008);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)993641461 ^ (long)993641216);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1537504476 ^ (long)-1537504472);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1011835542 ^ (long)-1011835571);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1850258751 ^ (long)-1850258748);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-950722951 ^ (long)-950723025);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-29864070 ^ (long)-29864127);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-1768523568 ^ (long)-1768523638);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)-2033391032 ^ (long)-2033390914);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)91512922 ^ (long)91512915);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1506184862 ^ (long)1506184773);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1531130412 ^ (long)-1531130485);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)-751325357 ^ (long)-751325202);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-110233515 ^ (long)-110233572);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1758545070 ^ (long)-1758545112);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)610751418 ^ (long)610751263);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)1712267778 ^ (long)1712267812);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)1400170366 ^ (long)1400170289);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-899443064 ^ (long)-899443173);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-304395007 ^ (long)-304394999);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)2132980767 ^ (long)2132980812);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)899396202 ^ (long)899396159);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-2131822733 ^ (long)-2131822817);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)-272507000 ^ (long)-272507112);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-1277788216 ^ (long)-1277788243);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)-240345967 ^ (long)-240345957);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-1204907981 ^ (long)-1204908003);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)-2070524112 ^ (long)-2070524002);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)1485397605 ^ (long)1485397533);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)747338912 ^ (long)747338930);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-165389482 ^ (long)-165389444);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)-1856522326 ^ (long)-1856522388);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-539373047 ^ (long)-539372931);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1277016159 ^ (long)1277016223);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1962051099 ^ (long)-1962051238);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)960351602 ^ (long)960351618);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)1495544425 ^ (long)1495544541);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-646220243 ^ (long)-646220154);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)2114893729 ^ (long)2114893608);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)1670734157 ^ (long)1670734163);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)-1902443863 ^ (long)-1902443841);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1761273234 ^ (long)-1761273328);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)415899080 ^ (long)415899006);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)890420004 ^ (long)890420054);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)939588208 ^ (long)939588256);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1991941465 ^ (long)-1991941499);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)1719992506 ^ (long)1719992448);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)280637392 ^ (long)280637238);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-306273518 ^ (long)-306273479);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)754447500 ^ (long)754447400);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1076107222 ^ (long)1076107116);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-1348182364 ^ (long)-1348182466);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-337224883 ^ (long)-337224736);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-985099077 ^ (long)-985099202);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)-804886073 ^ (long)-804886050);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-38215744 ^ (long)-38215808);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-963076443 ^ (long)-963076508);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1512993595 ^ (long)1512993765);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1543434324 ^ (long)1543434392);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-609431523 ^ (long)-609431455);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)-1396388803 ^ (long)-1396388778);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1760539478 ^ (long)1760539463);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)923792794 ^ (long)923792788);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1434129176 ^ (long)-1434129283);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)451964667 ^ (long)451964618);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)172133992 ^ (long)172134129);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)-1990456368 ^ (long)-1990456551);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-1046216148 ^ (long)-1046216127);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)1415602644 ^ (long)1415602449);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-2081737021 ^ (long)-2081737002);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-717948758 ^ (long)-717948682);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-1426769993 ^ (long)-1426770069);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)60387584 ^ (long)60387820);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-710064688 ^ (long)-710064808);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-110830291 ^ (long)-110830159);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-69759365 ^ (long)-69759412);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)1159156231 ^ (long)1159156293);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)457218777 ^ (long)457218724);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)757504987 ^ (long)757504854);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)788387296 ^ (long)788387128);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)807441234 ^ (long)807441354);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)2062610998 ^ (long)2062611115);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)290930933 ^ (long)290930803);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)1693708832 ^ (long)1693708886);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-726971732 ^ (long)-726971776);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)22657652 ^ (long)22657740);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-229865444 ^ (long)-229865460);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)854347709 ^ (long)854347664);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-388076994 ^ (long)-388076862);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-697606120 ^ (long)-697605943);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)1173104982 ^ (long)1173104935);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)-1855696099 ^ (long)-1855695970);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-1768884682 ^ (long)-1768884595);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)1438431327 ^ (long)1438431343);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1295586330 ^ (long)1295586516);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)999043421 ^ (long)999043358);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1888578569 ^ (long)-1888578793);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-656939088 ^ (long)-656939033);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)1891651215 ^ (long)1891651097);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)418853871 ^ (long)418853634);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1774961378 ^ (long)1774961161);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)-1119245936 ^ (long)-1119245834);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)596494605 ^ (long)596494804);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1692977715 ^ (long)-1692977753);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)-1998059739 ^ (long)-1998059635);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)-54454816 ^ (long)-54454809);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)-1113077576 ^ (long)-1113077593);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)-1897159453 ^ (long)-1897159533);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)-1739393631 ^ (long)-1739393741);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)-799537108 ^ (long)-799536921);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1807217683 ^ (long)1807217753);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)1170670083 ^ (long)1170670328);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)550363494 ^ (long)550363607);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)-1864085020 ^ (long)-1864085210);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)2062729626 ^ (long)2062729549);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-85313527 ^ (long)-85313503);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-1477127897 ^ (long)-1477127819);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-243083511 ^ (long)-243083441);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-229796282 ^ (long)-229796231);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-513251803 ^ (long)-513251778);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)421947200 ^ (long)421947203);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)1512417431 ^ (long)1512417301);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-156988613 ^ (long)-156988606);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-1011385976 ^ (long)-1011386060);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-1152480717 ^ (long)-1152480606);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)304928096 ^ (long)304928003);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)1912823317 ^ (long)1912823389);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)0x3008000 ^ (long)0x3008080);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-933590484 ^ (long)-933590451);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)2022895752 ^ (long)2022895725);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)1325932266 ^ (long)1325932257);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)1632670211 ^ (long)1632670270);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)2143405036 ^ (long)2143404940);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-1710720261 ^ (long)-1710720436);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)925732331 ^ (long)925732148);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1086903620 ^ (long)1086903752);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-1717680875 ^ (long)-1717680794);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)536207848 ^ (long)536207828);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-104273429 ^ (long)-104273552);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)944581743 ^ (long)944581819);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)1117331275 ^ (long)1117331300);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)-786888906 ^ (long)-786888835);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)830928853 ^ (long)830928684);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)216163846 ^ (long)216163934);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-408487118 ^ (long)-408487126);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-431698515 ^ (long)-431698498);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-195434437 ^ (long)-195434412);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)85309046 ^ (long)85308984);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)751250100 ^ (long)751249993);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)1592893447 ^ (long)1592893670);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1792962361 ^ (long)1792962457);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)118351538 ^ (long)118351538);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)1145573943 ^ (long)1145574122);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)850386881 ^ (long)850386878);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-410176617 ^ (long)-410176703);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)959066352 ^ (long)959066313);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)191486945 ^ (long)191486971);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-849991110 ^ (long)-849990991);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-1993766229 ^ (long)-1993766373);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-1573026369 ^ (long)-1573026475);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-2050424374 ^ (long)-2050424337);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)2062170124 ^ (long)2062170185);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1067039976 ^ (long)-1067039823);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-1818139652 ^ (long)-1818139857);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)-292805242 ^ (long)-292805252);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)-774155712 ^ (long)-774155708);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-1351229474 ^ (long)-1351229531);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)273884649 ^ (long)273884670);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-570049104 ^ (long)-570049127);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)413311059 ^ (long)413311058);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)1961218145 ^ (long)1961218283);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)1707735430 ^ (long)1707735535);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-787132840 ^ (long)-787132679);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-598191395 ^ (long)-598191569);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-82632772 ^ (long)-82632946);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)-1041436746 ^ (long)-1041436696);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)1790589377 ^ (long)1790589324);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)1052882452 ^ (long)1052882605);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)1045186159 ^ (long)1045186100);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-819260559 ^ (long)-819260450);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1341798641 ^ (long)-1341798488);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)1978195381 ^ (long)1978195290);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)-121912944 ^ (long)-121912920);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1280224035 ^ (long)-1280224129);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-1086651071 ^ (long)-1086651120);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)269324676 ^ (long)269324683);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-2067282904 ^ (long)-2067282933);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-882969255 ^ (long)-882969275);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1526580794 ^ (long)-1526580935);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-412221248 ^ (long)-412221278);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)-1245025872 ^ (long)-1245025914);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-854967649 ^ (long)-854967635);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)-1126729544 ^ (long)-1126729514);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-459851170 ^ (long)-459851142);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-421826227 ^ (long)-421826066);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1019831625 ^ (long)1019831686);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)425705094 ^ (long)425705052);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-2003556968 ^ (long)-2003557092);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1390922042 ^ (long)1390922107);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-496191769 ^ (long)-496191918);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)810934809 ^ (long)810934877);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1222210550 ^ (long)-1222210328);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)565660763 ^ (long)565660885);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)383555785 ^ (long)383555646);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1099117103 ^ (long)-1099117071);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)273681744 ^ (long)273681763);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)325556710 ^ (long)325556481);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)781414436 ^ (long)781414633);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)112155931 ^ (long)112156081);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-1908775839 ^ (long)-1908775698);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)130808963 ^ (long)130808903);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-875007674 ^ (long)-875007569);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)-1073986532 ^ (long)-1073986453);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)14937629 ^ (long)14937737);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-1574618196 ^ (long)-1574618257);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-773895190 ^ (long)-773895265);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)-1240380170 ^ (long)-1240380356);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)343863049 ^ (long)343863118);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)678057770 ^ (long)678057950);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)1412172820 ^ (long)1412172984);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1277261169 ^ (long)-1277261125);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-897639908 ^ (long)-897639875);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-1079116045 ^ (long)-1079116203);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1571397254 ^ (long)1571397218);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)166510165 ^ (long)166510290);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)-1910809304 ^ (long)-1910809244);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-1328140337 ^ (long)-1328140389);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)513360223 ^ (long)513360184);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)-209162309 ^ (long)-209162354);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)-1976029335 ^ (long)-1976029427);
                    if (!1C.\u2007\u2004\u200b\u2000\u200a) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)1534426417 ^ (long)1534426562);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1162710756 ^ (long)1162710555)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-308290535 ^ (long)-308337690)) >>> (int)((long)-734357636 ^ (long)-734357644)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)432688902 ^ (long)432688902);
            if (!1C.\u2007\u2004\u200b\u2000\u200a) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-109759915 ^ (long)-109759913);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)911986795 ^ (long)911986792) | var5_6 << (int)((long)2036192623 ^ (long)2036192618)) ^ var3_4[var7_8]) & (int)((long)59964627 ^ (long)59964460);
                    if (1C.\u2007\u2004\u200b\u2000\u200a) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1508938954 ^ (long)1508938953) | var6_7 << (int)((long)1811205741 ^ (long)1811205736)) ^ var3_4[var7_8]) & (int)((long)148337181 ^ (long)148337378);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            1C.b[var2_3] = new String(var3_4).intern();
        }
        return 1C.b[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Desktop 2() {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return null;
        if (Desktop.isDesktopSupported()) {
            if (bl2) return null;
            return Desktop.getDesktop();
        }
        if (!bl2) return null;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 0() {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return true;
        if (!(2w.0(((50)1C.2.h).getPos().1(0.0, 1C.2.h.H + 1.0f, 0.0)) instanceof aom)) {
            if (bl2) return true;
            return (int)((long)-1299314040 ^ (long)-1299314039) != 0;
        }
        if (!bl2) return (int)((long)1732734125 ^ (long)1732734125) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(int n2, afw afw2) {
        block3: {
            block2: {
                boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
                if (bl2 || bl2) break block2;
                1C.2.c.a(1C.2.h.bx.d, n2, (int)((long)2103727418 ^ (long)2103727418), afw2, (aed)1C.2.h);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 1(String string) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) return true;
        String string2 = string.toLowerCase();
        if (bl2) return true;
        int n2 = (int)((long)1308570648 ^ (long)-1308570649);
        if (bl2) return true;
        switch (string2.hashCode()) {
            case 3551: {
                if (bl2) return true;
                if (!string2.equals(1C.a((int)((long)-1143134093 ^ (long)1143126347), (int)((long)-985182333 ^ (long)985172286)))) break;
                if (bl2) return true;
                n2 = (int)((long)-1192281250 ^ (long)-1192281250);
                if (bl2) return true;
                if (!\u2007\u2004\u200b\u2000\u200a) break;
                throw null;
            }
            case 119527: {
                if (bl2) return true;
                if (!string2.equals(1C.a((int)((long)391666133 ^ (long)-391657245), (int)((long)-1525314963 ^ (long)1525298651)))) break;
                if (bl2) return true;
                n2 = (int)((long)501696572 ^ (long)501696573);
                if (bl2) return true;
                if (!\u2007\u2004\u200b\u2000\u200a) break;
                throw null;
            }
            case -1298848381: {
                if (bl2) return true;
                if (!string2.equals(1C.a((int)((long)1807521031 ^ (long)-1807547341), (int)((long)-1281453852 ^ (long)-1281456291)))) break;
                if (bl2) return true;
                n2 = (int)((long)-1444452409 ^ (long)-1444452411);
                if (bl2) return true;
                if (!\u2007\u2004\u200b\u2000\u200a) break;
                throw null;
            }
            case -1609594047: {
                if (bl2) return true;
                if (!string2.equals(1C.a((int)((long)503234306 ^ (long)-503239113), (int)((long)1917900051 ^ (long)1917885849)))) break;
                if (bl2) return true;
                n2 = (int)((long)1791892507 ^ (long)1791892504);
                if (bl2) return true;
                break;
            }
        }
        if (bl2) return true;
        switch (n2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                if (bl2) return true;
                return (int)((long)-851039209 ^ (long)-851039210) != 0;
            }
            default: {
                if (!bl2) return Boolean.valueOf(string);
            }
        }
        return true;
    }

    @Nullable
    public static bja 0(List<bja> list, String string) {
        boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
        if (bl2 || bl2) {
            return null;
        }
        return list.stream().filter(bja2 -> {
            boolean bl2 = \u2007\u2004\u200b\u2000\u200a;
            if (bl2 || bl2) {
                return true;
            }
            return bja2.j.equals(cey.a((String)string, (Object[])new Object[(int)((long)-306757302 ^ (long)-306757302)]));
        }).findFirst().orElse(null);
    }
}

