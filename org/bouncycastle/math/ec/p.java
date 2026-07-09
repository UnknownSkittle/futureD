/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.math.ec.ac;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.q;

public abstract class p {
    private static j[] g = new j[0];
    protected d a;
    protected j b;
    protected j c;
    protected j[] d;
    protected boolean e;
    protected Hashtable f;

    protected p(d d2, j j2, j j3) {
        j[] jArray;
        int n2 = d2 == null ? 0 : d2.k();
        block0 : switch (n2) {
            case 0: 
            case 5: {
                jArray = g;
                break;
            }
            default: {
                j3 = d2.a(org.bouncycastle.math.ec.c.b);
                switch (n2) {
                    case 1: 
                    case 2: 
                    case 6: {
                        j[] jArray2 = new j[1];
                        jArray = jArray2;
                        jArray2[0] = j3;
                        break block0;
                    }
                    case 3: {
                        j[] jArray3 = new j[3];
                        jArray3[0] = j3;
                        jArray3[1] = j3;
                        jArray = jArray3;
                        jArray3[2] = j3;
                        break block0;
                    }
                    case 4: {
                        j[] jArray4 = new j[2];
                        jArray4[0] = j3;
                        jArray = jArray4;
                        jArray4[1] = d2.g();
                        break block0;
                    }
                }
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        this(d2, j2, j3, jArray);
    }

    protected p(d d2, j j2, j j3, j[] jArray) {
        this.f = null;
        this.a = d2;
        this.b = j2;
        this.c = j3;
        this.d = jArray;
    }

    protected abstract boolean a();

    protected boolean b() {
        block8: {
            block7: {
                if (org.bouncycastle.math.ec.c.b.equals(this.a.j())) {
                    return true;
                }
                Object object = this.a.i();
                if (object == null) break block7;
                BigInteger bigInteger = object;
                object = this;
                BigInteger bigInteger2 = bigInteger.abs();
                Object object2 = ((p)object).a.e();
                int n2 = bigInteger2.bitLength();
                if (n2 > 0) {
                    if (bigInteger2.testBit(0)) {
                        object2 = object;
                    }
                    for (int i2 = 1; i2 < n2; ++i2) {
                        object = ((p)object).s();
                        if (!bigInteger2.testBit(i2)) continue;
                        object2 = ((p)object2).b((p)object);
                    }
                }
                if (!((p)(bigInteger.signum() < 0 ? ((p)object2).r() : object2)).n()) break block8;
            }
            return true;
        }
        return false;
    }

    public final d c() {
        return this.a;
    }

    protected final int d() {
        if (this.a == null) {
            return 0;
        }
        return this.a.k();
    }

    public final j e() {
        this.u();
        return this.b;
    }

    public final j f() {
        this.u();
        return this.h();
    }

    public final j g() {
        return this.b;
    }

    public j h() {
        return this.c;
    }

    public j a(int n2) {
        if (n2 < 0 || n2 >= this.d.length) {
            return null;
        }
        return this.d[n2];
    }

    public final j i() {
        return this.b;
    }

    public final j j() {
        return this.c;
    }

    protected final j[] k() {
        return this.d;
    }

    private void u() {
        if (!this.l()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public final boolean l() {
        int n2 = this.d();
        return n2 == 0 || n2 == 5 || this.n() || this.d[0].i();
    }

    public final p m() {
        if (this.n()) {
            return this;
        }
        switch (this.d()) {
            case 0: 
            case 5: {
                return this;
            }
        }
        j j2 = this.a(0);
        if (j2.i()) {
            return this;
        }
        return this.a(j2.f());
    }

    final p a(j j2) {
        switch (this.d()) {
            case 1: 
            case 6: {
                j j3 = j2;
                return this.a(j3, j3);
            }
            case 2: 
            case 3: 
            case 4: {
                j j4 = j2.e();
                j2 = j4.c(j2);
                return this.a(j4, j2);
            }
        }
        throw new IllegalStateException("not a projective coordinate system");
    }

    private p a(j j2, j j3) {
        return this.a.a(this.b.c(j2), this.c.c(j3), this.e);
    }

    public final boolean n() {
        return this.b == null || this.c == null || this.d.length > 0 && this.d[0].j();
    }

    public final boolean o() {
        return this.a(true);
    }

    final boolean a(boolean bl2) {
        if (this.n()) {
            return true;
        }
        return !((ac)this.a.a(this, "bc_validity", new q(this, bl2))).a();
    }

    public p b(j j2) {
        if (this.n()) {
            return this;
        }
        return this.a.a(this.b.c(j2), this.c, this.d, this.e);
    }

    public p c(j j2) {
        if (this.n()) {
            return this;
        }
        return this.a.a(this.b, this.c.c(j2), this.d, this.e);
    }

    public final boolean a(p object) {
        if (object == null) {
            return false;
        }
        d d2 = this.a;
        d d3 = object.a;
        boolean bl2 = d2 == null;
        boolean bl3 = d3 == null;
        boolean bl4 = this.n();
        boolean bl5 = object.n();
        if (bl4 || bl5) {
            return bl4 && bl5 && (bl2 || bl3 || d2.a(d3));
        }
        p p2 = this;
        if (!bl2 || !bl3) {
            if (bl2) {
                object = object.m();
            } else if (bl3) {
                p2 = p2.m();
            } else {
                if (!d2.a(d3)) {
                    return false;
                }
                object = new p[]{this, d2.a((p)object)};
                d2.a((p[])object);
                p2 = object[0];
                object = object[1];
            }
        }
        return p2.b.equals(object.b) && p2.h().equals(object.h());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof p)) {
            return false;
        }
        return this.a((p)object);
    }

    public int hashCode() {
        int n2;
        d d2 = this.a;
        int n3 = n2 = d2 == null ? 0 : ~d2.hashCode();
        if (!this.n()) {
            p p2 = this.m();
            n2 = n2 ^ p2.b.hashCode() * 17 ^ p2.h().hashCode() * 257;
        }
        return n2;
    }

    public String toString() {
        if (this.n()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.b);
        stringBuffer.append(',');
        stringBuffer.append(this.c);
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            stringBuffer.append(',');
            stringBuffer.append(this.d[i2]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    public final byte[] p() {
        p p2 = this;
        return p2.b(p2.e);
    }

    public final byte[] b(boolean bl2) {
        if (this.n()) {
            return new byte[1];
        }
        Object object = this.m();
        byte[] byArray = ((p)object).b.l();
        if (bl2) {
            byte[] byArray2 = new byte[byArray.length + 1];
            byte[] byArray3 = byArray2;
            byArray2[0] = (byte)(((p)object).q() ? 3 : 2);
            System.arraycopy(byArray, 0, byArray3, 1, byArray.length);
            return byArray3;
        }
        byte[] byArray4 = ((p)object).h().l();
        byte[] byArray5 = new byte[byArray.length + byArray4.length + 1];
        object = byArray5;
        byArray5[0] = 4;
        System.arraycopy(byArray, 0, object, 1, byArray.length);
        System.arraycopy(byArray4, 0, object, byArray.length + 1, byArray4.length);
        return object;
    }

    protected abstract boolean q();

    public abstract p b(p var1);

    public abstract p r();

    public p b(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        p p2 = this;
        while (--n2 >= 0) {
            p2 = p2.s();
        }
        return p2;
    }

    public abstract p s();

    public p c(p p2) {
        return this.s().b(p2);
    }

    public p t() {
        p p2 = this;
        return p2.c(p2);
    }

    public final p a(BigInteger bigInteger) {
        return this.a.l().a(this, bigInteger);
    }
}

