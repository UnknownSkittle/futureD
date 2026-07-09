/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.e.d;

import com.a.a.b.ai;
import java.net.IDN;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.e.d.a;
import org.apache.a.e.d.c;

public final class e {
    private final Map<String, a> a;
    private final Map<String, a> b;

    public e(Collection<String> collection) {
        this(org.apache.a.e.d.a.a, collection);
    }

    private e(a a2, Collection<String> object) {
        ai.a(a2, "Domain type");
        ai.a(object, "Domain suffix rules");
        this.a = new ConcurrentHashMap<String, a>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            this.a.put(string, a2);
        }
        this.b = new ConcurrentHashMap<String, a>();
    }

    public e(Collection<c> object, byte by2) {
        ai.a(object, "Domain suffix lists");
        this.a = new ConcurrentHashMap<String, a>();
        this.b = new ConcurrentHashMap<String, a>();
        object = object.iterator();
        while (object.hasNext()) {
            Object object32 = (c)object.next();
            a a2 = ((c)object32).a();
            for (String string : ((c)object32).b()) {
                this.a.put(string, a2);
            }
            List<String> list = ((c)object32).c();
            if (list == null) continue;
            for (Object object32 : list) {
                this.b.put((String)object32, a2);
            }
        }
    }

    private static boolean a(Map<String, a> object, String string, a a2) {
        if (object == null) {
            return false;
        }
        if ((object = object.get(string)) == null) {
            return false;
        }
        return a2 == null || ((Enum)object).equals((Object)a2);
    }

    private boolean b(String string, a a2) {
        return e.a(this.a, string, a2);
    }

    public final String a(String string, a a2) {
        if (string == null) {
            return null;
        }
        if (string.startsWith(".")) {
            return null;
        }
        String string2 = null;
        string = string.toLowerCase(Locale.ROOT);
        while (string != null) {
            int n2;
            a a3 = a2;
            String string3 = IDN.toUnicode(string);
            if (e.a(this.b, string3, a3)) {
                return string;
            }
            if (this.b(IDN.toUnicode(string), a2) || (string3 = (n2 = string.indexOf(46)) != -1 ? string.substring(n2 + 1) : null) != null && this.b("*." + IDN.toUnicode(string3), a2)) break;
            if (n2 != -1) {
                string2 = string;
            }
            string = string3;
        }
        return string2;
    }

    public final boolean a(String object) {
        String string = object;
        object = this;
        return string != null && ((e)object).a(string.startsWith(".") ? string.substring(1) : string, null) == null;
    }
}

