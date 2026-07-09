/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.b.ac;
import org.bouncycastle.b.an;
import org.bouncycastle.b.ar;
import org.bouncycastle.b.e;
import org.bouncycastle.b.g;
import org.bouncycastle.b.i;
import org.bouncycastle.b.j;
import org.bouncycastle.b.n;
import org.bouncycastle.b.q;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ao;
import org.bouncycastle.openpgp.b.a;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class ab {
    org.bouncycastle.b.aa a;
    an b;
    List c = new ArrayList();
    List d = new ArrayList();
    List e = new ArrayList();
    List f = new ArrayList();
    List g = null;
    private long h;
    private byte[] i;
    private int j;

    private void a(a object) {
        e e2 = this.a.d();
        this.i = object.a(this.a);
        if (this.a.a() <= 3) {
            object = (ac)e2;
            this.h = ((ac)object).c().longValue();
            this.j = ((ac)object).c().bitLength();
            return;
        }
        this.h = (long)(this.i[this.i.length - 8] & 0xFF) << 56 | (long)(this.i[this.i.length - 7] & 0xFF) << 48 | (long)(this.i[this.i.length - 6] & 0xFF) << 40 | (long)(this.i[this.i.length - 5] & 0xFF) << 32 | (long)(this.i[this.i.length - 4] & 0xFF) << 24 | (long)(this.i[this.i.length - 3] & 0xFF) << 16 | (long)(this.i[this.i.length - 2] & 0xFF) << 8 | (long)(this.i[this.i.length - 1] & 0xFF);
        if (e2 instanceof ac) {
            this.j = ((ac)e2).c().bitLength();
            return;
        }
        if (e2 instanceof j) {
            this.j = ((j)e2).c().bitLength();
            return;
        }
        if (e2 instanceof q) {
            this.j = ((q)e2).b().bitLength();
            return;
        }
        if (e2 instanceof n) {
            object = org.bouncycastle.asn1.util.a.b(((n)e2).e());
            if (object != null) {
                this.j = ((aa)object).a().a();
                return;
            }
            this.j = -1;
        }
    }

    public ab(org.bouncycastle.b.aa aa2, a a2) {
        this.a = aa2;
        this.d = new ArrayList();
        this.f = new ArrayList();
        this.a(a2);
    }

    ab(org.bouncycastle.b.aa aa2, an an2, List list, a a2) {
        this.a = aa2;
        this.b = an2;
        this.g = list;
        this.a(a2);
    }

    ab(ab ab2, List list) {
        this.a = ab2.a;
        this.b = null;
        this.g = list;
        this.i = ab2.i;
        this.h = ab2.h;
        this.j = ab2.j;
    }

    ab(ab ab2) {
        int n2;
        this.a = ab2.a;
        this.c = new ArrayList(ab2.c);
        this.d = new ArrayList(ab2.d);
        this.e = new ArrayList(ab2.e);
        this.f = new ArrayList(ab2.f.size());
        for (n2 = 0; n2 != ab2.f.size(); ++n2) {
            this.f.add(new ArrayList((ArrayList)ab2.f.get(n2)));
        }
        if (ab2.g != null) {
            this.g = new ArrayList(ab2.g.size());
            for (n2 = 0; n2 != ab2.g.size(); ++n2) {
                this.g.add(ab2.g.get(n2));
            }
        }
        this.i = ab2.i;
        this.h = ab2.h;
        this.j = ab2.j;
    }

    ab(org.bouncycastle.b.aa aa2, an an2, List list, List list2, List list3, List list4, a a2) {
        this.a = aa2;
        this.b = an2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.a(a2);
    }

    public final long a() {
        return this.h;
    }

    public final byte[] b() {
        byte[] byArray = new byte[this.i.length];
        System.arraycopy(this.i, 0, byArray, 0, byArray.length);
        return byArray;
    }

    public final boolean c() {
        int n2 = this.a.b();
        return n2 == 1 || n2 == 2 || n2 == 16 || n2 == 20 || n2 == 18;
    }

    public final boolean d() {
        return this.g == null;
    }

    public final int e() {
        return this.a.b();
    }

    public final Iterator<String> f() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 != this.d.size(); ++i2) {
            if (!(this.d.get(i2) instanceof ar)) continue;
            arrayList.add(((ar)this.d.get(i2)).a());
        }
        return arrayList.iterator();
    }

    public final Iterator g() {
        ArrayList<aj> arrayList = new ArrayList<aj>();
        Iterator iterator = this.i();
        while (iterator.hasNext()) {
            aj aj2 = (aj)iterator.next();
            if (aj2.b() != 31) continue;
            arrayList.add(aj2);
        }
        return arrayList.iterator();
    }

    private Iterator i() {
        if (this.g == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.c);
            for (int i2 = 0; i2 != this.f.size(); ++i2) {
                arrayList.addAll((Collection)this.f.get(i2));
            }
            return arrayList.iterator();
        }
        return this.g.iterator();
    }

    public final org.bouncycastle.b.aa h() {
        return this.a;
    }

    public final void a(OutputStream outputStream) {
        this.b(outputStream);
    }

    public final void b(OutputStream outputStream) {
        outputStream = outputStream instanceof g ? (g)outputStream : new g(outputStream);
        Object object = this.a;
        Object object2 = outputStream;
        ((i)object).a((g)object2);
        if (this.b != null) {
            object = this.b;
            object2 = outputStream;
            ((i)object).a((g)object2);
        }
        if (this.g == null) {
            int n2;
            for (n2 = 0; n2 != this.c.size(); ++n2) {
                ((aj)this.c.get(n2)).a(outputStream);
            }
            for (n2 = 0; n2 != this.d.size(); ++n2) {
                if (this.d.get(n2) instanceof ar) {
                    object = object2 = (ar)this.d.get(n2);
                    object2 = outputStream;
                    ((i)object).a((g)object2);
                } else {
                    object2 = (ao)this.d.get(n2);
                    object = new org.bouncycastle.b.ao(((ao)object2).a);
                    object2 = outputStream;
                    ((i)object).a((g)object2);
                }
                if (this.e.get(n2) != null) {
                    object = (i)this.e.get(n2);
                    object2 = outputStream;
                    ((i)object).a((g)object2);
                }
                object2 = (List)this.f.get(n2);
                for (int i2 = 0; i2 != object2.size(); ++i2) {
                    ((aj)object2.get(i2)).b(outputStream);
                }
            }
            return;
        }
        for (int i3 = 0; i3 != this.g.size(); ++i3) {
            ((aj)this.g.get(i3)).b(outputStream);
        }
    }

    public static ab a(ab ab2, aj aj2) {
        if (ab2.d()) {
            if (aj2.b() == 40) {
                throw new IllegalArgumentException("signature type incorrect for master key revocation.");
            }
        } else if (aj2.b() == 32) {
            throw new IllegalArgumentException("signature type incorrect for sub-key revocation.");
        }
        ab2 = new ab(ab2);
        if (ab2.g != null) {
            ab2.g.add(aj2);
        } else {
            ab2.c.add(aj2);
        }
        return ab2;
    }
}

