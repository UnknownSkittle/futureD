/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h.c;

import com.a.a.b.ai;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.c.a;

public final class u {
    private final a a;
    private final String b;

    public u(a a2, String string) {
        this.a = a2;
        this.b = string;
    }

    private void a(String string, InputStream inputStream) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n2 = inputStream.read()) != -1) {
            if (n2 == 13) {
                stringBuilder.append("[\\r]");
                continue;
            }
            if (n2 == 10) {
                stringBuilder.append("[\\n]\"");
                stringBuilder.insert(0, "\"");
                stringBuilder.insert(0, string);
                this.a.a(this.b + " " + stringBuilder.toString());
                stringBuilder.setLength(0);
                continue;
            }
            if (n2 < 32 || n2 > 127) {
                stringBuilder.append("[0x");
                stringBuilder.append(Integer.toHexString(n2));
                stringBuilder.append("]");
                continue;
            }
            stringBuilder.append((char)n2);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append('\"');
            stringBuilder.insert(0, '\"');
            stringBuilder.insert(0, string);
            this.a.a(this.b + " " + stringBuilder.toString());
        }
    }

    public final boolean a() {
        return this.a.a();
    }

    public final void a(byte[] byArray, int n2, int n3) {
        ai.a(byArray, "Output");
        this.a(">> ", new ByteArrayInputStream(byArray, n2, n3));
    }

    public final void b(byte[] byArray, int n2, int n3) {
        ai.a(byArray, "Input");
        this.a("<< ", new ByteArrayInputStream(byArray, n2, n3));
    }

    public final void a(byte[] byArray) {
        ai.a(byArray, "Output");
        this.a(">> ", new ByteArrayInputStream(byArray));
    }

    public final void b(byte[] byArray) {
        ai.a(byArray, "Input");
        this.a("<< ", new ByteArrayInputStream(byArray));
    }

    public final void a(String string) {
        ai.a(string, "Output");
        this.a(string.getBytes());
    }

    public final void b(String string) {
        ai.a(string, "Input");
        this.b(string.getBytes());
    }
}

