/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import org.bouncycastle.asn1.util.a;

public final class b {
    private int a = 0;
    private int b;

    public b(byte[] byArray) {
        if (byArray.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.b = byArray[0] & 0xFF | (byArray[1] & 0xFF) << 8 | (byArray[2] & 0xFF) << 16 | (byArray[3] & 0xFF) << 24;
        if (!org.bouncycastle.asn1.util.a.f(this.b)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.a = org.bouncycastle.asn1.util.a.e(this.b);
    }

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        int n2 = this.b;
        byte[] byArray = new byte[4];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)n2;
        byArray2[1] = (byte)(n2 >>> 8);
        byArray2[2] = (byte)(n2 >>> 16);
        byArray2[3] = (byte)(n2 >>> 24);
        return byArray2;
    }

    public final int a(int n2, int n3) {
        return org.bouncycastle.asn1.util.a.a(n2, n3, this.b);
    }

    private int b(int n2, int n3) {
        if (n3 == 0) {
            return 1;
        }
        if (n2 == 0) {
            return 0;
        }
        if (n2 == 1) {
            return 1;
        }
        int n4 = 1;
        if (n3 < 0) {
            n2 = this.a(n2);
            n3 = -n3;
        }
        while (n3 != 0) {
            if ((n3 & 1) == 1) {
                n4 = this.a(n4, n2);
            }
            int n5 = n2;
            n2 = this.a(n5, n5);
            n3 >>>= 1;
        }
        return n4;
    }

    public final int a(int n2) {
        int n3 = (1 << this.a) - 2;
        return this.b(n2, n3);
    }

    public final boolean b(int n2) {
        if (this.a == 31) {
            return n2 >= 0;
        }
        return n2 >= 0 && n2 < 1 << this.a;
    }

    public final String c(int n2) {
        String string = "";
        for (int i2 = 0; i2 < this.a; ++i2) {
            string = ((byte)n2 & 1) == 0 ? "0".concat(String.valueOf(string)) : "1".concat(String.valueOf(string));
            n2 >>>= 1;
        }
        return string;
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof b)) {
            return false;
        }
        object = (b)object;
        return this.a == ((b)object).a && this.b == ((b)object).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return "Finite Field GF(2^" + this.a + ") = GF(2)[X]/<" + org.bouncycastle.d.d.a.b.d(this.b) + "> ";
    }

    private static String d(int n2) {
        String string = "";
        if (n2 == 0) {
            string = "0";
        } else {
            if ((byte)(n2 & 1) == 1) {
                string = "1";
            }
            n2 >>>= 1;
            int n3 = 1;
            while (n2 != 0) {
                if ((byte)(n2 & 1) == 1) {
                    string = string + "+x^" + n3;
                }
                n2 >>>= 1;
                ++n3;
            }
        }
        return string;
    }
}

