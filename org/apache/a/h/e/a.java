/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.e;

import com.a.a.b.ai;
import org.apache.a.aa;
import org.apache.a.ab;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.g.d;
import org.apache.a.p;

public final class a
implements d {
    public static final a a = new a(0);
    private final int b;

    private a() {
        this.b = -1;
    }

    private a(byte by2) {
        this();
    }

    @Override
    public final long a(p eArray) {
        ai.a(eArray, "HTTP message");
        e e2 = eArray.c("Transfer-Encoding");
        if (e2 != null) {
            f[] fArray;
            try {
                fArray = e2.e();
            } catch (aa aa2) {
                throw new ab("Invalid Transfer-Encoding header value: ".concat(String.valueOf(e2)), aa2);
            }
            int n2 = fArray.length;
            if ("identity".equalsIgnoreCase(e2.d())) {
                return -1L;
            }
            if (n2 > 0 && "chunked".equalsIgnoreCase(fArray[n2 - 1].a())) {
                return -2L;
            }
            return -1L;
        }
        if (eArray.c("Content-Length") != null) {
            long l2 = -1L;
            eArray = eArray.b("Content-Length");
            for (int i2 = eArray.length - 1; i2 >= 0; --i2) {
                e e3 = eArray[i2];
                try {
                    l2 = Long.parseLong(e3.d());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    continue;
                }
            }
            if (l2 >= 0L) {
                return l2;
            }
            return -1L;
        }
        return -1L;
    }
}

