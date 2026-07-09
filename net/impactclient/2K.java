/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bip
 */
package net.impactclient;

import java.awt.Rectangle;
import net.impactclient.0T;
import net.impactclient.0aa;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.2F;
import net.impactclient.5W;
import net.impactclient.95;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class 2K
implements 0T {
    protected String 8;
    protected float 9;
    protected int 5;
    public static bip 1;
    protected 2F 0c;
    protected int 6;
    protected int 3;
    private 0aa 4;
    protected float 0a;
    protected String 7;
    public static final boolean \u200e\u200a\u2004;
    protected int 0b;
    protected boolean 0;

    public final boolean 4() {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return true;
        }
        return this.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean 0(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2K.0(n2, n3, this.3, this.6, this.0b, this.5)) {
                if (bl2) return true;
                return (int)((long)264663179 ^ (long)264663178) != 0;
            }
        }
        if (!bl2) return (int)((long)-1822988734 ^ (long)-1822988734) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.6 = n2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean 0(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) return true;
        if (n2 >= n4) {
            if (bl2) return true;
            if (n2 <= n4 + n6) {
                if (bl2) return true;
                if (n3 >= n5) {
                    if (bl2) return true;
                    if (n3 <= n5 + n7) {
                        if (bl2) return true;
                        return (int)((long)-1582785095 ^ (long)-1582785096) != 0;
                    }
                }
            }
        }
        if (!bl2) return (int)((long)570652291 ^ (long)570652291) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2K() {
        block3: {
            block2: {
                boolean bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.0 = (int)((long)-1603343754 ^ (long)-1603343753);
                if (bl2 || bl2) break block2;
                this.4 = new 0aa();
                if (!bl2) break block3;
            }
            return;
        }
    }

    public abstract void 0(int var1, int var2, int var3);

    /*
     * Enabled aggressive block sorting
     */
    public void 0(int n2, int n3, boolean bl2, float f2) {
        float f3;
        block8: {
            block7: {
                boolean bl3 = \u200e\u200a\u2004;
                if (bl3 || bl3) break block7;
                f2 = 0.1f * f2;
                if (!bl3 && !bl3) break block8;
            }
            return;
        }
        if (!bl2 && this.1(n2, n3)) {
            f3 = f2;
            if (\u200e\u200a\u2004) {
                throw null;
            }
        } else {
            f3 = -f2;
        }
        this.9 += f3;
        this.9 = Math.max(0.0f, Math.min(1.0f, this.9));
    }

    public final int 1() {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return -1568874075;
        }
        return this.6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 2(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.3 = n2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean 1(int n2, int n3) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2K.0(n2, n3, this.3, this.6, this.0b, this.5)) {
                if (bl2) return true;
                return (int)((long)-1133636510 ^ (long)-1133636509) != 0;
            }
        }
        if (!bl2) return (int)((long)-1499564782 ^ (long)-1499564782) != 0;
        return true;
    }

    public abstract void 0(int var1, int var2, float var3);

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(2F f2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.0c = f2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 1(int n2) {
        block3: {
            block2: {
                boolean bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) break block2;
                this.0b = n2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final int 0() {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return 764323324;
        }
        return this.3;
    }

    public boolean 0(char c2, int n2) {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return true;
        }
        return (int)((long)-1857561772 ^ (long)-1857561772) != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean 0(int n2, int n3, Rectangle rectangle) {
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u200e\u200a\u2004;
                if (bl2 || bl2) return true;
                if (this.0c == null) break block7;
                if (bl2) return true;
                if (!this.0c.3(n2, n3)) break block8;
                if (bl2) return true;
            }
            if (bl2) return true;
            if (2K.0(n2, n3, this.3 + (int)rectangle.getX(), this.6 + (int)rectangle.getY(), (int)rectangle.getWidth(), (int)rectangle.getHeight())) {
                if (bl2) return true;
                return (int)((long)-764973570 ^ (long)-764973569) != 0;
            }
        }
        if (!bl2) return (int)((long)1605193238 ^ (long)1605193238) != 0;
        return true;
    }

    public abstract void 1(int var1, int var2, int var3);

    public final Rectangle 2() {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return new Rectangle(this.3, this.6, this.0b, this.5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void 2(int n2, int n3) {
        block8: {
            String string;
            95 var1_2;
            block10: {
                block7: {
                    boolean bl2;
                    block9: {
                        bl2 = \u200e\u200a\u2004;
                        if (bl2 || bl2) break block7;
                        if (this.8 == null) break block8;
                        if (bl2 || bl2) break block7;
                        if (this.1(n2, n3)) break block9;
                        if (bl2 || bl2) break block7;
                        this.4.0();
                        if (bl2) break block7;
                    }
                    if (bl2) break block7;
                    if (!this.4.0(0x6B34A223A4629047L ^ 0x6B34A223A46291B3L)) break block8;
                    if (bl2 || bl2) break block7;
                    var1_2 = 0ay.3().5.0(95.class);
                    if (!bl2 && !bl2) break block10;
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            if (var1_2.8.0) {
                string = this.7 + 0rB$1f.XNZw("\u52c6", 1854370889);
                if (\u200e\u200a\u2004) {
                    throw null;
                }
            } else {
                string = 0rB$1f.XNZw("", 1451819334);
            }
            5W.0(stringBuilder.append(string).append(this.8).toString());
        }
    }

    public final String 3() {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
            return null;
        }
        return this.7;
    }

    static {
        boolean bl2 = \u200e\u200a\u2004;
        if (bl2 || bl2) {
        } else {
            1 = 5W.1;
            if (!bl2) {
                // empty if block
            }
        }
    }
}

