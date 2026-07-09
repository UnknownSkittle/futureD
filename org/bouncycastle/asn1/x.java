/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.asn1.aj;
import org.bouncycastle.asn1.al;
import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.bg;
import org.bouncycastle.asn1.br;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.z;
import org.bouncycastle.e.b;
import org.bouncycastle.e.e;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public abstract class x
extends u
implements e<f> {
    private Vector a = new Vector();
    private boolean b = false;

    public static x a(z z2) {
        u u2 = z2.i();
        if (z2.b) {
            if (z2 instanceof al) {
                return new aj(u2);
            }
            return new br(u2);
        }
        if (u2 instanceof x) {
            return (x)u2;
        }
        if (u2 instanceof v) {
            u2 = (v)u2;
            if (z2 instanceof al) {
                return new aj(((v)u2).b());
            }
            return new br(((v)u2).b());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + z2.getClass().getName());
    }

    protected x() {
    }

    protected x(f f2) {
        this.a.addElement(f2);
    }

    protected x(a a2) {
        for (int i2 = 0; i2 != a2.a(); ++i2) {
            this.a.addElement(a2.a(i2));
        }
    }

    protected x(f[] fArray) {
        for (int i2 = 0; i2 != fArray.length; ++i2) {
            this.a.addElement(fArray[i2]);
        }
    }

    public final Enumeration b() {
        return this.a.elements();
    }

    private f[] c() {
        f[] fArray = new f[this.a.size()];
        for (int i2 = 0; i2 != this.a.size(); ++i2) {
            int n2 = i2;
            fArray[i2] = (f)this.a.elementAt(n2);
        }
        return fArray;
    }

    @Override
    public int hashCode() {
        Enumeration enumeration = this.a.elements();
        int n2 = this.a.size();
        while (enumeration.hasMoreElements()) {
            f f2 = x.a(enumeration);
            n2 = n2 * 17 ^ f2.hashCode();
        }
        return n2;
    }

    @Override
    final u f() {
        if (this.b) {
            bg bg2 = new bg();
            ((x)new bg()).a = this.a;
            return bg2;
        }
        Vector vector = new Vector();
        for (int i2 = 0; i2 != this.a.size(); ++i2) {
            vector.addElement(this.a.elementAt(i2));
        }
        bg bg3 = new bg();
        ((x)new bg()).a = vector;
        super.d();
        return bg3;
    }

    @Override
    final u g() {
        br br2 = new br();
        ((x)new br()).a = this.a;
        return br2;
    }

    @Override
    final boolean a(u object) {
        if (!(object instanceof x)) {
            return false;
        }
        object = (x)object;
        if (this.a.size() != ((x)object).a.size()) {
            return false;
        }
        Enumeration enumeration = this.a.elements();
        object = ((x)object).a.elements();
        while (enumeration.hasMoreElements()) {
            f f2 = x.a(enumeration);
            f f3 = x.a((Enumeration)object);
            if ((f2 = f2.h()) == (f3 = f3.h()) || ((u)f2).equals(f3)) continue;
            return false;
        }
        return true;
    }

    private static f a(Enumeration object) {
        if ((object = (f)object.nextElement()) == null) {
            return ay.a;
        }
        return object;
    }

    private static byte[] a(f f2) {
        try {
            return f2.h().a("DER");
        } catch (IOException iOException) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    private void d() {
        if (!this.b) {
            this.b = true;
            if (this.a.size() > 1) {
                boolean bl2 = true;
                int n2 = this.a.size() - 1;
                while (bl2) {
                    int n3 = 0;
                    byte[] byArray = x.a((f)this.a.elementAt(0));
                    bl2 = false;
                    for (int i2 = 0; i2 != n2; ++i2) {
                        boolean bl3;
                        byte[] byArray2;
                        block6: {
                            byte[] byArray3 = byArray2 = x.a((f)this.a.elementAt(i2 + 1));
                            byte[] byArray4 = byArray;
                            int n4 = Math.min(byArray.length, byArray3.length);
                            for (int i3 = 0; i3 != n4; ++i3) {
                                if (byArray4[i3] == byArray3[i3]) continue;
                                bl3 = (byArray4[i3] & 0xFF) < (byArray3[i3] & 0xFF);
                                break block6;
                            }
                            bl3 = n4 == byArray4.length;
                        }
                        if (bl3) {
                            byArray = byArray2;
                            continue;
                        }
                        Object e2 = this.a.elementAt(i2);
                        this.a.setElementAt(this.a.elementAt(i2 + 1), i2);
                        this.a.setElementAt(e2, i2 + 1);
                        bl2 = true;
                        n3 = i2;
                    }
                    n2 = n3;
                }
            }
        }
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
        return new b<f>(this.c());
    }
}

