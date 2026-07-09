/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.e;

public interface k {
    public boolean isRepeatable();

    public boolean isChunked();

    public long getContentLength();

    public e getContentType();

    public e getContentEncoding();

    public InputStream getContent();

    public void writeTo(OutputStream var1);

    public boolean isStreaming();
}

