/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.openpgp.ab;
import org.bouncycastle.openpgp.ad;
import org.bouncycastle.openpgp.ag;
import org.bouncycastle.openpgp.ah;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ak;
import org.bouncycastle.openpgp.an;
import org.bouncycastle.openpgp.b.e;
import org.bouncycastle.openpgp.b.g;
import org.bouncycastle.openpgp.b.o;
import org.bouncycastle.openpgp.m;

public final class q {
    private List a = new ArrayList();
    private e b;
    private o c;
    private org.bouncycastle.openpgp.o d;
    private an e;
    private an f;
    private g g;

    public q(org.bouncycastle.openpgp.o o2, String string, o o3, g g2, e e2) {
        this.d = o2;
        this.b = e2;
        this.c = o3;
        this.g = g2;
        this.e = null;
        this.f = null;
        this.a.add(new ag(19, o2, string, o3, g2, e2));
    }

    public final void a(org.bouncycastle.openpgp.o object) {
        org.bouncycastle.openpgp.o o2 = object;
        object = this;
        try {
            ak ak2 = new ak(((q)object).g);
            ak2.a(24, ((q)object).d.b());
            ak2.a(null);
            ak2.a();
            ArrayList<aj> arrayList = new ArrayList<aj>();
            arrayList.add(ak2.a(((q)object).d.a(), o2.a()));
            ((q)object).a.add(new ag(o2.b(), new ab(o2.a(), arrayList), ((q)object).c, ((q)object).b));
            return;
        } catch (m m2) {
            throw m2;
        } catch (Exception exception) {
            throw new m("exception adding subkey: ", exception);
        }
    }

    public final ah a() {
        return new ah(this.a);
    }

    public final ad b() {
        Iterator iterator = this.a.iterator();
        ArrayList<ab> arrayList = new ArrayList<ab>();
        arrayList.add(((ag)iterator.next()).a);
        while (iterator.hasNext()) {
            ab ab2 = new ab(((ag)iterator.next()).a);
            new ab(((ag)iterator.next()).a).a = new org.bouncycastle.b.ab(ab2.a.b(), ab2.a.c(), ab2.a.d());
            arrayList.add(ab2);
        }
        return new ad(arrayList);
    }
}

