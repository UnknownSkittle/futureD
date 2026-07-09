/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.impactclient;

import java.awt.Color;
import net.impactclient.1A;
import net.impactclient.2F;
import net.impactclient.2w;
import net.impactclient.7x;
import org.lwjgl.input.Keyboard;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 2n
extends 2F {
    public static final boolean \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
    private 7x 2;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3, int n4) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                    if (bl2 || bl2) break block2;
                    if (!this.0g) break block3;
                    if (bl2 || bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
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
    @Override
    public final void 0(int n2, int n3, int n4) {
        boolean bl2;
        block10: {
            block12: {
                block11: {
                    bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                    if (bl2 || bl2) return;
                    if (!this.1(n2, n3)) break block10;
                    if (bl2 || bl2) return;
                    if (n4 != 0) break block10;
                    if (bl2 || bl2) return;
                    if (Keyboard.isKeyDown((int)((int)((long)1624188210 ^ (long)1624188184)))) break block11;
                    if (bl2) return;
                    if (!Keyboard.isKeyDown((int)((int)((long)925868423 ^ (long)925868465)))) break block12;
                    if (bl2) return;
                }
                if (bl2) return;
                this.2.2();
                if (bl2) return;
                return;
            }
            if (bl2) return;
            this.2.0();
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        super.0(n2, n3, n4);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, float f2) {
        block5: {
            block2: {
                boolean bl2;
                block4: {
                    block3: {
                        bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                        if (bl2 || bl2) break block2;
                        float f3 = Math.min(0.7f + this.9 * 0.3f, 1.0f);
                        int n4 = 2w.1(f3, f3, f3, 1.0f);
                        if (bl2 || bl2) break block2;
                        1A.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)(this.6 + this.5), new Color(0.0f, 0.0f, 0.0f, this.9 * 0.1f).getRGB());
                        if (bl2 || bl2) break block2;
                        1A.0(this.3, this.6, this.3 + this.0b, (float)this.6 + this.0d, 1.0f, (int)((long)1254530346 ^ (long)180788522), (int)((long)-477591888 ^ (long)-477591888));
                        if (bl2 || bl2) break block2;
                        1.a(this.2.1(), (float)(this.3 + (int)((long)-719220944 ^ (long)-719220946)), (float)(this.6 + (int)((long)-924793734 ^ (long)-924793741)), (int)((long)1114771768 ^ (long)-1114771769));
                        if (bl2 || bl2) break block2;
                        String string = this.2.3();
                        if (bl2 || bl2) break block2;
                        1.a(string, (float)(this.3 + this.0b - (int)((long)286043868 ^ (long)286043866) - 1.a(string)), (float)(this.6 + (int)((long)191351078 ^ (long)191351087)), n4);
                        if (bl2 || bl2) break block2;
                        float f4 = Math.min(this.0a + 0.5f + this.4 * 0.3f, 1.0f);
                        n4 = 2w.1(f4, f4, f4, 1.0f);
                        if (bl2 || bl2) break block2;
                        this.3(n4);
                        if (bl2 || bl2) break block2;
                        if (this.0g) break block3;
                        if (bl2) break block2;
                        if (!(this.0d > (float)this.5)) break block4;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    2w.0((float)this.3, (float)this.6, (float)(this.3 + this.0b), (float)this.6 + this.0d);
                    if (bl2 || bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                                if (bl2 || bl2) break block2;
                                k2.0(n2, n3, f2);
                                if (!bl2 && !bl2) break block3;
                            }
                            return;
                        }
                    });
                    if (bl2 || bl2) break block2;
                    2w.1();
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
    public 2n(7x x2) {
        block3: {
            block2: {
                boolean bl2 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                if (bl2 || bl2) break block2;
                this.2 = x2;
                if (bl2 || bl2) break block2;
                this.8 = this.2.4();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void 0(int n2, int n3, boolean bl2, float f2) {
        block3: {
            block2: {
                boolean bl3 = \u200f\u2004\u2008\u2004\u2006\u2004\u2001;
                if (bl3 || bl3) break block2;
                this.5 = (int)((long)-856772183 ^ (long)-856772214);
                if (bl3 || bl3) break block2;
                super.0(n2, n3, bl2, f2);
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }
}

