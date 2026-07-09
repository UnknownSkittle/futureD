/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Date;
import org.apache.a.f.b;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.a;

public final class g
extends a
implements b {
    private final String[] a;

    public g(String[] stringArray) {
        ai.a(stringArray, "Array of date patterns");
        this.a = stringArray;
    }

    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (string == null) {
            throw new l("Missing value for 'expires' attribute");
        }
        Date date = org.apache.a.b.f.a.a(string, this.a);
        if (date == null) {
            throw new l("Invalid 'expires' attribute: ".concat(String.valueOf(string)));
        }
        m2.b(date);
    }

    @Override
    public final String a() {
        return "expires";
    }
}

