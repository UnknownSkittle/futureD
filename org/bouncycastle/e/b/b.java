/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e.b;

import java.io.InputStream;
import java.io.OutputStream;

public final class b
extends InputStream {
    private final InputStream a;
    private final OutputStream b;

    public b(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    public final int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    public final int read(byte[] byArray, int n2, int n3) {
        if ((n3 = this.a.read(byArray, n2, n3)) > 0) {
            this.b.write(byArray, n2, n3);
        }
        return n3;
    }

    public final int read() {
        int n2 = this.a.read();
        if (n2 >= 0) {
            this.b.write(n2);
        }
        return n2;
    }

    public final void close() {
        this.a.close();
        this.b.close();
    }
}

