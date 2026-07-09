/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bus
 */
package net.impactclient;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import net.impactclient.1A;
import net.impactclient.1t;
import net.impactclient.2K;
import net.impactclient.5b;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 2F
extends 2K {
    protected float 0d;
    public static final boolean \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
    protected int 0e;
    protected boolean 0g;
    protected float 4;
    private List<2K> 0f;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean 0(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2F.0(n2, n3, this.3, this.6, this.0b, Math.round(this.0d))) {
                if (bl2) return true;
                return (int)((long)77738513 ^ (long)77738512) != 0;
            }
        }
        if (!bl2) return (int)((long)-926824821 ^ (long)-926824821) != 0;
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void 0(int n2, int n3, boolean bl2, float f2) {
        float f3;
        float f4;
        String[] stringArray;
        float f5;
        void var4_6;
        block13: {
            block12: {
                boolean bl3 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl3) break block12;
                String[] stringArray2 = 7b.0();
                super.0(n2, n3, bl2, (float)var4_6);
                f5 = 0.1f * var4_6;
                stringArray = stringArray2;
                if (!bl3 && !bl3) break block13;
            }
            return;
        }
        if (!bl2 && this.2(n2, n3)) {
            f4 = f5;
            if (\u2006\u2001\u200f\u2006\u200e\u200d\u200d) {
                throw null;
            }
        } else {
            f4 = -f5;
        }
        this.4 += f4;
        this.4 = Math.max(0.0f, Math.min(1.0f, this.4));
        f5 = 40.0f * var4_6;
        if (this.0g) {
            f3 = f5;
            if (\u2006\u2001\u200f\u2006\u200e\u200d\u200d) {
                throw null;
            }
        } else {
            f3 = -f5;
        }
        this.0d += f3;
        this.0d = Math.max((float)this.5, Math.min((float)this.0e, this.0d));
        this.0();
        f5 = var4_6;
        boolean bl4 = bl2;
        int n4 = n3;
        n3 = n2;
        2F f6 = this;
        if (f6.0g) {
            for (2K k2 : f6.0f) {
                k2.0(n3, n4, bl4, f5);
                k2.2(n3, n4);
                if (stringArray != null) continue;
            }
        }
    }

    public final boolean 2() {
        boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
        if (bl2 || bl2) {
            return true;
        }
        return this.0g;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 0(int n2, int n3, int n4) {
        boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
        if (bl2 || bl2) return;
        if (this.2(n2, n3)) {
            int n5;
            if (bl2 || bl2) {
                return;
            }
            if (!this.0g) {
                n5 = (int)((long)1641822455 ^ (long)1641822454);
                if (\u2006\u2001\u200f\u2006\u200e\u200d\u200d) {
                    throw null;
                }
            } else {
                n5 = (int)((long)617041390 ^ (long)617041390);
            }
            this.0g = n5;
            return;
        }
        if (this.1(n2, n3)) {
            int n6;
            if (n4 != (int)((long)1266681906 ^ (long)1266681907)) return;
            if (!this.0g) {
                n6 = (int)((long)1507628391 ^ (long)1507628390);
                if (\u2006\u2001\u200f\u2006\u200e\u200d\u200d) {
                    throw null;
                }
            } else {
                n6 = (int)((long)-1924976628 ^ (long)-1924976628);
            }
            this.0g = n6;
            return;
        } else {
            if (!this.0g) return;
            this.1().forEach(k2 -> {
                block3: {
                    block2: {
                        boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                        if (bl2 || bl2) break block2;
                        k2.0(n2, n3, n4);
                        if (!bl2) break block3;
                    }
                    return;
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void 0() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) break block2;
                2F f2 = this;
                f2.0(f2.3, this.6, this.0b, this.5);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2F() {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) break block2;
                this.0f = Lists.newArrayList();
                if (bl2 || bl2) break block2;
                this.0g = (int)((long)1793778456 ^ (long)1793778456);
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void 3(int n2) {
        block5: {
            block2: {
                boolean bl2;
                block3: {
                    int n3;
                    int n4;
                    block4: {
                        bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                        if (bl2 || bl2) break block2;
                        int n5 = n2;
                        float f2 = 1.0f * (this.0d - (float)this.5) / (float)(this.0e - this.5);
                        2F f3 = this;
                        if (f3.1().size() <= 0) break block3;
                        if (bl2 || bl2) break block2;
                        n4 = f3.3 + (int)((long)1160387516 ^ (long)1160387507);
                        if (bl2 || bl2) break block2;
                        n3 = f3.6 + (int)((long)1030561279 ^ (long)1030561262);
                        if (bl2 || bl2) break block2;
                        bus.G();
                        if (bl2 || bl2) break block2;
                        1A.0((boolean)((long)827281331 ^ (long)827281330));
                        if (bl2 || bl2) break block2;
                        5b[] bArray = new 5b[(int)((long)715910218 ^ (long)715910219)];
                        bArray[(int)((long)1691046852 ^ (long)1691046852)] = 5b.c;
                        1A.0(bArray);
                        if (bl2 || bl2) break block2;
                        1t.0(n5);
                        if (bl2 || bl2) break block2;
                        bus.d((float)1.0f);
                        if (bl2 || bl2) break block2;
                        if (!(f2 > 0.0f)) break block4;
                        if (bl2 || bl2) break block2;
                        1t.0(f2 * 90.0f, n4, n3);
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    1A.1.addVertex((float)n4 - 3.0f, (float)n3 + 5.0f, 0.0f).addVertex((float)n4 + 3.0f, n3, 0.0f).addVertex((float)n4 - 3.0f, (float)n3 - 5.0f, 0.0f).draw((int)((long)960343438 ^ (long)960343437));
                    if (bl2 || bl2) break block2;
                    bus.m();
                    if (bl2 || bl2) break block2;
                    1A.0();
                    if (bl2 || bl2) break block2;
                    1A.0((boolean)((long)-1238017839 ^ (long)-1238017839));
                    if (bl2 || bl2) break block2;
                    bus.H();
                    if (bl2) break block2;
                }
                if (!bl2) break block5;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean 2(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2F.0(n2, n3, this.3, this.6, this.5 - (int)((long)479744061 ^ (long)479744057), this.5)) {
                if (bl2) return true;
                return (int)((long)845054308 ^ (long)845054309) != 0;
            }
        }
        if (!bl2) return (int)((long)-118755880 ^ (long)-118755880) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean 1(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2F.0(n2, n3, this.3 + this.5 - (int)((long)-896847187 ^ (long)-896847191), this.6, this.0b + this.5 - (int)((long)-524811970 ^ (long)-524811974), this.5)) {
                if (bl2) return true;
                return (int)((long)-1390608525 ^ (long)-1390608526) != 0;
            }
        }
        if (!bl2) return (int)((long)-1947134360 ^ (long)-1947134360) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(2K k2) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) break block2;
                k2.0(this);
                if (bl2 || bl2) break block2;
                this.0f.add(k2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final List<2K> 1() {
        boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
        if (bl2 || bl2) {
            return null;
        }
        return this.0f.stream().filter(2K::4).collect(Collectors.toList());
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void 0(int n2, int n3, int n4, int n5) {
        boolean bl2;
        block9: {
            String[] stringArray;
            block8: {
                bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2) return;
                stringArray = 7b.0();
                if (bl2 || bl2) return;
                if (this.0g) break block8;
                if (bl2) return;
                if (!(this.0d > (float)n5)) break block9;
                if (bl2) return;
            }
            if (bl2) return;
            if (this.1().size() <= 0) break block9;
            if (bl2 || bl2) return;
            n5 = n3 + n5 + (int)((long)-1962146257 ^ (long)-1962146259);
            if (bl2 || bl2) return;
            Iterator<2K> iterator = this.1().iterator();
            if (bl2) return;
            while (!bl2) {
                block10: {
                    block11: {
                        2K k2;
                        block12: {
                            if (!iterator.hasNext()) break block10;
                            if (bl2) return;
                            k2 = iterator.next();
                            if (!k2.4()) continue;
                            if (bl2 || bl2) return;
                            k2.1(n4 - (int)((long)1784286571 ^ (long)1784286563));
                            if (bl2 || bl2) return;
                            k2.2(n2 + (int)((long)1016478834 ^ (long)1016478838));
                            if (bl2 || bl2) return;
                            k2.0(n5);
                            if (bl2 || bl2) return;
                            n5 += k2.5 + (int)((long)-248467955 ^ (long)-248467953);
                            if (bl2 || bl2) return;
                            if (!(k2 instanceof 2F)) break block11;
                            if (bl2 || bl2) return;
                            k2 = (2F)k2;
                            if (((2F)k2).0g) break block12;
                            if (bl2) return;
                            if (!(((2F)k2).0d > (float)((2F)k2).5)) break block11;
                            if (bl2) return;
                        }
                        if (bl2) return;
                        n5 += (int)((2F)k2).0d - ((2F)k2).5;
                        if (bl2) return;
                    }
                    if (bl2) return;
                    if (stringArray != null) continue;
                    if (bl2) return;
                }
                if (bl2) return;
                this.0e = n5 - n3 + (int)((long)1415023465 ^ (long)1415023467);
                if (bl2 || bl2) return;
                return;
            }
            return;
        }
        if (bl2) return;
        this.0e = n5;
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean 0(char c2, int n2) {
        boolean bl2;
        boolean bl3;
        block3: {
            bl3 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
            if (bl3) return true;
            String[] stringArray = 7b.0();
            if (bl3) return true;
            if (bl3) return true;
            if (this.0g) {
                if (bl3) return true;
                if (bl3) return true;
                Iterator<2K> iterator = this.1().iterator();
                if (bl3) return true;
                do {
                    if (bl3) return true;
                    if (!iterator.hasNext()) break block3;
                    if (bl3) return true;
                    bl2 = iterator.next().0(c2, n2);
                    if (stringArray == null) return bl2;
                    if (bl2) {
                        if (bl3) return true;
                        if (bl3) return true;
                        return (int)((long)1544665721 ^ (long)1544665720) != 0;
                    }
                    if (bl3) return true;
                } while (stringArray != null);
                if (bl3) return true;
            }
        }
        if (bl3) return true;
        bl2 = super.0(c2, n2);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 1(int n2, int n3, int n4) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                    if (bl2 || bl2) break block2;
                    if (!this.0g) break block3;
                    if (bl2 || bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                                if (bl2 || bl2) break block2;
                                k2.1(n2, n3, n4);
                                if (!bl2) break block3;
                            }
                            return;
                        }
                    });
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
    public boolean 3(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2006\u2001\u200f\u2006\u200e\u200d\u200d;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2F.0(n2, n3, this.3, this.6 + this.5, this.0b, Math.round(this.0d))) {
                if (bl2) return true;
                return (int)((long)148331922 ^ (long)148331923) != 0;
            }
        }
        if (!bl2) return (int)((long)444704519 ^ (long)444704519) != 0;
        return true;
    }
}

