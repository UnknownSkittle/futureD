/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 *  bus
 *  rk
 */
package net.impactclient;

import java.util.Optional;
import net.impactclient.0Y;
import net.impactclient.0af;
import net.impactclient.0v;
import net.impactclient.1A;
import net.impactclient.2w;
import net.impactclient.4c;
import pw.knx.feather.animate.TickAnimation;
import pw.knx.feather.animate.TimeAnimation;
import pw.knx.feather.animate.Transition;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 6K
implements 4c {
    public static final boolean \u2006\u200b\u200d;
    private 0af 2;
    private boolean 1;
    private TickAnimation 0;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 0(bip bip2, boolean bl2, float f2, float f3, float f4) {
        block5: {
            block2: {
                boolean bl3;
                block4: {
                    block3: {
                        bl3 = \u2006\u200b\u200d;
                        if (bl3 || bl3) break block2;
                        if (!Optional.ofNullable(this.2).map(0af::0).orElse(Boolean.FALSE).booleanValue()) break block3;
                        if (bl3 || bl3) break block2;
                        1A.0(f2 - 0.5f, 0.5f, f2 - 2.0f, (float)(bip2.a + (int)((long)-1225844856 ^ (long)-1225844854)) - 0.5f, (int)((long)-801235120 ^ (long)408731028));
                        if (bl3) break block2;
                    }
                    if (bl3) break block2;
                    if (!(this.0.get() > 0.0)) break block4;
                    if (bl3 || bl3) break block2;
                    Optional.ofNullable(this.2).ifPresent(af2 -> {
                        block5: {
                            block2: {
                                boolean bl2;
                                block4: {
                                    boolean bl3;
                                    block3: {
                                        bl2 = \u2006\u200b\u200d;
                                        if (bl2 || bl2) break block2;
                                        bus.G();
                                        if (bl2 || bl2) break block2;
                                        bus.c((float)(f2 + 2.0f), (float)(-f3), (float)0.0f);
                                        if (bl2 || bl2) break block2;
                                        bl3 = this.0.isRunning();
                                        if (!bl3) break block3;
                                        if (bl2 || bl2) break block2;
                                        f3 = af2.1(bip2);
                                        if (bl2 || bl2) break block2;
                                        float f5 = af2.0(bip2);
                                        if (bl2 || bl2) break block2;
                                        float f6 = f3;
                                        float f7 = f5;
                                        f3 = rk.c((float)(f6 * f6 + f7 * f7)) * (float)this.0.get();
                                        if (bl2 || bl2) break block2;
                                        2w.3();
                                        if (bl2 || bl2) break block2;
                                        1A.0(f3);
                                        if (bl2 || bl2) break block2;
                                        2w.4();
                                        if (bl2) break block2;
                                    }
                                    if (bl2) break block2;
                                    af2.0(bip2, f4);
                                    if (bl2 || bl2) break block2;
                                    if (!bl3) break block4;
                                    if (bl2 || bl2) break block2;
                                    2w.1();
                                    if (bl2) break block2;
                                }
                                if (bl2) break block2;
                                bus.H();
                                if (!bl2 && !bl2) break block5;
                            }
                            return;
                        }
                    });
                    if (bl3) break block2;
                }
                if (!bl3) break block5;
            }
            return;
        }
    }

    @Override
    public final float 0(bip bip2) {
        boolean bl2 = \u2006\u200b\u200d;
        if (bl2 || bl2) {
            return 0.0f;
        }
        return bip2.a + (int)((long)802252192 ^ (long)802252194);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean 0(0v v2) {
        boolean bl2 = \u2006\u200b\u200d;
        if (bl2) return true;
        if (bl2) return true;
        this.0.get();
        if (bl2) return true;
        if (bl2) return true;
        if (this.1) {
            if (bl2) return true;
            if (Optional.ofNullable(this.2).map(af2 -> {
                boolean bl2 = \u2006\u200b\u200d;
                if (bl2 || bl2) {
                    return null;
                }
                return af2.0(v2);
            }).orElse(Boolean.FALSE).booleanValue()) {
                if (bl2) return true;
                if (bl2) return true;
                return (int)((long)44572586 ^ (long)44572587) != 0;
            }
        }
        if (bl2) return true;
        if (Optional.ofNullable(this.2).map(0af::0).orElse(Boolean.FALSE).booleanValue()) {
            if (bl2) return true;
            if (bl2) return true;
            switch (0Y.0[v2.ordinal()]) {
                case 1: {
                    if (bl2) return true;
                    if (this.1) {
                        if (bl2) return true;
                        if (bl2) return true;
                        this.0.reverse().play();
                        if (bl2) return true;
                        if (bl2) return true;
                        this.1 = (int)((long)-671588213 ^ (long)-671588213);
                        if (bl2) return true;
                        if (bl2) return true;
                        return (int)((long)-505408576 ^ (long)-505408575) != 0;
                    }
                    if (bl2) return true;
                    return (int)((long)1878597461 ^ (long)1878597461) != 0;
                }
                case 2: {
                    if (bl2) return true;
                    if (!this.1) {
                        if (bl2) return true;
                        if (bl2) return true;
                        this.0.forward().play();
                        if (bl2) return true;
                        if (bl2) return true;
                        this.1 = (int)((long)-1974470743 ^ (long)-1974470744);
                        if (bl2) return true;
                        if (bl2) return true;
                        return (int)((long)-718674063 ^ (long)-718674064) != 0;
                    }
                    if (bl2) return true;
                    return (int)((long)1212695295 ^ (long)1212695295) != 0;
                }
            }
        }
        if (bl2) return true;
        return (int)((long)798345378 ^ (long)798345378) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(0af af2) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200b\u200d;
                if (bl2 || bl2) break block2;
                this.2 = af2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 6K() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u200b\u200d;
                if (bl2 || bl2) break block2;
                this.0 = new TimeAnimation().setDuration((int)((long)1607117702 ^ (long)1607117646)).setTransition(Transition.INVERSE_CURVE).forward();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

