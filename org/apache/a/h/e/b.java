/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.e;

import com.a.a.b.ai;
import org.apache.a.ab;
import org.apache.a.g.d;
import org.apache.a.p;
import org.apache.a.v;

public final class b
implements d {
    public static final b a = new b(0);
    private final int b;

    private b() {
        this.b = -1;
    }

    private b(byte by2) {
        this();
    }

    @Override
    public final long a(p object) {
        ai.a(object, "HTTP message");
        Object object2 = object.c("Transfer-Encoding");
        if (object2 != null) {
            if ("chunked".equalsIgnoreCase((String)(object2 = object2.d()))) {
                if (object.c().a(v.a)) {
                    throw new ab("Chunked transfer encoding not allowed for " + object.c());
                }
                return -2L;
            }
            if ("identity".equalsIgnoreCase((String)object2)) {
                return -1L;
            }
            throw new ab("Unsupported transfer encoding: ".concat(String.valueOf(object2)));
        }
        object2 = object.c("Content-Length");
        if (object2 != null) {
            object = object2.d();
            try {
                long l2 = Long.parseLong((String)object);
                if (l2 < 0L) {
                    throw new ab("Negative content length: ".concat(String.valueOf(object)));
                }
                return l2;
            } catch (NumberFormatException numberFormatException) {
                throw new ab("Invalid content length: ".concat(String.valueOf(object)));
            }
        }
        return -1L;
    }
}

