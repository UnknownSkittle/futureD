/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.a.f;
import org.apache.a.f.d;
import org.apache.a.f.m;
import org.apache.a.h.d.b;
import org.apache.a.h.d.c;
import org.apache.a.y;

public abstract class k
extends b {
    public k() {
    }

    protected k(org.apache.a.f.b ... bArray) {
        super(bArray);
    }

    protected static String a(org.apache.a.f.f object) {
        int n2 = ((String)(object = ((org.apache.a.f.f)object).b())).lastIndexOf(47);
        if (n2 >= 0) {
            if (n2 == 0) {
                n2 = 1;
            }
            object = ((String)object).substring(0, n2);
        }
        return object;
    }

    protected List<org.apache.a.f.c> a(f[] fArray, org.apache.a.f.f f2) {
        ArrayList<org.apache.a.f.c> arrayList = new ArrayList<org.apache.a.f.c>(fArray.length);
        for (f f3 : fArray) {
            Object object = f3.a();
            String string = f3.b();
            if (object == null || ((String)object).isEmpty()) continue;
            object = new c((String)object, string);
            ((c)object).e(k.a(f2));
            ((c)object).d(f2.a());
            y[] yArray = f3.c();
            for (int i2 = yArray.length - 1; i2 >= 0; --i2) {
                y y2 = yArray[i2];
                Object object2 = y2.a().toLowerCase(Locale.ROOT);
                ((c)object).a((String)object2, y2.b());
                object2 = this.a((String)object2);
                if (object2 == null) continue;
                object2.a((m)object, y2.b());
            }
            arrayList.add((org.apache.a.f.c)object);
        }
        return arrayList;
    }

    @Override
    public void a(org.apache.a.f.c c2, org.apache.a.f.f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        Iterator<d> iterator = this.c().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(c2, f2);
        }
    }

    @Override
    public boolean b(org.apache.a.f.c c2, org.apache.a.f.f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        Iterator<d> iterator = this.c().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().b(c2, f2)) continue;
            return false;
        }
        return true;
    }
}

