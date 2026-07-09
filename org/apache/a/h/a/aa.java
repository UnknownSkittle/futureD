/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.a;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.h.a.a;
import org.apache.a.j.g;
import org.apache.a.j.v;
import org.apache.a.n.b;
import org.apache.a.q;

public abstract class aa
extends a
implements Serializable {
    private final Map<String, String> a = new HashMap<String, String>();
    private transient Charset b;

    public aa(Charset charset) {
        this.b = charset != null ? charset : c.b;
    }

    final String a(q object) {
        if ((object = (String)object.f().a("http.auth.credential-charset")) == null) {
            object = this;
            object = (((aa)object).b != null ? ((aa)object).b : c.b).name();
        }
        return object;
    }

    @Override
    protected final void a(b fArray, int n2, int n3) {
        g g2 = g.a;
        v v2 = new v(n2, fArray.length());
        fArray = g2.a((b)fArray, v2);
        this.a.clear();
        for (f f2 : fArray) {
            this.a.put(f2.a().toLowerCase(Locale.ROOT), f2.b());
        }
    }

    protected final Map<String, String> f() {
        return this.a;
    }

    public final String a(String string) {
        return this.a.get(string.toLowerCase(Locale.ROOT));
    }

    @Override
    public final String b() {
        return this.a("realm");
    }
}

