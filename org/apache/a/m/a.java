/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.m.d;

public final class a
implements d {
    private final d a = null;
    private final Map<String, Object> b = new ConcurrentHashMap<String, Object>();

    public a() {
        this(0);
    }

    private a(byte by2) {
    }

    @Override
    public final Object a(String string) {
        ai.a(string, "Id");
        return this.b.get(string);
    }

    @Override
    public final void a(String string, Object object) {
        ai.a(string, "Id");
        if (object != null) {
            this.b.put(string, object);
            return;
        }
        this.b.remove(string);
    }

    public final String toString() {
        return this.b.toString();
    }
}

