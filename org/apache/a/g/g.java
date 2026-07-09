/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.g;

import com.a.a.b.ai;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.apache.a.g.a;
import org.apache.a.g.e;
import org.apache.a.m.c;

public class g
extends a
implements Cloneable {
    protected final byte[] content;

    public g(String string, e e2) {
        ai.a(string, "Source string");
        Charset charset = e2 != null ? e2.b() : null;
        if (charset == null) {
            charset = c.a;
        }
        this.content = string.getBytes(charset);
        if (e2 != null) {
            this.setContentType(e2.toString());
        }
    }

    @Deprecated
    public g(String string, String string2, String string3) {
        ai.a(string, "Source string");
        string2 = string2 != null ? string2 : "text/plain";
        string3 = string3 != null ? string3 : "ISO-8859-1";
        this.content = string.getBytes(string3);
        this.setContentType(string2 + "; charset=" + string3);
    }

    public g(String string, String string2) {
        this(string, e.a(e.b.a(), string2));
    }

    public g(String string, Charset charset) {
        this(string, e.a(e.b.a(), charset));
    }

    public g(String string) {
        this(string, e.c);
    }

    @Override
    public boolean isRepeatable() {
        return true;
    }

    @Override
    public long getContentLength() {
        return this.content.length;
    }

    @Override
    public InputStream getContent() {
        return new ByteArrayInputStream(this.content);
    }

    @Override
    public void writeTo(OutputStream outputStream) {
        ai.a(outputStream, "Output stream");
        outputStream.write(this.content);
        outputStream.flush();
    }

    @Override
    public boolean isStreaming() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}

