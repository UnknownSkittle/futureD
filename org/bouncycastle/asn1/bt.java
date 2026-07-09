/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.asn1.by;
import org.bouncycastle.e.b.a;

final class bt
extends by {
    private static final byte[] b = new byte[0];
    private final int c;
    private int d;

    bt(InputStream inputStream, int n2) {
        super(inputStream, n2);
        if (n2 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.c = n2;
        this.d = n2;
        if (n2 == 0) {
            this.c();
        }
    }

    final int a() {
        return this.d;
    }

    public final int read() {
        if (this.d == 0) {
            return -1;
        }
        int n2 = this.a.read();
        if (n2 < 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        if (--this.d == 0) {
            this.c();
        }
        return n2;
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (this.d == 0) {
            return -1;
        }
        int n4 = this.a.read(byArray, n2, n3 = Math.min(n3, this.d));
        if (n4 < 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        if ((this.d -= n4) == 0) {
            this.c();
        }
        return n4;
    }

    final byte[] b() {
        if (this.d == 0) {
            return b;
        }
        byte[] byArray = new byte[this.d];
        if ((this.d -= org.bouncycastle.e.b.a.a(this.a, byArray)) != 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        this.c();
        return byArray;
    }
}

