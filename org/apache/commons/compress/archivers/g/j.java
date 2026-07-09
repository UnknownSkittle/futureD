/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import org.apache.commons.compress.archivers.g.ax;

public final class j
implements Cloneable {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private int e;
    private int f;

    public final boolean a() {
        return this.a;
    }

    public final void b() {
        this.a = false;
    }

    public final boolean c() {
        return this.b;
    }

    public final void d() {
        this.b = true;
    }

    public final boolean e() {
        return this.c;
    }

    final int f() {
        return this.e;
    }

    final int g() {
        return this.f;
    }

    public final void a(byte[] byArray) {
        ax.a((this.b ? 8 : 0) | (this.a ? 2048 : 0) | (this.c ? 1 : 0) | (this.d ? 64 : 0), byArray, 8);
    }

    public static j b(byte[] byArray) {
        int n2 = ax.a(byArray, 6);
        j j2 = new j();
        new j().b = (n2 & 8) != 0;
        j2.a = (n2 & 0x800) != 0;
        boolean bl2 = (n2 & 0x40) != 0;
        j j3 = j2;
        j2.d = bl2;
        if (bl2) {
            j3.c = true;
        }
        j2.c = (n2 & 1) != 0;
        j2.e = (n2 & 2) != 0 ? 8192 : 4096;
        j2.f = (n2 & 4) != 0 ? 3 : 2;
        return j2;
    }

    public final int hashCode() {
        return 3 * (7 * (13 * (17 * (this.c ? 1 : 0) + (this.d ? 1 : 0)) + (this.a ? 1 : 0)) + (this.b ? 1 : 0));
    }

    public final boolean equals(Object object) {
        if (!(object instanceof j)) {
            return false;
        }
        object = (j)object;
        return ((j)object).c == this.c && ((j)object).d == this.d && ((j)object).a == this.a && ((j)object).b == this.b;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", cloneNotSupportedException);
        }
    }
}

