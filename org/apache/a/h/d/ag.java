/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.a.f;
import org.apache.a.f.a;
import org.apache.a.f.b;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.ac;
import org.apache.a.h.d.ad;
import org.apache.a.h.d.ae;
import org.apache.a.h.d.af;
import org.apache.a.h.d.ah;
import org.apache.a.h.d.ai;
import org.apache.a.h.d.c;
import org.apache.a.h.d.d;
import org.apache.a.h.d.e;
import org.apache.a.h.d.g;
import org.apache.a.h.d.h;
import org.apache.a.h.d.j;
import org.apache.a.h.d.z;
import org.apache.a.j.q;
import org.apache.a.y;

public final class ag
extends z {
    public ag() {
        this(0);
    }

    private ag(byte by2) {
        super(new ai(), new ah(), new ae(), new af(), new h(), new j(), new e(), new g(a), new ac(), new ad());
    }

    ag(b ... bArray) {
        super(bArray);
    }

    @Override
    public final List<org.apache.a.f.c> a(org.apache.a.e fArray, org.apache.a.f.f f2) {
        com.a.a.b.ai.a(fArray, "Header");
        com.a.a.b.ai.a(f2, "Cookie origin");
        if (!fArray.c().equalsIgnoreCase("Set-Cookie2")) {
            throw new l("Unrecognized cookie header '" + fArray.toString() + "'");
        }
        fArray = fArray.e();
        return this.b(fArray, ag.b(f2));
    }

    @Override
    protected final List<org.apache.a.f.c> a(f[] fArray, org.apache.a.f.f f2) {
        return this.b(fArray, ag.b(f2));
    }

    private List<org.apache.a.f.c> b(f[] fArray, org.apache.a.f.f f2) {
        ArrayList<org.apache.a.f.c> arrayList = new ArrayList<org.apache.a.f.c>(fArray.length);
        for (f f3 : fArray) {
            Object object = f3.a();
            Object object2 = f3.b();
            if (object == null || ((String)object).isEmpty()) {
                throw new l("Cookie name may not be empty");
            }
            object = new d((String)object, (String)object2);
            ((c)object).e(ag.a(f2));
            ((c)object).d(f2.a());
            ((d)object).a(new int[]{f2.c()});
            y[] yArray = f3.c();
            object2 = new HashMap(yArray.length);
            for (int i2 = yArray.length - 1; i2 >= 0; --i2) {
                y y2 = yArray[i2];
                object2.put(y2.a().toLowerCase(Locale.ROOT), y2);
            }
            Iterator iterator = object2.entrySet().iterator();
            while (iterator.hasNext()) {
                y y3 = (y)iterator.next().getValue();
                object2 = y3.a().toLowerCase(Locale.ROOT);
                ((c)object).a((String)object2, y3.b());
                if ((object2 = this.a((String)object2)) == null) continue;
                object2.a((m)object, y3.b());
            }
            arrayList.add((org.apache.a.f.c)object);
        }
        return arrayList;
    }

    @Override
    public final void a(org.apache.a.f.c c2, org.apache.a.f.f f2) {
        com.a.a.b.ai.a(c2, "Cookie");
        com.a.a.b.ai.a(f2, "Cookie origin");
        super.a(c2, ag.b(f2));
    }

    @Override
    public final boolean b(org.apache.a.f.c c2, org.apache.a.f.f f2) {
        com.a.a.b.ai.a(c2, "Cookie");
        com.a.a.b.ai.a(f2, "Cookie origin");
        return super.b(c2, ag.b(f2));
    }

    @Override
    protected final void a(org.apache.a.n.b b2, org.apache.a.f.c object, int n2) {
        String string;
        super.a(b2, (org.apache.a.f.c)object, n2);
        if (object instanceof a && (string = ((a)object).a("port")) != null) {
            b2.a("; $Port");
            b2.a("=\"");
            if (!string.trim().isEmpty()) {
                int[] nArray = object.f();
                object = nArray;
                if (nArray != null) {
                    int n3 = ((Object)object).length;
                    for (int i2 = 0; i2 < n3; ++i2) {
                        if (i2 > 0) {
                            b2.a(",");
                        }
                        b2.a(Integer.toString((int)object[i2]));
                    }
                }
            }
            b2.a("\"");
        }
    }

    private static org.apache.a.f.f b(org.apache.a.f.f f2) {
        String string = f2.a();
        boolean bl2 = true;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != '.' && c2 != ':') continue;
            bl2 = false;
            break;
        }
        if (bl2) {
            string = string + ".local";
            return new org.apache.a.f.f(string, f2.c(), f2.b(), f2.d());
        }
        return f2;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final org.apache.a.e b() {
        org.apache.a.n.b b2 = new org.apache.a.n.b(40);
        b2.a("Cookie2");
        b2.a(": ");
        b2.a("$Version=");
        b2.a(Integer.toString(1));
        return new q(b2);
    }

    @Override
    public final String toString() {
        return "rfc2965";
    }
}

