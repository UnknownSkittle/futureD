/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.bouncycastle.asn1.by;
import org.bouncycastle.asn1.j;

final class bz {
    private static final long a = Runtime.getRuntime().maxMemory();

    static int a(InputStream closeable) {
        if (closeable instanceof by) {
            return ((by)closeable).a();
        }
        if (closeable instanceof j) {
            return ((j)closeable).a();
        }
        if (closeable instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream)closeable).available();
        }
        if (closeable instanceof FileInputStream) {
            try {
                closeable = ((FileInputStream)closeable).getChannel();
                long l2 = closeable != null ? ((FileChannel)closeable).size() : Integer.MAX_VALUE;
                if (l2 < Integer.MAX_VALUE) {
                    return (int)l2;
                }
            } catch (IOException iOException) {}
        }
        if (a > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)a;
    }

    static int a(int n2) {
        int n3 = 1;
        if (n2 > 127) {
            int n4 = 1;
            while ((n2 >>>= 8) != 0) {
                ++n4;
            }
            for (n2 = n4 - 1 << 3; n2 >= 0; n2 -= 8) {
                ++n3;
            }
        }
        return n3;
    }

    static int b(int n2) {
        int n3 = 1;
        if (n2 >= 31) {
            if (n2 < 128) {
                ++n3;
            } else {
                byte[] byArray = new byte[5];
                int n4 = 5;
                --n4;
                byArray[4] = (byte)(n2 & 0x7F);
                do {
                    byArray[--n4] = (byte)((n2 >>= 7) & 0x7F | 0x80);
                } while (n2 > 127);
                n3 = 1 + (5 - n4);
            }
        }
        return n3;
    }
}

