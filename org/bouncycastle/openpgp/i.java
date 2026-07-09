/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.openpgp.h;

public final class i
extends InputStream {
    int[] a = new int[22];
    int b;
    private InputStream c;
    private /* synthetic */ h d;

    i(h h2, InputStream inputStream) {
        this.d = h2;
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            this.a[i2] = inputStream.read();
            if (this.a[i2] >= 0) continue;
            throw new EOFException();
        }
        this.b = 0;
        this.c = inputStream;
    }

    public final int read() {
        int n2 = this.c.read();
        if (n2 >= 0) {
            int n3 = this.a[this.b];
            this.a[this.b] = n2;
            this.b = (this.b + 1) % this.a.length;
            return n3;
        }
        return -1;
    }
}

