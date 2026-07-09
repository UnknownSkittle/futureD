/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.a.f.c;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;
import org.apache.a.h.d.f;

public final class t
extends f {
    @Override
    public final void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (ai.b(string)) {
            throw new l("Blank or null value for domain attribute");
        }
        m2.d(string);
    }

    @Override
    public final void a(c object, org.apache.a.f.f object2) {
        if (!((String)(object2 = ((org.apache.a.f.f)object2).a())).equals(object = object.d()) && !f.a((String)object, (String)object2)) {
            throw new i("Illegal domain attribute \"" + (String)object + "\". Domain of origin: \"" + (String)object2 + "\"");
        }
        if (((String)object2).contains(".")) {
            int n2 = new StringTokenizer((String)object, ".").countTokens();
            String string = ((String)object).toUpperCase(Locale.ROOT);
            if (string.endsWith(".COM") || string.endsWith(".EDU") || string.endsWith(".NET") || string.endsWith(".GOV") || string.endsWith(".MIL") || string.endsWith(".ORG") || string.endsWith(".INT")) {
                if (n2 < 2) {
                    throw new i("Domain attribute \"" + (String)object + "\" violates the Netscape cookie specification for special domains");
                }
            } else if (n2 < 3) {
                throw new i("Domain attribute \"" + (String)object + "\" violates the Netscape cookie specification");
            }
        }
    }

    @Override
    public final boolean b(c object, org.apache.a.f.f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        object2 = ((org.apache.a.f.f)object2).a();
        object = object.d();
        if (object == null) {
            return false;
        }
        return ((String)object2).endsWith((String)object);
    }

    @Override
    public final String a() {
        return "domain";
    }
}

