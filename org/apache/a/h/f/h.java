/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.f;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.e;
import org.apache.a.k;
import org.apache.a.l;
import org.apache.a.q;

final class h
implements k {
    private final k a;
    private boolean b = false;

    static void a(l l2) {
        k k2 = l2.b();
        if (k2 != null && !k2.isRepeatable() && !(k2 instanceof h)) {
            l2.a(new h(k2));
        }
    }

    static boolean a(q object) {
        if (object instanceof l && (object = ((l)object).b()) != null) {
            if (object instanceof h && !((h)object).b) {
                return true;
            }
            return object.isRepeatable();
        }
        return true;
    }

    private h(k k2) {
        this.a = k2;
    }

    @Override
    public final boolean isRepeatable() {
        return this.a.isRepeatable();
    }

    @Override
    public final boolean isChunked() {
        return this.a.isChunked();
    }

    @Override
    public final long getContentLength() {
        return this.a.getContentLength();
    }

    @Override
    public final e getContentType() {
        return this.a.getContentType();
    }

    @Override
    public final e getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override
    public final InputStream getContent() {
        return this.a.getContent();
    }

    @Override
    public final void writeTo(OutputStream outputStream) {
        this.b = true;
        this.a.writeTo(outputStream);
    }

    @Override
    public final boolean isStreaming() {
        return this.a.isStreaming();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestEntityProxy{");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

