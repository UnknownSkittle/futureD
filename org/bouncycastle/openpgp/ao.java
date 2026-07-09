/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import org.bouncycastle.b.ap;

public final class ao {
    ap[] a;

    ao(ap[] apArray) {
        this.a = apArray;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ao) {
            object = (ao)object;
            if (((ao)object).a.length != this.a.length) {
                return false;
            }
            for (int i2 = 0; i2 != this.a.length; ++i2) {
                if (((ao)object).a[i2].equals(this.a[i2])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = 0;
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            n2 ^= this.a[i2].hashCode();
        }
        return n2;
    }
}

