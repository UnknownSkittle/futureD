/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import org.apache.a.f.a;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.f.n;

public final class ai
implements b {
    @Override
    public final void a(m m2, String string) {
        int n2;
        com.a.a.b.ai.a(m2, "Cookie");
        if (string == null) {
            throw new l("Missing value for version attribute");
        }
        try {
            n2 = Integer.parseInt(string);
        } catch (NumberFormatException numberFormatException) {
            n2 = -1;
        }
        if (n2 < 0) {
            throw new l("Invalid cookie version.");
        }
        m2.a(n2);
    }

    @Override
    public final void a(c c2, f f2) {
        com.a.a.b.ai.a(c2, "Cookie");
        if (c2 instanceof n && c2 instanceof a && !((a)c2).b("version")) {
            throw new i("Violates RFC 2965. Version attribute is required.");
        }
    }

    @Override
    public final boolean b(c c2, f f2) {
        return true;
    }

    @Override
    public final String a() {
        return "version";
    }
}

