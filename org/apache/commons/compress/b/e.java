/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

public class e
extends InputStream {
    private final InputStream a;
    private long b;
    private final long c;
    private final Checksum d;

    public e(Checksum checksum, InputStream inputStream, long l2, long l3) {
        this.d = checksum;
        this.a = inputStream;
        this.c = l3;
        this.b = l2;
    }

    @Override
    public int read() {
        if (this.b <= 0L) {
            return -1;
        }
        int n2 = this.a.read();
        if (n2 >= 0) {
            this.d.update(n2);
            --this.b;
        }
        if (this.b == 0L && this.c != this.d.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n2;
    }

    @Override
    public int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n2, int n3) {
        if ((n3 = this.a.read(byArray, n2, n3)) >= 0) {
            this.d.update(byArray, n2, n3);
            this.b -= (long)n3;
        }
        if (this.b <= 0L && this.c != this.d.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n3;
    }

    @Override
    public long skip(long l2) {
        if (this.read() >= 0) {
            return 1L;
        }
        return 0L;
    }

    @Override
    public void close() {
        this.a.close();
    }
}

