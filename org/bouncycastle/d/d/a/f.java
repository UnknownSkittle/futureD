/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import org.bouncycastle.asn1.util.a;
import org.bouncycastle.d.d.a.b;

public final class f {
    private b a;
    private int b;
    private int[] c;

    public f(b b2, int n2) {
        this.a = b2;
        this.b = n2;
        this.c = new int[n2 + 1];
        this.c[n2] = 1;
    }

    public f(b object, int[] nArray) {
        int[] nArray2;
        this.a = object;
        object = nArray;
        int n2 = f.b(nArray);
        if (n2 == -1) {
            nArray2 = new int[1];
        } else if (((Object)object).length == n2 + 1) {
            nArray2 = org.bouncycastle.asn1.util.a.a((int[])object);
        } else {
            int[] nArray3 = new int[n2 + 1];
            System.arraycopy(object, 0, nArray3, 0, n2 + 1);
            nArray2 = nArray3;
        }
        this.c = nArray2;
        this.c();
    }

    public f(b b2, byte[] byArray) {
        int n2;
        this.a = b2;
        int n3 = 1;
        for (n2 = 8; b2.a() > n2; n2 += 8) {
            ++n3;
        }
        if (byArray.length % n3 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c = new int[byArray.length / n3];
        n3 = 0;
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            for (int i3 = 0; i3 < n2; i3 += 8) {
                int n4 = i2;
                this.c[n4] = this.c[n4] ^ (byArray[n3++] & 0xFF) << i3;
            }
            if (this.a.b(this.c[i2])) continue;
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        if (this.c.length != 1 && this.c[this.c.length - 1] == 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.c();
    }

    public f(f f2) {
        this.a = f2.a;
        this.b = f2.b;
        this.c = org.bouncycastle.asn1.util.a.a(f2.c);
    }

    public final int a() {
        int n2 = this.c.length - 1;
        if (this.c[n2] == 0) {
            return -1;
        }
        return n2;
    }

    private static int a(int[] nArray) {
        int n2 = f.b(nArray);
        if (n2 == -1) {
            return 0;
        }
        return nArray[n2];
    }

    public final int a(int n2) {
        if (n2 < 0 || n2 > this.b) {
            return 0;
        }
        return this.c[n2];
    }

    public final byte[] b() {
        int n2;
        int n3 = 1;
        for (n2 = 8; this.a.a() > n2; n2 += 8) {
            ++n3;
        }
        byte[] byArray = new byte[this.c.length * n3];
        n3 = 0;
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            for (int i3 = 0; i3 < n2; i3 += 8) {
                byArray[n3++] = (byte)(this.c[i2] >>> i3);
            }
        }
        return byArray;
    }

    public final int b(int n2) {
        int n3 = this.c[this.b];
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            n3 = this.a.a(n3, n2) ^ this.c[i2];
        }
        return n3;
    }

    public final void a(f f2) {
        this.c = f.a(this.c, f2.c);
        this.c();
    }

    private static int[] a(int[] nArray, int[] nArray2) {
        int[] nArray3;
        if (nArray.length < nArray2.length) {
            nArray3 = new int[nArray2.length];
            System.arraycopy(nArray2, 0, nArray3, 0, nArray2.length);
        } else {
            nArray3 = new int[nArray.length];
            System.arraycopy(nArray, 0, nArray3, 0, nArray.length);
            nArray = nArray2;
        }
        for (int i2 = nArray.length - 1; i2 >= 0; --i2) {
            nArray3[i2] = nArray3[i2] ^ nArray[i2];
        }
        return nArray3;
    }

    public final f c(int n2) {
        if (!this.a.b(n2)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        f f2 = this;
        int[] nArray = f2.a(f2.c, n2);
        return new f(this.a, nArray);
    }

    public final void d(int n2) {
        if (!this.a.b(n2)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.c = this.a(this.c, n2);
        this.c();
    }

    private int[] a(int[] nArray, int n2) {
        int n3 = f.b(nArray);
        if (n3 == -1 || n2 == 0) {
            return new int[1];
        }
        if (n2 == 1) {
            return org.bouncycastle.asn1.util.a.a(nArray);
        }
        int[] nArray2 = new int[n3 + 1];
        while (n3 >= 0) {
            nArray2[n3] = this.a.a(nArray[n3], n2);
            --n3;
        }
        return nArray2;
    }

    private static int[] b(int[] nArray, int n2) {
        int n3 = f.b(nArray);
        if (n3 == -1) {
            return new int[1];
        }
        int[] nArray2 = new int[n3 + n2 + 1];
        System.arraycopy(nArray, 0, nArray2, n2, n3 + 1);
        return nArray2;
    }

    public final f b(f object) {
        f f2 = this;
        int[] nArray = ((f)object).c;
        int[] nArray2 = f2.c;
        object = f2;
        int n2 = f.b(nArray);
        if (n2 == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int[] nArray3 = new int[nArray2.length];
        int n3 = f.a(nArray);
        n3 = ((f)object).a.a(n3);
        System.arraycopy(nArray2, 0, nArray3, 0, nArray3.length);
        while (n2 <= f.b(nArray3)) {
            int n4 = ((f)object).a.a(f.a(nArray3), n3);
            nArray2 = f.b(nArray, f.b(nArray3) - n2);
            nArray3 = f.a(super.a(nArray2, n4), nArray3);
        }
        object = nArray3;
        return new f(this.a, (int[])object);
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof f)) {
            return false;
        }
        object = (f)object;
        if (this.a.equals(((f)object).a) && this.b == ((f)object).b) {
            boolean bl2;
            block6: {
                int n2;
                int[] nArray = ((f)object).c;
                object = this.c;
                int n3 = f.b(this.c);
                if (n3 != (n2 = f.b(nArray))) {
                    bl2 = false;
                } else {
                    for (n2 = 0; n2 <= n3; ++n2) {
                        if (object[n2] == nArray[n2]) continue;
                        bl2 = false;
                        break block6;
                    }
                    bl2 = true;
                }
            }
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            n2 = n2 * 31 + this.c[i2];
        }
        return n2;
    }

    public final String toString() {
        String string = " Polynomial over " + this.a.toString() + ": \n";
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            string = string + this.a.c(this.c[i2]) + "Y^" + i2 + "+";
        }
        return string + ";";
    }

    private void c() {
        this.b = this.c.length - 1;
        while (this.b >= 0 && this.c[this.b] == 0) {
            --this.b;
        }
    }

    private static int b(int[] nArray) {
        int n2;
        for (n2 = nArray.length - 1; n2 >= 0 && nArray[n2] == 0; --n2) {
        }
        return n2;
    }
}

