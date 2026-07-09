/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.InputStream;

public final class c
extends InputStream {
    private final InputStream a;
    private long b;

    public c(InputStream inputStream, long l2) {
        this.a = inputStream;
        this.b = l2;
    }

    @Override
    public final int read() {
        if (this.b > 0L) {
            --this.b;
            return this.a.read();
        }
        return -1;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        if (this.b == 0L) {
            return -1;
        }
        int n5 = n3;
        if ((long)n3 > this.b) {
            n5 = (int)this.b;
        }
        if ((n4 = this.a.read(byArray, n2, n5)) >= 0) {
            this.b -= (long)n4;
        }
        return n4;
    }

    @Override
    public final void close() {
    }
}

