/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.b;

import com.a.a.b.ai;
import org.apache.a.e.b;
import org.apache.a.j.d;
import org.apache.a.s;

public final class h
implements b {
    public static final h a = new h();

    @Override
    public final long a(s object) {
        ai.a(object, "HTTP response");
        object = new d(object.e("Keep-Alive"));
        while (object.hasNext()) {
            Object object2 = object.a();
            String string = object2.a();
            if ((object2 = object2.b()) == null || !string.equalsIgnoreCase("timeout")) continue;
            try {
                return Long.parseLong((String)object2) * 1000L;
            } catch (NumberFormatException numberFormatException) {
            }
        }
        return -1L;
    }
}

