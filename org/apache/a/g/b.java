/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import com.a.a.b.ai;
import com.a.a.r;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.g.a;
import org.apache.a.h.g.k;

public final class b
extends a {
    private InputStream a;
    private long b = -1L;

    @Override
    public final long getContentLength() {
        return this.b;
    }

    @Override
    public final InputStream getContent() {
        r.a(this.a != null, "Content has not been provided");
        return this.a;
    }

    @Override
    public final boolean isRepeatable() {
        return false;
    }

    public final void a(long l2) {
        this.b = l2;
    }

    public final void a(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override
    public final void writeTo(OutputStream outputStream) {
        ai.a(outputStream, "Output stream");
        InputStream inputStream = this.getContent();
        try {
            int n2;
            byte[] byArray = new byte[4096];
            while ((n2 = inputStream.read(byArray)) != -1) {
                outputStream.write(byArray, 0, n2);
            }
            return;
        } finally {
            inputStream.close();
        }
    }

    @Override
    public final boolean isStreaming() {
        return this.a != null && this.a != k.a;
    }
}

