/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.g;

import com.a.a.b.ai;
import java.io.IOException;
import java.io.InputStream;
import org.apache.a.ah;
import org.apache.a.d.d;
import org.apache.a.e;
import org.apache.a.h.g.a;
import org.apache.a.i.f;
import org.apache.a.m;
import org.apache.a.n.b;
import org.apache.a.w;

public final class c
extends InputStream {
    private final f a;
    private final b b;
    private final d c;
    private int d;
    private long e;
    private long f;
    private boolean g = false;
    private boolean h = false;
    private e[] i = new e[0];

    public c(f f2, d d2) {
        this.a = ai.a(f2, "Session input buffer");
        this.f = 0L;
        this.b = new b(16);
        this.c = org.apache.a.d.d.a;
        this.d = 1;
    }

    @Override
    public final int available() {
        if (this.a instanceof org.apache.a.i.a) {
            return (int)Math.min((long)((org.apache.a.i.a)((Object)this.a)).b(), this.e - this.f);
        }
        return 0;
    }

    @Override
    public final int read() {
        int n2;
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.g) {
            return -1;
        }
        if (this.d != 2) {
            this.a();
            if (this.g) {
                return -1;
            }
        }
        if ((n2 = this.a.f()) != -1) {
            ++this.f;
            if (this.f >= this.e) {
                this.d = 3;
            }
        }
        return n2;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4;
        if (this.h) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.g) {
            return -1;
        }
        if (this.d != 2) {
            this.a();
            if (this.g) {
                return -1;
            }
        }
        if ((n4 = this.a.a(byArray, n2, (int)Math.min((long)n3, this.e - this.f))) != -1) {
            this.f += (long)n4;
            if (this.f >= this.e) {
                this.d = 3;
            }
            return n4;
        }
        this.g = true;
        throw new ah("Truncated chunk ( expected size: " + this.e + "; actual size: " + this.f + ")");
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    private void a() {
        if (this.d == Integer.MAX_VALUE) {
            throw new w("Corrupt data stream");
        }
        try {
            this.e = this.b();
            if (this.e < 0L) {
                throw new w("Negative chunk size");
            }
            this.d = 2;
            this.f = 0L;
            if (this.e == 0L) {
                this.g = true;
                this.c();
            }
            return;
        } catch (w w2) {
            this.d = Integer.MAX_VALUE;
            throw w2;
        }
    }

    private long b() {
        switch (this.d) {
            case 3: {
                this.b.a();
                if (this.a.a(this.b) == -1) {
                    throw new w("CRLF expected at end of chunk");
                }
                if (!this.b.c()) {
                    throw new w("Unexpected content at the end of chunk");
                }
                this.d = 1;
            }
            case 1: {
                this.b.a();
                if (this.a.a(this.b) == -1) {
                    throw new org.apache.a.a("Premature end of chunk coded message body: closing chunk expected");
                }
                int n2 = this.b.b(59);
                if (n2 < 0) {
                    n2 = this.b.length();
                }
                String string = this.b.b(0, n2);
                try {
                    return Long.parseLong(string, 16);
                } catch (NumberFormatException numberFormatException) {
                    throw new w("Bad chunk header: ".concat(String.valueOf(string)));
                }
            }
        }
        throw new IllegalStateException("Inconsistent codec state");
    }

    private void c() {
        try {
            this.i = org.apache.a.h.g.a.a(this.a, this.c.b(), this.c.a());
            return;
        } catch (m m2) {
            w w2 = new w("Invalid footer: " + m2.getMessage());
            w2.initCause(m2);
            throw w2;
        }
    }

    @Override
    public final void close() {
        if (!this.h) {
            try {
                if (!this.g && this.d != Integer.MAX_VALUE) {
                    byte[] byArray = new byte[2048];
                    while (this.read(byArray) >= 0) {
                    }
                }
                return;
            } finally {
                this.g = true;
                this.h = true;
            }
        }
    }
}

