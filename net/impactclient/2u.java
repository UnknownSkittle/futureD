/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Supplier;
import net.impactclient.27;
import net.impactclient.3F;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 2u
extends 27 {
    public static final boolean \u2006\u2004\u2008\u200f\u2007\u2003\u2001\u2007\u2005;
    private /* synthetic */ Supplier 1;

    2u(3F f2, Supplier supplier) {
        boolean bl2 = \u2006\u2004\u2008\u200f\u2007\u2003\u2001\u2007\u2005;
        this.1 = supplier;
        super(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, boolean bl2, float f2) {
        block3: {
            block2: {
                boolean bl3 = \u2006\u2004\u2008\u200f\u2007\u2003\u2001\u2007\u2005;
                if (bl3 || bl3) break block2;
                this.0 = (Boolean)this.1.get();
                if (bl3 || bl3) break block2;
                super.0(n2, n3, bl2, f2);
                if (!bl3 && !bl3) break block3;
            }
            return;
        }
    }
}

