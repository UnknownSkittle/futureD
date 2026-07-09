/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.a;

public final class ab
extends a
implements b {
    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (string == null) {
            throw new l("Missing value for version attribute");
        }
        if (string.trim().isEmpty()) {
            throw new l("Blank value for version attribute");
        }
        try {
            m2.a(Integer.parseInt(string));
            return;
        } catch (NumberFormatException numberFormatException) {
            throw new l("Invalid version: " + numberFormatException.getMessage());
        }
    }

    @Override
    public final void a(c c2, f f2) {
        ai.a(c2, "Cookie");
        if (c2.h() < 0) {
            throw new i("Cookie version may not be negative");
        }
    }

    @Override
    public final String a() {
        return "version";
    }
}

