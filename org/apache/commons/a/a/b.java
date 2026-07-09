/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.a.a;

import org.apache.commons.a.a.c;

public abstract class b {
    private byte a = (byte)61;
    private final int b;
    private final int c;
    private int d = 0;
    private final int e;

    protected b(int n2) {
        this.b = 3;
        this.c = 4;
        this.e = n2;
    }

    protected static byte[] a(int n2, c c2) {
        if (c2.b == null || c2.b.length < c2.c + n2) {
            if (c2.b == null) {
                c2.b = new byte[8192];
                c2.c = 0;
                c2.d = 0;
            } else {
                byte[] byArray = new byte[c2.b.length << 1];
                System.arraycopy(c2.b, 0, byArray, 0, c2.b.length);
                c2.b = byArray;
            }
            return c2.b;
        }
        return c2.b;
    }

    static int a(byte[] byArray, int n2, c c2) {
        if (c2.b != null) {
            c c3 = c2;
            n2 = Math.min(c3.b != null ? c3.c - c3.d : 0, n2);
            System.arraycopy(c2.b, c2.d, byArray, 0, n2);
            c2.d += n2;
            if (c2.d >= c2.c) {
                c2.b = null;
            }
            return n2;
        }
        if (c2.e) {
            return -1;
        }
        return 0;
    }

    public final byte[] c(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return byArray;
        }
        c c2 = new c();
        this.a(byArray, 0, byArray.length, c2);
        this.a(byArray, 0, -1, c2);
        byArray = new byte[c2.c - c2.d];
        org.apache.commons.a.a.b.a(byArray, byArray.length, c2);
        return byArray;
    }

    abstract void a(byte[] var1, int var2, int var3, c var4);

    abstract void b(byte[] var1, int var2, int var3, c var4);

    protected abstract boolean a(byte var1);

    protected final boolean d(byte[] byArray) {
        if (byArray == null) {
            return false;
        }
        for (byte by2 : byArray) {
            if (61 != by2 && !this.a(by2)) continue;
            return true;
        }
        return false;
    }
}

