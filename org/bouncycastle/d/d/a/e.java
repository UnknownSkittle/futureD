/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import org.bouncycastle.asn1.util.a;
import org.bouncycastle.d.d.a.c;

public final class e {
    private int[] a;

    public e(byte[] byArray) {
        int n2;
        if (byArray.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int n3 = org.bouncycastle.asn1.util.a.a(byArray, 0);
        if (byArray.length != 4 + n3 * (n2 = c.a(n3 - 1))) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.a = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a[i2] = org.bouncycastle.asn1.util.a.a(byArray, 4 + i2 * n2, n2);
        }
        if (!e.a(this.a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public final byte[] a() {
        int n2 = this.a.length;
        int n3 = c.a(n2 - 1);
        byte[] byArray = new byte[4 + n2 * n3];
        org.bouncycastle.asn1.util.a.a(n2, byArray, 0);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = n3;
            int n5 = 4 + i2 * n3;
            byte[] byArray2 = byArray;
            int n6 = this.a[i2];
            --n4;
            while (n4 >= 0) {
                byArray2[n5 + n4] = (byte)(n6 >>> (n4 << 3));
                --n4;
            }
        }
        return byArray;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return org.bouncycastle.asn1.util.a.a(this.a, ((e)object).a);
    }

    public final String toString() {
        String string = "[" + this.a[0];
        for (int i2 = 1; i2 < this.a.length; ++i2) {
            string = string + ", " + this.a[i2];
        }
        return string + "]";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private static boolean a(int[] nArray) {
        int n2 = nArray.length;
        boolean[] blArray = new boolean[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            if (nArray[i2] < 0 || nArray[i2] >= n2 || blArray[nArray[i2]]) {
                return false;
            }
            blArray[nArray[i2]] = true;
        }
        return true;
    }
}

