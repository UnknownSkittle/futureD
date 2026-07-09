/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.n;

import com.a.a.b.ai;
import java.io.Serializable;
import java.nio.CharBuffer;
import org.apache.a.m.c;

public final class b
implements Serializable,
CharSequence {
    private char[] a;
    private int b;

    public b(int n2) {
        ai.b(n2, "Buffer capacity");
        this.a = new char[n2];
    }

    private void c(int n2) {
        char[] cArray = new char[Math.max(this.a.length << 1, n2)];
        System.arraycopy(this.a, 0, cArray, 0, this.b);
        this.a = cArray;
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
        int n4 = this.b + n3;
        if (n4 > this.a.length) {
            this.c(n4);
        }
        System.arraycopy(cArray, n2, this.a, this.b, n3);
        this.b = n4;
    }

    public final void a(String string) {
        int n2 = (string = string != null ? string : "null").length();
        int n3 = this.b + n2;
        if (n3 > this.a.length) {
            this.c(n3);
        }
        string.getChars(0, n2, this.a, this.b);
        this.b = n3;
    }

    public final void a(b b2, int n2, int n3) {
        if (b2 == null) {
            return;
        }
        this.a(b2.a, n2, n3);
    }

    public final void a(char c2) {
        int n2 = this.b + 1;
        if (n2 > this.a.length) {
            this.c(n2);
        }
        this.a[this.b] = c2;
        this.b = n2;
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
        int n4 = this.b;
        if ((n3 = n4 + n3) > this.a.length) {
            this.c(n3);
        }
        while (n4 < n3) {
            this.a[n4] = (char)(byArray[n2] & 0xFF);
            ++n2;
            ++n4;
        }
        this.b = n3;
    }

    public final void a() {
        this.b = 0;
    }

    @Override
    public final char charAt(int n2) {
        return this.a[n2];
    }

    public final char[] b() {
        return this.a;
    }

    @Override
    public final int length() {
        return this.b;
    }

    public final void a(int n2) {
        if (n2 <= 0) {
            return;
        }
        int n3 = this.a.length - this.b;
        if (n2 > n3) {
            b b2 = this;
            b2.c(b2.b + n2);
        }
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final int a(int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 > this.b) {
            n4 = this.b;
        }
        if (n3 > n4) {
            return -1;
        }
        while (n3 < n4) {
            if (this.a[n3] == n2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    public final int b(int n2) {
        return this.a(n2, 0, this.b);
    }

    public final String a(int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: ".concat(String.valueOf(n2)));
        }
        if (n3 > this.b) {
            throw new IndexOutOfBoundsException("endIndex: " + n3 + " > length: " + this.b);
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("beginIndex: " + n2 + " > endIndex: " + n3);
        }
        return new String(this.a, n2, n3 - n2);
    }

    public final String b(int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: ".concat(String.valueOf(n2)));
        }
        if (n3 > this.b) {
            throw new IndexOutOfBoundsException("endIndex: " + n3 + " > length: " + this.b);
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("beginIndex: " + n2 + " > endIndex: " + n3);
        }
        int n4 = n3;
        while (n2 < n3 && c.a(this.a[n2])) {
            ++n2;
        }
        while (n4 > n2 && c.a(this.a[n4 - 1])) {
            --n4;
        }
        return new String(this.a, n2, n4 - n2);
    }

    @Override
    public final CharSequence subSequence(int n2, int n3) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Negative beginIndex: ".concat(String.valueOf(n2)));
        }
        if (n3 > this.b) {
            throw new IndexOutOfBoundsException("endIndex: " + n3 + " > length: " + this.b);
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("beginIndex: " + n2 + " > endIndex: " + n3);
        }
        return CharBuffer.wrap(this.a, n2, n3);
    }

    @Override
    public final String toString() {
        return new String(this.a, 0, this.b);
    }
}

