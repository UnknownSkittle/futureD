/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.b;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class h {
    private static final byte[] a = new byte[4096];

    public static long a(InputStream inputStream, long l2) {
        int n2;
        long l3;
        long l4 = l2;
        while (l2 > 0L && (l3 = inputStream.skip(l2)) != 0L) {
            l2 -= l3;
        }
        while (l2 > 0L && (n2 = h.a(inputStream, a, 0, (int)Math.min(l2, 4096L))) > 0) {
            l2 -= (long)n2;
        }
        return l4 - l2;
    }

    public static int a(InputStream inputStream, byte[] byArray) {
        return h.a(inputStream, byArray, 0, byArray.length);
    }

    public static int a(InputStream inputStream, byte[] byArray, int n2, int n3) {
        int n4;
        int n5;
        if (n3 < 0 || n2 < 0 || n3 + n2 > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        for (n4 = 0; n4 != n3 && (n5 = inputStream.read(byArray, n2 + n4, n3 - n4)) != -1; n4 += n5) {
        }
        return n4;
    }

    public static void a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int n2;
        int n3;
        int n4 = byteBuffer.remaining();
        for (n2 = 0; n2 < n4 && (n3 = readableByteChannel.read(byteBuffer)) > 0; n2 += n3) {
        }
        if (n2 < n4) {
            throw new EOFException();
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return;
            } catch (IOException iOException) {}
        }
    }
}

