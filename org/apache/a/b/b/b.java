/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.b;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.a.b.b.c;

public final class b
extends InputStream {
    private final InputStream a;

    public b(InputStream inputStream) {
        inputStream = new PushbackInputStream(inputStream, 2);
        int n2 = ((PushbackInputStream)inputStream).read();
        int n3 = ((PushbackInputStream)inputStream).read();
        if (n2 == -1 || n3 == -1) {
            throw new ZipException("Unexpected end of stream");
        }
        ((PushbackInputStream)inputStream).unread(n3);
        ((PushbackInputStream)inputStream).unread(n2);
        boolean bl2 = true;
        int n4 = (n2 &= 0xFF) & 0xF;
        int n5 = n2 >> 4 & 0xF;
        if (n4 == 8 && n5 <= 7 && (n2 << 8 | (n3 &= 0xFF)) % 31 == 0) {
            bl2 = false;
        }
        this.a = new c(inputStream, new Inflater(bl2));
    }

    @Override
    public final int read() {
        return this.a.read();
    }

    @Override
    public final int read(byte[] byArray) {
        return this.a.read(byArray);
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        return this.a.read(byArray, n2, n3);
    }

    @Override
    public final long skip(long l2) {
        return this.a.skip(l2);
    }

    @Override
    public final int available() {
        return this.a.available();
    }

    @Override
    public final void mark(int n2) {
        this.a.mark(n2);
    }

    @Override
    public final void reset() {
        this.a.reset();
    }

    @Override
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override
    public final void close() {
        this.a.close();
    }
}

