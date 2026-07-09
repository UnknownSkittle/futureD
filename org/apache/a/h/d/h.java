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

public final class h
extends a
implements b {
    @Override
    public final void a(m m2, String string) {
        int n2;
        ai.a(m2, "Cookie");
        if (string == null) {
            throw new l("Missing value for 'max-age' attribute");
        }
        try {
            n2 = Integer.parseInt(string);
        } catch (NumberFormatException numberFormatException) {
            throw new l("Invalid 'max-age' attribute: ".concat(String.valueOf(string)));
        }
        if (n2 < 0) {
            throw new l("Negative 'max-age' attribute: ".concat(String.valueOf(string)));
        }
        m2.b(new Date(System.currentTimeMillis() + (long)n2 * 1000L));
    }

    @Override
    public final String a() {
        return "max-age";
    }
}

