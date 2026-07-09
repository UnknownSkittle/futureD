/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bq;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.w;
import org.bouncycastle.e.b;
import org.bouncycastle.e.e;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public abstract class v
extends u
implements e<f> {
    protected Vector a = new Vector();

    public static v a(Object object) {
        u u2;
        while (true) {
            if (object == null || object instanceof v) {
                return (v)object;
            }
            if (!(object instanceof w)) break;
            object = ((w)object).h();
        }
        if (object instanceof byte[]) {
            try {
                return v.a(v.b((byte[])object));
            } catch (IOException iOException) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + iOException.getMessage());
            }
        }
        if (object instanceof f && (u2 = ((f)object).h()) instanceof v) {
            return (v)u2;
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + object.getClass().getName());
    }

    protected v() {
    }

    protected v(a a2) {
        for (int i2 = 0; i2 != a2.a(); ++i2) {
            this.a.addElement(a2.a(i2));
        }
    }

    public final f[] b() {
        f[] fArray = new f[this.d()];
        for (int i2 = 0; i2 != this.d(); ++i2) {
            fArray[i2] = this.a(i2);
        }
        return fArray;
    }

    public Enumeration c() {
        return this.a.elements();
    }

    public f a(int n2) {
        return (f)this.a.elementAt(n2);
    }

    public int d() {
        return this.a.size();
    }

    @Override
    public int hashCode() {
        Enumeration enumeration = this.c();
        int n2 = this.d();
        while (enumeration.hasMoreElements()) {
            f f2 = v.a(enumeration);
            n2 = n2 * 17 ^ f2.hashCode();
        }
        return n2;
    }

    @Override
    final boolean a(u object) {
        if (!(object instanceof v)) {
            return false;
        }
        object = (v)object;
        if (this.d() != ((v)object).d()) {
            return false;
        }
        Enumeration enumeration = this.c();
        object = ((v)object).c();
        while (enumeration.hasMoreElements()) {
            f f2 = v.a(enumeration);
            f f3 = v.a((Enumeration)object);
            if ((f2 = f2.h()) == (f3 = f3.h()) || ((u)f2).equals(f3)) continue;
            return false;
        }
        return true;
    }

    private static f a(Enumeration enumeration) {
        return (f)enumeration.nextElement();
    }

    @Override
    u f() {
        be be2 = new be();
        new be().a = this.a;
        return be2;
    }

    @Override
    u g() {
        bq bq2 = new bq();
        new bq().a = this.a;
        return bq2;
    }

    @Override
    final boolean a() {
        return true;
    }

    @Override
    abstract void a(r var1);

    public String toString() {
        return this.a.toString();
    }

    public Iterator<f> iterator() {
        return new b<f>(this.b());
    }
}

