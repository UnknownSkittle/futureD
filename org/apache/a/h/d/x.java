/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.e.d.e;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.m;

public final class x
implements b {
    private final b a;
    private final e b;
    private final Map<String, Boolean> c;

    private x(b object, e e2) {
        this.a = ai.a(object, "Cookie handler");
        this.b = ai.a(e2, "Public suffix matcher");
        object = new ConcurrentHashMap<String, Boolean>();
        ((ConcurrentHashMap)object).put(".localhost.", Boolean.TRUE);
        ((ConcurrentHashMap)object).put(".test.", Boolean.TRUE);
        ((ConcurrentHashMap)object).put(".local.", Boolean.TRUE);
        ((ConcurrentHashMap)object).put(".local", Boolean.TRUE);
        ((ConcurrentHashMap)object).put(".localdomain", Boolean.TRUE);
        this.c = object;
    }

    @Override
    public final boolean b(c c2, f f2) {
        String string;
        String string2 = c2.d();
        int n2 = string2.indexOf(46);
        if (n2 >= 0 ? !this.c.containsKey(string = string2.substring(n2)) && this.b.a(string2) : !string2.equalsIgnoreCase(f2.a()) && this.b.a(string2)) {
            return false;
        }
        return this.a.b(c2, f2);
    }

    @Override
    public final void a(m m2, String string) {
        this.a.a(m2, string);
    }

    @Override
    public final void a(c c2, f f2) {
        this.a.a(c2, f2);
    }

    @Override
    public final String a() {
        return this.a.a();
    }

    public static b a(b b2, e e2) {
        ai.a(b2, "Cookie attribute handler");
        if (e2 != null) {
            return new x(b2, e2);
        }
        return b2;
    }
}

