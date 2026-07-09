/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import io.github.ImpactDevelopment.installer.Installer;
import io.github.ImpactDevelopment.installer.utils.Tracky;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;
import net.impactclient.00;
import net.impactclient.02;
import net.impactclient.04;
import net.impactclient.05;
import net.impactclient.08;
import net.impactclient.0D;
import net.impactclient.0G;
import net.impactclient.0H;
import net.impactclient.0J;
import net.impactclient.0K;
import net.impactclient.0T;
import net.impactclient.0ap;
import net.impactclient.0ax;
import net.impactclient.0r1;
import net.impactclient.0rB$1f;
import net.impactclient.0rW;
import net.impactclient.0t;
import net.impactclient.1a;
import net.impactclient.2G;
import net.impactclient.2l;
import net.impactclient.2p;
import net.impactclient.2w;
import net.impactclient.32;
import net.impactclient.34;
import net.impactclient.39;
import net.impactclient.3B;
import net.impactclient.3E;
import net.impactclient.3J;
import net.impactclient.3L;
import net.impactclient.3O;
import net.impactclient.3V;
import net.impactclient.3b;
import net.impactclient.3f;
import net.impactclient.3h;
import net.impactclient.3l;
import net.impactclient.4F;
import net.impactclient.4O;
import net.impactclient.4l;
import net.impactclient.4t;
import net.impactclient.5B;
import net.impactclient.5H;
import net.impactclient.5K;
import net.impactclient.5R;
import net.impactclient.5W;
import net.impactclient.5c;
import net.impactclient.5f;
import net.impactclient.5g;
import net.impactclient.62;
import net.impactclient.63;
import net.impactclient.64;
import net.impactclient.65;
import net.impactclient.69;
import net.impactclient.6A;
import net.impactclient.6D;
import net.impactclient.6E;
import net.impactclient.6I;
import net.impactclient.6L;
import net.impactclient.6M;
import net.impactclient.6N;
import net.impactclient.6P;
import net.impactclient.6Q;
import net.impactclient.6R;
import net.impactclient.6S;
import net.impactclient.6T;
import net.impactclient.6U;
import net.impactclient.6Y;
import net.impactclient.6Z;
import net.impactclient.6b;
import net.impactclient.6c;
import net.impactclient.6e;
import net.impactclient.6f;
import net.impactclient.6h;
import net.impactclient.6i;
import net.impactclient.6k;
import net.impactclient.6m;
import net.impactclient.6p;
import net.impactclient.6s;
import net.impactclient.6t;
import net.impactclient.6v;
import net.impactclient.6w;
import net.impactclient.6x;
import net.impactclient.6z;
import net.impactclient.7A;
import net.impactclient.7V;
import net.impactclient.7l;
import net.impactclient.9;
import net.impactclient.95;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0ay
implements 0T {
    public 3J 0h;
    public static final Logger 0a;
    public 3V 5;
    private 0t 6;
    public 5W 3;
    public 3O 0b;
    public 3f 7;
    public List<Runnable> 1;
    public 5B 0j;
    private static boolean 0e;
    public 34 4;
    private static 0ay 8;
    public int 9;
    private 3L 0g;
    public 3E 0d;
    public static final boolean \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
    private static final String[] b;
    public ThreadPoolExecutor 0c;
    public 32 0i;
    private static final String[] a;
    public 39 0f;
    public 3l 0;

    /*
     * Enabled aggressive block sorting
     */
    public static void 1(boolean bl2) {
        block3: {
            block2: {
                boolean bl3 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
                if (bl3) break block2;
                0e = bl2;
                if (!bl3) break block3;
            }
            return;
        }
    }

    private static /* synthetic */ 5B 0(boolean bl2) {
        boolean bl3 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl3 || bl3) {
            return null;
        }
        return new 5B(bl2);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                var7 = 0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008;
                if (!var7) break block24;
                break block25;
            }
            var5_1 = new String[(int)((long)1386986938 ^ (long)1386986920)];
            if (var7) break block25;
            var3_2 = (int)((long)272541154 ^ (long)272541154);
            if (var7) break block25;
            var2_3 = 0rB$1f.XNZw("\uf583\u5e8e\u9ded\u6025\uf537\u5e81\u9df2\u60b6\uf5e4\u5e1c\u9d1f\u609f\uf518\u5ed6\u9d0e\u60f1\uf564\u5e5d\u9d10\u602d\uf544\u5eeb\u9d93\u60b7\uf57b\u5e0e\u9d68\u60dd\uf5ee\u5efe\u9d5e\u60bd\uf5da\u5eab\u9d5c\u6069\uf56a\u5e6e\u9d86\u6007\uf58b\u5eca\u9d68\u60d6\uf5ce\u5ed3\u9d82\u604a\uf546\u5e6e\u9d72\u6024\uf5c8\u5ecc\u9de4\u60cf\uf5c6\u5e4a\u9d7c\u6032\uf53a\u5eaf\u9dc4\u60e9\uf563\u5e18\u9db7\u60b8\uf5c4\u5e04\u9df2\u60bc\uf530\u5e65\u9d68\u60f1\uf5f3\u5e60\u9d0e\u6085\uf55b\u5ead\u9dde\u60d4\uf5d7\u5e8e\u9d14\u60c2\uf568\u5e6c\u9d6c\u6094\uf5c7\u5ecc\u9d63\u601b\uf570\u5e94\u9d9d\u60ed\uf5d9\u5e34\u9db2\u6067\uf599\u5ee3\u9db3\u60b6\uf55d\u5ea4\u9d5e\u60ad\uf507\u5e14\u9d00\u604f\uf5f2\u5eb9\u9df1\u60a8\uf5ae\u5e8a\u9d56\u60bd\uf5fe\u5efa\u9d76\u60d1\uf579\u5ef7\u9d87\u60f6\uf561\u5eca\u9d55\u6015\uf526\u5ed5\u9d16\u60c6\uf549\u5eb7\u9d85\u6006\uf56c\u5eb1\u9da3\u60c0\uf55d\u5e44\u9d69\u6032\uf524\u5e82\u9de9\u6033\uf5f0\u5ea7\u9dc1\u6032\uf566\u5e4c\u9ddd\u605f\uf51b\u5e4d\u9d0c\u6047\uf55d\u5e59\u9dbe\u6089\uf5de\u5e0c\u9d87\u60f5\uf5a7\u5e62\u9dfe\u601a\uf504\u5ea2\u9d37\u60f7\uf592\u5ec5\u9d0d\u6007\uf5c0\u5e28\u9d2e\u606e\uf5e6\u5ea7\u9d5a\u60d8\uf5c0\u5e97\u9d46\u60bb\uf54c\u5e3d\u9d20\u6019\uf54d\u5e31\u9d5c\u606b\uf557\u5ee1\u9dbd\u6052\uf571\u5e37\u9d8e\u6002\uf556\u5e27\u9d7a\u60af\uf554\u5e1b\u9d2c\u6086\uf5e0\u5e1f\u9db4\u60b8\uf598\u5eae\u9df6\u60c9\uf51a\u5ec9\u9ddf\u6086\uf528\u5eef\u9df9\u600a\uf573\u5ef6\u9d10\u60a3\uf58b\u5eb8\u9d5a\u6095\uf584\u5e98\u9d7b\u60e7\uf59c\u5e0f\u9d61\u6045\uf525\u5e55\u9df0\u6019\uf544\u5e8d\u9d5a\u60a2\uf57d\u5eb1\u9d24\u60bf\uf547\u5efa\u9d7f\u6086\uf5e4\u5e87\u9d9f\u60f6\uf554\u5e03\u9d6a\u6049\uf5a7\u5e17", -1997844381);
            var4_4 = var2_3.length();
            0ay.1((boolean)((long)-876152479 ^ (long)-876152480));
            if (var7) break block25;
            var1_5 = (int)((long)-2122990616 ^ (long)-2122990609);
            if (var7) break block25;
            var0_6 = (int)((long)1398512843 ^ (long)-1398512844);
            if (var7) break block25;
            block11: while (!var7) {
                block22: {
                    block21: {
                        v0 = (int)((long)1972895133 ^ (long)1972895187);
                        v1 = ++var0_6;
                        v2 = var2_3.substring(v1, v1 + var1_5);
                        v3 = (int)((long)-984970595 ^ (long)984970594);
                        if (0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) {
                            throw null;
lbl25:
                            // 1 sources

                            while (true) {
                                var5_1[var3_2++] = v4.intern();
                                if ((var0_6 += var1_5) < var4_4) {
                                    var1_5 = var2_3.charAt(var0_6);
                                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) continue block11;
                                    throw null;
                                }
                                var2_3 = 0rB$1f.XNZw("\ua745\u0c59\ucf6f\u3285\ua73d\u0ccf\ucfe9\u32c4\ua7bb\u0c42\ucfa6\u329b\ua74d\u0c24\ucf64\u3207\ua7dd\u0ced\ucfe2\u32e1", -1405091301);
                                var4_4 = var2_3.length();
                                var1_5 = (int)((long)1999841967 ^ (long)1999841960);
                                var0_6 = (int)((long)1790390587 ^ (long)-1790390588);
                                while (true) {
                                    v0 = (int)((long)521980539 ^ (long)521980445);
                                    v5 = ++var0_6;
                                    v2 = var2_3.substring(v5, v5 + var1_5);
                                    v3 = (int)((long)487718722 ^ (long)487718722);
                                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break block21;
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
                                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) ** continue;
                                    throw null;
                                }
                                0ay.a = var5_1;
                                0ay.b = new String[(int)((long)213962683 ^ (long)213962665)];
                                if (0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) {
                                    throw null;
                                }
                                break block22;
                                break;
                            }
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var6_7 = (int)((long)2028448681 ^ (long)2028448681);
                    v8 = v0;
                    v9 = v6;
                    v10 = v7;
                    if (v7 > (int)((long)1817105172 ^ (long)1817105173)) ** GOTO lbl109
                    do {
                        block23: {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var6_7;
                            do {
                                switch (var6_7 % (int)((long)566557711 ^ (long)566557704)) {
                                    case 0: {
                                        v15 = (int)((long)272668140 ^ (long)272668040);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    case 1: {
                                        v15 = (int)((long)-1004937474 ^ (long)-1004937485);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    case 2: {
                                        v15 = (int)((long)-504296535 ^ (long)-504296518);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    case 3: {
                                        v15 = (int)((long)1267385638 ^ (long)1267385713);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    case 4: {
                                        v15 = (int)((long)557670162 ^ (long)557670201);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    case 5: {
                                        v15 = (int)((long)-1188833413 ^ (long)-1188833454);
                                        if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                                        throw null;
                                    }
                                    default: {
                                        v15 = (int)((long)1834056911 ^ (long)1834056838);
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
                            } while (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008);
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
lbl120:
                        // 1 sources

                        ** continue;
                    }
                }
                0ay.0a = LogManager.getLogger((String)0ay.a((int)((long)23196191 ^ (long)-23186604), (int)((long)461861829 ^ (long)461833939)));
                break;
            }
        }
    }

    public static boolean 0() {
        boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl2) {
            return true;
        }
        return 0e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0ay() {
        block3: {
            block2: {
                boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
                if (bl2 || bl2) break block2;
                this.9 = (int)((long)-584783224 ^ (long)-584783224);
                if (!bl2) break block3;
            }
            return;
        }
    }

    public static 0ay 3() {
        boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl2 || bl2) {
            return null;
        }
        return 8;
    }

    public static String 1(String string) {
        boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl2 || bl2) {
            return null;
        }
        return 0ay.2.w + 0ay.a((int)((long)-1018734527 ^ (long)1018730754), (int)((long)-1578382071 ^ (long)-1578392824)) + string;
    }

    /*
     * Unable to fully structure code
     */
    private static String a(int var0, int var1_1) {
        block265: {
            var9_2 = 0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)450999351 ^ (long)-450988682)) & (int)((long)580489291 ^ (long)580480948);
            if (var9_2) ** GOTO lbl-1000
            if (0ay.b[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 0ay.a[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)-1820270515 ^ (long)-1820270515)] & (int)((long)-400453677 ^ (long)-400453844)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-928028976 ^ (long)-928029044);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1999516072 ^ (long)-1999515905);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)1432980142 ^ (long)1432980116);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1857353363 ^ (long)1857353470);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)-1195099672 ^ (long)-1195099776);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)1481150866 ^ (long)1481150969);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)1096159592 ^ (long)1096159736);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)683103746 ^ (long)683103950);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-428106697 ^ (long)-428106747);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)632961768 ^ (long)632961645);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)726662204 ^ (long)726662357);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)635904468 ^ (long)635904369);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)1053579119 ^ (long)1053579123);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)-2080802614 ^ (long)-2080802630);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-1192901680 ^ (long)-1192901859);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-167637344 ^ (long)-167637323);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)1506435039 ^ (long)1506434830);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)1192746762 ^ (long)1192746955);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-1834297133 ^ (long)-1834297308);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)2042566022 ^ (long)2042566091);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)-381844480 ^ (long)-381844396);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)-1250133215 ^ (long)-1250133233);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-338776075 ^ (long)-338776281);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)-503227885 ^ (long)-503227755);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)667068930 ^ (long)667069012);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-778788353 ^ (long)-778788398);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-412791355 ^ (long)-412791401);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)1665771640 ^ (long)1665771676);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)2121767049 ^ (long)2121767047);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1803536659 ^ (long)-1803536811);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)-284202565 ^ (long)-284202711);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-1012652184 ^ (long)-1012652060);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-466176303 ^ (long)-466176329);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1629581602 ^ (long)1629581669);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)1473204887 ^ (long)1473204798);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)1816093707 ^ (long)1816093907);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)-1629283241 ^ (long)-1629283156);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)1151492399 ^ (long)1151492607);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)1544719968 ^ (long)1544720017);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)1010607147 ^ (long)1010607128);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)2094637092 ^ (long)2094637210);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1495575377 ^ (long)-1495575424);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-582368031 ^ (long)-582368239);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)1267383491 ^ (long)1267383440);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-1446355070 ^ (long)-1446355041);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)-462666037 ^ (long)-462666004);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)2134979244 ^ (long)2134979220);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-417896138 ^ (long)-417896084);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)833106902 ^ (long)833106742);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)-366451185 ^ (long)-366451066);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1850015718 ^ (long)1850015660);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-425566842 ^ (long)-425566729);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1625612281 ^ (long)1625612098);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1248673039 ^ (long)-1248673209);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)2097105391 ^ (long)2097105293);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)1935854676 ^ (long)1935854613);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)649692398 ^ (long)649692405);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1621730914 ^ (long)-1621730927);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1007370661 ^ (long)1007370527);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1000469454 ^ (long)-1000469327);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)-348384204 ^ (long)-348384206);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)-1645272233 ^ (long)-1645272105);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1398611371 ^ (long)-1398611343);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)1816951887 ^ (long)1816952025);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1048886034 ^ (long)-1048886203);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)906653932 ^ (long)906653932);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)1573151947 ^ (long)1573151905);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)-2082192405 ^ (long)-2082192502);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)1217640369 ^ (long)1217640217);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)-204707054 ^ (long)-204706912);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)112126457 ^ (long)112126324);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)350972302 ^ (long)350972413);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-420490938 ^ (long)-420490971);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-6173261 ^ (long)-6173402);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)1050011527 ^ (long)1050011531);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)356448671 ^ (long)356448536);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)-441455005 ^ (long)-441454948);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)-1449952556 ^ (long)-1449952730);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)1327697715 ^ (long)1327697807);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1665389701 ^ (long)1665389809);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)-817684001 ^ (long)-817684117);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)401510337 ^ (long)401510255);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)667335956 ^ (long)667336169);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)1841335550 ^ (long)1841335427);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)1459573145 ^ (long)1459573223);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)937011339 ^ (long)937011279);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)-753478813 ^ (long)-753478805);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)-2104869193 ^ (long)-2104869259);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-2069031567 ^ (long)-2069031550);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)1677692267 ^ (long)1677692174);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-1355130123 ^ (long)-1355130151);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)730723434 ^ (long)730723379);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)2040316656 ^ (long)2040316435);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-238117911 ^ (long)-238118089);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-224655808 ^ (long)-224655833);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)-696310374 ^ (long)-696310473);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)1958020744 ^ (long)1958020752);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)1802004793 ^ (long)1802004940);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)-1709734306 ^ (long)-1709734370);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-1017744391 ^ (long)-1017744458);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)1945901551 ^ (long)1945901517);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-292684932 ^ (long)-292684923);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)-2080276665 ^ (long)-2080276547);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-155022426 ^ (long)-155022518);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)-1880052333 ^ (long)-1880052285);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)677857985 ^ (long)677857885);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)1567912003 ^ (long)1567912169);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1151540981 ^ (long)-1151540810);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-757158459 ^ (long)-757158418);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-946834715 ^ (long)-946834894);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)1918347821 ^ (long)1918347839);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-297860771 ^ (long)-297860739);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)1873273111 ^ (long)1873273248);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)-1602851438 ^ (long)-1602851418);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)259374469 ^ (long)259374552);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1330683778 ^ (long)-1330683837);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)353577403 ^ (long)353577252);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)1391271415 ^ (long)1391271308);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)-769291413 ^ (long)-769291446);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)-1161565965 ^ (long)-1161566144);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-850051974 ^ (long)-850051924);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-1717782231 ^ (long)-1717782051);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1577437585 ^ (long)-1577437527);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)2051195423 ^ (long)2051195464);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-376629638 ^ (long)-376629726);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)-2090188081 ^ (long)-2090188084);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)1458074679 ^ (long)1458074745);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)1663977184 ^ (long)1663977189);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)294452844 ^ (long)294452837);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)689171459 ^ (long)689171559);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1456642997 ^ (long)1456642942);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)1559007957 ^ (long)1559007785);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)1982153 ^ (long)1982081);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)785191873 ^ (long)785191700);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)461555167 ^ (long)461555157);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)263340878 ^ (long)263340857);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-417648165 ^ (long)-417648242);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-889866836 ^ (long)-889866862);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)1370558298 ^ (long)1370558367);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)1094742560 ^ (long)1094742655);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)-1295397812 ^ (long)-1295397676);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)2078942210 ^ (long)2078942437);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)-2108313826 ^ (long)-2108313635);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-972138610 ^ (long)-972138736);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)1879869667 ^ (long)1879869545);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)213332693 ^ (long)213332528);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)822881784 ^ (long)822881737);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1962399565 ^ (long)-1962399608);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)80831222 ^ (long)80830996);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)103825052 ^ (long)103825011);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)1770956232 ^ (long)1770956064);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)832124013 ^ (long)832124108);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-1453978292 ^ (long)-1453978273);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)470587208 ^ (long)470587223);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)-1294946054 ^ (long)-1294946107);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)2007762237 ^ (long)2007762230);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)2084870728 ^ (long)2084870782);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)559746888 ^ (long)559746856);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)-107955516 ^ (long)-107955459);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-1788464127 ^ (long)-1788464087);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1654107387 ^ (long)1654107277);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)-127816546 ^ (long)-127816676);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)1773247085 ^ (long)1773247138);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)821848849 ^ (long)821848932);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)499927556 ^ (long)499927558);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-1018916136 ^ (long)-1018916185);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1043325331 ^ (long)1043325398);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)822111719 ^ (long)822111606);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)-2086375929 ^ (long)-2086375886);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)-966028059 ^ (long)-966028218);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1767418122 ^ (long)-1767418226);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)1251349419 ^ (long)1251349360);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)957256624 ^ (long)957256618);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-1354555915 ^ (long)-1354556099);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-895232421 ^ (long)-895232387);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)1162282844 ^ (long)1162282783);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)1402154034 ^ (long)1402154170);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)-1473137614 ^ (long)-1473137413);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)1572741459 ^ (long)1572741476);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)-1569019492 ^ (long)-1569019509);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)425719068 ^ (long)425719293);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-1827414585 ^ (long)-1827414597);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)1695516105 ^ (long)1695516022);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)-932513261 ^ (long)-932513175);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-614062405 ^ (long)-614062490);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)-2094509805 ^ (long)-2094509794);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-533128405 ^ (long)-533128201);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)-1225482587 ^ (long)-1225482498);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)482018620 ^ (long)482018812);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)1997207258 ^ (long)1997207190);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1896798983 ^ (long)1896799181);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-888425358 ^ (long)-888425237);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-213662436 ^ (long)-213662377);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)836148590 ^ (long)836148599);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)-508139166 ^ (long)-508139023);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-746185951 ^ (long)-746185836);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)-1885108264 ^ (long)-1885108413);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)-1854319828 ^ (long)-1854319662);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)-629848277 ^ (long)-629848065);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)497409390 ^ (long)497409408);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)1086134180 ^ (long)1086134089);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)1347162222 ^ (long)1347162306);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)385848139 ^ (long)385848162);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)2110181426 ^ (long)2110181412);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)-653124462 ^ (long)-653124560);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)-1888277620 ^ (long)-1888277747);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)143794253 ^ (long)143794413);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)2056241193 ^ (long)2056241263);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1155193311 ^ (long)-1155193114);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-469090464 ^ (long)-469090362);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)1226485121 ^ (long)1226485083);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)-1768448635 ^ (long)-1768448556);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)1473616281 ^ (long)1473616314);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)-1017515230 ^ (long)-1017515064);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)901661251 ^ (long)901661255);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)342460455 ^ (long)342460470);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)-215424805 ^ (long)-215425003);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)1354008769 ^ (long)1354008829);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)1506968645 ^ (long)1506968644);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)1008231071 ^ (long)1008231149);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1561809691 ^ (long)1561809804);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)-1427144250 ^ (long)-1427144296);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)-1236825190 ^ (long)-1236825324);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)1747341375 ^ (long)1747341467);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)-958495734 ^ (long)-958495677);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)1556717450 ^ (long)1556717542);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)254812070 ^ (long)254811963);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)2108000505 ^ (long)2108000476);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)654883350 ^ (long)654883449);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)-1014351615 ^ (long)-1014351467);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)1477382808 ^ (long)1477382834);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-1834254656 ^ (long)-1834254773);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-1950481332 ^ (long)-1950481371);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)-799090545 ^ (long)-799090483);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)-1749873111 ^ (long)-1749872986);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)1062544696 ^ (long)1062544684);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)-1211441473 ^ (long)-1211441627);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1085427897 ^ (long)1085427791);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)1599175820 ^ (long)1599175786);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)-966278421 ^ (long)-966278566);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)1595705056 ^ (long)1595704889);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)2138903123 ^ (long)2138903168);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1396418222 ^ (long)1396418263);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)-1005648221 ^ (long)-1005648365);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)1153479902 ^ (long)1153479897);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-1437807686 ^ (long)-1437807702);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)1083656113 ^ (long)1083655966);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-315358655 ^ (long)-315358562);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)-625058672 ^ (long)-625058796);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)1449088317 ^ (long)1449088453);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)273945593 ^ (long)273945408);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)-126165414 ^ (long)-126165398);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1919144388 ^ (long)1919144239);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1826113868 ^ (long)1826113826);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)739226604 ^ (long)739226536);
                    if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-1954441737 ^ (long)-1954441751);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)1368397594 ^ (long)1368397797)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)514511165 ^ (long)514469570)) >>> (int)((long)1916032969 ^ (long)1916032961)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)14884287 ^ (long)14884287);
            if (!0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-2085032271 ^ (long)-2085032269);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)255585610 ^ (long)255585609) | var5_6 << (int)((long)-1595967907 ^ (long)-1595967912)) ^ var3_4[var7_8]) & (int)((long)-777813414 ^ (long)-777813339);
                    if (0ay.\u2008\u2002\u2006\u2005\u2007\u200d\u2008) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)1699728149 ^ (long)1699728150) | var6_7 << (int)((long)-945074198 ^ (long)-945074193)) ^ var3_4[var7_8]) & (int)((long)-1547328473 ^ (long)-1547328296);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            0ay.b[var2_3] = new String(var3_4).intern();
        }
        return 0ay.b[var2_3];
    }

    public static Path 0(String string) {
        boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl2 || bl2) {
            return null;
        }
        return 0ay.2.w.toPath().resolve(0ay.a((int)((long)-64032853 ^ (long)64040675), (int)((long)970872391 ^ (long)-970855545))).resolve(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 1() {
        boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
        if (bl2) return true;
        boolean bl3 = 0ay.0();
        if (bl2) return true;
        if (!bl3) {
            if (bl2) return true;
            return (int)((long)1131526179 ^ (long)1131526178) != 0;
        }
        if (!bl2) return (int)((long)1883661317 ^ (long)1883661317) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void 2() {
        block39: {
            boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
            if (!bl2 && !bl2) {
                int n2 = (int)((long)1329112578 ^ (long)-1329109182);
                8 = this;
                int n3 = (int)((long)1729986815 ^ (long)-1730004276);
                BaritoneAPI.getProvider().getPrimaryBaritone();
                this.0c = new ThreadPoolExecutor((int)((long)1848744601 ^ (long)1848744593), (int)((long)1218687369 ^ (long)1218687469), 0x40175656E7C9BE95L ^ 0x40175656E7C9BEA9L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
                this.0g = new 3L();
                62.0();
                0H.0();
                2G.3();
                Installer.args.mcPath = 0ay.2.w.toPath().toString();
                Tracky.event(0ay.a(n2, n3), 0ay.a((int)((long)-168712384 ^ (long)168715786), (int)((long)1145645959 ^ (long)-1145646556)), 0ay.a((int)((long)1099650118 ^ (long)-1099655935), (int)((long)645804777 ^ (long)-645795322)));
                if (!bl2 && !bl2) {
                    Tracky.persist(0ay.2.w.toPath());
                    if (!bl2 && !bl2) {
                        CompletableFuture<5B> completableFuture = CompletableFuture.supplyAsync(() -> 0ay.0(4O.0()), this.0c);
                        if (!bl2 && !bl2) {
                            this.1 = new ArrayList<Runnable>();
                            this.1.add(08.0);
                            if (!bl2 && !bl2) {
                                this.0b = new 3O();
                                this.0b.1();
                                if (!bl2 && !bl2) {
                                    this.5 = new 3V();
                                    this.5.1();
                                    if (!bl2 && !bl2) {
                                        32 var2_3 = this.0i = new 32();
                                        if (!bl2 && !bl2) {
                                            6f[] fArray = new 6f[(int)((long)24656801 ^ (long)24656830)];
                                            fArray[(int)((long)842438675 ^ (long)842438675)] = new 6T();
                                            fArray[(int)((long)693257297 ^ (long)693257296)] = new 64();
                                            fArray[(int)((long)-394310828 ^ (long)-394310826)] = new 6E();
                                            fArray[(int)((long)-1516641101 ^ (long)-1516641104)] = new 6c();
                                            fArray[(int)((long)-1675762826 ^ (long)-1675762830)] = new 6Z();
                                            fArray[(int)((long)882201727 ^ (long)882201722)] = new 6Y();
                                            fArray[(int)((long)502519550 ^ (long)502519544)] = new 6p();
                                            fArray[(int)((long)2118865699 ^ (long)2118865700)] = new 6L();
                                            fArray[(int)((long)-1334377306 ^ (long)-1334377298)] = new 6D();
                                            fArray[(int)((long)-1816094479 ^ (long)-1816094472)] = new 6m();
                                            fArray[(int)((long)645224864 ^ (long)645224874)] = new 6z();
                                            fArray[(int)((long)-902545417 ^ (long)-902545412)] = new 6v();
                                            fArray[(int)((long)-830620544 ^ (long)-830620532)] = new 63();
                                            fArray[(int)((long)319249907 ^ (long)319249918)] = new 6S();
                                            fArray[(int)((long)1699186148 ^ (long)1699186154)] = new 6R();
                                            fArray[(int)((long)-913078898 ^ (long)-913078911)] = new 6e();
                                            fArray[(int)((long)-1308324063 ^ (long)-1308324047)] = new 6k();
                                            fArray[(int)((long)-1824337187 ^ (long)-1824337204)] = new 6Q();
                                            fArray[(int)((long)-735947094 ^ (long)-735947080)] = new 6M();
                                            fArray[(int)((long)1750827144 ^ (long)1750827163)] = new 6U();
                                            fArray[(int)((long)1144696557 ^ (long)1144696569)] = new 6s();
                                            fArray[(int)((long)1921878884 ^ (long)1921878897)] = new 6w();
                                            fArray[(int)((long)-2138121663 ^ (long)-2138121641)] = new 6P();
                                            fArray[(int)((long)-1745638718 ^ (long)-1745638699)] = new 6i();
                                            fArray[(int)((long)-1835947146 ^ (long)-1835947154)] = new 6A();
                                            fArray[(int)((long)1832061940 ^ (long)1832061933)] = new 6x();
                                            fArray[(int)((long)-2059213020 ^ (long)-2059212994)] = new 6b();
                                            fArray[(int)((long)-54696886 ^ (long)-54696879)] = new 6t();
                                            fArray[(int)((long)-1119241553 ^ (long)-1119241549)] = new 65();
                                            fArray[(int)((long)-2050031191 ^ (long)-2050031180)] = new 6h();
                                            fArray[(int)((long)32071983 ^ (long)32071985)] = new 69();
                                            Object object = fArray;
                                            if (!bl2 && !bl2) {
                                                var2_3.addAll(Arrays.asList(object));
                                                if (!bl2 && !bl2) {
                                                    var2_3.0.1 = (int)((long)-426689938 ^ (long)-426689937);
                                                    if (!bl2 && !bl2) {
                                                        4t.1.subscribe(new 4l(var2_3.0));
                                                        if (!bl2 && !bl2) {
                                                            var2_3.0.0(new 0K());
                                                            if (!bl2 && !bl2) {
                                                                var2_3.0.0(new 3b());
                                                                if (!bl2 && !bl2) {
                                                                    var2_3.0.0(new 3B());
                                                                    if (!bl2 && !bl2) {
                                                                        var2_3.0.0(new 04());
                                                                        if (!bl2 && !bl2) {
                                                                            var2_3.0.0(new 0ax());
                                                                            if (!bl2 && !bl2) {
                                                                                var2_3.0.0(new 0J());
                                                                                if (!bl2 && !bl2) {
                                                                                    var2_3.0.0(new 5c());
                                                                                    if (!bl2 && !bl2) {
                                                                                        var2_3.0.0(new 2p());
                                                                                        if (!bl2 && !bl2) {
                                                                                            var2_3.0.0(new 00(var2_3));
                                                                                            if (!bl2 && !bl2) {
                                                                                                var2_3.0.0(new 6N());
                                                                                                if (!bl2 && !bl2) {
                                                                                                    var2_3.0.0(new 5K(0ay.8.5));
                                                                                                    if (!bl2 && !bl2) {
                                                                                                        var2_3.0.0(new 4F());
                                                                                                        if (!bl2 && !bl2) {
                                                                                                            var2_3.0.0(new 7l());
                                                                                                            if (!bl2 && !bl2) {
                                                                                                                var2_3.0.0(new 3h());
                                                                                                                if (!bl2 && !bl2) {
                                                                                                                    object = 0ay.8.0b;
                                                                                                                    if (!bl2 && !bl2) {
                                                                                                                        var2_3.0.6 = ((3O)object).0(0ay.a((int)((long)-1278804346 ^ (long)1278820303), (int)((long)-1041392382 ^ (long)-1041394767)), 0rB$1f.XNZw("\u9b48", -268157222));
                                                                                                                        if (!bl2 && !bl2) {
                                                                                                                            0D.a.b = ((3O)object).0(0ay.a((int)((long)-2015714336 ^ (long)2015716012), (int)((long)-2135872335 ^ (long)2135864828)), (boolean)((long)1729475048 ^ (long)1729475049));
                                                                                                                            if (!bl2 && !bl2) {
                                                                                                                                0rW.a.b = ((3O)object).0(0ay.a((int)((long)1568120210 ^ (long)-1568121662), (int)((long)1925231720 ^ (long)-1925238425)), (boolean)((long)-940380158 ^ (long)-940380157));
                                                                                                                                if (!bl2 && !bl2) {
                                                                                                                                    int n4;
                                                                                                                                    int n5 = 2w.0((char)((long)1699750107 ^ (long)1699750114));
                                                                                                                                    Object object2 = object;
                                                                                                                                    String string = 0ay.a((int)((long)-1761174568 ^ (long)1761172118), (int)((long)1654670957 ^ (long)-1654660307));
                                                                                                                                    if (((3O)object2).3(string)) {
                                                                                                                                        n4 = ((3O)object2).0(string);
                                                                                                                                        if (\u2008\u2002\u2006\u2005\u2007\u200d\u2008) {
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        n4 = n5;
                                                                                                                                    }
                                                                                                                                    0rW.a.c = n4;
                                                                                                                                    7V.a.c = ((3O)object).0(0ay.a((int)((long)215284785 ^ (long)-215270025), (int)((long)732839075 ^ (long)732826296)), (boolean)((long)-1748716815 ^ (long)-1748716815));
                                                                                                                                    7V.a.d = ((3O)object).0(0ay.a((int)((long)289229533 ^ (long)-289240168), (int)((long)-1107905829 ^ (long)1107886969)), (boolean)((long)-1303894094 ^ (long)-1303894094));
                                                                                                                                    7V.a.e = ((3O)object).0(0ay.a((int)((long)1484646143 ^ (long)-1484642371), (int)((long)1720512279 ^ (long)-1720493381)), (boolean)((long)1514120790 ^ (long)1514120790));
                                                                                                                                    this.0d = new 3E();
                                                                                                                                    this.0d.1();
                                                                                                                                    this.7 = new 3f();
                                                                                                                                    this.7.1();
                                                                                                                                    this.4 = new 34();
                                                                                                                                    this.4.1();
                                                                                                                                    this.0f = new 39();
                                                                                                                                    this.0f.1();
                                                                                                                                    this.0h = new 3J();
                                                                                                                                    this.0h.1();
                                                                                                                                    this.0 = new 3l();
                                                                                                                                    this.0.1();
                                                                                                                                    this.3 = new 5W();
                                                                                                                                    this.6 = new 0t();
                                                                                                                                    7A.1();
                                                                                                                                    Object object3 = 0G.0;
                                                                                                                                    if (((0G)object3).2.isEmpty()) {
                                                                                                                                        ((0G)object3).0(new 9());
                                                                                                                                        ((0G)object3).1 = ((0G)object3).2.get((int)((long)-2021184449 ^ (long)-2021184449));
                                                                                                                                    }
                                                                                                                                    Listenable[] listenableArray = new Listenable[(int)((long)1933445514 ^ (long)1933445517)];
                                                                                                                                    listenableArray[(int)((long)1355497521 ^ (long)1355497521)] = 0ap.a;
                                                                                                                                    listenableArray[(int)((long)-1083721762 ^ (long)-1083721761)] = 6I.a;
                                                                                                                                    listenableArray[(int)((long)633625175 ^ (long)633625173)] = 1a.a;
                                                                                                                                    listenableArray[(int)((long)-720621441 ^ (long)-720621444)] = 2l.a;
                                                                                                                                    listenableArray[(int)((long)1980115518 ^ (long)1980115514)] = 0r1.a;
                                                                                                                                    listenableArray[(int)((long)959425933 ^ (long)959425928)] = 5g.a;
                                                                                                                                    listenableArray[(int)((long)106007531 ^ (long)106007533)] = 02.a;
                                                                                                                                    4t.1.subscribeAll(listenableArray);
                                                                                                                                    4t.1.subscribe(new Listener<5f>(f2 -> {
                                                                                                                                        block3: {
                                                                                                                                            block2: {
                                                                                                                                                boolean bl2 = \u2008\u2002\u2006\u2005\u2007\u200d\u2008;
                                                                                                                                                if (bl2 || bl2) break block2;
                                                                                                                                                7A.0((boolean)((long)-2146216271 ^ (long)-2146216272));
                                                                                                                                                if (!bl2) break block3;
                                                                                                                                            }
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                    }, new Predicate[(int)((long)1555251872 ^ (long)1555251872)]));
                                                                                                                                    5R.0();
                                                                                                                                    if (!4O.0) {
                                                                                                                                        4O.0 = (int)((long)1512489344 ^ (long)1512489345);
                                                                                                                                        if (!05.0(0ay.a((int)((long)-268923787 ^ (long)268913972), (int)((long)82857078 ^ (long)82852912))).0(0ay.a((int)((long)-1589808825 ^ (long)1589817356), (int)((long)649716376 ^ (long)649697166)), 5H.0).equals(0ay.a((int)((long)-295569947 ^ (long)295580842), (int)((long)311348537 ^ (long)311354805)))) {
                                                                                                                                            2p.0();
                                                                                                                                        }
                                                                                                                                        if (!05.0(0ay.a((int)((long)1801455427 ^ (long)-1801468398), (int)((long)373148998 ^ (long)373152954))).0(0ay.a((int)((long)-1280797203 ^ (long)1280791721), (int)((long)1142196338 ^ (long)-1142195298)), 5H.0).equals(0ay.a((int)((long)-374698182 ^ (long)374689399), (int)((long)1189830246 ^ (long)1189831017)))) {
                                                                                                                                            2p.0();
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    4t.1.0 = (int)((long)-1132025581 ^ (long)-1132025582);
                                                                                                                                    0ay.8.5.forEach(this.5::2);
                                                                                                                                    this.5.0(95.class).0((boolean)((long)-181423425 ^ (long)-181423425));
                                                                                                                                    object3 = BaritoneAPI.getSettings();
                                                                                                                                    BaritoneAPI.getSettings().chatDebug.value = Boolean.FALSE;
                                                                                                                                    ((Settings)object3).chatControl.value = Boolean.FALSE;
                                                                                                                                    try {
                                                                                                                                        this.0j = completableFuture.get();
                                                                                                                                        return;
                                                                                                                                    } catch (InterruptedException | ExecutionException exception) {
                                                                                                                                        exception.printStackTrace();
                                                                                                                                        if (bl2 || bl2) break block39;
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

