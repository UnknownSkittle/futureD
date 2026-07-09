/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.FilterInputStream;
import java.io.InputStream;

public class g
extends FilterInputStream {
    private long a;

    public g(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() {
        int n2 = this.in.read();
        if (n2 >= 0) {
            this.a(1L);
        }
        return n2;
    }

    @Override
    public int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n2, int n3) {
        int n4 = this.in.read(byArray, n2, n3);
        if (n4 >= 0) {
            this.a(n4);
        }
        return n4;
    }

    private void a(long l2) {
        if (l2 != -1L) {
            this.a += l2;
        }
    }

    public final long a() {
        return this.a;
    }
}

