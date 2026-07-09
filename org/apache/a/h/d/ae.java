/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.f.a;
import org.apache.a.f.b;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;

public final class ae
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
        String string2 = string.toLowerCase(Locale.ROOT);
        if (!string.startsWith(".")) {
            string2 = ".".concat(String.valueOf(string2));
        }
        m2.d(string2);
    }

    private static boolean a(String string, String string2) {
        return string.equals(string2) || string2.startsWith(".") && string.endsWith(string2);
    }

    @Override
    public final void a(c c2, f object) {
        ai.a(c2, "Cookie");
        ai.a(object, "Cookie origin");
        object = ((f)object).a().toLowerCase(Locale.ROOT);
        if (c2.d() == null) {
            throw new i("Invalid cookie state: domain not specified");
        }
        String string = c2.d().toLowerCase(Locale.ROOT);
        if (c2 instanceof a && ((a)c2).b("domain")) {
            if (!string.startsWith(".")) {
                throw new i("Domain attribute \"" + c2.d() + "\" violates RFC 2109: domain must start with a dot");
            }
            int n2 = string.indexOf(46, 1);
            if (!(n2 >= 0 && n2 != string.length() - 1 || string.equals(".local"))) {
                throw new i("Domain attribute \"" + c2.d() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
            }
            if (!ae.a((String)object, string)) {
                throw new i("Domain attribute \"" + c2.d() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
            }
            if (((String)object).substring(0, ((String)object).length() - string.length()).indexOf(46) != -1) {
                throw new i("Domain attribute \"" + c2.d() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
            }
            return;
        }
        if (!c2.d().equals(object)) {
            throw new i("Illegal domain attribute: \"" + c2.d() + "\".Domain of origin: \"" + (String)object + "\"");
        }
    }

    @Override
    public final boolean b(c object, f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        object2 = ((f)object2).a().toLowerCase(Locale.ROOT);
        object = object.d();
        if (!ae.a((String)object2, (String)object)) {
            return false;
        }
        return ((String)object2).substring(0, ((String)object2).length() - ((String)object).length()).indexOf(46) == -1;
    }

    @Override
    public final String a() {
        return "domain";
    }
}

