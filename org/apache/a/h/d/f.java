/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.d;

import com.a.a.b.ai;
import java.util.Locale;
import org.apache.a.e.d.b;
import org.apache.a.f.a;
import org.apache.a.f.c;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.m;

public class f
implements org.apache.a.f.b {
    @Override
    public void a(m m2, String string) {
        ai.a(m2, "Cookie");
        if (ai.b(string)) {
            throw new l("Blank or null value for domain attribute");
        }
        if (string.endsWith(".")) {
            return;
        }
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        string = string.toLowerCase(Locale.ROOT);
        m2.d(string);
    }

    @Override
    public void a(c object, org.apache.a.f.f object2) {
        ai.a(object, "Cookie");
        ai.a(object2, "Cookie origin");
        object2 = ((org.apache.a.f.f)object2).a();
        object = object.d();
        if (object == null) {
            throw new i("Cookie 'domain' may not be null");
        }
        if (!((String)object2).equals(object) && !f.a((String)object, (String)object2)) {
            throw new i("Illegal 'domain' attribute \"" + (String)object + "\". Domain of origin: \"" + (String)object2 + "\"");
        }
    }

    static boolean a(String string, String string2) {
        if (b.a(string2) || b.b(string2)) {
            return false;
        }
        String string3 = string = string.startsWith(".") ? string.substring(1) : string;
        if (string2.endsWith(string)) {
            int n2 = string2.length() - string.length();
            if (n2 == 0) {
                return true;
            }
            if (n2 > 1 && string2.charAt(n2 - 1) == '.') {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean b(c c2, org.apache.a.f.f object) {
        ai.a(c2, "Cookie");
        ai.a(object, "Cookie origin");
        object = ((org.apache.a.f.f)object).a();
        String string = c2.d();
        if (string == null) {
            return false;
        }
        if (string.startsWith(".")) {
            string = string.substring(1);
        }
        if (((String)object).equals(string = string.toLowerCase(Locale.ROOT))) {
            return true;
        }
        if (c2 instanceof a && ((a)c2).b("domain")) {
            return f.a(string, (String)object);
        }
        return false;
    }

    @Override
    public String a() {
        return "domain";
    }
}

