/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.i;

import org.bouncycastle.e.a;

public final class f {
    private int a;
    private byte[] b;
    private int c;

    public f(byte[] byArray, int n2) {
        this(byArray, n2, 0);
    }

    private f(byte[] byArray, int n2, byte by2) {
        this.b = byArray;
        this.c = n2;
        this.a = -1;
    }

    public final int a() {
        return this.c;
    }

    public final byte[] b() {
        return this.b;
    }

    public final int hashCode() {
        return this.c ^ org.bouncycastle.e.a.c(this.b);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (((f)object).c != this.c) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.b, ((f)object).b);
    }
}

