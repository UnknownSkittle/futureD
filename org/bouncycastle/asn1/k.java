/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.h;

public final class k
extends u {
    private final byte[] a;

    public static k a(Object object) {
        if (object == null || object instanceof k) {
            return (k)object;
        }
        if (object instanceof byte[]) {
            try {
                return (k)k.b((byte[])object);
            } catch (Exception exception) {
                throw new IllegalArgumentException("encoding error in getInstance: " + exception.toString());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + object.getClass().getName());
    }

    public k(long l2) {
        this.a = BigInteger.valueOf(l2).toByteArray();
    }

    public k(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
    }

    k(byte[] byArray) {
        if (!h.a("org.bouncycastle.asn1.allow_unsafe_integer") && k.a(byArray)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.a = byArray;
    }

    static boolean a(byte[] byArray) {
        if (byArray.length > 1) {
            if (byArray[0] == 0 && (byArray[1] & 0x80) == 0) {
                return true;
            }
            if (byArray[0] == -1 && (byArray[1] & 0x80) != 0) {
                return true;
            }
        }
        return false;
    }

    public final BigInteger b() {
        return new BigInteger(this.a);
    }

    public final BigInteger c() {
        return new BigInteger(1, this.a);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length) + this.a.length;
    }

    final void a(r r2) {
        r2.a(2, this.a);
    }

    public final int hashCode() {
        int n2 = 0;
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            n2 ^= (this.a[i2] & 0xFF) << i2 % 4;
        }
        return n2;
    }

    final boolean a(u u2) {
        if (!(u2 instanceof k)) {
            return false;
        }
        u2 = (k)u2;
        return org.bouncycastle.e.a.a(this.a, ((k)u2).a);
    }

    public final String toString() {
        return this.b().toString();
    }
}

