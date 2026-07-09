/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.b.a;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class a
extends OutputStream {
    private static final byte[] a = new byte[0];
    private final List<byte[]> b = new ArrayList<byte[]>();
    private int c;
    private int d;
    private byte[] e;
    private int f;
    private boolean g = true;

    public a() {
        this(0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private a(byte by2) {
        a a2 = this;
        synchronized (a2) {
            this.a(1024);
            return;
        }
    }

    private void a(int n2) {
        if (this.c < this.b.size() - 1) {
            this.d += this.e.length;
            ++this.c;
            this.e = this.b.get(this.c);
            return;
        }
        if (this.e == null) {
            this.d = 0;
        } else {
            n2 = Math.max(this.e.length << 1, n2 - this.d);
            this.d += this.e.length;
        }
        ++this.c;
        this.e = new byte[n2];
        this.b.add(this.e);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void write(byte[] byArray, int n2, int n3) {
        if (n2 < 0 || n2 > byArray.length || n3 < 0 || n2 + n3 > byArray.length || n2 + n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return;
        }
        a a2 = this;
        synchronized (a2) {
            int n4 = this.f + n3;
            int n5 = n3;
            int n6 = this.f - this.d;
            while (n5 > 0) {
                int n7 = Math.min(n5, this.e.length - n6);
                System.arraycopy(byArray, n2 + n3 - n5, this.e, n6, n7);
                if ((n5 -= n7) <= 0) continue;
                this.a(n4);
                n6 = 0;
            }
            this.f = n4;
            return;
        }
    }

    @Override
    public final synchronized void write(int n2) {
        int n3 = this.f - this.d;
        if (n3 == this.e.length) {
            a a2 = this;
            a2.a(a2.f + 1);
            n3 = 0;
        }
        this.e[n3] = (byte)n2;
        ++this.f;
    }

    @Override
    public final void close() {
    }

    public final synchronized byte[] a() {
        int n2 = this.f;
        if (n2 == 0) {
            return a;
        }
        byte[] byArray = new byte[n2];
        int n3 = 0;
        for (byte[] byArray2 : this.b) {
            int n4 = Math.min(byArray2.length, n2);
            System.arraycopy(byArray2, 0, byArray, n3, n4);
            n3 += n4;
            if ((n2 -= n4) != 0) continue;
        }
        return byArray;
    }

    @Deprecated
    public final String toString() {
        return new String(this.a(), Charset.defaultCharset());
    }
}

