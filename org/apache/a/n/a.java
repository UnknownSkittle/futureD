/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.n;

import com.a.a.b.ai;
import java.io.Serializable;

public final class a
implements Serializable {
    private byte[] a;
    private int b;

    public a(int n2) {
        ai.b(8192, "Buffer capacity");
        this.a = new byte[8192];
    }

    private void c(int n2) {
        byte[] byArray = new byte[Math.max(this.a.length << 1, n2)];
        System.arraycopy(this.a, 0, byArray, 0, this.b);
        this.a = byArray;
    }

    public final void a(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            return;
        }
        if (n2 < 0 || n2 > byArray.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + byArray.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.b + n3;
        if (n4 > this.a.length) {
            this.c(n4);
        }
        System.arraycopy(byArray, n2, this.a, this.b, n3);
        this.b = n4;
    }

    public final void a(int n2) {
        int n3 = this.b + 1;
        if (n3 > this.a.length) {
            this.c(n3);
        }
        this.a[this.b] = (byte)n2;
        this.b = n3;
    }

    public final void a(char[] cArray, int n2, int n3) {
        if (cArray == null) {
            return;
        }
        if (n2 < 0 || n2 > cArray.length || n3 < 0 || n2 + n3 < 0 || n2 + n3 > cArray.length) {
            throw new IndexOutOfBoundsException("off: " + n2 + " len: " + n3 + " b.length: " + cArray.length);
        }
        if (n3 == 0) {
            return;
        }
        int n4 = this.b;
        if ((n3 = n4 + n3) > this.a.length) {
            this.c(n3);
        }
        while (n4 < n3) {
            this.a[n4] = (byte)cArray[n2];
            ++n2;
            ++n4;
        }
        this.b = n3;
    }

    public final void a() {
        this.b = 0;
    }

    public final int b(int n2) {
        return this.a[n2];
    }

    public final int b() {
        return this.a.length;
    }

    public final int c() {
        return this.b;
    }

    public final byte[] d() {
        return this.a;
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final boolean f() {
        return this.b == this.a.length;
    }
}

