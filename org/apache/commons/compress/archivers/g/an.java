/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.InputStream;
import org.apache.commons.compress.archivers.g.al;
import org.apache.commons.compress.archivers.g.ao;
import org.apache.commons.compress.b.h;

final class an
extends InputStream {
    private final InputStream a;
    private final long b;
    private long c = 0L;
    private /* synthetic */ al d;

    public an(al al2, InputStream inputStream, long l2) {
        this.d = al2;
        this.b = l2;
        this.a = inputStream;
    }

    @Override
    public final int read() {
        if (this.b >= 0L && this.c >= this.b) {
            return -1;
        }
        int n2 = this.a.read();
        ++this.c;
        al.a(this.d);
        ao.h(al.b(this.d));
        return n2;
    }

    @Override
    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        if (this.b >= 0L && this.c >= this.b) {
            return -1;
        }
        long l2 = this.b >= 0L ? Math.min((long)n3, this.b - this.c) : (long)n3;
        int n4 = this.a.read(byArray, n2, (int)l2);
        if (n4 == -1) {
            return -1;
        }
        this.c += (long)n4;
        al.a(this.d, n4);
        ao ao2 = al.b(this.d);
        ao.a(ao2, ao.f(ao2) + (long)n4);
        return n4;
    }

    @Override
    public final long skip(long l2) {
        long l3 = this.b >= 0L ? Math.min(l2, this.b - this.c) : l2;
        long l4 = h.a(this.a, l3);
        this.c += l4;
        return l4;
    }

    @Override
    public final int available() {
        if (this.b >= 0L && this.c >= this.b) {
            return 0;
        }
        return this.a.available();
    }
}

