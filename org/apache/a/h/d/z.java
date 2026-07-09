/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.a.f.a;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.h.d.aa;
import org.apache.a.h.d.ab;
import org.apache.a.h.d.e;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.j;
import org.apache.a.h.d.k;
import org.apache.a.h.d.y;
import org.apache.a.j.q;

public class z
extends k {
    static final String[] a = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private final boolean b;

    private z() {
        super(new ab(), new aa(), new y(), new h(), new j(), new e(), new g(a));
        this.b = false;
    }

    protected z(b ... bArray) {
        super(bArray);
        this.b = false;
    }

    @Override
    public List<c> a(org.apache.a.e fArray, f f2) {
        ai.a(fArray, "Header");
        ai.a(f2, "Cookie origin");
        if (!fArray.c().equalsIgnoreCase("Set-Cookie")) {
            throw new l("Unrecognized cookie header '" + fArray.toString() + "'");
        }
        fArray = fArray.e();
        return this.a(fArray, f2);
    }

    @Override
    public void a(c c2, f f2) {
        ai.a(c2, "Cookie");
        String string = c2.a();
        if (string.indexOf(32) != -1) {
            throw new i("Cookie name may not contain blanks");
        }
        if (string.startsWith("$")) {
            throw new i("Cookie name may not start with $");
        }
        super.a(c2, f2);
    }

    @Override
    public final List<org.apache.a.e> a(List<c> list) {
        ai.a(list, "List of cookies");
        if (list.size() > 1) {
            list = new ArrayList<c>(list);
            Collections.sort(list, org.apache.a.f.g.a);
        }
        return this.b(list);
    }

    private List<org.apache.a.e> b(List<c> object) {
        ArrayList<org.apache.a.e> arrayList = new ArrayList<org.apache.a.e>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            c c2 = (c)object.next();
            int n2 = c2.h();
            org.apache.a.n.b b2 = new org.apache.a.n.b(40);
            b2.a("Cookie: ");
            b2.a("$Version=");
            b2.a(Integer.toString(n2));
            b2.a("; ");
            this.a(b2, c2, n2);
            arrayList.add(new q(b2));
        }
        return arrayList;
    }

    private static void a(org.apache.a.n.b b2, String string, String string2, int n2) {
        b2.a(string);
        b2.a("=");
        if (string2 != null) {
            if (n2 > 0) {
                b2.a('\"');
                b2.a(string2);
                b2.a('\"');
                return;
            }
            b2.a(string2);
        }
    }

    protected void a(org.apache.a.n.b b2, c c2, int n2) {
        z.a(b2, c2.a(), c2.b(), n2);
        if (c2.e() != null && c2 instanceof a && ((a)c2).b("path")) {
            b2.a("; ");
            z.a(b2, "$Path", c2.e(), n2);
        }
        if (c2.d() != null && c2 instanceof a && ((a)c2).b("domain")) {
            b2.a("; ");
            z.a(b2, "$Domain", c2.d(), n2);
        }
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public org.apache.a.e b() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }
}

