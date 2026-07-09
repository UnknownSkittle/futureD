/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import org.bouncycastle.e.a;

public final class d {
    private byte[] a;
    private int b;

    public d(byte[] byArray, int n2) {
        this.a = byArray;
        this.b = n2;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (((d)object).b != this.b) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.a, ((d)object).a);
    }

    public final int hashCode() {
        return this.b ^ org.bouncycastle.e.a.c(this.a);
    }
}

