/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 *  bus
 *  rk
 */
package net.impactclient;

import java.util.Iterator;
import net.impactclient.1A;
import net.impactclient.3X;
import net.impactclient.4c;
import net.impactclient.5u;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 30
extends 3X {
    public static final boolean \u2006\u2005\u2003\u2001\u2001;
    private 5u 3;
    private 5u 5;
    private final 5u 4;

    /*
     * Enabled aggressive block sorting
     */
    private float 0(bip bip2, int n2) {
        float f2;
        block5: {
            boolean bl2 = \u2006\u2005\u2003\u2001\u2001;
            if (!bl2 && !bl2) {
                n2 = rk.a((int)n2, (int)((int)((long)-9433673 ^ (long)-9433673)), (int)(((3X)this).3.size() - (int)((long)-1562796323 ^ (long)-1562796324)));
                if (!bl2 && !bl2) {
                    f2 = 0.0f;
                    if (bl2) return 0.0f;
                    if (!bl2) {
                        int n3 = (int)((long)1908792489 ^ (long)1908792489);
                        if (bl2) return 0.0f;
                        while (!bl2) {
                            if (n3 < n2) {
                                if (bl2 || bl2) break;
                                f2 += ((3X)this).3.get(n3).0(bip2);
                                if (bl2 || bl2) break;
                                ++n3;
                                if (bl2) break;
                                if (!\u2006\u2005\u2003\u2001\u2001) continue;
                                throw null;
                            }
                            if (!bl2) break block5;
                        }
                    }
                }
            }
            return 0.0f;
        }
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2, float f2) {
        String[] stringArray;
        4c c2;
        float f3;
        float f4;
        block30: {
            block26: {
                float f5;
                float f6;
                int n2;
                float f7;
                block29: {
                    block27: {
                        block28: {
                            boolean bl2 = \u2006\u2005\u2003\u2001\u2001;
                            if (bl2 || bl2) return;
                            f4 = this.1(bip2);
                            if (bl2) return;
                            String[] stringArray2 = 7b.0();
                            f3 = this.0(bip2);
                            c2 = this.3().orElse(null);
                            1A.0(0.0f, 0.0f, f4, f3, (int)((long)-880534260 ^ (long)1687161112));
                            f7 = 0.0f;
                            float f8 = 0.0f;
                            Iterator<4c> iterator = ((3X)this).3.iterator();
                            stringArray = stringArray2;
                            if (bl2) return;
                            while (!bl2) {
                                boolean bl3;
                                if (iterator.hasNext()) {
                                    if (bl2) return;
                                    4c c3 = iterator.next();
                                    bl3 = c3.equals(c2);
                                    if (stringArray != null) {
                                        if (bl3) {
                                            if (bl2 || bl2) return;
                                            f8 = f7 + c3.0(bip2);
                                            if (bl2 || bl2) return;
                                            if (stringArray == null) {
                                                if (bl2) return;
                                            }
                                        } else {
                                            if (bl2) return;
                                            f7 += c3.0(bip2);
                                            if (bl2 || bl2) return;
                                            if (stringArray != null) continue;
                                            if (bl2) return;
                                        }
                                    }
                                } else {
                                    if (bl2) return;
                                    this.4.0(f7, f8, f2);
                                    if (bl2 || bl2) return;
                                    bl3 = this.1;
                                }
                                if (!bl3) break block26;
                                if (bl2) return;
                                if (this.0 == this.2) break block26;
                                if (bl2 || bl2) return;
                                if (this.0 <= this.2) break block27;
                                if (!bl2) break block28;
                            }
                            return;
                        }
                        n2 = (int)((long)-219480918 ^ (long)-219480917);
                        if (\u2006\u2005\u2003\u2001\u2001) {
                            throw null;
                        }
                        break block29;
                    }
                    n2 = (int)((long)1322665644 ^ (long)1322665644);
                }
                int n3 = n2;
                float f9 = this.0(bip2, (int)((long)-246884102 ^ (long)-246884101));
                f7 = this.0(bip2, ((3X)this).3.size());
                if (this.5 == null || this.3 == null) {
                    float f10;
                    float f11;
                    if (n3 != 0) {
                        f11 = f7;
                        if (\u2006\u2005\u2003\u2001\u2001) {
                            throw null;
                        }
                    } else {
                        f11 = f3;
                    }
                    this.5 = new 5u(f11, f3);
                    if (n3 != 0) {
                        f10 = 0.0f;
                        if (\u2006\u2005\u2003\u2001\u2001) {
                            throw null;
                        }
                    } else {
                        f10 = f9;
                    }
                    this.3 = new 5u(0.0f, f10);
                }
                if (n3 != 0) {
                    f6 = f9;
                    if (\u2006\u2005\u2003\u2001\u2001) {
                        throw null;
                    }
                } else {
                    f6 = 0.0f;
                }
                if (!this.3.0(0.0f, f6, f2) || n3 != 0) {
                    this.3.0(f4);
                }
                if (n3 != 0) {
                    f5 = f3;
                    if (\u2006\u2005\u2003\u2001\u2001) {
                        throw null;
                    }
                } else {
                    f5 = f7;
                }
                if (!this.5.0(f5, f3, f2) || n3 == 0) {
                    this.5.0(f4);
                }
                if (\u2006\u2005\u2003\u2001\u2001) {
                    throw null;
                }
                break block30;
            }
            this.4.0(f4);
            this.5 = null;
            this.3 = null;
        }
        bus.G();
        float f12 = 0.0f;
        for (4c c4 : ((3X)this).3) {
            c4.0(bip2, c4.equals(c2), f4, f12, f2);
            f3 = c4.0(bip2);
            bus.c((float)0.0f, (float)f3, (float)0.0f);
            f12 += f3;
            if (stringArray == null) return;
            if (stringArray != null) continue;
        }
        bus.H();
    }

    /*
     * Enabled aggressive block sorting
     */
    public 30() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2005\u2003\u2001\u2001;
                if (bl2 || bl2) break block2;
                this.4 = new 5u();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

