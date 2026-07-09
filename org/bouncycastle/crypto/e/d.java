/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto.e;

import java.math.BigInteger;
import org.bouncycastle.b.e;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.i.j;
import org.bouncycastle.crypto.i.l;
import org.bouncycastle.crypto.i.m;

final class d {
    private l a;
    private boolean b;

    d() {
    }

    public final void a(boolean bl2, e e2) {
        if (e2 instanceof j) {
            e2 = (j)e2;
            this.a = (l)((j)e2).b();
        } else {
            this.a = (l)e2;
        }
        this.b = bl2;
    }

    public final int a() {
        int n2 = this.a.b().bitLength();
        if (this.b) {
            return (n2 + 7) / 8 - 1;
        }
        return (n2 + 7) / 8;
    }

    public final int b() {
        int n2 = this.a.b().bitLength();
        if (this.b) {
            return (n2 + 7) / 8;
        }
        return (n2 + 7) / 8 - 1;
    }

    public final BigInteger a(byte[] object, int n2, int n3) {
        byte[] byArray;
        if (n3 > this.a() + 1) {
            throw new i("input too large for RSA cipher.");
        }
        if (n3 == this.a() + 1 && !this.b) {
            throw new i("input too large for RSA cipher.");
        }
        if (n2 != 0 || n3 != ((byte[])object).length) {
            byArray = new byte[n3];
            System.arraycopy(object, n2, byArray, 0, n3);
        } else {
            byArray = object;
        }
        BigInteger bigInteger = new BigInteger(1, byArray);
        object = bigInteger;
        if (bigInteger.compareTo(this.a.b()) >= 0) {
            throw new i("input too large for RSA cipher.");
        }
        return object;
    }

    public final byte[] a(BigInteger object) {
        object = ((BigInteger)object).toByteArray();
        if (this.b) {
            if (object[0] == false && ((Object)object).length > this.b()) {
                byte[] byArray = new byte[((Object)object).length - 1];
                System.arraycopy(object, 1, byArray, 0, byArray.length);
                return byArray;
            }
            if (((Object)object).length < this.b()) {
                byte[] byArray = new byte[this.b()];
                System.arraycopy(object, 0, byArray, byArray.length - ((Object)object).length, ((Object)object).length);
                return byArray;
            }
        } else if (object[0] == false) {
            byte[] byArray = new byte[((Object)object).length - 1];
            System.arraycopy(object, 1, byArray, 0, byArray.length);
            return byArray;
        }
        return object;
    }

    public final BigInteger b(BigInteger bigInteger) {
        if (this.a instanceof m) {
            Object object = (m)this.a;
            BigInteger bigInteger2 = ((m)object).e();
            BigInteger bigInteger3 = ((m)object).f();
            BigInteger bigInteger4 = ((m)object).g();
            BigInteger bigInteger5 = ((m)object).h();
            object = ((m)object).i();
            bigInteger4 = bigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
            bigInteger = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
            return bigInteger4.subtract(bigInteger).multiply((BigInteger)object).mod(bigInteger2).multiply(bigInteger3).add(bigInteger);
        }
        return bigInteger.modPow(this.a.c(), this.a.b());
    }
}

