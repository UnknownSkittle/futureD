/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 */
package net.impactclient;

import java.util.function.Predicate;
import net.impactclient.0rG;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 0g
implements 0rG {
    private final int 1;
    public static final boolean \u2000\u2002\u200d\u2009\u2004\u2000\u2003\u2000\u2003;
    private final Predicate<vg> 0;

    @Override
    public final boolean 0(vg vg2) {
        boolean bl2 = \u2000\u2002\u200d\u2009\u2004\u2000\u2003\u2000\u2003;
        if (bl2 || bl2) {
            return true;
        }
        return this.0.test(vg2);
    }

    @Override
    public final int 0() {
        boolean bl2 = \u2000\u2002\u200d\u2009\u2004\u2000\u2003\u2000\u2003;
        if (bl2 || bl2) {
            return -755548327;
        }
        return this.1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0g(int n2, Predicate<vg> predicate) {
        block3: {
            block2: {
                boolean bl2 = \u2000\u2002\u200d\u2009\u2004\u2000\u2003\u2000\u2003;
                if (bl2 || bl2) break block2;
                this.1 = n2;
                if (bl2 || bl2) break block2;
                this.0 = predicate;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

