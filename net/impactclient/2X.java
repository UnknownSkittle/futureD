/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.Display
 */
package net.impactclient;

import java.lang.invoke.LambdaMetafactory;
import java.util.function.Consumer;
import net.impactclient.0aa;
import net.impactclient.0ay;
import net.impactclient.0rg;
import net.impactclient.1A;
import net.impactclient.2C;
import net.impactclient.2F;
import net.impactclient.2K;
import net.impactclient.2Z;
import net.impactclient.2w;
import net.impactclient.5W;
import net.impactclient.5o;
import net.impactclient.73;
import net.impactclient.7b;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import pw.knx.feather.animate.TimeAnimation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2X
extends 2F {
    private int 0c;
    private 0aa 9;
    private int 0j;
    private double 0a;
    private boolean 0h;
    private boolean 8;
    private int 4;
    private int 0i;
    private int 0;
    private int 0k;
    private TimeAnimation 0l;
    public static final boolean \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
    private int 0f;

    /*
     * Enabled aggressive block sorting
     */
    public 2X(String string) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                    if (bl2 || bl2) break block2;
                    this.0l = new TimeAnimation();
                    if (bl2 || bl2) break block2;
                    this.9 = new 0aa();
                    if (bl2 || bl2) break block2;
                    this.0a = 0.0;
                    if (bl2 || bl2) break block2;
                    this.0j = (int)((long)1566618779 ^ (long)1566619253);
                    if (bl2 || bl2) break block2;
                    this.4 = (int)((long)1498092488 ^ (long)1498092482);
                    if (bl2 || bl2) break block2;
                    this.0k = (int)((long)-1839176896 ^ (long)-1839176886);
                    if (bl2 || bl2) break block2;
                    this.0h = (int)((long)1423164195 ^ (long)1423164195);
                    if (bl2 || bl2) break block2;
                    this.7 = string;
                    if (bl2 || bl2) break block2;
                    Object object = this;
                    if ((object = 5W.4.0a.get(((2K)object).3())) == null) break block3;
                    if (bl2 || bl2) break block2;
                    this.3 = ((5o)object).0;
                    if (bl2 || bl2) break block2;
                    this.6 = ((5o)object).2;
                    if (bl2 || bl2) break block2;
                    this.0g = ((5o)object).1;
                    if (bl2) break block2;
                }
                if (bl2) break block2;
                this.0();
                if (bl2 || bl2) break block2;
                0ay.3().5.0(string).forEach(var1_1 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                            if (bl2 || bl2) break block2;
                            this.0((2K)new 2C((73)var1_1));
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (!bl2 && !bl2) break block4;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 3(int n2, int n3) {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) return true;
        if (!this.8) {
            if (bl2) return true;
            if (2X.0(n2, n3, this.3(), this.2() + this.5, this.0b, Math.min(this.0j, Math.round(this.0d)))) {
                if (bl2) return true;
                return (int)((long)-1762372590 ^ (long)-1762372589) != 0;
            }
        }
        if (!bl2) return (int)((long)-1030149505 ^ (long)-1030149505) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 1(int n2, int n3, int n4) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                    if (bl2 || bl2) break block2;
                    this.8 = (int)((long)-1975557953 ^ (long)-1975557953);
                    if (bl2 || bl2) break block2;
                    if (!this.0g) break block3;
                    if (bl2) break block2;
                    this.1().forEach(k2 -> {
                        block3: {
                            block2: {
                                boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
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
    public final void 0(int n2, int n3, float f2) {
        float f3;
        int n4;
        int n5;
        block10: {
            block8: {
                block9: {
                    block7: {
                        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                        if (bl2 || bl2) break block7;
                        this.0c = (int)((float)Display.getWidth() / 5W.4.9) - (int)((long)-1121750857 ^ (long)-1121750851) - this.0b;
                        if (bl2 || bl2) break block7;
                        this.0i = (int)((float)Display.getHeight() / 5W.4.9) - (int)((long)-321456648 ^ (long)-321456654) - this.5;
                        if (bl2 || bl2) break block7;
                        n5 = this.3();
                        if (bl2 || bl2) break block7;
                        n4 = this.2();
                        if (n4 >= this.6) break block8;
                        if (!bl2) break block9;
                    }
                    return;
                }
                f3 = this.5;
                if (\u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e) {
                    throw null;
                }
                break block10;
            }
            f3 = Math.min((float)this.0j, this.0d);
        }
        int n6 = (int)f3;
        int n7 = 2w.0((int)((long)-521178805 ^ (long)-521178785), (int)((long)-83609371 ^ (long)-83609359), (int)((long)1362986965 ^ (long)1362986945), (int)((long)-578271778 ^ (long)-578271967));
        if (5W.4.1.0) {
            0rg.0((int)((float)n5 * 5W.4.4.2), (int)((float)n4 * 5W.4.4.2), (int)((float)this.0b * 5W.4.4.2), (int)((float)n6 * 5W.4.4.2), (int)2Z.0(5W.4.5.2, 1.0, 1.0, 20.0), 1.0f);
        }
        int n8 = (int)(5W.4.3.2 * 255.0f);
        1A.0(n5, n4, n5 + this.0b, n4 + n6, 1.0f, n7, 2w.0((int)((long)1685284716 ^ (long)1685284722), (int)((long)1659271467 ^ (long)1659271477), (int)((long)598602903 ^ (long)598602889), n8));
        1A.0(n5, n4, n5 + this.0b, n4 + this.5, 1.0f, n7, 2w.0((int)((long)521268732 ^ (long)521268706), (int)((long)1450753105 ^ (long)1450753103), (int)((long)1759978953 ^ (long)1759978967), n8 / (int)((long)-858268016 ^ (long)-858268014)));
        1.a(this.7, (float)n5 + (float)this.0b / 2.0f - (float)1.a(this.7) / 2.0f, (float)(n4 + (int)((long)1302306009 ^ (long)1302306000)), (int)((long)2077432663 ^ (long)-2077432664));
        if (this.0g || this.0d > (float)this.5) {
            2w.0((float)(n5 + (int)((long)134642250 ^ (long)134642251)), (float)(n4 + this.5), (float)(n5 + this.0b - (int)((long)649881275 ^ (long)649881274)), (float)(n4 + n6 - (int)((long)1969146058 ^ (long)1969146059)));
            this.1().forEach(k2 -> {
                block3: {
                    block2: {
                        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                        if (bl2 || bl2) break block2;
                        k2.0(n2, n3, f2);
                        if (!bl2 && !bl2) break block3;
                    }
                    return;
                }
            });
            2w.1();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(char c2, int n2) {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) return true;
        if (super.0(c2, n2)) {
            if (bl2) return true;
            return (int)((long)-198807300 ^ (long)-198807299) != 0;
        }
        if (bl2) return true;
        if (n2 == (int)((long)-1683302273 ^ (long)-1683302225)) {
            if (bl2 || bl2) return true;
            this.0(-50.0);
            if (bl2 || bl2) return true;
            return (int)((long)-460989070 ^ (long)-460989069) != 0;
        }
        if (bl2) return true;
        if (n2 == (int)((long)-1888100742 ^ (long)-1888100686)) {
            if (bl2 || bl2) return true;
            this.0(50.0);
            if (bl2 || bl2) return true;
            return (int)((long)1087851229 ^ (long)1087851228) != 0;
        }
        if (bl2) return true;
        if (this.0g) {
            if (bl2 || bl2) return true;
            this.0h = (int)((long)-1614416852 ^ (long)-1614416852);
            if (bl2 || bl2) return true;
            this.1().forEach(k2 -> {
                block4: {
                    block2: {
                        boolean bl2;
                        block3: {
                            bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                            if (bl2 || bl2) break block2;
                            if (!k2.0(c2, n2)) break block3;
                            if (bl2 || bl2) break block2;
                            this.0h = (int)((long)-1372467307 ^ (long)-1372467308);
                            if (bl2) break block2;
                        }
                        if (!bl2) break block4;
                    }
                    return;
                }
            });
            if (bl2 || bl2) return true;
            return this.0h;
        }
        if (!bl2) return (int)((long)132530813 ^ (long)132530813) != 0;
        return true;
    }

    private int 2() {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) {
            return -867409458;
        }
        return Math.max(this.0k, Math.min(this.0i, this.6));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void 1(int n2, int n3, int n4, 2K k2) {
        block3: {
            block2: {
                boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                if (bl2 || bl2) break block2;
                k2.0(n2, n3, n4);
                if (!bl2) break block3;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void 0(int var1_1, int var2_2, int var3_3) {
        block18: {
            block20: {
                block19: {
                    block16: {
                        block17: {
                            block15: {
                                block14: {
                                    var9_4 = 2X.\u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                                    if (var9_4) lbl-1000:
                                    // 31 sources

                                    {
                                        return;
                                    }
                                    var5_5 = (int)((long)1652096874 ^ (long)1652096874);
                                    var6_6 = (int)((long)-1161362572 ^ (long)-1161362572);
                                    var4_7 = 7b.0();
                                    if (var9_4 || var9_4) ** GOTO lbl-1000
                                    var7_8 = this.3();
                                    if (var9_4 || var9_4) ** GOTO lbl-1000
                                    var8_9 = this.2();
                                    if (var9_4 || var9_4) ** GOTO lbl-1000
                                    if (var3_3 == (int)((long)-616416571 ^ (long)-616416569)) break block14;
                                    if (var9_4) ** GOTO lbl-1000
                                    if (var3_3 != 0) break block15;
                                    if (var9_4) ** GOTO lbl-1000
                                    if (Keyboard.isKeyDown((int)((int)((long)384579721 ^ (long)384579732)))) break block14;
                                    if (var9_4) ** GOTO lbl-1000
                                    if (!Keyboard.isKeyDown((int)((int)((long)1952020944 ^ (long)1952020813)))) break block15;
                                    if (var9_4) ** GOTO lbl-1000
                                }
                                if (var9_4) ** GOTO lbl-1000
                                var6_6 = (int)((long)1411337258 ^ (long)1411337259);
                                if (var9_4) ** GOTO lbl-1000
                                if (var4_7 != null) break block16;
                                if (var9_4) ** GOTO lbl-1000
                            }
                            if (var9_4) ** GOTO lbl-1000
                            if (!this.1(var1_1, var2_2)) break block17;
                            if (var9_4 || var9_4) ** GOTO lbl-1000
                            switch (var3_3) {
                                case 0: {
                                    if (var9_4) ** GOTO lbl-1000
                                    if (!this.9.0(7911104549201464342L ^ 7911104549201464802L)) ** GOTO lbl42
                                    if (var9_4 || var9_4) ** GOTO lbl-1000
                                    this.9.0();
                                    if (var9_4) ** GOTO lbl-1000
                                    if (var4_7 != null) ** GOTO lbl45
                                    if (var9_4) ** GOTO lbl-1000
lbl42:
                                    // 2 sources

                                    if (var9_4) ** GOTO lbl-1000
                                    var5_5 = (int)((long)1202966811 ^ (long)1202966810);
                                    if (var9_4) ** GOTO lbl-1000
lbl45:
                                    // 2 sources

                                    if (var9_4) ** GOTO lbl-1000
                                    var6_6 = (int)((long)-1714824431 ^ (long)-1714824432);
                                    if (var9_4 || var9_4) ** GOTO lbl-1000
                                    if (var4_7 != null) break block16;
                                    if (var9_4) ** GOTO lbl-1000
                                }
                                case 1: {
                                    if (var9_4) ** GOTO lbl-1000
                                    var5_5 = (int)((long)-1061341185 ^ (long)-1061341186);
                                    if (var9_4) ** GOTO lbl-1000
                                }
                                default: {
                                    if (var9_4) ** GOTO lbl-1000
                                    if (var4_7 != null) break block16;
                                    if (var9_4) ** GOTO lbl-1000
                                }
                            }
                        }
                        if (var9_4) ** GOTO lbl-1000
                        if (!this.0g) break block16;
                        if (var9_4 || var9_4) ** GOTO lbl-1000
                        this.1().forEach((Consumer<2K>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, 1(int int int net.impactclient.2K ), (Lnet/impactclient/2K;)V)((int)var1_1, (int)var2_2, (int)var3_3));
                        if (var9_4) ** GOTO lbl-1000
                    }
                    if (var9_4) ** GOTO lbl-1000
                    if (var5_5 == 0) break block18;
                    if (!var9_4 && !var9_4) ** break;
                    ** while (true)
                    if (!this.0g) {
                        v0 = (int)((long)-1932164088 ^ (long)-1932164087);
                        if (2X.\u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e) {
                            throw null;
                        }
                    } else {
                        this.0g = (int)((long)-263994628 ^ (long)-263994628);
                        v0 = (int)this.0g;
                    }
                    if (v0 == 0) break block19;
                    this.0l.reverse();
                    if (var4_7 != null) break block20;
                }
                this.0l.forward();
            }
            this.0l.play();
        }
        if (var6_6 != 0) {
            this.8 = (int)((long)972890941 ^ (long)972890940);
            this.0f = var1_1 - var7_8;
            this.0 = var2_2 - var8_9;
        }
    }

    @Override
    public final boolean 0(int n2, int n3) {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) {
            return true;
        }
        return 2X.0(n2, n3, this.3(), this.2(), this.0b, Math.min(this.0j, Math.round(this.0d)));
    }

    @Override
    public final boolean 1(int n2, int n3) {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) {
            return true;
        }
        return 2X.0(n2, n3, this.3(), this.2(), this.0b, this.5);
    }

    private int 3() {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) {
            return 614903572;
        }
        return Math.max(this.4, Math.min(this.0c, this.3));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 0(double d2) {
        boolean bl2 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
        if (bl2 || bl2) return;
        if (this.0e < this.0j) {
            if (bl2 || bl2) return;
            this.0a = 0.0;
            if (bl2 || bl2) return;
            return;
        }
        if (bl2) return;
        this.0a -= d2;
        if (bl2 || bl2) return;
        float f2 = (float)this.0e - Math.min((float)this.0j, this.0d);
        if (bl2 || bl2) return;
        this.0a = Math.min((double)f2, this.0a);
        if (bl2 || bl2) return;
        this.0a = Math.max(0.0, this.0a);
        if (!bl2 && !bl2) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, boolean bl2, float f2) {
        block5: {
            block2: {
                boolean bl3;
                block4: {
                    block3: {
                        bl3 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                        if (bl3 || bl3) break block2;
                        this.0b = (int)((long)-2008446212 ^ (long)-2008446432);
                        if (bl3 || bl3) break block2;
                        this.5 = (int)((long)-1119436930 ^ (long)-1119436963);
                        if (bl3 || bl3) break block2;
                        this.0j = Math.min((int)((float)2X.2.e / 5W.4.9 - 10.0f - (float)this.2()), (int)((long)1569124209 ^ (long)1569123743));
                        if (bl3 || bl3) break block2;
                        if (!this.8) break block3;
                        if (bl3 || bl3) break block2;
                        this.3 = n2 - this.0f;
                        if (bl3 || bl3) break block2;
                        this.6 = n3 - this.0;
                        if (bl3) break block2;
                    }
                    if (bl3) break block2;
                    if (!5W.4.0b.0) break block4;
                    if (bl3 || bl3) break block2;
                    this.3 = (int)((double)Math.round((double)this.3 * 0.1) / 0.1);
                    if (bl3 || bl3) break block2;
                    this.6 = (int)((double)Math.round((double)this.6 * 0.1) / 0.1);
                    if (bl3) break block2;
                }
                if (bl3) break block2;
                int n4 = Math.min(this.0j, this.0e);
                if (bl3 || bl3) break block2;
                this.0l.setDuration((int)((float)n4 * 0.7f));
                if (bl3 || bl3) break block2;
                this.0d = (float)this.0l.get() * (float)(this.5 - n4) + (float)n4;
                if (bl3 || bl3) break block2;
                2X x2 = this;
                x2.0(x2.3(), this.2(), this.0b, this.5);
                if (bl3 || bl3) break block2;
                this.1().forEach(k2 -> {
                    block6: {
                        block2: {
                            boolean bl3;
                            block5: {
                                block4: {
                                    block3: {
                                        bl3 = \u200a\u2002\u2004\u2008\u2000\u2006\u2008\u2001\u200e;
                                        if (bl3 || bl3) break block2;
                                        2K k3 = k2;
                                        k3.0(k3.1() - (int)this.0a);
                                        if (bl3 || bl3) break block2;
                                        k2.0(n2, n3, bl2, f2);
                                        if (bl3 || bl3) break block2;
                                        if (!this.0g) break block3;
                                        if (bl3) break block2;
                                        if (!bl2) break block4;
                                        if (bl3) break block2;
                                    }
                                    if (bl3) break block2;
                                    if (!this.8) break block5;
                                    if (bl3) break block2;
                                    if (n3 <= this.6 + this.5 + (int)((long)-1520497138 ^ (long)-1520497140)) break block5;
                                    if (bl3) break block2;
                                    if (n3 >= this.6 + n4 - (int)((long)-445641802 ^ (long)-445641804)) break block5;
                                    if (bl3) break block2;
                                }
                                if (bl3) break block2;
                                k2.2(n2, n3);
                                if (bl3) break block2;
                            }
                            if (!bl3) break block6;
                        }
                        return;
                    }
                });
                if (!bl3 && !bl3) break block5;
            }
            return;
        }
    }
}

