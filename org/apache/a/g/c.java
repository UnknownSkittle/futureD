/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import com.a.a.b.ai;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.g.f;
import org.apache.a.k;

public final class c
extends f {
    private final byte[] b;

    public c(k k2) {
        super(k2);
        if (!k2.isRepeatable() || k2.getContentLength() < 0L) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k2.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            this.b = byteArrayOutputStream.toByteArray();
            return;
        }
        this.b = null;
    }

    @Override
    public final long getContentLength() {
        if (this.b != null) {
            return this.b.length;
        }
        return super.getContentLength();
    }

    @Override
    public final InputStream getContent() {
        if (this.b != null) {
            return new ByteArrayInputStream(this.b);
        }
        return super.getContent();
    }

    @Override
    public final boolean isChunked() {
        return this.b == null && super.isChunked();
    }

    @Override
    public final boolean isRepeatable() {
        return true;
    }

    @Override
    public final void writeTo(OutputStream outputStream) {
        ai.a(outputStream, "Output stream");
        if (this.b != null) {
            outputStream.write(this.b);
            return;
        }
        super.writeTo(outputStream);
    }

    @Override
    public final boolean isStreaming() {
        return this.b == null && super.isStreaming();
    }
}

