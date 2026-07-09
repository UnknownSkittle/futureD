/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  rk
 *  vb
 *  vp
 */
package net.impactclient;

import baritone.api.BaritoneAPI;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.RotationMoveEvent$Type;
import net.impactclient.0T;
import net.impactclient.0n;
import net.impactclient.4b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 57
implements 0T {
    public static final boolean \u2002\u200e;

    /*
     * Enabled aggressive block sorting
     */
    public static double[] 0(double d2, double d3, double d4, float f2) {
        double d5;
        double d6;
        block21: {
            block22: {
                double d7;
                int n2;
                double d8;
                block23: {
                    block19: {
                        boolean bl2;
                        block20: {
                            bl2 = \u2002\u200e;
                            if (bl2 || bl2) break block19;
                            d6 = 0.0;
                            if (bl2) return null;
                            if (bl2) break block19;
                            d5 = 0.0;
                            if (bl2) return null;
                            if (bl2) break block19;
                            if (d3 != 0.0) break block20;
                            if (bl2) break block19;
                            if (d4 == 0.0) break block21;
                            if (bl2) break block19;
                        }
                        if (bl2) break block19;
                        if (d3 == 0.0) break block22;
                        if (!bl2 && !bl2) break block23;
                    }
                    return null;
                }
                double d9 = f2;
                if (d4 > 0.0) {
                    d8 = 1.0;
                    if (\u2002\u200e) {
                        throw null;
                    }
                } else if (d4 < 0.0) {
                    d8 = -1.0;
                    if (\u2002\u200e) {
                        throw null;
                    }
                } else {
                    d8 = 0.0;
                }
                if (d3 > 0.0) {
                    n2 = (int)((long)133536055 ^ (long)-133536028);
                    if (\u2002\u200e) {
                        throw null;
                    }
                } else {
                    n2 = (int)((long)-362696238 ^ (long)-362696193);
                }
                f2 = (float)(d9 + d8 * (double)n2);
                if (d3 > 0.0) {
                    d7 = 1.0;
                    if (\u2002\u200e) {
                        throw null;
                    }
                } else if (d3 < 0.0) {
                    d7 = -1.0;
                    if (\u2002\u200e) {
                        throw null;
                    }
                } else {
                    d7 = 0.0;
                }
                d3 = d7;
                d4 = 0.0;
            }
            f2 = (float)Math.toRadians(f2 + 90.0f);
            d6 = d3 * d2 * (double)rk.b((float)f2) + d4 * d2 * (double)rk.a((float)f2);
            d5 = d3 * d2 * (double)rk.a((float)f2) - d4 * d2 * (double)rk.b((float)f2);
        }
        double[] dArray = new double[(int)((long)1010082226 ^ (long)1010082224)];
        dArray[(int)((long)1581059268 ^ (long)1581059268)] = d6;
        dArray[(int)((long)-1401841424 ^ (long)-1401841423)] = d5;
        return dArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double 0() {
        double d2;
        double d3;
        block3: {
            block2: {
                boolean bl2 = \u2002\u200e;
                if (bl2 || bl2) break block2;
                d3 = 57.2.h.p - 57.2.h.m;
                if (bl2 || bl2) break block2;
                d2 = 57.2.h.r - 57.2.h.o;
                if (!bl2 && !bl2) break block3;
            }
            return 0.0;
        }
        double d4 = d3;
        double d5 = d2;
        return Math.sqrt(d4 * d4 + d5 * d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(4b b2, double d2) {
        block3: {
            block2: {
                double d3;
                boolean bl2 = \u2002\u200e;
                if (bl2 || bl2) break block2;
                double[] dArray = 57.0(d2);
                if (bl2 || bl2) break block2;
                v0.1 = d3 = dArray[(int)((long)1073423882 ^ (long)1073423882)];
                if (bl2 || bl2) break block2;
                b2.0 = dArray[(int)((long)91890078 ^ (long)91890079)];
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public static double 0(0n n2) {
        boolean bl2 = \u2002\u200e;
        if (bl2 || bl2) {
            return 0.0;
        }
        return 57.0(n2, (vp)57.2.h, (boolean)((long)-497942224 ^ (long)-497942223));
    }

    public static double 1(0n n2) {
        boolean bl2 = \u2002\u200e;
        if (bl2 || bl2) {
            return 0.0;
        }
        return 57.0(n2, (vp)57.2.h, (boolean)((long)23897643 ^ (long)23897643));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double[] 0(double d2) {
        RotationMoveEvent rotationMoveEvent;
        block3: {
            block2: {
                boolean bl2 = \u2002\u200e;
                if (bl2 || bl2) break block2;
                rotationMoveEvent = new RotationMoveEvent(RotationMoveEvent$Type.JUMP, 57.2.h.v);
                if (bl2 || bl2) break block2;
                BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onPlayerRotationMove(rotationMoveEvent);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return 57.0(d2, 57.2.h.bg, 57.2.h.be, rotationMoveEvent.getYaw());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double 0(0n n2, vp vp2, boolean bl2) {
        double d2;
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    bl3 = \u2002\u200e;
                    if (bl3 || bl3) break block2;
                    d2 = n2.c;
                    if (bl3 || bl3) break block2;
                    if (!bl2) break block3;
                    if (bl3 || bl3) break block2;
                    n2 = vp2.b(vb.a);
                    if (n2 == null) break block3;
                    if (bl3 || bl3) break block2;
                    int n3 = n2.c();
                    if (bl3 || bl3) break block2;
                    d2 *= 1.0 + 0.2 * (double)(n3 + (int)((long)-1825808431 ^ (long)-1825808432));
                    if (bl3) break block2;
                }
                if (!bl3) break block4;
            }
            return 0.0;
        }
        return d2;
    }
}

