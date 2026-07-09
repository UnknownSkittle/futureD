/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  bus
 *  et
 *  org.lwjgl.opengl.GL11
 *  rk
 *  vg
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.behavior.IPathingBehavior;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.calc.IPathFinder;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.path.IPathExecutor;
import baritone.api.utils.interfaces.IGoalRenderPos;
import java.awt.Color;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.impactclient.0rB$1f;
import net.impactclient.0rM;
import net.impactclient.0rQ;
import net.impactclient.0rh;
import net.impactclient.0ri;
import net.impactclient.1A;
import net.impactclient.1H;
import net.impactclient.1_;
import net.impactclient.1t;
import net.impactclient.23;
import net.impactclient.2J;
import net.impactclient.2r;
import net.impactclient.2w;
import net.impactclient.4F;
import net.impactclient.5D;
import net.impactclient.5O;
import net.impactclient.5b;
import net.impactclient.61;
import net.impactclient.73;
import net.impactclient.7b;
import org.lwjgl.opengl.GL11;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 9c
extends 73
implements 5O {
    private 0ri 3;
    private 0rM 0d;
    private 0ri 5;
    private 0ri 0c;
    private static final String[] e;
    private 0rM 0;
    private 0rQ 7;
    public 0rM 6;
    public static final boolean \u2006\u200d\u2004\u2007;
    private 0ri 0b;
    private 0ri 1;
    @EventHandler
    private final Listener<5D> 9;
    private 0ri 8;
    private static final String[] d;
    private 0rh 0a;
    private 0ri 4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void 0(int n2, int n3, Settings settings, IPathFinder iPathFinder) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2004\u2007;
                if (bl2 || bl2) break block2;
                iPathFinder.bestPathSoFar().ifPresent(iPath2 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u2006\u200d\u2004\u2007;
                            if (bl2 || bl2) break block2;
                            this.0((IPath)iPath2, n2, n3, (Color)settings.colorBestPathSoFar.value);
                            if (bl2 || bl2) break block2;
                            iPathFinder.pathToMostRecentNodeConsidered().ifPresent(iPath -> {
                                block3: {
                                    block2: {
                                        boolean bl2 = \u2006\u200d\u2004\u2007;
                                        if (bl2 || bl2) break block2;
                                        this.0((IPath)iPath, n2, n3, (Color)settings.colorMostRecentConsidered.value);
                                        if (!bl2 && !bl2) break block3;
                                    }
                                    return;
                                }
                            });
                            if (!bl2 && !bl2) break block3;
                        }
                        return;
                    }
                });
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 0(double d2, double d3) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200d\u2004\u2007;
                if (bl2 || bl2) break block2;
                bus.r((int)((int)((long)137388240 ^ (long)137388249)));
                if (bl2 || bl2) break block2;
                GL11.glVertex2d((double)d2, (double)(d3 + this.7.2));
                if (bl2 || bl2) break block2;
                GL11.glVertex2d((double)(d2 + this.7.2), (double)d3);
                if (bl2 || bl2) break block2;
                GL11.glVertex2d((double)d2, (double)(d3 - this.7.2));
                if (bl2 || bl2) break block2;
                GL11.glVertex2d((double)(d2 - this.7.2), (double)d3);
                if (bl2 || bl2) break block2;
                bus.J();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void 0(int var1_1, int var2_2, int var3_3, int var4_4, vg var5_5) {
        block26: {
            block24: {
                block25: {
                    block21: {
                        block23: {
                            block22: {
                                block20: {
                                    var14_6 = 9c.\u2006\u200d\u2004\u2007;
                                    if (var14_6 || var14_6) lbl-1000:
                                    // 12 sources

                                    {
                                        return;
                                    }
                                    var7_7 = var5_5;
                                    var6_8 = this;
                                    if (var14_6 || var14_6) ** GOTO lbl-1000
                                    if (var7_7 instanceof 61) ** GOTO lbl-1000
                                    if (var14_6 || var14_6) ** GOTO lbl-1000
                                    if (var7_7 == 9c.2.aa()) ** GOTO lbl-1000
                                    if (var14_6 || var14_6) ** GOTO lbl-1000
                                    if (!var7_7.aX()) break block20;
                                    if (var14_6) ** GOTO lbl-1000
                                    if (!var6_8.8.0) ** GOTO lbl-1000
                                    if (var14_6) ** GOTO lbl-1000
                                }
                                if (var14_6) ** GOTO lbl-1000
                                if (!(var7_7 instanceof aed)) break block21;
                                if (var14_6 || var14_6) ** GOTO lbl-1000
                                if (!var6_8.5.0) ** GOTO lbl-1000
                                if (var14_6 || var14_6) ** GOTO lbl-1000
                                if (!((aed)var7_7).cz()) break block22;
                                if (var14_6) ** GOTO lbl-1000
                                if (!var6_8.3.0) break block23;
                                if (var14_6) ** GOTO lbl-1000
                            }
                            if (!var14_6) ** break;
                            ** while (true)
                            v0 = (int)((long)-1845297590 ^ (long)-1845297589);
                            if (9c.\u2006\u200d\u2004\u2007) {
                                throw null;
                            }
                            break block24;
                        }
                        v0 = (int)((long)693347705 ^ (long)693347705);
                        if (9c.\u2006\u200d\u2004\u2007) {
                            throw null;
                        }
                        break block24;
                    }
                    if (!2w.0(var7_7)) break block25;
                    if (!var6_8.4.0) ** GOTO lbl-1000
                    v0 = (int)((long)1398854272 ^ (long)1398854273);
                    if (9c.\u2006\u200d\u2004\u2007) {
                        throw null;
                    }
                    break block24;
                }
                if (2w.1(var7_7) && var6_8.0b.0) {
                    v0 = (int)((long)-2055783063 ^ (long)-2055783064);
                    if (9c.\u2006\u200d\u2004\u2007) {
                        throw null;
                    }
                } else lbl-1000:
                // 6 sources

                {
                    v0 = (int)((long)681394062 ^ (long)681394062);
                }
            }
            if (v0 == 0 || !this.1(var6_9 = 9c.2.aa().p - var5_5.p, var8_10 = 9c.2.aa().r - var5_5.r)) break block26;
            bus.G();
            var10_11 = var6_9 + (double)var1_1 + (double)((float)this.6.2 / 2.0f);
            var12_12 = var8_10 + (double)var2_2 + (double)((float)this.6.2 / 2.0f);
            if (!((String)this.0a.1()).equals(9c.b((int)((long)633431743 ^ (long)-633434541), (int)((long)-1558037504 ^ (long)-1558026117)))) {
                v1 = -9c.2.aa().v;
                if (9c.\u2006\u200d\u2004\u2007) {
                    throw null;
                }
            } else {
                v1 = -180.0f;
            }
            1t.0(v1, var3_3, var4_4);
            if (!((String)this.0a.1()).equals(9c.b((int)((long)976714404 ^ (long)-976711096), (int)((long)356397332 ^ (long)356410735)))) {
                v2 = 9c.2.aa().v + 180.0f;
                if (9c.\u2006\u200d\u2004\u2007) {
                    throw null;
                }
            } else {
                v2 = 0.0f;
            }
            1t.0(v2 + 180.0f, var10_11, var12_12);
            if (var5_5 instanceof aed) ** GOTO lbl-1000
            if (2w.0(var5_5)) {
                bus.d((float)1.0f, (float)0.5f, (float)0.5f);
                if (9c.\u2006\u200d\u2004\u2007) {
                    throw null;
                }
            } else if (2w.1(var5_5)) {
                bus.d((float)0.5f, (float)1.0f, (float)0.5f);
                if (9c.\u2006\u200d\u2004\u2007) {
                    throw null;
                }
            } else lbl-1000:
            // 2 sources

            {
                bus.d((float)1.0f, (float)1.0f, (float)1.0f);
            }
            this.0(var10_11, var12_12);
            bus.H();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                var7 = 9c.\u2006\u200d\u2004\u2007;
                if (!var7) break block22;
                break block23;
            }
            var5_1 = new String[(int)((long)554449359 ^ (long)554449381)];
            if (var7) break block23;
            var3_2 = (int)((long)-133617193 ^ (long)-133617193);
            if (var7) break block23;
            var2_3 = 0rB$1f.XNZw("\u945a\ubdf8\u7eb7\u8318\u945c\ubdd6\u7eea\u83e1\u94a4\ubd81\u7e40\u83c5\u945d\ubde3\u7e9b\u8345\u944d\ubd72\u7e11\u83c4\u94bb\ubd4e\u7ed7\u83f9\u9422\ubdd5\u7e9e\u8318\u9414\ubd48\u7ed4\u8353\u9429\ubdd5\u7ecd\u83bb\u9409\ubd8f\u7e4c\u83f7\u9433\ubdd3\u7ef5\u8357\u9449\ubda9\u7e4c\u8344\u94a9\ubd81\u7ea6\u831d\u9423\ubde0\u7e42\u83b1\u943e\ubd24\u7ea0\u8316\u94a5\ubddf\u7e14\u837a\u947d\ubd49\u7ed7\u83a3\u9463\ubda2\u7ecc\u8364\u9441\ubd66\u7ef2\u836e\u9499\ubd97\u7e63\u838a\u9450\ubddb\u7e9a\u83f8\u94fb\ubd35\u7eb0\u83fd\u942c\ubd34\u7ee3\u836c\u94b5\ubdaa\u7e7d\u83fb\u9436\ubda8\u7e6e\u831a\u9418\ubd26\u7e7d\u8318\u9455\ubdb8\u7e33\u833f\u94e5\ubd1d\u7e0a\u831f\u9430\ubd32\u7e2d\u83a3\u9496\ubda8\u7ecf\u8349\u946d\ubd09\u7edb\u8367\u94ef\ubd9b\u7ec0\u83d9\u94d1\ubd77\u7e85\u8315\u9487\ubdcf\u7e11\u833f\u94fb\ubd20\u7ebc\u834c\u9479\ubd27\u7e1f\u83d1\u94a2\ubd68\u7e1f\u837e\u949d\ubd6c\u7e14\u8367\u94b1\ubd9d\u7e67\u83cc\u94be\ubd82\u7e1c\u8380\u94bc\ubd0f\u7e48\u83f4\u94a7\ubd22\u7eeb\u8335\u947c\ubd1e\u7ed8\u8345\u94cc\ubd8a\u7ee3\u83b3\u9405\ubd29\u7e80\u8397\u9460\ubdaf\u7e27\u836f\u9496\ubd56\u7edc\u83f2\u9448\ubd0e\u7ece\u8364\u9427\ubd5c\u7e82\u8362\u943c\ubd25\u7e45\u83ad\u9474\ubd41\u7e35\u83ca\u94e3\ubd4c\u7ebb\u832c\u94b7\ubd51\u7e63\u8341\u944d\ubdcf\u7ede\u83aa\u9405\ubd95\u7ee7\u833d\u945b\ubd57\u7e50\u8343\u942c\ubd17\u7e23\u8350\u9402\ubd27\u7ed7\u8317\u94ed\ubdb3\u7e7c\u8315\u9467\ubd7b\u7e0a\u83a1\u945e\ubde0\u7e36\u8331\u94d0\ubd70\u7e80\u83df\u94dc\ubd8e\u7ed8\u8315\u9408\ubd18\u7e2e\u83f3\u9438\ubd59\u7e6f\u83e4\u9443\ubd0f\u7eb8\u832b\u942b\ubd0f\u7e96\u83b7\u946e\ubdc0\u7eaa\u838a\u94e4\ubd4c\u7e3c\u8308\u944b\ubd78\u7e37\u8312\u9447\ubd3c\u7e42\u8329\u94a3\ubd81\u7e98\u8397\u9446\ubda9\u7ef8\u830c\u945c\ubdc1\u7e98\u836e\u94ee\ubd81\u7e0c\u83c1\u94f7\ubd50\u7e29\u8378\u945d\ubd85\u7e13\u83fd\u9492\ubd49\u7e4c\u8341\u9405\ubd8e\u7e3a\u8346\u94ff\ubd09\u7e4c\u830a\u940c\ubd53\u7eda\u8347\u9451\ubdab\u7e4c\u836e\u944e\ubd0e\u7e79\u83bc\u94c8\ubdc8\u7e4d\u8350\u940c\ubd11\u7eb4\u8353\u942e\ubd80\u7e14\u836a\u946c\ubd85\u7ebd\u836b\u94e1\ubd90\u7e0e\u831e\u9460\ubd3c\u7e41\u83d8\u94aa\ubd61\u7e97\u8310\u9410\ubd1a\u7e84\u8335\u94f1\ubdf5\u7e08\u83e3\u94ae\ubd67\u7ee2\u83b6\u949d\ubd81\u7eca\u8348\u946f\ubd44\u7ed1\u830c\u9445\ubdbe\u7e14\u835d\u941b\ubd7a\u7ed8\u8383\u94b0\ubdb1\u7eb9\u83aa\u945e\ubde8\u7e83\u8372\u945c\ubd65\u7e1f\u83b7\u94dd\ubd4a\u7e7f\u831c\u94a7\ubdcd\u7ea5\u8365\u94f3\ubdc6\u7e4c\u8379\u94a5\ubd7b\u7e93\u8302\u94fc\ubd39\u7e45\u831c\u9454\ubdd7\u7ead\u8397\u943b\ubd8b\u7e2e\u833e\u9489\ubdb9\u7e8b\u8340\u94f9\ubd90\u7e1e\u83d5\u9462\ubd45\u7e01\u83f7\u94a2\ubd9c\u7e98\u83b4\u9439\ubd8e\u7e5c\u83a7\u94b3\ubda7\u7e40\u83a9\u94a7\ubd2e\u7ec3\u839f\u94b9\ubda6\u7e22\u830f\u94e5\ubd1e\u7ef1\u839c\u94bc\ubdfc\u7e5a\u8313\u945d\ubd80\u7e6b\u83d8\u94a3\ubd0d\u7e61\u830d\u94d2\ubd25\u7e2d\u83fa\u9405\ubd73\u7e11\u838d\u94f6\ubdab\u7ed2\u8306\u94f7\ubd05\u7ec9\u83e0\u947c\ubdd9\u7e5e\u8390\u9490\ubd3e\u7e57\u8347\u9464\ubdc8\u7e69\u836b\u9425\ubde8\u7ea8\u836d\u94fb\ubd06\u7e3a\u831d\u9485\ubd0a\u7e65\u83cd\u94f3\ubd5f\u7ed6\u83b6\u9406\ubd83\u7eb3\u83f5\u9438\ubd4a\u7e4f\u831c\u94c2\ubd23\u7e12\u83fa\u94ab\ubdb9\u7e7d\u835d\u94fe\ubd2c\u7ede\u83f9\u9411\ubd00\u7e19\u8371\u945c\ubd74\u7e02\u8391\u94b9\ubd8f\u7e10\u8390\u9477\ubd43\u7e43\u8368\u9413\ubdde\u7e5d\u8309\u94fb\ubd89\u7ef8\u8331\u947c\ubdad\u7e8d\u8337\u94a3\ubdab\u7e48\u83f1\u948b\ubd97\u7ebc\u837e\u9481\ubd2d\u7ef0\u836d\u94d0\ubda0\u7e91\u832c\u94e7\ubd41\u7e49\u8317\u9455\ubdfb\u7e7e\u8318\u94b1\ubd3d\u7e90\u8327\u9449\ubd95\u7e1e\u8388\u9457\ubdd4\u7e84\u83d5\u9452\ubdac\u7efc\u830d\u94be\ubd8f\u7ec0\u837e\u94ac\ubd5f\u7e8b\u836e\u94c0\ubd34\u7ed2\u8338\u94a7", -369118418);
            var4_4 = var2_3.length();
            if (var7) break block23;
            var1_5 = (int)((long)1033753178 ^ (long)1033753182);
            if (var7) break block23;
            var0_6 = (int)((long)-1550243121 ^ (long)1550243120);
            if (var7) break block23;
            block11: while (!var7) {
                block20: {
                    v0 = (int)((long)-326616284 ^ (long)-326616241);
                    v1 = ++var0_6;
                    v2 = var2_3.substring(v1, v1 + var1_5);
                    v3 = (int)((long)420409032 ^ (long)-420409033);
                    if (9c.\u2006\u200d\u2004\u2007) {
                        throw null;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_1[var3_2++] = v4.intern();
                            if ((var0_6 += var1_5) < var4_4) {
                                var1_5 = var2_3.charAt(var0_6);
                                if (!9c.\u2006\u200d\u2004\u2007) continue block11;
                                throw null;
                            }
                            var2_3 = 0rB$1f.XNZw("\u7175\u589a\u9b9c\u6625\u715d\u5883\u9bb3\u6684\u715b\u58df\u9bd2\u66ea\u7162\u5857\u9b25\u668e", 1415206442);
                            var4_4 = var2_3.length();
                            var1_5 = (int)((long)-1462625772 ^ (long)-1462625764);
                            var0_6 = (int)((long)-2060486538 ^ (long)2060486537);
                            while (true) {
                                v0 = (int)((long)-1646258814 ^ (long)-1646258691);
                                v5 = ++var0_6;
                                v2 = var2_3.substring(v5, v5 + var1_5);
                                v3 = (int)((long)301735324 ^ (long)301735324);
                                if (!9c.\u2006\u200d\u2004\u2007) break block20;
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
                                if (!9c.\u2006\u200d\u2004\u2007) ** continue;
                                throw null;
                            }
                            9c.d = var5_1;
                            9c.e = new String[(int)((long)-1952423935 ^ (long)-1952423893)];
                            if (!9c.\u2006\u200d\u2004\u2007) break block11;
                            throw null;
                        }
                    }
                }
                v6 = v2.toCharArray();
                v7 = v6.length;
                var6_7 = (int)((long)-77502148 ^ (long)-77502148);
                v8 = v0;
                v9 = v6;
                v10 = v7;
                if (v7 > (int)((long)-528257202 ^ (long)-528257201)) ** GOTO lbl107
                do {
                    block21: {
                        v11 = v8;
                        v9 = v9;
                        v12 = v9;
                        v13 = v8;
                        v14 = var6_7;
                        do {
                            switch (var6_7 % (int)((long)-1307902497 ^ (long)-1307902504)) {
                                case 0: {
                                    v15 = (int)((long)-1534129758 ^ (long)-1534129759);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                case 1: {
                                    v15 = (int)((long)-1468094909 ^ (long)-1468094867);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                case 2: {
                                    v15 = (int)((long)1158024035 ^ (long)1158023993);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                case 3: {
                                    v15 = (int)((long)858157407 ^ (long)858157425);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                case 4: {
                                    v15 = (int)((long)2022663795 ^ (long)2022663786);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                case 5: {
                                    v15 = (int)((long)-498559771 ^ (long)-498559861);
                                    if (!9c.\u2006\u200d\u2004\u2007) break;
                                    throw null;
                                }
                                default: {
                                    v15 = (int)((long)1622341216 ^ (long)1622341151);
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
                        } while (!9c.\u2006\u200d\u2004\u2007);
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

    /*
     * Unable to fully structure code
     */
    private static String b(int var0, int var1_1) {
        block265: {
            var9_2 = 9c.\u2006\u200d\u2004\u2007;
            if (var9_2) lbl-1000:
            // 5 sources

            {
                return null;
            }
            var2_3 = (var0 ^ (int)((long)1833038893 ^ (long)-1833034557)) & (int)((long)2080280328 ^ (long)2080272631);
            if (var9_2) ** GOTO lbl-1000
            if (9c.e[var2_3] != null) break block265;
            if (var9_2) ** GOTO lbl-1000
            var3_4 = 9c.d[var2_3].toCharArray();
            if (var9_2) ** GOTO lbl-1000
            switch (var3_4[(int)((long)2025827054 ^ (long)2025827054)] & (int)((long)-1128359256 ^ (long)-1128359337)) {
                case 0: {
                    if (var9_2) ** continue;
                    v0 = (int)((long)-780827439 ^ (long)-780827529);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 1: {
                    v0 = (int)((long)-1833359666 ^ (long)-1833359741);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 2: {
                    v0 = (int)((long)-1442679429 ^ (long)-1442679421);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 3: {
                    v0 = (int)((long)1827676041 ^ (long)1827676002);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 4: {
                    v0 = (int)((long)1407942317 ^ (long)1407942311);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 5: {
                    v0 = (int)((long)-1757023240 ^ (long)-1757023403);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 6: {
                    v0 = (int)((long)-2141527255 ^ (long)-2141527125);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 7: {
                    v0 = (int)((long)1549651309 ^ (long)1549651229);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 8: {
                    v0 = (int)((long)-713134745 ^ (long)-713134720);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 9: {
                    v0 = (int)((long)262419928 ^ (long)262419902);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 10: {
                    v0 = (int)((long)2053805818 ^ (long)2053805791);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 11: {
                    v0 = (int)((long)-388068330 ^ (long)-388068341);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 12: {
                    v0 = (int)((long)1427568751 ^ (long)1427568707);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 13: {
                    v0 = (int)((long)990748028 ^ (long)990747962);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 14: {
                    v0 = (int)((long)-2084198690 ^ (long)-2084198891);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 15: {
                    v0 = (int)((long)-868752626 ^ (long)-868752582);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 16: {
                    v0 = (int)((long)1144677949 ^ (long)1144678049);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 17: {
                    v0 = (int)((long)265765065 ^ (long)265765021);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 18: {
                    v0 = (int)((long)-66079934 ^ (long)-66079767);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 19: {
                    v0 = (int)((long)393358636 ^ (long)393358763);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 20: {
                    v0 = (int)((long)1126486085 ^ (long)1126486135);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 21: {
                    v0 = (int)((long)1771905721 ^ (long)1771905768);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 22: {
                    v0 = (int)((long)-3546546 ^ (long)-3546493);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 23: {
                    v0 = (int)((long)1290188708 ^ (long)1290188652);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 24: {
                    v0 = (int)((long)316621037 ^ (long)316620952);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 25: {
                    v0 = (int)((long)-397973781 ^ (long)-397973888);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 26: {
                    v0 = (int)((long)-1314994848 ^ (long)-1314994775);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 27: {
                    v0 = (int)((long)-1213663363 ^ (long)-1213663406);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 28: {
                    v0 = (int)((long)-1521239937 ^ (long)-1521239936);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 29: {
                    v0 = (int)((long)-1854766701 ^ (long)-1854766763);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 30: {
                    v0 = (int)((long)1902464654 ^ (long)1902464607);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 31: {
                    v0 = (int)((long)-846749935 ^ (long)-846749792);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 32: {
                    v0 = (int)((long)-2094761958 ^ (long)-2094761941);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 33: {
                    v0 = (int)((long)1176633662 ^ (long)1176633666);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 34: {
                    v0 = (int)((long)757867868 ^ (long)757868004);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 35: {
                    v0 = (int)((long)2140759205 ^ (long)2140759077);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 36: {
                    v0 = (int)((long)127047613 ^ (long)127047519);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 37: {
                    v0 = (int)((long)999460021 ^ (long)999459913);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 38: {
                    v0 = (int)((long)-321910833 ^ (long)-321910822);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 39: {
                    v0 = (int)((long)-1264718418 ^ (long)-1264718391);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 40: {
                    v0 = (int)((long)1919033716 ^ (long)1919033737);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 41: {
                    v0 = (int)((long)-1083842523 ^ (long)-1083842539);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 42: {
                    v0 = (int)((long)-72485726 ^ (long)-72485703);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 43: {
                    v0 = (int)((long)-1207231850 ^ (long)-1207231848);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 44: {
                    v0 = (int)((long)-363119577 ^ (long)-363119434);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 45: {
                    v0 = (int)((long)1529906037 ^ (long)1529906117);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 46: {
                    v0 = (int)((long)2104339276 ^ (long)2104339251);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 47: {
                    v0 = (int)((long)-763394934 ^ (long)-763394904);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 48: {
                    v0 = (int)((long)382513870 ^ (long)382513731);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 49: {
                    v0 = (int)((long)651649620 ^ (long)651649713);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 50: {
                    v0 = (int)((long)1256343579 ^ (long)1256343670);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 51: {
                    v0 = (int)((long)-467593457 ^ (long)-467593302);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 52: {
                    v0 = (int)((long)1180874549 ^ (long)1180874703);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 53: {
                    v0 = (int)((long)-1602624129 ^ (long)-1602624208);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 54: {
                    v0 = (int)((long)1260925263 ^ (long)1260925223);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 55: {
                    v0 = (int)((long)-1538002492 ^ (long)-1538002518);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 56: {
                    v0 = (int)((long)2042526879 ^ (long)2042526824);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 57: {
                    v0 = (int)((long)-1032259895 ^ (long)-1032259973);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 58: {
                    v0 = (int)((long)1767690638 ^ (long)1767690538);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 59: {
                    v0 = (int)((long)-1903202843 ^ (long)-1903202961);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 60: {
                    v0 = (int)((long)614166595 ^ (long)614166756);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 61: {
                    v0 = (int)((long)773004155 ^ (long)773004066);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 62: {
                    v0 = (int)((long)-1037314600 ^ (long)-1037314705);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 63: {
                    v0 = (int)((long)-178785033 ^ (long)-178785221);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 64: {
                    v0 = (int)((long)-1845080462 ^ (long)-1845080523);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 65: {
                    v0 = (int)((long)1519479989 ^ (long)1519479817);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 66: {
                    v0 = (int)((long)-1151527327 ^ (long)-1151527370);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 67: {
                    v0 = (int)((long)557921280 ^ (long)557921353);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 68: {
                    v0 = (int)((long)668285827 ^ (long)668285878);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 69: {
                    v0 = (int)((long)455550436 ^ (long)455550284);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 70: {
                    v0 = (int)((long)-1314452427 ^ (long)-1314452306);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 71: {
                    v0 = (int)((long)-1928550426 ^ (long)-1928550641);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 72: {
                    v0 = (int)((long)-17649736 ^ (long)-17649859);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 73: {
                    v0 = (int)((long)-1598113167 ^ (long)-1598113144);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 74: {
                    v0 = (int)((long)226533283 ^ (long)226533372);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 75: {
                    v0 = (int)((long)1425155180 ^ (long)1425155141);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 76: {
                    v0 = (int)((long)1926146128 ^ (long)1926146197);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 77: {
                    v0 = (int)((long)735611129 ^ (long)735610922);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 78: {
                    v0 = (int)((long)-1507186895 ^ (long)-1507186931);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 79: {
                    v0 = (int)((long)1882660308 ^ (long)1882660183);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 80: {
                    v0 = (int)((long)545837723 ^ (long)545837638);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 81: {
                    v0 = (int)((long)-694254928 ^ (long)-694254878);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 82: {
                    v0 = (int)((long)1753606728 ^ (long)1753606735);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 83: {
                    v0 = (int)((long)-1612085831 ^ (long)-1612085971);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 84: {
                    v0 = (int)((long)-723244652 ^ (long)-723244790);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 85: {
                    v0 = (int)((long)2091322383 ^ (long)2091322458);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 86: {
                    v0 = (int)((long)1799905584 ^ (long)1799905602);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 87: {
                    v0 = (int)((long)1983257368 ^ (long)1983257355);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 88: {
                    v0 = (int)((long)-1788144950 ^ (long)-1788145074);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 89: {
                    v0 = (int)((long)-62462144 ^ (long)-62462166);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 90: {
                    v0 = (int)((long)-351341790 ^ (long)-351341661);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 91: {
                    v0 = (int)((long)179968482 ^ (long)179968347);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 92: {
                    v0 = (int)((long)-2041729073 ^ (long)-2041729133);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 93: {
                    v0 = (int)((long)-1635710047 ^ (long)-1635710008);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 94: {
                    v0 = (int)((long)-637941882 ^ (long)-637941891);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 95: {
                    v0 = (int)((long)874002678 ^ (long)874002453);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 96: {
                    v0 = (int)((long)-122056373 ^ (long)-122056351);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 97: {
                    v0 = (int)((long)77745398 ^ (long)77745202);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 98: {
                    v0 = (int)((long)92402833 ^ (long)92402758);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 99: {
                    v0 = (int)((long)-635208712 ^ (long)-635208781);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 100: {
                    v0 = (int)((long)-159718059 ^ (long)-159717942);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 101: {
                    v0 = (int)((long)-218148561 ^ (long)-218148553);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 102: {
                    v0 = (int)((long)960936286 ^ (long)960936366);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 103: {
                    v0 = (int)((long)-1330857613 ^ (long)-1330857569);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 104: {
                    v0 = (int)((long)2046111292 ^ (long)2046111303);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 105: {
                    v0 = (int)((long)769342123 ^ (long)769342190);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 106: {
                    v0 = (int)((long)-2090941675 ^ (long)-2090941673);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 107: {
                    v0 = (int)((long)-1973591806 ^ (long)-1973591766);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 108: {
                    v0 = (int)((long)-327341939 ^ (long)-327342060);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 109: {
                    v0 = (int)((long)-2070467760 ^ (long)-2070467747);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 110: {
                    v0 = (int)((long)703617729 ^ (long)703617691);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 111: {
                    v0 = (int)((long)-1385212727 ^ (long)-1385212712);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 112: {
                    v0 = (int)((long)-2009149613 ^ (long)-2009149480);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 113: {
                    v0 = (int)((long)1011928149 ^ (long)1011928231);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 114: {
                    v0 = (int)((long)-1437717019 ^ (long)-1437717221);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 115: {
                    v0 = (int)((long)-1683179805 ^ (long)-1683179983);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 116: {
                    v0 = (int)((long)1814585618 ^ (long)1814585666);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 117: {
                    v0 = (int)((long)-630218023 ^ (long)-630218145);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 118: {
                    v0 = (int)((long)422366844 ^ (long)422366887);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 119: {
                    v0 = (int)((long)1977931609 ^ (long)1977931757);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 120: {
                    v0 = (int)((long)-1240673952 ^ (long)-1240673854);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 121: {
                    v0 = (int)((long)-782474354 ^ (long)-782474246);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 122: {
                    v0 = (int)((long)-1179603351 ^ (long)-1179603201);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 123: {
                    v0 = (int)((long)2081275866 ^ (long)2081275874);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 124: {
                    v0 = (int)((long)-447174346 ^ (long)-447174244);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 125: {
                    v0 = (int)((long)1481324077 ^ (long)1481324032);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 126: {
                    v0 = (int)((long)824853012 ^ (long)824853129);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 127: {
                    v0 = (int)((long)-213004717 ^ (long)-213004660);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 128: {
                    v0 = (int)((long)-1775650376 ^ (long)-1775650371);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 129: {
                    v0 = (int)((long)2079880152 ^ (long)2079879944);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 130: {
                    v0 = (int)((long)1139934430 ^ (long)1139934417);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 131: {
                    v0 = (int)((long)719165334 ^ (long)719165338);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 132: {
                    v0 = (int)((long)95119612 ^ (long)95119369);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 133: {
                    v0 = (int)((long)1085757613 ^ (long)1085757579);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 134: {
                    v0 = (int)((long)1313690139 ^ (long)1313690243);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 135: {
                    v0 = (int)((long)1931863226 ^ (long)1931863244);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 136: {
                    v0 = (int)((long)-1743600390 ^ (long)-1743600510);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 137: {
                    v0 = (int)((long)-1079503943 ^ (long)-1079504040);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 138: {
                    v0 = (int)((long)2135493616 ^ (long)2135493474);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 139: {
                    v0 = (int)((long)-293041415 ^ (long)-293041489);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 140: {
                    v0 = (int)((long)7355321 ^ (long)7355148);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 141: {
                    v0 = (int)((long)-762692489 ^ (long)-762692357);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 142: {
                    v0 = (int)((long)234592428 ^ (long)234592378);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 143: {
                    v0 = (int)((long)-241207615 ^ (long)-241207724);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 144: {
                    v0 = (int)((long)-275632904 ^ (long)-275633143);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 145: {
                    v0 = (int)((long)-1355782580 ^ (long)-1355782656);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 146: {
                    v0 = (int)((long)826505791 ^ (long)826505819);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 147: {
                    v0 = (int)((long)-1837373841 ^ (long)-1837373924);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 148: {
                    v0 = (int)((long)-998989933 ^ (long)-998989936);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 149: {
                    v0 = (int)((long)-209647657 ^ (long)-209647644);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 150: {
                    v0 = (int)((long)710799406 ^ (long)710799489);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 151: {
                    v0 = (int)((long)-199285087 ^ (long)-199285054);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 152: {
                    v0 = (int)((long)-838659164 ^ (long)-838659250);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 153: {
                    v0 = (int)((long)-855776899 ^ (long)-855776987);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 154: {
                    v0 = (int)((long)1952039540 ^ (long)1952039451);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 155: {
                    v0 = (int)((long)1344957301 ^ (long)1344957365);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 156: {
                    v0 = (int)((long)-682798242 ^ (long)-682798099);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 157: {
                    v0 = (int)((long)-1887536394 ^ (long)-1887536532);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 158: {
                    v0 = (int)((long)274782900 ^ (long)274782874);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 159: {
                    v0 = (int)((long)-2017282389 ^ (long)-2017282421);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 160: {
                    v0 = (int)((long)1095621198 ^ (long)1095621192);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 161: {
                    v0 = (int)((long)1074388809 ^ (long)1074388773);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 162: {
                    v0 = (int)((long)-1415542522 ^ (long)-1415542331);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 163: {
                    v0 = (int)((long)-2095007679 ^ (long)-2095007650);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 164: {
                    v0 = (int)((long)-419159822 ^ (long)-419159840);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 165: {
                    v0 = (int)((long)-1126470823 ^ (long)-1126470781);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 166: {
                    v0 = (int)((long)1852902757 ^ (long)1852902656);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 167: {
                    v0 = (int)((long)458360897 ^ (long)458361069);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 168: {
                    v0 = (int)((long)753554353 ^ (long)753554431);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 169: {
                    v0 = (int)((long)630692138 ^ (long)630692115);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 170: {
                    v0 = (int)((long)-1621448596 ^ (long)-1621448686);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 171: {
                    v0 = (int)((long)-1381300228 ^ (long)-1381300385);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 172: {
                    v0 = (int)((long)899381722 ^ (long)899381588);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 173: {
                    v0 = (int)((long)-2096115435 ^ (long)-2096115435);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 174: {
                    v0 = (int)((long)-1381655548 ^ (long)-1381655331);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 175: {
                    v0 = (int)((long)2137790189 ^ (long)2137790128);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 176: {
                    v0 = (int)((long)-659799286 ^ (long)-659799224);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 177: {
                    v0 = (int)((long)515057587 ^ (long)515057440);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 178: {
                    v0 = (int)((long)-905273651 ^ (long)-905273606);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 179: {
                    v0 = (int)((long)932073142 ^ (long)932072993);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 180: {
                    v0 = (int)((long)-1804503080 ^ (long)-1804503271);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 181: {
                    v0 = (int)((long)-1210739765 ^ (long)-1210739900);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 182: {
                    v0 = (int)((long)-631367116 ^ (long)-631367157);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 183: {
                    v0 = (int)((long)543750333 ^ (long)543750241);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 184: {
                    v0 = (int)((long)-622634146 ^ (long)-622634193);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 185: {
                    v0 = (int)((long)427443162 ^ (long)427443104);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 186: {
                    v0 = (int)((long)-954709612 ^ (long)-954709686);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 187: {
                    v0 = (int)((long)958743358 ^ (long)958743537);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 188: {
                    v0 = (int)((long)-636321909 ^ (long)-636321806);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 189: {
                    v0 = (int)((long)905417032 ^ (long)905417104);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 190: {
                    v0 = (int)((long)1878114217 ^ (long)1878114184);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 191: {
                    v0 = (int)((long)-2069809457 ^ (long)-2069809651);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 192: {
                    v0 = (int)((long)-1263501590 ^ (long)-1263501799);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 193: {
                    v0 = (int)((long)-2114431537 ^ (long)-2114431516);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 194: {
                    v0 = (int)((long)2053262584 ^ (long)2053262360);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 195: {
                    v0 = (int)((long)-2038200965 ^ (long)-2038200895);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 196: {
                    v0 = (int)((long)325853006 ^ (long)325853012);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 197: {
                    v0 = (int)((long)1569635166 ^ (long)1569635077);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 198: {
                    v0 = (int)((long)711173292 ^ (long)711173192);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 199: {
                    v0 = (int)((long)-1971163546 ^ (long)-1971163583);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 200: {
                    v0 = (int)((long)465881412 ^ (long)465881573);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 201: {
                    v0 = (int)((long)-590321425 ^ (long)-590321426);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 202: {
                    v0 = (int)((long)896075011 ^ (long)896075074);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 203: {
                    v0 = (int)((long)-762285545 ^ (long)-762285347);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 204: {
                    v0 = (int)((long)137656376 ^ (long)137656348);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 205: {
                    v0 = (int)((long)272504038 ^ (long)272503819);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 206: {
                    v0 = (int)((long)-314066732 ^ (long)-314066885);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 207: {
                    v0 = (int)((long)1943373364 ^ (long)1943373469);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 208: {
                    v0 = (int)((long)-1068257388 ^ (long)-1068257471);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 209: {
                    v0 = (int)((long)-415858664 ^ (long)-415858608);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 210: {
                    v0 = (int)((long)-1033002712 ^ (long)-1033002698);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 211: {
                    v0 = (int)((long)439913769 ^ (long)439913876);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 212: {
                    v0 = (int)((long)-503688366 ^ (long)-503688378);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 213: {
                    v0 = (int)((long)1861234527 ^ (long)1861234639);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 214: {
                    v0 = (int)((long)-1928064746 ^ (long)-1928064649);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 215: {
                    v0 = (int)((long)1804066867 ^ (long)1804066853);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 216: {
                    v0 = (int)((long)2075665432 ^ (long)2075665499);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 217: {
                    v0 = (int)((long)569384863 ^ (long)569384792);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 218: {
                    v0 = (int)((long)-2142572947 ^ (long)-2142573011);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 219: {
                    v0 = (int)((long)-1140944341 ^ (long)-1140944298);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 220: {
                    v0 = (int)((long)1487835950 ^ (long)1487835954);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 221: {
                    v0 = (int)((long)771748825 ^ (long)771748847);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 222: {
                    v0 = (int)((long)958306005 ^ (long)958306030);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 223: {
                    v0 = (int)((long)2077329702 ^ (long)2077329718);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 224: {
                    v0 = (int)((long)1476388219 ^ (long)1476388159);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 225: {
                    v0 = (int)((long)-1205756258 ^ (long)-1205756267);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 226: {
                    v0 = (int)((long)-1263853061 ^ (long)-1263853297);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 227: {
                    v0 = (int)((long)223148548 ^ (long)223148556);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 228: {
                    v0 = (int)((long)-2003740139 ^ (long)-2003740003);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 229: {
                    v0 = (int)((long)1557917866 ^ (long)1557917796);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 230: {
                    v0 = (int)((long)-916776543 ^ (long)-916776617);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 231: {
                    v0 = (int)((long)-542427610 ^ (long)-542427504);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 232: {
                    v0 = (int)((long)-2102008183 ^ (long)-2102008320);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 233: {
                    v0 = (int)((long)1528482357 ^ (long)1528482326);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 234: {
                    v0 = (int)((long)1281906966 ^ (long)1281907138);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 235: {
                    v0 = (int)((long)298554125 ^ (long)298554294);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 236: {
                    v0 = (int)((long)401631167 ^ (long)401631197);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 237: {
                    v0 = (int)((long)1110178537 ^ (long)1110178375);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 238: {
                    v0 = (int)((long)-530951632 ^ (long)-530951581);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 239: {
                    v0 = (int)((long)1697502406 ^ (long)1697502431);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 240: {
                    v0 = (int)((long)-1353999519 ^ (long)-1353999481);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 241: {
                    v0 = (int)((long)2094717810 ^ (long)2094717740);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 242: {
                    v0 = (int)((long)1990401365 ^ (long)1990401514);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 243: {
                    v0 = (int)((long)1147774594 ^ (long)1147774598);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 244: {
                    v0 = (int)((long)893105406 ^ (long)893105168);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 245: {
                    v0 = (int)((long)-571735279 ^ (long)-571735205);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 246: {
                    v0 = (int)((long)-1623745954 ^ (long)-1623745952);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 247: {
                    v0 = (int)((long)-273637511 ^ (long)-273637565);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 248: {
                    v0 = (int)((long)1853859845 ^ (long)1853859941);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 249: {
                    v0 = (int)((long)-953259807 ^ (long)-953259937);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 250: {
                    v0 = (int)((long)468736070 ^ (long)468736049);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 251: {
                    v0 = (int)((long)1822724816 ^ (long)1822724720);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 252: {
                    v0 = (int)((long)1328214626 ^ (long)1328214645);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 253: {
                    v0 = (int)((long)1147913475 ^ (long)1147913707);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                case 254: {
                    v0 = (int)((long)32398882 ^ (long)32398891);
                    if (!9c.\u2006\u200d\u2004\u2007) break;
                    throw null;
                }
                default: {
                    v0 = (int)((long)-965117173 ^ (long)-965117130);
                }
            }
            if ((var5_6 = (var1_1 & (int)((long)-174226336 ^ (long)-174226273)) - (var4_5 = v0)) < 0) {
                var5_6 += 256;
            }
            if ((var6_7 = ((var1_1 & (int)((long)-92920828 ^ (long)-92873733)) >>> (int)((long)-1750737186 ^ (long)-1750737194)) - var4_5) < 0) {
                var6_7 += 256;
            }
            var7_8 = (int)((long)-269286036 ^ (long)-269286036);
            if (!9c.\u2006\u200d\u2004\u2007) ** GOTO lbl1055
            throw null;
lbl-1000:
            // 1 sources

            {
                var8_9 = var7_8 % (int)((long)-1112805484 ^ (long)-1112805482);
                v1 = var7_8;
                v2 = var3_4;
                v3 = var3_4[v1];
                if (var8_9 == 0) {
                    v2[v1] = (char)(v3 ^ var5_6);
                    var5_6 = ((var5_6 >>> (int)((long)2091073416 ^ (long)2091073419) | var5_6 << (int)((long)831842156 ^ (long)831842153)) ^ var3_4[var7_8]) & (int)((long)880059543 ^ (long)880059496);
                    if (9c.\u2006\u200d\u2004\u2007) {
                        throw null;
                    }
                } else {
                    v2[v1] = (char)(v3 ^ var6_7);
                    var6_7 = ((var6_7 >>> (int)((long)952887151 ^ (long)952887148) | var6_7 << (int)((long)-1210546686 ^ (long)-1210546681)) ^ var3_4[var7_8]) & (int)((long)458617342 ^ (long)458617089);
                }
                ++var7_8;
lbl1055:
                // 2 sources

                ** while (var7_8 < var3_4.length)
            }
lbl1056:
            // 1 sources

            9c.e[var2_3] = new String(var3_4).intern();
        }
        return 9c.e[var2_3];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void 0(IPath iPath, int n2, int n3, Color color) {
        boolean bl2 = \u2006\u200d\u2004\u2007;
        if (bl2) return;
        if (bl2) return;
        bus.r((int)((int)((long)-371763093 ^ (long)-371763096)));
        if (bl2) return;
        if (bl2) return;
        int n4 = (int)((long)423446508 ^ (long)423446508);
        if (bl2) return;
        do {
            float f2;
            if (bl2) return;
            if (n4 >= iPath.length()) {
                bus.J();
                return;
            }
            if (bl2) return;
            if (bl2) return;
            et et2 = iPath.positions().get(n4);
            if (bl2) return;
            if (bl2) return;
            double d2 = 9c.2.aa().p - (double)et2.p();
            if (bl2) return;
            if (bl2) return;
            double d3 = 9c.2.aa().r - (double)et2.r();
            if (bl2) return;
            if (bl2) return;
            float f3 = (float)color.getRed() / 255.0f;
            float f4 = (float)color.getGreen() / 255.0f;
            float f5 = (float)color.getBlue() / 255.0f;
            if (this.1(d2, d3)) {
                f2 = 1.0f;
                if (\u2006\u200d\u2004\u2007) {
                    throw null;
                }
            } else {
                f2 = 0.0f;
            }
            bus.c((float)f3, (float)f4, (float)f5, (float)f2);
            double d4 = d2 + (double)n2;
            double d5 = d3 + (double)n3;
            GL11.glVertex2d((double)(d4 + (double)((float)this.6.2 / 2.0f)), (double)(d5 + (double)((float)this.6.2 / 2.0f)));
            ++n4;
        } while (!\u2006\u200d\u2004\u2007);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean 1(double d2, double d3) {
        boolean bl2 = \u2006\u200d\u2004\u2007;
        if (bl2 || bl2) return true;
        double d4 = d2;
        double d5 = d3;
        if (Math.sqrt(d4 * d4 + d5 * d5) <= (double)this.6.2 / 2.0 - (double)this.6.2 / 50.0) {
            if (bl2) return true;
            return (int)((long)-1614158755 ^ (long)-1614158756) != 0;
        }
        if (!bl2) return (int)((long)-1711369188 ^ (long)-1711369188) != 0;
        return true;
    }

    public 9c() {
        boolean bl2 = \u2006\u200d\u2004\u2007;
        super(9c.b((int)((long)-800465265 ^ (long)800470643), (int)((long)-1473242974 ^ (long)-1473223016)), 9c.b((int)((long)-1142131812 ^ (long)1142135674), (int)((long)-273673427 ^ (long)273661560)));
        String[] stringArray = new String[(int)((long)-1060514967 ^ (long)-1060514965)];
        stringArray[(int)((long)1955885698 ^ (long)1955885698)] = 9c.b((int)((long)-16528749 ^ (long)16523890), (int)((long)137601791 ^ (long)0x8338848));
        stringArray[(int)((long)138251569 ^ (long)138251568)] = 9c.b((int)((long)-757729640 ^ (long)757735013), (int)((long)-275441789 ^ (long)-275422681));
        Object object2 = stringArray;
        1_ _ = (2J)((2J)((2J)this.1().2(9c.b((int)((long)-736591621 ^ (long)736585749), (int)((long)382016899 ^ (long)382028458)))).1(9c.b((int)((long)-1728024080 ^ (long)1728026943), (int)((long)1805080502 ^ (long)-1805072781)))).0(9c.b((int)((long)624259090 ^ (long)-624256784), (int)((long)-1465739891 ^ (long)-1465724093)));
        ((2J)((2J)((2J)this.1().2(9c.b((int)((long)-736591621 ^ (long)736585749), (int)((long)382016899 ^ (long)382028458)))).1(9c.b((int)((long)-1728024080 ^ (long)1728026943), (int)((long)1805080502 ^ (long)-1805072781)))).0(9c.b((int)((long)624259090 ^ (long)-624256784), (int)((long)-1465739891 ^ (long)-1465724093)))).2 = object2;
        this.0a = (0rh)_.0();
        object2 = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)-327134432 ^ (long)327138282), (int)((long)-1181466079 ^ (long)-1181454422)))).1(9c.b((int)((long)938661826 ^ (long)-938655955), (int)((long)18892207 ^ (long)18903636)))).0(9c.b((int)((long)1916546662 ^ (long)-1916549481), (int)((long)-952322212 ^ (long)-952329839)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)-327134432 ^ (long)327138282), (int)((long)-1181466079 ^ (long)-1181454422)))).1(9c.b((int)((long)938661826 ^ (long)-938655955), (int)((long)18892207 ^ (long)18903636)))).0(9c.b((int)((long)1916546662 ^ (long)-1916549481), (int)((long)-952322212 ^ (long)-952329839)))).2 = object2;
        this.1 = (0ri)((2r)_).0();
        object2 = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)19691832 ^ (long)-19689011), (int)((long)-1658903688 ^ (long)-1658909351)))).1(9c.b((int)((long)1816117350 ^ (long)-1816123222), (int)((long)-728511574 ^ (long)728499202)))).0(9c.b((int)((long)-1846821725 ^ (long)1846826090), (int)((long)-1397625766 ^ (long)-1397629114)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)19691832 ^ (long)-19689011), (int)((long)-1658903688 ^ (long)-1658909351)))).1(9c.b((int)((long)1816117350 ^ (long)-1816123222), (int)((long)-728511574 ^ (long)728499202)))).0(9c.b((int)((long)-1846821725 ^ (long)1846826090), (int)((long)-1397625766 ^ (long)-1397629114)))).2 = object2;
        this.0c = (0ri)((2r)((2r)_).0(this.1)).0();
        this.0 = (0rM)((1H)((1H)((1H)((1H)this.2().2(9c.b((int)((long)-1930789422 ^ (long)1930794272), (int)((long)2118664820 ^ (long)2118671567)))).1(9c.b((int)((long)1390421986 ^ (long)-1390424313), (int)((long)-108354507 ^ (long)-108341613)))).0(9c.b((int)((long)-87648266 ^ (long)87654165), (int)((long)-2018947431 ^ (long)2018962909)))).1((int)((long)-583444775 ^ (long)-583444773)).0((int)((long)-1699893696 ^ (long)-1699893681)).0(this.1)).0();
        object2 = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)-1185421313 ^ (long)1185419031), (int)((long)-909632625 ^ (long)-909626176)))).1(9c.b((int)((long)774637526 ^ (long)-774639823), (int)((long)1963637810 ^ (long)1963630096)))).0(9c.b((int)((long)1562093643 ^ (long)-1562099541), (int)((long)1185121621 ^ (long)1185151916)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)-1185421313 ^ (long)1185419031), (int)((long)-909632625 ^ (long)-909626176)))).1(9c.b((int)((long)774637526 ^ (long)-774639823), (int)((long)1963637810 ^ (long)1963630096)))).0(9c.b((int)((long)1562093643 ^ (long)-1562099541), (int)((long)1185121621 ^ (long)1185151916)))).2 = object2;
        this.8 = (0ri)((2r)_).0();
        object2 = Boolean.FALSE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)-1172835497 ^ (long)1172839313), (int)((long)-76038636 ^ (long)-76036273)))).1(9c.b((int)((long)-1629164563 ^ (long)1629160230), (int)((long)1596021228 ^ (long)-1596018679)))).0(9c.b((int)((long)1418157427 ^ (long)-1418152573), (int)((long)786246711 ^ (long)786239381)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)-1172835497 ^ (long)1172839313), (int)((long)-76038636 ^ (long)-76036273)))).1(9c.b((int)((long)-1629164563 ^ (long)1629160230), (int)((long)1596021228 ^ (long)-1596018679)))).0(9c.b((int)((long)1418157427 ^ (long)-1418152573), (int)((long)786246711 ^ (long)786239381)))).2 = object2;
        this.3 = (0ri)((2r)_).0();
        object2 = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)-1551392059 ^ (long)1551387186), (int)((long)-608291831 ^ (long)608275413)))).1(9c.b((int)((long)-688938103 ^ (long)688933745), (int)((long)1575160273 ^ (long)-1575169599)))).0(9c.b((int)((long)-139770483 ^ (long)139767109), (int)((long)571815199 ^ (long)571805540)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)-1551392059 ^ (long)1551387186), (int)((long)-608291831 ^ (long)608275413)))).1(9c.b((int)((long)-688938103 ^ (long)688933745), (int)((long)1575160273 ^ (long)-1575169599)))).0(9c.b((int)((long)-139770483 ^ (long)139767109), (int)((long)571815199 ^ (long)571805540)))).2 = object2;
        this.5 = (0ri)((2r)_).0();
        object2 = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)-1823117576 ^ (long)1823114815), (int)((long)-1047472757 ^ (long)1047462162)))).1(9c.b((int)((long)1965074592 ^ (long)-1965080486), (int)((long)-574837243 ^ (long)574828562)))).0(9c.b((int)((long)-1388055661 ^ (long)1388059488), (int)((long)1013903915 ^ (long)1013880809)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)-1823117576 ^ (long)1823114815), (int)((long)-1047472757 ^ (long)1047462162)))).1(9c.b((int)((long)1965074592 ^ (long)-1965080486), (int)((long)-574837243 ^ (long)574828562)))).0(9c.b((int)((long)-1388055661 ^ (long)1388059488), (int)((long)1013903915 ^ (long)1013880809)))).2 = object2;
        this.4 = (0ri)((2r)_).0();
        object2 = Boolean.TRUE;
        _ = (2r)((2r)((2r)this.5().2(9c.b((int)((long)537736543 ^ (long)-537731659), (int)((long)-1841582288 ^ (long)-1841592007)))).1(9c.b((int)((long)482329866 ^ (long)-482333215), (int)((long)-14933291 ^ (long)-14926020)))).0(9c.b((int)((long)695532862 ^ (long)-695527992), (int)((long)1143100495 ^ (long)1143087974)));
        ((2r)((2r)((2r)this.5().2(9c.b((int)((long)537736543 ^ (long)-537731659), (int)((long)-1841582288 ^ (long)-1841592007)))).1(9c.b((int)((long)482329866 ^ (long)-482333215), (int)((long)-14933291 ^ (long)-14926020)))).0(9c.b((int)((long)695532862 ^ (long)-695527992), (int)((long)1143100495 ^ (long)1143087974)))).2 = object2;
        this.0b = (0ri)((2r)_).0();
        object2 = (int)((long)-1672497922 ^ (long)-1672497995);
        _ = ((1H)((1H)((1H)this.2().2(9c.b((int)((long)-1323018976 ^ (long)1323023835), (int)((long)-1122626013 ^ (long)1122620791)))).1(9c.b((int)((long)1622829800 ^ (long)-1622834671), (int)((long)1428331271 ^ (long)1428327361)))).0(9c.b((int)((long)2090509926 ^ (long)-2090512750), (int)((long)-542147312 ^ (long)542161223)))).1((int)((long)-1267012715 ^ (long)-1267012724)).0((int)((long)61739726 ^ (long)61739690));
        ((1_)((1H)((1H)((1H)this.2().2(9c.b((int)((long)-1323018976 ^ (long)1323023835), (int)((long)-1122626013 ^ (long)1122620791)))).1(9c.b((int)((long)1622829800 ^ (long)-1622834671), (int)((long)1428331271 ^ (long)1428327361)))).0(9c.b((int)((long)2090509926 ^ (long)-2090512750), (int)((long)-542147312 ^ (long)542161223)))).1((int)((long)-1267012715 ^ (long)-1267012724)).0((int)((long)61739726 ^ (long)61739690))).2 = object2;
        this.0d = (0rM)((1H)_).0();
        object2 = (int)((long)-1752640582 ^ (long)-1752640546);
        _ = ((1H)((1H)((1H)this.2().2(9c.b((int)((long)-910171850 ^ (long)910166520), (int)((long)292105996 ^ (long)292108984)))).1(9c.b((int)((long)1396511515 ^ (long)-1396507675), (int)((long)-1614299436 ^ (long)-1614299128)))).0(9c.b((int)((long)-940434044 ^ (long)940438889), (int)((long)1012220148 ^ (long)1012224407)))).1((int)((long)32236563 ^ (long)32236632)).0((int)((long)1066830244 ^ (long)1066830297));
        ((1_)((1H)((1H)((1H)this.2().2(9c.b((int)((long)-910171850 ^ (long)910166520), (int)((long)292105996 ^ (long)292108984)))).1(9c.b((int)((long)1396511515 ^ (long)-1396507675), (int)((long)-1614299436 ^ (long)-1614299128)))).0(9c.b((int)((long)-940434044 ^ (long)940438889), (int)((long)1012220148 ^ (long)1012224407)))).1((int)((long)32236563 ^ (long)32236632)).0((int)((long)1066830244 ^ (long)1066830297))).2 = object2;
        this.6 = (0rM)((1H)_).0();
        object2 = 1.0;
        _ = ((1H)((1H)((1H)this.3().2(9c.b((int)((long)419568742 ^ (long)-419564414), (int)((long)2064234848 ^ (long)-2064230824)))).1(9c.b((int)((long)1400661062 ^ (long)-1400664949), (int)((long)1801037895 ^ (long)1801028344)))).0(9c.b((int)((long)-399131513 ^ (long)399135854), (int)((long)42401234 ^ (long)42396549)))).1(0.1).0(2.0);
        ((1_)((1H)((1H)((1H)this.3().2(9c.b((int)((long)419568742 ^ (long)-419564414), (int)((long)2064234848 ^ (long)-2064230824)))).1(9c.b((int)((long)1400661062 ^ (long)-1400664949), (int)((long)1801037895 ^ (long)1801028344)))).0(9c.b((int)((long)-399131513 ^ (long)399135854), (int)((long)42401234 ^ (long)42396549)))).1(0.1).0(2.0)).2 = object2;
        this.7 = (0rQ)((1H)_).0();
        this.9 = new Listener<5D>(object -> {
            block25: {
                int n2;
                block23: {
                    float f2;
                    Object object2;
                    int n3;
                    int n4;
                    int n5;
                    String[] stringArray;
                    block26: {
                        Settings settings;
                        IPathingBehavior iPathingBehavior;
                        block31: {
                            double d2;
                            double d3;
                            block33: {
                                block32: {
                                    float f3;
                                    block30: {
                                        block28: {
                                            block29: {
                                                block24: {
                                                    boolean bl2;
                                                    block27: {
                                                        bl2 = \u2006\u200d\u2004\u2007;
                                                        if (bl2) break block24;
                                                        String[] stringArray2 = 7b.0();
                                                        23.0(this, 9c.b((int)((long)1995221208 ^ (long)-1995227097), (int)((long)-1996611712 ^ (long)-1996606978)), this.0a.1());
                                                        stringArray = stringArray2;
                                                        if (bl2 || bl2) break block24;
                                                        if (9c.2.t.ax) break block25;
                                                        if (bl2 || bl2) break block24;
                                                        object = 1A.1;
                                                        if (bl2 || bl2) break block24;
                                                        n5 = (int)((double)this.6.2 * 0.425);
                                                        if (bl2 || bl2) break block24;
                                                        n4 = (int)((long)-1169952 ^ (long)-1169948) + this.6.2 / (int)((long)-486605007 ^ (long)-486605005);
                                                        if (bl2 || bl2) break block24;
                                                        n3 = (int)((long)977791630 ^ (long)977791626) + this.6.2 / (int)((long)1021799711 ^ (long)1021799709);
                                                        if (bl2 || bl2) break block24;
                                                        int n6 = (int)((double)this.0d.2 * 2.55);
                                                        if (bl2 || bl2) break block24;
                                                        1A.0(4.0f, 4.0f, (int)((long)494025834 ^ (long)494025838) + this.6.2, (int)((long)101243395 ^ (long)101243399) + this.6.2, 1.0f, 2w.0((int)((long)-1927561525 ^ (long)-1927561525), (int)((long)171605354 ^ (long)171605354), (int)((long)1457944969 ^ (long)1457944969), n6), 2w.0((int)((long)-1898034295 ^ (long)-1898034282), (int)((long)-1456748865 ^ (long)-1456748896), (int)((long)-501519486 ^ (long)-501519459), n6));
                                                        if (bl2 || bl2) break block24;
                                                        bus.G();
                                                        if (bl2 || bl2) break block24;
                                                        1A.0((boolean)((long)-1684406826 ^ (long)-1684406825));
                                                        if (bl2 || bl2) break block24;
                                                        5b[] bArray = new 5b[(int)((long)-617024675 ^ (long)-617024676)];
                                                        bArray[(int)((long)388004713 ^ (long)388004713)] = 5b.c;
                                                        1A.0(bArray);
                                                        if (bl2 || bl2) break block24;
                                                        9c.2.f.e.forEach(arg_0 -> this.0((int)((long)1046866543 ^ (long)1046866539), (int)((long)-1221786651 ^ (long)-1221786655), n4, n3, arg_0));
                                                        if (bl2 || bl2) break block24;
                                                        bus.d((float)1.0f);
                                                        if (bl2 || bl2) break block24;
                                                        if (!this.1.0) break block26;
                                                        if (bl2 || bl2) break block24;
                                                        iPathingBehavior = BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior();
                                                        if (bl2 || bl2) break block24;
                                                        bus.G();
                                                        if (bl2 || bl2) break block24;
                                                        if (!this.0c.0) break block27;
                                                        if (bl2 || bl2) break block24;
                                                        GL11.glEnable((int)((int)((long)1449479829 ^ (long)1449477553)));
                                                        if (bl2 || bl2) break block24;
                                                        GL11.glLineStipple((int)this.0.2, (short)((long)222293313 ^ (long)-222279701));
                                                        if (bl2) break block24;
                                                    }
                                                    if (bl2) break block24;
                                                    if (((String)this.0a.1()).equals(9c.b((int)((long)-1129666068 ^ (long)1129660672), (int)((long)1954959993 ^ (long)1954940418)))) break block28;
                                                    if (!bl2) break block29;
                                                }
                                                return;
                                            }
                                            f3 = -9c.2.aa().v;
                                            if (\u2006\u200d\u2004\u2007) {
                                                throw null;
                                            }
                                            break block30;
                                        }
                                        f3 = -180.0f;
                                    }
                                    1t.0(f3, n4, n3);
                                    settings = BaritoneAPI.getSettings();
                                    if (4F.0()) {
                                        IPathExecutor iPathExecutor;
                                        object2 = iPathingBehavior.getCurrent();
                                        if (object2 != null && object2.getPath() != null) {
                                            this.0(object2.getPath(), (int)((long)811048380 ^ (long)811048376), (int)((long)-1026917377 ^ (long)-1026917381), (Color)settings.colorCurrentPath.value);
                                        }
                                        if ((iPathExecutor = iPathingBehavior.getNext()) != null && iPathExecutor.getPath() != null) {
                                            this.0(iPathExecutor.getPath(), (int)((long)-1037283686 ^ (long)-1037283682), (int)((long)1305183191 ^ (long)1305183187), (Color)settings.colorNextPath.value);
                                        }
                                    }
                                    if (!((object2 = iPathingBehavior.getGoal()) instanceof IGoalRenderPos) && !(object2 instanceof GoalXZ)) break block31;
                                    if (!(object2 instanceof IGoalRenderPos)) break block32;
                                    IGoalRenderPos iGoalRenderPos = (IGoalRenderPos)object2;
                                    d3 = 9c.2.aa().p - (double)iGoalRenderPos.getGoalPos().p() - 0.5;
                                    d2 = 9c.2.aa().r - (double)iGoalRenderPos.getGoalPos().r() - 0.5;
                                    if (stringArray != null) break block33;
                                }
                                d3 = 9c.2.aa().p - (double)((GoalXZ)object2).getX() - 0.5;
                                d2 = 9c.2.aa().r - (double)((GoalXZ)object2).getZ() - 0.5;
                            }
                            if (this.1(d3, d2)) {
                                float f4;
                                double d4 = d3 + 4.0 + (double)((float)this.6.2 / 2.0f);
                                double d5 = d2 + 4.0 + (double)((float)this.6.2 / 2.0f);
                                if (!((String)this.0a.1()).equals(9c.b((int)((long)1979882616 ^ (long)-1979878252), (int)((long)41874103 ^ (long)41854668)))) {
                                    f4 = 9c.2.aa().v + 180.0f;
                                    if (\u2006\u200d\u2004\u2007) {
                                        throw null;
                                    }
                                } else {
                                    f4 = 0.0f;
                                }
                                1t.0(f4 + 180.0f, d4, d5);
                                object2 = (Color)settings.colorGoalBox.value;
                                bus.c((float)((float)((Color)object2).getRed() / 255.0f), (float)((float)((Color)object2).getGreen() / 255.0f), (float)((float)((Color)object2).getBlue() / 255.0f), (float)1.0f);
                                this.0(d4, d5);
                            }
                        }
                        iPathingBehavior.getInProgress().ifPresent(arg_0 -> this.0((int)((long)-1844193620 ^ (long)-1844193624), (int)((long)1095412302 ^ (long)0x414AAA4A), settings, arg_0));
                        if (this.0c.0) {
                            GL11.glDisable((int)((int)((long)1386755516 ^ (long)1386757784)));
                        }
                        bus.H();
                    }
                    bus.d((float)1.0f, (float)1.0f, (float)1.0f);
                    bus.G();
                    if (((String)this.0a.1()).equals(9c.b((int)((long)-559893048 ^ (long)559897892), (int)((long)-203707370 ^ (long)-203687827)))) {
                        f2 = 9c.2.aa().v;
                        if (\u2006\u200d\u2004\u2007) {
                            throw null;
                        }
                    } else {
                        f2 = 180.0f;
                    }
                    1t.0(f2, n4, n3);
                    object.addVertex(n4, n3 + (int)((long)1551619642 ^ (long)1551619641), 0.0f).addVertex((float)n4 + 1.5f, n3 - (int)((long)-1756199765 ^ (long)-1756199768), 0.0f).addVertex((float)n4 - 1.5f, n3 - (int)((long)-1581239199 ^ (long)-1581239198), 0.0f).draw((int)((long)-1404472058 ^ (long)-1404472049));
                    bus.H();
                    bus.G();
                    bus.y();
                    String[] stringArray3 = new String[(int)((long)1506496329 ^ (long)1506496333)];
                    stringArray3[(int)((long)-1598839739 ^ (long)-1598839739)] = 0rB$1f.XNZw("\u384e", -1616896138);
                    stringArray3[(int)((long)1807601092 ^ (long)1807601093)] = 0rB$1f.XNZw("\u1173", -372033984);
                    stringArray3[(int)((long)-960192878 ^ (long)-960192880)] = 0rB$1f.XNZw("\u1e3b", -377276130);
                    stringArray3[(int)((long)-931590000 ^ (long)-931589997)] = 0rB$1f.XNZw("\u2631", 433127696);
                    String[] stringArray4 = stringArray3;
                    for (int i2 = (int)((long)-796045636 ^ (long)-796045636); i2 < (int)((long)-689859824 ^ (long)-689859820); ++i2) {
                        object2 = stringArray4[i2];
                        double d6 = (float)(i2 - (int)((long)-1910740394 ^ (long)-1910740393)) * 90.0f;
                        n2 = ((String)this.0a.1()).equals(9c.b((int)((long)-2135491829 ^ (long)2135495655), (int)((long)1961259298 ^ (long)1961239897))) ? 1 : 0;
                        if (stringArray != null) {
                            if (n2 == 0) {
                                d6 = d6 - (double)9c.2.aa().v - 180.0;
                            }
                            9c.2.k.a((String)object2, (float)n4 + (float)n5 * rk.b((float)((float)Math.toRadians(d6))), (float)n3 + (float)n5 * rk.a((float)((float)Math.toRadians(d6))) - (float)9c.2.k.a / 2.0f, (int)((long)-185450760 ^ (long)185450759));
                            if (stringArray != null) continue;
                        }
                        break block23;
                    }
                    bus.H();
                    1A.0();
                    n2 = (int)((long)1145392406 ^ (long)1145392406);
                }
                1A.0(n2 != 0);
                bus.H();
            }
        }, new Predicate[(int)((long)1942224652 ^ (long)1942224652)]);
    }
}

