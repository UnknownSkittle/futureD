/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bje
 *  bjr
 *  blk
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package net.impactclient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.25;
import net.impactclient.7b;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 79
extends bjr {
    private final blk 2;
    private 25 0;
    private int 3;
    private final List<bje> 1;
    public static final boolean \u200b\u200e\u2007\u2009;
    private int 4;

    /*
     * Enabled aggressive block sorting
     */
    protected final boolean a(int n2) {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2 || bl2) return true;
        if (n2 == this.o) {
            if (bl2) return true;
            return (int)((long)-1785508966 ^ (long)-1785508965) != 0;
        }
        if (!bl2) return (int)((long)-863436960 ^ (long)-863436960) != 0;
        return true;
    }

    static {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2 || bl2) {
        } else {
            0ay.3();
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private bje 1(String string) {
        bje bje2;
        block3: {
            block2: {
                boolean bl2 = \u200b\u200e\u2007\u2009;
                if (bl2 || bl2) break block2;
                bje2 = new bje((int)((long)521430128 ^ (long)521430132), this.a.k, (int)((long)1011496847 ^ (long)1011496847), (int)((long)1466951861 ^ (long)1466951861), this.3, (int)((long)-1426148403 ^ (long)-1426148391));
                bje2.f((int)((long)-1224758532 ^ (long)-1224758276));
                if (bl2 || bl2) break block2;
                bje2.a(string);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return bje2;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a() {
        block3: {
            block2: {
                boolean bl2 = \u200b\u200e\u2007\u2009;
                if (bl2 || bl2) break block2;
                this.2.c((int)((long)-602638977 ^ (long)-602638977));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 4() {
        block5: {
            block2: {
                boolean bl2;
                block4: {
                    block3: {
                        bl2 = \u200b\u200e\u2007\u2009;
                        if (bl2 || bl2) break block2;
                        if (this.b() <= 0) break block3;
                        if (bl2) break block2;
                        if (this.1().b().trim().isEmpty()) break block4;
                        if (bl2) break block2;
                    }
                    if (bl2) break block2;
                    this.1.add(this.1(0rB$1f.XNZw("", -91365823)));
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
    protected final void a(int n2, int n3, int n4, int n5, float f2) {
        block7: {
            boolean bl2 = \u200b\u200e\u2007\u2009;
            if (!bl2) {
                int n6 = (int)((long)-403594969 ^ (long)-403594969);
                String[] stringArray = 7b.0();
                if (!bl2) {
                    while (!bl2) {
                        if (n6 < this.b()) {
                            if (bl2 || bl2) break;
                            int n7 = n3 + n6 * this.h + this.t;
                            if (bl2 || bl2) break;
                            int n8 = this.h;
                            if (bl2 || bl2) break;
                            int n9 = this.h - this.4;
                            if (bl2 || bl2) break;
                            if (n7 <= this.e) {
                                if (bl2) break;
                                if (n7 + n8 < this.d) {
                                    if (bl2) break;
                                }
                            } else {
                                if (bl2) break;
                                this.a(n6, n2, n7, f2);
                                if (bl2) break;
                            }
                            if (bl2) break;
                            this.a(n6, n2, n7, n8 - n9, n4, n5, f2);
                            if (bl2 || bl2) break;
                            ++n6;
                            if (bl2) break;
                            if (stringArray != null) continue;
                            if (bl2) break;
                        }
                        if (!bl2) break block7;
                    }
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void 2() {
        block3: {
            block2: {
                boolean bl2 = \u200b\u200e\u2007\u2009;
                if (bl2 || bl2) break block2;
                this.1.forEach(bje::a);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a(int n2, int n3, int n4, int n5, int n6, int n7, float f2) {
        block3: {
            block2: {
                boolean bl2 = \u200b\u200e\u2007\u2009;
                if (bl2 || bl2) break block2;
                bje bje2 = this.1.get(n2);
                this.1.get(n2).a = n3;
                if (bl2) break block2;
                bje2.f = n4;
                if (bl2 || bl2) break block2;
                bje2.g();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    public final List<String> 3() {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2 || bl2) {
            return null;
        }
        return this.1.stream().map(bje::b).filter(string -> {
            boolean bl2 = \u200b\u200e\u2007\u2009;
            if (bl2 || bl2) return true;
            if (!string.trim().isEmpty()) {
                if (bl2) return true;
                return (int)((long)380216359 ^ (long)380216358) != 0;
            }
            if (!bl2) return (int)((long)-632161314 ^ (long)-632161314) != 0;
            return true;
        }).collect(Collectors.toList());
    }

    private bje 1() {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2 || bl2) {
            return null;
        }
        return this.1.get(this.1.size() - (int)((long)-1863077096 ^ (long)-1863077095));
    }

    public 79(blk object, 25 var2_2, int n2) {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        super(bib.z(), ((blk)object).l, ((blk)object).m, (int)((long)-1785401600 ^ (long)-1785401580), n2, (int)((long)1915706220 ^ (long)1915706228));
        this.1 = new ArrayList<bje>();
        this.3 = (int)((long)-1127458878 ^ (long)-1127459042);
        this.4 = (int)((long)-1762583773 ^ (long)-1762583753);
        this.2 = object;
        object = this;
        ((79)((Object)object)).1.clear();
        if (var2_2 != null) {
            ((79)((Object)object)).0 = var2_2;
        }
        if (((79)((Object)object)).0 != null) {
            ((79)((Object)object)).1.addAll(((79)((Object)object)).0.1.stream().map(((79)((Object)object))::1).collect(Collectors.toList()));
            if (((79)((Object)object)).o < 0 || ((79)((Object)object)).o > ((79)((Object)object)).1.size()) {
                ((79)((Object)object)).o = (int)((long)-1741497407 ^ (long)-1741497407);
            }
            if (super.0() != null) {
                super.0().b((boolean)((long)-554299095 ^ (long)-554299096));
            }
        }
        super.4();
    }

    /*
     * Unable to fully structure code
     */
    public final boolean 0(char var1_1, int var2_2) {
        var4_3 = 79.\u200b\u200e\u2007\u2009;
        if (var4_3) lbl-1000:
        // 6 sources

        {
            return true;
        }
        var3_4 = 7b.0();
        if (var4_3 || var4_3) ** GOTO lbl-1000
        switch (var1_1) {
            case '\t': {
                if (var4_3) ** GOTO lbl-1000
                if (this.0() == null) ** GOTO lbl14
                if (var4_3 || var4_3) ** GOTO lbl-1000
                this.0().b((boolean)((long)148781751 ^ (long)148781751));
                if (var4_3) ** GOTO lbl-1000
lbl14:
                // 2 sources

                if (!var4_3) ** break;
                ** continue;
                if (Keyboard.isKeyDown((int)((int)((long)-1014872230 ^ (long)-1014872208))) || Keyboard.isKeyDown((int)((int)((long)1788304743 ^ (long)1788304721)))) {
                    v0 = (int)((long)-705393947 ^ (long)705393946);
                    if (79.\u200b\u200e\u2007\u2009) {
                        throw null;
                    }
                } else {
                    v0 = (int)((long)931638097 ^ (long)931638096);
                }
                this.o += v0;
                if (this.o < this.b()) ** GOTO lbl27
                this.o = (int)((long)226484718 ^ (long)226484718);
                this.n = 0.0f;
                if (var3_4 != null) ** GOTO lbl30
lbl27:
                // 2 sources

                if (this.o < 0) {
                    this.o = this.b() - (int)((long)-1812356319 ^ (long)-1812356320);
                    this.n = this.b() * this.h;
                }
lbl30:
                // 4 sources

                this.0().b((boolean)((long)-2072347394 ^ (long)-2072347393));
                var1_1 = (char)(this.h * this.o);
                var2_2 = this.e - this.d - this.t;
                if (!((float)(var1_1 + this.h) > (float)var2_2 + this.n)) ** GOTO lbl36
                this.n = (float)(var1_1 - var2_2) + (float)this.h * 1.5f;
                if (var3_4 != null) ** GOTO lbl38
lbl36:
                // 2 sources

                if ((float)var1_1 < this.n) {
                    this.n = (float)var1_1 - (float)this.h * 0.5f;
                }
lbl38:
                // 4 sources

                return (boolean)((int)((long)-2066245582 ^ (long)-2066245581));
            }
        }
        if (this.0() != null && this.0().a(var1_1, var2_2)) {
            this.4();
            return (boolean)((int)((long)1015492895 ^ (long)1015492894));
        }
        return (boolean)((int)((long)973066968 ^ (long)973066968));
    }

    protected final int b() {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2 || bl2) {
            return -1682811489;
        }
        return this.1.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    private bje 0() {
        boolean bl2 = \u200b\u200e\u2007\u2009;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return this.1.get(this.o);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            if (bl2 || bl2) return null;
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void a(int n2, boolean bl2, int n3, int n4) {
        block3: {
            block2: {
                boolean bl3 = \u200b\u200e\u2007\u2009;
                if (bl3 || bl3) break block2;
                if (bl3) break block2;
                if (bl3) break block2;
                if (bl3) break block2;
                this.c();
                if (bl3 || bl3) break block2;
                if (bl3) break block2;
                if (bl3) break block2;
                if (bl3) break block2;
                if (bl3) break block2;
                if (bl3 || bl3) break block2;
                this.1.forEach(bje2 -> {
                    block3: {
                        block2: {
                            boolean bl2 = \u200b\u200e\u2007\u2009;
                            if (bl2 || bl2) break block2;
                            bje2.a(n3, n4, Mouse.getEventButton());
                            if (!bl2) break block3;
                        }
                        return;
                    }
                });
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }
}

