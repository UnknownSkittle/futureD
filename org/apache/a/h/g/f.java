/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.i.g;

public final class f
extends OutputStream {
    private final g a;
    private final long b;
    private long c = 0L;
    private boolean d = false;

    public f(g g2, long l2) {
        this.a = ai.a(g2, "Session output buffer");
        this.b = ai.a(l2, "Content length");
    }

    @Override
    public final void close() {
        if (!this.d) {
            this.d = true;
            this.a.c();
        }
    }

    @Override
    public final void flush() {
        this.a.c();
    }

    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            long l2 = this.b - this.c;
            int n4 = n3;
            if ((long)n3 > l2) {
                n4 = (int)l2;
            }
            this.a.a(byArray, n2, n4);
            this.c += (long)n4;
        }
    }

    @Override
    public final void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public final void write(int n2) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            this.a.a(n2);
            ++this.c;
        }
    }
}

