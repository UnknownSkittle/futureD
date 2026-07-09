/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bib
 *  bjr
 *  blk
 *  org.lwjgl.input.Mouse
 *  rk
 */
package net.impactclient;

import net.impactclient.0ar;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.1R;
import net.impactclient.3J;
import net.impactclient.3v;
import net.impactclient.7b;
import org.lwjgl.input.Mouse;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 14
extends bjr {
    int 2;
    private final blk 1;
    public static final boolean \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
    private static final String x;
    private final 3J 0;

    /*
     * Enabled aggressive block sorting
     */
    protected final boolean a(int n2) {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        if (bl2 || bl2) return true;
        if (this.2 == n2) {
            if (bl2) return true;
            return (int)((long)437525027 ^ (long)437525026) != 0;
        }
        if (!bl2) return (int)((long)-411732448 ^ (long)-411732448) != 0;
        return true;
    }

    14(blk blk2, int n2, int n3) {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        super(bib.z(), (int)((long)874428600 ^ (long)874428500), blk2.m, (int)((long)-339800711 ^ (long)-339800731), n3, (int)((long)-488994986 ^ (long)-488994958));
        this.1 = blk2;
        this.0 = 0ay.3().0h;
        this.k = (int)((long)-456748108 ^ (long)-456748108);
        this.i(n2);
    }

    public final int c() {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        if (bl2 || bl2) {
            return 2050925795;
        }
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a(int n2, int n3, int n4, int n5, int n6, int n7, float f2) {
        Object object;
        Object object2;
        1R r2;
        block15: {
            block14: {
                boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
                if (bl2 || bl2) break block14;
                r2 = (1R)this.0.get(n2);
                object2 = r2.6();
                if (!bl2 && !bl2) break block15;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (object2 == 0ar.f) {
            object = a.k;
            if (\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                throw null;
            }
        } else if (object2 == 0ar.b) {
            object = a.j;
            if (\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                throw null;
            }
        } else if (object2 == 0ar.d) {
            object = a.m;
            if (\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                throw null;
            }
        } else {
            object = 0rB$1f.XNZw("", -249572166);
        }
        String string = stringBuilder.append(object).toString();
        String string2 = r2.4();
        if (object2 != 0ar.a) {
            string2 = string2 + x + ((0ar)((Object)object2)).toString();
        }
        object2 = r2.0();
        this.1.c(this.a.k, string + r2.7(), n3 + (int)((long)-1707137856 ^ (long)-1707137824) + (int)((long)1096833913 ^ (long)1096833917), n4 + (int)((long)1314027825 ^ (long)1314027827), (int)((long)-1691405439 ^ (long)-1680814978));
        this.1.c(this.a.k, string2, n3 + (int)((long)-428135739 ^ (long)-428135707) + (int)((long)-1233096922 ^ (long)-1233096926), n4 + (int)((long)184178919 ^ (long)184178922), (int)((long)1362002163 ^ (long)1370357875));
        this.1.c(this.a.k, (String)object2, n3 + (int)((long)-477158085 ^ (long)-477158117) + (int)((long)1586304910 ^ (long)1586304906), n4 + (int)((long)1566563908 ^ (long)1566563932), (int)((long)-1856204505 ^ (long)-1847848537));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void p() {
        block24: {
            int n2;
            block40: {
                block39: {
                    String[] stringArray;
                    block38: {
                        block27: {
                            block28: {
                                block29: {
                                    block37: {
                                        block36: {
                                            block35: {
                                                int n3;
                                                int n4;
                                                block34: {
                                                    block30: {
                                                        int n5;
                                                        block33: {
                                                            block31: {
                                                                block32: {
                                                                    block23: {
                                                                        boolean bl2;
                                                                        block25: {
                                                                            block26: {
                                                                                bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
                                                                                if (bl2) break block23;
                                                                                stringArray = 7b.0();
                                                                                if (bl2 || bl2) break block23;
                                                                                14 v0 = this;
                                                                                if (!v0.g(v0.j)) break block24;
                                                                                if (bl2 || bl2) break block23;
                                                                                if (Mouse.getEventButton() != 0) break block25;
                                                                                if (bl2) break block23;
                                                                                if (!Mouse.getEventButtonState()) break block25;
                                                                                if (bl2) break block23;
                                                                                if (this.j < this.d) break block25;
                                                                                if (bl2) break block23;
                                                                                if (this.j > this.e) break block25;
                                                                                if (bl2 || bl2) break block23;
                                                                                n2 = this.j - this.d - this.t + (int)this.n - (int)((long)310761965 ^ (long)310761961);
                                                                                n4 = n2 / this.h;
                                                                                if (n4 >= this.b()) break block26;
                                                                                if (bl2) break block23;
                                                                                if (this.i < this.g) break block26;
                                                                                if (bl2) break block23;
                                                                                if (this.i > this.f) break block26;
                                                                                if (bl2) break block23;
                                                                                if (n4 < 0) break block26;
                                                                                if (bl2) break block23;
                                                                                if (n2 < 0) break block26;
                                                                                if (bl2 || bl2) break block23;
                                                                                this.a(n4, (boolean)((long)35838835 ^ (long)35838835), this.i, this.j);
                                                                                if (bl2 || bl2) break block23;
                                                                                this.o = n4;
                                                                                if (bl2) break block23;
                                                                                if (stringArray != null) break block25;
                                                                                if (bl2) break block23;
                                                                            }
                                                                            if (bl2) break block23;
                                                                            if (this.i < this.g) break block25;
                                                                            if (bl2) break block23;
                                                                            if (this.i > this.f) break block25;
                                                                            if (bl2) break block23;
                                                                            if (n2 >= 0) break block25;
                                                                            if (bl2 || bl2) break block23;
                                                                            14 v1 = this;
                                                                            v1.a(v1.i - this.g, this.j - this.d + (int)this.n - (int)((long)1942128703 ^ (long)1942128699));
                                                                            if (bl2) break block23;
                                                                        }
                                                                        if (bl2) break block23;
                                                                        if (!Mouse.isButtonDown((int)((int)((long)1821821608 ^ (long)1821821608)))) break block27;
                                                                        if (bl2) break block23;
                                                                        if (!this.q()) break block27;
                                                                        if (bl2 || bl2) break block23;
                                                                        if (this.l != (int)((long)-922765801 ^ (long)922765800)) break block28;
                                                                        if (bl2 || bl2) break block23;
                                                                        n2 = (int)((long)1989257780 ^ (long)1989257781);
                                                                        if (bl2) return;
                                                                        if (bl2) break block23;
                                                                        if (this.j < this.d) break block29;
                                                                        if (bl2) break block23;
                                                                        if (this.j > this.e) break block29;
                                                                        if (bl2 || bl2) break block23;
                                                                        n4 = this.j - this.d - this.t + (int)this.n - (int)((long)948821159 ^ (long)948821155);
                                                                        n3 = n4 / this.h;
                                                                        if (n3 >= this.b()) break block30;
                                                                        if (bl2) break block23;
                                                                        if (this.i < this.g) break block30;
                                                                        if (bl2) break block23;
                                                                        if (this.i > this.f) break block30;
                                                                        if (bl2) break block23;
                                                                        if (n3 < 0) break block30;
                                                                        if (bl2) break block23;
                                                                        if (n4 < 0) break block30;
                                                                        if (bl2 || bl2) break block23;
                                                                        if (n3 != this.o) break block31;
                                                                        if (bl2) break block23;
                                                                        if (bib.I() - this.p >= (0x21FE127DF4A25ADFL ^ 0x21FE127DF4A25A25L)) break block31;
                                                                        if (!bl2) break block32;
                                                                    }
                                                                    return;
                                                                }
                                                                n5 = (int)((long)-2062376130 ^ (long)-2062376129);
                                                                if (\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                                                                    throw null;
                                                                }
                                                                break block33;
                                                            }
                                                            n5 = (int)((long)-613229867 ^ (long)-613229867);
                                                        }
                                                        n4 = n5;
                                                        this.a(n3, n4 != 0, this.i, this.j);
                                                        this.o = n3;
                                                        this.p = bib.I();
                                                        if (stringArray != null) break block34;
                                                    }
                                                    if (this.i >= this.g && this.i <= this.f && n4 < 0) {
                                                        14 v3 = this;
                                                        v3.a(v3.i - this.g, this.j - this.d + (int)this.n - (int)((long)1891663541 ^ (long)1891663537));
                                                        n2 = (int)((long)846043317 ^ (long)846043317);
                                                    }
                                                }
                                                if (this.i < this.d() || this.i > this.d() + (int)((long)-157046365 ^ (long)-157046363)) break block35;
                                                this.m = -1.0f;
                                                n4 = this.m();
                                                if (n4 <= 0) {
                                                    n4 = (int)((long)-810141039 ^ (long)-810141040);
                                                }
                                                n3 = rk.a((int)((int)((float)((this.e - this.d) * (this.e - this.d)) / (float)this.k())), (int)((int)((long)1174703776 ^ (long)1174703744)), (int)(this.e - this.d - (int)((long)-1668862655 ^ (long)-1668862647)));
                                                this.m /= (float)(this.e - this.d - n3) / (float)n4;
                                                if (stringArray != null) break block36;
                                            }
                                            this.m = 1.0f;
                                        }
                                        if (n2 == 0) break block37;
                                        this.l = this.j;
                                        if (stringArray != null) break block38;
                                    }
                                    this.l = (int)((long)-2072042863 ^ (long)2072042863);
                                    if (stringArray != null) break block38;
                                }
                                this.l = (int)((long)-1180132315 ^ (long)1180132315);
                                if (stringArray != null) break block38;
                            }
                            if (this.l < 0) break block38;
                            this.n -= (float)(this.j - this.l) * this.m;
                            this.l = this.j;
                            if (stringArray != null) break block38;
                        }
                        this.l = (int)((long)1265577023 ^ (long)-1265577024);
                    }
                    if ((n2 = Mouse.getEventDWheel()) == 0) break block24;
                    if (n2 <= 0) break block39;
                    n2 = (int)((long)944868019 ^ (long)-944868020);
                    if (stringArray != null) break block40;
                }
                n2 = (int)((long)-1151218227 ^ (long)-1151218228);
            }
            this.n += (float)(n2 * this.h / (int)((long)-261923476 ^ (long)-261923474));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block15: {
                var1 = 14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
                if (!var1) break block15;
                break block13;
            }
            v0 = (int)((long)-1161629220 ^ (long)1161629219);
            if (14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                throw null;
lbl8:
                // 1 sources

                while (true) {
                    14.x = new String(v1).intern();
                    if (14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) {
                        throw null;
                    }
                    break block13;
                    break;
                }
            }
            v2 = 0rB$1f.XNZw("\uc63c\ueec0\u2d14", 910745623).toCharArray();
            v3 = v2.length;
            var0_1 = (int)((long)-1162868920 ^ (long)-1162868920);
            v4 = (int)((long)-1951045320 ^ (long)-1951045370);
            v5 = v2;
            v6 = v3;
            if (v3 > (int)((long)-103709728 ^ (long)-103709727)) ** GOTO lbl68
            do {
                block14: {
                    v7 = v4;
                    v5 = v5;
                    v8 = v5;
                    v9 = v4;
                    v10 = var0_1;
                    do {
                        switch (var0_1 % (int)((long)-418299007 ^ (long)-418299002)) {
                            case 0: {
                                v11 = (int)((long)1789131819 ^ (long)1789131857);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            case 1: {
                                v11 = (int)((long)-1846421873 ^ (long)-1846421790);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            case 2: {
                                v11 = (int)((long)-40480430 ^ (long)-40480470);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            case 3: {
                                v11 = (int)((long)-896104364 ^ (long)-896104392);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            case 4: {
                                v11 = (int)((long)-1686108104 ^ (long)-1686108038);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            case 5: {
                                v11 = (int)((long)1526502097 ^ (long)1526502106);
                                if (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b) break;
                                throw null;
                            }
                            default: {
                                v11 = (int)((long)-69634314 ^ (long)-69634377);
                            }
                        }
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                        ++var0_1;
                        v4 = v7;
                        if (v7 != 0) break block14;
                        v7 = v4;
                        v5 = v5;
                        v10 = v4;
                        v8 = v5;
                        v9 = v4;
                    } while (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b);
                    throw null;
                }
                v1 = v5;
                v6 = v6;
            } while (v6 > var0_1);
            ** while (!14.\u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b)
lbl76:
            // 1 sources

            throw null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a(int n2, boolean bl2, int n3, int n4) {
        block4: {
            block2: {
                boolean bl3;
                block3: {
                    bl3 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
                    if (bl3 || bl3) break block2;
                    this.2 = n2;
                    if (bl3 || bl3) break block2;
                    if (!bl2) break block3;
                    if (bl3 || bl3) break block2;
                    3v.0((1R)this.0.get(this.2));
                    if (bl3) break block2;
                }
                if (!bl3) break block4;
            }
            return;
        }
    }

    protected final int b() {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        if (bl2 || bl2) {
            return 2134985428;
        }
        return this.0.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a() {
        block3: {
            block2: {
                boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
                if (bl2 || bl2) break block2;
                this.1.c((int)((long)-1029871262 ^ (long)-1029871262));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean g(int n2) {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        if (bl2 || bl2) return true;
        if (n2 >= this.d) {
            if (bl2) return true;
            if (n2 <= this.e) {
                if (bl2) return true;
                if (this.i >= this.g) {
                    if (bl2) return true;
                    if (this.i <= this.f + (int)((long)-876262849 ^ (long)-876262855)) {
                        if (bl2) return true;
                        return (int)((long)-981182770 ^ (long)-981182769) != 0;
                    }
                }
            }
        }
        if (!bl2) return (int)((long)-1741889135 ^ (long)-1741889135) != 0;
        return true;
    }

    protected final int d() {
        boolean bl2 = \u2005\u2009\u200b\u2001\u200b\u2004\u2005\u200b;
        if (bl2 || bl2) {
            return -1415113261;
        }
        return this.f;
    }
}

