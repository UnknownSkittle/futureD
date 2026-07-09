/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.3W;
import net.impactclient.7f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface 1c
extends 7f,
3W<Boolean> {
    public static final boolean \u2002\u200f\u200d\u200a;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    default public void 0(boolean bl2) {
        boolean bl3 = \u2002\u200f\u200d\u200a;
        if (bl3 || bl3) return;
        this.0(Boolean.valueOf(bl2));
        if (bl3 || bl3) return;
        if (this.4()) {
            if (bl3 || bl3) return;
            this.2();
            if (bl3) return;
            return;
        }
        if (bl3) return;
        this.1();
        if (!bl3 && !bl3) return;
    }

    @Override
    default public boolean 4() {
        boolean bl2 = \u2002\u200f\u200d\u200a;
        if (bl2 || bl2) {
            return true;
        }
        return (Boolean)this.1();
    }
}

