/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Objects;
import net.impactclient.0rh;
import net.impactclient.1_;
import net.impactclient.3W;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 2J
extends 1_<0rh, String, 2J> {
    public String[] 2;
    public static final boolean \u200f\u2001;

    /*
     * Enabled aggressive block sorting
     */
    public 2J() {
        boolean bl2 = \u200f\u2001;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final /* synthetic */ 3W 1() {
        2J j2;
        block3: {
            block2: {
                boolean bl2 = \u200f\u2001;
                if (bl2 || bl2) break block2;
                j2 = this;
                Objects.requireNonNull(j2.2);
                if (!bl2 && !bl2) break block3;
            }
            return null;
        }
        return new 0rh(j2.3, j2.1, j2.0, j2.2);
    }
}

