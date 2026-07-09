/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.e;

import java.util.Locale;
import org.apache.a.b.b.d;
import org.apache.a.b.e.a;
import org.apache.a.b.e.i;
import org.apache.a.b.e.j;
import org.apache.a.d.c;
import org.apache.a.d.g;
import org.apache.a.k;
import org.apache.a.s;
import org.apache.a.u;

public final class h
implements u {
    private static final d a = new i();
    private static final d b = new j();
    private final c<d> c = g.a().a("gzip", a).a("x-gzip", a).a("deflate", b).b();
    private final boolean d;

    private h() {
        this.d = true;
    }

    private h(byte by2) {
        this();
    }

    public h(char c2) {
        this(0);
    }

    @Override
    public final void a(s s2, org.apache.a.m.d fArray) {
        k k2 = s2.b();
        if (org.apache.a.b.e.a.a((org.apache.a.m.d)fArray).i().p() && k2 != null && k2.getContentLength() != 0L && (fArray = k2.getContentEncoding()) != null) {
            fArray = fArray.e();
            int n2 = fArray.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object = fArray[i2].a().toLowerCase(Locale.ROOT);
                if ((object = this.c.a((String)object)) == null) continue;
                s2.a(new org.apache.a.b.b.a(s2.b(), (d)object));
                s2.d("Content-Length");
                s2.d("Content-Encoding");
                s2.d("Content-MD5");
            }
        }
    }
}

