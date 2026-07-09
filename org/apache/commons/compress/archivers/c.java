/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers;

import java.io.InputStream;
import org.apache.commons.compress.archivers.a;

public abstract class c
extends InputStream {
    private final byte[] a = new byte[1];
    private long b = 0L;

    public abstract a a();

    @Override
    public int read() {
        c c2 = this;
        if (c2.read(c2.a, 0, 1) == -1) {
            return -1;
        }
        return this.a[0] & 0xFF;
    }

    protected final void a(int n2) {
        this.a((long)n2);
    }

    protected final void a(long l2) {
        if (l2 != -1L) {
            this.b += l2;
        }
    }

    protected final void b(long l2) {
        this.b -= l2;
    }

    public long b() {
        return this.b;
    }

    public boolean a(a a2) {
        return true;
    }
}

