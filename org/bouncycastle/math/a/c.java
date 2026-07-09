/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.a;

import org.bouncycastle.e.a;
import org.bouncycastle.math.a.e;

final class c
implements e {
    private int[] a;

    c(int[] nArray) {
        this.a = org.bouncycastle.e.a.b(nArray);
    }

    public final int a() {
        return this.a[this.a.length - 1];
    }

    public final int[] b() {
        return org.bouncycastle.e.a.b(this.a);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return org.bouncycastle.e.a.a(this.a, ((c)object).a);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.a(this.a);
    }
}

