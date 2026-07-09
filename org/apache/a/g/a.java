/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import org.apache.a.e;
import org.apache.a.j.b;
import org.apache.a.k;

public abstract class a
implements k {
    protected static final int OUTPUT_BUFFER_SIZE = 4096;
    protected e contentType;
    protected e contentEncoding;
    protected boolean chunked;

    protected a() {
    }

    @Override
    public e getContentType() {
        return this.contentType;
    }

    @Override
    public e getContentEncoding() {
        return this.contentEncoding;
    }

    @Override
    public boolean isChunked() {
        return this.chunked;
    }

    public void setContentType(e e2) {
        this.contentType = e2;
    }

    public void setContentType(String string) {
        b b2 = null;
        if (string != null) {
            b2 = new b("Content-Type", string);
        }
        this.setContentType(b2);
    }

    public void setContentEncoding(e e2) {
        this.contentEncoding = e2;
    }

    public void setContentEncoding(String string) {
        b b2 = null;
        if (string != null) {
            b2 = new b("Content-Encoding", string);
        }
        this.setContentEncoding(b2);
    }

    public void setChunked(boolean bl2) {
        this.chunked = bl2;
    }

    @Deprecated
    public void consumeContent() {
    }

    public String toString() {
        long l2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        if (this.contentType != null) {
            stringBuilder.append("Content-Type: ");
            stringBuilder.append(this.contentType.d());
            stringBuilder.append(',');
        }
        if (this.contentEncoding != null) {
            stringBuilder.append("Content-Encoding: ");
            stringBuilder.append(this.contentEncoding.d());
            stringBuilder.append(',');
        }
        if ((l2 = this.getContentLength()) >= 0L) {
            stringBuilder.append("Content-Length: ");
            stringBuilder.append(l2);
            stringBuilder.append(',');
        }
        stringBuilder.append("Chunked: ");
        stringBuilder.append(this.chunked);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

