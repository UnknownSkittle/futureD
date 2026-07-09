/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.a.c;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.a.c.aa;
import org.bouncycastle.math.ec.a.c.ab;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.l;

public final class ac
extends l {
    private static BigInteger g = aa.h;
    protected int[] f;

    public ac(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f = ab.a(bigInteger);
    }

    public ac() {
        this.f = new int[7];
    }

    protected ac(int[] nArray) {
        this.f = nArray;
    }

    public final boolean j() {
        return org.bouncycastle.math.b.a.b(this.f);
    }

    public final boolean i() {
        return org.bouncycastle.math.b.a.a(this.f);
    }

    public final boolean k() {
        return (this.f[0] & 1) == 1;
    }

    public final BigInteger a() {
        return org.bouncycastle.math.b.a.c(this.f);
    }

    public final int b() {
        return g.bitLength();
    }

    public final j a(j j2) {
        int[] nArray = new int[7];
        ab.a(this.f, ((ac)j2).f, nArray);
        return new ac(nArray);
    }

    public final j c() {
        int[] nArray = new int[7];
        ab.a(this.f, nArray);
        return new ac(nArray);
    }

    public final j b(j j2) {
        int[] nArray = new int[7];
        ab.d(this.f, ((ac)j2).f, nArray);
        return new ac(nArray);
    }

    public final j c(j j2) {
        int[] nArray = new int[7];
        ab.b(this.f, ((ac)j2).f, nArray);
        return new ac(nArray);
    }

    public final j d(j j2) {
        int[] nArray = new int[7];
        org.bouncycastle.asn1.k.ab.a(ab.a, ((ac)j2).f, nArray);
        ab.b(nArray, this.f, nArray);
        return new ac(nArray);
    }

    public final j d() {
        int[] nArray = new int[7];
        ab.b(this.f, nArray);
        return new ac(nArray);
    }

    public final j e() {
        int[] nArray = new int[7];
        ab.d(this.f, nArray);
        return new ac(nArray);
    }

    public final j f() {
        int[] nArray = new int[7];
        org.bouncycastle.asn1.k.ab.a(ab.a, this.f, nArray);
        return new ac(nArray);
    }

    public final j g() {
        int[] nArray = this.f;
        if (org.bouncycastle.math.b.a.b(this.f) || org.bouncycastle.math.b.a.a(nArray)) {
            return this;
        }
        int[] nArray2 = new int[7];
        ab.b(nArray, nArray2);
        int[] nArray3 = ab.a;
        Object object = new Random();
        int[] nArray4 = new int[7];
        int n2 = nArray3[6];
        int n3 = n2 | n2 >>> 1;
        int n4 = n3 | n3 >>> 2;
        int n5 = n4 | n4 >>> 4;
        int n6 = n5 | n5 >>> 8;
        int n7 = n6 | n6 >>> 16;
        do {
            for (int i2 = 0; i2 != 7; ++i2) {
                nArray4[i2] = ((Random)object).nextInt();
            }
            nArray4[6] = nArray4[6] & n7;
        } while (org.bouncycastle.asn1.k.ab.c(7, nArray4, nArray3));
        nArray3 = nArray4;
        object = new int[7];
        if (!ac.a(nArray)) {
            return null;
        }
        while (!ac.a(nArray2, nArray3, (int[])object)) {
            ab.a(nArray3, nArray3);
        }
        ab.d((int[])object, nArray3);
        if (org.bouncycastle.math.b.a.b(nArray, nArray3)) {
            return new ac((int[])object);
        }
        return null;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ac)) {
            return false;
        }
        object = (ac)object;
        return org.bouncycastle.math.b.a.b(this.f, ((ac)object).f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.a(this.f, 7);
    }

    private static boolean a(int[] nArray) {
        int[] nArray2 = new int[7];
        int[] nArray3 = new int[7];
        org.bouncycastle.math.b.a.a(nArray, nArray2);
        for (int i2 = 0; i2 < 7; ++i2) {
            org.bouncycastle.math.b.a.a(nArray2, nArray3);
            ab.a(nArray2, 1 << i2, nArray2);
            ab.b(nArray2, nArray3, nArray2);
        }
        ab.a(nArray2, 95, nArray2);
        return org.bouncycastle.math.b.a.a(nArray2);
    }

    private static void a(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        ab.b(nArray2, nArray, nArray2);
        ab.e(nArray2, nArray2);
        ab.d(nArray, nArray4);
        ab.a(nArray3, nArray4, nArray);
        ab.b(nArray3, nArray4, nArray3);
        ab.a(org.bouncycastle.asn1.k.ab.d(7, nArray3, 0), nArray3);
    }

    private static boolean a(int[] nArray, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[7];
        org.bouncycastle.math.b.a.a(nArray2, nArray4);
        int[] nArray5 = new int[7];
        nArray2 = nArray5;
        nArray5[0] = 1;
        int[] nArray6 = new int[7];
        int[] nArray7 = nArray3;
        int[] nArray8 = nArray6;
        int[] nArray9 = nArray2;
        int[] nArray10 = nArray4;
        org.bouncycastle.math.b.a.a(nArray, nArray8);
        int[] nArray11 = new int[7];
        int[] nArray12 = new int[7];
        for (int i2 = 0; i2 < 7; ++i2) {
            org.bouncycastle.math.b.a.a(nArray10, nArray11);
            org.bouncycastle.math.b.a.a(nArray9, nArray12);
            int n2 = 1 << i2;
            while (--n2 >= 0) {
                ac.a(nArray10, nArray9, nArray8, nArray7);
            }
            int[] nArray13 = nArray7;
            int[] nArray14 = nArray8;
            int[] nArray15 = nArray9;
            int[] nArray16 = nArray10;
            int[] nArray17 = nArray12;
            int[] nArray18 = nArray11;
            int[] nArray19 = nArray;
            ab.b(nArray15, nArray17, nArray13);
            ab.b(nArray13, nArray19, nArray13);
            ab.b(nArray16, nArray18, nArray14);
            ab.a(nArray14, nArray13, nArray14);
            ab.b(nArray16, nArray17, nArray13);
            org.bouncycastle.math.b.a.a(nArray14, nArray16);
            ab.b(nArray15, nArray18, nArray15);
            ab.a(nArray15, nArray13, nArray15);
            ab.d(nArray15, nArray14);
            ab.b(nArray14, nArray19, nArray14);
        }
        nArray = new int[7];
        nArray10 = new int[7];
        for (int i3 = 1; i3 < 96; ++i3) {
            org.bouncycastle.math.b.a.a(nArray4, nArray);
            org.bouncycastle.math.b.a.a(nArray2, nArray10);
            ac.a(nArray4, nArray2, nArray6, nArray3);
            if (!org.bouncycastle.math.b.a.b(nArray4)) continue;
            org.bouncycastle.asn1.k.ab.a(ab.a, nArray10, nArray3);
            ab.b(nArray3, nArray, nArray3);
            return true;
        }
        return false;
    }
}

