/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  a
 *  bip
 */
package net.impactclient;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import net.impactclient.0a3;
import net.impactclient.0ab;
import net.impactclient.0ay;
import net.impactclient.0rB$1f;
import net.impactclient.3z;
import net.impactclient.46;
import net.impactclient.9e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0a7
extends 0a3 {
    private final DateFormat 2;
    public static final boolean \u2001\u200f\u2001\u2008\u2005\u2000\u200d\u2002\u200c;
    private final DateFormat 0;
    private static 9e 1;
    private final Date 3;

    /*
     * Enabled aggressive block sorting
     */
    public 0a7() {
        block3: {
            block2: {
                boolean bl2 = \u2001\u200f\u2001\u2008\u2005\u2000\u200d\u2002\u200c;
                if (bl2 || bl2) break block2;
                ((0ab)this).2 = new 3z();
                if (bl2 || bl2) break block2;
                this.3 = new Date();
                if (bl2 || bl2) break block2;
                this.2 = DateFormat.getDateInstance((int)((long)-81660665 ^ (long)-81660668), Locale.getDefault());
                if (bl2 || bl2) break block2;
                this.0 = DateFormat.getTimeInstance((int)((long)-1168360395 ^ (long)-1168360394), Locale.getDefault());
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(bip bip2) {
        block9: {
            block5: {
                int n2;
                int n3;
                boolean bl2;
                block8: {
                    String string;
                    String string2;
                    block7: {
                        block6: {
                            bl2 = \u2001\u200f\u2001\u2008\u2005\u2000\u200d\u2002\u200c;
                            if (bl2 || bl2) break block5;
                            if (1 != null) break block6;
                            if (bl2 || bl2) break block5;
                            1 = 0ay.3().5.0(9e.class);
                            if (bl2) break block5;
                        }
                        if (bl2) break block5;
                        n3 = (int)((long)-198996757 ^ (long)-198996757);
                        if (bl2) return;
                        if (bl2) break block5;
                        this.3.setTime(System.currentTimeMillis());
                        if (bl2 || bl2) break block5;
                        string2 = a.p + this.2.format(this.3).replace(0rB$1f.XNZw("\ub2a8", 1805588477), a.v + 0rB$1f.XNZw("\uc77b", 677143086) + a.p);
                        if (bl2 || bl2) break block5;
                        string = a.p + this.0.format(this.3);
                        if (bl2 || bl2) break block5;
                        if (!0a7.1.0R.1().equals((Object)46.b)) break block7;
                        if (bl2 || bl2) break block5;
                        n2 = Math.max((int)((long)-1912623034 ^ (long)-1912623034), this.0(bip2, string + 0rB$1f.XNZw("\ud58f", -1348177707) + string2, 0.0f, 0.0f, (int)((long)-87353724 ^ (long)95007808)));
                        if (bl2) break block5;
                        if (\u2001\u200f\u2001\u2008\u2005\u2000\u200d\u2002\u200c) {
                            throw null;
                        }
                        break block8;
                    }
                    if (bl2) break block5;
                    n2 = Math.max((int)((long)-981140510 ^ (long)-981140510), this.0(bip2, string, 0.0f, 0.0f, (int)((long)-1366252448 ^ (long)1374815908)));
                    if (bl2 || bl2) break block5;
                    n3 = (int)((long)-601698171 ^ (long)-601698171) + (bip2.a + (int)((long)-1274543598 ^ (long)-1274543600));
                    if (bl2 || bl2) break block5;
                    n2 = Math.min(n2, this.0(bip2, string2, 0.0f, n3, (int)((long)-1285341312 ^ (long)1275174212)));
                    if (bl2) break block5;
                }
                if (bl2) break block5;
                n3 += bip2.a;
                if (bl2 || bl2) break block5;
                ((0ab)this).1 = n2;
                if (bl2 || bl2) break block5;
                ((0ab)this).3 = n3;
                if (!bl2 && !bl2) break block9;
            }
            return;
        }
    }
}

