/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.List;
import org.apache.a.d;
import org.apache.a.f;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.l;
import org.apache.a.h.d.e;
import org.apache.a.h.d.g;
import org.apache.a.h.d.i;
import org.apache.a.h.d.j;
import org.apache.a.h.d.k;
import org.apache.a.h.d.t;
import org.apache.a.h.d.u;
import org.apache.a.j.q;

public final class v
extends k {
    public v() {
        super(new i(), new t(), new j(), new e(), new g(new String[]{"EEE, dd-MMM-yy HH:mm:ss z"}));
    }

    v(b ... bArray) {
        super(bArray);
    }

    @Override
    public final List<c> a(org.apache.a.e object, org.apache.a.f.f f2) {
        org.apache.a.n.b b2;
        ai.a(object, "Header");
        ai.a(f2, "Cookie origin");
        if (!object.c().equalsIgnoreCase("Set-Cookie")) {
            throw new l("Unrecognized cookie header '" + object.toString() + "'");
        }
        if (object instanceof d) {
            b2 = ((d)object).a();
            object = new org.apache.a.j.v(((d)object).b(), b2.length());
        } else {
            if ((object = object.d()) == null) {
                throw new l("Header value is null");
            }
            b2 = new org.apache.a.n.b(((String)object).length());
            b2.a((String)object);
            object = new org.apache.a.j.v(0, b2.length());
        }
        return this.a(new f[]{u.a(b2, (org.apache.a.j.v)object)}, f2);
    }

    @Override
    public final List<org.apache.a.e> a(List<c> list) {
        ai.a(list, "List of cookies");
        org.apache.a.n.b b2 = new org.apache.a.n.b(20 * list.size());
        b2.a("Cookie");
        b2.a(": ");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object object = list.get(i2);
            if (i2 > 0) {
                b2.a("; ");
            }
            b2.a(object.a());
            object = object.b();
            if (object == null) continue;
            b2.a("=");
            b2.a((String)object);
        }
        ArrayList<org.apache.a.e> arrayList = new ArrayList<org.apache.a.e>(1);
        arrayList.add(new q(b2));
        return arrayList;
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final org.apache.a.e b() {
        return null;
    }

    public final String toString() {
        return "netscape";
    }
}

