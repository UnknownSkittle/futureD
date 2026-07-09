/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.sevenz;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.sevenz.aa;
import org.apache.commons.compress.archivers.sevenz.ab;
import org.apache.commons.compress.archivers.sevenz.ac;
import org.apache.commons.compress.archivers.sevenz.ad;
import org.apache.commons.compress.archivers.sevenz.c;
import org.apache.commons.compress.archivers.sevenz.d;
import org.apache.commons.compress.archivers.sevenz.e;
import org.apache.commons.compress.archivers.sevenz.i;
import org.apache.commons.compress.archivers.sevenz.k;
import org.apache.commons.compress.archivers.sevenz.t;
import org.apache.commons.compress.archivers.sevenz.w;
import org.apache.commons.compress.archivers.sevenz.y;
import org.apache.commons.compress.archivers.sevenz.z;
import org.apache.commons.compress.b.h;

public final class x
implements Closeable {
    private final String a;
    private SeekableByteChannel b;
    private final c c;
    private int d = -1;
    private int e = -1;
    private InputStream f = null;
    private byte[] g;
    private long h;
    private long i;
    private final ArrayList<InputStream> j = new ArrayList();
    private static byte[] k = new byte[]{55, 122, -68, -81, 39, 28};

    private x(File file) {
        this(Files.newByteChannel(file.toPath(), EnumSet.of(StandardOpenOption.READ), new FileAttribute[0]), file.getAbsolutePath());
    }

    private x(SeekableByteChannel closeable, String object) {
        this.b = closeable;
        this.a = object;
        try {
            closeable = this;
            ByteBuffer byteBuffer = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
            super.e(byteBuffer);
            byte[] byArray = new byte[6];
            byteBuffer.get(byArray);
            if (!Arrays.equals(byArray, k)) {
                throw new IOException("Bad 7z signature");
            }
            byte by2 = byteBuffer.get();
            byte by3 = byteBuffer.get();
            if (by2 != 0) {
                throw new IOException(String.format("Unsupported 7z version (%d,%d)", by2, by3));
            }
            long l2 = 0xFFFFFFFFL & (long)byteBuffer.getInt();
            Object object2 = super.a(l2);
            int n2 = (int)((ab)object2).b;
            if ((long)n2 != ((ab)object2).b) {
                throw new IOException("cannot handle nextHeaderSize " + ((ab)object2).b);
            }
            ((x)closeable).b.position(32L + ((ab)object2).a);
            Object object3 = ByteBuffer.allocate(n2).order(ByteOrder.LITTLE_ENDIAN);
            super.e((ByteBuffer)object3);
            CRC32 cRC32 = new CRC32();
            cRC32.update(((ByteBuffer)object3).array());
            if (((ab)object2).c != cRC32.getValue()) {
                throw new IOException("NextHeader CRC mismatch");
            }
            object2 = new c();
            int n3 = x.d((ByteBuffer)object3);
            if (n3 == 23) {
                object3 = super.a((ByteBuffer)object3, (c)object2);
                object2 = new c();
                n3 = x.d((ByteBuffer)object3);
            }
            if (n3 == 1) {
                ByteBuffer byteBuffer2 = object3;
                object3 = object2;
                object = byteBuffer2;
                n3 = x.d(byteBuffer2);
                if (n3 == 2) {
                    x.a((ByteBuffer)object);
                    n3 = x.d((ByteBuffer)object);
                }
                if (n3 == 3) {
                    throw new IOException("Additional streams unsupported");
                }
                if (n3 == 4) {
                    x.b((ByteBuffer)object, (c)object3);
                    n3 = x.d((ByteBuffer)object);
                }
                if (n3 == 5) {
                    x.f((ByteBuffer)object, (c)object3);
                    n3 = x.d((ByteBuffer)object);
                }
                if (n3 != 0) {
                    throw new IOException("Badly terminated header, found ".concat(String.valueOf(n3)));
                }
            } else {
                throw new IOException("Broken or unsupported archive: no Header");
            }
            this.c = object2;
            this.g = null;
            return;
        } catch (Throwable throwable) {
            this.b.close();
            throw throwable;
        }
    }

    public x(File file, byte by2) {
        this(file);
    }

    @Override
    public final void close() {
        if (this.b != null) {
            try {
                this.b.close();
                return;
            } finally {
                this.b = null;
                this.g = null;
            }
        }
    }

    public final w a() {
        if (this.d >= this.c.g.length - 1) {
            return null;
        }
        ++this.d;
        w w2 = this.c.g[this.d];
        x x2 = this;
        int n2 = x2.c.h.d[x2.d];
        if (n2 < 0) {
            x2.j.clear();
        } else {
            Object object;
            w w3 = x2.c.g[x2.d];
            if (x2.e == n2) {
                w3.a(x2.c.g[x2.d - 1].k());
            } else {
                x2.e = n2;
                x2.j.clear();
                if (x2.f != null) {
                    x2.f.close();
                    x2.f = null;
                }
                object = x2.c.e[n2];
                n2 = x2.c.h.a[n2];
                long l2 = 32L + x2.c.a + x2.c.h.b[n2];
                w w4 = w3;
                int n3 = n2;
                long l3 = l2;
                x x3 = x2;
                x3.b.position(l3);
                InputStream inputStream = new y(x3, new BufferedInputStream(new e(x3.b, x3.c.b[n3])));
                LinkedList<aa> linkedList = new LinkedList<aa>();
                for (i i2 : ((t)object).a()) {
                    if (i2.b != 1L || i2.c != 1L) {
                        throw new IOException("Multi input/output stream coders are not yet supported");
                    }
                    z z2 = z.a(i2.a);
                    inputStream = org.apache.commons.compress.archivers.sevenz.k.a(x3.a, inputStream, ((t)object).a(i2), i2);
                    z z3 = z2;
                    linkedList.addFirst(new aa(z3, org.apache.commons.compress.archivers.sevenz.k.a(z3).a(i2)));
                }
                w4.a(linkedList);
                x3.f = ((t)object).g ? new org.apache.commons.compress.b.d(inputStream, ((t)object).b(), ((t)object).h) : inputStream;
            }
            object = new org.apache.commons.compress.b.c(x2.f, w3.j());
            if (w3.h()) {
                object = new org.apache.commons.compress.b.d((InputStream)object, w3.j(), w3.i());
            }
            x2.j.add((InputStream)object);
        }
        x x4 = this;
        x4.h = 0L;
        x4.i = 0L;
        return w2;
    }

    private ab a(long l2) {
        Object object = new ab();
        DataInputStream dataInputStream = new DataInputStream(new org.apache.commons.compress.b.d(new e(this.b, 20L), 20L, l2));
        Throwable throwable = null;
        try {
            ((ab)object).a = Long.reverseBytes(dataInputStream.readLong());
            ((ab)object).b = Long.reverseBytes(dataInputStream.readLong());
            ((ab)object).c = 0xFFFFFFFFL & (long)Integer.reverseBytes(dataInputStream.readInt());
        } catch (Throwable throwable2) {
            try {
                object = throwable2;
                throwable = throwable2;
                throw object;
            } catch (Throwable throwable3) {
                if (throwable != null) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable throwable4) {
                        throwable.addSuppressed(throwable4);
                    }
                } else {
                    dataInputStream.close();
                }
                throw throwable3;
            }
        }
        dataInputStream.close();
        return object;
    }

    private static void a(ByteBuffer byteBuffer) {
        int n2 = x.d(byteBuffer);
        while (n2 != 0) {
            byte[] byArray = new byte[(int)x.c(byteBuffer)];
            byteBuffer.get(byArray);
            n2 = x.d(byteBuffer);
        }
    }

    private ByteBuffer a(ByteBuffer object, c object2) {
        x.b((ByteBuffer)object, (c)object2);
        object = ((c)object2).e[0];
        long l2 = 32L + ((c)object2).a;
        this.b.position(l2);
        object2 = new e(this.b, ((c)object2).b[0]);
        for (i i2 : ((t)object).a()) {
            if (i2.b != 1L || i2.c != 1L) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            object2 = org.apache.commons.compress.archivers.sevenz.k.a(this.a, (InputStream)object2, ((t)object).a(i2), i2);
        }
        if (((t)object).g) {
            object2 = new org.apache.commons.compress.b.d((InputStream)object2, ((t)object).b(), ((t)object).h);
        }
        Object object3 = new byte[(int)((t)object).b()];
        DataInputStream dataInputStream = new DataInputStream((InputStream)object2);
        object = null;
        try {
            dataInputStream.readFully((byte[])object3);
        } catch (Throwable throwable) {
            try {
                object2 = throwable;
                object = throwable;
                throw object2;
            } catch (Throwable throwable2) {
                if (object != null) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable throwable3) {
                        ((Throwable)object).addSuppressed(throwable3);
                    }
                } else {
                    dataInputStream.close();
                }
                throw throwable2;
            }
        }
        dataInputStream.close();
        return ByteBuffer.wrap((byte[])object3).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void b(ByteBuffer byteBuffer, c c2) {
        int n2 = x.d(byteBuffer);
        if (n2 == 6) {
            x.c(byteBuffer, c2);
            n2 = x.d(byteBuffer);
        }
        if (n2 == 7) {
            x.d(byteBuffer, c2);
            n2 = x.d(byteBuffer);
        } else {
            c2.e = new t[0];
        }
        if (n2 == 8) {
            x.e(byteBuffer, c2);
            n2 = x.d(byteBuffer);
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    private static void c(ByteBuffer byteBuffer, c c2) {
        c2.a = x.c(byteBuffer);
        long l2 = x.c(byteBuffer);
        int n2 = x.d(byteBuffer);
        if (n2 == 9) {
            c2.b = new long[(int)l2];
            for (n2 = 0; n2 < c2.b.length; ++n2) {
                c2.b[n2] = x.c(byteBuffer);
            }
            n2 = x.d(byteBuffer);
        }
        if (n2 == 10) {
            c2.c = x.a(byteBuffer, (int)l2);
            c2.d = new long[(int)l2];
            for (n2 = 0; n2 < (int)l2; ++n2) {
                if (!c2.c.get(n2)) continue;
                c2.d[n2] = 0xFFFFFFFFL & (long)byteBuffer.getInt();
            }
            n2 = x.d(byteBuffer);
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated PackInfo (" + n2 + ")");
        }
    }

    private static void d(ByteBuffer byteBuffer, c c2) {
        int n2 = x.d(byteBuffer);
        if (n2 != 11) {
            throw new IOException("Expected kFolder, got ".concat(String.valueOf(n2)));
        }
        long l2 = x.c(byteBuffer);
        t[] tArray = new t[(int)l2];
        c2.e = tArray;
        if (x.d(byteBuffer) != 0) {
            throw new IOException("External unsupported");
        }
        for (int i2 = 0; i2 < (int)l2; ++i2) {
            tArray[i2] = x.b(byteBuffer);
        }
        n2 = x.d(byteBuffer);
        if (n2 != 12) {
            throw new IOException("Expected kCodersUnpackSize, got ".concat(String.valueOf(n2)));
        }
        Object object = tArray;
        n2 = tArray.length;
        for (int i3 = 0; i3 < n2; ++i3) {
            t t2 = object[i3];
            t2.f = new long[(int)t2.c];
            int n3 = 0;
            while ((long)n3 < t2.c) {
                t2.f[n3] = x.c(byteBuffer);
                ++n3;
            }
        }
        n2 = x.d(byteBuffer);
        if (n2 == 10) {
            object = x.a(byteBuffer, (int)l2);
            for (n2 = 0; n2 < (int)l2; ++n2) {
                if (((BitSet)object).get(n2)) {
                    tArray[n2].g = true;
                    tArray[n2].h = 0xFFFFFFFFL & (long)byteBuffer.getInt();
                    continue;
                }
                tArray[n2].g = false;
            }
            n2 = x.d(byteBuffer);
        }
        if (n2 != 0) {
            throw new IOException("Badly terminated UnpackInfo");
        }
    }

    private static void e(ByteBuffer byteBuffer, c c2) {
        int n2;
        int n3;
        int n4;
        t[] tArray = c2.e;
        int n5 = c2.e.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            tArray[i2].i = 1;
        }
        int n6 = c2.e.length;
        n5 = x.d(byteBuffer);
        if (n5 == 13) {
            n6 = 0;
            t[] tArray2 = c2.e;
            n4 = c2.e.length;
            for (int i3 = 0; i3 < n4; ++i3) {
                t t2 = tArray2[i3];
                long l2 = x.c(byteBuffer);
                t2.i = (int)l2;
                n6 = (int)((long)n6 + l2);
            }
            n5 = x.d(byteBuffer);
        }
        ad ad2 = new ad();
        new ad().a = new long[n6];
        ad2.b = new BitSet(n6);
        ad2.c = new long[n6];
        n4 = 0;
        t[] tArray3 = c2.e;
        int n7 = c2.e.length;
        for (n3 = 0; n3 < n7; ++n3) {
            t t3 = tArray3[n3];
            if (t3.i == 0) continue;
            long l3 = 0L;
            if (n5 == 9) {
                for (n6 = 0; n6 < t3.i - 1; ++n6) {
                    long l4 = x.c(byteBuffer);
                    ad2.a[n4++] = l4;
                    l3 += l4;
                }
            }
            ad2.a[n4++] = t3.b() - l3;
        }
        if (n5 == 9) {
            n5 = x.d(byteBuffer);
        }
        int n8 = 0;
        Object object = c2.e;
        n3 = c2.e.length;
        for (n2 = 0; n2 < n3; ++n2) {
            t t4 = object[n2];
            if (t4.i == 1 && t4.g) continue;
            n8 += t4.i;
        }
        if (n5 == 10) {
            object = x.a(byteBuffer, n8);
            long[] lArray = new long[n8];
            for (n2 = 0; n2 < n8; ++n2) {
                if (!((BitSet)object).get(n2)) continue;
                lArray[n2] = 0xFFFFFFFFL & (long)byteBuffer.getInt();
            }
            n2 = 0;
            int n9 = 0;
            t[] tArray4 = c2.e;
            n6 = c2.e.length;
            for (int i4 = 0; i4 < n6; ++i4) {
                t t5 = tArray4[i4];
                if (t5.i == 1 && t5.g) {
                    ad2.b.set(n2, true);
                    ad2.c[n2] = t5.h;
                    ++n2;
                    continue;
                }
                for (n5 = 0; n5 < t5.i; ++n5) {
                    ad2.b.set(n2, ((BitSet)object).get(n9));
                    ad2.c[n2] = lArray[n9];
                    ++n2;
                    ++n9;
                }
            }
            n5 = x.d(byteBuffer);
        }
        if (n5 != 0) {
            throw new IOException("Badly terminated SubStreamsInfo");
        }
        c2.f = ad2;
    }

    private static t b(ByteBuffer byteBuffer) {
        int n2;
        t t2 = new t();
        i[] iArray = new i[(int)x.c(byteBuffer)];
        long l2 = 0L;
        long l3 = 0L;
        for (int i2 = 0; i2 < iArray.length; ++i2) {
            iArray[i2] = new i();
            int n3 = x.d(byteBuffer);
            int n4 = n3 & 0xF;
            n2 = (n3 & 0x10) == 0 ? 1 : 0;
            boolean bl2 = (n3 & 0x20) != 0;
            boolean bl3 = (n3 & 0x80) != 0;
            iArray[i2].a = new byte[n4];
            byteBuffer.get(iArray[i2].a);
            if (n2 != 0) {
                iArray[i2].b = 1L;
                iArray[i2].c = 1L;
            } else {
                iArray[i2].b = x.c(byteBuffer);
                iArray[i2].c = x.c(byteBuffer);
            }
            l2 += iArray[i2].b;
            l3 += iArray[i2].c;
            if (bl2) {
                long l4 = x.c(byteBuffer);
                iArray[i2].d = new byte[(int)l4];
                byteBuffer.get(iArray[i2].d);
            }
            if (!bl3) continue;
            throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
        }
        t2.a = iArray;
        t2.b = l2;
        t2.c = l3;
        if (l3 == 0L) {
            throw new IOException("Total output streams can't be 0");
        }
        long l5 = l3 - 1L;
        d[] dArray = new d[(int)l5];
        for (n2 = 0; n2 < dArray.length; ++n2) {
            dArray[n2] = new d();
            dArray[n2].a = x.c(byteBuffer);
            dArray[n2].b = x.c(byteBuffer);
        }
        t2.d = dArray;
        if (l2 < l5) {
            throw new IOException("Total input streams can't be less than the number of bind pairs");
        }
        long l6 = l2 - l5;
        long[] lArray = new long[(int)l6];
        if (l6 == 1L) {
            int n5;
            for (n5 = 0; n5 < (int)l2 && t2.a(n5) >= 0; ++n5) {
            }
            if (n5 == (int)l2) {
                throw new IOException("Couldn't find stream's bind pair index");
            }
            lArray[0] = n5;
        } else {
            for (int i3 = 0; i3 < (int)l6; ++i3) {
                lArray[i3] = x.c(byteBuffer);
            }
        }
        t2.e = lArray;
        return t2;
    }

    private static BitSet a(ByteBuffer object, int n2) {
        if (x.d((ByteBuffer)object) != 0) {
            object = new BitSet(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                ((BitSet)object).set(i2, true);
            }
        } else {
            object = x.b((ByteBuffer)object, n2);
        }
        return object;
    }

    private static BitSet b(ByteBuffer byteBuffer, int n2) {
        BitSet bitSet = new BitSet(n2);
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (n3 == 0) {
                n3 = 128;
                n4 = x.d(byteBuffer);
            }
            bitSet.set(i2, (n4 & n3) != 0);
            n3 >>>= 1;
        }
        return bitSet;
    }

    private static void f(ByteBuffer byteBuffer, c c2) {
        int n2;
        w[] wArray = new w[(int)x.c(byteBuffer)];
        for (int i2 = 0; i2 < wArray.length; ++i2) {
            wArray[i2] = new w();
        }
        BitSet bitSet = null;
        BitSet bitSet2 = null;
        BitSet bitSet3 = null;
        block13: while ((n2 = x.d(byteBuffer)) != 0) {
            long l2 = x.c(byteBuffer);
            switch (n2) {
                case 14: {
                    bitSet = x.b(byteBuffer, wArray.length);
                    continue block13;
                }
                case 15: {
                    if (bitSet == null) {
                        throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
                    }
                    bitSet2 = x.b(byteBuffer, bitSet.cardinality());
                    continue block13;
                }
                case 16: {
                    if (bitSet == null) {
                        throw new IOException("Header format error: kEmptyStream must appear before kAnti");
                    }
                    bitSet3 = x.b(byteBuffer, bitSet.cardinality());
                    continue block13;
                }
                case 17: {
                    if (x.d(byteBuffer) != 0) {
                        throw new IOException("Not implemented");
                    }
                    if ((l2 - 1L & 1L) != 0L) {
                        throw new IOException("File names length invalid");
                    }
                    byte[] byArray = new byte[(int)(l2 - 1L)];
                    byteBuffer.get(byArray);
                    int n3 = 0;
                    n2 = 0;
                    for (int i3 = 0; i3 < byArray.length; i3 += 2) {
                        if (byArray[i3] != 0 || byArray[i3 + 1] != 0) continue;
                        wArray[n3++].a(new String(byArray, n2, i3 - n2, "UTF-16LE"));
                        n2 = i3 + 2;
                    }
                    if (n2 == byArray.length && n3 == wArray.length) continue block13;
                    throw new IOException("Error parsing file names");
                }
                case 18: {
                    int n3;
                    BitSet bitSet4 = x.a(byteBuffer, wArray.length);
                    if (x.d(byteBuffer) != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n3 = 0; n3 < wArray.length; ++n3) {
                        wArray[n3].d(bitSet4.get(n3));
                        if (!wArray[n3].c()) continue;
                        wArray[n3].a(byteBuffer.getLong());
                    }
                    continue block13;
                }
                case 19: {
                    int n3;
                    BitSet bitSet5 = x.a(byteBuffer, wArray.length);
                    if (x.d(byteBuffer) != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n3 = 0; n3 < wArray.length; ++n3) {
                        wArray[n3].f(bitSet5.get(n3));
                        if (!wArray[n3].f()) continue;
                        wArray[n3].c(byteBuffer.getLong());
                    }
                    continue block13;
                }
                case 20: {
                    int n3;
                    BitSet bitSet6 = x.a(byteBuffer, wArray.length);
                    if (x.d(byteBuffer) != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n3 = 0; n3 < wArray.length; ++n3) {
                        wArray[n3].e(bitSet6.get(n3));
                        if (!wArray[n3].d()) continue;
                        wArray[n3].b(byteBuffer.getLong());
                    }
                    continue block13;
                }
                case 21: {
                    int n3;
                    BitSet bitSet7 = x.a(byteBuffer, wArray.length);
                    if (x.d(byteBuffer) != 0) {
                        throw new IOException("Unimplemented");
                    }
                    for (n3 = 0; n3 < wArray.length; ++n3) {
                        wArray[n3].g(bitSet7.get(n3));
                        if (!wArray[n3].g()) continue;
                        wArray[n3].a(byteBuffer.getInt());
                    }
                    continue block13;
                }
                case 24: {
                    throw new IOException("kStartPos is unsupported, please report");
                }
                case 25: {
                    if (x.a(byteBuffer, l2) >= l2) continue block13;
                    throw new IOException("Incomplete kDummy property");
                }
            }
            if (x.a(byteBuffer, l2) >= l2) continue;
            throw new IOException("Incomplete property of type ".concat(String.valueOf(n2)));
        }
        n2 = 0;
        int n4 = 0;
        for (int i4 = 0; i4 < wArray.length; ++i4) {
            wArray[i4].a(bitSet == null || !bitSet.get(i4));
            if (wArray[i4].a()) {
                wArray[i4].b(false);
                wArray[i4].c(false);
                wArray[i4].h(c2.f.b.get(n2));
                wArray[i4].d(c2.f.c[n2]);
                wArray[i4].e(c2.f.a[n2]);
                ++n2;
                continue;
            }
            wArray[i4].b(bitSet2 == null || !bitSet2.get(n4));
            wArray[i4].c(bitSet3 != null && bitSet3.get(n4));
            wArray[i4].h(false);
            wArray[i4].e(0L);
            ++n4;
        }
        c2.g = wArray;
        x.a(c2);
    }

    private static void a(c c2) {
        int n2;
        ac ac2 = new ac();
        int n3 = 0;
        int n4 = c2.e != null ? c2.e.length : 0;
        ac2.a = new int[n4];
        for (int i2 = 0; i2 < n4; ++i2) {
            ac2.a[i2] = n3;
            n3 += c2.e[i2].e.length;
        }
        long l2 = 0L;
        n3 = c2.b != null ? c2.b.length : 0;
        ac2.b = new long[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            ac2.b[n2] = l2;
            l2 += c2.b[n2];
        }
        ac2.c = new int[n4];
        ac2.d = new int[c2.g.length];
        n2 = 0;
        n3 = 0;
        for (n4 = 0; n4 < c2.g.length; ++n4) {
            if (!c2.g[n4].a() && n3 == 0) {
                ac2.d[n4] = -1;
                continue;
            }
            if (n3 == 0) {
                while (n2 < c2.e.length) {
                    ac2.c[n2] = n4;
                    if (c2.e[n2].i > 0) break;
                    ++n2;
                }
                if (n2 >= c2.e.length) {
                    throw new IOException("Too few folders in archive");
                }
            }
            ac2.d[n4] = n2;
            if (!c2.g[n4].a() || ++n3 < c2.e[n2].i) continue;
            ++n2;
            n3 = 0;
        }
        c2.h = ac2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private InputStream b() {
        if (this.c.g[this.d].j() == 0L) {
            return new ByteArrayInputStream(new byte[0]);
        }
        if (this.j.isEmpty()) {
            throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
        }
        while (this.j.size() > 1) {
            block10: {
                InputStream inputStream = this.j.remove(0);
                Throwable throwable = null;
                try {
                    org.apache.commons.compress.b.h.a(inputStream, Long.MAX_VALUE);
                    if (inputStream == null) break block10;
                } catch (Throwable throwable2) {
                    try {
                        Throwable throwable3 = throwable2;
                        throwable = throwable2;
                        throw throwable3;
                    } catch (Throwable throwable4) {
                        if (inputStream == null) throw throwable4;
                        if (throwable == null) {
                            inputStream.close();
                            throw throwable4;
                        }
                        try {
                            inputStream.close();
                            throw throwable4;
                        } catch (Throwable throwable5) {
                            throwable.addSuppressed(throwable5);
                            throw throwable4;
                        }
                    }
                }
                inputStream.close();
            }
            this.h = 0L;
        }
        return this.j.get(0);
    }

    public final int a(byte[] byArray, int n2) {
        int n3 = this.b().read(byArray, 0, n2);
        if (n3 > 0) {
            this.i += (long)n3;
        }
        return n3;
    }

    private static long c(ByteBuffer byteBuffer) {
        long l2 = x.d(byteBuffer);
        int n2 = 128;
        long l3 = 0L;
        for (int i2 = 0; i2 < 8; ++i2) {
            if ((l2 & (long)n2) == 0L) {
                return l3 | (l2 & (long)(n2 - 1)) << (i2 << 3);
            }
            long l4 = x.d(byteBuffer);
            l3 |= l4 << (i2 << 3);
            n2 >>>= 1;
        }
        return l3;
    }

    private static int d(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 0xFF;
    }

    public static boolean b(byte[] byArray, int n2) {
        if (n2 < 6) {
            return false;
        }
        for (n2 = 0; n2 < 6; ++n2) {
            if (byArray[n2] == k[n2]) continue;
            return false;
        }
        return true;
    }

    private static long a(ByteBuffer byteBuffer, long l2) {
        if (l2 < 1L) {
            return 0L;
        }
        int n2 = byteBuffer.position();
        int n3 = byteBuffer.remaining();
        if ((long)n3 < l2) {
            l2 = n3;
        }
        byteBuffer.position(n2 + (int)l2);
        return l2;
    }

    private void e(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        org.apache.commons.compress.b.h.a(this.b, byteBuffer);
        byteBuffer.flip();
    }

    public final String toString() {
        return this.c.toString();
    }

    static /* synthetic */ long a(x x2) {
        return x2.h;
    }

    static /* synthetic */ long a(x x2, long l2) {
        x2.h = l2;
        return x2.h;
    }

    static {
        StandardCharsets.UTF_16LE.newEncoder();
    }
}

