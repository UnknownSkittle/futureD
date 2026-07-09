/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.b.e;
import org.bouncycastle.e.c;
import org.bouncycastle.math.ec.ad;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.b.a;
import org.bouncycastle.math.ec.g;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.o;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.w;
import org.bouncycastle.math.ec.y;

public abstract class d {
    private org.bouncycastle.math.a.a h;
    protected j a;
    protected j b;
    protected BigInteger c;
    protected BigInteger d;
    protected int e = 0;
    protected a f = null;
    protected o g = null;

    protected d(org.bouncycastle.math.a.a a2) {
        this.h = a2;
    }

    public abstract int a();

    public abstract j a(BigInteger var1);

    public final synchronized g b() {
        d d2 = this;
        return new g(d2, d2.e, this.f, this.g);
    }

    private p a(BigInteger object, BigInteger bigInteger) {
        if (!((p)(object = this.a((BigInteger)object, bigInteger, false))).a(true)) {
            throw new IllegalArgumentException("Invalid point coordinates");
        }
        return object;
    }

    public p a(BigInteger bigInteger, BigInteger bigInteger2, boolean bl2) {
        d d2 = this;
        return d2.a(d2.a(bigInteger), this.a(bigInteger2), bl2);
    }

    protected abstract d c();

    protected abstract p a(j var1, j var2, boolean var3);

    protected abstract p a(j var1, j var2, j[] var3, boolean var4);

    protected o d() {
        if (this.f instanceof org.bouncycastle.math.ec.b.b) {
            d d2 = this;
            return new w(d2, (org.bouncycastle.math.ec.b.b)d2.f);
        }
        return new ad();
    }

    public boolean a(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final e a(p object, String string) {
        this.b((p)object);
        Object object2 = object;
        synchronized (object2) {
            object = ((p)object).f;
        }
        if (object == null) {
            return null;
        }
        object2 = object;
        synchronized (object2) {
            return (e)((Hashtable)object).get(string);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final e a(p object, String string, y object2) {
        Hashtable<String, Object> hashtable;
        this.b((p)object);
        Object object3 = object;
        synchronized (object3) {
            hashtable = ((p)object).f;
            if (hashtable == null) {
                ((p)object).f = hashtable = new Hashtable<String, Object>(4);
            }
        }
        object3 = hashtable;
        synchronized (object3) {
            object = (e)hashtable.get(string);
            object2 = object2.a((e)object);
            if (object2 != object) {
                hashtable.put(string, object2);
            }
            return object2;
        }
    }

    public p a(p p2) {
        if (this == p2.c()) {
            return p2;
        }
        if (p2.n()) {
            return this.e();
        }
        p2 = p2.m();
        return this.a(p2.g().a(), p2.h().a(), p2.e);
    }

    public final void a(p[] pArray) {
        this.a(pArray, 0, pArray.length, null);
    }

    public final void a(p[] pArray, int n2, int n3, j j2) {
        int n4;
        this.a(pArray, n2, n3);
        switch (this.e) {
            case 0: 
            case 5: {
                if (j2 != null) {
                    throw new IllegalArgumentException("'iso' not valid for affine coordinates");
                }
                return;
            }
        }
        j[] jArray = new j[n3];
        int[] nArray = new int[n3];
        int n5 = 0;
        for (n4 = 0; n4 < n3; ++n4) {
            p p2 = pArray[n2 + n4];
            if (p2 == null || j2 == null && p2.l()) continue;
            jArray[n5] = p2.a(0);
            nArray[n5++] = n2 + n4;
        }
        if (n5 == 0) {
            return;
        }
        org.bouncycastle.math.ec.b.a(jArray, n5, j2);
        for (n4 = 0; n4 < n5; ++n4) {
            int n6 = nArray[n4];
            pArray[n6] = pArray[n6].a(jArray[n4]);
        }
    }

    public abstract p e();

    public final org.bouncycastle.math.a.a f() {
        return this.h;
    }

    public final j g() {
        return this.a;
    }

    public final j h() {
        return this.b;
    }

    public final BigInteger i() {
        return this.c;
    }

    public final BigInteger j() {
        return this.d;
    }

    public final int k() {
        return this.e;
    }

    protected abstract p a(int var1, BigInteger var2);

    public final synchronized o l() {
        if (this.g == null) {
            this.g = this.d();
        }
        return this.g;
    }

    public final p a(byte[] object) {
        int n2 = (this.a() + 7) / 8;
        byte by2 = object[0];
        switch (by2) {
            case 0: {
                if (((byte[])object).length != 1) {
                    throw new IllegalArgumentException("Incorrect length for infinity encoding");
                }
                object = this.e();
                break;
            }
            case 2: 
            case 3: {
                if (((byte[])object).length != n2 + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                int n3 = by2 & 1;
                object = org.bouncycastle.e.c.a((byte[])object, 1, n2);
                if (((p)(object = this.a(n3, (BigInteger)object))).a(true)) break;
                throw new IllegalArgumentException("Invalid point");
            }
            case 4: {
                if (((byte[])object).length != 2 * n2 + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                BigInteger bigInteger = org.bouncycastle.e.c.a((byte[])object, 1, n2);
                object = org.bouncycastle.e.c.a((byte[])object, n2 + 1, n2);
                object = this.a(bigInteger, (BigInteger)object);
                break;
            }
            case 6: 
            case 7: {
                if (((byte[])object).length != 2 * n2 + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigInteger = org.bouncycastle.e.c.a((byte[])object, 1, n2);
                if (((BigInteger)(object = org.bouncycastle.e.c.a((byte[])object, n2 + 1, n2))).testBit(0) != (by2 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                object = this.a(bigInteger, (BigInteger)object);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(by2, 16));
            }
        }
        if (by2 != 0 && ((p)object).n()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return object;
    }

    private void b(p p2) {
        if (p2 == null || this != p2.c()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    private void a(p[] pArray, int n2, int n3) {
        if (pArray == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (n2 < 0 || n3 < 0 || n2 > pArray.length - n3) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            p p2 = pArray[n2 + i2];
            if (p2 == null || this == p2.c()) continue;
            throw new IllegalArgumentException("'points' entries must be null or on this curve");
        }
    }

    public final boolean a(d d2) {
        return this == d2 || d2 != null && this.h.equals(d2.h) && this.a.a().equals(d2.a.a()) && this.b.a().equals(d2.b.a());
    }

    public boolean equals(Object object) {
        return this == object || object instanceof d && this.a((d)object);
    }

    public int hashCode() {
        return this.h.hashCode() ^ Integer.rotateLeft(this.a.a().hashCode(), 8) ^ Integer.rotateLeft(this.b.a().hashCode(), 16);
    }
}

