/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import com.a.a.b.ai;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.k;
import org.apache.a.n.b;
import org.apache.a.y;

public final class e
implements Serializable {
    private static e d = org.apache.a.g.e.a("application/atom+xml", org.apache.a.c.c);
    public static final e a = org.apache.a.g.e.a("application/x-www-form-urlencoded", org.apache.a.c.c);
    private static e e = org.apache.a.g.e.a("application/json", org.apache.a.c.a);
    private static e f;
    private static e g;
    private static e h;
    private static e i;
    private static e j;
    public static final e b;
    private static e k;
    public static final e c;
    private final String l;
    private final Charset m;
    private final y[] n;

    private e(String string, Charset charset) {
        this.l = string;
        this.m = charset;
        this.n = null;
    }

    private e(String string, Charset charset, y[] yArray) {
        this.l = string;
        this.m = charset;
        this.n = yArray;
    }

    public final String a() {
        return this.l;
    }

    public final Charset b() {
        return this.m;
    }

    public final String toString() {
        b b2 = new b(64);
        b2.a(this.l);
        if (this.n != null) {
            b2.a("; ");
            org.apache.a.j.f.a(b2, this.n);
        } else if (this.m != null) {
            b2.a("; charset=");
            b2.a(this.m.name());
        }
        return b2.toString();
    }

    public static e a(String string, Charset charset) {
        boolean bl2;
        block1: {
            String string2 = string = ai.b(string, "MIME type").toLowerCase(Locale.ROOT);
            for (int i2 = 0; i2 < string2.length(); ++i2) {
                char c2 = string2.charAt(i2);
                if (c2 != '\"' && c2 != ',' && c2 != ';') continue;
                bl2 = false;
                break block1;
            }
            bl2 = true;
        }
        ai.a(bl2, "MIME type may not contain reserved characters");
        return new e(string, charset);
    }

    public static e a(String string) {
        return org.apache.a.g.e.a(string, null);
    }

    public static e a(String string, String string2) {
        return org.apache.a.g.e.a(string, !ai.b(string2) ? Charset.forName(string2) : null);
    }

    private static e a(String string, y[] yArray) {
        Charset charset = null;
        Object object = yArray;
        int n2 = yArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            y y2 = object[i2];
            if (!y2.a().equalsIgnoreCase("charset")) continue;
            object = y2.b();
            if (ai.b((CharSequence)object)) break;
            charset = Charset.forName((String)object);
            break;
        }
        return new e(string, charset, yArray != null && yArray.length > 0 ? yArray : null);
    }

    public static e a(k object) {
        if (object == null) {
            return null;
        }
        if ((object = object.getContentType()) != null && ((f[])(object = object.e())).length > 0) {
            object = object[0];
            return org.apache.a.g.e.a(object.a(), object.c());
        }
        return null;
    }

    static {
        org.apache.a.g.e.a("application/octet-stream", null);
        f = org.apache.a.g.e.a("application/svg+xml", org.apache.a.c.c);
        g = org.apache.a.g.e.a("application/xhtml+xml", org.apache.a.c.c);
        h = org.apache.a.g.e.a("application/xml", org.apache.a.c.c);
        i = org.apache.a.g.e.a("multipart/form-data", org.apache.a.c.c);
        j = org.apache.a.g.e.a("text/html", org.apache.a.c.c);
        b = org.apache.a.g.e.a("text/plain", org.apache.a.c.c);
        k = org.apache.a.g.e.a("text/xml", org.apache.a.c.c);
        org.apache.a.g.e.a("*/*", null);
        e[] eArray = new e[]{d, a, e, f, g, h, i, j, b, k};
        HashMap<String, e> hashMap = new HashMap<String, e>();
        for (int i2 = 0; i2 < 10; ++i2) {
            e e2 = eArray[i2];
            hashMap.put(e2.l, e2);
        }
        Collections.unmodifiableMap(hashMap);
        c = b;
    }
}

