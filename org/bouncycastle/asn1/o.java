/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.e.a;

final class o {
    private final int a;
    private final byte[] b;

    o(byte[] byArray) {
        this.a = org.bouncycastle.e.a.c(byArray);
        this.b = byArray;
    }

    public final int hashCode() {
        return this.a;
    }

    public final boolean equals(Object object) {
        if (object instanceof o) {
            return org.bouncycastle.e.a.a(this.b, ((o)object).b);
        }
        return false;
    }
}

