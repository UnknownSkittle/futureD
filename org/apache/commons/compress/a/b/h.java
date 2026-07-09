/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

import java.io.EOFException;
import org.apache.commons.compress.a.b.b;
import org.apache.commons.compress.a.b.d;
import org.apache.commons.compress.a.b.i;

final class h
extends d {
    private final long a;
    private long b;
    private /* synthetic */ b c;

    private h(b b2, long l2) {
        this.c = b2;
        super((byte)0);
        this.a = l2;
    }

    @Override
    final int a() {
        if (this.b < this.a) {
            return i.b;
        }
        return i.a;
    }

    @Override
    final int a(byte[] byArray, int n2, int n3) {
        int n4;
        n3 = (int)Math.min(this.a - this.b, (long)n3);
        for (int i2 = 0; i2 < n3; i2 += n4) {
            if (org.apache.commons.compress.a.b.b.a(this.c).a() > 0) {
                n4 = (int)org.apache.commons.compress.a.b.b.a(this.c, 8);
                byArray[n2 + i2] = org.apache.commons.compress.a.b.b.b(this.c).a((byte)n4);
                n4 = 1;
            } else {
                n4 = org.apache.commons.compress.a.b.b.c(this.c).read(byArray, n2 + i2, n3 - i2);
                if (n4 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                org.apache.commons.compress.a.b.b.b(this.c).a(byArray, n2 + i2, n4);
            }
            this.b += (long)n4;
        }
        return n3;
    }

    @Override
    final boolean b() {
        return this.b < this.a;
    }

    @Override
    final int c() {
        return (int)Math.min(this.a - this.b, org.apache.commons.compress.a.b.b.a(this.c).b() / 8L);
    }

    /* synthetic */ h(b b2, long l2, byte by2) {
        this(b2, l2);
    }
}

