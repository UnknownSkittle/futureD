/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.b.b;

import com.a.a.b.ai;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.b.b.d;
import org.apache.a.e;
import org.apache.a.g.f;
import org.apache.a.k;

public final class a
extends f {
    private final d b;
    private InputStream c;

    public a(k k2, d d2) {
        super(k2);
        this.b = d2;
    }

    private InputStream a() {
        InputStream inputStream = this.a.getContent();
        return new org.apache.a.b.b.e(inputStream, this.b);
    }

    @Override
    public final InputStream getContent() {
        if (this.a.isStreaming()) {
            if (this.c == null) {
                this.c = this.a();
            }
            return this.c;
        }
        return this.a();
    }

    @Override
    public final void writeTo(OutputStream outputStream) {
        ai.a(outputStream, "Output stream");
        InputStream inputStream = this.getContent();
        try {
            int n2;
            byte[] byArray = new byte[2048];
            while ((n2 = inputStream.read(byArray)) != -1) {
                outputStream.write(byArray, 0, n2);
            }
            return;
        } finally {
            inputStream.close();
        }
    }

    @Override
    public final e getContentEncoding() {
        return null;
    }

    @Override
    public final long getContentLength() {
        return -1L;
    }
}

