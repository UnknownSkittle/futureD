/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.crypto.j;
import org.bouncycastle.d.b.e.e;
import org.bouncycastle.d.b.e.m;
import org.bouncycastle.d.b.e.x;

public final class y {
    private final org.bouncycastle.b.e a;
    private final m b;
    private final int c;
    private final int d;

    public y(int n2, j j2) {
        if (n2 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (j2 == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = new m(new x(j2));
        this.c = n2;
        this.d = this.f();
        this.a = e.a(this.a().a(), this.b(), this.b.a().c(), n2);
    }

    private int f() {
        for (int i2 = 2; i2 <= this.c; ++i2) {
            if ((this.c - i2) % 2 != 0) continue;
            return i2;
        }
        throw new IllegalStateException("should never happen...");
    }

    protected final j a() {
        return this.b.a().a();
    }

    public final int b() {
        return this.b.a().b();
    }

    public final int c() {
        return this.c;
    }

    final m d() {
        return this.b;
    }

    final int e() {
        return this.d;
    }
}

