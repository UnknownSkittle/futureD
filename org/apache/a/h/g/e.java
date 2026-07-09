/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import org.apache.a.a;
import org.apache.a.i.f;

public final class e
extends InputStream {
    private final long a;
    private long b = 0L;
    private boolean c = false;
    private f d = null;

    public e(f f2, long l2) {
        this.d = ai.a(f2, "Session input buffer");
        this.a = ai.a(l2, "Content length");
    }

    @Override
    public final void close() {
        if (!this.c) {
            try {
                if (this.b < this.a) {
                    byte[] byArray = new byte[2048];
                    while (this.read(byArray) >= 0) {
                    }
                }
                return;
            } finally {
                this.c = true;
            }
        }
    }

    @Override
    public final int available() {
        if (this.d instanceof org.apache.a.i.a) {
            return Math.min(((org.apache.a.i.a)((Object)this.d)).b(), (int)(this.a - this.b));
        }
        return 0;
    }

    @Override
    public final int read() {
        if (this.c) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.b >= this.a) {
            return -1;
        }
        int n2 = this.d.f();
        if (n2 == -1) {
            if (this.b < this.a) {
                throw new a("Premature end of Content-Length delimited message body (expected: " + this.a + "; received: " + this.b);
            }
        } else {
            ++this.b;
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        if (this.c) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.b >= this.a) {
            return -1;
        }
        int n5 = n3;
        if (this.b + (long)n3 > this.a) {
            n5 = (int)(this.a - this.b);
        }
        if ((n4 = this.d.a(byArray, n2, n5)) == -1 && this.b < this.a) {
            throw new a("Premature end of Content-Length delimited message body (expected: " + this.a + "; received: " + this.b);
        }
        if (n4 > 0) {
            this.b += (long)n4;
        }
        return n4;
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public final long skip(long l2) {
        int n2;
        if (l2 <= 0L) {
            return 0L;
        }
        byte[] byArray = new byte[2048];
        long l3 = 0L;
        for (long i2 = Math.min(l2, this.a - this.b); i2 > 0L && (n2 = this.read(byArray, 0, (int)Math.min(2048L, i2))) != -1; i2 -= (long)n2) {
            l3 += (long)n2;
        }
        return l3;
    }
}

