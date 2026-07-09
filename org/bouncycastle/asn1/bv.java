/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.asn1.by;

final class bv
extends by {
    private int b;
    private int c;
    private boolean d = false;
    private boolean e = true;

    bv(InputStream inputStream, int n2) {
        super(inputStream, n2);
        this.b = inputStream.read();
        this.c = inputStream.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        this.b();
    }

    final void a(boolean bl2) {
        this.e = bl2;
        this.b();
    }

    private boolean b() {
        if (!this.d && this.e && this.b == 0 && this.c == 0) {
            this.d = true;
            this.c();
        }
        return this.d;
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if (this.e || n3 < 3) {
            return super.read(byArray, n2, n3);
        }
        if (this.d) {
            return -1;
        }
        if ((n3 = this.a.read(byArray, n2 + 2, n3 - 2)) < 0) {
            throw new EOFException();
        }
        byArray[n2] = (byte)this.b;
        byArray[n2 + 1] = (byte)this.c;
        this.b = this.a.read();
        this.c = this.a.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        return n3 + 2;
    }

    public final int read() {
        if (this.b()) {
            return -1;
        }
        int n2 = this.a.read();
        if (n2 < 0) {
            throw new EOFException();
        }
        int n3 = this.b;
        this.b = this.c;
        this.c = n2;
        return n3;
    }
}

