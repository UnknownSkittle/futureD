/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.m;

import com.a.a.b.ai;
import org.apache.a.ab;
import org.apache.a.ac;
import org.apache.a.k;
import org.apache.a.l;
import org.apache.a.m.d;
import org.apache.a.q;
import org.apache.a.r;
import org.apache.a.v;

public final class i
implements r {
    private final boolean a;

    public i() {
        this(0);
    }

    private i(byte by2) {
        this.a = false;
    }

    @Override
    public final void a(q q2, d object) {
        ai.a(q2, "HTTP request");
        if (q2 instanceof l) {
            if (q2.a("Transfer-Encoding")) {
                throw new ab("Transfer-encoding header already present");
            }
            if (q2.a("Content-Length")) {
                throw new ab("Content-Length header already present");
            }
            object = q2.g().b();
            k k2 = ((l)q2).b();
            if (k2 == null) {
                q2.a("Content-Length", "0");
                return;
            }
            if (k2.isChunked() || k2.getContentLength() < 0L) {
                if (((ac)object).a(v.a)) {
                    throw new ab("Chunked transfer encoding not allowed for ".concat(String.valueOf(object)));
                }
                q2.a("Transfer-Encoding", "chunked");
            } else {
                q2.a("Content-Length", Long.toString(k2.getContentLength()));
            }
            if (k2.getContentType() != null && !q2.a("Content-Type")) {
                q2.a(k2.getContentType());
            }
            if (k2.getContentEncoding() != null && !q2.a("Content-Encoding")) {
                q2.a(k2.getContentEncoding());
            }
        }
    }
}

