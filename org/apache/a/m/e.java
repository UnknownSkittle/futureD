/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import org.apache.a.j;
import org.apache.a.m.a;
import org.apache.a.m.d;
import org.apache.a.n;

public class e
implements d {
    private final d a;

    public e(d d2) {
        this.a = d2;
    }

    public e() {
        this.a = new a();
    }

    @Override
    public final Object a(String string) {
        return this.a.a(string);
    }

    @Override
    public final void a(String string, Object object) {
        this.a.a(string, object);
    }

    public final <T> T a(String object, Class<T> clazz) {
        ai.a(clazz, "Attribute class");
        object = this.a((String)object);
        if (object == null) {
            return null;
        }
        return clazz.cast(object);
    }

    public final j j() {
        return this.a("http.connection", j.class);
    }

    public final n k() {
        return this.a("http.target_host", n.class);
    }
}

