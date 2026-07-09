/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;

public final class y
implements b {
    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (string == null) {
            throw new l("Missing value for domain attribute");
        }
        if (string.trim().isEmpty()) {
            throw new l("Blank value for domain attribute");
        }
        m2.d(string);
    }

    @Override
    public final void a(c object, f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        object2 = ((f)object2).a();
        object = object.d();
        if (object == null) {
            throw new i("Cookie domain may not be null");
        }
        if (!((String)object).equals(object2)) {
            if (((String)object).indexOf(46) == -1) {
                throw new i("Domain attribute \"" + (String)object + "\" does not match the host \"" + (String)object2 + "\"");
            }
            if (!((String)object).startsWith(".")) {
                throw new i("Domain attribute \"" + (String)object + "\" violates RFC 2109: domain must start with a dot");
            }
            int n2 = ((String)object).indexOf(46, 1);
            if (n2 < 0 || n2 == ((String)object).length() - 1) {
                throw new i("Domain attribute \"" + (String)object + "\" violates RFC 2109: domain must contain an embedded dot");
            }
            if (!((String)(object2 = ((String)object2).toLowerCase(Locale.ROOT))).endsWith((String)object)) {
                throw new i("Illegal domain attribute \"" + (String)object + "\". Domain of origin: \"" + (String)object2 + "\"");
            }
            if (((String)object2).substring(0, ((String)object2).length() - ((String)object).length()).indexOf(46) != -1) {
                throw new i("Domain attribute \"" + (String)object + "\" violates RFC 2109: host minus domain may not contain any dots");
            }
        }
    }

    @Override
    public final boolean b(c object, f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        object2 = ((f)object2).a();
        object = object.d();
        if (object == null) {
            return false;
        }
        return ((String)object2).equals(object) || ((String)object).startsWith(".") && ((String)object2).endsWith((String)object);
    }

    @Override
    public final String a() {
        return "domain";
    }
}

