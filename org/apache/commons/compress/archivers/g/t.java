/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;

public final class t
implements au {
    private static final ax a = new ax(44225);
    private byte[] b;

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        return new ax(this.b == null ? 0 : this.b.length);
    }

    @Override
    public final ax d() {
        return this.f();
    }

    @Override
    public final byte[] e() {
        return ay.b(this.b);
    }

    @Override
    public final byte[] c() {
        return ay.b(this.b);
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        this.b = new byte[n3];
        System.arraycopy(byArray, n2, this.b, 0, n3);
    }
}

