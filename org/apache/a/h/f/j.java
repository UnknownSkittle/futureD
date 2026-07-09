/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import com.a.a.b.ai;
import java.io.IOException;
import org.apache.a.b.c.b;
import org.apache.a.b.g;
import org.apache.a.e;
import org.apache.a.h.f.a;
import org.apache.a.h.f.h;
import org.apache.a.z;
import org.apache.commons.c.c;

public final class j
implements a {
    private final org.apache.commons.c.a a = org.apache.commons.c.c.b(this.getClass());
    private final a b;
    private final g c;

    public j(a a2, g g2) {
        ai.a(a2, "HTTP request executor");
        ai.a(g2, "HTTP request retry handler");
        this.b = a2;
        this.c = g2;
    }

    @Override
    public final b a(org.apache.a.e.a.b object, org.apache.a.b.c.j j2, org.apache.a.b.e.a a2, org.apache.a.b.c.e e2) {
        ai.a(object, "HTTP route");
        ai.a(j2, "HTTP request");
        ai.a(a2, "HTTP context");
        e[] eArray = j2.d();
        int n2 = 1;
        while (true) {
            try {
                return this.b.a((org.apache.a.e.a.b)object, j2, a2, e2);
            } catch (IOException iOException) {
                if (e2 != null && e2.h()) {
                    this.a.a("Request has been aborted");
                    throw iOException;
                }
                if (this.c.a(iOException, n2, a2)) {
                    if (this.a.c()) {
                        this.a.b("I/O exception (" + iOException.getClass().getName() + ") caught when processing request to " + object + ": " + iOException.getMessage());
                    }
                    if (this.a.a()) {
                        this.a.a(iOException.getMessage(), iOException);
                    }
                    if (!h.a(j2)) {
                        this.a.a("Cannot retry non-repeatable request");
                        throw new org.apache.a.b.h("Cannot retry request with a non-repeatable request entity", iOException);
                    }
                    j2.a(eArray);
                    if (this.a.c()) {
                        this.a.b("Retrying request to ".concat(String.valueOf(object)));
                    }
                } else {
                    if (iOException instanceof z) {
                        object = new z(((org.apache.a.e.a.b)object).a().e() + " failed to respond");
                        ((Throwable)object).setStackTrace(iOException.getStackTrace());
                        throw object;
                    }
                    throw iOException;
                }
                ++n2;
                continue;
            }
            break;
        }
    }
}

