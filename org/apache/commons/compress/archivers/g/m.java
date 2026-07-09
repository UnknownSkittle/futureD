/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;

public abstract class m
implements au {
    private final ax a;
    private byte[] b;

    protected m(ax ax2) {
        this.a = ax2;
    }

    @Override
    public final ax a() {
        return this.a;
    }

    @Override
    public final ax f() {
        return new ax(this.b != null ? this.b.length : 0);
    }

    @Override
    public final byte[] e() {
        return ay.b(this.b);
    }

    @Override
    public final ax d() {
        return this.f();
    }

    @Override
    public final byte[] c() {
        return ay.b(this.b);
    }

    @Override
    public void a(byte[] byArray, int n2, int n3) {
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        this.b = ay.b(byArray2);
    }
}

