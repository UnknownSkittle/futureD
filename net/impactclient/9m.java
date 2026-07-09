/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.0av;
import net.impactclient.45;
import net.impactclient.4t;
import net.impactclient.73;
import net.impactclient.75;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class 9m<T extends 73>
extends 7b {
    public static final boolean \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
    private static String[] 3;
    public final T 5;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(boolean bl2) {
        boolean bl3 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
        if (bl3 || bl3) return;
        this.1 = bl2;
        if (bl3 || bl3) return;
        if (bl2) {
            if (bl3 || bl3) return;
            if (((7b)this.5).4()) {
                if (bl3 || bl3) return;
                this.2();
                if (bl3 || bl3) return;
                if (this.1) {
                    if (bl3 || bl3) return;
                    4t.1.subscribe(this);
                    if (bl3) return;
                    return;
                }
            }
        } else {
            if (bl3) return;
            4t.1.unsubscribe(this);
            if (bl3 || bl3) return;
            this.1();
            if (bl3) return;
        }
        if (!bl3) return;
    }

    public final 73 0() {
        boolean bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
        if (bl2 || bl2) {
            return null;
        }
        return this.5;
    }

    static {
        block5: {
            boolean bl2;
            block6: {
                block4: {
                    bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
                    if (!bl2) break block4;
                    break block5;
                }
                if (9m.0() == null) break block6;
                if (bl2) break block5;
                9m.0(new String[(int)((long)1566664354 ^ (long)1566664355)]);
                if (bl2) break block5;
            }
            if (!bl2) {
                // empty if block
            }
        }
    }

    public 9m(T t2, String string, String string2) {
        boolean bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
        super(string, string2);
        this.5 = t2;
        this.4 = new 75(0av.a, (int)((long)-280240911 ^ (long)-280240911), var2_2 -> {
            block8: {
                int n2;
                block9: {
                    block7: {
                        boolean bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
                        if (bl2 || bl2) break block7;
                        if (var2_2 != 45.a) break block8;
                        if (!bl2 && !bl2) break block9;
                    }
                    return;
                }
                73 v0 = t2;
                if (v0.5() != this || !t2.4()) {
                    n2 = (int)((long)-1623601114 ^ (long)-1623601113);
                    if (\u2006\u2005\u2000\u2000\u2003\u200a\u2008) {
                        throw null;
                    }
                } else {
                    n2 = (int)((long)1120392587 ^ (long)1120392587);
                }
                v0.0(n2 != 0);
                t2.0(this);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void 0(String[] stringArray) {
        block3: {
            block2: {
                boolean bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
                if (bl2) break block2;
                3 = stringArray;
                if (!bl2) break block3;
            }
            return;
        }
    }

    public static String[] 0() {
        boolean bl2 = \u2006\u2005\u2000\u2000\u2003\u200a\u2008;
        if (bl2) {
            return null;
        }
        return 3;
    }
}

