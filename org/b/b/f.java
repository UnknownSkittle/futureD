/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.b.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.b.a;
import org.b.a.d;
import org.b.b;
import org.b.b.e;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class f
implements a {
    private boolean a = false;
    private Map<String, e> b = new HashMap<String, e>();
    private LinkedBlockingQueue<d> c = new LinkedBlockingQueue();

    @Override
    public final synchronized b a(String string) {
        e e2 = this.b.get(string);
        if (e2 == null) {
            e2 = new e(string, this.c, this.a);
            this.b.put(string, e2);
        }
        return e2;
    }

    public final List<e> a() {
        return new ArrayList<e>(this.b.values());
    }

    public final LinkedBlockingQueue<d> b() {
        return this.c;
    }

    public final void c() {
        this.a = true;
    }

    public final void d() {
        this.b.clear();
        this.c.clear();
    }
}

