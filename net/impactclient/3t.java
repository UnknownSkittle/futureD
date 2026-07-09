/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Optional;
import net.impactclient.1t;
import net.impactclient.2O;
import net.impactclient.3Z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
interface 3t {
    public static final boolean \u2001\u200d;

    public 3Z 1();

    /*
     * Enabled aggressive block sorting
     */
    default public Optional<3Z> 0() {
        3Z z2;
        boolean bl2;
        block8: {
            block7: {
                bl2 = \u2001\u200d;
                if (bl2 || bl2) return null;
                z2 = 1t.0(2O.0(this.1()));
                if (z2 == null) break block7;
                if (bl2) return null;
                if (z2.1 >= 1.0001) break block7;
                if (bl2) return null;
                if (!(z2.1 < 0.0)) break block8;
                if (bl2) return null;
            }
            if (bl2) return null;
            return Optional.empty();
        }
        if (!bl2) return Optional.of(z2);
        return null;
    }
}

