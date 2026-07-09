/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bip
 */
package net.impactclient;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import net.impactclient.0as;
import net.impactclient.1;
import net.impactclient.2w;
import net.impactclient.5e;
import net.impactclient.7b;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 2
extends 1 {
    private String 1;
    public static final boolean \u200c\u2004;
    protected final 5e 2;
    private short 4;
    private final List<0as> 3;

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(bib bib2, int n2, int n3, float f2) {
        boolean bl2;
        block4: {
            block3: {
                String[] stringArray;
                block6: {
                    block5: {
                        bl2 = \u200c\u2004;
                        if (bl2) return;
                        stringArray = 7b.0();
                        if (bl2) return;
                        if (bl2) return;
                        if (!this.m) break block4;
                        if (bl2) return;
                        if (bl2) return;
                        short s2 = this.4;
                        this.4 = (short)(s2 + (int)((long)1673987748 ^ (long)1673987749));
                        if (s2 > (int)((long)805570599 ^ (long)805570605)) break block5;
                        if (bl2) return;
                        if (this.1.equals(this.j)) break block6;
                        if (bl2) return;
                    }
                    if (bl2) return;
                    this.4 = (short)((long)1672994134 ^ (long)1672994134);
                    if (bl2) return;
                    if (bl2) return;
                    this.0();
                    if (bl2) return;
                }
                if (bl2) return;
                this.n = this.0(n2, n3);
                if (bl2) return;
                if (bl2) return;
                float f3 = this.1();
                if (bl2) return;
                if (bl2) return;
                Pair<Color, Color> pair = this.0(f3);
                if (bl2) return;
                if (bl2) return;
                Iterator<0as> iterator = this.3.iterator();
                if (bl2) return;
                do {
                    if (bl2) return;
                    if (!iterator.hasNext()) break block3;
                    if (bl2) return;
                    0as as2 = iterator.next();
                    if (bl2) return;
                    if (bl2) return;
                    Pair<Color, Color> pair2 = pair;
                    this.1(as2.1(), as2.2() + as2.3(), as2.0(), this.h + Math.round(this.2.d * (float)this.f), this.f, f3, pair2.getLeft().getRGB(), pair2.getRight().getRGB());
                    if (bl2) return;
                    if (bl2) return;
                    this.0.a(as2.0, (float)as2.1(), (float)as2.2(), pair.getLeft().getRGB());
                    if (bl2) return;
                    if (bl2) return;
                    if (stringArray == null) break block4;
                    if (bl2) return;
                } while (stringArray != null);
                if (bl2) return;
            }
            if (bl2) return;
            this.1 = this.j;
            if (bl2) return;
        }
        if (bl2) return;
    }

    /*
     * Unable to fully structure code
     */
    private void 0() {
        block13: {
            block12: {
                block11: {
                    block10: {
                        block15: {
                            block14: {
                                var6_1 = net.impactclient.2.\u200c\u2004;
                                if (var6_1) lbl-1000:
                                // 42 sources

                                {
                                    return;
                                }
                                var1_2 = 7b.0();
                                if (var6_1 || var6_1) ** GOTO lbl-1000
                                if (this.j == null) break block14;
                                if (var6_1) ** GOTO lbl-1000
                                if (!this.j.isEmpty()) break block15;
                                if (var6_1) ** GOTO lbl-1000
                            }
                            if (var6_1) ** GOTO lbl-1000
                            this.3.clear();
                            if (var6_1 || var6_1) ** GOTO lbl-1000
                            return;
                        }
                        if (var6_1) ** GOTO lbl-1000
                        this.f = (int)((long)1373557162 ^ (long)1373557162);
                        if (var6_1 || var6_1) ** GOTO lbl-1000
                        this.g = (int)((long)-1019626875 ^ (long)-1019626875);
                        if (var6_1 || var6_1) ** GOTO lbl-1000
                        var3_3 = new Scanner(this.j);
                        if (var6_1 || var6_1) ** GOTO lbl-1000
                        var2_4 = (int)((long)-164295116 ^ (long)-164295116);
                        if (var6_1) ** GOTO lbl-1000
                        do {
                            block17: {
                                block16: {
                                    if (var6_1) ** GOTO lbl-1000
                                    if (!var3_3.hasNextLine()) break block10;
                                    if (var6_1 || var6_1) ** GOTO lbl-1000
                                    var4_5 = var3_3.nextLine();
                                    if (var6_1) ** GOTO lbl-1000
                                    try {
                                        if (var6_1) ** GOTO lbl-1000
                                        var5_6 = this.3.get(var2_4);
                                        if (var6_1 || var6_1) ** GOTO lbl-1000
                                        if (var1_2 == null) break block11;
                                        if (var6_1) ** GOTO lbl-1000
                                        ** if (!net.impactclient.2.\u200c\u2004) goto lbl-1000
                                    } catch (IndexOutOfBoundsException v0) {
                                        if (var6_1 || var6_1) ** GOTO lbl-1000
                                        var5_6 = null;
                                        if (var6_1) ** GOTO lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        throw null;
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                    }
                                    if (var6_1) ** GOTO lbl-1000
                                    if (var5_6 == null) break block16;
                                    if (var6_1) ** GOTO lbl-1000
                                    if (this.2 != var5_6.2) break block16;
                                    if (var6_1) ** GOTO lbl-1000
                                    if (var5_6.0.equals(var4_5)) break block17;
                                    if (var6_1) ** GOTO lbl-1000
                                }
                                if (var6_1) ** GOTO lbl-1000
                                var5_6 = new 0as(this, var2_4, var4_5);
                                if (var6_1) ** GOTO lbl-1000
                                try {
                                    if (var6_1) ** GOTO lbl-1000
                                    this.3.set(var2_4, var5_6);
                                    if (var6_1 || var6_1) ** GOTO lbl-1000
                                    ** if (!net.impactclient.2.\u200c\u2004) goto lbl-1000
                                } catch (IndexOutOfBoundsException v1) {
                                    if (var6_1 || var6_1) ** GOTO lbl-1000
                                    this.3.add(var2_4, var5_6);
                                    if (var6_1) ** GOTO lbl-1000
                                }
lbl-1000:
                                // 1 sources

                                {
                                    throw null;
                                }
lbl-1000:
                                // 1 sources

                                {
                                }
                            }
                            if (var6_1) ** GOTO lbl-1000
                            ++var2_4;
                            if (var6_1) ** GOTO lbl-1000
                        } while (var1_2 != null);
                        if (var6_1) ** GOTO lbl-1000
                    }
                    if (var6_1) ** GOTO lbl-1000
                    var3_3.close();
                    if (var6_1) ** GOTO lbl-1000
                }
                do {
                    if (var6_1) ** GOTO lbl-1000
                    if (var2_4 + (int)((long)-353942068 ^ (long)-353942067) >= this.3.size()) break block12;
                    if (var6_1 || var6_1) ** GOTO lbl-1000
                    this.3.remove(this.3.size() - (int)((long)-1953269486 ^ (long)-1953269485));
                    if (var6_1) ** GOTO lbl-1000
                    if (var1_2 == null) break block13;
                    if (var6_1) ** GOTO lbl-1000
                } while (var1_2 != null);
                if (var6_1) ** GOTO lbl-1000
            }
            if (var6_1) ** GOTO lbl-1000
            this.1();
            if (var6_1) ** GOTO lbl-1000
        }
        if (!var6_1) ** break;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected boolean 0(int n2, int n3) {
        boolean bl2 = true;
        do {
            int n4;
            block11: {
                block9: {
                    block10: {
                        block8: {
                            Iterator<0as> iterator;
                            boolean bl3;
                            block7: {
                                if (!bl2 || (bl2 = false)) break block7;
                                bl3 = \u200c\u2004;
                                if (bl3 || bl3) break block8;
                                iterator = this.3.iterator();
                                if (bl3) break block8;
                            }
                            if (bl3) break block8;
                            if (!iterator.hasNext()) {
                                return (int)((long)-2074322708 ^ (long)-2074322708) != 0;
                            }
                            if (bl3) break block8;
                            int n5 = n3;
                            int n6 = n2;
                            0as as2 = iterator.next();
                            if (bl3 || bl3) break block8;
                            if (n6 < as2.1()) break block9;
                            if (bl3) break block8;
                            if (n5 < as2.2()) break block9;
                            if (bl3) break block8;
                            if (n6 >= as2.1() + as2.0()) break block9;
                            if (bl3) break block8;
                            if (n5 >= as2.2() + as2.3()) break block9;
                            if (!bl3) break block10;
                        }
                        return true;
                    }
                    n4 = (int)((long)34541413 ^ (long)34541412);
                    if (\u200c\u2004) {
                        throw null;
                    }
                    break block11;
                }
                n4 = (int)((long)936783489 ^ (long)936783489);
            }
            if (n4 == 0) continue;
            return (int)((long)-1942039306 ^ (long)-1942039305) != 0;
        } while (!\u200c\u2004);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2) {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004;
                if (bl2 || bl2) break block2;
                super.0(bip2);
                if (bl2 || bl2) break block2;
                this.1();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public 2(int n2, int n3, int n4, 5e e2, String string, Runnable runnable) {
        boolean bl2 = \u200c\u2004;
        super(n2, n3, n4, (int)((long)574881056 ^ (long)574881056), (int)((long)286393931 ^ (long)286393931), string, runnable);
        this.4 = (short)((long)863511081 ^ (long)863511081);
        this.3 = new ArrayList<0as>();
        ((1)this).2 = (int)((long)-1822675827 ^ (long)-1822675828);
        this.2 = e2;
        this.1 = string;
        this.0();
        if (bl2 || bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final Pair<Color, Color> 0(float f2) {
        int n2;
        int n3;
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004;
                if (bl2 || bl2) break block2;
                n3 = 2w.0((int)((long)1626280405 ^ (long)-1625235942), (int)((long)486998847 ^ (long)-486998848), f2);
                n2 = (n3 & (int)((long)554022615 ^ (long)569985579)) >> (int)((long)1719057944 ^ (long)1719057946) | n3 & (int)((long)1864620228 ^ (long)-1876698940);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new ImmutablePair<Color, Color>(new Color(n3), new Color(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(bib bib2, int n2, int n3) {
        boolean bl2 = \u200c\u2004;
        if (bl2 || bl2) return true;
        if (this.l) {
            if (bl2) return true;
            if (this.m) {
                if (bl2) return true;
                if (this.0(n2, n3)) {
                    if (bl2) return true;
                    return (int)((long)1613249901 ^ (long)1613249900) != 0;
                }
            }
        }
        if (!bl2) return (int)((long)-138347531 ^ (long)-138347531) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void 1() {
        block3: {
            block2: {
                boolean bl2 = \u200c\u2004;
                if (bl2 || bl2) break block2;
                this.f = this.3.stream().mapToInt(0as::0).reduce(Math::max).orElse((int)((long)-1447693113 ^ (long)-1447693113));
                if (bl2 || bl2) break block2;
                this.g = this.3.stream().mapToInt(0as::3).reduce(Integer::sum).orElse((int)((long)-1496939771 ^ (long)-1496939771));
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

