/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import com.a.a.b.ai;
import org.apache.a.b.e.a;
import org.apache.a.e;
import org.apache.a.f.c;
import org.apache.a.f.f;
import org.apache.a.f.j;
import org.apache.a.f.l;
import org.apache.a.h;
import org.apache.a.m.d;
import org.apache.a.s;
import org.apache.a.u;

public final class k
implements u {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());

    @Override
    public final void a(s s2, d object) {
        ai.a(s2, "HTTP request");
        ai.a(object, "HTTP context");
        object = org.apache.a.b.e.a.a((d)object);
        j j2 = ((org.apache.a.m.e)object).a("http.cookie-spec", j.class);
        if (j2 == null) {
            this.a.a("Cookie spec not specified in HTTP context");
            return;
        }
        org.apache.a.b.e e2 = ((a)object).b();
        if (e2 == null) {
            this.a.a("Cookie store not specified in HTTP context");
            return;
        }
        if ((object = ((org.apache.a.m.e)object).a("http.cookie-origin", f.class)) == null) {
            this.a.a("Cookie origin not specified in HTTP context");
            return;
        }
        h h2 = s2.e("Set-Cookie");
        this.a(h2, j2, (f)object, e2);
        if (j2.a() > 0) {
            h2 = s2.e("Set-Cookie2");
            this.a(h2, j2, (f)object, e2);
        }
    }

    private void a(h h2, j j2, f f2, org.apache.a.b.e e2) {
        while (h2.hasNext()) {
            e e3 = h2.a();
            try {
                for (c c2 : j2.a(e3, f2)) {
                    try {
                        j2.a(c2, f2);
                        e2.a(c2);
                        if (!this.a.a()) continue;
                        this.a.a("Cookie accepted [" + k.a(c2) + "]");
                    } catch (l l2) {
                        if (!this.a.d()) continue;
                        this.a.c("Cookie rejected [" + k.a(c2) + "] " + l2.getMessage());
                    }
                }
            } catch (l l3) {
                if (!this.a.d()) continue;
                this.a.c("Invalid cookie header: \"" + e3 + "\". " + l3.getMessage());
            }
        }
    }

    private static String a(c c2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2.a());
        stringBuilder.append("=\"");
        String string = c2.b();
        if (string != null) {
            if (string.length() > 100) {
                string = string.substring(0, 100) + "...";
            }
            stringBuilder.append(string);
        }
        stringBuilder.append("\"");
        stringBuilder.append(", version:");
        stringBuilder.append(Integer.toString(c2.h()));
        stringBuilder.append(", domain:");
        stringBuilder.append(c2.d());
        stringBuilder.append(", path:");
        stringBuilder.append(c2.e());
        stringBuilder.append(", expiry:");
        stringBuilder.append(c2.c());
        return stringBuilder.toString();
    }
}

