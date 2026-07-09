/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.d;
import org.apache.a.e;
import org.apache.a.f.b;
import org.apache.a.f.f;
import org.apache.a.f.h;
import org.apache.a.f.j;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.c;
import org.apache.a.j.q;
import org.apache.a.j.v;
import org.apache.a.j.w;

public class aj
implements j {
    private static final BitSet a = w.a(61, 59);
    private static final BitSet b = w.a(59);
    private static final BitSet c = w.a(32, 34, 44, 59, 92);
    private final org.apache.a.f.d[] d;
    private final Map<String, org.apache.a.f.d> e;
    private final w f;

    protected aj(b ... bArray) {
        this.d = (org.apache.a.f.d[])bArray.clone();
        this.e = new ConcurrentHashMap<String, org.apache.a.f.d>(bArray.length);
        for (b b2 : bArray) {
            this.e.put(b2.a().toLowerCase(Locale.ROOT), b2);
        }
        this.f = w.a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<org.apache.a.f.c> a(e object, f object2) {
        Object object3;
        v v2;
        Object object4;
        ai.a(object, "Header");
        ai.a(object2, "Cookie origin");
        if (!object.c().equalsIgnoreCase("Set-Cookie")) {
            throw new l("Unrecognized cookie header: '" + object.toString() + "'");
        }
        if (object instanceof d) {
            object4 = ((d)object).a();
            v2 = new v(((d)object).b(), ((org.apache.a.n.b)object4).length());
        } else {
            object3 = object.d();
            if (object3 == null) {
                throw new l("Header value is null");
            }
            object4 = new org.apache.a.n.b(((String)object3).length());
            ((org.apache.a.n.b)object4).a((String)object3);
            v2 = new v(0, ((org.apache.a.n.b)object4).length());
        }
        object3 = w.a((org.apache.a.n.b)object4, v2, a);
        if (((String)object3).length() == 0) {
            return Collections.emptyList();
        }
        if (v2.c()) {
            return Collections.emptyList();
        }
        char n2 = ((org.apache.a.n.b)object4).charAt(v2.b());
        v v3 = v2;
        v3.a(v3.b() + 1);
        if (n2 != '=') {
            throw new l("Cookie value is invalid: '" + object.toString() + "'");
        }
        object = w.b((org.apache.a.n.b)object4, v2, b);
        if (!v2.c()) {
            v v4 = v2;
            v4.a(v4.b() + 1);
        }
        object = new c((String)object3, (String)object);
        object3 = ((f)object2).b();
        int string = ((String)object3).lastIndexOf(47);
        if (string >= 0) {
            int entry;
            if (string == 0) {
                entry = 1;
            }
            object3 = ((String)object3).substring(0, entry);
        }
        ((c)object).e((String)object3);
        ((c)object).d(((f)object2).a());
        ((c)object).c(new Date());
        object2 = new LinkedHashMap<Object, void>();
        while (!v2.c()) {
            void var6_11;
            object3 = w.a((org.apache.a.n.b)object4, v2, a).toLowerCase(Locale.ROOT);
            Object var6_9 = null;
            if (!v2.c()) {
                char c2 = ((org.apache.a.n.b)object4).charAt(v2.b());
                v2 = v2;
                v2.a(v2.b() + 1);
                if (c2 == '=') {
                    String string2 = w.a((org.apache.a.n.b)object4, v2, b);
                    if (!v2.c()) {
                        v v5 = v2;
                        v5.a(v5.b() + 1);
                    }
                }
            }
            ((c)object).a((String)object3, (String)var6_11);
            object2.put(object3, var6_11);
        }
        if (object2.containsKey("max-age")) {
            object2.remove("expires");
        }
        for (Map.Entry entry : object2.entrySet()) {
            String string3 = (String)entry.getKey();
            object2 = (String)entry.getValue();
            object4 = this.e.get(string3);
            if (object4 == null) continue;
            object4.a((m)object, (String)object2);
        }
        return Collections.singletonList(object);
    }

    @Override
    public final void a(org.apache.a.f.c c2, f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        org.apache.a.f.d[] dArray = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dArray[i2].a(c2, f2);
        }
    }

    @Override
    public final boolean b(org.apache.a.f.c c2, f f2) {
        ai.a(c2, "Cookie");
        ai.a(f2, "Cookie origin");
        org.apache.a.f.d[] dArray = this.d;
        int n2 = this.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (dArray[i2].b(c2, f2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public final List<e> a(List<org.apache.a.f.c> list) {
        ai.a(list, "List of cookies");
        if (list.size() > 1) {
            list = new ArrayList<org.apache.a.f.c>(list);
            Collections.sort(list, h.a);
        }
        org.apache.a.n.b b2 = new org.apache.a.n.b(20 * list.size());
        b2.a("Cookie");
        b2.a(": ");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            Object object = list.get(i2);
            if (i2 > 0) {
                b2.a(';');
                b2.a(' ');
            }
            b2.a(object.a());
            object = object.b();
            if (object == null) continue;
            b2.a('=');
            if (aj.a((CharSequence)object, c)) {
                b2.a('\"');
                for (int i3 = 0; i3 < ((String)object).length(); ++i3) {
                    char c2 = ((String)object).charAt(i3);
                    if (c2 == '\"' || c2 == '\\') {
                        b2.a('\\');
                    }
                    b2.a(c2);
                }
                b2.a('\"');
                continue;
            }
            b2.a((String)object);
        }
        ArrayList<e> arrayList = new ArrayList<e>(1);
        arrayList.add(new q(b2));
        return arrayList;
    }

    private static boolean a(CharSequence charSequence, BitSet bitSet) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!bitSet.get(c2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final e b() {
        return null;
    }
}

