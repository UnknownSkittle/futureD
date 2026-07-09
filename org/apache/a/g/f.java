/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import com.a.a.b.ai;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.e;
import org.apache.a.k;

public class f
implements k {
    protected k a;

    public f(k k2) {
        this.a = ai.a(k2, "Wrapped entity");
    }

    @Override
    public boolean isRepeatable() {
        return this.a.isRepeatable();
    }

    @Override
    public boolean isChunked() {
        return this.a.isChunked();
    }

    @Override
    public long getContentLength() {
        return this.a.getContentLength();
    }

    @Override
    public e getContentType() {
        return this.a.getContentType();
    }

    @Override
    public e getContentEncoding() {
        return this.a.getContentEncoding();
    }

    @Override
    public InputStream getContent() {
        return this.a.getContent();
    }

    @Override
    public void writeTo(OutputStream outputStream) {
        this.a.writeTo(outputStream);
    }

    @Override
    public boolean isStreaming() {
        return this.a.isStreaming();
    }
}

