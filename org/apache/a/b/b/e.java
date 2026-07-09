/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.b;

import java.io.InputStream;
import org.apache.a.b.b.d;

final class e
extends InputStream {
    private final InputStream a;
    private final d b;
    private InputStream c;

    public e(InputStream inputStream, d d2) {
        this.a = inputStream;
        this.b = d2;
    }

    private void a() {
        if (this.c == null) {
            this.c = this.b.a(this.a);
        }
    }

    @Override
    public final int read() {
        this.a();
        return this.c.read();
    }

    @Override
    public final int read(byte[] byArray) {
        this.a();
        return this.c.read(byArray);
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        this.a();
        return this.c.read(byArray, n2, n3);
    }

    @Override
    public final long skip(long l2) {
        this.a();
        return this.c.skip(l2);
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int available() {
        this.a();
        return this.c.available();
    }

    @Override
    public final void close() {
        try {
            if (this.c != null) {
                this.c.close();
            }
            return;
        } finally {
            this.a.close();
        }
    }
}

