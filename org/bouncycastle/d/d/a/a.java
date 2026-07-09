/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import org.bouncycastle.d.d.a.d;

public final class a
extends d {
    private int[][] c;
    private int d;

    public a(byte[] byArray) {
        if (byArray.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.a = org.bouncycastle.asn1.util.a.a(byArray, 0);
        this.b = org.bouncycastle.asn1.util.a.a(byArray, 4);
        int n2 = (this.b + 7 >>> 3) * this.a;
        if (this.a <= 0 || n2 != byArray.length - 8) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.d = this.b + 31 >>> 5;
        this.c = new int[this.a][this.d];
        n2 = this.b >> 5;
        int n3 = this.b & 0x1F;
        int n4 = 8;
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n5 = 0;
            while (n5 < n2) {
                this.c[i2][n5] = org.bouncycastle.asn1.util.a.a(byArray, n4);
                ++n5;
                n4 += 4;
            }
            for (n5 = 0; n5 < n3; n5 += 8) {
                int[] nArray = this.c[i2];
                int n6 = n2;
                nArray[n6] = nArray[n6] ^ (byArray[n4++] & 0xFF) << n5;
            }
        }
    }

    public a(int n2, int[][] nArray) {
        if (nArray[0].length != n2 + 31 >> 5) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.b = n2;
        this.a = nArray.length;
        this.d = nArray[0].length;
        n2 = (n2 &= 0x1F) == 0 ? -1 : (1 << n2) - 1;
        for (int i2 = 0; i2 < this.a; ++i2) {
            int[] nArray2 = nArray[i2];
            int n3 = this.d - 1;
            nArray2[n3] = nArray2[n3] & n2;
        }
        this.c = nArray;
    }

    public a(a a2) {
        this.b = a2.c();
        this.a = a2.b();
        this.d = a2.d;
        this.c = new int[a2.c.length][];
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            this.c[i2] = org.bouncycastle.asn1.util.a.a(a2.c[i2]);
        }
    }

    public final byte[] a() {
        int n2 = (this.b + 7 >>> 3) * this.a;
        byte[] byArray = new byte[n2 += 8];
        org.bouncycastle.asn1.util.a.a(this.a, byArray, 0);
        org.bouncycastle.asn1.util.a.a(this.b, byArray, 4);
        int n3 = this.b >>> 5;
        int n4 = this.b & 0x1F;
        int n5 = 8;
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n6 = 0;
            while (n6 < n3) {
                org.bouncycastle.asn1.util.a.a(this.c[i2][n6], byArray, n5);
                ++n6;
                n5 += 4;
            }
            for (n6 = 0; n6 < n4; n6 += 8) {
                byArray[n5++] = (byte)(this.c[i2][n3] >>> n6);
            }
        }
        return byArray;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (this.a != ((a)object).a || this.b != ((a)object).b || this.d != ((a)object).d) {
            return false;
        }
        for (int i2 = 0; i2 < this.a; ++i2) {
            if (org.bouncycastle.asn1.util.a.a(this.c[i2], ((a)object).c[i2])) continue;
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int n2 = (this.a * 31 + this.b) * 31 + this.d;
        for (int i2 = 0; i2 < this.a; ++i2) {
            n2 = n2 * 31 + this.c[i2].hashCode();
        }
        return n2;
    }

    public final String toString() {
        int n2 = this.b & 0x1F;
        int n3 = n2 == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n4;
            int n5;
            stringBuffer.append(i2 + ": ");
            for (n5 = 0; n5 < n3; ++n5) {
                n4 = this.c[i2][n5];
                for (int i3 = 0; i3 < 32; ++i3) {
                    if ((n4 >>> i3 & 1) == 0) {
                        stringBuffer.append('0');
                        continue;
                    }
                    stringBuffer.append('1');
                }
                stringBuffer.append(' ');
            }
            n5 = this.c[i2][this.d - 1];
            for (n4 = 0; n4 < n2; ++n4) {
                if ((n5 >>> n4 & 1) == 0) {
                    stringBuffer.append('0');
                    continue;
                }
                stringBuffer.append('1');
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}

