/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;

final class e
extends InputStream {
    private final ByteBuffer a;
    private final SeekableByteChannel b;
    private long c;

    public e(SeekableByteChannel seekableByteChannel, long l2) {
        this.b = seekableByteChannel;
        this.c = l2;
        if (l2 < 8192L && l2 > 0L) {
            this.a = ByteBuffer.allocate((int)l2);
            return;
        }
        this.a = ByteBuffer.allocate(8192);
    }

    @Override
    public final int read() {
        if (this.c > 0L) {
            --this.c;
            int n2 = this.a(1);
            if (n2 < 0) {
                return n2;
            }
            return this.a.get() & 0xFF;
        }
        return -1;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        ByteBuffer byteBuffer;
        if (this.c == 0L) {
            return -1;
        }
        int n4 = n3;
        if ((long)n3 > this.c) {
            n4 = (int)this.c;
        }
        if (n4 <= this.a.capacity()) {
            byteBuffer = this.a;
            n3 = this.a(n4);
        } else {
            byteBuffer = ByteBuffer.allocate(n4);
            n3 = this.b.read(byteBuffer);
            byteBuffer.flip();
        }
        if (n3 >= 0) {
            byteBuffer.get(byArray, n2, n3);
            this.c -= (long)n3;
        }
        return n3;
    }

    private int a(int n2) {
        this.a.rewind().limit(n2);
        n2 = this.b.read(this.a);
        this.a.flip();
        return n2;
    }

    @Override
    public final void close() {
    }
}

