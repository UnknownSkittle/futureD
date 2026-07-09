/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.a.b;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.apache.commons.compress.a.b.c;
import org.apache.commons.compress.a.b.d;
import org.apache.commons.compress.a.b.e;
import org.apache.commons.compress.a.b.f;
import org.apache.commons.compress.a.b.g;
import org.apache.commons.compress.a.b.h;
import org.apache.commons.compress.a.b.i;

final class b
implements Closeable {
    private static final short[] a = new short[]{96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    private static final int[] b = new int[]{16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    private static final int[] c = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    private static final int[] d = new int[288];
    private static final int[] e;
    private boolean f = false;
    private d g;
    private org.apache.commons.compress.b.b h;
    private final InputStream i;
    private final e j = new e('\u0000');

    b(InputStream inputStream) {
        this.h = new org.apache.commons.compress.b.b(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.i = inputStream;
        this.g = new g(this, 0);
    }

    @Override
    public final void close() {
        this.g = new g(this, 0);
        this.h = null;
    }

    public final int a(byte[] byArray, int n2, int n3) {
        block5: while (!this.f || this.g.b()) {
            if (this.g.a() == org.apache.commons.compress.a.b.i.a) {
                this.f = this.a(1) == 1L;
                int n4 = (int)this.a(2);
                switch (n4) {
                    case 0: {
                        b b2 = this;
                        b2.h.c();
                        long l2 = b2.a(16);
                        long l3 = b2.a(16);
                        if (((l2 ^ 0xFFFFL) & 0xFFFFL) != l3) {
                            throw new IllegalStateException("Illegal LEN / NLEN values");
                        }
                        b2.g = new h(b2, l2, 0);
                        continue block5;
                    }
                    case 1: {
                        this.g = new f(this, org.apache.commons.compress.a.b.i.d, d, e);
                        continue block5;
                    }
                    case 2: {
                        Object object = this;
                        int[][] nArrayArray = new int[2][];
                        int n5 = (int)(((b)object).a(5) + 257L);
                        nArrayArray[0] = new int[n5];
                        int n6 = (int)(((b)object).a(5) + 1L);
                        nArrayArray[1] = new int[n6];
                        org.apache.commons.compress.a.b.b.a(((b)object).h, nArrayArray[0], nArrayArray[1]);
                        object = nArrayArray;
                        this.g = new f(this, org.apache.commons.compress.a.b.i.c, (int[])object[0], (int[])object[1]);
                        continue block5;
                    }
                }
                throw new IllegalStateException("Unsupported compression: ".concat(String.valueOf(n4)));
            }
            return this.g.a(byArray, n2, n3);
        }
        return -1;
    }

    final long a() {
        return this.h.d();
    }

    final int b() {
        return this.g.c();
    }

    private static int b(org.apache.commons.compress.b.b b2, c c2) {
        while (c2 != null && c2.a == -1) {
            c2 = org.apache.commons.compress.a.b.b.a(b2, 1) == 0L ? c2.b : c2.c;
        }
        if (c2 != null) {
            return c2.a;
        }
        return -1;
    }

    private static void a(org.apache.commons.compress.b.b b2, int[] nArray, int[] nArray2) {
        int n2 = (int)(org.apache.commons.compress.a.b.b.a(b2, 4) + 4L);
        int[] nArray3 = new int[19];
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray3[org.apache.commons.compress.a.b.b.c[i2]] = (int)org.apache.commons.compress.a.b.b.a(b2, 3);
        }
        c c2 = org.apache.commons.compress.a.b.b.b(nArray3);
        int[] nArray4 = new int[nArray.length + nArray2.length];
        int n3 = -1;
        int n4 = 0;
        int n5 = 0;
        while (n5 < nArray4.length) {
            if (n4 > 0) {
                nArray4[n5++] = n3;
                --n4;
                continue;
            }
            int n6 = org.apache.commons.compress.a.b.b.b(b2, c2);
            if (n6 < 16) {
                n3 = n6;
                nArray4[n5++] = n3;
                continue;
            }
            if (n6 == 16) {
                n4 = (int)(org.apache.commons.compress.a.b.b.a(b2, 2) + 3L);
                continue;
            }
            if (n6 == 17) {
                n3 = 0;
                n4 = (int)(org.apache.commons.compress.a.b.b.a(b2, 3) + 3L);
                continue;
            }
            if (n6 != 18) continue;
            n3 = 0;
            n4 = (int)(org.apache.commons.compress.a.b.b.a(b2, 7) + 11L);
        }
        System.arraycopy(nArray4, 0, nArray, 0, nArray.length);
        System.arraycopy(nArray4, nArray.length, nArray2, 0, nArray2.length);
    }

    private static c b(int[] nArray) {
        int[] nArray2 = org.apache.commons.compress.a.b.b.c(nArray);
        c c2 = new c();
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2];
            if (n2 == 0) continue;
            c c3 = c2;
            int n3 = nArray2[n2 - 1];
            for (int i3 = n2 - 1; i3 >= 0; --i3) {
                c3 = (n3 & 1 << i3) == 0 ? c3.a() : c3.b();
            }
            c3.a(i2);
            int n4 = n2 - 1;
            nArray2[n4] = nArray2[n4] + 1;
        }
        return c2;
    }

    private static int[] c(int[] nArray) {
        int n2;
        int n3 = 0;
        int[] nArray2 = new int[65];
        int n4 = nArray.length;
        for (n2 = 0; n2 < n4; ++n2) {
            int n5 = nArray[n2];
            n3 = Math.max(n3, n5);
            int n6 = n5;
            nArray2[n6] = nArray2[n6] + 1;
        }
        nArray2 = Arrays.copyOf(nArray2, n3 + 1);
        int n7 = 0;
        int[] nArray3 = new int[n3 + 1];
        for (n2 = 0; n2 <= n3; ++n2) {
            nArray3[n2] = n7 = n7 + nArray2[n2] << 1;
        }
        return nArray3;
    }

    private long a(int n2) {
        return org.apache.commons.compress.a.b.b.a(this.h, n2);
    }

    private static long a(org.apache.commons.compress.b.b b2, int n2) {
        long l2 = b2.a(n2);
        if (l2 == -1L) {
            throw new EOFException("Truncated Deflate64 Stream");
        }
        return l2;
    }

    static /* synthetic */ org.apache.commons.compress.b.b a(b b2) {
        return b2.h;
    }

    static /* synthetic */ long a(b b2, int n2) {
        return b2.a(n2);
    }

    static /* synthetic */ e b(b b2) {
        return b2.j;
    }

    static /* synthetic */ InputStream c(b b2) {
        return b2.i;
    }

    static /* synthetic */ c a(int[] nArray) {
        return org.apache.commons.compress.a.b.b.b(nArray);
    }

    static /* synthetic */ int a(org.apache.commons.compress.b.b b2, c c2) {
        return org.apache.commons.compress.a.b.b.b(b2, c2);
    }

    static /* synthetic */ short[] c() {
        return a;
    }

    static /* synthetic */ int[] d() {
        return b;
    }

    static {
        Arrays.fill(d, 0, 144, 8);
        Arrays.fill(d, 144, 256, 9);
        Arrays.fill(d, 256, 280, 7);
        Arrays.fill(d, 280, 288, 8);
        e = new int[32];
        Arrays.fill(e, 5);
    }
}

