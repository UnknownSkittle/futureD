/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.function.Supplier;
import net.impactclient.20;
import net.impactclient.44;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class 2W
extends 20 {
    private /* synthetic */ Supplier 1;
    public static final boolean \u2002\u2002;

    2W(44 var1_1, Supplier supplier) {
        boolean bl2 = \u2002\u2002;
        this.1 = supplier;
        super(var1_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void 0(int n2, int n3, boolean bl2, float f2) {
        block3: {
            block2: {
                boolean bl3 = \u2002\u2002;
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

