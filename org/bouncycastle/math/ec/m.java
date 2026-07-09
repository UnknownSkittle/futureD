/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.e.a;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.k;
import org.bouncycastle.math.ec.x;

public final class m
extends k {
    private int f;
    private int g;
    private int[] h;
    private x i;

    public m(int n2, int n3, int n4, int n5, BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > n2) {
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }
        if (n4 == 0 && n5 == 0) {
            this.f = 2;
            this.h = new int[]{n3};
        } else {
            if (n4 >= n5) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            }
            if (n4 <= 0) {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.f = 3;
            this.h = new int[]{n3, n4, n5};
        }
        this.g = n2;
        this.i = new x(bigInteger);
    }

    private m(int n2, int[] nArray, x x2) {
        this.g = n2;
        this.f = nArray.length == 1 ? 2 : 3;
        this.h = nArray;
        this.i = x2;
    }

    public final int h() {
        return this.i.c();
    }

    public final boolean i() {
        return this.i.a();
    }

    public final boolean j() {
        return this.i.b();
    }

    public final boolean k() {
        return this.i.f();
    }

    public final BigInteger a() {
        return this.i.d();
    }

    public final int b() {
        return this.g;
    }

    public static void b(j j2, j j3) {
        if (!(j2 instanceof m) || !(j3 instanceof m)) {
            throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
        }
        j2 = (m)j2;
        j3 = (m)j3;
        if (((m)j2).f != ((m)j3).f) {
            throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
        }
        if (((m)j2).g != ((m)j3).g || !a.a(((m)j2).h, ((m)j3).h)) {
            throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
        }
    }

    public final j a(j j2) {
        x x2 = (x)this.i.clone();
        j2 = (m)j2;
        x2.a(((m)j2).i);
        return new m(this.g, this.h, x2);
    }

    public final j c() {
        return new m(this.g, this.h, this.i.e());
    }

    public final j b(j j2) {
        return this.a(j2);
    }

    public final j c(j j2) {
        return new m(this.g, this.h, this.i.a(((m)j2).i, this.g, this.h));
    }

    public final j a(j j2, j j3, j j4) {
        return this.b(j2, j3, j4);
    }

    public final j b(j object, j object2, j object3) {
        x x2 = this.i;
        object = ((m)object).i;
        object2 = ((m)object2).i;
        object3 = ((m)object3).i;
        x x3 = x2.b((x)object);
        object2 = ((x)object2).b((x)object3);
        if (x3 == x2 || x3 == object) {
            x3 = (x)x3.clone();
        }
        x3.a((x)object2);
        x3.a(this.g, this.h);
        return new m(this.g, this.h, x3);
    }

    public final j d(j j2) {
        j2 = j2.f();
        return this.c(j2);
    }

    public final j d() {
        return this;
    }

    public final j e() {
        return new m(this.g, this.h, this.i.b(this.g, this.h));
    }

    public final j a(j object, j object2) {
        x x2 = this.i;
        object = ((m)object).i;
        object2 = ((m)object2).i;
        x x3 = x2.g();
        object = ((x)object).b((x)object2);
        if (x3 == x2) {
            x3 = (x)x3.clone();
        }
        x3.a((x)object);
        x3.a(this.g, this.h);
        return new m(this.g, this.h, x3);
    }

    public final j a(int n2) {
        if (n2 <= 0) {
            return this;
        }
        return new m(this.g, this.h, this.i.a(n2, this.g, this.h));
    }

    public final j f() {
        return new m(this.g, this.h, this.i.c(this.g, this.h));
    }

    public final j g() {
        if (this.i.b() || this.i.a()) {
            return this;
        }
        m m2 = this;
        return m2.a(m2.g - 1);
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        return this.g == ((m)object).g && this.f == ((m)object).f && a.a(this.h, ((m)object).h) && this.i.equals(((m)object).i);
    }

    public final int hashCode() {
        return this.i.hashCode() ^ this.g ^ a.a(this.h);
    }
}

