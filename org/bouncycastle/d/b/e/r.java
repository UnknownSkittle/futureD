/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import org.bouncycastle.b.e;
import org.bouncycastle.crypto.j;
import org.bouncycastle.d.b.e.d;
import org.bouncycastle.d.b.e.y;

public final class r {
    private final e a;
    private final y b;
    private final int c;
    private final int d;

    public r(int n2, int n3, j j2) {
        this.c = n2;
        this.d = n3;
        int n4 = n3;
        if (n2 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (n2 % n4 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        if (n2 / n4 == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        this.b = new y(n2 / n4, j2);
        this.a = org.bouncycastle.d.b.e.d.a(this.b.a().a(), this.b.b(), this.b.d().a().c(), this.c, n3);
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    protected final y c() {
        return this.b;
    }

    public final int d() {
        return this.b.b();
    }
}

