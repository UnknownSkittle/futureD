/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

import java.io.InputStream;
import org.apache.commons.compress.a.b.b;
import org.apache.commons.compress.b.h;

public final class a
extends org.apache.commons.compress.a.a {
    private InputStream a;
    private b b;
    private long c;
    private final byte[] d = new byte[1];

    public a(InputStream inputStream) {
        this(new b(inputStream));
        this.a = inputStream;
    }

    private a(b b2) {
        this.b = b2;
    }

    @Override
    public final int read() {
        int n2;
        block5: while (true) {
            a a2 = this;
            n2 = a2.read(a2.d);
            switch (n2) {
                case 1: {
                    return this.d[0] & 0xFF;
                }
                case -1: {
                    return -1;
                }
                case 0: {
                    continue block5;
                }
            }
            break;
        }
        throw new IllegalStateException("Invalid return value from read: ".concat(String.valueOf(n2)));
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = -1;
        if (this.b != null) {
            n4 = this.b.a(byArray, n2, n3);
            this.c = this.b.a();
            this.a(n4);
            if (n4 == -1) {
                this.a();
            }
        }
        return n4;
    }

    @Override
    public final int available() {
        if (this.b != null) {
            return this.b.b();
        }
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void close() {
        try {
            this.a();
            if (this.a == null) return;
        } catch (Throwable throwable) {
            if (this.a == null) throw throwable;
            this.a.close();
            this.a = null;
            throw throwable;
        }
        this.a.close();
        this.a = null;
    }

    private void a() {
        h.a(this.b);
        this.b = null;
    }
}

