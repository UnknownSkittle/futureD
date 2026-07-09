/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.av;
import org.apache.commons.compress.archivers.g.ax;

public abstract class a
implements au {
    private long a;
    private byte[] b;
    private byte[] c;

    protected a() {
    }

    private void g() {
        if (this.b == null) {
            return;
        }
        this.c = new byte[5 + this.b.length];
        this.c[0] = 1;
        System.arraycopy(av.a(this.a), 0, this.c, 1, 4);
        System.arraycopy(this.b, 0, this.c, 5, this.b.length);
    }

    public final long a_() {
        return this.a;
    }

    public final byte[] b() {
        byte[] byArray = null;
        if (this.b != null) {
            byArray = new byte[this.b.length];
            System.arraycopy(this.b, 0, byArray, 0, byArray.length);
        }
        return byArray;
    }

    @Override
    public final byte[] c() {
        if (this.c == null) {
            this.g();
        }
        byte[] byArray = null;
        if (this.c != null) {
            byArray = new byte[this.c.length];
            System.arraycopy(this.c, 0, byArray, 0, byArray.length);
        }
        return byArray;
    }

    @Override
    public final ax d() {
        if (this.c == null) {
            this.g();
        }
        return new ax(this.c != null ? this.c.length : 0);
    }

    @Override
    public final byte[] e() {
        return this.c();
    }

    @Override
    public final ax f() {
        return this.d();
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        if (n3 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte by2 = byArray[n2];
        if (by2 != 1) {
            throw new ZipException("Unsupported version [" + by2 + "] for UniCode path extra data.");
        }
        this.a = av.b(byArray, n2 + 1);
        this.b = new byte[n3 - 5];
        System.arraycopy(byArray, n2 + 5, this.b, 0, n3 - 5);
        this.c = null;
    }
}

